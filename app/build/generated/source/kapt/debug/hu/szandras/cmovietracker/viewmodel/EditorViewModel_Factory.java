package hu.szandras.cmovietracker.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import hu.szandras.cmovietracker.database.MovieRepository;
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
public final class EditorViewModel_Factory implements Factory<EditorViewModel> {
  private final Provider<MovieRepository> repositoryProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public EditorViewModel_Factory(Provider<MovieRepository> repositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.repositoryProvider = repositoryProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public EditorViewModel get() {
    return newInstance(repositoryProvider.get(), savedStateHandleProvider.get());
  }

  public static EditorViewModel_Factory create(Provider<MovieRepository> repositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new EditorViewModel_Factory(repositoryProvider, savedStateHandleProvider);
  }

  public static EditorViewModel newInstance(MovieRepository repository,
      SavedStateHandle savedStateHandle) {
    return new EditorViewModel(repository, savedStateHandle);
  }
}
