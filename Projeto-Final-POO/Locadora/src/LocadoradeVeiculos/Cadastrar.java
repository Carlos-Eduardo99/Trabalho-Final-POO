package LocadoradeVeiculos;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Cadastrar {

    Scanner entrada = new Scanner(System.in);
    public int opcao;

    public Cadastrar() {
    }

    public static void cabecalho() {
        System.out.println("**** LOCADORA DE VEICULOS ****");
        System.out.println("1 - Cadastrar carro");
        System.out.println("2 - Cadastar moto");
        System.out.println("3 - Consultar quais veículos estão disponíveis");
        System.out.println("4 - Alugar um veiculo");
        System.out.println("5 - Sair");
    }

    void menu(ArrayList<Veiculo> veiculos) {

        do {
            try {
                cabecalho();
                opcao = entrada.nextInt();

            } catch (InputMismatchException erro) {
                System.out.println("Erro " + erro + " Informe apenas numeros");
                break;
            }

            switch (opcao) {
                case 1:
                    Carro car = new Carro();
                    System.out.println("Informe o modelo do automóvel: ");
                    car.modelo = entrada.next();
                    System.out.println("Informe o ano: ");
                    car.ano = entrada.nextInt();
                    System.out.println("Informe o valor: ");
                    car.valor = entrada.nextInt();
                    System.out.println("Informe o combustivel: ");
                    car.setCombustivel(entrada.next());
                    System.out.println("Informe a quilometragem: ");
                    car.km = entrada.nextDouble();
                    System.out.println("Informe o numero de portas: ");
                    car.numPortas = entrada.nextInt();
                    veiculos.add(car);
                    System.out.println("Adcionado com sucesso!!");
                    break;

                case 2:
                    Motocicleta moto = new Motocicleta();

                    System.out.println("Informe o modelo da moto: ");
                    moto.modelo = entrada.next();
                    System.out.println("Informe o ano: ");
                    moto.ano = entrada.nextInt();
                    System.out.println("Informe o valor: ");
                    moto.valor = entrada.nextDouble();
                    System.out.println("Informe a cilindrada: ");
                    moto.cilindrada = entrada.nextInt();
                    System.out.println("Informe a categoria: ");
                    moto.categoria = entrada.next();
                    System.out.println("Informe a quilometragem: ");
                    moto.km = entrada.nextDouble();
                    veiculos.add(moto);
                    System.out.println("Adcionado com sucesso!!");
                    break;

                case 3:
                    for (int i = 0; i < veiculos.size(); i++) {
                        veiculos.get(i).mostrarVeiculo();
                    }
                    break;

                case 4:
                    int aux2;
                    System.out.println("Informe qual veiculo deseja alugar");
                    aux2 = entrada.nextInt();
                    veiculos.remove(aux2);
                    System.out.println("Removido com sucesso!!");

                    break;

                default:
                    if ((opcao < 1) || (opcao > 5)) {
                        System.out.println("Opção invalida! Informe um número entre 0 e 4");
                    }
            }
        } while (5 != opcao);
    }
}
