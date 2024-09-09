package domain.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RelacaoPrecos {
    List<Ingrediente> relacao = new ArrayList<>();

    public RelacaoPrecos() {
    }

    public List<Ingrediente> getRelacao() {
        return relacao;
    }

    public List<Ingrediente> getRelacaoMercado(String mercado) {
        List<Ingrediente> relacaoMercado = new ArrayList<>();
        for ( Ingrediente i : this.relacao) {
            if(Objects.equals(i.getMercadoCompra(), mercado)) {
                relacaoMercado.add(i);
            }
        }
        return relacaoMercado;
    }

    public RelacaoPrecos addItem(Ingrediente item) {
        this.relacao.add(item);
        return this;
    }

    @Override
    public String toString() {
        return "Precos{" +
                "relacao=" + relacao +
                '}';
    }
}
