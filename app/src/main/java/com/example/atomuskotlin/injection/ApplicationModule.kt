package com.example.atomuskotlin.injection

import android.content.Context
import androidx.room.Database
import androidx.room.Room

import com.esiea.android4a.domain.usecase.CreateUserUseCase
import com.example.atomuskotlin.data.local.AppDatabase
import com.example.atomuskotlin.data.local.DatabaseDao
import com.example.atomuskotlin.data.repository.UserRepository
import com.example.atomuskotlin.domain.usecase.GetUserUseCase
import com.example.atomuskotlin.presentation.main.MainViewModel

import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val presentationModule = module {
    factory { MainViewModel(get(), get()) }
}

val domainModule = module {
    factory { CreateUserUseCase(get()) }
    factory { GetUserUseCase(get()) }
}

val dataModule = module {
    single { UserRepository(get()) }
    single { createDataBase(androidContext()) }
}

fun createDataBase(context: Context): DatabaseDao {
    val appDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "database-name"
    ).build()
    return appDatabase.databaseDao()
}
