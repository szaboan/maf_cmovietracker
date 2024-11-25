package hu.szandras.cmovietracker.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import hu.szandras.cmovietracker.dao.MovieDao;
import hu.szandras.cmovietracker.database.MovieRepository;
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
public final class AppModule_ProvideMovieRepositoryFactory implements Factory<MovieRepository> {
  private final Provider<MovieDao> movieDaoProvider;

  public AppModule_ProvideMovieRepositoryFactory(Provider<MovieDao> movieDaoProvider) {
    this.movieDaoProvider = movieDaoProvider;
  }

  @Override
  public MovieRepository get() {
    return provideMovieRepository(movieDaoProvider.get());
  }

  public static AppModule_ProvideMovieRepositoryFactory create(
      Provider<MovieDao> movieDaoProvider) {
    return new AppModule_ProvideMovieRepositoryFactory(movieDaoProvider);
  }

  public static MovieRepository provideMovieRepository(MovieDao movieDao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideMovieRepository(movieDao));
  }
}
