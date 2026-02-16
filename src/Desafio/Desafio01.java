package Desafio;

public class Desafio01 {
    public static void main(String[] args) {
        /* Crie um programa que represente tres ninjas da Vila da Folha (Konoha)
         * de Naturo e suas respectativas missões. Cada ninja tem um nome, uma idade
         * e uma missão atribuida a ele, com o nome da missão, nível de dificuldade
         * e status de conclusao.
         */

        // Ninja 1
        String nomeNinja1 = "Naruto";
        int idadeNinja1 = 14;
        String missaoNinja1 = "Encontrar o gato perdido";
        String StatusDeConclusaodoNinja1 = "Em Andamento";
        char NivelDeDificuldadedoNinja1 = 'D';


        // Verificar nível da missao e idade do ninja
        if (idadeNinja1 < 15) {
            if (NivelDeDificuldadedoNinja1 == 'D' || NivelDeDificuldadedoNinja1 == 'C') {
                StatusDeConclusaodoNinja1 = "Concluida";
            } else {
                StatusDeConclusaodoNinja1 = "Não Concluida";
            }
        }else{
            StatusDeConclusaodoNinja1 = "Concluida";
        }

        System.out.println("---------------------------------------------\n");
        System.out.println("Nome do Ninja: " + nomeNinja1);
        System.out.println("Idade do Ninja: " + idadeNinja1);
        System.out.println("Missão do Ninja: " + missaoNinja1);
        System.out.println("Status de Conclusao do Ninja: " + StatusDeConclusaodoNinja1);
        System.out.println("Nivel de Dificuldade do Ninja: " + NivelDeDificuldadedoNinja1);
        System.out.println("---------------------------------------------\n");
        // Ninja 2
        String nomeNinja2 = "Sakuke";
        int idadeNinja2 = 16;
        String missaoNinja2 = "Encontrar o Bandido perdido";
        String StatusDeConclusaodoNinja2 = "Em Andamento";
        char NivelDeDificuldadedoNinja2 = 'B';

        // Verificar nível da missao e idade do ninja
        if (idadeNinja2 < 15) {
            if (NivelDeDificuldadedoNinja2 == 'D' || NivelDeDificuldadedoNinja2 == 'C')
                StatusDeConclusaodoNinja2 = "Concluida";
            else {
                StatusDeConclusaodoNinja2 = "Não Concluida";;
            }
        }else {
            StatusDeConclusaodoNinja2 = "Concluida";
        }
        System.out.println("---------------------------------------------\n");
        System.out.println("Nome do Ninja: " + nomeNinja2);
        System.out.println("Idade do Ninja: " + idadeNinja2);
        System.out.println("Missão do Ninja: " + missaoNinja2);
        System.out.println("Status de Conclusao do Ninja: " + StatusDeConclusaodoNinja2);
        System.out.println("Nivel de Dificuldade do Ninja: " + NivelDeDificuldadedoNinja2);
        System.out.println("---------------------------------------------\n");

        // Ninja 3
        String nomeNinja3 = "Sakura";
        int idadeNinja3 = 15;
        String missaoNinja3 = "Encontrar o Curar Aldeão";
        String StatusDeConclusaodoNinja3 = "Em Andamento";
        char NivelDeDificuldadedoNinja3 = 'E';

        // Verificar nível da missao e idade do ninja
        if (idadeNinja3 < 15) {
            if (NivelDeDificuldadedoNinja3 == 'D' || NivelDeDificuldadedoNinja3 == 'C') {
                StatusDeConclusaodoNinja3 = "Concluida";
            } else {
                StatusDeConclusaodoNinja3 = "Não Concluida";
            }
        }else {
            StatusDeConclusaodoNinja3 = "Concluida";
        }
        System.out.println("---------------------------------------------\n");
        System.out.println("Nome do Ninja: " + nomeNinja3);
        System.out.println("Idade do Ninja: " + idadeNinja3);
        System.out.println("Missão do Ninja: " + missaoNinja3);
        System.out.println("Status de Conclusao do Ninja: " + StatusDeConclusaodoNinja3);
        System.out.println("Nivel de Dificuldade do Ninja: " + NivelDeDificuldadedoNinja3);
        System.out.println("---------------------------------------------\n");

    }
}
