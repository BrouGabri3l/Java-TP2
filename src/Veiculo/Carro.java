package Veiculo;
public class Carro extends Veiculo {
    public static int NumeroDeRodas = 4;
    
    public Carro(String modelo, String cor){
        super(NumeroDeRodas, modelo, cor);
    
    }
    public void ligar(){
        System.out.println("Carro ligado");
    }
    public void desligar(){
        System.out.println("Carro Desligado");
    }
    public void engatarMarcha(){
        System.out.println("Marcha engatada");
    }
}
