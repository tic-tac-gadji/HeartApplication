package codein.hackaton.heart.global

interface MvpView {

    fun showProgress(show: Boolean)

    fun showMessage(message: String)

    fun onBackPressed(): Boolean

}
