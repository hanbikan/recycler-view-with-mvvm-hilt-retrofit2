package com.example.recyclerviewwithmvvmhiltretrofit2.domain.translator

import com.example.recyclerviewwithmvvmhiltretrofit2.data.entity.User
import com.example.recyclerviewwithmvvmhiltretrofit2.domain.model.UserModel

/**
 * Translates [User] entity to [UserModel] to use in views.
 */
object UserTranslator {
    fun List<User>.toUserModelList() = map {
        UserModel(it.id, it.email, it.first_name + " " + it.last_name, it.avatar)
    }
}