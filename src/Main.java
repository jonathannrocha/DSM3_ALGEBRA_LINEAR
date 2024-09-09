import domain.entities.Ingrediente;
import domain.entities.Lanche;
import domain.entities.RelacaoPrecos;

public class Main {
    public static void main(String[] args) {

        Lanche l1 = new Lanche("Jubileu", 0);
        Lanche l2 = new Lanche("Jubileu2", 0);

        Ingrediente ing1 = new Ingrediente("tomate", "mercado1", 12.2);
        Ingrediente ing2 = new Ingrediente("tomate", "mercado2", 13.2);
        Ingrediente ing3 = new Ingrediente("carne", "mercado1", 12.2);
        Ingrediente ing4 = new Ingrediente("carne", "mercado2", 12.2);
        Ingrediente ing5 = new Ingrediente("cebola", "mercado1", 12.2);
        Ingrediente ing6 = new Ingrediente("cebola", "mercado2", 12.2);
        Ingrediente ing7 = new Ingrediente("pão", "mercado1", 2.2);
        Ingrediente ing8 = new Ingrediente("pão", "mercado2", 2);

        RelacaoPrecos relacaoPrecos = new RelacaoPrecos();
        relacaoPrecos.addItem(ing2);
        relacaoPrecos.addItem(ing3);
        relacaoPrecos.addItem(ing1);
        relacaoPrecos.addItem(ing4);
        relacaoPrecos.addItem(ing5);
        relacaoPrecos.addItem(ing6);
        relacaoPrecos.addItem(ing7);
        relacaoPrecos.addItem(ing8);

        l1.setIngredientes(relacaoPrecos.getRelacaoMercado("mercado2"));
        l2.setIngredientes(relacaoPrecos.getRelacaoMercado("mercado1"));


        System.out.printf("total:"+ l1.valorLanche() + "\n");
        System.out.printf("total:"+ l2.valorLanche()+ "\n");

        l1.setMargem(0.5);

        System.out.printf("total:"+ l1.valorLanche()+ "\n");

        l1.setMargem(1);

        System.out.printf("total:"+ l1.valorLanche()+ "\n");
    }
}