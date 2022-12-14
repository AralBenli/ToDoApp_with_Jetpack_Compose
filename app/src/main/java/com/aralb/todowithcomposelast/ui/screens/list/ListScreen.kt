package com.aralb.todowithcomposelast.ui.screens.list

import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ListScreen(
    navigateToTaskScreen: (Int) -> Unit
) {
    Scaffold(
        content = {},
        floatingActionButton = {
        ListFab(navigateToTaskScreen = navigateToTaskScreen)
        }
    )
}
@Composable
fun ListFab(
    navigateToTaskScreen: (Int) -> Unit
){
FloatingActionButton(onClick = {
            navigateToTaskScreen(-1)
}){
    Icon(imageVector = Icons.Filled.Add,
        contentDescription = "Add Button"
    )
}
}

@Composable
@Preview
private fun ListScreenPreview() {
    ListScreen(navigateToTaskScreen = {})
}