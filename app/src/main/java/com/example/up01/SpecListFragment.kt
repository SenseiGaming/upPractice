package com.example.up01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SpecListFragment : Fragment() {

    lateinit var specList: List<Spec>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_spec_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerViewSpec)
        initializeList()
        val adapter: SpecAdapter = SpecAdapter(specList){ spec, i ->
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,SpecFragment(spec))
                .addToBackStack("Main")
                .commit()
        }
        recyclerView.adapter = adapter
    }

    private fun initializeList(){
        specList = listOf(
        Spec("Переработка нефти и газа", "18.02.09", "квалификация - техник"),
        Spec("Технология аналитического контроля  химических соединений", "18.02.12", "квалификация - техник"),
        Spec("Монтаж, техническая эксплуатация и ремонт промышленного оборудования", "15.02.12", "квалификация - техник"),
        Spec("Теплоснабжение и теплотехническое оборудование", "13.02.02", "квалификация - техник"),
        Spec("Рациональное использование природохозяйственных комплексов", "20.02.01", "квалификация - техник"),
        Spec("Информационные системы и программирование", "09.02.07", "квалификация - программист"),
        Spec("Экономика и бухгалтерский учет", "38.02.01", "квалификация - бухгалтер"),
        Spec("Банковское дело", "38.02.07", "квалификация - специалист банковского дела"),
        Spec("Пожарная безопасность", "20.02.04", "квалификация - техник")
        )
    }
}