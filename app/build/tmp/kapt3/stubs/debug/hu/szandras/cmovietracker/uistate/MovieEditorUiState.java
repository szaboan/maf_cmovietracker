package hu.szandras.cmovietracker.uistate;

import hu.szandras.cmovietracker.viewmodel.EditorValidationState;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010$\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\t\u0010%\u001a\u00020\u000eH\u00c6\u0003Jf\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010\'J\u0013\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020\u0006H\u00d6\u0001J\t\u0010+\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006,"}, d2 = {"Lhu/szandras/cmovietracker/uistate/MovieEditorUiState;", "", "isFetching", "", "isSaveCompleted", "currentMovieId", "", "title", "", "genre", "date", "", "score", "validationState", "Lhu/szandras/cmovietracker/viewmodel/EditorValidationState;", "(ZZILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Lhu/szandras/cmovietracker/viewmodel/EditorValidationState;)V", "getCurrentMovieId", "()I", "getDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getGenre", "()Ljava/lang/String;", "()Z", "getScore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "getValidationState", "()Lhu/szandras/cmovietracker/viewmodel/EditorValidationState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZZILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Lhu/szandras/cmovietracker/viewmodel/EditorValidationState;)Lhu/szandras/cmovietracker/uistate/MovieEditorUiState;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class MovieEditorUiState {
    private final boolean isFetching = false;
    private final boolean isSaveCompleted = false;
    private final int currentMovieId = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String genre = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long date = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer score = null;
    @org.jetbrains.annotations.NotNull()
    private final hu.szandras.cmovietracker.viewmodel.EditorValidationState validationState = null;
    
    public MovieEditorUiState(boolean isFetching, boolean isSaveCompleted, int currentMovieId, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String genre, @org.jetbrains.annotations.Nullable()
    java.lang.Long date, @org.jetbrains.annotations.Nullable()
    java.lang.Integer score, @org.jetbrains.annotations.NotNull()
    hu.szandras.cmovietracker.viewmodel.EditorValidationState validationState) {
        super();
    }
    
    public final boolean isFetching() {
        return false;
    }
    
    public final boolean isSaveCompleted() {
        return false;
    }
    
    public final int getCurrentMovieId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGenre() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getScore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final hu.szandras.cmovietracker.viewmodel.EditorValidationState getValidationState() {
        return null;
    }
    
    public MovieEditorUiState() {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final hu.szandras.cmovietracker.viewmodel.EditorValidationState component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final hu.szandras.cmovietracker.uistate.MovieEditorUiState copy(boolean isFetching, boolean isSaveCompleted, int currentMovieId, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String genre, @org.jetbrains.annotations.Nullable()
    java.lang.Long date, @org.jetbrains.annotations.Nullable()
    java.lang.Integer score, @org.jetbrains.annotations.NotNull()
    hu.szandras.cmovietracker.viewmodel.EditorValidationState validationState) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}