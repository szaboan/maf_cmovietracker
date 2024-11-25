package hu.szandras.cmovietracker.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import hu.szandras.cmovietracker.dao.MovieDao;
import hu.szandras.cmovietracker.database.MovieDatabase;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class AppModule_ProvideMovieDaoFactory implements Factory<MovieDao> {
  private final Provider<MovieDatabase> databaseProvider;

  public AppModule_ProvideMovieDaoFactory(Provider<MovieDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public MovieDao get() {
    return provideMovieDao(databaseProvider.get());
  }

  public static AppModule_ProvideMovieDaoFactory create(Provider<MovieDatabase> databaseProvider) {
    return new AppModule_ProvideMovieDaoFactory(databaseProvider);
  }

  public static MovieDao provideMovieDao(MovieDatabase database) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideMovieDao(database));
  }
}
