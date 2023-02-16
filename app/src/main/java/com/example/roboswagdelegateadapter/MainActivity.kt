package com.example.roboswagdelegateadapter

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.roboswagdelegateadapter.databinding.ActivityMainBinding
import com.example.roboswagdelegateadapter.personal_data.PersonalDataDelegate
import com.example.roboswagdelegateadapter.personal_data.PersonalDataModel
import com.example.roboswagdelegateadapter.reg_data.RegDataModel

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = checkNotNull(_binding)
    private val baseAdapter = BaseAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val delegateAdapter = PersonalDataDelegate(::makeToast)
        baseAdapter.addNewDelegate(delegateAdapter)
        binding.rvMain.layoutManager = LinearLayoutManager(this)
        binding.rvMain.adapter = baseAdapter
        baseAdapter.submitList(
            listOf(
                PersonalDataModel(1, "Name", "user id", "initials"),
                RegDataModel(2, "Name", "user id"),
                PersonalDataModel(3, "Name2", "user id3", "initials4")
            )
        )
    }

    private fun makeToast() {
        Toast.makeText(this, "You are click item now!", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}