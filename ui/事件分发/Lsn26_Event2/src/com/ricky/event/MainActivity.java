package com.ricky.event;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends Activity implements OnTouchListener, OnClickListener {

	private Button button1;
	private RelativeLayout layout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button1 = (Button)findViewById(R.id.button1);
		layout = (RelativeLayout)findViewById(R.id.layout);
		
		layout.setOnTouchListener(this);
		button1.setOnTouchListener(this);
		
		layout.setOnClickListener(this);
		button1.setOnClickListener(this);
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		Log.i("ricky", "OnTouchListener:acton--"+event.getAction()+"----view:"+v);
		return false;
	}

	@Override
	public void onClick(View v) {
		Log.i("ricky", "OnClickListener----view:"+v);
	}

}
