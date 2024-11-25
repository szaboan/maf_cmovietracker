package hu.szandras.cmovietracker.navigation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lhu/szandras/cmovietracker/navigation/Screen;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "MovieDetail", "MovieEditor", "MovieList", "Lhu/szandras/cmovietracker/navigation/Screen$MovieDetail;", "Lhu/szandras/cmovietracker/navigation/Screen$MovieEditor;", "Lhu/szandras/cmovietracker/navigation/Screen$MovieList;", "app_debug"})
public abstract class Screen {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    
    private Screen(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lhu/szandras/cmovietracker/navigation/Screen$MovieDetail;", "Lhu/szandras/cmovietracker/navigation/Screen;", "()V", "createRoute", "", "movieId", "", "app_debug"})
    public static final class MovieDetail extends hu.szandras.cmovietracker.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final hu.szandras.cmovietracker.navigation.Screen.MovieDetail INSTANCE = null;
        
        private MovieDetail() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String createRoute(int movieId) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lhu/szandras/cmovietracker/navigation/Screen$MovieEditor;", "Lhu/szandras/cmovietracker/navigation/Screen;", "()V", "createRoute", "", "movieId", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "app_debug"})
    public static final class MovieEditor extends hu.szandras.cmovietracker.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final hu.szandras.cmovietracker.navigation.Screen.MovieEditor INSTANCE = null;
        
        private MovieEditor() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String createRoute(@org.jetbrains.annotations.Nullable()
        java.lang.Integer movieId) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhu/szandras/cmovietracker/navigation/Screen$MovieList;", "Lhu/szandras/cmovietracker/navigation/Screen;", "()V", "app_debug"})
    public static final class MovieList extends hu.szandras.cmovietracker.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final hu.szandras.cmovietracker.navigation.Screen.MovieList INSTANCE = null;
        
        private MovieList() {
        }
    }
}