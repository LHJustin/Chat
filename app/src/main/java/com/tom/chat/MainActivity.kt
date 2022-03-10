package com.tom.chat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import com.tom.chat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object{
        val TAG = MainActivity::class.java.simpleName
    }
    lateinit var binding : ActivityMainBinding
    val personResultLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()){result ->
        Log.d(TAG, ": ")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupFunction()

    }

    private fun setupFunction(){
        binding.bHome.setOnClickListener(){

        }

        binding.bSearch.setOnClickListener(){

        }

        binding.bPerson.setOnClickListener(){

        }
    }

}