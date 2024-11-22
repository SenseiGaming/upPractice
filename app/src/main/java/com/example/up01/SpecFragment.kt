package com.example.up01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SpecFragment(val spec: Spec) : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_spec, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name : TextView = view.findViewById(R.id.textViewSpecFragmentName)
        val code : TextView = view.findViewById(R.id.textViewSpecFragmentCode)
        val description : TextView = view.findViewById(R.id.textViewSpecFragmentDescription)

        name.append(spec.name)
        code.append(spec.code)
        description.append(spec.description)
    }
}