package com.manu.butterknifetask;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.manu.butterknifetask.model.User;

@Database(entities = {User.class}, version = 1)
public abstract class UserRoomDatabase extends RoomDatabase {


    public abstract  UserDao userDao();


    private static  UserRoomDatabase instance;

    public static UserRoomDatabase getDatabase(final Context context){
        if (instance == null){
            synchronized (UserRoomDatabase.class){
                if (instance == null){
                    //Create Database Here
                    instance = Room.databaseBuilder(context.getApplicationContext(),
                            UserRoomDatabase.class, "user_database")
                            .build();
                }
            }
        }

        return instance;
    }

    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }
}
