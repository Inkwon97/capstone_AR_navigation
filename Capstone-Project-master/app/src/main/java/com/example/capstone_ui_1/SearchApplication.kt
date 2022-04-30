package com.example.capstone_ui_1
import android.app.Application
import com.mapbox.search.MapboxSearchSdk
import com.mapbox.android.core.location.LocationEngineProvider

class SearchApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        MapboxSearchSdk.initialize(
                application = this,
                accessToken = getString(R.string.mapbox_access_token),
                locationEngine = LocationEngineProvider.getBestLocationEngine(this)
        )
    }
}

