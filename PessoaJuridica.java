/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class PessoaJuridica extends Pessoa {
    private String cpnj;
    private int inscEst;

    public PessoaJuridica(String cpnj, int inscEst, String nome, String endereco, String email) {
        super(nome, endereco, email);
        this.cpnj = cpnj;
        this.inscEst = inscEst;
    }

    public String getCpnj() {
        return cpnj;
    }

    public int getInscEst() {
        return inscEst;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCNPJ: " + getCpnj() + "\nInscrição Estadual: " + getInscEst();
    }

    @Override
    public String getDoc() {
        return cpnj;
    }
}
