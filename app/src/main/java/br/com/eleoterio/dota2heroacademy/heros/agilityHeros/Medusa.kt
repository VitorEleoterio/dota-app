package br.com.eleoterio.dota2heroacademy.heros.agilityHeros

import br.com.eleoterio.dota2heroacademy.R
import br.com.eleoterio.dota2heroacademy.heros.atributes.PrimaryAtribute
import br.com.eleoterio.dota2heroacademy.heros.Hero

class Medusa(
    level: Int = 1
): Hero(
    image = R.drawable.medusa_icon,
    nome = "Medusa",
    level = level,
    baseAgility = 24f,
    atackSpeed = 100f,
    baseArmor = 3f,
    baseInteligence = 12f,
    baseManaRegeneration = 0.6f,
    baseMaxMana = 219f,
    baseStrength = 23f,
    hpRegeneration = 2.55f,
    baseMaxHP = 660f,
    baseAtackDamage = 29f,
    primaryAtribute = PrimaryAtribute.Agility,
    agilityPerLevel = 2.8f,
    strengthPerLevel = 10f,
    intelligencePerLevel = 1f

){
}