package com.anthony.week5_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anthony.week5_assignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myprofilelogAdapter: profilelogAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val names: List<profile> = arrayListOf()ListOf(profile(

        )
    }
}