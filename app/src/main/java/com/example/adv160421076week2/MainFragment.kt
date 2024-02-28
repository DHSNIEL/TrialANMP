package com.example.adv160421076week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import java.lang.Integer.parseInt


class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var randA = (0..30).random()
        var randB = (0..30).random()
        var playerPoint :Int = 0
        val question = view.findViewById<TextView>(R.id.question)

        question.setText(randA.toString() + " + "+ randB.toString())

        val btnStart = view.findViewById<Button>(R.id.btnStart)
        btnStart.setOnClickListener {
            val txtInput = view.findViewById<TextView>(R.id.txtInput)
            val jawaban = parseInt(txtInput.text.toString())

            val questionTotal = randA + randB
            if(questionTotal == jawaban){
                randA = (0..30).random()
                randB = (0..30).random()

                playerPoint+=1
                question.setText(randA.toString() + " + "+ randB.toString())
                txtInput.setText("")
            }
            else{
                val action = MainFragmentDirections.actionGameFragment(playerPoint)
                Navigation.findNavController(it).navigate(action)
            }
        }
    }

}