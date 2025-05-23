package gerenciadores;

import java.util.ArrayList;
import java.util.List;

import classes.Passageiro;

public class GerenciadorPassageiros {

    List<Passageiro> lista_passageiro = new ArrayList<>();

    public void adicionar_passageiro(Passageiro p1) {
        lista_passageiro.add(p1);
    }

    public void remover_passageiro(Passageiro p1) {
        lista_passageiro.remove(p1);
    }

    public void imprimir() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Gerenciador de Passageiros:" + '\n' +
                 lista_passageiro + "\n\n";
    }

    public List<Passageiro> getLista_passageiro() {
        return lista_passageiro;
    }

    public void setLista_passageiro(List<Passageiro> lista_passageiro) {
        this.lista_passageiro = lista_passageiro;
    }
}
