IAccelerometer
============

###Easy Integration of Androids Accelerometer sensor

The example code provides an easy implementation of Android Accelerometer sensor from a non-Activity class

#####Instructions Step-by-Step
1. Implement IAccelerometerActivity interface to your Android Activity
* Create an AccelerometerSensor object in your Activity
* In the onResume and onPause methods of the Android Activity call the registerSensor and the unregisterSensor methods (from the AccelerometerSensor object) respectively
* Retrieve accelerometers values(X, Y, Z) from the onAccelerometerChange method of your Activity
