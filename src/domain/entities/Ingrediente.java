package domain.entities;

public class Ingrediente {
    private String nome;
    private String mercadoCompra;
    private double valorCompra;
    private final Integer lanche;

    public Ingrediente(String nome, String mercadoCompra, double valorCompra, Integer lanche) {
        this.nome = nome;
        this.mercadoCompra = mercadoCompra;
        this.valorCompra = valorCompra;
        this.lanche = lanche;
    }

    public String getNome() {
        return nome;
    }

    public String getMercadoCompra() {
        return mercadoCompra;
    }

    public Ingrediente setMercadoCompra(String mercadoCompra) {
        this.mercadoCompra = mercadoCompra;
        return this;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public Ingrediente setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
        return this;
    }

    public Integer getLanche() {
        return lanche;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nome='" + nome + '\'' +
                ", mercadoCompra='" + mercadoCompra + '\'' +
                ", valorCompra=" + valorCompra +
                '}';
    }
}
