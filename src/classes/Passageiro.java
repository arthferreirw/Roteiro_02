package classes;

public class Passageiro {

    private String nome;
    private String cpf;
    private Voo voo;
    private SistemaFidelidade fidelidade;

    public Passageiro(String nome, String cpf ) {
        this.nome = nome;
        this.cpf = cpf;
        this.fidelidade = new SistemaFidelidade(); //instanciando toda vez que cria a classe passageiro
    }

   public SistemaFidelidade getFidelidade() {
        return fidelidade;
    }

    public void setFidelidade(SistemaFidelidade fidelidade) {
        this.fidelidade = fidelidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", voo=" + voo +
                ", fidelidade=" + fidelidade +
                '}';
    }
}
