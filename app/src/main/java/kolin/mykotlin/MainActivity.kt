package kolin.mykotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.setOnClickListener {
            Toast.makeText(this, "弹个吐司看看", Toast.LENGTH_SHORT).show()
            tv.text = "${System.currentTimeMillis()}"
            startActivity(Intent(this@MainActivity, Main2Activity::class.java)
                    .putExtra("Key", "From Main Activity"))
      
        }
    }
}
