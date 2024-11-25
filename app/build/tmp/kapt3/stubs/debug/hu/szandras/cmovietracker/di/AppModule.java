package hu.szandras.cmovietracker.di;

import android.content.Context;
import androidx.room.Room;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import hu.szandras.cmovietracker.dao.MovieDao;
import hu.szandras.cmovietracker.database.MovieDatabase;
import hu.szandras.cmovietracker.database.MovieRepository;
import javax.inject.Singleton;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0007\u00a8\u0006\r"}, d2 = {"Lhu/szandras/cmovietracker/di/AppModule;", "", "()V", "provideDatabase", "Lhu/szandras/cmovietracker/database/MovieDatabase;", "appContext", "Landroid/content/Context;", "provideMovieDao", "Lhu/szandras/cmovietracker/dao/MovieDao;", "database", "provideMovieRepository", "Lhu/szandras/cmovietracker/database/MovieRepository;", "movieDao", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final hu.szandras.cmovietracker.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final hu.szandras.cmovietracker.database.MovieRepository provideMovieRepository(@org.jetbrains.annotations.NotNull()
    hu.szandras.cmovietracker.dao.MovieDao movieDao) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final hu.szandras.cmovietracker.dao.MovieDao provideMovieDao(@org.jetbrains.annotations.NotNull()
    hu.szandras.cmovietracker.database.MovieDatabase database) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final hu.szandras.cmovietracker.database.MovieDatabase provideDatabase(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context appContext) {
        return null;
    }
}