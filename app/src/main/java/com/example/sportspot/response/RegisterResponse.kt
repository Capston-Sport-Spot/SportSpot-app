package com.example.sportspot.response

import com.google.gson.annotations.SerializedName

data class RegisterResponse(

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("user")
	val user: User? = null
)

//data class User(
//
//	@field:SerializedName("uid")
//	val uid: String? = null,
//
//	@field:SerializedName("displayName")
//	val displayName: String? = null,
//
//	@field:SerializedName("email")
//	val email: String? = null
//)
