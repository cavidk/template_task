package com.example.figmadesigntask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.figmadesigntask.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_edit_profile_advanced.*

class EditProfileAdvanced : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_edit_profile_advanced)

     save_button.setOnClickListener {
        emailT.text = "My email is ${binding.}"
     }



    }


}