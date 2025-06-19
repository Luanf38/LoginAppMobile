package com.luanlima.loginscreen.ui.helpers

import androidx.annotation.StringRes
import androidx.compose.ui.res.stringResource
import com.luanlima.loginscreen.R

enum class Screens(@StringRes title: Int) {
    Login(title = R.string.login),
    Home(title = R.string.home)
}