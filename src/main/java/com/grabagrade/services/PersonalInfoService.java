package com.grabagrade.services;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.grabagrade.models.PersonalInfoModel;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class PersonalInfoService {

    private static final String COL_NAME= "pInfo";

    public String saveInfo(PersonalInfoModel infoClass) throws ExecutionException, InterruptedException
    {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionApiFuture = dbFirestore.collection(COL_NAME).document().set(infoClass);

        return collectionApiFuture.get().getUpdateTime().toString();
    }
}
