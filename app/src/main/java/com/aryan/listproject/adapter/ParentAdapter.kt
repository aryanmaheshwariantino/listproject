package com.aryan.listproject.adapter

import ChildAdapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aryan.listproject.databinding.ItemInnerListBinding
import com.aryan.listproject.models.ItemModel

class ParentAdapter(private val dataList: List<List<ItemModel>>) : RecyclerView.Adapter<ParentAdapter.MyHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MyHolder(ItemInnerListBinding.inflate(LayoutInflater.from(parent.context),parent,false))


    override fun getItemCount() = dataList.size

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.binding.rvChild.adapter = ChildAdapter(dataList[position])
    }

    inner class MyHolder( val binding:ItemInnerListBinding):RecyclerView.ViewHolder(binding.root){

    }


}