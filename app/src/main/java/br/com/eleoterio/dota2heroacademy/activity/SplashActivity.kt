package br.com.eleoterio.dota2heroacademy.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar
import br.com.eleoterio.dota2heroacademy.R

private const val SPLASH_TIME = 1500L

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed(Runnable {
            findViewById<ProgressBar>(R.id.progressBar).progress = 100
            startActivity(Intent(this, MainActivity::class.java))
        }, SPLASH_TIME)

        Handler().postDelayed(Runnable {
            findViewById<ProgressBar>(R.id.progressBar).progress = 50
        }, SPLASH_TIME/2)
    }
}
