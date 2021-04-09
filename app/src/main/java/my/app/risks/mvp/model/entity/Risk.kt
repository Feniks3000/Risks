package my.app.risks.mvp.model.entity

import android.os.Parcelable
import com.google.gson.annotations.Expose
import kotlinx.parcelize.Parcelize

@Parcelize
data class Risk(
    @Expose val id: Long,
    @Expose val registryId: Long,
    @Expose val typeId: Long,
    @Expose val name: String,
    @Expose val occurrenceProbability: Float,
    @Expose val detectionProbability: Float,
    @Expose val significance: Float,
    @Expose val value: Float,
    @Expose val priority: Int
) : Parcelable