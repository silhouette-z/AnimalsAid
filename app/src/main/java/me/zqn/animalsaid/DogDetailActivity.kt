package me.zqn.animalsaid

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DogDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog_detail)

        val imageView: ImageView = findViewById(R.id.image)
        val textView1: TextView = findViewById(R.id.title)
        val textView2: TextView = findViewById(R.id.discription)

        val nameId: Int = intent.extras!!.getInt("name")
        textView1.text = resources.getString(nameId)

        val picId: Int = intent.extras!!.getInt("pic")
        imageView.setImageResource(picId)

        val detailId: Int = intent.extras!!.getInt("detail")
        textView2.text = resources.getString(detailId)
    }
}