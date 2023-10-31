package com.example.atividade3;

public class Atividade3Application {
    public static int digitalRoot(int n) {
        // Caso base: se n for menor que 10, retorne n (não é necessário mais cálculos)
        if (n < 10) {
            return n;
        }

        // Caso recursivo: calcule a soma dos dígitos de n
        int somaDosDigitos = 0;
        while (n > 0) {
            somaDosDigitos += n % 10; // Adicione o dígito ao somatório
            n /= 10; // Descarte o dígito processado
        }

        // Chame a função raizDigital recursivamente com a soma
        return digitalRoot(somaDosDigitos);
    }
}