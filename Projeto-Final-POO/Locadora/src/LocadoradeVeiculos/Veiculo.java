package LocadoradeVeiculos;

public abstract class Veiculo implements MeiodeTransporte {

    String modelo;
    double valor;
    int ano;
    double km;

    public Veiculo(String modelo, double valor, int ano, double km) {
        this.modelo = modelo;
        this.valor = valor;
        this.ano = ano;
        this.km = km;
    }

    public Veiculo() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    void mostrarKm() {
        System.out.println(getKm() + " Quilômetos");
    }

    void mostrarVeiculo() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Valor: R$" + getValor());
        System.out.println("Ano: " + getAno());
        mostrarKm();
    }
}
