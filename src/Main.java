import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<>();
        List<String> meses = List.of("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho");

        Random random = new Random();

        //Recebendo as temperaturas de forma aleatória
        double minimo = 12.0;
        double maximo = 33.0;

        for (int i = 0; i < 6; i++) {
            double temperatura = minimo + (maximo - minimo) * random.nextDouble(); // entre 12.0 e 33.0
            temperatura = Math.round(temperatura * 100.0) / 100.0; // arredonda para 2 casas decimais
            temperaturas.add(temperatura);
        }

        System.out.println("Temperaturas obtidas:");
        double soma = 0;
        for (int i=0; i<temperaturas.size(); i++){
            System.out.println(meses.get(i) + ": " + temperaturas.get(i) + "°C");
            soma += temperaturas.get(i);
        }

        double media = soma/6;
        System.out.println("\nMédia de temperatura semestral: " + String.format("%.2f", media));

        System.out.println("\nTemperaturas a cima da média: ");
        for (int i=0; i<temperaturas.size(); i++) {
            if (temperaturas.get(i) > media) {
                System.out.println(meses.get(i) + ": " + String.format("%.2f", temperaturas.get(i)) + "°C");
            }
        }
    }
}