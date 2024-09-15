package domain.entities;

public class Mercado {
    private String mercado;

    public Mercado(String mercado) {
        this.mercado = mercado;
    }

    public String getMercado() {
        return mercado;
    }

    public Mercado setMercado(String mercado) {
        this.mercado = mercado;
        return this;
    }
}
