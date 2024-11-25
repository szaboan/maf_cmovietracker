package hu.szandras.cmovietracker.database;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import hu.szandras.cmovietracker.dao.MovieDao;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class MovieRepository_Factory implements Factory<MovieRepository> {
  private final Provider<MovieDao> movieDaoProvider;

  public MovieRepository_Factory(Provider<MovieDao> movieDaoProvider) {
    this.movieDaoProvider = movieDaoProvider;
  }

  @Override
  public MovieRepository get() {
    return newInstance(movieDaoProvider.get());
  }

  public static MovieRepository_Factory create(Provider<MovieDao> movieDaoProvider) {
    return new MovieRepository_Factory(movieDaoProvider);
  }

  public static MovieRepository newInstance(MovieDao movieDao) {
    return new MovieRepository(movieDao);
  }
}
