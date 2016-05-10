package br.ainur.model;

import br.ainur.model.base.BaseEntity;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name = "entrada_animais")  
@AttributeOverride(name = "id", column = @Column(name = "entr_animais_id", nullable = false)) 
public class EntradaAnimais extends BaseEntity{
    
    private Date dataEntrada;
    
}