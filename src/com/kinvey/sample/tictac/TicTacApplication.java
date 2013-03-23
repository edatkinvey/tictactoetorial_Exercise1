package com.kinvey.sample.tictac;

import android.app.Application;
import android.util.Log;

import com.kinvey.android.Client;
import com.kinvey.java.core.KinveyClientCallback;

public class TicTacApplication extends Application {

	private Client myClient = null;
	

	@Override
	public void onCreate() {
		super.onCreate();

	}

	public Client getClient() {
		if (myClient == null) {
			myClient = new Client.Builder(getApplicationContext()).build();
		}
		return this.myClient;
	}


}
