package com.lionbite.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Entity(name = "ordine")
public class Ordine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime tempoConsegna;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
    @OneToMany
    @JoinTable(name = "ordine_riga",
            joinColumns = @JoinColumn(name = "id_ordine"),
            inverseJoinColumns = @JoinColumn(name ="id_riga"))
    private List<RigaOrdine> righeOrdine = new ArrayList<>();
    private BigDecimal prezzo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTempoConsegna() {
        return tempoConsegna;
    }

    public void setTempoConsegna(LocalDateTime tempoConsegna) {
        this.tempoConsegna = tempoConsegna;
    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<RigaOrdine> getRigheBox() {
        return righeOrdine;
    }

    public void setRigheBox(List<RigaOrdine> righeBox) {
        this.righeOrdine = righeBox;
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
        if (!(o instanceof Ordine ordine)) return false;
        return Objects.equals(id, ordine.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
