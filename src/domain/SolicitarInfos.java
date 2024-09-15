package domain;
import domain.entities.Ingrediente;
import domain.entities.Lanche;
import domain.entities.Mercado;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class SolicitarInfos {

    Scanner scanner = new Scanner(System.in);

    public SolicitarInfos(){}

    public Lanche CriarLanche() {
        System.out.println(" Qual o nome do lanche?");
        String nome = scanner.next();

        System.out.println(" Qual a margem do lanche (0.00)?");
        Double margen = scanner.nextDouble();

        return new Lanche(nome, margen);
    }

    public Mercado CriarMercado() {
        System.out.println("Qual é o nome do mercado?");
        String nome =scanner.next();

        return new Mercado(nome);
    }

    public Ingrediente CriarIngrediente(List<Lanche> lanches, List<Mercado> mercados) {
        String nomeMercado = "";
        System.out.println("Qual é ingrediente?");
        String nome = scanner.next();

        System.out.println("Qual é o mercado?");
        int numerador = 1;
        for( Mercado i : mercados ) {
            System.out.println(numerador + " - " + i.getMercado());
            numerador++;
        }
        boolean escolhaMercado = true;
        int mercadoEscolhido = scanner.nextInt() -1;

        while( escolhaMercado ) {
            if( mercadoEscolhido >= 0 && mercadoEscolhido <= mercados.size()) {
                escolhaMercado = false;
              nomeMercado  = mercados.get(mercadoEscolhido).getMercado();
            } else {
                System.out.println("De que mercado é?");
                numerador = 1;
                for( Mercado i : mercados ) {
                    System.out.println(numerador + " - " + i.getMercado());
                    numerador++;
                }
                mercadoEscolhido = scanner.nextInt() -1;
            }

        }

        //ate

        System.out.println("Quanto custo (0.00)?");
        Double valorCompra = scanner.nextDouble();

        System.out.println("De que lanche é?");
        numerador = 1;
        for( Lanche i : lanches ) {
            System.out.println(numerador + " - " + i.getNome());
            numerador++;
        }
        boolean escolha = true;
        int lancheEscolhido = scanner.nextInt()-1;

        while( escolha ) {
            if( lancheEscolhido >= 0 && lancheEscolhido <= lanches.size()) {
                escolha = false;
            } else {
                System.out.println("De que lanche é?");
                numerador = 1;
                for( Lanche i : lanches ) {
                    System.out.println(numerador + " - " + i.getNome());
                    numerador++;
                }
                lancheEscolhido = scanner.nextInt() -1;
            }

        }
        return new Ingrediente(nome, nomeMercado ,valorCompra, lancheEscolhido );
    }

    public void ValorLanches(List<Lanche> lanches, List<Ingrediente> ingredientes, List<Mercado> mercados) {
        Lanche lancheAtual;
        for(int lan = 0; lan < lanches.size(); lan++) {
            lancheAtual = lanches.get(lan);
            for (Mercado mer : mercados) {
                double valor = 0;
                for (Ingrediente ing : ingredientes) {
                    if (
                            Objects.equals(ing.getLanche(),  lan) &&
                            Objects.equals(mer.getMercado(), ing.getMercadoCompra())
                    ) {
                        valor += ing.getValorCompra();
                    }
                }
                System.out.println("Lanche: "+ lancheAtual.getNome() + ", mercado: " + mer.getMercado() + ",valor: " + valor);


            }
        }
    }

    public void ValorVenda(List<Lanche> lanches, List<Ingrediente> ingredientes, List<Mercado> mercados) {
        Lanche lancheAtual;
        for(int lan = 0; lan < lanches.size(); lan++) {
            lancheAtual = lanches.get(lan);
            for (Mercado mer : mercados) {
                double valor = 0;
                for (Ingrediente ing : ingredientes) {
                    if (
                            Objects.equals(ing.getLanche(),  lan) &&
                                    Objects.equals(mer.getMercado(), ing.getMercadoCompra())
                    ) {
                        valor += ing.getValorCompra() * (1 + lancheAtual.getMargem());
                    }
                }
                System.out.println("Lanche: "+ lancheAtual.getNome() + ", mercado: " + mer.getMercado() + ",valor: " + valor);


            }
        }
    }
}
