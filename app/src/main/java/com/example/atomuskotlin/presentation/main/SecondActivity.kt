package com.example.atomuskotlin.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atomuskotlin.R
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val exampleList = generateDummyList(500)

        recycler_view.adapter = ExampleAdapter(exampleList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }
    private fun generateDummyList(size: Int): List<ExampleItem> {
        val list = ArrayList<ExampleItem>()

        for (i in 0 until size) {
            val drawable = when (i % 20) {
                1 -> R.drawable.hydrogene
                2 -> R.drawable.helium
                3 -> R.drawable.lithium
                4 -> R.drawable.beryllium
                5 -> R.drawable.bore
                6 -> R.drawable.carbone
                7-> R.drawable.azote
                8 -> R.drawable.oxygene
                9 -> R.drawable.fluor
                11 -> R.drawable.sodium
                else -> R.drawable.fluor



            }


            val item = ArrayList<ExampleItem>()

            item.add(ExampleItem(R.drawable.hydrogene, "Hydrogène", "1"))
            item.add(ExampleItem(R.drawable.helium, "Hélium", "2"))
            item.add(ExampleItem(R.drawable.lithium, "Lithium", "3"))
            item.add(ExampleItem(R.drawable.beryllium, "Beryllium", "4"))
            item.add(ExampleItem(R.drawable.bore, "Bore", "5"))
            item.add(ExampleItem(R.drawable.carbone, "Carbone", "6"))
            item.add(ExampleItem(R.drawable.azote, "Azote", "7"))
            item.add(ExampleItem(R.drawable.oxygene, "Oxygene", "8"))
            item.add(ExampleItem(R.drawable.fluor, "Fluor", "9"))
            item.add(ExampleItem(R.drawable.sodium, "Sodium", "11"))



            list += item
        }
        return list
    }


}