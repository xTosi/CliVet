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
public class AnimalDAO {
        public List<Animal> retrieveAllAnimal(int idCliente){
            List<Animal> animais = new ArrayList();
            if(idCliente==1){
                animais.add(new Animal(1, "Toto", 4, "Macho", 1));
                animais.add(new Animal(2, "Belinha", 3, "Femea", 1)); 
            }
            else {
                animais.add(new Animal(1, "Adao", 2, "Macho", 2));
                animais.add(new Animal(2, "Eva", 5, "Femea", 2)); 
            }
            return animais;
    }
}
