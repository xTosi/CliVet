/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author g254221
 */
public class Animal {
    private final int idAnimal;
    private String Nome;
    private int Idade;
    private String Sexo;
    private final int idCliente;

    public Animal(int idAnimal, String Nome, int Idade, String Sexo, int idCliente) {
        this.idAnimal = idAnimal;
        this.Nome = Nome;
        this.Idade = Idade;
        this.Sexo = Sexo;
        this.idCliente = idCliente;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public int getidClinte() {
        return idCliente;
    }
    
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    
}
