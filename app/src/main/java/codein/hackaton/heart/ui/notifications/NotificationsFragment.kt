package codein.hackaton.heart.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import codein.hackaton.heart.R

class NotificationsFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View = layoutInflater.inflate(R.layout.fragment_notifications, container, false)



}