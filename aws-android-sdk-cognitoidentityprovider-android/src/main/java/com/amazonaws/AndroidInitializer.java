package com.amazonaws;

import android.content.Context;
import android.os.Handler;

import com.amazonaws.cognito.clientcontext.data.UserContextDataProvider;
import com.amazonaws.cognito.clientcontext.datacollection.AndroidContextDataAggregator;
import com.amazonaws.extra.persistence.SharedPreferencesStorage;
import com.amazonaws.extra.persistence.Storage;
import com.amazonaws.extra.persistence.StorageProvider;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.extra.execution.CallbackExectorProvider;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.extra.execution.CallbackExecutor;

public class AndroidInitializer {
    
    private static boolean initialised = false;
    
    private AndroidInitializer(){}
    
    public static void init(final Context context) {
        if (initialised) {
            return;
        }
        
        AndroidContextDataAggregator dataAggregator = AndroidContextDataAggregator.getInstance();
        dataAggregator.refreshAggregatedData(context.getApplicationContext());
        UserContextDataProvider.setDefaultDataAggregator(dataAggregator);

        final Handler handler = new Handler(context.getMainLooper());
        CallbackExectorProvider.setCallbackExecutor(new CallbackExecutor() {
            @Override
            public void execute(Runnable runnable) {
                Thread thread = new Thread(runnable);
                handler.post(thread);
            }
        });

        StorageProvider.setDefaultStorageFactory(new StorageProvider.StorageFactory() {
            @Override
            public Storage create(String key) {
                return new SharedPreferencesStorage(context.getApplicationContext(), key);
            }
        });
        
        initialised = true;
    }
}
