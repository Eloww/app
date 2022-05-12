package fr.eni.mod6intentimpl

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat

const val REQUEST_CODE_CALL = 65

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ActivityCompat.requestPermissions(
            this,
            arrayOf(Manifest.permission.CALL_PHONE),
            65
        )

        // var intentSms = Intent(
        //     Intent.ACTION_VIEW,
        //     Uri.parse("sms:0612345678")
        // )
        // startActivity(intentSms)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_CODE_CALL && grantResults[0] == 0) {
            var intentTel = Intent(
                Intent.ACTION_CALL,
                Uri.parse("tel:0612345678")
            )

            startActivity(intentTel)
        }
    }
}