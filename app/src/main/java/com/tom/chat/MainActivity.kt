package com.tom.chat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import com.tom.chat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object{
        val TAG = MainActivity::class.java.simpleName
    }
    //跟上面的目的一樣
//    private val TAG = MainActivity::class.java.simpleName
    
    lateinit var binding : ActivityMainBinding
    //設置一個可變的list用來放fragment
    val fragments = mutableListOf<Fragment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //執行按底下按鈕切換fragment的動作
        initFragments()
        binding.buttonNavBar.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.action_home-> {
                    supportFragmentManager.beginTransaction().run {
                        replace(R.id.my_container, fragments[0]).commit()
                    }
                    true
                }
                R.id.action_search->{
                    supportFragmentManager.beginTransaction().run {
                        replace(R.id.my_container, fragments[1]).commit()
                    }
                    true
                }
                R.id.action_personal->{
                    supportFragmentManager.beginTransaction().run {
                        replace(R.id.my_container, fragments[2]).commit()
                    }
                    true
                }
                else -> true
            }
        }
    }
    //在方法內在fragments裡放入不同的fragment，並讓一開始可以顯示HomeFragment
    private fun initFragments() {
        fragments.add(0,HomeFragment())
        fragments.add(1,SearchFragment())
        fragments.add(2,LoginFragment())

        //Kotlin way
        supportFragmentManager.beginTransaction().run {
            add(R.id.my_container, fragments[0])
            commit()
        }
    }
}