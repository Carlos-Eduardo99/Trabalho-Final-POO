package LocadoradeVeiculos;

public class Carro extends Veiculo {

    int numPortas;
    String combustivel;

    public Carro(String modelo, double valor, int ano, int numPortas, int km, String combus) {
        super(modelo, valor, ano, km);
        this.numPortas = numPortas;
        this.combustivel = combus;
    }

    public Carro() {
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public void tipoVeiculo() {
        System.out.println("Este é um carro");
    }

    @Override
    void mostrarVeiculo() {
        super.mostrarVeiculo();
        System.out.println("Numero de Portas: " + getNumPortas());
        System.out.println("Combustível: " + getCombustivel());
        tipoVeiculo();
        System.out.println("");

    }
}
