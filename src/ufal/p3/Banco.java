package ufal.p3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by myron on 31/07/2017.
 */
public class Banco {
    List<Empregado> empregados = new ArrayList<Empregado>();

    public void addEmpregado(Empregado e){
        if(!e.equals(null)){
            empregados.add(e);
        } else{
            System.out.println("Empregado Nulo!");
        }

    }
    public void removeEmpregado(int id){
        Empregado e = empregados.get(id);
        System.out.println("Removendo empregado: " + e.getNome());
        empregados.remove(e);
    }

    public void modificaEmpregado(int id){
        Empregado e = empregados.get(id);
        empregados.set(id, e);
    }
}
