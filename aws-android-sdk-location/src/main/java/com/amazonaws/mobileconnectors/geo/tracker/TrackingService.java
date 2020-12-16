package com.amazonaws.mobileconnectors.geo.tracker;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.location.Location;
import android.location.LocationManager;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import com.amazonaws.services.geo.R;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class TrackingService extends Service {
    private static final String TAG = TrackingService.class.getSimpleName();
    private static final String CHANNEL_ID = "AWS_TRACKING_CHANNEL_ID";
    private static final int NOTIFICATION_ID = 14789124;
    private final IBinder binder = new LocalBinder();
    private NotificationManager notificationManager;
    private FusedLocationProviderClient fusedLocationProviderClient;
    private LocationCallback locationCallback;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "TrackingService onCreate triggered");
        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel =
                    new NotificationChannel(
                            CHANNEL_ID,
                            "AWS Location Tracking Service",
                            NotificationManager.IMPORTANCE_DEFAULT);

            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "TrackingService onStartCommand triggered");
        super.onStartCommand(intent, flags, startId);
        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "TrackingService onDestroy triggered");
        super.onDestroy();
        stopLocationUpdates();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "TrackingService onBind triggered");
        return binder;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d(TAG, "TrackingService onUnbind triggered");
        return super.onUnbind(intent);
    }

    @SuppressLint("MissingPermission") // Developer's responsibility to add location permissions to their app.
    public void startLocationUpdates(final Long interval, final TrackingServiceListener listener) {
        // Bring the service to the foreground, displaying the proper notification
        startForeground(NOTIFICATION_ID, getNotification());

        try {
            // Make a getLastKnownLocation call on the location manager to simply detect if proper permissions
            // are present
            LocationManager locationManager =
                    (LocationManager) getApplicationContext().getSystemService(Context.LOCATION_SERVICE);
            locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);

            fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(getApplicationContext());

            LocationRequest request = new LocationRequest();
            request.setInterval(interval);
            request.setFastestInterval(interval);
            request.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);

            locationCallback = new LocationCallback() {
                @Override
                public void onLocationResult(LocationResult locationResult) {
                    super.onLocationResult(locationResult);
                    listener.onLocationReceived(locationResult.getLastLocation());
                }
            };

            fusedLocationProviderClient.requestLocationUpdates(request,
                    locationCallback, Looper.myLooper());

        } catch (Exception exception) {
            listener.onError(TrackingError.missingLocationPermissions());
        }
    }

    public void stopLocationUpdates() {
        try {
            fusedLocationProviderClient.removeLocationUpdates(locationCallback);
            stopForeground(true);
        } catch (SecurityException unlikely) {
            // Location permissions were manually revoked and thus were unable to stop location updates.
            // However we currently don't have a callback for stopTracking and don't think this is worth
            // adding one for.
        }
    }

    private Notification getNotification() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setContentTitle("Location tracking")
                .setOngoing(true)
                .setPriority(Notification.PRIORITY_HIGH)
                .setWhen(System.currentTimeMillis());

        // Set the Channel ID for Android O.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            builder.setChannelId(CHANNEL_ID); // Channel ID
        }

        return builder.build();
    }

    public class LocalBinder extends Binder {
        public TrackingService getService() {
            return TrackingService.this;
        }
    }
}
