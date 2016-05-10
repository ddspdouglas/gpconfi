package br.ainur.model;

import br.ainur.model.base.BaseEntityAudit;
import br.ainur.model.enuns.TipoEstoqueAno;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name = "estoque_ano")  
@AttributeOverride(name = "id", column = @Column(name = "est_ano_id", nullable = false)) 
public class EstoqueAno extends BaseEntityAudit{
    
    private Date dia;
    private Double diariasDia;
    private Double entradaDia;
    private Double saidaDia;
    private TipoEstoqueAno tipo;
    
}
