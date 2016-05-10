package br.ainur.model;

import br.ainur.model.base.BaseEntityAudit;
import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity  
@Table(name = "dieta_itens")  
@AttributeOverride(name = "id", column = @Column(name = "dieta_itens_id", nullable = false)) 
public class DietaItem extends BaseEntityAudit{
    
    @JoinColumn(name = "produto_id", nullable = false)
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Produto produto;
    @JoinColumn(name = "dieta_id", nullable = false)
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Dieta dieta;
    @Column(name = "materia_seca_dia")
    private Double mteriaSecaDia;
    @Column(name = "materia_natural_dia")
    private Double materiaNatDia;
    @Column(name = "perc_dieta")
    private Double percDieta;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public Double getMteriaSecaDia() {
        return mteriaSecaDia;
    }

    public void setMteriaSecaDia(Double mteriaSecaDia) {
        this.mteriaSecaDia = mteriaSecaDia;
    }

    public Double getMateriaNatDia() {
        return materiaNatDia;
    }

    public void setMateriaNatDia(Double materiaNatDia) {
        this.materiaNatDia = materiaNatDia;
    }

    public Double getPercDieta() {
        return percDieta;
    }

    public void setPercDieta(Double percDieta) {
        this.percDieta = percDieta;
    }
    
    
    
}
