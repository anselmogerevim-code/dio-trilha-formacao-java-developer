package exemplo1;
public class Carro extends Veiculo{

    public void ligar(){
        confereCombustivel();
        confereCambio();
        System.out.println("CARRO LIGADO\n");
    }

    private void confereCombustivel(){
        System.out.println("COMBUSTIVEL CONFERIDO");
    }
    private void confereCambio(){
        System.out.println("CAMBIO CONFERIDO");
    }

}
