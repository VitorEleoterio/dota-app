package br.com.eleoterio.dota2heroacademy

import br.com.eleoterio.dota2heroacademy.Heros.AgilityHeros.AgilityHeros
import br.com.eleoterio.dota2heroacademy.Heros.InteligenceHeros.InteligenceHeros
import br.com.eleoterio.dota2heroacademy.Heros.StrengthHeros.StrengthHeros

open class Hero(
    val nome: String,
    val level: Int,
    val agility: Float,
    val atackSpeed: Float,
    val armor: Float,
    val inteligence: Float,
    val manaRegeneration: Float,
    val maxMana: Float,
    val strength: Float,
    val hpRegeneration: Float,
    val maxHP: Float
) {


    open fun agility(): Float {

        return agility + 1 * level

    }


   open fun strength(): Float {

            return strength + 1 * level

    }


    open fun inteligence(): Float {

        return inteligence + 1 * level
    }

}