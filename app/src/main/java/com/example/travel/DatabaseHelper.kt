package com.example.travel

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, "Arts", null, 1) {

    override fun onCreate(db: SQLiteDatabase) {
        // Tạo bảng nếu chưa tồn tại
        db.execSQL("CREATE TABLE IF NOT EXISTS arts (id INTEGER PRIMARY KEY, artname VARCHAR, artistname VARCHAR, year VARCHAR, image BLOB)")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // Xử lý logic nâng cấp cơ sở dữ liệu (nếu cần)
        db.execSQL("DROP TABLE IF EXISTS arts")
        onCreate(db)
    }
}