package com.example.litterreportingapp.firebase;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseHelper {

    private DatabaseReference databaseReference;

    public FirebaseHelper() {
        // Ініціалізація Firebase
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference("pollutedAreas");
    }

    // Метод для додавання нової забрудненої ділянки
    public void addPollutedArea(PollutedArea area) {
        String id = databaseReference.push().getKey(); // Генерація унікального ID
        databaseReference.child(id).setValue(area);
    }

}


//// Додавання нової забрудненої ділянки
//FirebaseHelper firebaseHelper = new FirebaseHelper();
//

//PollutedArea area = new PollutedArea(latitude, longitude, photoUrl, comment);
//firebaseHelper.addPollutedArea(area);

