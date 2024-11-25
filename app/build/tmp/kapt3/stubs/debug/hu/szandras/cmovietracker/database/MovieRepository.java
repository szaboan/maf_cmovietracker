package hu.szandras.cmovietracker.database;

import hu.szandras.cmovietracker.dao.MovieDao;
import hu.szandras.cmovietracker.entity.MovieEntity;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\nJ\u0018\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lhu/szandras/cmovietracker/database/MovieRepository;", "", "movieDao", "Lhu/szandras/cmovietracker/dao/MovieDao;", "(Lhu/szandras/cmovietracker/dao/MovieDao;)V", "deleteMovie", "", "movie", "Lhu/szandras/cmovietracker/entity/MovieEntity;", "getAllMovies", "Lkotlinx/coroutines/flow/Flow;", "", "getMovieById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMovie", "updateMovie", "app_debug"})
public final class MovieRepository {
    @org.jetbrains.annotations.NotNull()
    private final hu.szandras.cmovietracker.dao.MovieDao movieDao = null;
    
    @javax.inject.Inject()
    public MovieRepository(@org.jetbrains.annotations.NotNull()
    hu.szandras.cmovietracker.dao.MovieDao movieDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<hu.szandras.cmovietracker.entity.MovieEntity>> getAllMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMovieById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super hu.szandras.cmovietracker.entity.MovieEntity> $completion) {
        return null;
    }
    
    public final void insertMovie(@org.jetbrains.annotations.NotNull()
    hu.szandras.cmovietracker.entity.MovieEntity movie) {
    }
    
    public final void updateMovie(@org.jetbrains.annotations.NotNull()
    hu.szandras.cmovietracker.entity.MovieEntity movie) {
    }
    
    public final void deleteMovie(@org.jetbrains.annotations.NotNull()
    hu.szandras.cmovietracker.entity.MovieEntity movie) {
    }
}