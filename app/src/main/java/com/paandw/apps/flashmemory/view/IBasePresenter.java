package com.paandw.apps.flashmemory.view;

import android.os.Bundle;

public interface IBasePresenter {
    void onResume();
    void onPause();
    void saveInstanceState(Bundle out);
    void restoreInstanceState(Bundle in);
}
