package eu.jahnestacado.iaccelerometer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity implements AccelerometerActivity {
	private AccelerometerSensor sensor;
	private TextView textViewX;
	private TextView textViewY;
	private TextView textViewZ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textViewX = (TextView) findViewById(R.id.textViewX);
		textViewY = (TextView) findViewById(R.id.textViewY);
		textViewZ = (TextView) findViewById(R.id.textViewZ);
		sensor = new AccelerometerSensor(this);

	}

	@Override
	public void onAccelerometerChange(int x, int y, int z) {
		textViewX.setText("X: " + x);
		textViewY.setText("Y: " + y);
		textViewZ.setText("Z: " + z);
	}

	@Override
	protected void onResume() {
		super.onResume();
		sensor.registerSensor();
	}

	@Override
	protected void onPause() {
		super.onPause();
		sensor.unregisterSensor();
	}

}
