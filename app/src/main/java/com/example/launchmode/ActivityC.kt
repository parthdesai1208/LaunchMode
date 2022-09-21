package com.example.launchmode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.launchmode.databinding.ActivityABinding
import com.example.launchmode.databinding.ActivityCBinding

class ActivityC : AppCompatActivity() {
    lateinit var binding : ActivityCBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnC.setOnClickListener {
            val intent = Intent(this,ActivityD::class.java)
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.e("Launch","Activity C : onNewIntent")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Launch","Activity C : onResume")
    }
}