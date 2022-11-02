package LocadoradeVeiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cadastrar C1 = new Cadastrar();

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        int aux;
        Carro carroA = new Carro();

        carroA.setAno(2008);
        carroA.setValor(15000);
        carroA.setCombustivel("flex");
        carroA.setNumPortas(4);
        carroA.setKm(100000);
        carroA.setModelo("palio");

        Carro carroB = new Carro();
        carroB.setAno(1996);
        carroB.setCombustivel("gasolina");
        carroB.setValor(9000);
        carroB.setNumPortas(2);
        carroB.setKm(106000);
        carroB.setModelo("gol");

        Motocicleta motoA = new Motocicleta();

        motoA.setAno(2012);
        motoA.setCategoria("esportiva");
        motoA.setCilindrada(250);
        motoA.setValor(10000);
        motoA.setKm(23000);
        motoA.setModelo("ninja");

        Motocicleta motoB = new Motocicleta();
        motoB.setAno(2012);
        motoB.setCategoria("city");
        motoB.setCilindrada(125);
        motoB.setValor(5000);
        motoB.setKm(17000);
        motoB.setModelo("fan");

        
        veiculos.add(carroA);
        veiculos.add(carroB);
        veiculos.add(motoA);
        veiculos.add(motoB);
        Cadastrar cad = new Cadastrar();
        cad.menu(veiculos);
    }
}
