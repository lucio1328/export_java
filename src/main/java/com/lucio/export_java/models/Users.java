package com.lucio.export_java.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Users {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "prenom")
    private String prenom;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "adresse")
    private String adresse;
    @Basic
    @Column(name = "mdp")
    private String mdp;
    @ManyToOne
    @JoinColumn(name = "id_genre", nullable = false)
    private Genre genre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre idGenre) {
        this.genre = idGenre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return id == users.id && genre == users.genre && Objects.equals(nom, users.nom) && Objects.equals(prenom, users.prenom) && Objects.equals(email, users.email) && Objects.equals(adresse, users.adresse) && Objects.equals(mdp, users.mdp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, email, adresse, mdp, genre);
    }
}
