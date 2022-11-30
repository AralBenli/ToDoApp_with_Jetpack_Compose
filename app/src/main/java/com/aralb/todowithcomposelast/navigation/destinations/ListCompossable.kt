package com.aralb.todowithcomposelast.navigation.destinations

import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.aralb.todowithcomposelast.ui.screens.list.ListScreen
import com.aralb.todowithcomposelast.ui.viewmodels.SharedViewModel
import com.aralb.todowithcomposelast.util.Constants
import com.aralb.todowithcomposelast.util.Constants.LIST_ARGUMENT_KEY
import com.aralb.todowithcomposelast.util.Constants.LIST_SCREEN

@OptIn(ExperimentalMaterialApi::class)
fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (taskId: Int) -> Unit,
    sharedViewModel: SharedViewModel
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY) {
        type = NavType.StringType

        })
    ){
     ListScreen(
         navigateToTaskScreen = navigateToTaskScreen,
         sharedViewModel = sharedViewModel)

    }
}

