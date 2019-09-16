/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
import java.util.*;

public class Empresa {
    private String nome;
    private String cnpj;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<Funcionario>();
    }
    
    public void admitirFuncionario(Funcionario f){
        funcionarios.add(f);
    }
    
    public void gerarFolhaDePagamento() {
        for(Funcionario f: funcionarios) {
            System.out.println(f);
            System.out.printf("Salário = R$ %.2f\n\n", f.calcularSalario());
        }
    }
}
