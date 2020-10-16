package br.com.eleoterio.dota2heroacademy.Heros.AgilityHeros

import br.com.eleoterio.dota2heroacademy.Heros.Hero

class Pangolier(
    level: Int
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
    agilityPerLevel = 2.8f

) {
}