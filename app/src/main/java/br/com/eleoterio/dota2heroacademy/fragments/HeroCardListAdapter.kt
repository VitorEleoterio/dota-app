package br.com.eleoterio.dota2heroacademy.fragments

import android.content.res.ColorStateList
import android.media.Image
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.widget.ImageViewCompat
import androidx.recyclerview.widget.RecyclerView
import br.com.eleoterio.dota2heroacademy.R
import br.com.eleoterio.dota2heroacademy.heros.Hero
import br.com.eleoterio.dota2heroacademy.heros.atributes.PrimaryAtribute

class HeroCardListAdapter(
    private val heroList: List<Hero>
): RecyclerView.Adapter<HeroCardListAdapter.HeroCardViewHolder>() {

    class HeroCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(hero: Hero) {
            val context = itemView.context

            val drawable = when(hero.primaryAtribute) {
                PrimaryAtribute.Strength -> R.drawable.gradient_color_strength
                PrimaryAtribute.Inteligence -> R.drawable.gradient_color_inteligence
                PrimaryAtribute.Agility -> R.drawable.gradient_color_agility
            }

            itemView.findViewById<TextView>(R.id.hero_level).text = hero.level.toString()
            itemView.findViewById<TextView>(R.id.hero_inteligence_atribute).text = hero.baseInteligence.toString()
            itemView.findViewById<TextView>(R.id.hero_agility_atribute).text = hero.baseAgility.toString()
            itemView.findViewById<TextView>(R.id.hero_strength_atribute).text = hero.baseStrength.toString()
            itemView.findViewById<ImageView>(R.id.hero_image).setImageResource(hero.image)
            itemView.findViewById<ImageView>(R.id.background_hero).setImageResource(drawable)
           itemView.findViewById<TextView>(R.id.hero_title).text = hero.nome
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroCardViewHolder {
        val viewCriada = android.view.LayoutInflater.from(parent.context)
            .inflate(R.layout.item_hero, parent, false)
        return HeroCardViewHolder(viewCriada)
    }

    override fun onBindViewHolder(holder: HeroCardViewHolder, position: Int) {
        val hero = heroList.get(position)
        holder.bind(hero)
    }

    override fun getItemCount(): Int {
        return heroList.size
    }

    //levelSpinner.adapter = ArrayAdapter(this, R.layout)

}


