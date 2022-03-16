package com.tom.chat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tom.chat.databinding.FragmentHomeBinding
import com.tom.chat.databinding.RowChatroomBinding

class HomeFragment: Fragment() {
    lateinit var binding: FragmentHomeBinding
    //帶出ProgramClasses的資料
    var rooms = mutableListOf<Lightyear>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //
        binding.recyclerHome.setHasFixedSize(true)
        binding.recyclerHome.layoutManager = GridLayoutManager(requireContext(), 2)


    }
    //帶出row_chatroom的binding
    inner class BindingViewHolder(binding: RowChatroomBinding): RecyclerView.ViewHolder(binding.root){
        val title = binding.chatroomTitle
        val tag = binding.chatroomTag
        val name = binding.chatroomNickname
        val headshot = binding.headShot
    }
    //
    inner class RoomAdapter : RecyclerView.Adapter<BindingViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder {
            TODO("Not yet implemented")
        }

        override fun onBindViewHolder(holder: BindingViewHolder, position: Int) {
            TODO("Not yet implemented")
        }

        override fun getItemCount(): Int {
            TODO("Not yet implemented")
        }

    }
}