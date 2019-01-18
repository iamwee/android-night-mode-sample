package com.github.iamwee.nightmodesample.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> Unit) {
    val transaction = beginTransaction().apply(func)
    try {
        transaction.commit()
    } catch (e: Exception) {
        transaction.commitAllowingStateLoss()
    }
}

inline fun <reified T> Fragment.delegate(): T? {
    (activity as? T)?.let { return it }
    (targetFragment as? T)?.let { return it }
    (parentFragment as? T)?.let { return it }
}

fun consume(func: () -> Unit): Boolean {
    func()
    return true
}