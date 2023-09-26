package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VeiculoController {
    public static void main(String[] args) {

        Bicicleta bic1 = new Bicicleta(2, "Humana", "Mormai",
                "Rua", 2016, 26, "1a2a3b");
        System.out.println(bic1);

        Carro car1 = new Carro(2, "Gasolina", "Volkswagen", "Jetta", 2020, 45, "7589304057", "1b2b3a", "BAC-111");
        System.out.println(car1);

        Caminhao cam1 = new Caminhao(5, "Diesel", "Volvo", "FH 540", 2016, 400, "8090100102", "123ccc", "CAC-222");
        System.out.println(cam1);

        Bicicleta bic2 = new Bicicleta(2, "Eletricidade", "Atrio", "Rua", 2023, 26, "123ddd");
        Bicicleta bic3 = new Bicicleta(2, "Gasolina", "Houston", "Rua", 2014, 26, "123eef");
        Bicicleta bic4 = new Bicicleta(2, "Humana", "Houston", "Trilha", 2019, 29, "123ffe");
        Bicicleta bic5 = new Bicicleta(2, "Humana", "Prince", "Rua", 2021, 29, "123ggg");

        Carro car2 = new Carro(4, "Gasolina", "Fiat", "147", 1985, 150, "1111111111", "123hoo", "HHH-333");
        Carro car3 = new Carro(4, "Eletricidade", "BMW", "M5", 2023, 250, "2222222222", "123ihs", "III-444");
        Carro car4 = new Carro(4, "Álcool/Gasolina", "Ford", "Focus", 2017, 320, "3333333333", "123jjj", "JJJ-444");
        Carro car5 = new Carro(4, "Gasolina", "Ferrari", "Berlinetta", 1987, 0, "4444444444", "123ksa", "KKK-555");

        Caminhao cam2 = new Caminhao(5, "Diesel", "Scania", "Highline", 2021, 800, "5555555555", "123kjl", "LML-666");
        Caminhao cam3 = new Caminhao(3, "Diesel", "Man", "TGX", 2014, 500, "6666666666", "123mmm", "MLM-777");
        Caminhao cam4 = new Caminhao(2, "Diesel", "Mercedes", "1620", 1991, 200, "7777777777", "123nnn", "NPN-888");
        Caminhao cam5 = new Caminhao(2, "Diesel", "Volvo", "New FH", 2005, 80, "8888888888", "123ooo", "OOO-999");

        List<Veiculo> VeiculoList = new ArrayList<>();
        VeiculoList.add(bic1);
        VeiculoList.add(bic2);
        VeiculoList.add(bic3);
        VeiculoList.add(bic4);
        VeiculoList.add(bic5);
        VeiculoList.add(car1);
        VeiculoList.add(car2);
        VeiculoList.add(car3);
        VeiculoList.add(car4);
        VeiculoList.add(car5);
        VeiculoList.add(cam1);
        VeiculoList.add(cam2);
        VeiculoList.add(cam3);
        VeiculoList.add(cam4);
        VeiculoList.add(cam5);

        VeiculoList.sort(Comparator.comparing(Veiculo::getAnoFabricacao).reversed());
        System.out.println("\nLista com veículos classificados pelo ano em ordem decrescente:");
        System.out.println(VeiculoList);

        System.out.println("\nLista com automóveis classificados pelo ano em ordem decrescente:");
        for (Veiculo veic : VeiculoList) {
            if (veic instanceof Automovel) {
                System.out.print(veic);
            }
        }

        System.out.println("\n\nLista com bicicletas classificadas pelo ano em ordem decrescente:");
        for (Veiculo bic : VeiculoList) {
            if (bic instanceof Bicicleta) {
                System.out.print(bic);
            }
        }

        car2.setPlaca("IUA-4H22");
        car5.setPlaca("IRF-5098");
        cam1.setPlaca("IJJ-0110");
        cam2.setPlaca("IRD-6658");
        cam4.setPlaca("IMW-3284");

        System.out.println("\n\n Lista com automóveis que possuem placas com a letra inicial 'I' classificados pelo ano em ordem decrescente:");
        for (Veiculo aut : VeiculoList) {
            if (aut instanceof Automovel) {
                if (((Automovel) aut).getPlaca().startsWith("I") || ((Automovel) aut).getPlaca().startsWith("i")) {
                    System.out.print(aut);
                }
            }
        }

    }
}