package com.aryan.listproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aryan.listproject.databinding.StudyCardViewBinding
import com.aryan.listproject.models.StudyModel

class StudyAdapter(private val dataList: List<StudyModel>) :
    RecyclerView.Adapter<StudyAdapter.StudyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudyViewHolder {
        val binding = StudyCardViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StudyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: StudyViewHolder, position: Int) {
        val data = dataList[position]
        holder.binding.apply {
            imageviewstudy.setImageResource(data.image)
            title.text = data.title
        }
    }

    inner class StudyViewHolder(val binding: StudyCardViewBinding) : RecyclerView.ViewHolder(binding.root)
}
