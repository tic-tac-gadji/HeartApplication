package codein.hackaton.heart.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import codein.hackaton.heart.R

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboarPresenter

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ) = layoutInflater.inflate(R.layout.fragment_dashboard, container, false)
}