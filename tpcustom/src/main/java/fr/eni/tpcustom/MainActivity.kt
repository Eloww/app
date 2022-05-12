package fr.eni.tpcustom

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import fr.eni.tpcustom.databinding.ActivityMainBinding

const val REQUEST_CODE_CALL = 65

class MainActivity : AppCompatActivity() {
    lateinit var amb: ActivityMainBinding
    lateinit var vm: DataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this, R.layout.activity_main)
        vm = ViewModelProvider(this)[DataViewModel::class.java]

        vm.value.observe(this) {
            amb.textView.text = vm.value.value.toString()
        }

        amb.button6.setOnClickListener {
            vm.random("button6")
        }

        amb.button12.setOnClickListener {
            vm.random("button12")
        }

        amb.button16.setOnClickListener {
            vm.random("button16")
        }

        amb.button20.setOnClickListener {
            vm.random("button20")
        }

        amb.floatingActionButton.setOnClickListener {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.SEND_SMS),
                REQUEST_CODE_CALL
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == REQUEST_CODE_CALL && grantResults[0] == 0) {
            val intentSms = Intent(
                Intent.ACTION_SENDTO,
                Uri.parse("smsto:0606060606")
            )

            intentSms.putExtra("sms_body", "J'ai lancé le dé et j'ai obtenue ${vm.value.value}")

            startActivity(intentSms)
        }
    }
}