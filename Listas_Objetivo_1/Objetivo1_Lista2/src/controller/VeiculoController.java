package controller;

import model.Veiculo;

import java.util.*;

public class VeiculoController {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("1243","IUA4H22","Verde",4, "Gasolina",115000,"AB5R4D",300.50);
        Veiculo veiculo2 = new Veiculo("2134","MLH0000","Vermelho",4, "Gasolina",10000,"ACV5CD",500.50);
        Veiculo veiculo3 = new Veiculo("1334","IRF5098","Azul",4, "Gasolina",12000,"AB34GD",400.50);
        Veiculo veiculo4 = new Veiculo("1324","MLK7877","Rosa",4, "Gasolina",110050,"AH6YIL",100.50);
        Veiculo veiculo5 = new Veiculo("3456","ABC1233","Branco",4, "Gasolina",116000,"A65BCD",600.50);
    //Cria  a coleção do tipo List e adiciona Objetos;
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(veiculo1);
        veiculos.add(veiculo2);
        veiculos.add(veiculo3);
        veiculos.add(veiculo4);
        veiculos.add(veiculo5);
        System.out.println(veiculos);

        //ORDENA
        veiculos.sort(Comparator.comparing(Veiculo::getPlaca));//para inverter .reversed!!
        System.out.println();
        System.out.println("----------Classificado pela placa----------");
        System.out.println(veiculos);

        //Pesquisar usando tipo Find

        Veiculo veiculoFind = veiculos.stream().filter(v -> v.getPlaca().equals("ABC1233")).findAny().orElse(null);
        System.out.println();
        System.out.println("----------Veiculo procurado----------");
        System.out.println(veiculoFind);

        ///Tipo Map

        Map<String, Veiculo> veiculoMap = new HashMap<>();
        veiculoMap.put(veiculo1.getRenavan(), veiculo1);
        veiculoMap.put(veiculo2.getRenavan(), veiculo2);
        veiculoMap.put(veiculo3.getRenavan(), veiculo3);
        veiculoMap.put(veiculo4.getRenavan(), veiculo4);
        veiculoMap.put(veiculo5.getRenavan(), veiculo5);
        System.out.println("----------Coleção do tipo Map----------");
        System.out.println(veiculoMap);

        //Pesquisa no tipo MAP

        System.out.println("----------Veiculo procurado pelo MAP----------");
        System.out.println(veiculoMap.get(veiculo3.getRenavan()));
    }

}
