package com.example.orderapp

import com.google.firebase.database.Exclude

data class User (
    var uid: String? = "",
    val userName: String? = null,
    val email: String? = null,
    val password: String?=null,
    val phoneNumber: String?=null,
    val address: String?= null,
        ){
    @Exclude
    fun toMap(): Map<String, Any?> {
        return mapOf(
            "uid" to uid,
            "userName" to userName,
            "email" to email,
            "password" to password,
            "phoneNumber" to phoneNumber,
            "address" to address,
        )
    }
}