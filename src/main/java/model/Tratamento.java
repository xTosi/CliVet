/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author g254221
 */
public class Tratamento {
    private final int idTratamento;
    private String DataInicial;
    private String DataFinal;

    public Tratamento(int idTratamento, String DataInicial, String DataFinal) {
        this.idTratamento = idTratamento;
        this.DataInicial = DataInicial;
        this.DataFinal = DataFinal;
    }

    public int getIdTratamento() {
        return idTratamento;
    }

    public String getDataInicial() {
        return DataInicial;
    }

    public String getDataFinal() {
        return DataFinal;
    }

    public void setDataInicial(String DataInicial) {
        this.DataInicial = DataInicial;
    }

    public void setDataFinal(String DataFinal) {
        this.DataFinal = DataFinal;
    }
    
    
}
