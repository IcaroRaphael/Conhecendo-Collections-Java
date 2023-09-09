package list.pesquisa.soma_numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        numeros = new ArrayList<>();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public Integer calcularSoma(){
        verificaLista(numeros);
        Integer soma = 0;
        for(Integer i : numeros){
            soma += i;
        }
        return soma;
    }

    public Integer encontrarMaiorNumero(){
        verificaLista(numeros);
        Integer maior = 0;
        for(int i = 0; i < numeros.size(); i++){
            if(i == 0){
                maior = numeros.get(i);
            } else{
                if(numeros.get(i) > maior){
                    maior = numeros.get(i);
                }
            }
        }
        return maior;
    }

    public Integer encontrarMenorNumero(){
        verificaLista(numeros);
        Integer menor = 0;
        for(int i = 0; i < numeros.size(); i++){
            if(i == 0){
                menor = numeros.get(i);
            } else{
                if(numeros.get(i) < menor){
                    menor = numeros.get(i);
                }
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        verificaLista(numeros);
        for(Integer i : numeros){
            System.out.println(i);
        }
    }

    public static void verificaLista(List<Integer> numeros){
        if(numeros.isEmpty()){
            throw new RuntimeException("Lista vazia!");
        }
    }
}
