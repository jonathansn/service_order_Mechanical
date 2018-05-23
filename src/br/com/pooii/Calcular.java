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
public class Calcular {
    
    public float valorTotal(float peca, float servico, float desconto){        
        
        float valorTotal = (peca + servico)- desconto;
        
        return valorTotal;
    }
    
}
