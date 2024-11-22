package com.example.up01

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdminAdapter (private val admin: List<Admin>,private val onItemClick: (Admin, Int) -> Unit) :
    RecyclerView.Adapter<AdminAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvFio: TextView = itemView.findViewById(R.id.textViewAdminFIO)
        val tvPost: TextView = itemView.findViewById(R.id.textViewAdminPost)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.admin_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val admin = admin.get(position)
        holder.tvFio.append("${admin.secondName} ${admin.firstName} ${admin.thirdName}")
        holder.tvPost.append("${admin.post}")
        holder.itemView.setOnClickListener {
            onItemClick(admin, position)
        }
    }

    override fun getItemCount(): Int {
        return admin.count()
    }
}

