package com.skram_master.resource.room_settings

import io.ktor.resources.Resource
import kotlinx.serialization.Serializable

// TODO: Delete suppress when implementing the class
@Suppress("UtilityClassWithPublicConstructor")
@Serializable
@Resource("api/v1/room_settings")
class RoomSettingsV1 {
    companion object {
        val tags = listOf("RoomSettings")
    }
}
