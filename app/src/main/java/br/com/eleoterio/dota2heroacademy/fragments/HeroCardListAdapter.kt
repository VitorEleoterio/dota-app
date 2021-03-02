package br.com.eleoterio.dota2heroacademy.fragments

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.eleoterio.dota2heroacademy.R
import br.com.eleoterio.dota2heroacademy.heros.Hero
import br.com.eleoterio.dota2heroacademy.heros.HeroList

class HeroCardListAdapter(
    private val heroList: List<Hero>
): RecyclerView.Adapter<HeroCardListAdapter.HeroCardViewHolder>() {

    class HeroCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(hero: Hero) {
           itemView.findViewById<TextView>(R.id.recleViewStrength).text = hero.nome
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroCardViewHolder {
        val viewCriada = android.view.LayoutInflater.from(parent.context)
            .inflate(R.layout.item_hero_strength, parent, false)
        return HeroCardViewHolder(viewCriada)
    }

    override fun onBindViewHolder(holder: HeroCardViewHolder, position: Int) {
        val hero = heroList.get(position)
        holder.bind(hero)

    }

    override fun getItemCount(): Int {
        return heroList.size
    }

}


