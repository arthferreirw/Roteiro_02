package gerenciadores;

import classes.Voo;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {

    private String nome;
    private String localizacao;
    private List<Voo> lista_voo = new ArrayList<>();
    private int quantMaxPassageiros;
    private String estadoDoVoo;
    private Voo contadorVoosComPrejuizo;


    public Aeroporto(String nome,String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public void adicionarVoo(Voo v1) {
        lista_voo.add(v1);
    }

    public void removerVoo(Voo v1) {
        lista_voo.remove(v1);
    }

    public int verificaVoosComPrejuizo(List<Voo> lista_voo) {
        int quantMinima = 5;
        int contador = 0;

        for(Voo v1 : lista_voo) {
            if(v1.getQuantPassageiro() < quantMinima)
                contador++;
        }
        return contador;
    }

    public List<Voo> getLista_voo() {
        return lista_voo;
    }

    public void setLista_voo(List<Voo> lista_voo) {
        lista_voo = lista_voo;
    }

    public int getQuantMaxPassageiros() {
        return quantMaxPassageiros;
    }

    public void setQuantMaxPassageiros(int quantMaxPassageiros) {
        this.quantMaxPassageiros = quantMaxPassageiros;
    }

    public String getEstadoDoVoo() {
        return estadoDoVoo;
    }

    public void setEstadoDoVoo(String estadoDoVoo) {
        this.estadoDoVoo = estadoDoVoo;
    }

    public Voo getContadorVoosComPrejuizo() {
        return contadorVoosComPrejuizo;
    }

    public void setContadorVoosComPrejuizo(Voo contadorVoosComPrejuizo) {
        this.contadorVoosComPrejuizo = contadorVoosComPrejuizo;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public void imprmir() {
        System.out.println(this);
    }
    public void iniciarVoo(String nome) {
        for (Voo v : lista_voo) {
            if (v.getNome().equals(nome)) {
                v.iniciar();
                return;
            }
        }
        System.out.println("Voo " + nome + " não encontrado.");
    }

    @Override
    public String toString() {
        return "Aeroporto:" + nome + '\n' +
                "Vôos" + lista_voo + "\n\n";
    }
}
