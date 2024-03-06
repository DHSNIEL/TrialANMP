package com.example.adv160421076week2

import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.adv160421076week2.databinding.FragmentMainBinding
import com.example.adv160421076week2.databinding.FragmentOptionBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import java.util.logging.Level

class OptionFragment : BottomSheetDialogFragment() {
    private val LEVEL = arrayOf("Easy", "Medium", "Hard")
    private lateinit var binding: FragmentOptionBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOptionBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(requireContext(), android.R.layout.simple_dropdown_item_1line, LEVEL)
        binding.txtLevel.setAdapter(adapter)
    }
}