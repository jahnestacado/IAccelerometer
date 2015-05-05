IAccelerometer
============

###Android Accelerometer Sensor Interface

Example implementation that retrieves the accelerometers readings inside an Android Activity and displays the X, Y, Z axes values in TextViews.s

#####Step-by-Step Instructions
1. Implement OnAccelerometerChangeListener interface to your Android Activity
* Create an AccelerometerSensor object in your Activity
* In the onResume and onPause methods of the Android Activity call the registerSensor and the unregisterSensor methods (from the AccelerometerSensor object) respectively
* Retrieve accelerometers values(X, Y, Z) from the onAccelerometerChange method of your Activity
