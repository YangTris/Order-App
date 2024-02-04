package com.example.orderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.orderapp.databinding.RegisterBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Register : AppCompatActivity() {
    private lateinit var binding: RegisterBinding
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RegisterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            //Toast.makeText(this,"Success saved",Toast.LENGTH_SHORT).show()
            print("asd")
        }
        /*binding.button.setOnClickListener {
            val userName= binding.userName.text.toString()
            val email=binding.email.text.toString()
            val phone= binding.phoneNumber.text.toString()
            val address= binding.address.text.toString()
            val password= binding.password.text.toString()
            //val confirmPassword= binding.confirmPassword.text.toString()
            database = FirebaseDatabase.getInstance().getReference("Users")
            val User=User(userName, email,password, phone,address)
            database.child(userName).setValue(User).addOnSuccessListener {
                binding.userName.text.clear()
                binding.email.text.clear()
                binding.phoneNumber.text.clear()
                binding.address.text.clear()
                binding.password.text.clear()

                Toast.makeText(this,"Success saved",Toast.LENGTH_SHORT).show()

            }.addOnFailureListener{
                Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()
            }
        //viewModel.userClicked()
        }*/

    }
}