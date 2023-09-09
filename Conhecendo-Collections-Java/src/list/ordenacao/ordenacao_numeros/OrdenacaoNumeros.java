package list.ordenacao.ordenacao_numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros(){
        numeros = new ArrayList<>();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        verificaLista(numeros);
        Collections.sort(numeros);
        return numeros;
    }

    public List<Integer> ordenarDescendente(){
        verificaLista(numeros);
        Collections.sort(numeros, Collections.reverseOrder());
        return numeros;
    }

    public void exibirNumeros(){
        verificaLista(numeros);
        System.out.println(numeros);
    }

    public void verificaLista(List<Integer> lista){
        if(lista.isEmpty()){
            throw new RuntimeException("Lista vazia!");
        }
    }
}
