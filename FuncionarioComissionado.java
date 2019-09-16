/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class FuncionarioComissionado extends Funcionario {
    private int totalVendas;
    private double taxaComissao;

    public FuncionarioComissionado(String nome, String cpf, int totalVendas, double taxaComissao) {
        super(nome, cpf);
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }
    
    public double calcularSalario(){
        return getTotalVendas()*getTaxaComissao();
    }
}
