package br.com.eleoterio.dota2heroacademy.fragments

import androidx.fragment.app.*
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.com.eleoterio.dota2heroacademy.R


class HeroListFragmentAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> StrengthHeroListFragment()
            1 -> AgilityHeroListFragment()
            else -> InteligenceHeroListFragment()
        }
    }
}



