package com.example.mymorningtabbedproject.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.mymorningtabbedproject.R

class CallsFragment : Fragment() {
    var buttonClickMe:Button ?= null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var root =  inflater.inflate(R.layout.fragment_calls, container, false)

        buttonClickMe = root.findViewById(R.id.mBtnClickMe)
        buttonClickMe!!.setOnClickListener {
            Toast.makeText(context,"You clicked me", Toast.LENGTH_LONG).show()
        }

        return root
    }

}