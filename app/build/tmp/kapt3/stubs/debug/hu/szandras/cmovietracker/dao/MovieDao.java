package hu.szandras.cmovietracker.dao;

import androidx.room.*;
import hu.szandras.cmovietracker.entity.MovieEntity;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0018\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000f"}, d2 = {"Lhu/szandras/cmovietracker/dao/MovieDao;", "", "deleteMovie", "", "movie", "Lhu/szandras/cmovietracker/entity/MovieEntity;", "getAllMovies", "Lkotlinx/coroutines/flow/Flow;", "", "getMovieById", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMovie", "updateMovie", "app_debug"})
@androidx.room.Dao()
public abstract interface MovieDao {
    
    @androidx.room.Query(value = "SELECT * FROM movies")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<hu.szandras.cmovietracker.entity.MovieEntity>> getAllMovies();
    
    @androidx.room.Query(value = "SELECT * FROM movies WHERE id = :movieId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMovieById(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super hu.szandras.cmovietracker.entity.MovieEntity> $completion);
    
    @androidx.room.Insert()
    public abstract void insertMovie(@org.jetbrains.annotations.NotNull()
    hu.szandras.cmovietracker.entity.MovieEntity movie);
    
    @androidx.room.Update()
    public abstract void updateMovie(@org.jetbrains.annotations.NotNull()
    hu.szandras.cmovietracker.entity.MovieEntity movie);
    
    @androidx.room.Delete()
    public abstract void deleteMovie(@org.jetbrains.annotations.NotNull()
    hu.szandras.cmovietracker.entity.MovieEntity movie);
}