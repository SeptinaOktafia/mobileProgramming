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

    companion object{
        private const val STATE_RESULT ="state_result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inisialisasi variabel
        inputpanjang = findViewById(R.id.edt_length)
        inputLebar = findViewById(R.id.edt_height)
        inputtinggi = findViewById(R.id.edt_width)
        btn = findViewById(R.id.btn_result)
        result = findViewById(R.id.result)

        btn.setOnClickListener(this)

        //menampilkan value yang ada di budle
        if (savedInstanceState !=null) {
            result.text=savedInstanceState.getString(STATE_RESULT)
        }


    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT,result.text.toString());
    }



    override fun onClick(v: View?) {
        if (v?.id==R.id.btn_result){
            var panjang = inputpanjang.text.toString().trim()
            var lebar = inputLebar.text.toString().trim()
            var tinggi = inputtinggi.text.toString().trim()
            var volume = panjang.toDouble() * lebar.toDouble() * tinggi.toDouble()
            result.text = volume.toString()
        }

    }


}