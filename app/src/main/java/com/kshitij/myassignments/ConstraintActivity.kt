package com.kshitij.myassignments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kshitij.myassignments.databinding.ActivityConstraintBinding

class ConstraintActivity : AppCompatActivity() {
    lateinit var binding: ActivityConstraintBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConstraintBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}