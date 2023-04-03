package com.lionbite.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Entity(name = "market")
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String ragioneSociale;
    private String    pIva, indirizzo;
    private String foto;
    @OneToMany
    @JoinTable(name = "market_box",
            joinColumns = @JoinColumn(name = "id_market"),
            inverseJoinColumns = @JoinColumn(name ="id_box"))
    private List<LionBox> lionBoxes = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public String getpIva() {
        return pIva;
    }

    public void setpIva(String pIva) {
        this.pIva = pIva;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    public List<LionBox> getLionBoxes() {
        return lionBoxes;
    }

    public void setLionBoxes(List<LionBox> lionBoxes) {
        this.lionBoxes = lionBoxes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Market market)) return false;
        return Objects.equals(id, market.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
