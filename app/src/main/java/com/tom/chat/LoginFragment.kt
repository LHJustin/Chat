package com.tom.chat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.tom.chat.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    lateinit var binding: FragmentLoginBinding
    //定義變數viewModel連接到CheckLog(注意是用by)
    val viewModel by viewModels<CheckLog>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //按下Log In按鈕的動作
        binding.bLogin.setOnClickListener {
            val user = binding.edUsername.text.toString()
            val pass = binding.edPassword.text.toString()
            //user跟pass傳入check方法裡運算
            viewModel.check(user, pass)
        }

    }
}