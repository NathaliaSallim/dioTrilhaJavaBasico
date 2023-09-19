package Operadores;

public class OpRelacionais {
    public static void main(String[] args) {
        //comparacao de texto
        String nomeUm = "Nathalia";
        String nomeDois = "Nathalia";
        //System.out.println(nomeUm == nomeDois); comparação de dois obejtos usa-se o equals
        System.out.println(nomeUm.equals(nomeDois));

        //comparacao com numeros
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        
        if(numero1 < numero2) {
            System.out.println("a nossa condição é verdadeira");
        }
        System.out.println("numeroUm é igual a numeroDois ? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é igual a numeroDois ? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maio que numeroDois ? " + simNao);

    }
}
