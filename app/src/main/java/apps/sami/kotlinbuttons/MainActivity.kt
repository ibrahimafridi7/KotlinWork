package apps.sami.kotlinbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.customtoast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOrder.setOnClickListener {

            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.customtoast, top)
                show()
            }
            val checkMeatRadioButtonId = rMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkMeatRadioButtonId)
            val kg1 = rKg1.isChecked
            val kg2 = rKg2.isChecked
            val kg3 = rKg3.isChecked
            val orderString = "You Have Successfully Order:\n" +
                    "${meat.text}" +
                    (if (kg1) "\n 1 KG" else "" ) +
                    (if(kg2) "\n 2 KG" else "") +
                    (if (kg3) "\n 3 KG" else "")
            tOrder.text = orderString

        }
    }
}