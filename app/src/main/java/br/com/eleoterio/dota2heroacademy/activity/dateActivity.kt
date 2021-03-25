package br.com.eleoterio.dota2heroacademy.activity

import android.os.Bundle
import android.telecom.Call
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.eleoterio.dota2heroacademy.R
import br.com.eleoterio.dota2heroacademy.api.Endpoint
import br.com.eleoterio.dota2heroacademy.api.NetworkUtils
import retrofit2.Callback
import retrofit2.Response


class DateActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hero_page)

        getData()
    }

    fun getData() {
        val retrofitClient = NetworkUtils
            .getRetrofitInstance("https://api.opendota.com/api")

        val endpoint = retrofitClient.create(Endpoint::class.java)
        val callback = endpoint.getPosts()

    }
}