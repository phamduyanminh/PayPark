package com.example.paypark.viewmodels

import android.app.Application
import android.service.autofill.UserData
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.paypark.database.PayParkDatabase
import com.example.paypark.database.UserRepository
import com.example.paypark.model.User

class UserViewModel(application: Application) : AndroidViewModel(application) {
    private val userRepo: UserRepository
    var allUser: LiveData<List<User>>

    init {
        val userDao = PayParkDatabase.getDatabase(application).userDao()
        userRepo = UserRepository(userDao)
        allUser = userRepo.allUsers
    }

    /*
    *insertAll method will create new user record in the database
    */
    fun insertAll(user: User){

    }
}