package cursos.omar.appinventario;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

//    @BindView(R.id.fragment_container)
//    FrameLayout fragmentContainer;
//    @BindView(R.id.bottom_navigation)
//    BottomNavigationView bottomNavigation;
//    @BindView(R.id.container_main)
//    RelativeLayout containerMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.item_catalogue);

//        ButterKnife.bind(this);



        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);


        //Para inicializar el frame de home al comienzo en la app
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;


                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.nav_inventory:
                            selectedFragment = new InventoryFragment();
                            break;
                        case R.id.nav_catalogue:
                            selectedFragment = new CatalogueFragment();
                            break;
                        case R.id.nav_stats:
                            selectedFragment = new StatsFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;

                }
            };


}


//    <?xml version="1.0" encoding="utf-8"?>
//<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
//        xmlns:app="http://schemas.android.com/apk/res-auto"
//        xmlns:tools="http://schemas.android.com/tools"
//        android:layout_width="match_parent"
//        android:layout_height="match_parent"
//        android:background="@android:color/holo_red_light"
//        tools:context=".MainActivity">
//
//
//
//
//
//<FrameLayout
//        android:id="@+id/fragment_container"
//                android:layout_width="match_parent"
//                android:layout_height="match_parent"
//                android:layout_above="@+id/bottom_navigation"
//
//
//                />
//
//<android.support.design.widget.BottomNavigationView
//        android:id="@+id/bottom_navigation"
//        android:layout_width="match_parent"
//        android:layout_height="wrap_content"
//        android:layout_alignParentBottom="true"
//        android:background="?android:attr/windowBackground"
//        app:labelVisibilityMode="labeled"
//        app:menu="@menu/bottom_navigation" />
//
//
//<!--
//        Para cambiar el color del icono y del texto del bottom_navigation
//        app:itemIconTint="@android:color/holo_red_light"
//        app:itemTextColor="@android:color/holo_red_light"
//        -->
//
//<!--
//        Para mostrar siempre los labels (texto) de los bottom_navigation
//        app:labelVisibilityMode="labeled"
//        -->
//
//
//</RelativeLayout>


//<FrameLayout
//        android:id="@+id/fragment_container"
//                android:layout_width="match_parent"
//                android:layout_height="match_parent"
//                android:layout_above="@+id/bottom_navigation"
//
//
//
//
//
//                />


//Segunda Forma:


//    <?xml version="1.0" encoding="utf-8"?>
//<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
//        xmlns:app="http://schemas.android.com/apk/res-auto"
//        xmlns:tools="http://schemas.android.com/tools"
//        android:layout_width="match_parent"
//        android:layout_height="match_parent"
//        android:background="@android:color/holo_red_light"
//        tools:context=".MainActivity">
//
//
//<android.support.v7.widget.LinearLayoutCompat
//        android:id="@+id/fragment_container"
//        android:layout_width="match_parent"
//        android:layout_height="match_parent"
//        android:layout_above="@+id/bottom_navigation">
//
//
//</android.support.v7.widget.LinearLayoutCompat>
//
//
//<android.support.design.widget.BottomNavigationView
//        android:id="@+id/bottom_navigation"
//        android:layout_width="match_parent"
//        android:layout_height="wrap_content"
//        android:layout_alignParentBottom="true"
//        android:background="?android:attr/windowBackground"
//        app:labelVisibilityMode="labeled"
//        app:menu="@menu/bottom_navigation" />
//
//
//<!--
//        Para cambiar el color del icono y del texto del bottom_navigation
//        app:itemIconTint="@android:color/holo_red_light"
//        app:itemTextColor="@android:color/holo_red_light"
//        -->
//
//<!--
//        Para mostrar siempre los labels (texto) de los bottom_navigation
//        app:labelVisibilityMode="labeled"
//        -->
//
//
//</RelativeLayout>