package com.example.up01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.w3c.dom.Text


class TeacherFragment(val teacher: Teacher) : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_teacher, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val firstName : TextView = view.findViewById(R.id.textViewTeacherFragmentFirstName)
        val secondName : TextView = view.findViewById(R.id.textViewTeacherFragmentSecondName)
        val thirdName : TextView = view.findViewById(R.id.textViewTeacherFragmentThirdName)
        val spec : TextView = view.findViewById(R.id.textViewTeacherFragmentSpec)
        val description : TextView = view.findViewById(R.id.textViewTeacherFragmentDescription)

        firstName.append(teacher.firstName)
        secondName.append(teacher.secondName)
        thirdName.append(teacher.thirdName)
        spec.append(teacher.spec)
        description.text = teacher.description
    }

}