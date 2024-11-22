package com.example.up01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TeacherListFragment : Fragment() {

    private lateinit var teacher: List<Teacher>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_teacher_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewTeacher)
        initializeList()
        var adapter : TeacherAdapter = TeacherAdapter(teacher){ teacher, i ->
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,TeacherFragment(teacher))
                .addToBackStack("Main")
                .commit()
        }
        recyclerView.adapter = adapter
    }
    private fun initializeList(){
        teacher = listOf(
            Teacher("Кочеткова","Татьяна","Борисовна","Директор","ffhgfghfghj"),
            Teacher("Кузниченко","Оксана","Анатольевна","Заместитель директора по УР","Информатика"),
            Teacher("Фролков","Андрей","Александрович","Заместитель директора по УПР","История"),
            Teacher("Косынцева","Ольга","Владимировна","Заместитель директора по УВР","Специальные дисциплины, УП и ПП по 13.02.02 Теплоснабжение и теплотехническое оборудование"),
            Teacher("Емельянов","Сергей","Алексеевич","Заместитель директора по АХЧ","Специальные дисциплины, УП и ПП по 09.02.07 Информационные системы и программирование"),
            Teacher("Рузанов","Станислав","Юрьевич","Заместитель директора по безопасности","Специальные дисциплины, УП и ПП по 38.02.07 и 38.02.01"),
            Teacher("Мазина","Марина","Павловна","Главный бухгалтер","Охрана труда"),
            Teacher("Крот","Дарья","Николаевна","Заведующий отделением" ,"Специальные дисциплины, УП и ПП  по 13.02.02"),
            Teacher("Савельева","Татьяна","Анатольевна","Заведующий отделением","какое то описание"),
            Teacher("Фролков","Андрей","Александрович","Помощник руководителя ЦЦО «IТ-куб» г. Орска","Специальные дисциплины, УП и ПП по 09.02.07 Информационные системы и программирование"),
            Teacher("Емельянов","Сергей","Алексеевич","Помощник бухгалтера","Русский язык, литература"),
            Teacher("Кузниченко","Оксана","Анатольевна","Заместитель директора по УКР","Физическая культура"),
            Teacher("Косынцева","Ольга","Владимировна","Заместитель директора по УГР","География"),
            Teacher("Емельянов","Сергей","Алексеевич","Заместитель директора по АХЕ","какое то описание"),
            Teacher("Саладай","Алексей","Владимирович","Руководитель ЦЦО «IТ-куб» г. Орска" ,"Иностранный язык, Иностранный язык в профессиональной деятельности")
        )
    }
}