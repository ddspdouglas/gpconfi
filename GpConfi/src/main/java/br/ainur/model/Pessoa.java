package br.ainur.model;

import br.ainur.model.base.BaseEntityAudit;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name = "pessoa")  
@AttributeOverride(name = "id", column = @Column(name = "pessoa_id", nullable = false))  
public class Pessoa extends BaseEntityAudit{
   
    private String nomePessoa;

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    
    
    
}
