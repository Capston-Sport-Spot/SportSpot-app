package com.example.sportspot.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("user")
	val user: User? = null,

	@field:SerializedName("token")
	val token: String? = null
)

data class User(

	@field:SerializedName("uid")
	val uid: String? = null,

	@field:SerializedName("displayName")
	val displayName: String? = null,

	@field:SerializedName("email")
	val email: String? = null,

	@field:SerializedName("hp")
	val hp: String? = null,

	@field:SerializedName("alamat")
	val alamat: String? = null,

	@field:SerializedName("kota")
	val kota: String? = null
)
