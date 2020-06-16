/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkglory.equipamentos.colar;

import darkglory.equipamentos.Equipamento;

/**
 *
 * @author victo
 */
public class ColarDeRubi extends Equipamento {

    public ColarDeRubi() {
        super(1, "Colar De Rubi", 0, 5, 0, "Fogo", "Envolve a arma do atacante com uma aura de fogo, assim aumentando seu dano.");
    }

    public ColarDeRubi(int id, String nome, int vida, int dano, int defesa, String tipo, String descricao) {
        super(id, nome, vida, dano, defesa, tipo, descricao);
    }
}