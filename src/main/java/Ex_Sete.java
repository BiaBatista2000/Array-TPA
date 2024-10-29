/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Beatriz Batista
 */
public class Ex_Sete {
     public static void main(String[] args) {
        String[] times = new String[20];
        int[] jogos = new int[20];
        int[] vitorias = new int[20];
        int[] empates = new int[20];
        int[] derrotas = new int[20];
        int[] golsPro = new int[20];
        int[] golsContra = new int[20];

        times[0] = "Botafogo"; jogos[0] = 30; vitorias[0] = 18; empates[0] = 7; derrotas[0] = 5; golsPro[0] = 48; golsContra[0] = 26;
        times[1] = "Palmeiras"; jogos[1] = 30; vitorias[1] = 18; empates[1] = 6; derrotas[1] = 6; golsPro[1] = 51; golsContra[1] = 23;
        times[2] = "Fortaleza"; jogos[2] = 30; vitorias[2] = 16; empates[2] = 8; derrotas[2] = 6; golsPro[2] = 39; golsContra[2] = 30;
        times[3] = "Flamengo"; jogos[3] = 29; vitorias[3] = 15; empates[3] = 6; derrotas[3] = 8; golsPro[3] = 45; golsContra[3] = 34;
        
        System.out.println("Tabela de Classificação:");
        System.out.println("Time       | Jogos | V | E | D | GP | GC | SG | AP");
        
        for (int i = 0; i < 20; i++) {
            if (times[i] != null) {
                int saldoGols = golsPro[i] - golsContra[i];
                double aproveitamento = (vitorias[i] * 3 + empates[i]) / (double)(jogos[i] * 3) * 100;
                System.out.println(times[i] + " | " + jogos[i] + " | " + vitorias[i] + " | " + empates[i] + " | " + derrotas[i] + " | " + golsPro[i] + " | " + golsContra[i] + " | " + saldoGols + " | " + String.format("%.2f", aproveitamento));
            }
        }
    }
}
