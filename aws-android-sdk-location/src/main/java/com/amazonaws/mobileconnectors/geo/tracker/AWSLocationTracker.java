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

package com.amazonaws.mobileconnectors.geo.tracker;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.NonNull;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.geo.AmazonLocationClient;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Monitor your device's location and periodically send the tracked coordinates to the Amazon Location Service.
 */
public class AWSLocationTracker {
    private static final String TAG = AWSLocationTracker.class.getSimpleName();
    public static final Long DEFAULT_RETRIEVE_LOCATION_FREQUENCY = TimeUnit.SECONDS.toMillis(30);
    public static final Long DEFAULT_EMIT_LOCATION_FREQUENCY = TimeUnit.MINUTES.toMillis(5);
    private static final String DEFAULT_DEVICE_ID_KEY = "AWSLocationTrackerDeviceId";
    private AtomicBoolean isTracking;
    private String deviceId;
    private TrackingListener listener;
    private TrackingOptions options;
    private TrackingService trackingService;
    private TrackingPublisher trackingPublisher;
    private final String trackerName;
    private final AWSCredentialsProvider credentialsProvider;
    private final AmazonLocationClient locationClient;

    private final ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.d(TAG, "ServiceConnection onServiceConnected triggered.");
            TrackingService.LocalBinder binder = (TrackingService.LocalBinder) service;
            trackingService = binder.getService();
            trackingService.startLocationUpdates(
                    options.getRetrieveLocationFrequency() == null ?
                            DEFAULT_RETRIEVE_LOCATION_FREQUENCY :
                            options.getRetrieveLocationFrequency(),
                    new TrackingServiceListener() {
                        @Override
                        public void onLocationReceived(Location location) {
                            trackingPublisher.enqueue(location);
                        }

                        @Override
                        public void onError(TrackingError exception) {
                            listener.onDataPublicationError(exception);
                        }
                    }
            );

            isTracking.set(true);
        }

        /**
         * This only gets triggered if the service process crashes. It
         * does not get invoked when unbind is called for the last client
         * connected to the service.
         * @param name
         */
        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.d(TAG, "ServiceConnection onServiceDisconnected triggered.");
            stopTracking();
        }
    };

    /**
     * Create a new tracker instance.
     * @param trackerName The name of your tracker resource.
     * @param credentialsProvider Your auth provider - most likely AWSMobileClient.getInstance()
     */
    public AWSLocationTracker(
            @NonNull String trackerName,
            @NonNull AWSCredentialsProvider credentialsProvider) {
        this.trackerName = trackerName;
        this.credentialsProvider = credentialsProvider;
        this.isTracking = new AtomicBoolean(false);
        this.locationClient = new AmazonLocationClient(credentialsProvider, new ClientConfiguration());
    }

    /**
     * Start monitoring your device's location and sending the tracked coordinates to Amazon Location Service.
     * @param context Context for the application you are calling this from
     */
    public void startTracking(@NonNull Context context) {
        startTracking(context, TrackingOptions.builder().build(), new EmptyTrackingListener());
    }

    /**
     * Start monitoring your device's location and sending the tracked coordinates to Amazon Location Service.
     * @param context Context for the application you are calling this from
     * @param listener Contains the various callback methods to listen to the different events which will be emitted.
     */
    public void startTracking(
            @NonNull Context context,
            @NonNull TrackingListener listener) {
        startTracking(context, TrackingOptions.builder().build(), listener);
    }

    /**
     * Start monitoring your device's location and sending the tracked coordinates to Amazon Location Service.
     * @param context Context for the application you are calling this from
     * @param options Configure details of how tracking will work.
     * @param listener Contains the various callback methods to listen to the different events which will be emitted.
     */
    public synchronized void startTracking(
            @NonNull Context context,
            @NonNull TrackingOptions options,
            @NonNull TrackingListener listener) {
        if (isTracking()) {
            throw new RuntimeException("Location tracker already started.");
        }
        this.deviceId = options.getCustomDeviceId() == null ?
                getDefaultDeviceId(context) : options.getCustomDeviceId();
        this.listener = listener;
        this.options = options;
        this.trackingPublisher = new TrackingPublisher(
                locationClient,
                deviceId,
                trackerName,
                5,
                options.getEmitLocationFrequency() == null ?
                        DEFAULT_EMIT_LOCATION_FREQUENCY :
                        options.getEmitLocationFrequency(),
                10,
                listener);

        context.bindService(new Intent(context, TrackingService.class), serviceConnection,
                Context.BIND_AUTO_CREATE);
    }

    /**
     * Stop recording and sending the device's location. You can start tracking again with new options if you want.
     */
    public synchronized void stopTracking(@NonNull Context context) {
        if (isTracking()) {
            context.unbindService(serviceConnection);
            // Since onServiceDisconnected on gets called if the service crashes, we need to shutdown the
            // tracking processes from here as well. Simply unbinding doesn't trigger onServiceDisconnected (see above)
            stopTracking();
        }
    }

    /**
     * Returns true if this tracker instance is currently monitoring and sending the device's location. False otherwise.
     * @return true if this tracker instance is currently monitoring and sending the device's location. False otherwise.
     */
    public synchronized boolean isTracking() {
        return this.isTracking.get();
    }

    private void stopTracking() {
        if (trackingService != null && trackingPublisher != null) {
            trackingService.stopLocationUpdates();
            trackingPublisher.shutdown();
            trackingPublisher = null;
            trackingService = null;
            isTracking.set(false);
            listener.onStop();
        }
    }

    private String getDefaultDeviceId(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(DEFAULT_DEVICE_ID_KEY, Context.MODE_PRIVATE);
        String uniqueID = sharedPreferences != null ?
                sharedPreferences.getString(DEFAULT_DEVICE_ID_KEY, null) : null;

        if (uniqueID == null && sharedPreferences != null) {
            uniqueID = UUID.randomUUID().toString();
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(DEFAULT_DEVICE_ID_KEY, uniqueID);
            editor.apply();
        }

        return uniqueID;
    }
}
