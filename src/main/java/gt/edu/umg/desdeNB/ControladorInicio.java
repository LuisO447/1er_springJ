/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.desdeNB;

import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Luis
 */
@Controller
public class ControladorInicio {
    
    @GetMapping("/")
    
    public String Inicio(Model model){
        
        var msg = "Hola desde el controlador";
        
        var persona = new Persona();
        
        persona.setNombre("Amaranta");
        persona.setApellido("Bomdia");
        persona.setEmail("Bomdia@gmail.com");
        persona.setTelefono("12345");
        
        var persona2 = new Persona();
        persona2.setNombre("Carlos");
        persona2.setApellido("Pineda");
        persona2.setEmail("cpineda@gmail.com");
        persona2.setTelefono("789034");
        
        var personas = Arrays.asList(persona,persona2);
        
        
        model.addAttribute("personas",personas);
        
        model.addAttribute("msg",msg);
        
        return "Index";
    }
    
//    @GetMapping("/direccion")
//    
//    public String dire(){
//        
//        
//        return "Segunda pagina direccion";
//    }
//    @GetMapping("/progra")
//    
//    public String InicioProgra(Model model){
//        
//        var msg = "Hola desde el controlador de progra";
//        
//        model.addAttribute("msg",msg);
//        
//        return "Index";
//    }
    
    
}
