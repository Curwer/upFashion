package com.hjalmarsson.fashion.ui.profile

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hjalmarsson.fashion.R

class ProfileFragment : Fragment() {

    private lateinit var vm: ProfileViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.profile_fragment, container, false)
        vm= ViewModelProviders.of(this).get(ProfileViewModel::class.java)
        return view
    }
}
