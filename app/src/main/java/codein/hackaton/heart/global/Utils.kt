package codein.hackaton.heart.global

import android.content.Context
import android.content.res.Resources
import android.graphics.Point
import android.view.WindowManager
import androidx.fragment.app.Fragment
import org.jetbrains.anko.dip

class Utils {

    companion object {
        val DP = Resources.getSystem().displayMetrics.density
        fun getDisplayWidth(context: Context?): Int {
            val wm = context?.getSystemService(Context.WINDOW_SERVICE) as WindowManager
            val display = wm.defaultDisplay
            val point = Point()
            display.getRealSize(point)
            return point.x
        }
        fun Fragment.dip(value: Float): Int = requireActivity().dip(value)
    }

}