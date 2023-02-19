package com.example.figmadesigntask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.figmadesigntask.databinding.ActivityEditProfileAdvancedBinding

class EditProfileAdvanced : AppCompatActivity() {

    private lateinit var binding: ActivityEditProfileAdvancedBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileAdvancedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val array = mutableListOf<String>()
        val button: Button = findViewById(R.id.s_button)

        button.setOnClickListener {
            val email = binding.emailT.text.toString()
            binding.textView4.text = email

            val number = binding.phoneNumb.text
            binding.textView4.text = number.toString()

            val name = binding.nameText.text.toString()
            binding.textView4.text = name

            val all = " Your email is: \n$email " +
                    "\nYour phone is: \n$number" +
                    "\nName is: \n$name"
            binding.textView4.text = all

             var hobbies = "\nMy hobbies are: "
            for (i in array){
                hobbies +=i
            }
            binding.textView4.text = hobbies
        }


        //hobbies is here

        binding.dance.setOnCheckedChangeListener { buttonView, isChecked ->

            if (isChecked) {
                array.add(buttonView.text.toString())
            } else {
                if (array.contains(buttonView.text)) array.remove(buttonView.text.toString())
            }
        }
        binding.reading.setOnCheckedChangeListener { buttonView, isChecked ->

            if (isChecked) {
                array.add(buttonView.text.toString())
            } else {
                if (array.contains(buttonView.text)) array.remove(buttonView.text.toString())
            }
        }
        binding.listening.setOnCheckedChangeListener { buttonView, isChecked ->

            if (isChecked) {
                array.add(buttonView.text.toString())
            } else {
                if (array.contains(buttonView.text)) array.remove(buttonView.text.toString())
            }
        }
        binding.playing.setOnCheckedChangeListener { buttonView, isChecked ->

            if (isChecked) {
                array.add(buttonView.text.toString())
            } else {
                if (array.contains(buttonView.text)) array.remove(buttonView.text.toString())
            }
        }
        binding.coding.setOnCheckedChangeListener { buttonView, isChecked ->

            if (isChecked) {
                array.add(buttonView.text.toString())
            } else {
                if (array.contains(buttonView.text)) array.remove(buttonView.text.toString())
            }
        }
        binding.sleeping.setOnCheckedChangeListener { buttonView, isChecked ->

            if (isChecked) {
                array.add(buttonView.text.toString())
            } else {
                if (array.contains(buttonView.text)) array.remove(buttonView.text.toString())
            }
        }


//radiobutton


        binding.male.setOnCheckedChangeListener { buttonView, isChecked ->

            if (isChecked) {
                binding.textView4.text = "My gender is: ${binding.male.text}"
            }

        }
        binding.female.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
               binding.textView4.text = "My gender is:${binding.female.text}"
            }
        }
    }
}
