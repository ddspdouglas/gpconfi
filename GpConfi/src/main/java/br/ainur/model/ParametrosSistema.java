package br.ainur.model;

import br.ainur.model.base.BaseEntityAudit;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name = "parametros")  
@AttributeOverride(name = "id", column = @Column(name = "param_id", nullable = false)) 
public class ParametrosSistema extends BaseEntityAudit{
    
    private String descricao;
    private String valor;
    
}
