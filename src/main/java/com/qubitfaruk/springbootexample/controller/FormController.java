package com.qubitfaruk.springbootexample.controller;

import com.qubitfaruk.springbootexample.dto.UserDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
@Log4j2
public class FormController {
   //http://localhost:8080/form
   @GetMapping("/form")
   public String posrForm(Model model){
       model.addAttribute("user_form",new UserDto());
       return "form_post/formvalidation";
   }
    @PostMapping("/form")
    public String getForm(@Valid @ModelAttribute("user_form") UserDto userDto, BindingResult bindingResult){
       if (bindingResult.hasErrors()){
           log.error("Hata yakalandı");
           System.err.println("Hata yakalandı.");
       }
       log.info("Başarılı"+userDto);
        return "form_post/success";
    }
}
