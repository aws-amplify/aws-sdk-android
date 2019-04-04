/**
 * Copyright 2019-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Grant;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.services.s3.model.S3VersionSummary;
import com.amazonaws.services.s3.model.StorageClass;
import com.amazonaws.services.s3.model.VersionListing;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

import static com.amazonaws.services.s3.internal.Constants.KB;
import static com.amazonaws.services.s3.internal.Constants.MB;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class TransferUtilityInstrumentedTest extends TransferUtilityTestBase {

    private static final String LOG_TAG = TransferUtilityInstrumentedTest.class.getSimpleName();

    @Rule
    public TemporaryFolder temp = new TemporaryFolder();

    private static TransferObserver transferObserver;

    @After
    public void tearDown() {
        transferObserver = null;
    }

    @Test
    public void testUploadWithSpecialCharacters() throws Exception {
        String prefix = "20190106";
        String[] keyNames = {
                prefix + "!@#$%^&*()<>?:{}|",
                prefix + "test",
                prefix  + "test!@#$%^&*()<>?:{}|test",
                prefix + "!@#$%^&*()<>?:{}|test",
                prefix + "test!@#$%^&*()<>?:{}|"
        };
        for (String key : keyNames) {
            final long size = KB;
            final File tempFile = temp.newFile();
            fillFile(tempFile, size);
            upload(key, tempFile, size);
        }

        ObjectListing objectListing = sS3Client.listObjects(bucketName, prefix);
        List<S3ObjectSummary> list = objectListing.getObjectSummaries();
        for (S3ObjectSummary summary : list) {
            Log.d(LOG_TAG, "Found key: " + summary.getKey());
            assertTrue(Arrays.asList(keyNames).contains(summary.getKey()));
            assertEquals(bucketName, summary.getBucketName());
        }
    }

    @Test
    public void testUploadWithSpecialCharacters1() throws Exception {
        final long size = 6 * MB;
        final File tempFile = temp.newFile();
        fillFile(tempFile, size);
        upload("test!@#", tempFile, size);
        download("test!@#");
    }

    @Test
    public void testUpload() throws Exception {
        final long size = 50 * MB;
        final File tempFile = temp.newFile();
        fillFile(tempFile, size);
        upload(tempFile.getName(), tempFile, size);
    }

    @Test
    public void testProgressTracking_UploadSmallFile() throws Exception {
        Log.d(LOG_TAG, "testProgressTracking_UploadSmallFile begin");

        final long size = 100 * KB;
        final File tempFile = temp.newFile();
        fillFile(tempFile, size);

        final CountDownLatch countDownLatch = new CountDownLatch(3);
        transferObserver =
                transferUtility.upload(
                        "pr-" + tempFile.getName(),
                        tempFile);

        // Attach a listener to the observer to get state update and progress notifications
        transferObserver.setTransferListener(new TransferListener() {
            @Override
            public void onStateChanged(int id, TransferState state) {
                Log.i(LOG_TAG, "onStateChanged = " + state);

                if (TransferState.COMPLETED == state) {
                    // Handle a completed upload.
                    Log.i(LOG_TAG, "Upload Successful");
                    countDownLatch.countDown();
                } else if (TransferState.FAILED == state) {
                    Log.i(LOG_TAG, "Upload failed");
                    countDownLatch.countDown();
                }
            }

            @Override
            public void onProgressChanged(int id, long bytesCurrent, long bytesTotal) {
                float percentDonef = ((float) bytesCurrent / (float) bytesTotal) * 100;
                int percentDone = (int)percentDonef;

                Log.i(LOG_TAG, "ID:" + id + " bytesCurrent: " + bytesCurrent
                        + " bytesTotal: " + bytesTotal + " " + percentDone + "%");

                if (bytesCurrent == bytesTotal && percentDone == 100) {
                    countDownLatch.countDown();
                }
            }

            @Override
            public void onError(int id, Exception ex) {
                // Handle errors
                ex.printStackTrace();
                Log.e(LOG_TAG, "Error uploading", ex);
                assertTrue("Upload failed with exception: " + ex.getMessage(), false);
                countDownLatch.countDown();
            }
        });

        try {
            countDownLatch.await();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        transferObserver.refresh();
        assertEquals(transferObserver.getBytesTotal(), transferObserver.getBytesTransferred());
        assertEquals(TransferState.COMPLETED, transferObserver.getState());

        assertTrue(sS3Client.doesObjectExist(bucketName, "pr-" + tempFile.getName()));

        Log.d(LOG_TAG, "testProgressTracking_UploadSmallFile end");
    }

    @Test
    public void testUploadsSmallFiles() throws Exception {
        for (int i = 1; i < 5; i++) {
            final int size = i * 10 * KB;
            final File tempFile = temp.newFile();
            fillFile(tempFile, size);
            upload(tempFile.getName(), tempFile, size);
        }
    }

    @Test
    public void testUploadsMediumFiles() throws Exception {
        for (int i = 1; i < 2; i++) {
            final int size = i * 20 * MB;
            final File tempFile = temp.newFile();
            fillFile(tempFile, size);
            upload(tempFile.getName(), tempFile, size);
        }
    }

    @Test
    public void testUploadFile1MWithStorageClassesStandard() throws Exception {
        Log.d(LOG_TAG, "testUploadFile1MWithStorageClass -> Standard begin");
        testUploadFile1MWithStorageClass(StorageClass.Standard);
        Log.d(LOG_TAG, "testUploadFile1MWithStorageClass -> Standard end");
    }

    private void testUploadFile1MWithStorageClass(StorageClass storageClass) throws Exception {
        final int size = 6 * MB;
        final File tempFile = temp.newFile();
        final String key = "test-storage-class-" + UUID.randomUUID().toString();
        fillFile(tempFile, size);

        Log.d(LOG_TAG, "Storage Class = " + storageClass.toString());
        final CountDownLatch countDownLatch = new CountDownLatch(1);

        final ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setStorageClass(storageClass);

        transferObserver =
                transferUtility.upload(
                        key,
                        tempFile,
                        objectMetadata);

        // Attach a listener to the observer to get state update and progress notifications
        transferObserver.setTransferListener(new TransferListener() {
            @Override
            public void onStateChanged(int id, TransferState state) {
                Log.i(LOG_TAG, "onStateChanged = " + state);

                if (TransferState.COMPLETED == state) {
                    // Handle a completed upload.
                    Log.i(LOG_TAG, "Upload Successful");
                    countDownLatch.countDown();
                } else if (TransferState.FAILED == state) {
                    Log.i(LOG_TAG, "Upload failed");
                    countDownLatch.countDown();
                }
            }

            @Override
            public void onProgressChanged(int id, long bytesCurrent, long bytesTotal) {
                float percentDonef = ((float) bytesCurrent / (float) bytesTotal) * 100;
                int percentDone = (int) percentDonef;

                Log.i(LOG_TAG, "ID:" + id + " bytesCurrent: " + bytesCurrent
                        + " bytesTotal: " + bytesTotal + " " + percentDone + "%");
            }

            @Override
            public void onError(int id, Exception ex) {
                // Handle errors
                ex.printStackTrace();
                Log.e(LOG_TAG, "Error uploading", ex);
                assertTrue("Upload failed with exception: " + ex.getMessage(), false);
                countDownLatch.countDown();
            }
        });

        try {
            countDownLatch.await();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        getObjectAndAssertEqual(bucketName, key, tempFile, objectMetadata);
        assertFalse("default not public readable", isPublicRead(bucketName, key));
        assertEquals("completed!", TransferState.COMPLETED, transferObserver.getState());
        assertEquals("observer: bytesCurrent == bytesTotal", transferObserver.getBytesTransferred(), transferObserver.getBytesTotal());

        VersionListing versionListing = sS3Client.listVersions(bucketName, key);
        for (Iterator iterator = versionListing.getVersionSummaries().iterator(); iterator.hasNext(); ) {
            S3VersionSummary versionSummary = (S3VersionSummary) iterator.next();
            if (versionSummary.isLatest() && versionSummary.getKey().equals(key)) {
                assertEquals(storageClass.toString(), versionSummary.getStorageClass());
                return;
            }
        }
        assertTrue("Expected an object stored under key '" + key + "', but didn't find one", false);
    }

    @Test
    public void testDownloadSmallFiles() throws Exception {
        for (int i = 1; i < 2; i++) {
            download(i * 10 * KB);
        }
    }

    @Test
    public void testDownloadMediumFiles() throws Exception {
        for (int i = 1; i < 2; i++) {
            download(i * 20 * MB);
        }
    }

    @Test
    public void testDownload() throws Exception {
        download(1 * KB);
    }

    @Test
    public void testDownloadMediumFile() throws Exception {
        download(50 * MB);
    }

    @Test
    public void testDownloadLargeFile() throws Exception {
        download(250 * MB);
    }

    @Test
    public void testDownloadWithPauseResumeMedium() throws Exception {
        testDownloadWithPauseResumeHelper(50 * MB);
    }

    @Test
    public void testDownloadWithPauseResumeLarge() throws Exception {
        testDownloadWithPauseResumeHelper(100 * MB);
    }

    @Test
    public void testCancelWhenTransfersAreInWaitingState() throws Exception {
        TransferUtilityOptions transferUtilityOptions = new TransferUtilityOptions();
        transferUtilityOptions.setTransferThreadPoolSize(2);

        TransferUtility transferUtilityWithReducedPoolSize = TransferUtility.builder()
                .context(appContext)
                .defaultBucket(bucketName)
                .s3Client(sS3Client)
                .transferUtilityOptions(transferUtilityOptions)
                .build();

        List<TransferObserver> observers = new ArrayList<TransferObserver>();
        for (int i = 0; i < 10; i++) {
            final long size = 10 * MB;
            final File tempFile = temp.newFile();
            fillFile(tempFile, size);
            TransferObserver observer = transferUtility.upload("testCancelWhenTransfersAreInWaitingState-" + tempFile.getName(), tempFile);
            observer.setTransferListener(new TransferListener() {
                @Override
                public void onStateChanged(int i, TransferState transferState) {
                    Log.d(LOG_TAG, "onStateChanged: State = " + transferState);
                }

                @Override
                public void onProgressChanged(int i, long l, long l1) {
                    Log.d(LOG_TAG, "onProgressChanged: current = " + l + "; total = " + l1);
                }

                @Override
                public void onError(int i, Exception e) {
                    Log.e(LOG_TAG, "error = " + e);
                }
            });
            observers.add(observer);
        }

        for (TransferObserver observer : observers) {
            observer.refresh();
            Log.d(LOG_TAG, observer.toString());
        }

        Log.d(LOG_TAG, "Cancel status for 4: " + transferUtility.cancel(observers.get(4).getId()));
        Log.d(LOG_TAG, "Cancel status for 5: " + transferUtility.cancel(observers.get(5).getId()));
        Log.d(LOG_TAG, "Cancel status for 7: " + transferUtility.cancel(observers.get(7).getId()));

        for (TransferObserver observer : observers) {
            observer.refresh();
            Log.d(LOG_TAG, "State = " + observer.getState());
        }
    }

    private void testDownloadWithPauseResumeHelper(final int size) throws Exception {
        Log.d(LOG_TAG, "testDownloadWithPauseResumeHelper -> " + size + " begin");

        final CountDownLatch countDownLatch = new CountDownLatch(1);
        File tempFile = temp.newFile();
        fillFile(tempFile, size);
        upload("testDownloadWithPauseResumeHelper.tmp", tempFile, size);

        tempFile = temp.newFile();
        transferObserver =
                transferUtility.download(
                        "testDownloadWithPauseResumeHelper.tmp",
                        tempFile);

        // Attach a listener to the observer to get state update and progress notifications
        transferObserver.setTransferListener(new TransferListener() {
            @Override
            public void onStateChanged(int id, TransferState state) {
                Log.i(LOG_TAG, "onStateChanged = " + state);

                if (TransferState.COMPLETED == state) {
                    // Handle a completed upload.
                    Log.i(LOG_TAG, "Upload successful");
                    countDownLatch.countDown();
                } else if (TransferState.FAILED == state) {
                    Log.i(LOG_TAG, "Upload failed");
                    countDownLatch.countDown();
                }
            }

            @Override
            public void onProgressChanged(int id, long bytesCurrent, long bytesTotal) {
                float percentDonef = ((float) bytesCurrent / (float) bytesTotal) * 100;
                int percentDone = (int)percentDonef;

                Log.i(LOG_TAG, "ID:" + id + " bytesCurrent: " + bytesCurrent
                        + " bytesTotal: " + bytesTotal + " " + percentDone + "%");
            }

            @Override
            public void onError(int id, Exception ex) {
                // Handle errors
                ex.printStackTrace();
                assertTrue("Upload failed with exception: " + ex.getMessage(), false);
                countDownLatch.countDown();
            }
        });

        waitUntilStateReached(TransferState.IN_PROGRESS, 5000);

        transferUtility.pause(transferObserver.getId());
        waitUntilStateReached(TransferState.PAUSED, 5000);

        transferUtility.resume(transferObserver.getId());
        waitUntilStateReached(TransferState.IN_PROGRESS, 10000);

        try {
            countDownLatch.await();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        transferObserver.refresh();
        Log.d(LOG_TAG, transferObserver.toString());
        assertEquals(TransferState.COMPLETED, transferObserver.getState());

        Log.d(LOG_TAG, "testDownloadWithPauseResumeHelper end");
    }

    private void download(final int size) throws Exception {
        Log.d(LOG_TAG, "testDownload begin");

        final File tempFile = temp.newFile();
        fillFile(tempFile, size);
        upload(tempFile.getName(), tempFile, size);

        final CountDownLatch countDownLatch = new CountDownLatch(1);
        transferObserver =
                transferUtility.download(
                        tempFile.getName(),
                        tempFile);

        // Attach a listener to the observer to get state update and progress notifications
        transferObserver.setTransferListener( new TransferListener() {
            @Override
            public void onStateChanged(int id, TransferState state) {
                Log.i(LOG_TAG, "onStateChanged = " + state);

                if (TransferState.COMPLETED == state) {
                    // Handle a completed upload.
                    Log.i(LOG_TAG, "Upload Successful");
                    countDownLatch.countDown();
                } else if (TransferState.FAILED == state) {
                    Log.i(LOG_TAG, "Upload failed");
                    countDownLatch.countDown();
                }
            }

            @Override
            public void onProgressChanged(int id, long bytesCurrent, long bytesTotal) {
                float percentDonef = ((float) bytesCurrent / (float) bytesTotal) * 100;
                int percentDone = (int)percentDonef;

                Log.i(LOG_TAG, "ID:" + id + " bytesCurrent: " + bytesCurrent
                        + " bytesTotal: " + bytesTotal + " " + percentDone + "%");
            }

            @Override
            public void onError(int id, Exception ex) {
                // Handle errors
                ex.printStackTrace();
                Log.e(LOG_TAG, "Error downloading", ex);
                assertTrue("Upload failed with exception: " + ex.getMessage(), false);
                countDownLatch.countDown();
            }
        });

        try {
            countDownLatch.await();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        transferObserver.refresh();
        assertEquals(TransferState.COMPLETED, transferObserver.getState());

        Log.d(LOG_TAG, "testDownload end");
    }

    private void download(final String key) throws Exception {
        Log.d(LOG_TAG, "testDownload begin");

        final File tempFile = temp.newFile();

        final CountDownLatch countDownLatch = new CountDownLatch(1);
        transferObserver =
                transferUtility.download(
                        key,
                        tempFile);

        // Attach a listener to the observer to get state update and progress notifications
        transferObserver.setTransferListener( new TransferListener() {
            @Override
            public void onStateChanged(int id, TransferState state) {
                Log.i(LOG_TAG, "onStateChanged = " + state);

                if (TransferState.COMPLETED == state) {
                    // Handle a completed upload.
                    Log.i(LOG_TAG, "Upload Successful");
                    countDownLatch.countDown();
                } else if (TransferState.FAILED == state) {
                    Log.i(LOG_TAG, "Upload failed");
                    countDownLatch.countDown();
                }

                if (TransferState.FAILED == state) {
                    transferObserver = transferUtility.resume(transferObserver.getId());
                    transferObserver.setTransferListener(this);
                }
            }

            @Override
            public void onProgressChanged(int id, long bytesCurrent, long bytesTotal) {
                float percentDonef = ((float) bytesCurrent / (float) bytesTotal) * 100;
                int percentDone = (int)percentDonef;

                Log.i(LOG_TAG, "ID:" + id + " bytesCurrent: " + bytesCurrent
                        + " bytesTotal: " + bytesTotal + " " + percentDone + "%");
            }

            @Override
            public void onError(int id, Exception ex) {
                // Handle errors
                ex.printStackTrace();
                Log.e(LOG_TAG, "Error downloading", ex);
                assertTrue("Upload failed with exception: " + ex.getMessage(), false);
                countDownLatch.countDown();
            }
        });

        try {
            countDownLatch.await();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        transferObserver.refresh();
        assertEquals(TransferState.COMPLETED, transferObserver.getState());

        Log.d(LOG_TAG, "testDownload end");
    }

    private void upload(String key, File file, long size) throws Exception {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        Log.d(LOG_TAG, "testUpload begin");

        transferObserver =
                transferUtility.upload(
                        key,
                        file);

        // Attach a listener to the observer to get state update and progress notifications
        transferObserver.setTransferListener(new TransferListener() {
            @Override
            public void onStateChanged(int id, TransferState state) {
                Log.i(LOG_TAG, "onStateChanged = " + state);

                if (TransferState.COMPLETED == state) {
                    // Handle a completed upload.
                    Log.i(LOG_TAG, "Upload Successful");
                    countDownLatch.countDown();
                } else if (TransferState.FAILED == state) {
                    Log.i(LOG_TAG, "Upload failed");
                    countDownLatch.countDown();
                }
            }

            @Override
            public void onProgressChanged(int id, long bytesCurrent, long bytesTotal) {
                float percentDonef = ((float) bytesCurrent / (float) bytesTotal) * 100;
                int percentDone = (int)percentDonef;

                Log.i(LOG_TAG, "ID:" + id + " bytesCurrent: " + bytesCurrent
                        + " bytesTotal: " + bytesTotal + " " + percentDone + "%");
            }

            @Override
            public void onError(int id, Exception ex) {
                // Handle errors
                ex.printStackTrace();
                Log.e(LOG_TAG, "Error uploading", ex);
                assertTrue("Upload failed with exception: " + ex.getMessage(), false);
                countDownLatch.countDown();
            }
        });

        try {
            countDownLatch.await();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        transferObserver.refresh();
        assertEquals(TransferState.COMPLETED, transferObserver.getState());
        assertTrue(sS3Client.doesObjectExist(bucketName, key));

        Log.d(LOG_TAG, "testUpload end");
    }

    private boolean isPublicRead(String bucket, String key) {
        final AccessControlList acl = sS3Client.getObjectAcl(bucketName, key);
        for (final Grant grant : acl.getGrants()) {
            if (grant.getPermission().equals(Permission.Read)
                    && grant.getGrantee().getIdentifier()
                    .equals("http://acs.amazonaws.com/groups/global/AllUsers")) {
                return true;
            }
        }
        return false;
    }

    private void getObjectAndAssertEqual(String bucket, String key, File file,
                                         ObjectMetadata localMetadata) throws IOException, InterruptedException {

        S3Object object = null;
        int tries = 0;
        while (++tries <= 10) {
            try {
                object = sS3Client.getObject(bucket, key);
            } catch (final AmazonS3Exception e) {
                if (e.getErrorCode().equalsIgnoreCase("NoSuchKey")) {
                    System.out.println("Didn't not find key " + key
                            + " after " + tries + " tries.");
                    if (tries == 10) {
                        System.out.println("Tried 10 times, giving up");
                        throw e;
                    }
                    Thread.sleep(1000);
                } else {
                    throw e;
                }
            }
        }
        final S3ObjectInputStream stream = object.getObjectContent();

        final byte[] buffer = new byte[8192];
        int read = 0;
        final File content = temp.newFile();
        final FileOutputStream fos = new FileOutputStream(content);
        while ((read = stream.read(buffer)) > 0) {
            fos.write(buffer, 0, read);
        }

        fos.close();

        assertFileEqualsFile(content, file);
        assertRemoteMetadataEqualsMetadataSent(localMetadata, object.getObjectMetadata());
    }

    private void verifyContent(String bucket, String key, File file) throws IOException, InterruptedException {

        S3Object object = null;
        int tries = 0;
        while (++tries <= 10) {
            try {
                object = sS3Client.getObject(bucket, key);
            } catch (final AmazonS3Exception e) {
                if (e.getErrorCode().equalsIgnoreCase("NoSuchKey")) {
                    System.out.println("Didn't not find key " + key
                            + " after " + tries + " tries.");
                    if (tries == 10) {
                        System.out.println("Tried 10 times, giving up");
                        throw e;
                    }
                    Thread.sleep(1000);
                } else {
                    throw e;
                }
            }
        }
        final S3ObjectInputStream stream = object.getObjectContent();

        final byte[] buffer = new byte[8192];
        int read = 0;
        final File content = temp.newFile();
        final FileOutputStream fos = new FileOutputStream(content);
        while ((read = stream.read(buffer)) > 0) {
            fos.write(buffer, 0, read);
        }

        fos.close();

        assertFileEqualsFile(content, file);
    }

    private void assertRemoteMetadataEqualsMetadataSent(ObjectMetadata local, ObjectMetadata remote) {
        if (local.getCacheControl() != null) {
            assertEquals(local.getCacheControl(), remote.getCacheControl());
        }
        if (local.getContentDisposition() != null) {
            assertEquals(local.getContentDisposition(), remote.getContentDisposition());
        }
        if (local.getContentEncoding() != null) {
            assertEquals(local.getContentEncoding(), remote.getContentEncoding());
        }
        if (local.getContentType() != null) {
            assertEquals(local.getContentType(), remote.getContentType());
        }
        if (local.getExpirationTime() != null) {
            assertEquals(local.getExpirationTime(), remote.getExpirationTime());
        }
        if (local.getExpirationTimeRuleId() != null) {
            assertEquals(local.getExpirationTimeRuleId(), remote.getExpirationTimeRuleId());
        }
        if (local.getHttpExpiresDate() != null) {
            assertEquals(local.getHttpExpiresDate().toString(), remote.getHttpExpiresDate()
                    .toString());
        }
        if (local.getUserMetadata() != null) {
            assertEquals(local.getUserMetadata(), remote.getUserMetadata());
        }
        if (local.getSSEAlgorithm() != null) {
            assertEquals(local.getSSEAlgorithm(), remote.getSSEAlgorithm());
        }
    }

    private void waitUntilStateReached(final TransferState transferState, final long timeout) {
        long waitTimeTillNow = 0;
        while (!transferObserver.getState().equals(transferState) &&
                waitTimeTillNow <= timeout) {
            try {
                waitTimeTillNow += 2000;
                Log.d(LOG_TAG, "Checking for state = " + transferState + "; Sleeping for 2000 ms");
                Thread.sleep(2000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            transferObserver.refresh();
        }
        transferObserver.refresh();
        assertEquals(transferState, transferObserver.getState());
    }
}
