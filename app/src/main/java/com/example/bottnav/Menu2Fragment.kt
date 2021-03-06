package com.example.bottnav

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.bottnav.databinding.FragmentMenu2Binding
import com.example.bottnav.databinding.FragmentWriteBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Menu2Fragment : Fragment() {

    lateinit var binding: FragmentMenu2Binding //수정함
    lateinit var mainActivity: MainActivity

    //추가
    override fun onAttach(context: Context) { //context에는 나를 삽입한 activity가 담겨있음 mainActivity가 맞다면 담아놓고 쓰겠음
        super.onAttach(context)
        if(context is MainActivity) mainActivity = context
    }

    //변수 추가함
    lateinit var addButton: FloatingActionButton

    //추가


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMenu2Binding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.addButton3.setOnClickListener{
            mainActivity.goWrite()
        }
    }

}