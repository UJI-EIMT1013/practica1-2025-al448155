package practica1.src.practica1;

import java.util.*;

public class Practica1 {

    //EJERCICIO 1
    public static Set<Integer> multiplos (Iterator<Integer> it) {
        List<Integer> lista = new ArrayList<>();
        Set<Integer> resultado = new HashSet<>();
        while (it.hasNext()){ lista.add(it.next()); }
        for (int i = 0; i < lista.size(); i++) {
            int a = lista.get(i);
            if (a == 0) continue;
            for (int j = 0; j < lista.size(); j++) {
                int b = lista.get(j);
                if (b == 0 || i == j) continue;
                if (a % b == 0) {
                    resultado.add(a);
                    break;
                }
            }
        }

        return resultado;
    }

    //EJERCICIO2
    public static void separate (Set<Integer> cuadrados, Set<Integer> noCuadrados)  {
        List<Integer> lista = new ArrayList<>();
        for (int n : cuadrados) { lista.add(n); }
        for (int n : noCuadrados) { lista.add(n); }
        int max = 0;
        int min = 0;
        for (int i = 0; i < lista.size(); i++){
            if (lista[i] > max )
        }
    }

    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        //TODO
        return null;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        //TODO
        return null;
    }



}
