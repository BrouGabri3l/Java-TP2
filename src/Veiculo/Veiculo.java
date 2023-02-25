package Veiculo;
public abstract class Veiculo {
    protected int NumeroDeRodas;
    protected String Modelo;
    protected String Cor;

    protected abstract void ligar();
    protected abstract void desligar();
    protected abstract void engatarMarcha();
    protected Veiculo(int numeroDeRodas,String modelo,String cor){
        this.NumeroDeRodas = numeroDeRodas;
        this.Modelo = modelo;
        this.Cor = cor;
    }
    protected void quantasRodas(){
        System.out.println("Este veículo tem " + NumeroDeRodas + " rodas");
    }
}
