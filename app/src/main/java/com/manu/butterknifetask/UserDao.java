package com.manu.butterknifetask;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.manu.butterknifetask.model.User;

import java.util.List;

@Dao
public interface UserDao {

    @Insert
    void insert(User user);

    @Query("DELETE FROM user_table")
    void deleteAll();

    @Query("SELECT * from user_table")
    List<User> getAllUsers();
}
