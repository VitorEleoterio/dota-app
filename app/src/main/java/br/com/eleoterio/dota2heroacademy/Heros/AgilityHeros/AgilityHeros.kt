package br.com.eleoterio.dota2heroacademy.Heros.AgilityHeros

import br.com.eleoterio.dota2heroacademy.Hero

class AgilityHeros(
     nome: String,
     level: Int,
     agility: Float,
     atackSpeed: Float,
     armor: Float,
     inteligence: Float,
     manaRegeneration: Float,
     maxMana: Float,
     strength: Float,
     hpRegeneration: Float,
     maxHP: Float
): Hero(nome, level, agility, atackSpeed, armor, inteligence, manaRegeneration, maxMana, strength, hpRegeneration, maxHP ) {


     override fun agility(): Float {

          return inteligence + 3 * level
     }


}