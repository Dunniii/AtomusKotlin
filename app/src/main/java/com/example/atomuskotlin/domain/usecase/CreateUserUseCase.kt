package com.esiea.android4a.domain.usecase

import com.example.atomuskotlin.data.repository.UserRepository
import com.example.atomuskotlin.domain.entity.User


class CreateUserUseCase(
    private val userRepository: UserRepository
) {
    suspend fun invoke(user: User){
        userRepository.createUser(user)
    }
}