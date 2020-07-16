package com.a100daysofcodehelper.screen.Stikes.ui.strike

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.a100daysofcodehelper.R
import kotlinx.android.synthetic.main.strike_fragment.*

class StrikeFragment : Fragment() {

    companion object {
        fun newInstance() = StrikeFragment()
    }

    private lateinit var viewModel: StrikeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(StrikeViewModel::class.java)
        return inflater.inflate(R.layout.strike_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        fabAddBtn.setOnClickListener(View.OnClickListener {
            findNavController().navigate(StrikeFragmentDirections.actionStrikeFragmentToDailyLoggerFragment())
        })
        super.onActivityCreated(savedInstanceState)
    }
}