package my.app.risks.mvp.model.entity

import android.os.Parcelable
import com.google.gson.annotations.Expose
import kotlinx.parcelize.Parcelize
import java.util.*

@Parcelize
data class Event(
    @Expose val id: Long,
    @Expose val riskId: Long,
    @Expose val name: String,
    @Expose val responsible: String,
    @Expose val date: Date
) : Parcelable