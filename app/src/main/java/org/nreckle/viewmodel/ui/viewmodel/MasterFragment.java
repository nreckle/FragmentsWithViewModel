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
import org.nreckle.viewmodel.databinding.MasterFragmentBinding;

public class MasterFragment extends Fragment {

    private MasterFragmentBinding mBinding;

    public static MasterFragment newInstance() {
        return new MasterFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(
                inflater, R.layout.master_fragment, container, false);
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
