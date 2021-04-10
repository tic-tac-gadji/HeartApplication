package codein.hackaton.heart.global

    open class MvpPresenter<Type : MvpView> {

        private lateinit var view: Type

        fun attachView(view: Type) {
            this.view = view
        }

        fun detachView() {
            this.view = view
        }

        protected fun getView(): Type {
            return view
        }
    }
