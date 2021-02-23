package com.example.listvieww

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.view.size
import com.example.listvieww.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        title = "MPESA"
        titleColor = Color.parseColor("#75bfb0")
        val myCars = arrayOf("check balance", "deposit", "withdrawal", "buy airtime") //data source
        val myCarsAdapter: ArrayAdapter<String> =
         ArrayAdapter(applicationContext, android.R.layout.simple_expandable_list_item_2, myCars)
        binding.cars.adapter = myCarsAdapter
        var name = "Ivan"
        binding.cars.onItemClickListener = AdapterView.OnItemClickListener{parent: AdapterView<*>, view1: View, i: Int, l: Long ->
            when(i) {
                0 -> { Toast.makeText(applicationContext, "Checking Balance", Toast.LENGTH_SHORT).show() }
                1 -> { Toast.makeText(applicationContext, "Depositing", Toast.LENGTH_SHORT).show() }
                2 -> { Toast.makeText(applicationContext, "Withdrawing", Toast.LENGTH_SHORT).show() }
                3 -> { Toast.makeText(applicationContext, "Buying Airtime", Toast.LENGTH_SHORT).show() }
            }
        }

    }
}