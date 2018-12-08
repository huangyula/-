package com.ricky.event;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.WindowInsets;
import android.widget.Button;

public class MyButton extends Button {

	public MyButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent event) {
		Log.i("ricky", "dispatchTouchEvent:action--"+event.getAction());
		return super.dispatchTouchEvent(event);
//		return false;
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		Log.i("ricky", "onTouchEvent:action--"+event.getAction());
		super.onTouchEvent(event);
		return false;
	}
	
}
