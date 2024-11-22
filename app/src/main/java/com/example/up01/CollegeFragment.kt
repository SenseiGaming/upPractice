package com.example.up01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.mapview.MapView


class CollegeFragment : Fragment() {

    private lateinit var mapView: MapView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        MapKitFactory.setApiKey("5551c070-2176-4126-844e-108d2f1b814b")
        MapKitFactory.initialize(requireContext())
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_college, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mapView = view.findViewById(R.id.mapView)
        MapKitFactory.getInstance().onStart()
        mapView.onStart()
        val info: TextView = view.findViewById(R.id.textViewCollegeInfo)
        info.text = resources.getText(R.string.collegeinfo)
        mapView.map.move(
            CameraPosition(
                Point(51.245134, 58.462665),
                17.0f,150.0f,30.0f

            )
        )
    }

    override fun onStop() {
        mapView.onStop()
        MapKitFactory.getInstance().onStop()
        super.onStop()
    }
}