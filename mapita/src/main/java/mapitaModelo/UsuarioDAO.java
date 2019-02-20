/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapitaModelo;

import java.util.List;
/**
 *
 * @author alex22
 */
public class UsuarioDAO extends AbstracDAO<Usuario>{
   
    public UsuarioDAO(){
        super();
    }
   
    @Override
    public void save(Usuario usuario){
        super.save(usuario);
    }
    
    @Override
    public void update(Usuario usuario){
        super.update(usuario);
    }
    
    @Override
    public void delete(Usuario usuario){
        super.delete(usuario);
    }
    
    public Usuario find(int id){
        return super.find(Usuario.class, id);
    }
    
    public List<Usuario> findAll(){
        return super.findAll(Usuario.class);
    }  
}
