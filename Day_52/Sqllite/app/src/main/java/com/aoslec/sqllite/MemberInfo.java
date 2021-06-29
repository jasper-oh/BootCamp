package com.aoslec.sqllite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MemberInfo extends SQLiteOpenHelper {

    public MemberInfo(Context context){
        super(context , "MemberInfo.db",null,1);

    }

    // 앱을 처음 쓸때 사용하는 메소드
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query =  "CREATE TABLE member(id INTEGER PRIMARY KEY AUTOINCREMENT , " +
                "username TEXT , userid TEXT ,passwd INTEGER)";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS member";
        db.execSQL(query);
        onCreate(db);
    }
}
