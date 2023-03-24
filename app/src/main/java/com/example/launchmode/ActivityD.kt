package com.example.launchmode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.launchmode.databinding.ActivityCBinding
import com.example.launchmode.databinding.ActivityDBinding

class ActivityD : AppCompatActivity() {
    lateinit var binding: ActivityDBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.againCallItself.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            startActivity(intent)
        }
        Log.e("Launch", "onCreate-D -- TASK ID: $taskId")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.e("Launch", "Activity D : onNewIntent")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Launch", "Activity D : onResume")

    }


    override fun onPause() {
        super.onPause()
        Log.e("Launch", "Activity D : onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Launch", "Activity D : onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Launch", "Activity D : onDestroy")
    }
}