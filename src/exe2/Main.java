package exe2;

import java.util.Scanner;

/**
 *
 * @author DLT1CA
 */
public class Main {

    public static void main(String[] args) {
        int maior;
        int menor;
        int qtdMaior = 0;
        int qtdMenor = 0;
        int numbers[] = new int[10];
        Merge merge = new Merge();

        

        numbers = lerNumeros(numbers);
        merge.mergeAsc(numbers, 0, numbers.length - 1);
        
        maior = numbers[0];
        menor = numbers[0];
        System.out.println(System.getProperty("line.separator"));
        System.out.println("Números ordendados");
        apresentarNumeros(numbers);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < menor) {
                menor = numbers[i];
            }
            if (numbers[i] > maior) {
                maior = numbers[i];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (maior == numbers[i]) {
                qtdMaior++;
            }
            if (menor == numbers[i]) {
                qtdMenor++;
            }

        }

        System.out.println(System.getProperty("line.separator"));
        System.out.println("A - Menor número: " + menor + ", repetições: " + qtdMenor);
        System.out.println("B - Maior número: " + maior + ", repetições: " + qtdMaior);
    }

    public static void apresentarNumeros(int[] numbers) {
        for (Integer i : numbers) {
            System.out.println(i);
        }
    }

    public static int[] lerNumeros(int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i + 1) + " º número");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
}
