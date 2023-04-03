package com.lionbite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Entity(name = "box")
public class LionBox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String foto;
    private CategoriaBox categoriaBox;
    private BigDecimal prezzo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public CategoriaBox getCategoriaBox() {
        return categoriaBox;
    }

    public void setCategoriaBox(CategoriaBox categoriaBox) {
        this.categoriaBox = categoriaBox;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LionBox lionBox)) return false;
        return Objects.equals(id, lionBox.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
