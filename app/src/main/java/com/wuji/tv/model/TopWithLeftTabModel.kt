package com.wuji.tv.model

import androidx.room.Embedded
import androidx.room.Relation
data class TopWithLeftTabModel(
    @Embedded
    val topTabModel: TopTabModel,
    @Relation(
        parentColumn = "topId",
        entityColumn = "leftTopId"
    )
    val leftTabs: List<LeftTabModel>
)
