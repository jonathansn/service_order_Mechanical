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
public class OrdemDeServico{
    
    private String nome_cliente;
    private String cpf;
    private String modelo;
    private String placa;
    private String funcionario;
    private String cargo;
    private String defeito;
    private String solucionado;
    private float valor_peca;
    private float valor_servico;
    private float valor_desconto;
    private float valor_total;

    /**
     * @return the nome_cliente
     */
    public String getNome_cliente() {
        return nome_cliente;
    }

    /**
     * @param nome_cliente the nome_cliente to set
     */
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the funcionario
     */
    public String getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
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
     * @return the defeito
     */
    public String getDefeito() {
        return defeito;
    }

    /**
     * @param defeito the defeito to set
     */
    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    /**
     * @return the solucionado
     */
    public String getSolucionado() {
        return solucionado;
    }

    /**
     * @param solucionado the solucionado to set
     */
    public void setSolucionado(String solucionado) {
        this.solucionado = solucionado;
    }

    /**
     * @return the valor_peca
     */
    public float getValor_peca() {
        return valor_peca;
    }

    /**
     * @param valor_peca the valor_peca to set
     */
    public void setValor_peca(float valor_peca) {
        this.valor_peca = valor_peca;
    }

    /**
     * @return the valor_servico
     */
    public float getValor_servico() {
        return valor_servico;
    }

    /**
     * @param valor_servico the valor_servico to set
     */
    public void setValor_servico(float valor_servico) {
        this.valor_servico = valor_servico;
    }

    /**
     * @return the valor_desconto
     */
    public float getValor_desconto() {
        return valor_desconto;
    }

    /**
     * @param valor_desconto the valor_desconto to set
     */
    public void setValor_desconto(float valor_desconto) {
        this.valor_desconto = valor_desconto;
    }

    /**
     * @return the valor_total
     */
    public float getValor_total() {
        return valor_total;
    }

    /**
     * @param valor_total the valor_total to set
     */
    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }
    
}
