package com.NU.numobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.NU.numobile.activity.amaliyah.MenuAmaliyah;
import com.NU.numobile.activity.banking.MenuBanking;
import com.NU.numobile.activity.berbagi.MenuBerbagi;
import com.NU.numobile.activity.cak.CakNU;
import com.NU.numobile.activity.channel.MenuChannel;
import com.NU.numobile.activity.desa.MenuPodes;
import com.NU.numobile.activity.dokter.MenuDokter;
import com.NU.numobile.activity.halal.MenuHalal;
import com.NU.numobile.activity.info.MenuInfo;
import com.NU.numobile.activity.invest.MenuInvest;
import com.NU.numobile.activity.iot.MenuIoT;
import com.NU.numobile.activity.lapor.MenuLapor;
import com.NU.numobile.activity.learning.MenuLearning;
import com.NU.numobile.activity.library.MenuLibrary;
import com.NU.numobile.activity.money.MenuMoney;
import com.NU.numobile.activity.music.MenuMusic;
import com.NU.numobile.activity.pasar.MenuPasar;
import com.NU.numobile.activity.pembiayaan.MenuPembiayaan;
import com.NU.numobile.activity.pertanu.MenuPertanu;
import com.NU.numobile.activity.pulsa.MenuPulsa;
import com.NU.numobile.activity.wirausaha.MenuWirausaha;

public class MenuUtama extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //Baris 1
        Button cak = (Button) findViewById(R.id.btn_cak);
        cak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, CakNU.class);
                startActivity(intent);
            }
        });

        Button money = (Button) findViewById(R.id.btn_money);
        money.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuMoney.class);
                startActivity(intent);
            }
        });

        Button pasar = (Button) findViewById(R.id.btn_pasar);
        pasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuPasar.class);
                startActivity(intent);
            }
        });

        Button dokter = (Button) findViewById(R.id.btn_dokter);
        dokter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuDokter.class);
                startActivity(intent);
            }
        });

        //Baris 2
        Button banking = (Button) findViewById(R.id.btn_banking);
        banking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuBanking.class);
                startActivity(intent);
            }
        });

        Button berbagi = (Button) findViewById(R.id.btn_berbagi);
        berbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuBerbagi.class);
                startActivity(intent);
            }
        });

        Button wirausaha = (Button) findViewById(R.id.btn_wirausaha);
        wirausaha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuWirausaha.class);
                startActivity(intent);
            }
        });

        Button learning = (Button) findViewById(R.id.btn_learning);
        learning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuLearning.class);
                startActivity(intent);
            }
        });


        //Baris 3
        Button channel = (Button) findViewById(R.id.btn_channel);
        channel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuChannel.class);
                startActivity(intent);
            }
        });

        Button library = (Button) findViewById(R.id.btn_library);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuLibrary.class);
                startActivity(intent);
            }
        });

        Button podes = (Button) findViewById(R.id.btn_desa);
        podes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuPodes.class);
                startActivity(intent);
            }
        });

        Button info = (Button) findViewById(R.id.btn_info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuInfo.class);
                startActivity(intent);
            }
        });

        //Baris 4
        Button amaliyah = (Button) findViewById(R.id.btn_amaliyah);
        amaliyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuAmaliyah.class);
                startActivity(intent);
            }
        });

        Button pulsa = (Button) findViewById(R.id.btn_pulsa);
        pulsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuPulsa.class);
                startActivity(intent);
            }
        });

        Button invest = (Button) findViewById(R.id.btn_invest);
        invest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuInvest.class);
                startActivity(intent);
            }
        });

        Button music = (Button) findViewById(R.id.btn_game);
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuMusic.class);
                startActivity(intent);
            }
        });


        //Baris 5
        Button iot = (Button) findViewById(R.id.btn_iot);
        iot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuIoT.class);
                startActivity(intent);
            }
        });

        Button pembiayaan = (Button) findViewById(R.id.btn_pembiyaan);
        pembiayaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuPembiayaan.class);
                startActivity(intent);
            }
        });

        Button pertanu = (Button) findViewById(R.id.btn_pertanian);
        pertanu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuPertanu.class);
                startActivity(intent);
            }
        });

        Button lapor = (Button) findViewById(R.id.btn_lapor);
        lapor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuLapor.class);
                startActivity(intent);
            }
        });

        //Baris 6
        Button halal = (Button) findViewById(R.id.btn_halal);
        halal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuHalal.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_utama, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_ncc) {
            // Handle the camera action
        } else if (id == R.id.nav_visible) {

        } else if (id == R.id.nav_balance) {

        } else if (id == R.id.nav_media) {

        } else if (id == R.id.nav_minimize) {

        } else if (id == R.id.nav_greeting) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
