package com.example.paypark.database

import androidx.lifecycle.LiveData
import com.example.paypark.model.User

class UserRepository (
    private val userDao: UserDAO
){
    val allUsers: LiveData<List<User>> = userDao.getAllUsers()

    fun insertAll(user: User){
        userDao.insertAll(user)
    }

    suspend fun  updateUser(user: User){
        userDao.updateUsers((user))
    }

    suspend fun deleteUserEmail(email: String){
        userDao.deleteUserByEmail(email)
    }

    suspend fun getUserByEmail(email: String) : User?{
        return userDao.getUserByEmail(email)
    }

    suspend fun getUserByLoginInfo(email: String, password: String) : User?{
        return userDao.getUserByLoginInfo(email, password)
    }
}