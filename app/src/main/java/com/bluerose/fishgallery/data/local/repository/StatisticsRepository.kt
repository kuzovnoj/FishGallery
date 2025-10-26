package com.bluerose.fishgallery.data.local.repository

import com.bluerose.fishgallery.data.local.entity.FishCatchDetails
import com.bluerose.fishgallery.data.local.entity.StatisticsDetails

class StatisticsRepository {
    fun getCommonStatistics(): StatisticsDetails {
        return StatisticsDetails(1.08E8, 5400000, 1500)
    }

    fun getFishCatchStatistics(): List<FishCatchDetails> {
        return listOf(
            FishCatchDetails("Призрачный дельфи", 50000000, "sds"),
            FishCatchDetails("Алмазный ус", 48000000, "sds"),
            FishCatchDetails("Шестиперая аку", 10000000, "sds"),
            )
    }
}