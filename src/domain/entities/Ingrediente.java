package domain.entities;

public class Ingrediente {
    private String nome;
    private String mercadoCompra;
    private double valorCompra;

    public Ingrediente(String nome, String mercadoCompra, double valorCompra) {
        this.nome = nome;
        this.mercadoCompra = mercadoCompra;
        this.valorCompra = valorCompra;
    }

    public String getNome() {
        return nome;
    }

    public Ingrediente setNome(String nome) {
        this.nome = nome;
        return this;
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

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nome='" + nome + '\'' +
                ", mercadoCompra='" + mercadoCompra + '\'' +
                ", valorCompra=" + valorCompra +
                '}';
    }
}
