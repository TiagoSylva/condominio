package br.com.mega.condominio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MoradorController {

	@RequestMapping(method=RequestMethod.GET, path = "/morador")
    public String morador(){
        return "morador";
        }
	
}
