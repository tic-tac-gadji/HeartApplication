package codein.hackaton.heart.ui.about

import codein.hackaton.heart.global.DataManager
import codein.hackaton.heart.global.MvpPresenter

class AboutPresenter(): MvpPresenter<AboutInterface>() {

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