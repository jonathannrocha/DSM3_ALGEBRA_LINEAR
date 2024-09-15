package domain.entities;
import java.util.ArrayList;
import java.util.List;


public class Lanche {
    private String nome;
    private double margem;
    private double valor;
    private double valorComMargem;

    public Lanche(String nome, double margem) {
        this.nome = nome;
        this.margem = margem;
    }

    public Lanche() {}
    public String getNome() {
        return nome;
    }

    public Lanche setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public double getMargem() {
        return margem;
    }

    public Lanche setMargem(double margem) {
        this.margem = margem;
        return this;
    }

    public Lanche setValor(double valor) {
        this.valor = valor;
        return this;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Lanche{" +
                "nome='" + nome + '\'' +
                ", margem=" + margem +
                '}';
    }
}
