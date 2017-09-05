package is.hi.byrjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
<<<<<<< HEAD
 * DemoController defines routes and the actions to be performed at respectively routes.
 * 
 * @author Bjarki Viðar Kristjánsson (bvk1@hi.is)
 * @author Huy Van Nguyen (hvn1@hi.is)
 * 
 */


// This RequestMapping acts like a middleware. It mounts every sub-RequestMapping to /demo
@Controller
@RequestMapping("/demo") 
public class DemoController {


    // This RequestMapping is inside the "/demo" middleware. The absolute path is therefore /demo/page
    // Returns demo/demo.jsp file to be rendered at /demo/page
    @RequestMapping("/page")
    public String demoPage(){
        return "demo/demo"; 
    }
    
    // Adds an attribute to the model
    // demo/synaNotandi.jsp fetches this attribute and renders at /demo/notandi
=======
 * Byrjunarcontroller sem stýrir hvað er gert þegar notandi eða viðmót
 * setur inn skipun 
 */

@Controller
@RequestMapping("/demo") // Request Mapping er gerð fyrir klasann til að slóðin byrji á /demo fyrir allar skipanir 
public class DemoController {


    // Þar sem klasinn hefur slóðina "/demo", er þessi slóð "/demo/page"
    @RequestMapping("/page")
    public String demoPage(){
        return "demo/demo"; // skilar .jsp skrá sem er /webapp/WEB-INF/vefvidmot/demo/demo.jsp
                            // skoðið application.properties til að sjá hvernig slóðin er sett
    }
    
>>>>>>> 6ee98f8c3d85a63de906deef78894026bcbe5837
    @RequestMapping("/notandi")
    public String notandi(Model model){
        model.addAttribute("nafn","Bjarki");
        return "demo/synaNotandi";
    }
    
<<<<<<< HEAD
    // Renders demo/hvadaNotandi.jsp at /demo/spyrjaNotanda
=======
    
>>>>>>> 6ee98f8c3d85a63de906deef78894026bcbe5837
    @RequestMapping("/spyrjaNotanda")
    public String spyrjaNotandi(){
        return "demo/hvadaNotandi";
    }
    
<<<<<<< HEAD
    // Defines a route at /demo/hver that will only respond for post requests.
    // Fetches data from post request and adds it to the model as an attribute.
    // Returns demo/synaNotandi.jsp which fetches the attribute and renders at /demo/hver.
=======
>>>>>>> 6ee98f8c3d85a63de906deef78894026bcbe5837
    @RequestMapping(value="/hver", method=RequestMethod.POST)
    public String hver(@RequestParam(value="nafn",required=false)
    String nafn, ModelMap model){
        model.addAttribute("nafn", nafn);
        return "demo/synaNotandi";
    }
<<<<<<< HEAD
=======

>>>>>>> 6ee98f8c3d85a63de906deef78894026bcbe5837
}
