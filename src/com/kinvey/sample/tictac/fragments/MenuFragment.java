package com.kinvey.sample.tictac.fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.actionbarsherlock.app.SherlockFragment;
import com.kinvey.sample.tictac.R;

public class MenuFragment extends SherlockFragment implements OnClickListener {

	private Button newGame;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
	}



	
	private void bindViews(View v) {

		newGame = (Button) v.findViewById(R.id.menu_newgame);
		newGame.setOnClickListener(this);
	}

	@Override
	public void onPause() {
		super.onPause();
	}

	@Override
	public void onClick(View v) {
		if (v == newGame) {
			FragmentTransaction ft = getSherlockActivity()
					.getSupportFragmentManager().beginTransaction();
			ft.replace(android.R.id.content, new GameFragment());
			ft.addToBackStack("Game");
			ft.commit();
		}
	}

	

}
