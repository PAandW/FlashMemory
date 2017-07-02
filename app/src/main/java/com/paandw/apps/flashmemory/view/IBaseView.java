package com.paandw.apps.flashmemory.view;

public interface IBaseView {
    void showProgress();
    void showProgress(String msg);
    void hideProgress();
    void showNetworkError(String msg, boolean showRetry);
}
