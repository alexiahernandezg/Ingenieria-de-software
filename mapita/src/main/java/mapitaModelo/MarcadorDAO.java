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
public class MarcadorDAO extends AbstracDAO<Marcador>{
    
    public MarcadorDAO(){
        super();
    }
    
    @Override
    public void save(Marcador marcador){
        super.save(marcador);
    }
    
    @Override
    public void update(Marcador marcador){
        super.save(marcador);
    }
    
    @Override
    public void delete(Marcador marcador){
        super.delete(marcador);
    }
       
    public Marcador find(int id){
        return super.find(Marcador.class, id);
    }
    
    public List<Marcador> findAll(){
        return super.findAll(Marcador.class);
    }
}
