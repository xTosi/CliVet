/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.Animal;
import model.AnimalDAO;
import model.Cliente;
import model.ClienteDAO;

/**
 *
 * @author g254221
 */
public class Controller {
    public List<Cliente> getAllCliente(){
        ClienteDAO cli = new ClienteDAO();
        return cli.retrieveAllCliente();
    }
    
    public List<Animal> getAllAnimal(int idCliente){
        AnimalDAO cli = new AnimalDAO();
        return cli.retrieveAllAnimal(idCliente);
    }
}
