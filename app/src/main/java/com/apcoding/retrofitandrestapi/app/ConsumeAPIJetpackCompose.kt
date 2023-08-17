package com.apcoding.retrofitandrestapi.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ConsumeAPIJetpackCompose : Application()
// Hilt requires you to annotate an Application class with @HiltAndroidApp.
//remember to add this in manifest file


