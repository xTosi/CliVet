/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author g254221
 */
public class Veterinario {
    private final int idVet;
    private String Nome;
    private String Endereco;
    private String Telefone;

    public Veterinario(int idVet, String Nome, String Endereco, String Telefone) {
        this.idVet = idVet;
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
    }

    public int getIdVet() {
        return idVet;
    }

    public String getNome() {
        return Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    
}
