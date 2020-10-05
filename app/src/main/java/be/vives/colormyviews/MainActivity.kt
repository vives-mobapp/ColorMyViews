package be.vives.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(box_one, box_two, box_three, box_four, box_five)

        for (item in clickableViews) {
            item.setOnClickListener {
                makeColored(item)
            }
        }
    }

    fun makeColored(view: View) {
        var color = when (view.id) {
            R.id.box_one -> android.R.color.holo_orange_dark
            R.id.box_two -> android.R.color.black

            R.id.box_three -> android.R.color.holo_green_light
            R.id.box_four -> android.R.color.holo_green_dark
            R.id.box_five -> android.R.color.holo_green_light

            else -> Color.LTGRAY
        }

        view.setBackgroundResource(color)
    }

}