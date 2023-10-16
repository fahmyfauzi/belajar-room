package com.csm.belajarroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.csm.belajarroom.room.AppDatabase
import com.csm.belajarroom.room.entities.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = AppDatabase.getDatabase(this).userDao()
//        val user = User(12,"fahmy","fauzi")
//        db.insert(user)

        CoroutineScope(Dispatchers.IO).launch {
            val users: List<User> = db.getAll()
            Log.d("MainActivity","user: $users")
        }

    }
}