package com.paandw.apps.flashmemory.view;

import android.support.v4.app.Fragment;


public abstract class BaseFragment extends Fragment implements IBaseView {

    @Override
    public void showProgress() {

    }

    @Override
    public void showProgress(String msg) {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showNetworkError(String msg, boolean showRetry) {

    }
}
