/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author g254221
 */
public class Cliente {
    private final int idCliente;
    private String Nome;
    private String Endereco;
    private String Telefone;
    private String CEP;
    private String Email;

    public Cliente(int idCliente, String Nome, String Endereco, String Telefone, String CEP, String Email) {
        this.idCliente = idCliente;
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.CEP = CEP;
        this.Email = Email;
    }

    public int getIdCliente() {
        return idCliente;
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

    public String getCEP() {
        return CEP;
    }

    public String getEmail() {
        return Email;
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

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    
}

