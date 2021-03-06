package br.com.eleoterio.dota2heroacademy.heros

import br.com.eleoterio.dota2heroacademy.R
import br.com.eleoterio.dota2heroacademy.heros.atributes.PrimaryAtribute
import br.com.eleoterio.dota2heroacademy.heros.atributes.PrimaryAtribute.*

abstract class Hero(
    val nome: String,
    var level: Int,
    val baseAgility: Float,
    val atackSpeed: Float,
    val baseArmor: Float,
    val baseInteligence: Float,
    val baseManaRegeneration: Float,
    val baseMaxMana: Float,
    val baseStrength: Float,
    val hpRegeneration: Float,
    val baseMaxHP: Float,
    val baseAtackDamage: Float,
    val primaryAtribute: PrimaryAtribute = PrimaryAtribute.Agility,
    val agilityPerLevel: Float,
    val strengthPerLevel: Float,
    val intelligencePerLevel: Float,
    val image: Int = R.drawable.anti_mage_icon
) {





    open fun atackDamage(): Float {




        return when (primaryAtribute){
            Strength -> baseAtackDamage + strength()
            PrimaryAtribute.Inteligence -> baseAtackDamage + inteligence()
            PrimaryAtribute.Agility -> baseAtackDamage + agility()
        }

    }






    open fun agility(): Float {

        return baseAgility + agilityPerLevel * level

    }


    open fun strength(): Float {

        return baseStrength + strengthPerLevel * level

    }

    open fun inteligence(): Float {

        return baseInteligence + intelligencePerLevel * level

    }


    open fun atackSpeed(): Float {

        return atackSpeed + 1 * agility()
    }

    open fun armor(): Float {

        return baseArmor + 0.17f * agility()
    }

    open fun manaRegeneration(): Float {

        return baseManaRegeneration + 0.05f * inteligence()
    }

    open fun maxMana(): Float {

        return baseMaxMana + 12 * inteligence()
    }

    open fun hpRegeneration(): Float {

        return hpRegeneration + 0.1f * strength()
    }

    open fun maxHP(): Float {

        return baseMaxHP + 20 * strength()
    }
}





