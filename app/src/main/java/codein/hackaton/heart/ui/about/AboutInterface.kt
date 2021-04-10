package codein.hackaton.heart.ui.about

import codein.hackaton.heart.global.MvpView
import codein.hackaton.heart.models.Make

interface AboutInterface:MvpView {
    fun showMakesOnFragment(showMake: List<Make>)

    fun startInfoActivity(homeFr: Make)
}
