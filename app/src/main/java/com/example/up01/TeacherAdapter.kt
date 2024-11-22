package com.example.up01

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TeacherAdapter(private val teachers: List<Teacher>,private val onItemClick: (Teacher, Int) -> Unit) :
    RecyclerView.Adapter<TeacherAdapter.ViewHolder>(){
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvFio: TextView = itemView.findViewById(R.id.textViewTeacherFIO)
        val tvSpec: TextView = itemView.findViewById(R.id.textViewSpec)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.teacher_list_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val teacher = teachers.get(position)
        holder.tvFio.append("${teacher.secondName} ${teacher.firstName} ${teacher.thirdName}")
        holder.tvSpec.append("${teacher.spec}")
        holder.itemView.setOnClickListener {
            onItemClick(teacher,position)
        }
    }

    override fun getItemCount(): Int {
        return teachers.count()
    }

}