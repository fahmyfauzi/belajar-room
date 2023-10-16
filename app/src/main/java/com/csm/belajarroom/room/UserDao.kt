package com.csm.belajarroom.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.csm.belajarroom.room.entities.User

@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    fun getAll(): List<User>

    @Insert
   fun insert(user: User)

}