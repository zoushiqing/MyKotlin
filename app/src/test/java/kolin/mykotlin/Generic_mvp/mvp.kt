package kolin.mykotlin.Generic_mvp

import java.lang.reflect.ParameterizedType

/**
 * desc:
 */

interface IView<out P : IPresenter<IView<P>>> {
    val presenter: P
}

interface IPresenter<out V : IView<IPresenter<V>>> {
    val view: V
}

abstract class BaseView<out P : BasePresenter<BaseView<P>>> : IView<P> {

    override val presenter: P

    init {
        presenter = findPresenterClass().newInstance()
        presenter.view = this
    }

    private fun findPresenterClass(): Class<P> {
        val thisClass: Class<*> = this.javaClass
        while (true) {
            (thisClass.genericInterfaces as? ParameterizedType)?.actualTypeArguments?.first()
            
        }
    }
}

abstract class BasePresenter<out V : IView<IPresenter<V>>> : IPresenter<V> {
    override lateinit var view: @UnsafeVariance V
}

class MainView : BaseView<MainPresenter>()

class MainPresenter : BasePresenter<MainView>()