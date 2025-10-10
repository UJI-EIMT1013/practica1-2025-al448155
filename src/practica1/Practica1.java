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
        List<Integer> todos = new ArrayList<>();
        todos.addAll(cuadrados);
        todos.addAll(noCuadrados);

        int cantidadDeUnos = 0;
        for (int n : todos) {
            if (n == 1) cantidadDeUnos++;
        }
        System.out.println(cantidadDeUnos);
        cuadrados.clear();
        noCuadrados.clear();

        for (int n : todos) {
            boolean esCuadrado = false;
            if (n == 1) {
                if (cantidadDeUnos > 1) {
                    if (!cuadrados.contains(n)) esCuadrado = true;
                }
            } else {
                for (int m : todos) {
                    if (n != m && m * m == n) {
                        esCuadrado = true;
                        break;
                    }
                }
            }

            if (esCuadrado)
                cuadrados.add(n);
            else
                if (!cuadrados.contains(n))
                    noCuadrados.add(n);
        }
    }


    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        List<T> elementos = new ArrayList<>();
        while (it.hasNext()) {
            elementos.add(it.next());
        }

        List<Set<T>> resultado = new ArrayList<>();

        for (T elem : elementos) {
            boolean colocado = false;

            for (Set<T> conjunto : resultado) {
                if (!conjunto.contains(elem)) {
                    conjunto.add(elem);
                    colocado = true;
                    break;
                }
            }
            if (!colocado) {
                Set<T> nuevo = new HashSet<>();
                nuevo.add(elem);
                resultado.add(nuevo);
            }
        }

        return resultado;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        ArrayList<Set<T>> resultado = new ArrayList<>();
        for (int i = 0; i < col.size(); i++) {
            for (int j = i + 1; j < col.size(); j++) {
                Set<T> union = new LinkedHashSet<>(col.get(i));
                union.addAll(col.get(j));
                if (union.equals(u)) {
                    Set<T> s1 = new LinkedHashSet<>(col.get(i));
                    Set<T> s2 = new LinkedHashSet<>(col.get(j));
                    resultado.add(s1);
                    resultado.add(s2);
                    return new ArrayList<>(resultado);
                }
            }
        }
        return new ArrayList<>();
    }
}
