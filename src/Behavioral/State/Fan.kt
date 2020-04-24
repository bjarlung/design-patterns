package Behavioral.State

class Fan() {

    private var fanOffState: State = FanOffState(this)
    private var fanLowState: State = FanLowState(this)
    private var fanMedState: State = FanMedState(this)
    private var fanHighState: State = FanHighState(this)

    private var state: State

    init {
        state = fanOffState
    }

    fun setState(state: State) {
        this.state = state
    }

    fun pullChain() {
        state.handleRequest()
    }

    fun getFanLowState(): State {
        return fanLowState
    }

    fun getFanMediumState(): State {
        return fanMedState
    }

    fun getFanHighState(): State {
        return fanHighState
    }

    fun getFanOffState(): State {
        return fanOffState
    }

    override fun toString(): String {
        return state.toString()
    }
}