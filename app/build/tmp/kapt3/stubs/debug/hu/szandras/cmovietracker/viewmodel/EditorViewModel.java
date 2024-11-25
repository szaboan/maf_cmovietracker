package hu.szandras.cmovietracker.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import hu.szandras.cmovietracker.database.MovieRepository;
import hu.szandras.cmovietracker.entity.MovieEntity;
import hu.szandras.cmovietracker.uistate.MovieEditorUiState;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.StateFlow;
import java.util.Date;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0002J\u0015\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0011J\u000e\u0010 \u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001eJ\u000e\u0010!\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001eJ\b\u0010\"\u001a\u00020\u0011H\u0002J\b\u0010#\u001a\u00020\u0011H\u0002J\b\u0010$\u001a\u00020\u0011H\u0002J\b\u0010%\u001a\u00020\u0011H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006&"}, d2 = {"Lhu/szandras/cmovietracker/viewmodel/EditorViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lhu/szandras/cmovietracker/database/MovieRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lhu/szandras/cmovietracker/database/MovieRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lhu/szandras/cmovietracker/uistate/MovieEditorUiState;", "movieIdToEdit", "", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "addMovie", "", "deleteMovie", "fetchMovieEntityById", "id", "movieDetailsToMovieEntity", "Lhu/szandras/cmovietracker/entity/MovieEntity;", "withId", "", "updateDate", "newValue", "", "(Ljava/lang/Long;)V", "updateGenre", "", "updateMovie", "updateScore", "updateTitle", "validateFields", "validateGenre", "validateScore", "validateTitle", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class EditorViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final hu.szandras.cmovietracker.database.MovieRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<hu.szandras.cmovietracker.uistate.MovieEditorUiState> _uiState = null;
    private final int movieIdToEdit = 0;
    
    @javax.inject.Inject()
    public EditorViewModel(@org.jetbrains.annotations.NotNull()
    hu.szandras.cmovietracker.database.MovieRepository repository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<hu.szandras.cmovietracker.uistate.MovieEditorUiState> getUiState() {
        return null;
    }
    
    private final void validateFields() {
    }
    
    public final void updateTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String newValue) {
    }
    
    private final void validateTitle() {
    }
    
    public final void updateGenre(@org.jetbrains.annotations.NotNull()
    java.lang.String newValue) {
    }
    
    private final void validateGenre() {
    }
    
    public final void updateDate(@org.jetbrains.annotations.Nullable()
    java.lang.Long newValue) {
    }
    
    public final void updateScore(@org.jetbrains.annotations.NotNull()
    java.lang.String newValue) {
    }
    
    private final void validateScore() {
    }
    
    private final hu.szandras.cmovietracker.entity.MovieEntity movieDetailsToMovieEntity(boolean withId) {
        return null;
    }
    
    private final void fetchMovieEntityById(int id) {
    }
    
    public final void addMovie() {
    }
    
    public final void updateMovie() {
    }
    
    public final void deleteMovie() {
    }
}