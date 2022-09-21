package com.example.launchmode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.launchmode.databinding.ActivityABinding
import com.example.launchmode.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {
    lateinit var binding : ActivityBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnB.setOnClickListener {
            val intent = Intent(this,ActivityC::class.java)
            startActivity(intent)
        }

        binding.againCallItself.setOnClickListener {
            val intent = Intent(this,ActivityB::class.java)
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.e("Launch","Activity B : onNewIntent")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Launch","Activity B : onResume")
    }
}