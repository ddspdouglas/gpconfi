package br.ainur.model;

import br.ainur.model.base.BaseEntityAudit;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name = "saida_animal")  
@AttributeOverride(name = "id", column = @Column(name = "saida_animal_id", nullable = false)) 
public class SaidaAnimais extends BaseEntityAudit{
    
}
