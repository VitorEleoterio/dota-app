package br.com.eleoterio.dota2heroacademy.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import br.com.eleoterio.dota2heroacademy.fragments.HeroListFragmentAdapter
import br.com.eleoterio.dota2heroacademy.R
import com.google.android.material.tabs.TabLayoutMediator



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val viewPager = findViewById<ViewPager2>(R.id.heros_pager)

        viewPager.adapter = HeroListFragmentAdapter(this)



        TabLayoutMediator(findViewById(R.id.atributesTablayout), findViewById(R.id.heros_pager)) { tab, position ->
            tab.text = when (position){
                0 -> "Força"
                1 -> "Agilidade"
                else -> "Inteligencia"
            }

        }.attach()
    }
}
