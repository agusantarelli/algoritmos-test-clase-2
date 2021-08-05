package com.redbeeacademy.algoritmostest.Lista;
/*
Realizar los siguientes métodos:
1) Guarde un numero en una lista
2) Intercambie el elemento de la posicion 2 por la posicion 4.
3) Un metodo recibe una lista de numeros y un numero, la funcion debe agregar el numero al inicio de la lista
4) Calcular el promedio de los elementos de una lista
5) Eliminar la posicion donde se encuentre el valor maximo de la lista
6) Dadas dos listas, crear una nueva con los elementos que se repitan en ambas
 */
import java.lang.Integer;
import java.util.*;
import java.lang.Double;

public class Lista {

    public static List<Integer> guardarEnLista(Integer numero){
        List<Integer> number = new ArrayList<Integer>();
        if(numero == null){
            number.add(0);
        }else{
            number.add(numero);
        }
        return number;
    }

    public static List<Integer> intercambiar(List<Integer> lista){
        List<Integer> copy = new ArrayList<>();
        for(int i = 0;i<lista.size();i++){
            if(lista.get(i) != null){
                copy.add(lista.get(i));
            }
        }
        Integer numAux = copy.get(2);
        copy.set(2,copy.get(4));
        copy.set(4,numAux);
        return copy;
    }

    public static List<Integer> agregarElementoAlInicio(List<Integer> lista, Integer numero){
        List<Integer> copy = new ArrayList<>();
        for(int i = 0;i<lista.size();i++){
            if(lista.get(i) != null){
                copy.add(lista.get(i));
            }
        }
        copy.add(0,numero);
        return copy;
    }

    public static Double promedioLista(List<Integer> lista){
        Double sum = 0.0;
        Double prom = 0.0;
        List<Integer> copy = new ArrayList<>(lista);
        copy.removeAll(Collections.singleton(null));
        for(int i = 0;i<copy.size();i++){
                sum += copy.get(i);
        }
        prom = sum/copy.size();
        return prom;
    }

    public static List<Integer> eliminarMaximo(List<Integer> lista){
        List<Integer> copy = new ArrayList<>(lista);
        copy.removeAll(Collections.singleton(null));
        Integer max = 0;
        Integer position = 0;
        for(int i = 0;i<copy.size();i++){
            if(copy.get(i) > max){
                max = copy.get(i);
            }
        }
        copy.remove(max);
        return copy;
    }

    public static List<Integer> repetidos(List<Integer> a, List<Integer> b){
        List<Integer> repeat = new ArrayList<>();
        if(a.size()<b.size()){
            for(int i = 0;i<a.size();i++){
                if(a.contains(b.get(i))){
                    repeat.add(b.get(i));
                }
            }
        }else{
            for(int i = 0;i<b.size();i++){
                if(b.contains(a.get(i))){
                    repeat.add(a.get(i));
                }
            }
        }
        return repeat;
    }

}
