package Operadores;

public class OpTernario {
    public static void main(String[] args) {
        int a, b;
        a = 6;
        b = 6;
        /*String resultado = "";
        EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";*/
        //utilizando o op ternario não se limite a string
        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);

    }
    
}
