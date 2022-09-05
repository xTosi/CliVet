/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author g254221
 */
public class ClienteDAO {
    public List<Cliente> retrieveAllCliente(){
        List<Cliente> clientes = new ArrayList();
        clientes.add(new Cliente(1, "Gabriel", "Rua Joaninha", "99999-9999", "00000-000", "gabrielmail.gmail.com"));
        clientes.add(new Cliente(2, "Antonio", "Rua Besouro", "99999-9998", "00000-001", "antoniomail.gmail.com"));
        return clientes;
    }
}
