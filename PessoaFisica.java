/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class PessoaFisica extends Pessoa{
    private String cpf;
    private String estCivil;

    public PessoaFisica(String cpf, String estCivil, String nome, String endereco, String email) {
        super(nome, endereco, email);
        this.cpf = cpf;
        this.estCivil = estCivil;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEstCivil() {
        return estCivil;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCPF: " + getCpf() + "\nEstado Civil: " + getEstCivil();
    }

    @Override
    public String getDoc() {
        return cpf;
    }
}
