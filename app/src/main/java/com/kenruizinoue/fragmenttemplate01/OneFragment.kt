package com.kenruizinoue.fragmenttemplate01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class OneFragment : Fragment() {

    private lateinit var goToButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_one, container, false)
        goToButton = rootView.findViewById(R.id.gotoButton)

        goToButton.setOnClickListener {
            val fm = fragmentManager

            // replace method for using another fragment
            // addToBackStack adds the fragment to the backstack so you can return to OneFragment
            fm!!.beginTransaction().replace(R.id.fragmentContainer, TwoFragment(), "TwoFragment")
                .addToBackStack(null).commit()
            // you can remove the fragment with this code
            //fm!!.beginTransaction().remove(FragmentOne()).commit()

        }
        return rootView
    }

}