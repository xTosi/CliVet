/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author g254221
 */
public class Exame {
    private final int idExame;
    private String Descricao;

    public Exame(int idExame, String Descricao) {
        this.idExame = idExame;
        this.Descricao = Descricao;
    }

    public int getIdExame() {
        return idExame;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
    
}
