package fr.eni.nemoubliepas

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat

const val REQUEST_CODE_CALL = 65

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityCompat.requestPermissions(
            this,
            arrayOf(Manifest.permission.SEND_SMS),
            REQUEST_CODE_SEND_SMS
        )
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_CODE_SEND_SMS && grantResults[0] == 0) {
            val intentSms = Intent(
                Intent.ACTION_SENDTO,
                Uri.parse("smsto:0612345678")
            )

            intentSms.putExtra("sms_body", "Ne m'oublie pas frère")

            val button = findViewById<Button>(R.id.button)

            button.setOnClickListener {
                startActivity(intentSms)
            }
        }
    }
}