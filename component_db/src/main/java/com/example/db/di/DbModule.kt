package com.example.db.di

import android.content.Context
import com.example.db.AppDataBase
import com.example.db.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module(/*includes = [DbModelMappersModule::class]*/)
object DbModule {
    private const val DB_NAME = BuildConfig.APP_DB_NAME

    @Provides
    @Singleton
    fun provideAppDataBase(@ApplicationContext context: Context): AppDataBase {
        return AppDataBase.create(context = context, dbName = DB_NAME)
    }

//    @Provides
//    @PerApplication
//    fun provideProjectDbManager(
//        projectDao: ProjectDao,
//        @Named(DbModelMappersModule.NAMED_DB_PROJECT_MAPPER) projectDbMapper: BiMapper<Project, DbProject>
//    ): ProjectDbManager {
//        return ProjectDbManagerImpl(
//            projectDao = projectDao, dbProjectMapper = projectDbMapper
//        )
//    }
}
