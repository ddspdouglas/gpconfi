package br.ainur.DAO;

import br.ainur.model.Dieta;


public class DietaDAO extends GenericDAO<Dieta, Integer> {
    
    public DietaDAO(){
        super(Dieta.class);
    }
    
}
