package com.wkdrabbit.baseimplementations.recyclerview_with_diffutils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wkdrabbit.baseimplementations.R
import com.wkdrabbit.baseimplementations.recyclerview_with_diffutils.models.DummyModel
import kotlinx.android.synthetic.main.rv_layout_dummy_list_item.view.*

class DummyRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private var items: List<DummyModel> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return DummyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_layout_dummy_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is DummyViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    fun submitList(dummyList: List<DummyModel>){
        items = dummyList
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class DummyViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){
        val dummyTitle = itemView.dummy_title
        val dummyName = itemView.dummy_name

        fun bind(dummyModel: DummyModel){
            dummyTitle.text = dummyModel.dummyTitle
            dummyName.text = dummyModel.dummyName
        }
    }
}