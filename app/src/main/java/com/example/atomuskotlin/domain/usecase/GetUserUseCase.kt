package com.example.atomuskotlin.domain.usecase

import com.example.atomuskotlin.data.repository.UserRepository
import com.example.atomuskotlin.domain.entity.User

class GetUserUseCase(
    private val userRepository: UserRepository
) {
    suspend fun invoke(email: String) : User? {
        return userRepository.getUser(email)
    }
}