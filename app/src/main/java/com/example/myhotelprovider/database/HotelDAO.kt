package com.example.myhotelprovider.database

import android.database.Cursor
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface HotelDAO {

    @Query("SELECT * FROM guests")
    fun selectAllGuests(): Cursor

    @Insert
    fun insertGuest(newGuest: GuestEntity)

}