package com.example.inventory.data

import kotlinx.coroutines.flow.Flow


interface ItemsRepository {

    fun getAllItemsStream(): Flow<List<Task>>

    fun getItemStream(id: Int): Flow<Task?>

    suspend fun insertItem(item: Task)

    suspend fun deleteItem(item: Task)

    suspend fun updateItem(item: Task)
}

