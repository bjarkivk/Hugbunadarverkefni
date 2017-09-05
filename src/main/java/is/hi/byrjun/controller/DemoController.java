package is.hi.byrjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Bjarki Viðar Kristjánsson (bvk1@hi.is)
 * @author Huy Van Nguyen (hvn1@hi.is)
 * 
 * DemoController defines routes and the actions to be performed at respectively routes.
 */

// This RequestMapping acts like a middleware. It mounts every sub-RequestMapping to /demo
@Controller
@RequestMapping("/demo") 
public class DemoController {

    /**
    * This RequestMapping is inside the "/demo" middleware. The absolute path is therefore /demo/page
    * 
    * @return String filePath.  filePath is supposed to point to a .jsp file.
    */ 
    @RequestMapping("/page")
    public String demoPage(){
        return "demo/demo"; 
    }
    
    /** 
    * Adds an attribute to the model and renders the page at /demo/notandi
    * 
    * @param Model model.       model is a data object which the view-files has access to.
    * @return String filePath.  filePath is supposed to point to a .jsp file.
    */
    @RequestMapping("/notandi")
    public String notandi(Model model){
        model.addAttribute("nafn","Bjarki");
        return "demo/synaNotandi";
    }
    
    /** 
    * Renders demo/hvadaNotandi.jsp at /demo/spyrjaNotanda
    * 
    * @return String filePath.  filePath is supposed to point to a .jsp file.
    */
    @RequestMapping("/spyrjaNotanda")
    public String spyrjaNotandi(){
        return "demo/hvadaNotandi";
    }
    
    /** 
    * Defines a route at /demo/hver that will only respond for post requests.
    * Fetches data from post request and adds it to the model as an attribute.
    * 
    * @param String nafn.       nafn is the value from the post request.
    * @param ModelMap model.    model is a data object which the view-files has access to.
    * @return String filePath.  filePath is supposed to point to a .jsp file.
    */
    @RequestMapping(value="/hver", method=RequestMethod.POST)
    public String hver(@RequestParam(value="nafn",required=false)
    String nafn, ModelMap model){
        model.addAttribute("nafn", nafn);
        return "demo/synaNotandi";
    }
}
