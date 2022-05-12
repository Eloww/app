package fr.eni.nemoubliepas

import android.Manifest
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.AttributeSet
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import fr.eni.nemoubliepas.databinding.FragmentHomeBinding

const val REQUEST_CODE_SEND_SMS = 65

class HomeFragment : AppCompatActivity() {
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

            button.setOnClickListener{
                startActivity(intentSms)
            }
        }

    }

}