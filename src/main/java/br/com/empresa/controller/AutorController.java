package br.com.empresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AutorController {
  
  @GetMapping("/autor/form/adicionar")
  public ModelAndView getFormAdicionar() {
    
    ModelAndView mv = new ModelAndView("AutorForm");
    
    return mv;
  }

}
