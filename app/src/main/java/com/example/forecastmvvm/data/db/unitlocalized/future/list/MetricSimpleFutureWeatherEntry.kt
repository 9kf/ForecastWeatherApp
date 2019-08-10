package com.example.forecastmvvm.data.db.unitlocalized.future.list

import androidx.room.ColumnInfo
import org.threeten.bp.LocalDate


class MetricSimpleFutureWeatherEntry(
    @ColumnInfo(name="date")
    override val date: LocalDate,
    @ColumnInfo(name="avgtempC")
    override val avgTemparature: Double,
    @ColumnInfo(name="condition_text")
    override val conditionText: String,
    @ColumnInfo(name="condition_icon")
    override val conditionIconUrl: String
): UnitSpecificSimpleFutureWeatherEntry