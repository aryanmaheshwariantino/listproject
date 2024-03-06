package com.aryan.listproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aryan.listproject.R
import com.aryan.listproject.adapter.ParentAdapter
import com.aryan.listproject.models.ItemModel

class Home : Fragment() {

    private lateinit var adapter: ParentAdapter
    private lateinit var dataList: List<List<ItemModel>>
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView = view.findViewById(R.id.recycler_view)

        dataList = getData()

        adapter = ParentAdapter(dataList)
        recyclerView.adapter = adapter

        return  view
    }

    private fun getData():List<List<ItemModel>>{
        return listOf(listOf(
            ItemModel(R.drawable.image1,"Running machine game\n" +

                    "from any kind you like","Jordan wise","234k views . 3 days ago"),
            ItemModel(R.drawable.image2,"Running machine game\n" +
                    "from any kind you like","Jordan wise","244k views . 2 days ago"),
            ItemModel(R.drawable.image5,"Running machine game\n" +
                    "from any kind you like","Morgan wise","254k views . 4 days ago"),
            ItemModel(R.drawable.image6,"Running machine game\n" +
                    "from any kind you like","Happy wise","264k views . 5 days ago"),
            ItemModel(R.drawable.image7,"Running machine game\n" +
                    "from any kind you like","Sad wise","274k views . 6 days ago"),
            ItemModel(R.drawable.image1,"Running machine game\n" +
                    "from any kind you like","Joy wise","284k views . 7 days ago"),
            ItemModel(R.drawable.image2,"Running machine game\n" +
                    "from any kind you like","Cringe wise","294k views . 8 days ago"),
            ItemModel(R.drawable.image5,"Running machine game\n" +
                    "from any kind you like","Hack wise","204k views . 9 days ago")
        ),listOf(
            ItemModel(R.drawable.image6,"Running machine game\n" +

                    "from any kind you like","Jordan wise","234k views . 3 days ago"),
            ItemModel(R.drawable.image7,"Running machine game\n" +
                    "from any kind you like","Jordan wise","244k views . 2 days ago"),
            ItemModel(R.drawable.image1,"Running machine game\n" +
                    "from any kind you like","Morgan wise","254k views . 4 days ago"),
            ItemModel(R.drawable.image2,"Running machine game\n" +
                    "from any kind you like","Happy wise","264k views . 5 days ago"),
            ItemModel(R.drawable.image5,"Running machine game\n" +
                    "from any kind you like","Sad wise","274k views . 6 days ago"),
            ItemModel(R.drawable.image6,"Running machine game\n" +
                    "from any kind you like","Joy wise","284k views . 7 days ago"),
            ItemModel(R.drawable.image7,"Running machine game\n" +
                    "from any kind you like","Cringe wise","294k views . 8 days ago"),
            ItemModel(R.drawable.image1,"Running machine game\n" +
                    "from any kind you like","Hack wise","204k views . 9 days ago")
        ),listOf(
            ItemModel(R.drawable.image2,"Running machine game\n" +

                    "from any kind you like","Jordan wise","234k views . 3 days ago"),
            ItemModel(R.drawable.image5,"Running machine game\n" +
                    "from any kind you like","Jordan wise","244k views . 2 days ago"),
            ItemModel(R.drawable.image6,"Running machine game\n" +
                    "from any kind you like","Morgan wise","254k views . 4 days ago"),
            ItemModel(R.drawable.image7,"Running machine game\n" +
                    "from any kind you like","Happy wise","264k views . 5 days ago"),
            ItemModel(R.drawable.image1,"Running machine game\n" +
                    "from any kind you like","Sad wise","274k views . 6 days ago"),
            ItemModel(R.drawable.image2,"Running machine game\n" +
                    "from any kind you like","Joy wise","284k views . 7 days ago"),
            ItemModel(R.drawable.image5,"Running machine game\n" +
                    "from any kind you like","Cringe wise","294k views . 8 days ago"),
            ItemModel(R.drawable.image6,"Running machine game\n" +
                    "from any kind you like","Hack wise","204k views . 9 days ago")
        ),listOf(
            ItemModel(R.drawable.image7,"Running machine game\n" +

                    "from any kind you like","Jordan wise","234k views . 3 days ago"),
            ItemModel(R.drawable.image1,"Running machine game\n" +
                    "from any kind you like","Jordan wise","244k views . 2 days ago"),
            ItemModel(R.drawable.image2,"Running machine game\n" +
                    "from any kind you like","Morgan wise","254k views . 4 days ago"),
            ItemModel(R.drawable.image5,"Running machine game\n" +
                    "from any kind you like","Happy wise","264k views . 5 days ago"),
            ItemModel(R.drawable.image6,"Running machine game\n" +
                    "from any kind you like","Sad wise","274k views . 6 days ago"),
            ItemModel(R.drawable.image7,"Running machine game\n" +
                    "from any kind you like","Joy wise","284k views . 7 days ago"),
            ItemModel(R.drawable.image1,"Running machine game\n" +
                    "from any kind you like","Cringe wise","294k views . 8 days ago"),
            ItemModel(R.drawable.image2,"Running machine game\n" +
                    "from any kind you like","Hack wise","204k views . 9 days ago")
        ),listOf(
            ItemModel(R.drawable.image5,"Running machine game\n" +

                    "from any kind you like","Jordan wise","234k views . 3 days ago"),
            ItemModel(R.drawable.image2,"Running machine game\n" +
                    "from any kind you like","Jordan wise","244k views . 2 days ago"),
            ItemModel(R.drawable.image1,"Running machine game\n" +
                    "from any kind you like","Morgan wise","254k views . 4 days ago"),
            ItemModel(R.drawable.image2,"Running machine game\n" +
                    "from any kind you like","Happy wise","264k views . 5 days ago"),
            ItemModel(R.drawable.image1,"Running machine game\n" +
                    "from any kind you like","Sad wise","274k views . 6 days ago"),
            ItemModel(R.drawable.image2,"Running machine game\n" +
                    "from any kind you like","Joy wise","284k views . 7 days ago"),
            ItemModel(R.drawable.image1,"Running machine game\n" +
                    "from any kind you like","Cringe wise","294k views . 8 days ago"),
            ItemModel(R.drawable.image2,"Running machine game\n" +
                    "from any kind you like","Hack wise","204k views . 9 days ago")
        ),listOf(
            ItemModel(R.drawable.image1,"Running machine game\n" +

                    "from any kind you like","Jordan wise","234k views . 3 days ago"),
            ItemModel(R.drawable.image2,"Running machine game\n" +
                    "from any kind you like","Jordan wise","244k views . 2 days ago"),
            ItemModel(R.drawable.image1,"Running machine game\n" +
                    "from any kind you like","Morgan wise","254k views . 4 days ago"),
            ItemModel(R.drawable.image2,"Running machine game\n" +
                    "from any kind you like","Happy wise","264k views . 5 days ago"),
            ItemModel(R.drawable.image1,"Running machine game\n" +
                    "from any kind you like","Sad wise","274k views . 6 days ago"),
            ItemModel(R.drawable.image2,"Running machine game\n" +
                    "from any kind you like","Joy wise","284k views . 7 days ago"),
            ItemModel(R.drawable.image1,"Running machine game\n" +
                    "from any kind you like","Cringe wise","294k views . 8 days ago"),
            ItemModel(R.drawable.image2,"Running machine game\n" +
                    "from any kind you like","Hack wise","204k views . 9 days ago")
        ),listOf(
            ItemModel(R.drawable.image1,"Running machine game\n" +

                    "from any kind you like","Jordan wise","234k views . 3 days ago"),
            ItemModel(R.drawable.image2,"Running machine game\n" +
                    "from any kind you like","Jordan wise","244k views . 2 days ago"),
            ItemModel(R.drawable.image1,"Running machine game\n" +
                    "from any kind you like","Morgan wise","254k views . 4 days ago"),
            ItemModel(R.drawable.image2,"Running machine game\n" +
                    "from any kind you like","Happy wise","264k views . 5 days ago"),
            ItemModel(R.drawable.image1,"Running machine game\n" +
                    "from any kind you like","Sad wise","274k views . 6 days ago"),
            ItemModel(R.drawable.image2,"Running machine game\n" +
                    "from any kind you like","Joy wise","284k views . 7 days ago"),
            ItemModel(R.drawable.image1,"Running machine game\n" +
                    "from any kind you like","Cringe wise","294k views . 8 days ago"),
            ItemModel(R.drawable.image2,"Running machine game\n" +
                    "from any kind you like","Hack wise","204k views . 9 days ago")
        ))
    }

}
