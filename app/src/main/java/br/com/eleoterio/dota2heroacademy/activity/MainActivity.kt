package br.com.eleoterio.dota2heroacademy.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import br.com.eleoterio.dota2heroacademy.fragments.HeroListFragmentAdapter
import br.com.eleoterio.dota2heroacademy.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val viewPager = findViewById<ViewPager2>(R.id.heros_pager)
        val tabLayout = findViewById<TabLayout>(R.id.atributesTablayout)

        viewPager.adapter = HeroListFragmentAdapter(this)


        tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val color = when(tab?.position){
                    0 -> R.color.strengthColor
                    1 -> R.color.agilityColor
                    else -> R.color.inteligenceColor
                }
                tabLayout.setBackgroundColor(ContextCompat.getColor(application, color))
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })


        TabLayoutMediator(findViewById(R.id.atributesTablayout), findViewById(R.id.heros_pager)) { tab, position ->
            tab.text = when (position){
                0 -> "Força"
                1 -> "Agilidade"
                else -> "Inteligencia"
            }

        }.attach()
    }




}
