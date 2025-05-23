package classes;

import java.util.ArrayList;
import java.util.List;

public class Voo {
    private String nome;
    private String destino;
    private int quantPassageiro;
    private List<String> lista_escalas;
    private boolean iniciado;

    public Voo(String nome,String destino,int quantPassageiros ) {
        this.nome = nome;
        this.destino = destino;
        this.quantPassageiro = quantPassageiros;
        this.lista_escalas = new ArrayList<>();
        this.iniciado = false; //por padrao, nao iniciado
    }

    public boolean isIniciado() {
        return iniciado;
    }

    public void setIniciado(boolean iniciado) {
        this.iniciado = iniciado;
    }

    public List<String> getLista_escalas() {
        return lista_escalas;
    }

    public void setLista_escalas(List<String> lista_escalas) {
        this.lista_escalas = lista_escalas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantPassageiro() {
        return quantPassageiro;
    }

    public void setQuantPassageiro(int quantPassageiro) {
        this.quantPassageiro = quantPassageiro;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void adicionarEscala (String nome){
        lista_escalas.add(nome);
    }
    public void iniciar (){
        this.iniciado = true;
        System.out.println(" Voo " +nome + "iniciado");

    }

    @Override
    public String toString() {
        return "Voo{" +
                "nome='" + nome + '\'' +
                ", destino='" + destino + '\'' +
                ", quantPassageiro=" + quantPassageiro +
                ", lista_escalas=" + lista_escalas +
                ", iniciado=" + iniciado +
                '}';
    }
}
