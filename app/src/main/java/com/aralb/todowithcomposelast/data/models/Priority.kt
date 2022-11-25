package com.aralb.todowithcomposelast.data.models

import androidx.compose.ui.graphics.Color
import com.aralb.todowithcomposelast.ui.theme.HighPriorityColor
import com.aralb.todowithcomposelast.ui.theme.LowPriorityColor
import com.aralb.todowithcomposelast.ui.theme.MediumPriorityColor
import com.aralb.todowithcomposelast.ui.theme.NonePriorityColor

enum class Priority (val color: Color){
    LOW(LowPriorityColor),
    MEDIUM(MediumPriorityColor),
    HIGH(HighPriorityColor),
    NONE(NonePriorityColor)
}