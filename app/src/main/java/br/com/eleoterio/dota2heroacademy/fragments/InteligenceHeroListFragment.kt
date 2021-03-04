package br.com.eleoterio.dota2heroacademy.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.eleoterio.dota2heroacademy.R
import br.com.eleoterio.dota2heroacademy.heros.HeroList

class InteligenceHeroListFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.inteligence_hero_list_fragment, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val inteligenceHeroList  = HeroList().intelligenceHeros
        val strengthRecycleView = view.findViewById<RecyclerView>(R.id.recleViewInteligence)
        strengthRecycleView.layoutManager = LinearLayoutManager(context)
        strengthRecycleView.adapter = HeroCardListAdapter(inteligenceHeroList)
    }
}