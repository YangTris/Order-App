package com.example.orderapp

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import androidx.databinding.DataBindingUtil
import com.example.orderapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val db = Firebase.firestore
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Create a new user with a first and last name
        val user = hashMapOf(
            "userName" to "YangTris",
            "email" to "id.vantri@gmail.com",
            "password" to "123",
            "phoneNumber" to "123"
        )

// Add a new document with a generated ID
        db.collection("users")
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d(TAG, "DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w(TAG, "Error adding document", e)
            }
    }

    /*private fun readUserData() {
        // Assuming you have a collection named "users"
        db.collection("users")
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    //Log.d(TAG, "${document.id} => ${document.data}")
                    val userName = document.getString("userName")
                    val email = document.getString("email")
                    val password = document.getString("password")
                    val phoneNumber = document.getString("phoneNumber")

                    // Set data to ViewModel
                    val userModel = User("1",userName, email, password, phoneNumber,"1")
                    binding.viewModel = userModel
                }
            }
            .addOnFailureListener { exception ->
                Log.w(TAG, "Error getting documents.", exception)
            }
    }*/
}