/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pooii;

/**
 *
 * @author User
 */
public class Funcionario extends Pessoa{
    
    private String cargo;
    private String data_funcionario;

    public Funcionario(String nome, String cpf, String data_nascimento) {
        super(nome, cpf, data_nascimento);
        this.cargo = cargo;
        this.data_funcionario = data_funcionario;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the data_funcionario
     */
    public String getData_funcionario() {
        return data_funcionario;
    }

    /**
     * @param data_funcionario the data_funcionario to set
     */
    public void setData_funcionario(String data_funcionario) {
        this.data_funcionario = data_funcionario;
    }
    
}
