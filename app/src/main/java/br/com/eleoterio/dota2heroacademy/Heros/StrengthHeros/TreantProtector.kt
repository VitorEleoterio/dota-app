package br.com.eleoterio.dota2heroacademy.Heros.StrengthHeros

import br.com.eleoterio.dota2heroacademy.Heros.Hero

class TreantProtector(
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
    maxHP: Float, atackDamage: Float
): Hero(
    nome,
    level,
    agility,
    atackSpeed,
    armor,
    inteligence,
    manaRegeneration,
    maxMana,
    strength,
    hpRegeneration,
    maxHP,
    atackDamage
) {
}