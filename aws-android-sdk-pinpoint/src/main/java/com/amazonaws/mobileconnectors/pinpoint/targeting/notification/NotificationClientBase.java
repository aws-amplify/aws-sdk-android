/**
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.pinpoint.targeting.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;

import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsEvent;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.AndroidPreferences;
import com.amazonaws.services.pinpoint.model.ChannelType;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;

/**
 * NotificationClientBase is the entry point into the Amazon Mobile Analytics SDK to
 * handle Pinpoint notifications.
 */
abstract class NotificationClientBase {
    /**
     * Intent Key for GCM bundle.
     */
    public static final String INTENT_SNS_NOTIFICATION_FROM = "from";

    /**
     * Intent Key for GCM bundle data.
     */
    public static final String INTENT_SNS_NOTIFICATION_DATA = "data";
    // Pinpoint
    protected static final String PINPOINT_PUSH_KEY_PREFIX = "pinpoint.";
    // Campaign

    protected static final String CAMPAIGN_PUSH_KEY_PREFIX = PINPOINT_PUSH_KEY_PREFIX + "campaign.";
    protected static final String CAMPAIGN_ID_ATTRIBUTE_KEY = "campaign_id";
    protected static final String CAMPAIGN_ID_PUSH_KEY = CAMPAIGN_PUSH_KEY_PREFIX + CAMPAIGN_ID_ATTRIBUTE_KEY;
    protected static final String CAMPAIGN_ACTIVITY_ID_ATTRIBUTE_KEY = "campaign_activity_id";
    protected static final String CAMPAIGN_ACTIVITY_ID_PUSH_KEY =
        CAMPAIGN_PUSH_KEY_PREFIX + CAMPAIGN_ACTIVITY_ID_ATTRIBUTE_KEY;
    protected static final String CAMPAIGN_TREATMENT_ID_ATTRIBUTE_KEY = "treatment_id";
    protected static final String CAMPAIGN_TREATMENT_ID_PUSH_KEY =
        CAMPAIGN_PUSH_KEY_PREFIX + CAMPAIGN_TREATMENT_ID_ATTRIBUTE_KEY;
    protected static final Log log = LogFactory.getLog(NotificationClientBase.class);
    private static final String DEVICE_TOKEN_PREF_KEY = "AWSPINPOINT.GCMTOKEN";
    // Notification
    private static final String GCM_NOTIFICATION_PUSH_KEY_PREFIX = PINPOINT_PUSH_KEY_PREFIX + "notification.";
    private static final String NOTIFICATION_SILENT_PUSH_KEY = GCM_NOTIFICATION_PUSH_KEY_PREFIX + "silentPush";
    private static final String NOTIFICATION_TITLE_PUSH_KEY = GCM_NOTIFICATION_PUSH_KEY_PREFIX + "title";
    private static final String NOTIFICATION_BODY_PUSH_KEY = GCM_NOTIFICATION_PUSH_KEY_PREFIX + "body";
    private static final String NOTIFICATION_COLOR_PUSH_KEY = GCM_NOTIFICATION_PUSH_KEY_PREFIX + "color";
    private static final String NOTIFICATION_ICON_PUSH_KEY = GCM_NOTIFICATION_PUSH_KEY_PREFIX + "icon";
    private static final String CAMPAIGN_IMAGE_PUSH_KEY = GCM_NOTIFICATION_PUSH_KEY_PREFIX + "imageUrl";
    private static final String CAMPAIGN_IMAGE_ICON_PUSH_KEY = GCM_NOTIFICATION_PUSH_KEY_PREFIX + "imageIconUrl";
    private static final String CAMPAIGN_IMAGE_SMALL_ICON_PUSH_KEY =
        GCM_NOTIFICATION_PUSH_KEY_PREFIX + "imageSmallIconUrl";
    // Engage Attributes
    private static final String CAMPAIGN_URL_PUSH_KEY = PINPOINT_PUSH_KEY_PREFIX + "url";
    private static final String CAMPAIGN_DEEP_LINK_PUSH_KEY = PINPOINT_PUSH_KEY_PREFIX + "deeplink";
    private static final String CAMPAIGN_OPEN_APP_PUSH_KEY = PINPOINT_PUSH_KEY_PREFIX + "openApp";
    private static final String REQUEST_ID = "requestId";
    private static final int INVALID_RESOURCE = 0;
    private static final int ANDROID_JELLYBEAN = 16;
    private static final int ANDROID_KITKAT = 19;
    private static final int ANDROID_LOLLIPOP = 21;
    private static final int ANDROID_MARSHMALLOW = 23;
    private static final int ANDROID_NOUGAT = 24;
    private static final int ANDROID_OREO = 26;
    private static final int NOTIFICATION_CHANNEL_IMPORTANCE = 4; //IMPORTANCE_HIGH = 4. This corresponds to PRIORITY_HIGH (value 1) in NotificationBuilder. setPriority is deprecated in API 26

    private static final String AWS_EVENT_TYPE_OPENED = "_campaign.opened_notification";
    private static final String AWS_EVENT_TYPE_RECEIVED_FOREGROUND = "_campaign.received_foreground";
    private static final String AWS_EVENT_TYPE_RECEIVED_BACKGROUND = "_campaign.received_background";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String APP_OPS_MODE_ALLOWED = "MODE_ALLOWED";
    private static final String APP_OPS_SERVICE = "APP_OPS_SERVICE";
    private static final String DEFAULT_NOTIFICATION_CHANNEL_ID = "PINPOINT.NOTIFICATION";
    private static final CharSequence DEFAULT_NOTIFICATION_CHANNEL_NAME = "Notifications";
    static final String DIRECT_CAMPAIGN_SEND = "_DIRECT";
    protected final PinpointContext pinpointContext;
    private final AppUtil appUtil;
    private final List<DeviceTokenRegisteredHandler> deviceRegisteredHandlers;
    private volatile String theDeviceToken;
    private Constructor<?> notificationBuilderConstructor = null;
    private Class<?> notificationBuilderClass = null;
    private Class<?> notificationChannelClass = null;
    private Class<?> notificationBigTextStyleClass = null;
    private Class<?> notificationBigPictureStyleClass = null;
    private Class<?> notificationStyleClass = null;
    private Class<?> iconClass = null;
    private Method setContentTitleMethod;
    private Method setContentTextMethod;
    private Method setSmallIconMethod;
    private Method setSmallIconResIdMethod;
    private Method setLargeIconMethod;
    private Method setContentIntent;
    private Method setStyleMethod;
    private Method buildMethod;
    private Method bigTextMethod;
    private Method bigPictureMethod;
    private Method setSummaryMethod;
    private Method setPriorityMethod;
    private Method setSoundMethod;
    private Method createWithBitmapMethod;
    private Bitmap notificationImage;
    private Class<?> appOpsClass = null;
    private Method checkOpNoThrowMethod = null;
    private Field opPostNotificationField = null;
    private Field modeAllowedField = null;
    private String notificationChannelId = null;

    private static Random random = new Random();

    /**
     * Constructor.
     *
     * @param pinpointContext the pinpoint context. {@link PinpointContext}
     */
    protected NotificationClientBase(final PinpointContext pinpointContext) {
        this.pinpointContext = pinpointContext;
        this.appUtil = new AppUtil(pinpointContext.getApplicationContext());
        this.deviceRegisteredHandlers = new ArrayList<DeviceTokenRegisteredHandler>();
        this.loadDeviceToken();
    }

    /**
     * Add a device token register handler.
     *
     * @param handler the devices register handler.
     */
    public final void addDeviceTokenRegisteredHandler(final DeviceTokenRegisteredHandler handler) {
        if (handler == null) {
            throw new IllegalArgumentException("DeviceTokenRegisteredHandler cannot be null.");
        }
        deviceRegisteredHandlers.add(handler);
    }

    /**
     * Remove the device register handler.
     *
     * @param handler the device register handler.
     */
    public final void removeDeviceTokenRegisteredHandler(final DeviceTokenRegisteredHandler handler) {
        deviceRegisteredHandlers.remove(handler);
    }

    /**
     * This method should be called once the device token has been received from
     * the device's messaging api in order to enable being targeted for campaign push
     * notifications.
     *
     * @param deviceToken the device token.
     */
    public final void registerDeviceToken(final String deviceToken) {
        setDeviceToken(deviceToken);
    }

    /**
     * This method should be called once the user id and channel id has been received rom
     * the device's messaging api in order to enable being targeted for campaign push
     * notifications.
     *
     * @param userId the user id
     * @param channelId the channel id
     */
    public final void registerDeviceToken(final String userId, final String channelId) {
        setDeviceToken(userId + ":" + channelId);
    }

    private void setDeviceToken(String deviceToken) {
        this.theDeviceToken = deviceToken;
        // Persist the device token to shared preferences.
        final AndroidPreferences prefs = pinpointContext.getSystem().getPreferences();
        prefs.putString(DEVICE_TOKEN_PREF_KEY, deviceToken);

        for (final DeviceTokenRegisteredHandler handler : deviceRegisteredHandlers) {
            handler.tokenRegistered(deviceToken);
        }
    }

    private void loadDeviceToken() {
        final AndroidPreferences prefs = pinpointContext.getSystem().getPreferences();
        // Load the device token from shared preferences.
        theDeviceToken = prefs.getString(DEVICE_TOKEN_PREF_KEY, null);
    }

    /**
     * get the device token.
     *
     * @return the device token.
     */
    public final String getDeviceToken() {
        this.loadDeviceToken();
        return theDeviceToken;
    }

    /**
     * The Pinpoint channel type for the device associated with
     * this notification client.
     *
     * @return Channel type for the device.
     */
    public abstract String getChannelType();

    private void addGlobalCampaignAttributes(
        final Map<String, String> campaignAttribs) {
        for (final Map.Entry<String, String> entry : campaignAttribs.entrySet()) {
            if (entry.getValue() != null) {
                this.pinpointContext.getAnalyticsClient().addGlobalAttribute(entry.getKey(), entry.getValue());
            }
        }
    }

    private void addCampaignAttributesToEvent(final AnalyticsEvent pushEvent, final Map<String, String> campaignAttribs) {
        for (final Map.Entry<String, String> entry : campaignAttribs.entrySet()) {
            if (entry.getValue() != null) {
                pushEvent.addAttribute(entry.getKey(), entry.getValue());
            }
        }
    }


    private Resources getPackageResources() {
        final PackageManager packageManager = pinpointContext.getApplicationContext().getPackageManager();
        try {
            final String packageName = pinpointContext.getApplicationContext().getPackageName();
            final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, PackageManager.GET_META_DATA);
            return packageManager.getResourcesForApplication(applicationInfo);
        } catch (final PackageManager.NameNotFoundException ex) {
            log.error("Can't find resources for our application package.", ex);
            return null;
        }
    }


    private int getNotificationIconResourceId(
        final String drawableResourceName) {
        final PackageManager packageManager = pinpointContext.getApplicationContext().getPackageManager();
        try {
            final String packageName = pinpointContext.getApplicationContext().getPackageName();
            final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, PackageManager.GET_META_DATA);
            final Resources resources = packageManager.getResourcesForApplication(applicationInfo);

            if (drawableResourceName != null) {
                final int resId = resources.getIdentifier(drawableResourceName, "drawable", packageName);
                if (resId != INVALID_RESOURCE) {
                    return resId;
                }
            }
            return applicationInfo.icon;

        } catch (final PackageManager.NameNotFoundException ex) {
            log.error("Can't find icon for our application package.", ex);
            // 0 is an invalid resource id, so use it to indicate failure to
            // retrieve the resource.
            return INVALID_RESOURCE;
        }
    }

    private Notification createLegacyNotification(final int iconResId, final String title, final String contentText,
                                                  final PendingIntent contentIntent) {
        final Notification notification = new Notification();
        notification.icon = iconResId;
        notification.setLatestEventInfo(this.pinpointContext.getApplicationContext(), title, contentText, contentIntent);
        notification.contentIntent = contentIntent;
        return notification;
    }

    private boolean initClassesAndMethodsByReflection() {
        if (notificationBuilderClass != null) {
            return true;
        }
        try {
            notificationBuilderClass = Class.forName("android.app.Notification$Builder"); //API Level 11
            notificationBigTextStyleClass = Class.forName("android.app.Notification$BigTextStyle"); //API Level 16
            notificationStyleClass = Class.forName("android.app.Notification$Style"); //API Level 16
            notificationBigPictureStyleClass = Class.forName("android.app.Notification$BigPictureStyle"); //API Level 16
            if (android.os.Build.VERSION.SDK_INT >= ANDROID_NOUGAT) {
                iconClass = Class.forName("android.graphics.drawable.Icon"); //API Level 24
            }
            if (android.os.Build.VERSION.SDK_INT >= ANDROID_OREO) {
                notificationChannelClass = Class.forName("android.app.NotificationChannel"); //API Level 26
            }
            if (!buildMethodsByReflection()) {
                // fall back to creating the legacy notification.
                return false;
            }
            return true;
        } catch (final ClassNotFoundException ex) {
            log.debug("Failed to get notification builder classes by reflection : " + ex.getMessage(), ex);
            return false;
        }
    }

    private boolean buildMethodsByReflection() {
        try {
            if (android.os.Build.VERSION.SDK_INT >= ANDROID_OREO) {
                notificationBuilderConstructor = notificationBuilderClass.getDeclaredConstructor(Context.class, String.class);
            } else {
                notificationBuilderConstructor = notificationBuilderClass.getDeclaredConstructor(Context.class);
                setPriorityMethod = notificationBuilderClass.getDeclaredMethod("setPriority", int.class);
                setSoundMethod = notificationBuilderClass.getDeclaredMethod("setSound", Uri.class);
            }
            setContentTitleMethod = notificationBuilderClass.getDeclaredMethod("setContentTitle", CharSequence.class);
            setContentTextMethod = notificationBuilderClass.getDeclaredMethod("setContentText", CharSequence.class);
            setContentIntent = notificationBuilderClass.getDeclaredMethod("setContentIntent", PendingIntent.class);
            setStyleMethod = notificationBuilderClass.getDeclaredMethod("setStyle", notificationStyleClass);
            setSmallIconResIdMethod = notificationBuilderClass.getDeclaredMethod("setSmallIcon", int.class);
            buildMethod = notificationBuilderClass.getDeclaredMethod("build");
            bigTextMethod = notificationBigTextStyleClass.getDeclaredMethod("bigText", CharSequence.class);
            bigPictureMethod = notificationBigPictureStyleClass.getDeclaredMethod("bigPicture", Bitmap.class);
            setSummaryMethod = notificationBigPictureStyleClass.getDeclaredMethod("setSummaryText", CharSequence.class);
            setLargeIconMethod = notificationBuilderClass.getDeclaredMethod("setLargeIcon", Bitmap.class);

            if (android.os.Build.VERSION.SDK_INT >= ANDROID_NOUGAT) {
                setSmallIconMethod = notificationBuilderClass.getDeclaredMethod("setSmallIcon", iconClass);
                createWithBitmapMethod = iconClass.getDeclaredMethod("createWithBitmap", Bitmap.class);
            }
            return true;
        } catch (final NoSuchMethodException ex) {
            log.debug("Failed to get notification builder methods by reflection. : " + ex.getMessage(), ex);
            return false;
        }
    }

    private Object retrieveNotificationChannel(String channelId) {
        if (channelId == null) {
            return null;
        }
        try {
            log.info("Notification channel is needed");
            NotificationManager notificationManager = (NotificationManager) pinpointContext.getApplicationContext()
                    .getSystemService(
                            Context.NOTIFICATION_SERVICE);
            Method getNotificationChannelMethod = notificationManager.getClass().getDeclaredMethod("getNotificationChannel", String.class);
            return getNotificationChannelMethod.invoke(notificationManager, channelId);

        } catch (final NoSuchMethodException ex) {
            log.debug("Failed to get notification channel by reflection. : " + ex.getMessage(), ex);
            return null;
        } catch (final IllegalAccessException ex) {
            log.debug("Failed to get notification channel by reflection. : " + ex.getMessage(), ex);
            return null;
        } catch (final InvocationTargetException ex) {
            log.debug("Failed to get notification channel by reflection. : " + ex.getMessage(), ex);
            return null;
        }
    }

    private boolean registerDefaultNotificationChannel() {
        try {
            Object notificationChannel = retrieveNotificationChannel(DEFAULT_NOTIFICATION_CHANNEL_ID);
            if (notificationChannel != null) {
                return true;
            }
            /* Registering the default notification channel for the first time */
            Constructor<?> notificationChannelConstructor = notificationChannelClass.getDeclaredConstructor(String.class, CharSequence.class, int.class);
            notificationChannel = notificationChannelConstructor.newInstance(DEFAULT_NOTIFICATION_CHANNEL_ID, DEFAULT_NOTIFICATION_CHANNEL_NAME, NOTIFICATION_CHANNEL_IMPORTANCE);
            final NotificationManager notificationManager = (NotificationManager) pinpointContext.getApplicationContext()
                    .getSystemService(
                            Context.NOTIFICATION_SERVICE);
            Method createNotificationChannelMethod =  notificationManager.getClass().getDeclaredMethod("createNotificationChannel", notificationChannelClass);
            createNotificationChannelMethod.invoke(notificationManager, notificationChannel);
            return true;
        } catch (final InvocationTargetException ex) {
            log.debug("Can't invoke notification channel constructor. : " + ex.getMessage(), ex);
            return false;
        } catch (final IllegalAccessException ex) {
            log.debug("Can't access notification channel  " + ex.getMessage(), ex);
            return false;
        } catch (final InstantiationException ex) {
            log.debug("Exception while instantiating notification channel . : " + ex.getMessage(),
                    ex);
            return false;
        } catch (final NoSuchMethodException ex) {
            log.debug("Failed to get notification channel method getId by reflection. : " + ex.getMessage(), ex);
            return false;
        }
    }

    private static final float RED_MULTIPLIER = 0.299f;
    private static final float GREEN_MULTIPLIER = 0.587f;
    private static final float BLUE_MULTIPLIER =  0.114f;
    private static final int TRANSPARENT_WHITE_COLOR = 0x00FFFFFF;
    private static final int BITS_TO_SHIFT_FOR_ALPHA = 24;
    private static final int MAX_ALPHA = Color.alpha(Color.WHITE);

    /**
     * Convert a bitmap to gray-scale and store the gray-scale value in the bitmap alpha channel.
     * If the bitmap to be converted is already a solid color, the input bitmap will be copied
     * as is to the output.
     *
     * @param input the input bitmap.
     * @return the output bitmap.
     */
    /*package*/ static Bitmap convertBitmapToAlphaGreyscale(final Bitmap input) {
        final int pixelCount = input.getWidth() * input.getHeight();
        int[] inPixels = new int[pixelCount];
        input.getPixels(inPixels, 0, input.getWidth(), 0, 0, input.getWidth(), input.getHeight());
        int[] outPixels = new int[pixelCount];
        boolean hasMoreThanOneNonTransparentColor = false;
        Integer firstColor = null;

        for (int i = 0; i < pixelCount; i++) {
            final int inputArgb = inPixels[i];
            final int greyScale;
            final int inputAlpha = Color.alpha(inputArgb);

            // Color is changed to gray-scale in the alpha channel.
            final int calculatedColor = MAX_ALPHA - (Math.round(Color.red(inputArgb) * RED_MULTIPLIER)
                + Math.round(Color.green(inputArgb) * GREEN_MULTIPLIER)
                + Math.round(Color.blue(inputArgb) * BLUE_MULTIPLIER));
            if (inputAlpha != 0) {
                if (firstColor == null) {
                    firstColor = inputArgb & TRANSPARENT_WHITE_COLOR;
                } else if ((inputArgb & TRANSPARENT_WHITE_COLOR) != firstColor) {
                    hasMoreThanOneNonTransparentColor = true;
                }
            }
            greyScale = calculatedColor * inputAlpha / MAX_ALPHA;
            outPixels[i] = (greyScale << BITS_TO_SHIFT_FOR_ALPHA) | TRANSPARENT_WHITE_COLOR;
        }

        if (!hasMoreThanOneNonTransparentColor) {
            // Images that have only one non-transparent color, are already in the expected format
            // for a small icon, and so can be used directly.
            return Bitmap.createBitmap(inPixels, input.getWidth(), input.getHeight(), Bitmap.Config.ARGB_8888);
        }

        return Bitmap.createBitmap(outPixels, input.getWidth(), input.getHeight(), Bitmap.Config.ARGB_8888);
    }

    private Bitmap obtainBitmapFromResId(final int iconResId) {
        final Resources resources = getPackageResources();
        if (resources == null) {
            return null;
        }
        return BitmapFactory.decodeResource(resources, iconResId);
    }

    private boolean buildNotificationIcons(final int iconResId, final String imageIconUrl,
                                           final String imageSmallIconUrl,
                                           final Object notificationBuilder) {
        try {
            Bitmap largeIconBitmap = null;
            if (imageIconUrl != null) {
                try {
                    largeIconBitmap = new DownloadImageTask().execute(imageIconUrl).get();
                } catch (final InterruptedException e) {
                    log.error("Interrupted when downloading image : " + e.getMessage(), e);
                } catch (final ExecutionException e) {
                    log.error("Failed to execute download image thread : " + e.getMessage(), e);
                }
            }

            // When no large icon is set or the large icon can't be loaded.
            if (largeIconBitmap == null &&
                    // For API level 21 and 22, a small icon will be set as the app icon in greyscale,
                    // this could result in a grey box if the app icon was fully opaque, it improve this situation,
                    // we can set the large icon as the app icon, so that the small icon will be shown in the corner
                    // of the large icon, where it doesn't look as bad that it may be a grey box.
                    ((android.os.Build.VERSION.SDK_INT >= ANDROID_LOLLIPOP
                        && android.os.Build.VERSION.SDK_INT < ANDROID_NOUGAT)
                    // For API level 23 and above when the small icon isn't set it makes sense to show the large icon
                    // also for the user experience (to make it easiest for the customer to quickly recognize the app
                    // that caused the notification) also if the large icon fails to load we can fall back to app icon.
                    // We were experiencing crashes using this behavior on API level 23 so only use on API level 24.
                     || (android.os.Build.VERSION.SDK_INT >= ANDROID_NOUGAT
                        && (imageIconUrl != null || imageSmallIconUrl == null)))) {
                largeIconBitmap = obtainBitmapFromResId(iconResId);
            }
            // else before SDK version 21, setting the small icon from the res id will render correctly in color.
            // and if after 23, we will convert the app icon to grey scale when setting the small icon so it will be
            // rendered in a way that looks reasonable.

            if (largeIconBitmap != null) {
                setLargeIconMethod.invoke(notificationBuilder, largeIconBitmap);
            }

            // If we are able to use a bitmap to set the small icon.
            if (iconClass != null && android.os.Build.VERSION.SDK_INT >= ANDROID_NOUGAT) {
                // Small icon cannot be set from a bitmap unless on API level 23 or above.
                // We were experiencing crashes using this behavior on API level 23 so only use on API level 24.
                Bitmap smallIconBitmap = null;
                if (imageSmallIconUrl != null) {
                    try {
                        smallIconBitmap = new DownloadImageTask().execute(imageSmallIconUrl).get();
                    } catch (final InterruptedException e) {
                        log.error("Interrupted when downloading small icon : " + e.getMessage(), e);
                    } catch (final ExecutionException e) {
                        log.error("Failed to execute download image small icon thread : " + e.getMessage(), e);
                    }
                }

                if (smallIconBitmap == null) {
                    // Fall back to using the app icon bitmap as the small icon if no icon was provided.
                    smallIconBitmap = obtainBitmapFromResId(iconResId);
                }

                if (smallIconBitmap != null) {
                    // Set the small icon from the obtained bitmap and always ensure it is properly formatted in
                    // greyscale to avoid ever erroneously showing a grey box.
                    setSmallIconMethod.invoke(notificationBuilder,
                        createWithBitmapMethod.invoke(iconClass, convertBitmapToAlphaGreyscale(smallIconBitmap)));
                    return true;
                }
                // fall through if we can't set the small icon from the bitmap and fall back to setting by icon res id.
            }

            setSmallIconResIdMethod.invoke(notificationBuilder, iconResId);
            return true;
        } catch (final InvocationTargetException ex) {
            log.debug("Can't invoke notification builder methods. : " + ex.getMessage(), ex);
            return false;
        } catch (final IllegalAccessException ex) {
            log.debug("Can't access notification builder methods. : " + ex.getMessage(), ex);
            return false;
        }
    }

    private Notification createNotification(final int iconResId, final String title, final String contentText, final String imageUrl,
                                            final String imageIconUrl, final String imageSmallIconUrl, final PendingIntent contentIntent) {
        log.info("Create Notification:" + title + ", Content:" + contentText);
        if (android.os.Build.VERSION.SDK_INT < ANDROID_JELLYBEAN) {
            return createLegacyNotification(iconResId, title, contentText, contentIntent);
        }

        if (!initClassesAndMethodsByReflection()) {
            // fall back to creating the legacy notification.
            return createLegacyNotification(iconResId, title, contentText, contentIntent);
        }

        final Object notificationBuilder;
        final Object bigTextStyle;
        final Object bigPictureStyle;
        if (android.os.Build.VERSION.SDK_INT >= ANDROID_OREO) {
            if (notificationChannelId == null || retrieveNotificationChannel(notificationChannelId) == null) {
                /* Need to Check if the Default Pinpoint notification channel is registered. The app developer can delete any channel */
                notificationChannelId = DEFAULT_NOTIFICATION_CHANNEL_ID;
                if (!registerDefaultNotificationChannel()) {
                    notificationChannelId = null;
                }
            }
        }

        try {
            if (android.os.Build.VERSION.SDK_INT < ANDROID_OREO || notificationChannelId == null) {
                notificationBuilder = notificationBuilderConstructor.newInstance(pinpointContext.getApplicationContext());
                setPriorityMethod.invoke(notificationBuilder, 1);
            } else {
                notificationBuilder = notificationBuilderConstructor.newInstance(pinpointContext.getApplicationContext(), notificationChannelId);
            }

            bigTextStyle = notificationBigTextStyleClass.newInstance();
            bigPictureStyle = notificationBigPictureStyleClass.newInstance();
        } catch (final InvocationTargetException ex) {
            log.debug("Can't invoke notification builder constructor. : " + ex.getMessage(), ex);
            return createLegacyNotification(iconResId, title, contentText, contentIntent);
        } catch (final IllegalAccessException ex) {
            log.debug("Can't access notification builder or bigTextStyle or bigPictureStyle classes. : " + ex.getMessage(), ex);
            return createLegacyNotification(iconResId, title, contentText, contentIntent);
        } catch (final InstantiationException ex) {
            log.debug("Exception while instantiating notification builder or bigTextStyle or bigPictureStyle classes. : " + ex.getMessage(),
                      ex);
            return createLegacyNotification(iconResId, title, contentText, contentIntent);
        }

        try {
            setContentTitleMethod.invoke(notificationBuilder, title);
            setContentTextMethod.invoke(notificationBuilder, contentText);
            setContentIntent.invoke(notificationBuilder, contentIntent);
            if (android.os.Build.VERSION.SDK_INT < ANDROID_OREO) {
                final Uri defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                setSoundMethod.invoke(notificationBuilder, defaultSoundUri);
            }

            if (!buildNotificationIcons(iconResId, imageIconUrl, imageSmallIconUrl, notificationBuilder)) {
                return createLegacyNotification(iconResId, title, contentText, contentIntent);
            }

            if (imageUrl != null) {
                try {
                    notificationImage = new DownloadImageTask().execute(imageUrl).get();
                } catch (final InterruptedException e) {
                    log.error("Interrupted when downloading image : " + e.getMessage(), e);
                } catch (final ExecutionException e) {
                    log.error("Failed execute download image thread : " + e.getMessage(), e);
                }
            }

            if (notificationImage != null) {
                bigPictureMethod.invoke(bigPictureStyle, notificationImage);
                setSummaryMethod.invoke(bigPictureStyle, contentText);
                setStyleMethod.invoke(notificationBuilder, bigPictureStyle);
            } else {
                bigTextMethod.invoke(bigTextStyle, contentText);
                setStyleMethod.invoke(notificationBuilder, bigTextStyle);
            }

            return (Notification) buildMethod.invoke(notificationBuilder);
        } catch (final InvocationTargetException ex) {
            log.debug("Can't invoke notification builder methods. : " + ex.getMessage(), ex);
            return createLegacyNotification(iconResId, title, contentText, contentIntent);
        } catch (final IllegalAccessException ex) {
            log.debug("Can't access notification builder methods. : " + ex.getMessage(), ex);
            return createLegacyNotification(iconResId, title, contentText, contentIntent);
        }
    }


    /**
     * Handles creation of the open app PendingIntent. Implementors of this method will need to
     * decide on how to create the intent based on the provided action.
     *
     * @param pushBundle    the data to push
     * @param targetClass   the class that handles receiving messages.
     * @param campaignId    pinpoint campaign id
     * @param requestId     request id
     * @param intentAction  intent action
     * @return {@link PendingIntent}
     */
    protected abstract PendingIntent createOpenAppPendingIntent(final Bundle pushBundle, final Class<?> targetClass, final String campaignId,
                                                                final int requestId, final String intentAction);


    protected final Intent notificationIntent(final Bundle pushBundle, final String campaignId, final int requestId, final String intentAction,
                                      final Class<?> targetClass) {
        final Intent notificationIntent = new Intent(pinpointContext.getApplicationContext(), targetClass);
        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        notificationIntent.setAction(intentAction);
        notificationIntent.putExtras(pushBundle);
        notificationIntent.putExtra(INTENT_SNS_NOTIFICATION_FROM, AWS_EVENT_TYPE_OPENED);
        notificationIntent.putExtra(CAMPAIGN_ID_PUSH_KEY, campaignId);
        notificationIntent.putExtra(REQUEST_ID, requestId);
        notificationIntent.setPackage(pinpointContext.getApplicationContext().getPackageName());
        return notificationIntent;
    }

    /**
     * @return a unique notification request ID that is given to the
     *         NotificationManager for the notification. A random identifier
     *         is generated in order to uniquely identify the notification
     *         within the application.
     */
    int getNotificationRequestId(final String campaignId,
                                 final String activityId) {
        // Adding a random unique identifier for direct sends. For a campaign,
        // use the campaingId and the activityId in order to prevent displaying
        // duplicate notifications from a campaign activity.
        if (DIRECT_CAMPAIGN_SEND.equals(campaignId) && activityId == null) {
            return random.nextInt();
        } else {
            return (campaignId + ":" + activityId).hashCode();
        }
    }

    private boolean displayNotification(final Bundle pushBundle, final Class<?> targetClass, final String imageUrl,
                                        final String iconImageUrl, final String iconSmallImageUrl,
                                        final Map<String, String> campaignAttributes, final String intentAction) {
        log.info("Display Notification: " + pushBundle.toString());

        final int iconResId = getNotificationIconResourceId(pushBundle.getString(NOTIFICATION_ICON_PUSH_KEY));
        if (iconResId == 0) {
            return false;
        }

        final String title = pushBundle.getString(NOTIFICATION_TITLE_PUSH_KEY);
        final String message = pushBundle.getString(NOTIFICATION_BODY_PUSH_KEY);

        final String campaignId = campaignAttributes.get(CAMPAIGN_ID_ATTRIBUTE_KEY);
        final String activityId = campaignAttributes.get(CAMPAIGN_ACTIVITY_ID_ATTRIBUTE_KEY);
        final int requestID = getNotificationRequestId(campaignId, activityId);

        log.debug("Displaying Notification for campaign: " + campaignId + 
            " ; activity: " + activityId + 
            " ; notification requestId: " + requestID);

        new Thread(new Runnable() {
            @Override
            public void run() {
                final Notification notification = createNotification(iconResId, title, message, imageUrl, iconImageUrl,
                                                                     iconSmallImageUrl,
                                                                     NotificationClientBase.this.createOpenAppPendingIntent(pushBundle, targetClass,
                                                                                                     campaignId, requestID,
                                                                                                     intentAction));

                notification.flags |= Notification.FLAG_AUTO_CANCEL;
                notification.defaults |= Notification.DEFAULT_SOUND | Notification.DEFAULT_VIBRATE;

                if (android.os.Build.VERSION.SDK_INT >= ANDROID_LOLLIPOP) {
                    log.info("SDK greater than 21 detected: " + android.os.Build.VERSION.SDK_INT);

                    final String colorString = pushBundle.getString(NOTIFICATION_COLOR_PUSH_KEY);
                    if (colorString != null) {
                        int color;
                        try {
                            color = Color.parseColor(colorString);
                        } catch (final IllegalArgumentException ex) {
                            log.warn("Couldn't parse campaign notification color.", ex);
                            color = 0;
                        }
                        Exception exception = null;
                        try {
                            final Field colorField = notification.getClass().getDeclaredField("color");
                            colorField.setAccessible(true);
                            colorField.set(notification, color);
                        } catch (final IllegalAccessException ex) {
                            exception = ex;
                        } catch (final NoSuchFieldException ex) {
                            exception = ex;
                        }
                        if (exception != null) {
                            log.error("Couldn't set campaign notification color : " + exception.getMessage(), exception);
                        }
                    }
                }

                final NotificationManager notificationManager = (NotificationManager) pinpointContext.getApplicationContext()
                                                                                                     .getSystemService(
                                                                                                         Context.NOTIFICATION_SERVICE);

                notificationManager.notify(requestID, notification);
            }
        }).start();

        return true;
    }

    private boolean openApp() {
        final Intent launchIntent = pinpointContext.getApplicationContext().getPackageManager()
                                                   .getLaunchIntentForPackage(
                                                       pinpointContext.getApplicationContext().getPackageName());

        if (launchIntent == null) {
            log.error("Couldn't get app launch intent for campaign notification.");
            return false;
        }
        launchIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
        launchIntent.setPackage(null);
        pinpointContext.getApplicationContext().startActivity(launchIntent);
        return true;
    }

    private void openURL(final String url, final boolean noSchemeValidation) {
        final String validatedUrl;
        if (url.startsWith("http://") || url.startsWith("https://") || noSchemeValidation) {
            validatedUrl = url;
        } else {
            validatedUrl = "http://" + url;
        }

        final Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(validatedUrl));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        if (intent.resolveActivity(pinpointContext.getApplicationContext().getPackageManager()) != null) {
            pinpointContext.getApplicationContext().startActivity(intent);
        }
    }

    /* pkg */
    NotificationClient.CampaignPushResult handleNotificationOpen(
        Map<String, String> campaignAttributes,
        final Bundle data) {
        // Add any campaign global attributes
        if (campaignAttributes != null) {
            // Stop Session
            if (this.pinpointContext.getSessionClient() != null) {
                this.pinpointContext.getSessionClient().stopSession();
            }
            addGlobalCampaignAttributes(campaignAttributes);

            final AnalyticsEvent pushEvent = this.pinpointContext.getAnalyticsClient().createEvent(AWS_EVENT_TYPE_OPENED);
            this.pinpointContext.getAnalyticsClient().recordEvent(pushEvent);
            this.pinpointContext.getAnalyticsClient().submitEvents();

            final String url = data.getString(CAMPAIGN_URL_PUSH_KEY);
            if (url != null) {
                openURL(url, false);
                return NotificationClient.CampaignPushResult.NOTIFICATION_OPENED;
            }
            final String deepLink = data.getString(CAMPAIGN_DEEP_LINK_PUSH_KEY);
            if (deepLink != null) {
                openURL(deepLink, true);
                return NotificationClient.CampaignPushResult.NOTIFICATION_OPENED;
            }
            final String openApp = data.getString(CAMPAIGN_OPEN_APP_PUSH_KEY);
            if (openApp == null) {
                log.warn("No key/value present to determine action for campaign notification, default to open app.");
            }
            openApp();
        }
        return NotificationClient.CampaignPushResult.NOTIFICATION_OPENED;
    }

    /**
     * Handles pinpoint push messages by posting a local notification when
     * the app is in the background, or sending a local broadcast if the app is
     * in the foreground. Also on Api level 19 devices and above, if local
     * notifications have been disabled and the app is in the background, a
     * local broadcast is sent.
     *
     * @param notificationDetails the notification message received by the device's messaging service
     * @return {@link NotificationClient.CampaignPushResult}.
     */
    public final NotificationClient.CampaignPushResult handleCampaignPush(NotificationDetails notificationDetails) {
        final String from = notificationDetails.getFrom();
        final Bundle data = notificationDetails.getBundle();
        final Class<?> targetClass = notificationDetails.getTargetClass();
        String intentAction = notificationDetails.getIntentAction();
        notificationChannelId = notificationDetails.getNotificationChannelId();

        // Check if push data contains a Campaign Id
        if (data == null || !data.containsKey(CAMPAIGN_ID_PUSH_KEY)) {
            return NotificationClient.CampaignPushResult.NOT_HANDLED;
        }

        final boolean isAppInForeground = appUtil.isAppInForeground();

        final String imageUrl = data.getString(CAMPAIGN_IMAGE_PUSH_KEY);
        final String imageIconUrl = data.getString(CAMPAIGN_IMAGE_ICON_PUSH_KEY);
        final String imageSmallIconUrl = data.getString(CAMPAIGN_IMAGE_SMALL_ICON_PUSH_KEY);
        final Map<String, String> campaignAttributes = new HashMap<String, String>();

        campaignAttributes.put(CAMPAIGN_ID_ATTRIBUTE_KEY, data.getString(CAMPAIGN_ID_PUSH_KEY));
        campaignAttributes.put(CAMPAIGN_TREATMENT_ID_ATTRIBUTE_KEY, data.getString(CAMPAIGN_TREATMENT_ID_PUSH_KEY));
        campaignAttributes.put(CAMPAIGN_ACTIVITY_ID_ATTRIBUTE_KEY, data.getString(CAMPAIGN_ACTIVITY_ID_PUSH_KEY));

        this.pinpointContext.getAnalyticsClient().setCampaignAttributes(campaignAttributes);
        log.info("Campaign Attributes are:" + campaignAttributes);

        if (AWS_EVENT_TYPE_OPENED.equals(from)) {
            return this.handleNotificationOpen(campaignAttributes, data);
        }

        // Create the push event.
        String eventType = null;
        if (isAppInForeground) {
            eventType = AWS_EVENT_TYPE_RECEIVED_FOREGROUND;
        } else {
            eventType = AWS_EVENT_TYPE_RECEIVED_BACKGROUND;
        }
        final AnalyticsEvent pushEvent = this.pinpointContext.getAnalyticsClient().createEvent(eventType);

        // Add the campaign attributes.
        addCampaignAttributesToEvent(pushEvent, campaignAttributes);
        pushEvent.addAttribute("isAppInForeground", Boolean.toString(isAppInForeground));
        try {
            // Ignore whether the app is in the foreground if the configuration indicates it should post
            // notifications in the foreground.
            if (
                !pinpointContext.getPinpointConfiguration().getShouldPostNotificationsInForeground() && isAppInForeground) {
                // Notify the caller that the app was in the foreground.
                return NotificationClient.CampaignPushResult.APP_IN_FOREGROUND;
            } else {
                // Display a notification with an icon, title, message,
                // image, and default sound.
                if ("1".equalsIgnoreCase(data.getString(NOTIFICATION_SILENT_PUSH_KEY))) {
                    return NotificationClient.CampaignPushResult.SILENT;
                }

                // App is in the background; attempt to display a
                // notification in the notification center.
                if (!areAppNotificationsEnabled() ||
                    !displayNotification(data, targetClass, imageUrl, imageIconUrl, imageSmallIconUrl, campaignAttributes,
                                         intentAction)) {
                    // Local app notifications have been disabled by the
                    // user from Settings -> App Info
                    // or we couldn't display the notification for some
                    // reason.

                    pushEvent.addAttribute("isOptedOut", "true");
                    // We can't post a notification, so delegate to the
                    // passed in handler.
                    return NotificationClient.CampaignPushResult.OPTED_OUT;
                }
            }
        } finally {
            this.pinpointContext.getAnalyticsClient().recordEvent(pushEvent);
            this.pinpointContext.getAnalyticsClient().submitEvents();
        }
        return NotificationClient.CampaignPushResult.POSTED_NOTIFICATION;
    }

    /**
     * If app-level opt-out is enabled, this method always returns false. Otherwise,
     * the following logic applies: On devices using Android API level 19 and above,
     * this method properly returns whether local notifications are enabled for the app.
     * For devices before API level 19, this method always returns true. Disabling
     * notifications was a feature added on devices supporting API Level 16 and
     * above, so devices from API level 16 to 18 will return true from this
     * method even when local notifications have been disabled for the app.
     *
     * @return true if local notifications are enabled for this app, otherwise
     * false.
     */
    public final boolean areAppNotificationsEnabled() {
        final AppLevelOptOutProvider provider = pinpointContext.getPinpointConfiguration().getAppLevelOptOutProvider();
        if (provider != null && provider.isOptedOut()) {
            return false;
        }

        return areAppNotificationsEnabledOnPlatform();
    }

    boolean areAppNotificationsEnabledOnPlatform() {
        if (android.os.Build.VERSION.SDK_INT < ANDROID_KITKAT) {
            return true;
        }

        final String appOpsServiceName;
        try {
            final Field appOpsServiceNameField = Context.class.getDeclaredField(APP_OPS_SERVICE);
            appOpsServiceName = (String) appOpsServiceNameField.get(String.class);
        } catch (final NoSuchFieldException e) {
            log.error(e.getMessage(), e);
            return true;
        } catch (final IllegalAccessException e) {
            log.error(e.getMessage(), e);
            return true;
        }

        final Object mAppOps = pinpointContext.getApplicationContext().getSystemService(appOpsServiceName);
        if (mAppOps == null) {
            return true;
        }

        final ApplicationInfo appInfo = pinpointContext.getApplicationContext().getApplicationInfo();
        final String pkg = pinpointContext.getApplicationContext().getPackageName();

        final int uid = appInfo.uid;

        try {
            if (appOpsClass == null || checkOpNoThrowMethod == null || opPostNotificationField == null || modeAllowedField == null) {
                appOpsClass = Class.forName(mAppOps.getClass().getName());
                checkOpNoThrowMethod = appOpsClass.getMethod(CHECK_OP_NO_THROW, Integer.TYPE, Integer.TYPE, String.class);
                opPostNotificationField = appOpsClass.getDeclaredField(OP_POST_NOTIFICATION);
                modeAllowedField = appOpsClass.getDeclaredField(APP_OPS_MODE_ALLOWED);
            }

            final int postNotificationValue = opPostNotificationField.getInt(null);
            final int opPostNotificationMode = (Integer) checkOpNoThrowMethod.invoke(mAppOps, postNotificationValue, uid, pkg);
            final int modeAllowed = modeAllowedField.getInt(null);
            return (modeAllowed == opPostNotificationMode);

        } catch (final Exception e) {
            log.error(e.getMessage(), e);
        }
        return true;
    }

    /**
     * Creates a new NotificationClientBase based on the supplied context and channel type. This method
     * returns an instance based on NotificationClientBase interface.
     *
     * @param pinpointContext Context to associate with the client.
     * @param channelType The channel type the client will support.
     * @return A new instance of the {@link NotificationClientBase}.
     */
    public static NotificationClientBase createClient(PinpointContext pinpointContext, ChannelType channelType) {
        NotificationClientBase client = null;
        switch (channelType) {
            case ADM:
                client = new ADMNotificationClient(pinpointContext);
                break;
            case GCM:
                client = new GCMNotificationClient(pinpointContext);
                break;
            case BAIDU:
                client = new BaiduNotificationClient(pinpointContext);
                break;
            default:
                client = new GCMNotificationClient(pinpointContext);
                break;
        }
        return client;
    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected Bitmap doInBackground(String... urls) {
            try {
                return BitmapFactory.decodeStream((new URL(urls[0])).openConnection().getInputStream());
            } catch (final IOException ex) {
                log.error("Cannot download or find image for rich notification.", ex);
                return null;
            }
        }
    }
}
