package com.aralb.todowithcomposelast.navigation

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.aralb.todowithcomposelast.navigation.destinations.listComposable
import com.aralb.todowithcomposelast.navigation.destinations.taskComposable
import com.aralb.todowithcomposelast.ui.viewmodels.SharedViewModel
import com.aralb.todowithcomposelast.util.Constants.LIST_SCREEN

@ExperimentalMaterialApi
@Composable
fun SetupNavigation(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val screen = remember(navController){
        Screens(navController = navController)
    }
    NavHost(navController = navController,
        startDestination = LIST_SCREEN){
        listComposable(
            navigateToTaskScreen = screen.task,
            sharedViewModel = sharedViewModel
        )
        taskComposable(
            navigateToListScreen = screen.list
        )
    }
}