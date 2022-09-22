package com.grabagrade.services;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import com.grabagrade.models.UserAuthModel;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public UserRecord storeAuthDetails(UserAuthModel userAuthModel) throws FirebaseAuthException
    {
        UserRecord.CreateRequest userAuthRequest = new UserRecord.CreateRequest()
                .setEmail(userAuthModel.getEmail())
                .setPassword(userAuthModel.getPassword());

        return FirebaseAuth.getInstance().createUser(userAuthRequest);
    }

}
