package eu.jahnestacado.iaccelerometer;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

public class AccelerometerSensor implements SensorEventListener {
	private SensorManager sensorManager;
	private Sensor accelerometer;
	private OnAccelerometerChangeListener sensorActivity;
	
	public AccelerometerSensor(OnAccelerometerChangeListener sensorActivity){
		   this.sensorActivity = sensorActivity;
		   //get the sensor service
		   Activity activity = (Activity) sensorActivity;
		   sensorManager = (SensorManager) activity.getSystemService(Context.SENSOR_SERVICE);
		   //get the accelerometer sensor
		   accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
	}

	@Override
	public void onAccuracyChanged(android.hardware.Sensor arg0, int arg1) {
		// It is not being used
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		   int x = (int) event.values[0];
		   int y = (int) event.values[1];
		   int z = (int) event.values[2];
		   sensorActivity.onAccelerometerChange(x, y, z);
	}
	
    // Must be called in onResume() of the Activity
	public void registerSensor() {
		sensorManager.registerListener(this, accelerometer,SensorManager.SENSOR_DELAY_NORMAL);
	}
	
    // Must be called in onPause() of the Activity
	public void unregisterSensor() {
		sensorManager.unregisterListener(this);
	}

}
