package com.example.launchmode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.launchmode.databinding.ActivityABinding
import com.example.launchmode.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {
    lateinit var binding: ActivityBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnB.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }

        /* binding.againCallItself.setOnClickListener {
             val intent = Intent(this,ActivityB::class.java)
             startActivity(intent)
         }*/
        Log.e("Launch", "onCreate-B -- TASK ID: $taskId")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.e("Launch", "Activity B : onNewIntent")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Launch", "Activity B : onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Launch", "Activity B : onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Launch", "Activity B : onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Launch", "Activity B : onDestroy")
    }
}