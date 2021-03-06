package com.manu.butterknifetask;

import android.app.Application;
import android.os.AsyncTask;

import com.manu.butterknifetask.model.User;

import java.util.List;

public class UserRepository {

    private UserDao mUserDao;
    private List<User> mAllUsers;

    UserRepository(Application application){
        UserRoomDatabase db = UserRoomDatabase.getDatabase(application);
        mUserDao = db.userDao();
        mAllUsers = mUserDao.getAllUsers();
    }

    List<User> getAllUsers(){
        return mAllUsers;
    }

    public void insert(User user){
        new insertAsyncTask(mUserDao).execute(user);
    }


    private static class insertAsyncTask extends AsyncTask<User, Void, Void>{

        private UserDao mAsyncTaskDao;

        insertAsyncTask(UserDao dao){
            mAsyncTaskDao = dao;
        }
        @Override
        protected Void doInBackground(User... users) {
            mAsyncTaskDao.insert(users[0]);
            return null;
        }
    }
}
