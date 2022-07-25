package com.app.localization_lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.app.localization_lifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding as ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("Activity", "onCreate invoke")

        binding.btnClickTest.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Activity", "onStart invoke")
        Toast.makeText(this, " ${getString(R.string.onStart)}", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity", "onResume invoke")
        Toast.makeText(this, " ${getString(R.string.onResume)}", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity", "onPause invoke")
        Toast.makeText(this, " ${getString(R.string.onPause)}", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity", "onStop invoke")
        Toast.makeText(this, " ${getString(R.string.onStop)}", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity", "onDestroy invoke")
        Toast.makeText(this, " ${getString(R.string.onDestroy)}", Toast.LENGTH_SHORT).show()
    }
}