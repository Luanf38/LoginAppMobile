package com.luanlima.loginscreen.ui.helpers

import androidx.annotation.StringRes
import com.luanlima.loginscreen.R

enum class Screens(@StringRes val title: Int) {
    Login(title = R.string.login),
    Home(title = R.string.home)
}