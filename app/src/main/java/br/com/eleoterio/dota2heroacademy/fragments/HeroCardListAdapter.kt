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

            val imageIcon = when(hero.primaryAtribute){
                PrimaryAtribute.Strength -> R.drawable.axe_icon
                PrimaryAtribute.Inteligence -> R.drawable.ancient_apparition_icon
                PrimaryAtribute.Agility -> R.drawable.medusa_icon
            }

            val circleImage = when(hero.primaryAtribute){
                PrimaryAtribute.Strength -> ContextCompat.getColor(context, R.color.strengthColor)
                PrimaryAtribute.Inteligence -> ContextCompat.getColor(context, R.color.inteligenceColor)
                PrimaryAtribute.Agility -> ContextCompat.getColor(context, R.color.agilityColor)
            }

            val logoBackground = itemView.findViewById<ImageView>(R.id.circle_image)
            ImageViewCompat.setImageTintList(logoBackground, ColorStateList.valueOf(circleImage))
            itemView.findViewById<ImageView>(R.id.hero_image).setImageResource(imageIcon)
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


