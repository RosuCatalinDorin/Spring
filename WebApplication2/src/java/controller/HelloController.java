/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author CatalinRosu
 */
@Controller
public class HelloController {
    
    @RequestMapping (value = "/hello", method = RequestMethod.GET)
    
    public String printHello(String name,ModelMap  model )
    {
    
        model.addAttribute("message", "Hello from Spring WEB MVC Fremework!");
        
        return "hello";
        
    }
    
    
}
