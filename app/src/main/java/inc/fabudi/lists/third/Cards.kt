package inc.fabudi.lists.third

import android.graphics.Color
import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.O)
object Cards {
    val colors = arrayListOf(
        Color.parseColor("#FFFFCDD2"),
        Color.parseColor("#FFE1BEE7"),
        Color.parseColor("#FFB3E5FC"),
        Color.parseColor("#FFFFF9C4"),
        Color.parseColor("#FFFFCCBC"),
        Color.parseColor("#FFC8E6C9")
    )
    val texts = arrayListOf(
        "Achlys",
        "Aether",
        "Aion",
        "Nemesis",
        "Pontus",
        "Thalassa"
    )
}