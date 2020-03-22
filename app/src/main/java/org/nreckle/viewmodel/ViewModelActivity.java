package org.nreckle.viewmodel;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import org.nreckle.viewmodel.ui.viewmodel.DetailFragment;
import org.nreckle.viewmodel.ui.viewmodel.MasterFragment;

public class ViewModelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_model_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fg_master, MasterFragment.newInstance())
                    .replace(R.id.fg_detail, DetailFragment.newInstance())
                    .commitNow();
        }
    }
}
