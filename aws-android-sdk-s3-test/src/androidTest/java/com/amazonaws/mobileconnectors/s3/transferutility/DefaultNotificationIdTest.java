/**
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

public class DefaultNotificationIdTest {
    private Intent tsIntent;

    private final Notification notification = new Notification();
    private final TransferService ts = new TransferService();

    private static boolean notificationPassed;
    private static boolean notificationIdAssigned;
    private static boolean removeNotificationAssigned;

    private static int notificationId;
    private static boolean removeNotification;

    /**
     * Ignore test if version < 26.
     */
    @Before
    public void setUp() {
        assumeTrue(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O);

        notificationPassed = false;
        notificationIdAssigned = false;
        removeNotificationAssigned = false;

        tsIntent = new Intent() {
            @Override
            public <T extends Parcelable> T getParcelableExtra(String name) {
                T parcelableExtra = super.getParcelableExtra(name);
                notificationPassed = parcelableExtra != null;
                return parcelableExtra;
            }

            @Override
            public int getIntExtra(String name, int defaultValue) {
                notificationId = super.getIntExtra(name, defaultValue);
                notificationIdAssigned = true;
                return notificationId;
            }

            @Override
            public boolean getBooleanExtra(String name, boolean defaultValue) {
                removeNotification = super.getBooleanExtra(name, defaultValue);
                removeNotificationAssigned = true;
                return removeNotification;
            }
        };
    }

    @Test
    public void testNotificationNotPassed() {
        try {
            ts.onStartCommand(tsIntent, 0, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertFalse(notificationPassed);
        assertFalse(notificationIdAssigned);
        assertFalse(removeNotificationAssigned);
    }

    @Test
    public void testNotificationPassed() {
        tsIntent.putExtra(TransferService.INTENT_KEY_NOTIFICATION, notification);
        try {
            ts.onStartCommand(tsIntent, 0, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertTrue(notificationPassed);
    }

    @Test
    public void testDefaultNotificationConfig() {
        tsIntent.putExtra(TransferService.INTENT_KEY_NOTIFICATION, notification);
        try {
            ts.onStartCommand(tsIntent, 0, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertTrue(notificationIdAssigned);
        assertEquals(1, notificationId);

        assertTrue(removeNotificationAssigned);
        assertEquals(true, removeNotification);
    }

    @Test
    public void testCustomNotificationConfig() {
        tsIntent.putExtra(TransferService.INTENT_KEY_NOTIFICATION, notification);
        tsIntent.putExtra(TransferService.INTENT_KEY_NOTIFICATION_ID, 42);
        tsIntent.putExtra(TransferService.INTENT_KEY_REMOVE_NOTIFICATION, false);
        try {
            ts.onStartCommand(tsIntent, 0, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertTrue(notificationIdAssigned);
        assertEquals(42, notificationId);

        assertTrue(removeNotificationAssigned);
        assertEquals(false, removeNotification);
    }
}
