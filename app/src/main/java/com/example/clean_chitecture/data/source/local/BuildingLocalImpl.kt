package com.example.clean_chitecture.data.source.local

import com.example.clean_chitecture.data.source.BuildingDataSource
import com.example.clean_chitecture.model.Building

class BuildingLocalImpl(private val buildingDao: BuildingDao) : BuildingDataSource.Local {

    override suspend fun getAllBuildings(): List<Building> = buildingDao.getAllBuildings()

    override suspend fun getBuildingById(id: String): Building? = buildingDao.getBuildingById(id)

    override suspend fun insertBuilding(building: Building) = buildingDao.insertBuilding(building)

    override suspend fun insertMultiBuildings(buildings: List<Building>) = buildingDao.insertMultiBuildings(buildings)

    override suspend fun deleteBuilding(building: Building) = buildingDao.deleteBuilding(building)

    override suspend fun deleteAllBuildings() = buildingDao.deleteAllBuildings()
}