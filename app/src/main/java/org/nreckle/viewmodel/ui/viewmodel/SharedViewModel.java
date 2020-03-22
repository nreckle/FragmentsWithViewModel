package org.nreckle.viewmodel.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class SharedViewModel extends ViewModel {
    private MutableLiveData<Integer> mData = new MutableLiveData<>();
    private Random mRandom = new Random();

    public LiveData<Integer> getData() {
        return mData;
    }

    public void setData(int num) {
        mData.setValue(num);
    }

    public void onNextRandom() {
        int next = mRandom.nextInt();
        setData(next);
    }
}
