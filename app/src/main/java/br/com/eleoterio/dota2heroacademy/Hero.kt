package br.com.eleoterio.dota2heroacademy

import br.com.eleoterio.dota2heroacademy.Heros.AgilityHeros.PrimaryAtribute

open class Hero(
    val nome: String,
    val level: Int,
    val baseAgility: Float,
    val atackSpeed: Float,
    val armor: Float,
    val baseInteligence: Float,
    val manaRegeneration: Float,
    val maxMana: Float,
    val baseStrength: Float,
    val hpRegeneration: Float,
    val maxHP: Float,
    val atackDamage: Float,
    val primaryAtribute: PrimaryAtribute = PrimaryAtribute.Agility,
    val agilityPerLevel: Float = 1.0f
) {







    open fun atackDamage(): Float {


        return when (primaryAtribute){
            PrimaryAtribute.Strength -> atackDamage + strength()
            PrimaryAtribute.Inteligence -> atackDamage + inteligence()
            PrimaryAtribute.Agility -> atackDamage + agility()
        }

    }



    open fun agility(): Float {

        return baseAgility + agilityPerLevel * level

    }


    open fun strength(): Float {

        return baseStrength + 1 * level

    }

    open fun inteligence(): Float {

        return baseInteligence + 1 * level

    }


    open fun atackSpeed(): Float {

        return atackSpeed + 1 * baseAgility
    }

    open fun armor(): Float {

        return armor + 1 * level   // 0.17 de armadura por pontos de agilidade
    }

    open fun manaRegeneration(): Float {

        return manaRegeneration + 1 * level  // 0.05 por segundo a cada ponto de Inteligencia
    }

    open fun maxMana(): Float {

        return maxMana + 1 * level   // 12 de mana por ponto de inteligencia
    }

    open fun hpRegeneration(): Float {

        return hpRegeneration + 1 * level  // 0.1 de regeneração de vida por segundo a
        // cada 1 ponto de força
    }

    open fun maxHP(): Float {

        return maxHP + 20 * level   // 20 de vida maxima a cada 1 ponto de força
    }
}