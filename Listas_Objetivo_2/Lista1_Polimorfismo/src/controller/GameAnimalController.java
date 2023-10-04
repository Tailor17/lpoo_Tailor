package controller;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

import java.util.ArrayList;
import java.util.List;

public class GameAnimalController {
    public static void main(String[] args) {

        Peixe peixe1 = new Peixe(1,1);
        Peixe peixe2 = new Peixe(3, 3, 3);
        Peixe peixe3 = new Peixe(4, 4, 4);

        Cachorro cachorro1 = new Cachorro(5,5);
        Cachorro cachorro2 = new Cachorro(6,6);
        Cachorro cachorro3 = new Cachorro(7,7);

        Passaro passaro1 = new Passaro(8,8);
        Passaro passaro2 = new Passaro(9,9,9);
        Passaro passaro3 = new Passaro(10,10,10);

        List<Animal> AnimalList = new ArrayList<>();
        AnimalList.add(peixe1);
        AnimalList.add(peixe2);
        AnimalList.add(peixe3);
        AnimalList.add(cachorro1);
        AnimalList.add(cachorro2);
        AnimalList.add(cachorro3);
        AnimalList.add(passaro1);
        AnimalList.add(passaro2);
        AnimalList.add(passaro3);

        System.out.print("\n Lista de animais: \n");
        System.out.println(AnimalList);

        System.out.print("\n Lista de animais nas posições (2,2):\n");
        for (Animal animal : AnimalList) {
            animal.mover(2,2);
            animal.desenhar();
            System.out.println(animal);
        }

        System.out.print("\n Lista de cachorros nas posições (8,8):\n");
        for (Animal animal : AnimalList) {
            if (animal instanceof Cachorro) {
                animal.mover(8,8);
                animal.desenhar();
                System.out.println(animal);
            }
        }

        System.out.print("\n Lista de peixes e pássaros nas posições (5,5,5):\n");
        for (Animal animal : AnimalList) {
            if (animal instanceof Peixe) {
                ((Peixe) animal).mover(5,5,5);
                animal.desenhar();
                System.out.println(animal);
            } else if (animal instanceof Passaro) {
                ((Passaro) animal).mover(5,5,5);
                animal.desenhar();
                System.out.println(animal);
            }
        }
    }
}