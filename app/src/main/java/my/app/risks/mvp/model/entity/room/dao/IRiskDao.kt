package my.app.risks.mvp.model.entity.room.dao

import androidx.room.*
import my.app.risks.mvp.model.entity.room.RoomRisk

@Dao
interface IRiskDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(risk: RoomRisk)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg risks: RoomRisk)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(risks: List<RoomRisk>)

    @Update
    fun update(risk: RoomRisk)

    @Update
    fun update(vararg risks: RoomRisk)

    @Update
    fun update(risks: List<RoomRisk>)

    @Delete
    fun delete(risk: RoomRisk)

    @Delete
    fun delete(vararg risks: RoomRisk)

    @Delete
    fun delete(risks: List<RoomRisk>)

    @Query("SELECT * FROM RoomRisk")
    fun getAll(): List<RoomRisk>

    @Query("SELECT * FROM RoomRisk WHERE id = :id")
    fun findById(id: Long): RoomRisk?

    @Query("SELECT * FROM RoomRisk WHERE registryId = :registryId")
    fun findByRegistryId(registryId: Long): List<RoomRisk>
}