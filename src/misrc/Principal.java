package misrc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {
        
        ejemplo1();
        
    }
    
    //Crear una coleccion treeset y agregar elementos
    /*
    Con el TreeSet consigues filtrar los valores que se repite ya que solo saca los que son unicos.
    Tambien se puede utilizar en aplicaciones para identificar y eliminar los archivos duplicados.
    Para recorrer un TreeSet por indice lo tenemos que convertir en ArrayList. Un TreeSet se puede 
    recorrer solo por elemento.
    */
    public static void ejemplo1(){
        Set<Integer> enteros_ts = new TreeSet<>();
        enteros_ts.add(2);
        enteros_ts.add(3);
        enteros_ts.add(2);
        enteros_ts.add(1);
        enteros_ts.add(7);
        enteros_ts.add(3);
        enteros_ts.add(6);
        enteros_ts.add(5);
        enteros_ts.add(4);
        
        
        for(Integer elemento: enteros_ts){
            System.out.print(elemento + " ");
        }
        
        for(int i=0; i<enteros_ts.size(); i++){
            //System.out.print(enteros_al.get(i)); No se puede recorrer por indice
        }
        //Convertir un treeset a arraylist
        List<Integer> enteros_al = new ArrayList<>(enteros_ts);
        
        //Recorrer por elemento el arraylist
        for(Integer elemento:enteros_al){
            System.out.print(elemento + " ");
        }
        
        //Recorrer por indice el arraylist
        for(int i=0; i<enteros_al.size(); i++){
            System.out.print(enteros_al.get(i) + " "); 
        }
    } 
    
}
