package Aula001.DadosNaoPrimitivos;

public class DadosNaoPrimitivos {
    static void main(String[] args) {
        // Tudo que for digitado aqui dentro PSWA vai ser compilado java
        /*
        * Dados não primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja, e atribuir a ele.
        */
        // Declarando a variavel como NARUTO UZUMAKI
        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // ToUpperCase vai colocar tudo em CAPSLOK
        System.out.println("Esse texto esta em CAPSLOCK" + nomeUpperCase);
        System.out.println("Esse texto está normal" + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase(); // toLowerCase vai colocar tudo normal
        System.out.println("Esse texto está tudo em letra minuscula" + aldeiaEmCaixaBaixa);

    }
}
