package com.example.launchmode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.launchmode.databinding.ActivityABinding
import com.example.launchmode.databinding.ActivityCBinding

class ActivityC : AppCompatActivity() {
    lateinit var binding: ActivityCBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnC.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            startActivity(intent)
        }
        Log.e("Launch", "onCreate-C -- TASK ID: $taskId")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.e("Launch", "Activity C : onNewIntent")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Launch", "Activity C : onResume")
    }


    override fun onPause() {
        super.onPause()
        Log.e("Launch", "Activity C : onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Launch", "Activity C : onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Launch", "Activity C : onDestroy")
    }
}