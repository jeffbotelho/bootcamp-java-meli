package poo.javaii.pratica2.exercicio2;

import poo.javaii.pratica2.exercicio1.PraticaExcecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Distribuidora {

    public static void main(String[] args) {

        List<Produto> listaProdutos = new ArrayList();

        listaProdutos.addAll(Arrays.asList(
                new Produto("Avental", 19F),
                new Produto("Luvas", 9F),
                new Pereciveis("Peito de frango", 22F, 3),
                new Pereciveis("Cenoura", 3F, 2),
                new Pereciveis("Maçã", 6F, 1),
                new Pereciveis("Abóbora", 9F, 20),
                new NaoPereciveis("Arroz", 9F, "Sereal"),
                new NaoPereciveis("Macarrão", 4.5F, "Massas")
        ));

//        Produto produto0 = new Produto("Avental", 19F);
//        Produto produto1 = new Produto("Luvas", 9F);
//        Produto produto2 = new Pereciveis("Peito de frango", 22F, 3);
//        Pereciveis produto3 = new Pereciveis("Cenoura", 3F, 2);
//        Pereciveis produto4 = new Pereciveis("Maçã", 6F, 1);
//        Pereciveis produto5 = new Pereciveis("Abóbora", 9F, 20);
//        Produto produto6 = new NaoPereciveis("Arroz", 9F, "Sereal");
//        NaoPereciveis produto7 = new NaoPereciveis("Macarrão", 4.5F, "Massas");


//        produto0.calcular(5);
//        produto1.calcular(5);
//        produto2.calcular(5);
//        produto3.calcular(5);
//        produto4.calcular(5);
//        produto5.calcular(5);
//        produto6.calcular(5);
//        produto7.calcular(5);

//        listaProdutos.add(produto0);
//        listaProdutos.add(produto1);
//        listaProdutos.add(produto2);
//        listaProdutos.add(produto3);
//        listaProdutos.add(produto4);
//        listaProdutos.add(produto5);
//        listaProdutos.add(produto6);
//        listaProdutos.add(produto7);

        for (Produto p : listaProdutos ) {
            p.calcular(5);
            System.out.println(p);
        }

//        for (int i = 0; i < listaProdutos.size(); i++) {
//            System.out.println(listaProdutos.get(i));
//        }

    }
}


