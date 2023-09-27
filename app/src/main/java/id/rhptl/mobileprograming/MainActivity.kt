package id.rhptl.mobileprograming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    // deklarasi variabel
    private lateinit var inputpanjang: EditText
    private lateinit var inputLebar: EditText
    private lateinit var inputtinggi: EditText
    private lateinit var btn: Button
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inisialisasi variabel
        inputpanjang= findViewById(R.id.edt_length)
        inputtinggi= findViewById(R.id.edt_width)
        inputLebar= findViewById(R.id.edt_height)

        btn.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        if (v?.id==R.id.btn_result){
            var tinggi = inputtinggi.text.toString().trim()
            var panjang = inputLebar.text.toString().trim()
            var Lebar = inputLebar.text.toString().trim()
            var volume = tinggi.toDouble() * panjang.toDouble() * Lebar.toDouble()
            result.text = volume.toString()
        }

    }
}