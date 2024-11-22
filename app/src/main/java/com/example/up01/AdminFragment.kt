package com.example.up01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class AdminFragment(val admin: Admin) : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_admin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val firstName : TextView = view.findViewById(R.id.textViewAdminFragmentFirstName)
        val secondName : TextView = view.findViewById(R.id.textViewAdminFragmentSecondName)
        val thirdName : TextView = view.findViewById(R.id.textViewAdminFragmentThirdName)
        val post : TextView = view.findViewById(R.id.textViewAdminFragmentPost)
        val description : TextView = view.findViewById(R.id.textViewAdminFragmentDescription)

        firstName.append(admin.firstName)
        secondName.append(admin.secondName)
        thirdName.append(admin.thirdName)
        post.append(admin.post)
        description.text = admin.description
    }
}