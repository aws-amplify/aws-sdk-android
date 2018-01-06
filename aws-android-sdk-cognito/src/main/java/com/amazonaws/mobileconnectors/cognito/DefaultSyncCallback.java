
package com.amazonaws.mobileconnectors.cognito;

import com.amazonaws.mobileconnectors.cognito.Dataset.SyncCallback;
import com.amazonaws.mobileconnectors.cognito.exceptions.DataStorageException;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * A default implementation of SyncCallback. All methods but onConflict are
 * stubbed with logging. onConflict resolves conflicts using a 'last writer
 * wins' strategy
 */
public class DefaultSyncCallback implements SyncCallback {

    private static final Log LOGGER = LogFactory.getLog(DefaultSyncCallback.class);

    @Override
    public void onSuccess(Dataset dataset, List<Record> updatedRecords) {
        LOGGER.info(String.format("%d records synced successfully.", updatedRecords.size()));
    }

    @Override
    public boolean onConflict(Dataset dataset, List<SyncConflict> conflicts) {
        LOGGER.info("onConflict resolved with DefaultSyncCallback's default implementation (last writer wins).");
        List<Record> resolvedConflicts = new ArrayList<Record>(conflicts.size());
        for (SyncConflict conflict : conflicts) {
            resolvedConflicts.add(conflict.resolveWithLastWriterWins());
        }
        dataset.resolve(resolvedConflicts);
        return true;
    }

    @Override
    public boolean onDatasetDeleted(Dataset dataset, String datasetName) {
        LOGGER.warn("onDatasetDeleted was called and DefaultSyncCallback doesn't provide an implementation for it");
        return false;
    }

    @Override
    public boolean onDatasetsMerged(Dataset dataset, List<String> datasetNames) {
        LOGGER.warn("onDatasetsMerged was called and DefaultSyncCallback doesn't provide an implementation for it");
        return false;
    }

    @Override
    public void onFailure(DataStorageException dse) {
        LOGGER.error("Failure occurred during sync", dse);
    }

}
