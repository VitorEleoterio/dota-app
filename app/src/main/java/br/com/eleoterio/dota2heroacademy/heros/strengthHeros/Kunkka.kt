package br.com.eleoterio.dota2heroacademy.heros.strengthHeros

import br.com.eleoterio.dota2heroacademy.R
import br.com.eleoterio.dota2heroacademy.heros.atributes.PrimaryAtribute
import br.com.eleoterio.dota2heroacademy.heros.Hero

class Kunkka(

    level: Int = 1
): Hero(
    image = R.drawable.kunkka_icon,
    nome = "Kunkka",
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
    primaryAtribute = PrimaryAtribute.Strength,
    agilityPerLevel = 2.8f,
    strengthPerLevel = 1f,
    integigencePerLevel = 2f,
    multStrength = 3f,
    multAgility = 2f,
    multInteligence = 3f
) {
}