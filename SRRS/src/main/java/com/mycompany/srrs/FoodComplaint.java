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
public class FoodComplaint extends Complaint
{
    private String nomeVitima, ruaVitima, compVitima, bairroVitima, cidadeVitima,
            ufVitima, cepVitima, telefoneVitima, qtdeComensais, qtdeDoentes,
            qtdeInternacoes, qtdeObitos, localAtendimento, refeicaoSuspeita;
    
    public void setNomeSolicitante(String nomeSolicitante)
    {
        this.nomeSolicitante = nomeSolicitante;
    }
}
