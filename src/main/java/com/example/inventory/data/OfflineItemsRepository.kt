package com.example.inventory.data

import kotlinx.coroutines.flow.Flow

class OfflineItemsRepository(private val itemDao: ItemDao, private val task: Task) : ItemsRepository {
    override fun getAllItemsStream(): Flow<List<Task>> = itemDao.getAllItems()

    override fun getItemStream(id: Int): Flow<Task?> = itemDao.getItem(id)

    override suspend fun insertItem(item: Task) = itemDao.insert(task)

    override suspend fun deleteItem(item: Task) = itemDao.delete(task)

    override suspend fun updateItem(item: Task) = itemDao.update(task)
}
