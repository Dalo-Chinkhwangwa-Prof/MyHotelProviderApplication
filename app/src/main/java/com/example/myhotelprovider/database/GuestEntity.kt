package com.example.myhotelprovider.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "guests")
data class GuestEntity(
    @PrimaryKey(autoGenerate = true) var guestId: Int?,
    @ColumnInfo(name = "guest_name") var guestName: String,
    @ColumnInfo(name = "room_number") var roomNumber: String,
    @ColumnInfo(name = "room_price") var roomPrice: Int
) {
    constructor(guestName: String, roomNumber: String, roomPrice: Int) : this(
        null,
        guestName,
        roomNumber,
        roomPrice
    )
}