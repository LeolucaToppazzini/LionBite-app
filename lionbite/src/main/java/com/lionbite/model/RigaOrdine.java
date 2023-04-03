package com.lionbite.model;

import javax.persistence.*;
import java.util.Objects;
@Entity(name = "riga")
public class RigaOrdine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_box")
    private LionBox lionBox;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LionBox getLionBox() {
        return lionBox;
    }

    public void setLionBox(LionBox lionBox) {
        this.lionBox = lionBox;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RigaOrdine rigaBox)) return false;
        return Objects.equals(id, rigaBox.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
