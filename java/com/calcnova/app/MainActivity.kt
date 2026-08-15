package com.calcnova.app

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MobileAds.initialize(this)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL

        val adView = AdView(this)
        adView.setAdSize(AdSize.BANNER)
        adView.adUnitId = "ca-app-pub-7009578840220882/1584397569"

        layout.addView(adView)

        setContentView(layout)

        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
    }
}
