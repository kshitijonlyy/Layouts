package com.kshitij.myassignments

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kshitij.myassignments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            var intent = Intent(this, RelativeActivity::class.java)
            intent.putExtra("test", " intent")
            startActivity(intent)
//            finish()
        }
        binding.btn2.setOnClickListener {
            var intent = Intent(this, ConstraintActivity::class.java)
            startActivity(intent)
//            finish()
        }
    }
}