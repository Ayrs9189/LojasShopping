package br.com.project.shopping.dto;


import jakarta.validation.constraints.NotBlank;

public class ShoppingDto {

    @NotBlank
    private String nomeDaLoja;
    @NotBlank
    private String nomeDoSocio;
    @NotBlank
    private String nichoDaLoja;
    @NotBlank
    private String cnpjDaLoja;

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
