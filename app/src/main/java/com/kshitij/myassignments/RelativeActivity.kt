package com.kshitij.myassignments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kshitij.myassignments.databinding.ActivityRelativeBinding

class RelativeActivity : AppCompatActivity() {
    lateinit var binding: ActivityRelativeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRelativeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        intent?.let {
            var value = it.getStringExtra("test")
        }
    }
}