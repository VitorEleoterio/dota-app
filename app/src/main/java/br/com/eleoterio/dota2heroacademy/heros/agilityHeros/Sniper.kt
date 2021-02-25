package br.com.eleoterio.dota2heroacademy.heros.agilityHeros

import br.com.eleoterio.dota2heroacademy.heros.atributes.PrimaryAtribute
import br.com.eleoterio.dota2heroacademy.heros.Hero

class Sniper(
    level: Int = 1
): Hero(
    nome = "Anti Mage",
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
    integigencePerLevel = 1f,
    multStrength = 3f,
    multAgility = 3f,
    multInteligence = 3f

) {
}