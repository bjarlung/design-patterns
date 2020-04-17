package Behavioral.Observer

abstract class Observer() {
    protected abstract val subject: Subject
    abstract fun update()
}