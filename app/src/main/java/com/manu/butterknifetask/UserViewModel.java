package com.manu.butterknifetask;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import com.manu.butterknifetask.model.User;

import java.util.List;

public class UserViewModel extends AndroidViewModel {

    private UserRepository mRepository;

    private List<User> mAllUsers;

    public UserViewModel(@NonNull Application application) {
        super(application);
        mRepository = new UserRepository(application);
        mAllUsers = mRepository.getAllUsers();
    }

    List<User> getAllUsers(){
        return mAllUsers;
    }

    public void insert(User user){
        mRepository.insert(user);
    }
}
