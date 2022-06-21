/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.srrs;

/**
 *
 * @author TFilho
 */
public class AnimalComplaint extends Complaint
{
    private String nomeAnimal, qtdeAnimal, diaIncomodo, mesIncomodo, anoIncomodo,
            ruaOcorrencia, compOcorrencia, bairroOcorrencia, cidadeOcorrencia, 
            ufOcorrencia, cepOcorrencia, telefoneOcorrencia;
    
    public void setBairroSolicitante(String bairroSolicitante) {
        this.bairroSolicitante = bairroSolicitante;
    }
}
