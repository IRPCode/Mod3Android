package com.example.inventory.data
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao
interface ItemDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Task)

    @Update
    suspend fun update(item: Task)

    @Delete
    suspend fun delete(item: Task)

    @Query("SELECT * from tasks WHERE id = :id")
    fun getItem(id: Int): Flow<Task>

    @Query("SELECT * from tasks ORDER BY name ASC")
    fun getAllItems(): Flow<List<Task>>
}

