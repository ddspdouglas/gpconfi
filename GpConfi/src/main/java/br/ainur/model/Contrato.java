package br.ainur.model;

import br.ainur.model.base.BaseEntityAudit;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name = "contrato")  
@AttributeOverride(name = "id", column = @Column(name = "contrato_id", nullable = false)) 
public class Contrato extends BaseEntityAudit{
    
}
