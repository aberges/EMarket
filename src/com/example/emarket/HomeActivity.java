package com.example.emarket;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.GridView;

public class HomeActivity extends Activity {
	GridView gridView;
	ArrayList<menuItem> gridArray = new ArrayList<menuItem>();
	CustomGridViewAdapter customGridAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		//set grid view item
		Bitmap homeIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.home);
		Bitmap userIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.personal);
		
		gridArray.add(new menuItem(homeIcon,"Home"));
		gridArray.add(new menuItem(userIcon,"User"));
		gridArray.add(new menuItem(homeIcon,"House"));
		gridArray.add(new menuItem(userIcon,"Friend"));
		gridArray.add(new menuItem(homeIcon,"Home"));
		gridArray.add(new menuItem(userIcon,"Personal"));
		gridArray.add(new menuItem(homeIcon,"Home"));
		gridArray.add(new menuItem(userIcon,"User"));
		gridArray.add(new menuItem(homeIcon,"Building"));
		gridArray.add(new menuItem(userIcon,"User"));
		gridArray.add(new menuItem(homeIcon,"Home"));
		gridArray.add(new menuItem(userIcon,"xyz"));
		
		
		gridView = (GridView) findViewById(R.id.gridView1);
		customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid, gridArray);
		gridView.setAdapter(customGridAdapter);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.login, menu);
	
		return true;
	}
	
	@Override
	protected void onPause() {
    super.onPause();
    }
	
	@Override
	protected void onResume() {
    super.onResume();
    }
  
	@Override
	protected void onDestroy(){
	  super.onDestroy();  
	}
}
