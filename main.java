
package classecontabancaria;

public class ClasseContaBancaria {

    public static void main(String[] args) {
        // TODO code application logic here
        ContaBancaria c1 = new ContaBancaria("12345", "Ronaldo", 345987);
        
        c1.exibirSaldo();
        c1.sacar(500);
        c1.exibirSaldo();
    }
    
}
