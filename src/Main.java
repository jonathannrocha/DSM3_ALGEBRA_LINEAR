
import domain.SolicitarInfos;
import domain.entities.Ingrediente;
import domain.entities.Lanche;
import domain.entities.Mercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Lanche> lanches = new ArrayList<>();
        List<Ingrediente> ingredientes = new ArrayList<>();
        List<Mercado> mercados = new ArrayList<>();

        SolicitarInfos solicitarInfos = new SolicitarInfos();

        boolean rodar = true;


        while (rodar) {
            System.out.println("Lanchonete Velozes e saborosos:");
            System.out.println("1 - Criar lanche");
            System.out.println("2 - Adicionar Mercado");
            System.out.println("3 - Adicionar ingrediente");
            System.out.println("4 - Ver custo do lanche");
            System.out.println("5 - Ver valor de venda do lanche");
            System.out.println("6 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao ) {
                case 1:
                   lanches.add(solicitarInfos.CriarLanche());
                   break;
                case 2:
                        mercados.add(solicitarInfos.CriarMercado());
                    break;
                case 3:
                    if(!lanches.isEmpty() && !mercados.isEmpty()) {
                        ingredientes.add(solicitarInfos.CriarIngrediente( lanches,mercados ));
                    } else {
                        System.out.println("Adicione um lanche antes");
                    }
                    break;
                case 4:
                    if(!lanches.isEmpty()) {
                        solicitarInfos.ValorLanches(lanches, ingredientes, mercados);
                    } else {
                        System.out.println("Adicione um lanche antes");
                    }
                    break;
                case 5:
                    if(!lanches.isEmpty()) {
                        solicitarInfos.ValorVenda(lanches, ingredientes, mercados);
                    } else {
                        System.out.println("Adicione um lanche antes");
                    }
                    break;
                case 6:
                    rodar = false;

            }
        }
    }
}