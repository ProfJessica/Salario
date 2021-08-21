package salário;

public class Salário {

// INÍCIO
// ENTRADA DE DADOS
// float salarioInicial
// float aumento = (salarioInicial * 15.3)/100
// float salarioFinal = salarioInicial + aumento
// PROCESSAMENTO (cálculo)
// IMPRIMIR salarioFinal
// FIM
    
    public static void main(String[] args) {
        float salarioInicial = 2000F;
        float aumento = (salarioInicial * 15.3F)/100;
        float salarioFinal = salarioInicial + aumento;
        
        System.out.println("Seu novo salário é: R$" + salarioFinal);
    }
    
}
