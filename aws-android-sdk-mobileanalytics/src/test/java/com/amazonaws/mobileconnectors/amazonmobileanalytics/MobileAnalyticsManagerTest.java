
package com.amazonaws.mobileconnectors.amazonmobileanalytics;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;

import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.regions.Regions;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import java.util.Random;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class MobileAnalyticsManagerTest {

    public static final String uniqueAnalyticsTag1 = "dd0fe530-edca-11e3-ac10-0800200c9a66+TEST";
    private MobileAnalyticsManager analyticsClient;
    private Context context;
    private static StaticCredentialsProvider provider;

    private class ContextWithPermissions extends ContextWrapper {
        public ContextWithPermissions(Context base) {
            super(base);
        }

        @Override
        public int checkCallingOrSelfPermission(String permission) {
            if (permission.equalsIgnoreCase("android.permission.INTERNET")
                    || permission.equalsIgnoreCase("android.permission.ACCESS_NETWORK_STATE"))
                return PackageManager.PERMISSION_GRANTED;
            else
                return super.checkCallingOrSelfPermission(permission);
        }

    }

    /**
     * Sets up the clients, and also tests the creation callback functionality.
     */
    @Before
    public void setup() {
        context = RuntimeEnvironment.application.getApplicationContext();
        provider = new StaticCredentialsProvider(new AnonymousAWSCredentials());

        AnalyticsConfig options = new AnalyticsConfig();
        options.withAllowsWANDelivery(true);
        analyticsClient = MobileAnalyticsManager.getOrCreateInstance(new ContextWithPermissions(
                context),
                uniqueAnalyticsTag1 + (new Random()).nextInt(),
                Regions.US_EAST_1, provider, options);

    }

    @Test
    public void initAndTestConstructorCallback() {
        AnalyticsConfig options = new AnalyticsConfig();
        options.withAllowsWANDelivery(true);

        analyticsClient = MobileAnalyticsManager.getOrCreateInstance(new ContextWithPermissions(
                context), uniqueAnalyticsTag1, Regions.US_EAST_1,
                provider, options,
                new AnalyticsCallback<MobileAnalyticsManager>() {
                    @Override
                    public void onComplete(MobileAnalyticsManager arg0) {
                        arg0.getEventClient()
                                .addGlobalAttribute("globalComplete", "GlobalComplete");
                    }
                });

        assertTrue(analyticsClient.getEventClient().createEvent("testInitCallback")
                .hasAttribute("globalComplete"));
    }

    @Test
    public void initAndTestNewConstructor() {

        analyticsClient = MobileAnalyticsManager.getOrCreateInstance(new ContextWithPermissions(
                context),
                uniqueAnalyticsTag1 + (new Random()).nextInt(),
                "COGNITOID");

        assertNotNull(analyticsClient);
    }
}
