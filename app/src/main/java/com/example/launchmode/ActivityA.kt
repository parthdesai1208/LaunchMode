package com.example.launchmode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.launchmode.databinding.ActivityABinding

class ActivityA : AppCompatActivity() {
    lateinit var binding: ActivityABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityABinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnA.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }
        Log.e("Launch", "onCreate-A -- TASK ID: $taskId")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.e("Launch", "Activity A : onNewIntent")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Launch", "Activity A : onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Launch", "Activity A : onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Launch", "Activity A : onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Launch", "Activity A : onDestroy")
    }
}