package Behavioral.Observer

//Observable/subject
abstract class Subject {
    private var observers: MutableList<Observer> = ArrayList()

    abstract fun setState(state: String)
    abstract fun getState(): String

    fun attach(observer: Observer) {
        observers.add(observer)
    }

    fun detach(observer: Observer) {
        observers.remove(observer)
    }

    fun notifyObservers() = observers.forEach { it.update() }


}