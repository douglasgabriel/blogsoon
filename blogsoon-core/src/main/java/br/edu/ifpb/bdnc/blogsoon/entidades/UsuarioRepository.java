/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.blogsoon.entidades;

import br.edu.ifpb.bdnc.blogsoon.entidades.Usuario;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Emanuel Batista da Silva Filho - emanuelbatista2011@gmail.com
 */
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    List<Usuario> findBynome(String nome);
}
