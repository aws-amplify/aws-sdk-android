/**
 * Copyright 2017-2018 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.kinesisvideo.client;

import static android.content.Context.ACTIVITY_SERVICE;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import androidx.annotation.NonNull;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.kinesisvideo.auth.KinesisVideoCredentialsProvider;
import com.amazonaws.kinesisvideo.client.KinesisVideoClient;
import com.amazonaws.kinesisvideo.client.KinesisVideoClientConfiguration;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.common.logging.Log;
import com.amazonaws.kinesisvideo.common.logging.LogLevel;
import com.amazonaws.kinesisvideo.common.logging.OutputChannel;
import com.amazonaws.kinesisvideo.producer.DeviceInfo;
import com.amazonaws.kinesisvideo.producer.StorageInfo;
import com.amazonaws.kinesisvideo.producer.Tag;
import com.amazonaws.kinesisvideo.storage.DefaultStorageCallbacks;
import com.amazonaws.mobileconnectors.kinesisvideo.auth.KinesisVideoCredentialsProviderImpl;
import com.amazonaws.mobileconnectors.kinesisvideo.service.KinesisVideoAndroidServiceClient;
import com.amazonaws.mobileconnectors.kinesisvideo.util.AndroidLogOutputChannel;
import com.amazonaws.regions.Regions;

public final class KinesisVideoAndroidClientFactory {
    private static final int DEVICE_VERSION = 0;
    private static final int TEN_STREAMS = 10;
    private static final int SPILL_RATIO_90_PERCENT = 90;
    private static final long MIN_STORAGE_SIZE_64_MEGS = 64 * 1024 * 1024;
    private static final long MAX_STORAGE_SIZE_384_MEGS = 384 * 1024 * 1024;
    private static final double TOTAL_MEMORY_RATIO = 0.9;
    private static final String DEVICE_NAME = "android-client-library";
    private static final String STORAGE_PATH = Environment.getExternalStorageDirectory().getPath();
    private static final int NUMBER_OF_THREADS_IN_POOL = 2;
    private static final String LOG_TAG = "KinesisVideoAndroidClient";

    /**
     * NOTE: This is just a sample code to produce a singleton-like instance. Any call to create a client with
     * a different configuration will result in an instance with another configuration returned.
     *
     * TODO: Fix the views properly so we don't need a factory here.
     */
    private static KinesisVideoClient KINESIS_VIDEO_CLIENT_INSTANCE = null;

    private KinesisVideoAndroidClientFactory() {
        throw new UnsupportedOperationException();
    }

    /**
     * Create KinesisVideo client.
     *
     * @param context Android context to use
     * @param credentialsProvider Credentials provider
     * @return
     * @throws KinesisVideoException
     */
    public static KinesisVideoClient createKinesisVideoClient(final @NonNull Context context,
            final @NonNull AWSCredentialsProvider credentialsProvider)
            throws KinesisVideoException {
        return createKinesisVideoClient(context, Regions.DEFAULT_REGION, credentialsProvider);
    }

    /**
     * Create KinesisVideo client.
     *
     * @param context Android context to use
     * @param regions Regions object
     * @param awsCredentialsProvider Credentials provider
     * @return
     * @throws KinesisVideoException
     */
    public static KinesisVideoClient createKinesisVideoClient(final @NonNull Context context,
            final @NonNull Regions regions,
            final @NonNull AWSCredentialsProvider awsCredentialsProvider)
            throws KinesisVideoException {
        final OutputChannel outputChannel = new AndroidLogOutputChannel();

        final Log log = new Log(outputChannel, LogLevel.VERBOSE, LOG_TAG);

        final KinesisVideoCredentialsProvider kinesisVideoCredentialsProvider =
                new KinesisVideoCredentialsProviderImpl(awsCredentialsProvider, log);

        final KinesisVideoClientConfiguration configuration = KinesisVideoClientConfiguration.builder()
                .withRegion(regions.getName())
                .withCredentialsProvider(kinesisVideoCredentialsProvider)
                .withLogChannel(outputChannel)
                .withStorageCallbacks(new DefaultStorageCallbacks())
                .build();

        final ScheduledExecutorService executor = Executors.newScheduledThreadPool(NUMBER_OF_THREADS_IN_POOL);

        return createKinesisVideoClient(context,
                configuration,
                defaultDeviceInfo(context),
                log,
                executor);
    }

    /**
     * Create KinesisVideo client.
     */
    public static KinesisVideoClient createKinesisVideoClient(final @NonNull Context context,
            final @NonNull KinesisVideoClientConfiguration configuration,
            final @NonNull DeviceInfo deviceInfo,
            final @NonNull Log log,
            final @NonNull ScheduledExecutorService executor) throws KinesisVideoException
    {
        if (KINESIS_VIDEO_CLIENT_INSTANCE == null) {
            final KinesisVideoAndroidServiceClient serviceClient = new KinesisVideoAndroidServiceClient(log);

            final KinesisVideoClient kinesisVideoClient = new AndroidKinesisVideoClient(log,
                    context,
                    configuration,
                    serviceClient,
                    executor);

            kinesisVideoClient.initialize(deviceInfo);

            KINESIS_VIDEO_CLIENT_INSTANCE = kinesisVideoClient;
        }

        return KINESIS_VIDEO_CLIENT_INSTANCE;
    }

    public static void freeKinesisVideoClient() throws KinesisVideoException {
        KINESIS_VIDEO_CLIENT_INSTANCE.free();
        KINESIS_VIDEO_CLIENT_INSTANCE = null;
    }

    private static DeviceInfo defaultDeviceInfo(@NonNull final Context context) {
        return new DeviceInfo(
                DEVICE_VERSION,
                DEVICE_NAME,
                defaultStorageInfo(context),
                TEN_STREAMS,
                defaultDeviceTags());
    }

    private static StorageInfo defaultStorageInfo(@NonNull final Context context) {
        return new StorageInfo(0,
                StorageInfo.DeviceStorageType.DEVICE_STORAGE_TYPE_IN_MEM,
                defaultMemorySize(context),
                SPILL_RATIO_90_PERCENT,
                STORAGE_PATH);
             }

    private static long defaultMemorySize(@NonNull final Context context) {
        final ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        final ActivityManager activityManager = (ActivityManager) context.getSystemService(ACTIVITY_SERVICE);
        if (activityManager == null) {
            return MIN_STORAGE_SIZE_64_MEGS;
        }

        activityManager.getMemoryInfo(memoryInfo);
        final long available =  (long) (memoryInfo.availMem * TOTAL_MEMORY_RATIO);
        return Math.min(MAX_STORAGE_SIZE_384_MEGS, available);
    }

    private static Tag[] defaultDeviceTags() {
        // Tags for devices are not supported yet

        return null;
    }
}
