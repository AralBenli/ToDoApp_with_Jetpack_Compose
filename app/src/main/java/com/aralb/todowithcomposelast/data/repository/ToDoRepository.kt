package com.aralb.todowithcomposelast.data.repository

import com.aralb.todowithcomposelast.data.models.ToDoDao
import com.aralb.todowithcomposelast.data.models.ToDoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


@ViewModelScoped
class ToDoRepository @Inject constructor(private val todoDao : ToDoDao) {

    val getAllTasks : Flow<List<ToDoTask>> = todoDao.getAllTasks()
    val sortByLowPriority : Flow<List<ToDoTask>> = todoDao.sortByLowPriority()
    val highByLowPriority : Flow<List<ToDoTask>> = todoDao.sortByHighPriority()

    fun getSelectedTask(taskId : Int) :   Flow<ToDoTask> {
        return todoDao.getSelectedTask(taskId = taskId)
    }

    suspend fun addTask(toDoTask: ToDoTask){
        todoDao.addTask(toDoTask = toDoTask)
    }

    suspend fun updateTask(toDoTask: ToDoTask){
        todoDao.updateTask(toDoTask = toDoTask)
    }

    suspend fun deleteTask(toDoTask: ToDoTask){
        todoDao.deleteTask(toDoTask = toDoTask)
    }

    suspend fun deleteAllTask() {
        todoDao.deleteAllTask()
    }

    fun searchDatabase(searchQuery : String) : Flow<List<ToDoTask>>   {
        return todoDao.searchDataBase(searchQuery = searchQuery)
    }

}