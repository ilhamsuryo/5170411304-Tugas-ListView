package com.example.listviewtugasc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import  kotlinx.android.synthetic.main.activity_main.*
import com.example.listviewtugasc.ListAdapter as ListAdapter


class MainActivity : AppCompatActivity() {

    val languages = arrayOf<String>("Ir. Soekarno", "Soeharto", "B.J. Habiebie", "Abdurahman Wahid",
        "Megawati Soekarnoputri", "Susilo Bambang Yudhoyono", "Joko Widodo")

    val description = arrayOf<String>(
        "6 Juni 1901 - 21 Juni 1970" +
            "Soekarno adalah presiden pertama Indonesia",
        "8 Juni 1921 - 27 Januari 2008" +
                "Soeharto adalah presiden kedua Indonesia",
        "25 Juni 1936 - 11 September 2019" +
            "BJ Habiebie adalah presiden ketiga Indonesia",
        "7 September 1940 - 30 Desember 2009" +
            "Abdurrahman Wahid adalah presiden keempat Indonesia",
        "23 Januari 1947 - Sekarang" +
                "Megawati Soekarnoputri adalah presiden kelima Indonesia",
        "9 September 1949 - Sekarang" +
                "Susilo Bambang Yudhoyono adalah presiden keenam Indonesia",
        "21 Juni 1961 - Sekarang" +
                "Joko Widodo adalah presiden ketuju Indonesia"
    )

    val imageId = arrayOf<Int>(
        R.mipmap.soekarno, R.mipmap.soeharto, R.mipmap.habiebie,
        R.mipmap.gusdur, R.mipmap.megawati, R.mipmap.sby, R.mipmap.jokowi
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ListAdapter = ListAdapter(this, languages, description, imageId)
        list_view.adapter = ListAdapter

        list_view.setOnItemClickListener() { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(
                this,
                "${languages[position]}, ${description[position]}", Toast.LENGTH_LONG
            ).show()
        }

    }
}
