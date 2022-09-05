/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author g254221
 */
public class Consulta {
    private final int idConsulta;
    private String Data;
    private String Historico;

    public Consulta(int idConsulta, String Data, String Historico) {
        this.idConsulta = idConsulta;
        this.Data = Data;
        this.Historico = Historico;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public String getData() {
        return Data;
    }

    public String getHistorico() {
        return Historico;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public void setHistorico(String Historico) {
        this.Historico = Historico;
    }
    
    
}
