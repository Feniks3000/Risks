package my.app.risks.mvp.model.entity

import android.os.Parcelable
import com.google.gson.annotations.Expose
import kotlinx.parcelize.Parcelize
import java.util.*

@Parcelize
data class Registry(
    @Expose val id: Long,
    @Expose val productionName: String,
    @Expose val evaluationModel: String,
    @Expose val scaleFrom: Int,
    @Expose val scaleTo: Int,
    @Expose val date: Date
) : Parcelable