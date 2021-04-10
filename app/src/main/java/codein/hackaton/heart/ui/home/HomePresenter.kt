package codein.hackaton.heart.ui.home


import codein.hackaton.heart.global.DataManager
import codein.hackaton.heart.global.MvpPresenter

open class HomePresenter() : MvpPresenter<HomeInterface>() {

    private val dataManager: DataManager by lazy(LazyThreadSafetyMode.NONE) {
        DataManager()
    }

    fun getMakesOnView() {

        dataManager.getMakesManager(
            onSuccess = { make ->
                getView().showMakesOnFragment(showMake = make)
            },
            onFailure = {

            }
        )
    }


}