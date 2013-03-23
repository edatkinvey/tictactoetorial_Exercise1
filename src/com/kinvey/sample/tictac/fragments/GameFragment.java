package com.kinvey.sample.tictac.fragments;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.kinvey.sample.tictac.R;
import com.kinvey.sample.tictac.TicTac;

public class GameFragment extends SherlockFragment  {

	public enum WINNER {

		PLAYER("You won!"), COMPUTER("You lost!"), STALEMATE("It's a tie!");

		private String display;

		WINNER(String display) {
			this.display = display;

		}

		public String getDisplay() {
			return this.display;
		}

	}

	

	private static final int n = 3;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getSherlockActivity().supportInvalidateOptionsMenu();

		setHasOptionsMenu(true);
	}

	@Override
	public void onPause() {
		super.onPause();

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup group,
			Bundle saved) {
		View v = (LinearLayout) inflater.inflate(R.layout.fragment_tic_tac,
				group, false);

		return v;
	}




	

	

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		menu.clear();
		inflater.inflate(R.menu.fragment_game, menu);
	}




}
