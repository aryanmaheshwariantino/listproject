package com.aryan.listproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aryan.listproject.R
import com.aryan.listproject.adapter.StudyAdapter
import com.aryan.listproject.models.StudyModel

class Study : Fragment() {
    private lateinit var adapter: StudyAdapter
    private lateinit var dataList: List<StudyModel>
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_study, container, false)
        recyclerView = view.findViewById(R.id.study_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(context)

        dataList = getData()

        adapter = StudyAdapter(dataList)
        recyclerView.adapter = adapter

        return view
    }

    private fun getData(): List<StudyModel> {
        return listOf(
            StudyModel(R.drawable.image1, "My flashcards"),
            StudyModel(R.drawable.image2, "Study games"),
            StudyModel(R.drawable.image7, "Quizzes"),
            StudyModel(R.drawable.image6, "My study materials"),
        )
    }
}
