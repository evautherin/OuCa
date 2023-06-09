package app.myeline.ouca

import com.rickclephas.kmm.viewmodel.KMMViewModel
import com.rickclephas.kmm.viewmodel.MutableStateFlow
import com.rickclephas.kmp.nativecoroutines.NativeCoroutinesState

open class CounterViewModel: KMMViewModel() {

    @NativeCoroutinesState
    val count = MutableStateFlow(viewModelScope,0)

    fun incrementCount() {
        count.value++
    }

}