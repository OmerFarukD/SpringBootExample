package com.qubitfaruk.springbootexample.controller;

import com.qubitfaruk.springbootexample.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TymeleafController {
    //http://localhost:8080
    @GetMapping({"/","index1"})
    public String index(){
        return "index1";
    }

    //http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1")
    public String getThymeleaf(){
        return "thymeleaf1";
    }
    //http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String getThymeleaf2Model(Model model){
        model.addAttribute("key_model1","Ben modelden geldim=>1.");
        model.addAttribute("key_model2","Ben modelden geldim=>2.");
        return "thymeleaf1";
    }
    //http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf3")
    public String getThymeleaf3Model(Model model){
        model.addAttribute("key_model1","Ben modelden geldim=>1.");
        model.addAttribute("key_model2","Ben modelden geldim=>2.");
        return "thymeleaf_file/thymeleaf3";
    }
    //http://localhost:8080/thymeleaf4
    @GetMapping("/thymeleaf4")
    public String getThymeleaf4Model(Model model){
        model.addAttribute("key_model4","Ben modelden geldim=>1.");
        return "thymeleaf4";
    }
    //http://localhost:8080/thymeleaf5
    @GetMapping("/thymeleaf5")
    public String getThymeleaf5Model(Model model){
        model.addAttribute("key_model5","text");
        ProductDto productDto=ProductDto.builder()
                .productId(0L)
                .productName("Elma")
                .productPrice(30.0)
                .build();
        model.addAttribute("objectForProductDto",productDto);
        return "thymeleaf5";
    }
    //http://localhost:8080/thymeleaf6
    @GetMapping("/thymeleaf6")
    public String getThymeleaf6Model(Model model){
        model.addAttribute("key_model5","text");
        List<ProductDto> myList=new ArrayList<ProductDto>();
        myList.add(ProductDto.builder().productId(0L).productName("Elma").productPrice(30.0).build());
        myList.add(ProductDto.builder().productId(1L).productName("Armut").productPrice(35.0).build());
        myList.add(ProductDto.builder().productId(2L).productName("Kiraz").productPrice(33.0).build());
        ProductDto productDto=ProductDto.builder().productId(0L).productName("Elma").productPrice(30.0).build();
        model.addAttribute("ProductList",myList);
        return "thymeleaf6";
    }
    //http://localhost:8080/thymeleaf7/
    @GetMapping({"/thymeleaf7","/thymeleaf7/{id}"})
    public String getThymeleaf7Model(Model model, @PathVariable(name = "id") Long id){

        model.addAttribute("pathVariable","id: "+id);
        return "thymeleaf7";
    }
    //http://localhost:8080/formvalidation
    @GetMapping("/formvalidation")
    public String formValidation(){
        return "form_post/formvalidation";
    }
}
