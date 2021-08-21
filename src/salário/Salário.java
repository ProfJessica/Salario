package salário;
import java.util.Scanner;

public class Salário {

//Pseudocódigo
// INÍCIO
// ENTRADA DE DADOS
// float salarioInicial
// float aumento = (salarioInicial * 15.3)/100
// float salarioFinal = salarioInicial + aumento
// PROCESSAMENTO (cálculo)
// IMPRIMIR salarioFinal
// FIM
    
    public static void main(String[] args) {
        System.out.println("Qual é o seu salário? ");
        Scanner resposta = new Scanner(System.in);
        
        float salarioInicial = resposta.nextFloat();
        float aumento = (salarioInicial * 15.3F)/100;
        float salarioFinal = salarioInicial + aumento;
        
        System.out.println("Seu salário inicial era: R$" + salarioInicial + ". O valor do aumento é: R$" + aumento + ". Seu novo salário é: R$" + salarioFinal);
    }
    
}
