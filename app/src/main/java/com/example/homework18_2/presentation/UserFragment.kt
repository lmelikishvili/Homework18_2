package com.example.homework18_2.presentation

import androidx.fragment.app.viewModels
import com.example.homework18_2.databinding.FragmentUserBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserFragment : BaseFragment<FragmentUserBinding>(FragmentUserBinding::inflate) {
    private val viewModel: UserViewModel by viewModels()
    override fun setup() {
        viewModel.getUsers()

    }

    override fun setupListeners() {

    }

    override fun bindData() {

    }

}