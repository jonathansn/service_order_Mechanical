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
public class Cliente extends Pessoa {
    
    private int id_cliente;
    private String data_cliente;

    public Cliente(String nome, String cpf, String data_nascimento) {
        super(nome, cpf, data_nascimento);
        this.id_cliente = id_cliente;
        this.data_cliente = data_cliente;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the data_cliente
     */
    public String getData_cliente() {
        return data_cliente;
    }

    /**
     * @param data_cliente the data_cliente to set
     */
    public void setData_cliente(String data_cliente) {
        this.data_cliente = data_cliente;
    }
    
}