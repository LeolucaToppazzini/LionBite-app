package com.lionbite.dto;

public class UserDto {
    private String nome, cognome;
    private String foto;
    private String indirizzo, mail;

    public UserDto(String nome, String cognome, String foto, String indirizzo, String mail) {
        this.nome = nome;
        this.cognome = cognome;
        this.foto = foto;
        this.indirizzo = indirizzo;
        this.mail = mail;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
