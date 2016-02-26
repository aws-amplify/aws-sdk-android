
package com.amazonaws.mobileconnectors.cognito;

import android.util.Log;

import com.amazonaws.mobileconnectors.cognito.Dataset.SyncCallback;
import com.amazonaws.mobileconnectors.cognito.exceptions.DataStorageException;

import java.util.ArrayList;
import java.util.List;

/**
 * A default implementation of SyncCallback. All methods but onConflict are
 * stubbed with logging. onConflict resolves conflicts using a 'last writer
 * wins' strategy
 */
public class DefaultSyncCallback implements SyncCallback {

    private static final String TAG = "DefaultSyncCallback";

    @Override
    public void onSuccess(Dataset dataset, List<Record> updatedRecords) {
        Log.i(TAG, String.format("%d records synced successfully.", updatedRecords.size()));
    }

    @Override
    public boolean onConflict(Dataset dataset, List<SyncConflict> conflicts) {
        Log.i(TAG, "onConflict resolved with DefaultSyncCallback's default implementation (last writer wins).");
        List<Record> resolvedConflicts = new ArrayList<Record>(conflicts.size());
        for (SyncConflict conflict : conflicts) {
            resolvedConflicts.add(conflict.resolveWithLastWriterWins());
        }
        dataset.resolve(resolvedConflicts);
        return true;
    }

    @Override
    public boolean onDatasetDeleted(Dataset dataset, String datasetName) {
        Log.w(TAG, "onDatasetDeleted was called and DefaultSyncCallback doesn't provide an implementation for it");
        return false;
    }

    @Override
    public boolean onDatasetsMerged(Dataset dataset, List<String> datasetNames) {
        Log.w(TAG, "onDatasetsMerged was called and DefaultSyncCallback doesn't provide an implementation for it");
        return false;
    }

    @Override
    public void onFailure(DataStorageException dse) {
        Log.e(TAG, "Failure occurred during sync", dse);
    }

}
