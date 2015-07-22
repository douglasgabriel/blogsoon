/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.blogsoon.controller;

import br.edu.ifpb.bdnc.blogsoon.dao.UsuarioDAOIF;
import br.edu.ifpb.bdnc.blogsoon.entidades.Usuario;
import javax.inject.Inject;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Emanuel Batista da Silva Filho - emanuelbatista2011@gmail.com
 */
@Controller
@SessionAttributes("usuario")
public class UsuarioController {
    
    private UsuarioDAOIF UsuarioDAO;
    
    @Inject
    public UsuarioController(UsuarioDAOIF usuarioDAO){
        this.UsuarioDAO=usuarioDAO;
    }
    @RequestMapping({"/login","/"})
    public @ResponseBody String login(@RequestParam(required = false) String login,@RequestParam String senha){
        return "teste  "+senha;
    }
    
    public @ResponseBody String cadastro(@Valid @ModelAttribute("usuario") Usuario usuario){
        return "";
    }
    
    
}