/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class TesteAgenda {
    public static void main(String[] args) {
        Agenda a = new Agenda();
        
        Pessoa pf = new PessoaFisica("086.879.616-69", "Sozinho", "Luiz Soares", "Carandizossa", "luiz.soares@estudante.ufla.br");
        Pessoa pj = new PessoaJuridica("7714721769-0", 0, "LDPCorp", "dos bobos, 0", "contato@ldpc.tk");
        
        a.adicionarContato(pj);
        a.adicionarContato(pf);
        
        a.imprimeAgenda();
        
        a.removerContato("7714721769-0");
        
        a.imprimeAgenda();
    }
}
