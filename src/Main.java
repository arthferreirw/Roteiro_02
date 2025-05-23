import classes.Passageiro;
import classes.Voo;
import gerenciadores.Aeroporto;
import gerenciadores.GerenciadorPassageiros;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Aeroporto a1 = new Aeroporto("Aeroporto Internacional de Brasília","Brasília");
        Voo v1 = new Voo("134","Los Angeles",100);
        Voo v2 = new Voo("157","Oslo",75);
        Passageiro p1 = new Passageiro("Carlos","120.570.970-02");
        GerenciadorPassageiros g1 = new GerenciadorPassageiros();

        //adicionando escalas
        v1.adicionarEscala("Miami");
        v1.adicionarEscala("Orlando");

        //passageiro 1 até voo1
        p1.setVoo(v1);
        //gerenciador adiciona passageiro no voo
        g1.adicionar_passageiro(p1);
        //aeroporto adiciona voo1 e voo2
        a1.adicionarVoo(v1);
        a1.adicionarVoo(v2);

        //passageiro acumula pontos
        p1.getFidelidade().adicionarPontos(500);

        // Iniciar voo
        a1.iniciarVoo("134");

        a1.imprmir();
        g1.imprimir();

        // Verificar voos com prejuízo
        System.out.println("Voos com prejuízo:");
        int quantidadeVoosComPrejuizo = a1.verificaVoosComPrejuizo(a1.getLista_voo());

        System.out.println("Quantidade de voos com prejuízo: " + quantidadeVoosComPrejuizo);



    }
}