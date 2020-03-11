package com.wkdrabbit.baseimplementations.recyclerview_with_diffutils

import com.wkdrabbit.baseimplementations.recyclerview_with_diffutils.models.DummyModel

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<DummyModel>{
            val list = ArrayList<DummyModel>()
            list.add(DummyModel("DummyTitle1", "DummyName1"))
            list.add(DummyModel("DummyTitle2", "DummyName2"))
            list.add(DummyModel("DummyTitle3", "DummyName3"))
            list.add(DummyModel("DummyTitle4", "DummyName4"))
            list.add(DummyModel("DummyTitle5", "DummyName5"))
            list.add(DummyModel("DummyTitle6", "DummyName6"))
            list.add(DummyModel("DummyTitle7", "DummyName7"))
            list.add(DummyModel("DummyTitle8", "DummyName8"))
            list.add(DummyModel("DummyTitle9", "DummyName9"))
            list.add(DummyModel("DummyTitle10", "DummyName10"))
            return list
        }
    }
}