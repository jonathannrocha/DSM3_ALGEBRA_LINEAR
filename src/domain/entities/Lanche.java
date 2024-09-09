package domain.entities;
import java.util.ArrayList;
import java.util.List;


public class Lanche {
    private String nome;
    private double margem;
    private List<Ingrediente> ingredientes = new ArrayList<>();

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

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public Lanche setIngredientes( List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
        return this;
    }

    public double valorLanche () {
        double lanche = 0;
        for( Ingrediente item : this.ingredientes ){
            lanche += item.getValorCompra() * ( 1 + this.margem ) ;
        }

        return lanche;
    }
    public Lanche AddIngredientes(Ingrediente ingredientes, String mercado) {
        this.ingredientes.add(ingredientes);
        return this;
    }

    @Override
    public String toString() {
        return "Lanche{" +
                "nome='" + nome + '\'' +
                ", margem=" + margem +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
