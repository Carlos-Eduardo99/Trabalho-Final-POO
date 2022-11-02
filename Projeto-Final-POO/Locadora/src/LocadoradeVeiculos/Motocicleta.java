package LocadoradeVeiculos;

public class Motocicleta extends Veiculo {

    int cilindrada;
    String categoria;

    public Motocicleta() {
    }

    public Motocicleta(String modelo, double valor, int ano, double km, int cilindrada, String categoria) {
        super(modelo, valor, ano, km);
        this.cilindrada = cilindrada;
        this.categoria = categoria;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void tipoVeiculo() {
        System.out.println("Este é uma motocicleta");
    }

    @Override
    public void  mostrarVeiculo() {
        super.mostrarVeiculo();
        System.out.println("Cilindrada: " + getCilindrada() + " CM³");
        System.out.println("Categoria: " + getCategoria());
        tipoVeiculo();
        System.out.println("");
    }
}
