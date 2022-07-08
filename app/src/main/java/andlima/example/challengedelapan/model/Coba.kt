package andlima.example.challengedelapan.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Coba(
    val title: String,
    val yearRelease: String
) : Parcelable