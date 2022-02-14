/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;

import androidx.test.platform.app.InstrumentationRegistry;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Tests that new upload with input stream method calls
 * the existing methods with expected parameters.
 */
@RunWith(RobolectricTestRunner.class)
public class UploadInputStreamTest {
    private static final String TAG = "InputStreamTest";
    private static final String DEFAULT_BUCKET = "s3-upload-input-stream-unit-test";

    private InputStream inputStream;
    private ObjectMetadata metadata;
    private CannedAccessControlList cannedAcl;
    private TransferListener listener;
    private TransferUtility transferUtility;

    /**
     * Sets up testing environment.
     */
    @Before
    public void setup() {
        AmazonS3Client s3 = mock(AmazonS3Client.class);
        Context context = InstrumentationRegistry.getInstrumentation().getContext();
        transferUtility = spy(TransferUtility.builder()
                .defaultBucket(DEFAULT_BUCKET)
                .s3Client(s3)
                .context(context)
                .build());
        transferUtility.getDbUtil().closeDB();
        inputStream = new ByteArrayInputStream("test data".getBytes());
        metadata = new ObjectMetadata();
        cannedAcl = CannedAccessControlList.Private;
        listener = new UploadListener();
    }

    /**
     * Test that {@link TransferUtility#upload(String, InputStream)} calls the File based
     * upload method with all of the expected defaults.
     *
     * @throws IOException if upload fails to read input file
     */
    @Test
    public void testUpload() throws IOException {
        String key = getRandomString();
        transferUtility.upload(key, inputStream);
        verify(transferUtility, times(1)).upload(
                eq(DEFAULT_BUCKET),
                eq(key),
                any(File.class),
                any(ObjectMetadata.class),
                isNull(CannedAccessControlList.class),
                isNull(TransferListener.class)
        );
    }

    /**
     * Test that {@link TransferUtility#upload(String, InputStream, UploadOptions)} with
     * a default Builder calls the File based upload method with all of the expected defaults.
     *
     * @throws IOException if upload fails to read input file
     */
    @Test
    public void testUploadWithDefaults() throws IOException {
        String key = getRandomString();
        transferUtility.upload(key, inputStream, UploadOptions.builder().build());
        verify(transferUtility, times(1)).upload(
                eq(DEFAULT_BUCKET),
                eq(key),
                any(File.class),
                any(ObjectMetadata.class),
                isNull(CannedAccessControlList.class),
                isNull(TransferListener.class)
        );
    }

    /**
     * Test that {@link TransferUtility#upload(String, InputStream, UploadOptions)} with
     * all parameters specified calls the File based upload method with the same parameters
     * provided as input.
     *
     * @throws IOException if upload fails to read input file
     */
    @Test
    public void testUploadWithAllParametersSet() throws IOException {
        String key = getRandomString();
        String bucket = getRandomString();
        UploadOptions options = UploadOptions.builder()
                .bucket(bucket)
                .objectMetadata(metadata)
                .cannedAcl(cannedAcl)
                .transferListener(listener)
                .build();
        transferUtility.upload(key, inputStream, options);
        verify(transferUtility, times(1)).upload(
                eq(bucket),
                eq(key),
                any(File.class),
                eq(metadata),
                eq(cannedAcl),
                eq(listener)
        );
    }

    /**
     * Verify that the File does in fact get deleted after the upload is complete.
     *
     * @throws IOException if upload fails to read input file
     */
    @Test
    public void testDeleteTempFileAfterUpload() throws IOException {
        // Call upload, so that a temporary File will be created
        final String key = getRandomString();
        TransferObserver observer = transferUtility.upload(key, inputStream);

        // Verify the file exists
        File file = new File(observer.getAbsoluteFilePath());
        assertTrue(file.exists());

        // Set state to COMPLETED
        Context context = InstrumentationRegistry.getInstrumentation().getContext();
        TransferStatusUpdater transferStatusUpdater = TransferStatusUpdater.getInstance(context);
        transferStatusUpdater.updateState(observer.getId(), TransferState.COMPLETED);

        // Verify the file was deleted
        assertFalse(file.exists());
    }

    /**
     * Cleans up input stream
     *
     * @throws IOException if input stream fails to close
     */
    @After
    public void teardown() throws IOException {
        inputStream.close();
    }

    private String getRandomString() {
        return UUID.randomUUID().toString();
    }

    private static final class UploadListener implements TransferListener {
        @Override
        public void onStateChanged(int id, TransferState state) {
            Log.d(TAG, "onStateChanged: " + id + ", " + state);
        }

        @Override
        public void onProgressChanged(int id, long bytesCurrent, long bytesTotal) {
            Log.i(TAG, String.format("onProgressChanged: %d, total: %d, current: %d",
                    id, bytesTotal, bytesCurrent));
        }

        @Override
        public void onError(int id, Exception exception) {
            Log.e(TAG, "Error during upload: " + id, exception);
        }
    }

    @Test
    public void testTransferRecordCheckPreferredNetworkAvailability() {
        Context context = InstrumentationRegistry.getInstrumentation().getContext();
        TransferStatusUpdater transferStatusUpdater = TransferStatusUpdater.getInstance(context);
        ConnectivityManager connManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        transferStatusUpdater.updateState(2342, TransferState.IN_PROGRESS);
        transferStatusUpdater.addTransfer(new TransferRecord(34234));
        for (TransferRecord record : transferStatusUpdater.getTransfers().values()) {
            //When connectionManager is null - Base case
            assertTrue(record.checkPreferredNetworkAvailability(transferStatusUpdater, null));

            //When TransferUtilityOptions is null
            record.transferUtilityOptions = null;
            assertTrue(record.checkPreferredNetworkAvailability(transferStatusUpdater, connManager));

            //When TransferNetworkConnectionType is null
            record.transferUtilityOptions = new TransferUtilityOptions();
            record.transferUtilityOptions.transferNetworkConnectionType = null;
            assertTrue(record.checkPreferredNetworkAvailability(transferStatusUpdater, connManager));

            //When TransferNetworkConnectionType is not null
            record.transferUtilityOptions.transferNetworkConnectionType = TransferNetworkConnectionType.ANY;
            assertTrue(record.checkPreferredNetworkAvailability(transferStatusUpdater, connManager));
        }

    }
}
