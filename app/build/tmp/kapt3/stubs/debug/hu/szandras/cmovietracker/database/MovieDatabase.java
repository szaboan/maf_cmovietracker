package hu.szandras.cmovietracker.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import hu.szandras.cmovietracker.dao.MovieDao;
import hu.szandras.cmovietracker.entity.MovieEntity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lhu/szandras/cmovietracker/database/MovieDatabase;", "Landroidx/room/RoomDatabase;", "()V", "movieDao", "Lhu/szandras/cmovietracker/dao/MovieDao;", "app_debug"})
@androidx.room.Database(entities = {hu.szandras.cmovietracker.entity.MovieEntity.class}, version = 1)
public abstract class MovieDatabase extends androidx.room.RoomDatabase {
    
    public MovieDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract hu.szandras.cmovietracker.dao.MovieDao movieDao();
}