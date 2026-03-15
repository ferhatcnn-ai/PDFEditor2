<?xml version="1.0" encoding="utf-8"?>
<androidx.coordinatorlayout.widget.CoordinatorLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#F0F0F0">

    <com.google.android.material.appbar.AppBarLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <androidx.appcompat.widget.Toolbar
            android:id="@+id/toolbar"
            android:layout_width="match_parent"
            android:layout_height="?attr/actionBarSize"
            android:background="@color/surface"
            app:titleTextColor="@color/on_surface" />
    </com.google.android.material.appbar.AppBarLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        app:layout_behavior="@string/appbar_scrolling_view_behavior">

        <!-- PDF sayfası + çizim katmanı -->
        <FrameLayout
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1">

            <androidx.core.widget.NestedScrollView
                android:layout_width="match_parent"
                android:layout_height="match_parent">

                <ImageView
                    android:id="@+id/ivPdfPage"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:adjustViewBounds="true"
                    android:scaleType="fitStart"
                    android:background="@android:color/white" />

            </androidx.core.widget.NestedScrollView>

            <com.pdfeditor.app.ui.views.DrawingOverlayView
                android:id="@+id/drawingOverlay"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:background="@android:color/transparent" />

            <TextView
                android:id="@+id/tvError"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:text="@string/error_opening_file"
                android:textColor="@color/error"
                android:visibility="gone" />

            <ProgressBar
                android:id="@+id/progressBar"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:visibility="gone" />

        </FrameLayout>

        <!-- Sayfa navigasyonu -->
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="40dp"
            android:orientation="horizontal"
            android:gravity="center"
            android:background="@color/surface">

            <ImageButton
                android:id="@+id/btnPrevPage"
                android:layout_width="40dp"
                android:layout_height="40dp"
                android:src="@android:drawable/ic_media_previous"
                android:background="?attr/selectableItemBackgroundBorderless"
                android:contentDescription="Önceki sayfa" />

            <TextView
                android:id="@+id/tvPageInfo"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="1 / 1"
                android:textSize="14sp"
                android:paddingStart="16dp"
                android:paddingEnd="16dp"
                android:textColor="@color/on_surface" />

            <ImageButton
                android:id="@+id/btnNextPage"
                android:layout_width="40dp"
                android:layout_height="40dp"
                android:src="@android:drawable/ic_media_next"
                android:background="?attr/selectableItemBackgroundBorderless"
                android:contentDescription="Sonraki sayfa" />

        </LinearLayout>

        <!-- Alt araç çubuğu -->
        <HorizontalScrollView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@color/surface"
            android:elevation="4dp"
            android:scrollbars="none">

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="56dp"
                android:orientation="horizontal"
                android:gravity="center_vertical"
                android:paddingStart="8dp"
                android:paddingEnd="8dp">

                <ImageButton android:id="@+id/btnPen" android:layout_width="44dp"
                    android:layout_height="44dp" android:src="@android:drawable/ic_menu_edit"
                    android:background="?attr/selectableItemBackgroundBorderless"
                    android:padding="8dp" android:layout_margin="2dp"
                    android:contentDescription="@string/tool_pen"/>

                <ImageButton android:id="@+id/btnHighlighter" android:layout_width="44dp"
                    android:layout_height="44dp" android:src="@android:drawable/ic_menu_view"
                    android:background="?attr/selectableItemBackgroundBorderless"
                    android:padding="8dp" android:layout_margin="2dp"
                    android:contentDescription="@string/tool_highlighter"/>

                <ImageButton android:id="@+id/btnText" android:layout_width="44dp"
                    android:layout_height="44dp" android:src="@android:drawable/ic_menu_agenda"
                    android:background="?attr/selectableItemBackgroundBorderless"
                    android:padding="8dp" android:layout_margin="2dp"
                    android:contentDescription="@string/tool_text"/>

                <ImageButton android:id="@+id/btnSignature" android:layout_width="44dp"
                    android:layout_height="44dp" android:src="@android:drawable/ic_menu_myplaces"
                    android:background="?attr/selectableItemBackgroundBorderless"
                    android:padding="8dp" android:layout_margin="2dp"
                    android:contentDescription="@string/tool_signature"/>

                <ImageButton android:id="@+id/btnShapes" android:layout_width="44dp"
                    android:layout_height="44dp" android:src="@android:drawable/ic_menu_crop"
                    android:background="?attr/selectableItemBackgroundBorderless"
                    android:padding="8dp" android:layout_margin="2dp"
                    android:contentDescription="@string/tool_shapes"/>

                <ImageButton android:id="@+id/btnEraser" android:layout_width="44dp"
                    android:layout_height="44dp" android:src="@android:drawable/ic_menu_close_clear_cancel"
                    android:background="?attr/selectableItemBackgroundBorderless"
                    android:padding="8dp" android:layout_margin="2dp"
                    android:contentDescription="@string/tool_eraser"/>

                <View android:layout_width="1dp" android:layout_height="32dp"
                    android:background="@color/divider" android:layout_margin="4dp"/>

                <ImageButton android:id="@+id/btnUndo" android:layout_width="44dp"
                    android:layout_height="44dp" android:src="@android:drawable/ic_menu_revert"
                    android:background="?attr/selectableItemBackgroundBorderless"
                    android:padding="8dp" android:layout_margin="2dp"
                    android:contentDescription="@string/undo"/>

                <ImageButton android:id="@+id/btnRedo" android:layout_width="44dp"
                    android:layout_height="44dp" android:src="@android:drawable/ic_media_next"
                    android:background="?attr/selectableItemBackgroundBorderless"
                    android:padding="8dp" android:layout_margin="2dp"
                    android:contentDescription="@string/redo"/>

                <View android:layout_width="1dp" android:layout_height="32dp"
                    android:background="@color/divider" android:layout_margin="4dp"/>

                <View android:id="@+id/btnColor" android:layout_width="32dp"
                    android:layout_height="32dp" android:background="#000000"
                    android:layout_margin="6dp"/>

                <ImageButton android:id="@+id/btnStrokeWidth" android:layout_width="44dp"
                    android:layout_height="44dp" android:src="@android:drawable/ic_menu_zoom"
                    android:background="?attr/selectableItemBackgroundBorderless"
                    android:padding="8dp" android:layout_margin="2dp"
                    android:contentDescription="@string/stroke_width"/>

            </LinearLayout>
        </HorizontalScrollView>

    </LinearLayout>

</androidx.coordinatorlayout.widget.CoordinatorLayout>
