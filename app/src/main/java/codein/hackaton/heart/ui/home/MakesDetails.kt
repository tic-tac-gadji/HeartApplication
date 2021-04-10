package codein.hackaton.heart.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import codein.hackaton.heart.R
import codein.hackaton.heart.global.BaseFragment
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_details_makes.*
import kotlinx.android.synthetic.main.fragment_details_makes.view.*

class MakesDetails: BaseFragment() {

    override val layoutRes = R.layout.fragment_details_makes
    private lateinit var titlenews: String
    private lateinit var descriptionnews: String
    private lateinit var imagenews: String
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = layoutInflater.inflate(R.layout.fragment_details_makes, container, false)

    override fun onCreate(savedInstanceState: Bundle?) {
        descriptionnews = arguments?.getString("makesDescription")!!
        titlenews = arguments?.getString("makesTitle")!!
        imagenews = arguments?.getString("makesImage")!!
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        navController = Navigation.findNavController(view)
        toolbar_main.setNavigationOnClickListener {
            navController.navigate(R.id.action_nav_details_makes_to_navigation_home)
        }
        textnews.setText(titlenews)
        descriptionNews.setText(descriptionnews)
        Picasso
            .get()
            .load(imagenews)
            .into(view.imageNews)

        super.onViewCreated(view, savedInstanceState)

    }
}