package com.ttt.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ttt.presentation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //private lateinit var binding :ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        setContentView(R.layout.activity_main)

    }
}