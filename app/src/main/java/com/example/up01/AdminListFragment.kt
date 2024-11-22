package com.example.up01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdminListFragment : Fragment() {

    lateinit var admin: List<Admin>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_admin_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewAdmin)
        initializeList()
        var adapter : AdminAdapter = AdminAdapter(admin){ admin, i ->
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,AdminFragment(admin))
                .addToBackStack("Main")
                .commit()
        }
        recyclerView.adapter = adapter
    }
    private fun initializeList(){
        admin = listOf(
            Admin("Кочеткова","Татьяна","Борисовна","Директор","Админ"),
            Admin("Кузниченко","Оксана","Анатольевна","Заместитель директора по УР","Админ"),
            Admin("Фролков","Андрей","Александрович","Заместитель директора по УПР","Админ"),
            Admin("Косынцева","Ольга","Владимировна","Заместитель директора по УВР","Админ"),
            Admin("Емельянов","Сергей","Алексеевич","Заместитель директора по АХЧ","Админ"),
            Admin("Кочеткова","Татьяна","Борисовна","Директор","Админ"),
            Admin("Кузниченко","Оксана","Анатольевна","Заместитель директора по УР","Админ"),
            Admin("Фролков","Андрей","Александрович","Заместитель директора по УПР","Админ"),
            Admin("Косынцева","Ольга","Владимировна","Заместитель директора по УВР","Админ"),
            Admin("Емельянов","Сергей","Алексеевич","Заместитель директора по АХЧ","Админ")
        )
    }
}