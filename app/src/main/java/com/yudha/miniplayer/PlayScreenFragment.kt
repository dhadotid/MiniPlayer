package com.yudha.miniplayer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * Created by dhadotid on 14.54 | 16/07/21.
 * -> ✉ : yudhapurbajagad@gmail.com <-
 */

class PlayScreenFragment: Fragment() {

    companion object {
        fun newInstance(): PlayScreenFragment {
            val args = Bundle()
            val playScreenFragment = PlayScreenFragment()
            playScreenFragment.arguments = args
            return playScreenFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_play_screen, container, false)
    }
}