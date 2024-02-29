public class Main {
    public static void main(String[] args) {

//        1. A partir da análise dele, proponha mais um método construtor:
        Conta contaNovoConstrutor = new Conta(200, 100.60);

//        2. Para a questão anterior, proponha as instruções em Java
//        para construir um objeto empregando cada um dos construtores da classe Conta:"
        Conta constutorVazio = new Conta();
        Conta construtorImplementado = new Conta(200, 100.60);

//        Represente na memória os objetos instanciados na questão anterior (2):
        Conta memoriaPrincipal = new Conta();
        memoriaPrincipal.setNumero(1);
        System.out.println("Conta com construtor vazio: ");
        System.out.println("Numero: " +  memoriaPrincipal.getNumero());
        System.out.println("Saldo: " +  memoriaPrincipal.getSaldo());
        memoriaPrincipal = new Conta(2, 100.55);
        System.out.println("Conta com construtor implementado: \n");
        System.out.println("Numero: " +  memoriaPrincipal.getNumero());
        System.out.println("Saldo: " +  memoriaPrincipal.getSaldo());
    }
}
