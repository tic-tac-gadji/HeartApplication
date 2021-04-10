package codein.hackaton.heart.ui.home

import codein.hackaton.heart.global.MvpView
import codein.hackaton.heart.models.Make

interface HomeInterface: MvpView {

        fun showMakesOnFragment(showMake: List<Make>)

        fun startInfoActivity(homeFr: Make)


    }

