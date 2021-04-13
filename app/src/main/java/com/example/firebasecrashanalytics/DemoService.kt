package com.example.firebasecrashanalytics

import android.util.JsonToken
import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class DemoService:FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d("onNewToken","${token}")
        print(token)
    }
}