package com.example.up01

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val teacherButton = view.findViewById<Button>(R.id.buttonTeacher)
        val adminButton = view.findViewById<Button>(R.id.buttonAdmin)
        val specButton = view.findViewById<Button>(R.id.buttonSpec)
        val collegeButton = view.findViewById<Button>(R.id.buttonCollege)
        val faqButton = view.findViewById<Button>(R.id.buttonFAQ)

        teacherButton.setOnClickListener{
            openFragment(TeacherListFragment())
        }
        adminButton.setOnClickListener {
            openFragment(AdminListFragment())
        }
        specButton.setOnClickListener{
            openFragment(SpecListFragment())
        }
        collegeButton.setOnClickListener {
            openFragment(CollegeFragment())
        }
        faqButton.setOnClickListener {
            val alertDialog = AlertDialog.Builder(context)
                alertDialog.apply {
                    setTitle("Информация о Разработчике")
                    setMessage("Главный разработчик: Романов Иван, номер: +799099327854, почта: or25sk.84@mail.ru\nПомощьник разработчика: Дмитрий Краснощёков," +
                            " номер: +79059037613, почта: dmitrii.@mail.ru")
                    .setPositiveButton("Ok") { dialog, id ->
                        dialog.cancel()
                    }
                }.create().show()
        }
    }

    private fun openFragment(fragment: Fragment){
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView,fragment)
            .addToBackStack("mainStack")
            .commit()
    }

}