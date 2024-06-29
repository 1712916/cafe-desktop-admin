package compose.panel

import androidx.compose.ui.unit.IntSize

//import androidx.window.core.layout.WindowSizeClass
//import androidx.window.core.layout.WindowWidthSizeClass

enum class ViewSize {
    SMALL, MEDIUM, LARGE;

    companion object {
        var minSize: IntSize = IntSize(400,400)
            get() = field

        fun fromWindowSize(windowSize: IntSize): ViewSize {
            if (windowSize.width > 1792) {
                return LARGE
            } else if (windowSize.width > 768) {
                return MEDIUM
            }

            return SMALL
        }
    }
}