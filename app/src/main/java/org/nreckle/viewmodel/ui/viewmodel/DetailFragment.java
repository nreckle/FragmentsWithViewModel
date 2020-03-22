package org.nreckle.viewmodel.ui.viewmodel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import org.nreckle.viewmodel.R;
import org.nreckle.viewmodel.databinding.DetailFragmentBinding;

public class DetailFragment extends Fragment {

    private DetailFragmentBinding mBinding;

    public static DetailFragment newInstance() {
        return new DetailFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(
                inflater, R.layout.detail_fragment, container, false);
        return mBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        SharedViewModel mSharedViewModel = ViewModelProviders.of(requireActivity()).get(SharedViewModel.class);
        mBinding.setSharedViewModel(mSharedViewModel);
        mBinding.setLifecycleOwner(getViewLifecycleOwner());
    }

}
