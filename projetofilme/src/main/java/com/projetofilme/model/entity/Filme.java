package com.projetofilme.model.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="filme")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 10)
    private String titulo;

    @Column(length = 10)
    private String genero;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(length = 10)
    private Date dataLancamento;

    @DateTimeFormat(pattern = "HH:mm:ss")
    @Column(length = 10)
    private Date duracao;

    @Column(length = 10)
    private String sinopse;

    @Column(length = 10)
    private Double orcamento;

    @Column(length = 10)
    private Double bilheteria;

    @Column(length = 10)
    private String estudio;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Date getDuracao() {
        return duracao;
    }

    public void setDuracao(Date duracao) {
        this.duracao = duracao;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Double orcamento) {
        this.orcamento = orcamento;
    }

    public Double getBilheteria() {
        return bilheteria;
    }

    public void setBilheteria(Double bilheteria) {
        this.bilheteria = bilheteria;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    }


