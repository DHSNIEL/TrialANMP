package com.example.adv160421076week2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import java.util.logging.Level

class OptionFragment : BottomSheetDialogFragment() {
    private val LEVEL = arrayOf("Easy", "Medium", "Hard")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(requireContext(), android.R.layout.simple_dropdown_item_1line, LEVEL)
    }
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    )
//    : View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_option, container, false)
//    }

}