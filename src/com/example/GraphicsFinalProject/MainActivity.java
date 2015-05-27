package com.example.GraphicsFinalProject;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
  /**
   * Called when the activity is first created.
   */
  private EditText srcLong, srcLat;
  private EditText destLong, destLat;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    srcLong = (EditText) findViewById(R.id.SrcLong);
    srcLat = (EditText) findViewById(R.id.SrcLat);
    destLong = (EditText) findViewById(R.id.DestLong);
    destLat = (EditText) findViewById(R.id.DestLat);
  }

  public void EnterLatLong(View view) {
    if (view instanceof Button) {
      String longitude_src = srcLong.getText().toString();
      String latitude_src = srcLat.getText().toString();
      String longitude_dest = destLong.getText().toString();
      String latitude_dest = destLat.getText().toString();

      System.out.println("Start at " + longitude_src + ", " + latitude_src + " and End at " + longitude_dest + ", " + latitude_dest);
    }
  }
}
