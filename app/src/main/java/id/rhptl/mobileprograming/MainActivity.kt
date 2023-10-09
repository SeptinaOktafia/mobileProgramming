package id.rhptl.mobileprograming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn_switch: Button
    private lateinit var btn_switchdata: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_switch = findViewById(R.id.btn_switch)
        btn_switch.setOnClickListener(this)

        btn_switchdata = findViewById(R.id.btn_switchdata)
        btn_switchdata.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_switch ->{
                val intent = Intent( this@MainActivity, Activity2::class.java)
                startActivity(intent)

            }
            R.id.btn_switchdata ->{
                val moveWithDataIntent = Intent(this@MainActivity, MainActivity3::class.java)
                moveWithDataIntent.putExtra(MainActivity3.EXTRA_NAME, "SEPTINA OKTAFIA")
                moveWithDataIntent.putExtra(MainActivity3.EXTRA_AGE, 22)
                moveWithDataIntent.putExtra(MainActivity3.EXTRA_JUR, "TEKNIK ELEKTORNIKA")
                startActivity(moveWithDataIntent)
            }

        }
    }


}