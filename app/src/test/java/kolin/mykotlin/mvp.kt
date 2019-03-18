package kolin.mykotlin

interface IView<out P : IPresenter<IView<P>>> {
    val presenter: P
}


interface IPresenter<out V : IView<IPresenter<V>>> {
    val view: V
}

abstract class BaseView<out P : IPresenter<BaseView<P>>> : IView<P>

abstract class BasePresneter<out V : IView<BasePresneter<V>>> : IPresenter<V>

