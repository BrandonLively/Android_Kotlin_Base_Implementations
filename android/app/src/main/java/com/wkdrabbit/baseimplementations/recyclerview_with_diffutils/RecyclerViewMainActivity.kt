package com.wkdrabbit.baseimplementations.recyclerview_with_diffutils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wkdrabbit.baseimplementations.R
import kotlinx.android.synthetic.main.rv_activity_main.*

class RecyclerViewMainActivity : AppCompatActivity() {

    private lateinit var dummyAdapter: DummyRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rv_activity_main)

        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        dummyAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        recycler_view.apply{
            layoutManager = LinearLayoutManager(this@RecyclerViewMainActivity)
            val topSpacingDecoration = TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingDecoration)
            dummyAdapter = DummyRecyclerAdapter()
            adapter = dummyAdapter
        }
    }
}
