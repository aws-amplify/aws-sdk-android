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

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.concurrent.CountDownLatch;

import static com.amazonaws.services.s3.internal.Constants.MB;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TransferServiceNetworkInstrumentedTest extends TransferUtilityTestBase {

    private static final String LOG_TAG = TransferServiceNetworkInstrumentedTest.class.getSimpleName();

    @Rule
    public TemporaryFolder temp = new TemporaryFolder();

    private static TransferObserver transferObserver;
    private final static long TIMEOUT = 45 * 1000;
    private final static long MULTIPART_FILE_SIZE = 50 * MB;
    private final static long SINGLEPART_FILE_SIZE = 4 * MB;

    @Before
    public void setUp() {
        setWifiNetwork(appContext, true);

        appContext.startService(new Intent(appContext, TransferService.class));
    }

    @After
    public void tearDown() {
        transferObserver = null;

        setWifiNetwork(appContext, true);
    }

    public void testMultiPartUploadWithNetworkReconnect() throws Exception {
        Log.d(LOG_TAG, "testUploadWithNetworkDisconnect " + MULTIPART_FILE_SIZE + " begin.");


        final File tempFile = temp.newFile();
        fillFile(tempFile, MULTIPART_FILE_SIZE);

        transferObserver =
                transferUtility.upload(
                        tempFile.getName(),
                        tempFile);

        networkReconnectHelper();

        Log.d(LOG_TAG, "testUploadWithNetworkDisconnect " + MULTIPART_FILE_SIZE + " end.");
    }

    public void testDownloadWithNetworkReconnect() throws Exception {
        Log.d(LOG_TAG, "testDownloadWithNetworkReconnect " + MULTIPART_FILE_SIZE + " begin.");


        final File tempFile = temp.newFile();
        fillFile(tempFile, MULTIPART_FILE_SIZE);

        transferObserver =
                transferUtility.upload(
                        tempFile.getName(),
                        tempFile);

        networkReconnectHelper();

        transferObserver =
                transferUtility.download(
                        tempFile.getName(),
                        tempFile);

        networkReconnectHelper();

        Log.d(LOG_TAG, "testDownloadWithNetworkReconnect " + MULTIPART_FILE_SIZE + " end.");
    }

    private void networkReconnectHelper() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);

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
                countDownLatch.countDown();
            }
        });


        waitUntilStateReached(TransferState.IN_PROGRESS, TIMEOUT);
        waitUntilProgressPercentageReached(25, TIMEOUT);
        setWifiNetwork(appContext, false);
        waitUntilStateReached(TransferState.WAITING_FOR_NETWORK, TIMEOUT);
        setWifiNetwork(appContext, true);
        waitUntilStateReached(TransferState.IN_PROGRESS, TIMEOUT);

        try {
            countDownLatch.await();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        transferObserver.refresh();
        Log.d(LOG_TAG, transferObserver.toString());
        assertEquals(TransferState.COMPLETED, transferObserver.getState());
    }

    private void setWifiNetwork(Context context, boolean enabled) {
        WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        assertTrue(wifiManager.setWifiEnabled(enabled));

        // Wait for
        try {
            Thread.sleep(2000);
        } catch (Exception ex) {
            ex.printStackTrace();
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

    private void waitUntilProgressPercentageReached(final int progressPercentage,
                                                    final long timeout) {
        long waitTimeTillNow = 0;
        while (!(getProgressPercentage() >= progressPercentage) &&
                waitTimeTillNow <= timeout) {
            try {
                Log.d(LOG_TAG, "Waiting until " +  progressPercentage +
                        "% of progress is made. Sleeping for 2000 ms");
                Thread.sleep(2000);
                waitTimeTillNow += 2000;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private int getProgressPercentage() {
        transferObserver.refresh();
        float percentDonef = ((float) transferObserver.getBytesTransferred() / (float) transferObserver.getBytesTotal()) * 100;
        return (int)percentDonef;
    }
}
