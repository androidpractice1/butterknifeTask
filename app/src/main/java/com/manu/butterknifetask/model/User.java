package com.manu.butterknifetask.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "user_table")
public class User
{
//    public static final String TABLE_NAME = "users";
//
//    public static final String COLUMN_ID = "id";
//    public static final String COLUMN_FIRST_NAME = "firstName";
//    public static final String COLUMN_LAST_NAME = "lastName";
//    public static final String COLUMN_EMAIL = "email";
//    public static final String COLUMN_PASSWORD = "password";
//
//    private String id, firstName, lastName, email, password;
//
//    public User(int id, String firstName, String lastName, String email, String password){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.password = password;
//    }
//
//
//    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "( " +
//            COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//            COLUMN_FIRST_NAME + " TEXT," +
//            COLUMN_LAST_NAME + " TEXT," +
//            COLUMN_EMAIL + " TEXT," +
//            COLUMN_PASSWORD + " TEXT " + " )";
//
//    public User(){}
//
//    public User(String firstName, String lastName, String email, String password){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.password = password;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }



    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    private long id;

    @NonNull
    @ColumnInfo(name = "first_name")
    private String firstName;

    @NonNull
    @ColumnInfo(name = "last_name")
    private String lastName;

    @NonNull
    @ColumnInfo(name = "email")
    private String email;

    @NonNull
    @ColumnInfo(name = "password")
    private String password;


    @NonNull
    public long getId() {
        return id;
    }

    public void setId(@NonNull long id) {
        this.id = id;
    }

    @NonNull
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NonNull String firstName) {
        this.firstName = firstName;
    }

    @NonNull
    public String getLastName() {
        return lastName;
    }

    public void setLastName(@NonNull String lastName) {
        this.lastName = lastName;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }
}
