
import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Agenda {
    private ArrayList<Pessoa> amarelao;

    public Agenda() {
        amarelao = new ArrayList<Pessoa>();
    }
    
    public void adicionarContato(Pessoa p){
        amarelao.add(p);
    }
    
    public void removerContato(String doc){
        boolean hasFound = false;
        for(Pessoa p: amarelao){
            if(p.getDoc().equals(doc)){
                hasFound = true;
                amarelao.remove(p);
            }
        }
        if(!hasFound){
            System.out.println("Documento não encontrado!");
        }else{
            System.out.println("Removido!");
        }
    }
    
    public void imprimeAgenda(){
       for(Pessoa p: amarelao){
           System.out.println(p);
           System.out.println("");
       }
    }
    
}
