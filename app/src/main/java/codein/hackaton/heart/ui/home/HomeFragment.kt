package codein.hackaton.heart.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import codein.hackaton.heart.R
import codein.hackaton.heart.global.BaseFragment
import codein.hackaton.heart.models.Make

class HomeFragment: BaseFragment(), HomeInterface {


    override val layoutRes = R.layout.fragment_home
    private var girdSpaceValue = 4
    private lateinit var recViewMake: RecyclerView
    private lateinit var presenter: HomePresenter
    lateinit var navController: NavController
    private val makeAdapter:HomeAdapter by lazy {
        HomeAdapter(

            makesClickListener = {
                val bundle = Bundle()
                bundle.putString("makesDescription", it.description)
                bundle.putString("makesNews", it.nickname)
                bundle.putString("makesImage", it.pic)
                navController.navigate(R.id.nav_details_makes, bundle)

            }

        )
    }
//    private val homeAdapter: HomeAdapter by lazy {
//        HomeAdapter(
//            itemWidth = (Utils.getDisplayWidth(context) - (girdSpaceValue *3 ) * DP.toInt()) / 2
//        )
//    }


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ):View = layoutInflater.inflate(R.layout.fragment_home, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recViewMake = view.findViewById(R.id.recViewMakes)
        presenter= HomePresenter()
        presenter.getMakesOnView()
        presenter.attachView(this)
        recViewMake.adapter = makeAdapter
        navController = Navigation.findNavController(view)
        initViews()
    }

    private  fun initViews(){
        recViewMake.run {
            layoutManager = GridLayoutManager(context, 2)
        }
    }

    override fun showMakesOnFragment(showMake: List<Make>) {
        makeAdapter.setData(showMake as ArrayList<Make>)
    }

    override fun startInfoActivity(homeFr: Make) {
    }

    override fun showProgress(show: Boolean) {
    }

    override fun showMessage(message: String) {
    }

    override fun onBackPressed(): Boolean {
        TODO("Not yet implemented")
    }
}