/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe2;

/**
 *
 * @author DLT1CA
 */
public class Merge{
    public void mergeAsc(int numbers[], int inicio, int fim){
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeAsc(numbers, inicio, meio);
            mergeAsc(numbers, meio + 1, fim);
            intercalaAsc(numbers, inicio, fim, meio);
        }
    }
    public int[] intercalaAsc(int numbers[], int inicio, int fim, int meio) {
        int inicioVet1 = inicio, inicioVet2 = meio + 1, i;
        int aux[] = new int[numbers.length];
        int indiceVetorAux = inicio;

        while (inicioVet1 <= meio && inicioVet2 <= fim) {
            if (numbers[inicioVet1] <= numbers[inicioVet2]) {
                aux[indiceVetorAux] = numbers[inicioVet1];
                inicioVet1++;
            } else {
                aux[indiceVetorAux] = numbers[inicioVet2];
                inicioVet2++;
            }
            indiceVetorAux++;
        }

        for (i = inicioVet1; i <= meio; i++) {
            aux[indiceVetorAux] = numbers[i];
            indiceVetorAux++;
        }

        for (i = inicioVet2; i <= fim; i++) {
            aux[indiceVetorAux] = numbers[i];
            indiceVetorAux++;
        }
        
        for (i = inicio; i <= fim; i++) {
            numbers[i] = aux[i];
        }

        return aux;
    }
}
