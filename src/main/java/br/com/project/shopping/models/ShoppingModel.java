package br.com.project.shopping.models;


import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_SHOPPING_CONTROL")
public class ShoppingModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column (nullable = false, unique = true, length = 100)
    private String nomeDaLoja;

    @Column (nullable = false, length = 100)
    private String nomeDoSocio;

    @Column (nullable = false, length = 100)
    private String nichoDaLoja;

    @Column (nullable = false, length = 100)
    private String cnpjDaLoja;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNomeDaLoja() {
        return nomeDaLoja;
    }

    public void setNomeDaLoja(String nomeDaLoja) {
        this.nomeDaLoja = nomeDaLoja;
    }

    public String getNomeDoSocio() {
        return nomeDoSocio;
    }

    public void setNomeDoSocio(String nomeDoSocio) {
        this.nomeDoSocio = nomeDoSocio;
    }

    public String getNichoDaLoja() {
        return nichoDaLoja;
    }

    public void setNichoDaLoja(String nichoDaLoja) {
        this.nichoDaLoja = nichoDaLoja;
    }

    public String getCnpjDaLoja() {
        return cnpjDaLoja;
    }

    public void setCnpjDaLoja(String cnpjDaLoja) {
        this.cnpjDaLoja = cnpjDaLoja;
    }
}
