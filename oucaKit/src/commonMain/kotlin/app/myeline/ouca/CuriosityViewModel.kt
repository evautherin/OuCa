package app.myeline.ouca

import com.rickclephas.kmm.viewmodel.KMMViewModel
import com.rickclephas.kmm.viewmodel.MutableStateFlow
import com.rickclephas.kmp.nativecoroutines.NativeCoroutinesState

open class CuriosityViewModel: KMMViewModel() {

    val historicCuriosity = HistoricCuriosity(
        "Tour Eiffel",
        1.0F,
        1.1F
    )
    val artisticCuriosity = ArtisticCuriosity(
        "Joconde",
        2.0F,
        2.1F
    )
    @NativeCoroutinesState
    val curiosity = MutableStateFlow<Curiosity>(viewModelScope,historicCuriosity)

    fun getCuriosity() {
        curiosity.value = artisticCuriosity
    }

}