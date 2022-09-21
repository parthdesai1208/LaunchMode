package com.example.launchmode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.launchmode.databinding.ActivityCBinding
import com.example.launchmode.databinding.ActivityDBinding

class ActivityD : AppCompatActivity() {
    lateinit var binding : ActivityDBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.againCallItself.setOnClickListener {
            val intent = Intent(this,ActivityD::class.java)
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.e("Launch","Activity D : onNewIntent")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Launch","Activity D : onResume")

    }
}