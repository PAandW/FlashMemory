package com.paandw.apps.flashmemory.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.paandw.apps.flashmemory.R;

public abstract class BaseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onBackPressed() {
        popFragmentStack();
    }

    protected void popFragmentStack(){
        if(getSupportFragmentManager().getBackStackEntryCount() == 0){
            finish();
        } else {
            removeFragment();
            getSupportFragmentManager().popBackStack();
        }
    }

    protected void removeFragment(){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.main_container);
        getSupportFragmentManager()
                .beginTransaction()
                .remove(fragment)
                .commit();
    }

    protected void startFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction()
                .add(R.id.main_container, fragment)
                .commit();
    }
}
