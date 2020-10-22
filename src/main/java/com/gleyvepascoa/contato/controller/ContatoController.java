package com.gleyvepascoa.contato.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gleyvepascoa.contato.DAO.ContatoDAO;
import com.gleyvepascoa.contato.entity.Contato;

@Controller
@RequestMapping("/contatos")
public class ContatoController {
   
  @Autowired
  private ContatoDAO contatoDAO;
   
  @GetMapping
  public ModelAndView listar() {
    List<Contato> lista = contatoDAO.findAll();
     
    ModelAndView modelAndView = new ModelAndView("contatos");
    modelAndView.addObject("contatos", lista);
     
    return modelAndView;
  }
 
}