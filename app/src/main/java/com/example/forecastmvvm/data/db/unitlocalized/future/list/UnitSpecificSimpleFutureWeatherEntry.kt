package com.example.forecastmvvm.data.db.unitlocalized.future.list

import org.threeten.bp.LocalDate


interface UnitSpecificSimpleFutureWeatherEntry {
    val date: LocalDate
    val avgTemparature: Double
    val conditionText: String
    val conditionIconUrl: String
}