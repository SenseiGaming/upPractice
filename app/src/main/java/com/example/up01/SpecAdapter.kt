package com.example.up01

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SpecAdapter(private val spec: List<Spec>,private val onItemClick: (Spec, Int) -> Unit) :
    RecyclerView.Adapter<SpecAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.textViewSpecName)
        val tvCode: TextView = itemView.findViewById(R.id.textViewSpecCode)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.spec_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val spec = spec.get(position)
        holder.tvName.append("${spec.name}")
        holder.tvCode.append("${spec.code}")
        holder.itemView.setOnClickListener {
            onItemClick(spec, position)
        }
    }

    override fun getItemCount(): Int {
        return spec.count()
    }
}