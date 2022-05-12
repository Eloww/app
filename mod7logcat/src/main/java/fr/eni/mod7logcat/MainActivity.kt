package fr.eni.mod7logcat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "On Create")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "On Pause")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "On Start")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "On Restart")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "On Stop")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "On Resume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "On Destroy")
    }
}