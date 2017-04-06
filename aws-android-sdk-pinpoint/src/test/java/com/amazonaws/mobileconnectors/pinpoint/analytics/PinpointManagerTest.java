
package com.amazonaws.mobileconnectors.pinpoint.analytics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import android.app.Activity;

import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.mobileconnectors.pinpoint.PinpointCallback;
import com.amazonaws.mobileconnectors.pinpoint.PinpointConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.PinpointManager;
import com.amazonaws.mobileconnectors.pinpoint.analytics.utils.ContextWithPermissions;
import com.amazonaws.regions.Regions;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.Random;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class PinpointManagerTest {

    public static final String uniqueAnalyticsTag1 = "dd0fe530-edca-11e3-ac10-0800200c9a66+TEST";
    private PinpointManager analyticsClient;
    private static StaticCredentialsProvider provider;

    private PinpointConfiguration createConfig(String appId){
        provider = new StaticCredentialsProvider(new AnonymousAWSCredentials());
        return new PinpointConfiguration(new ContextWithPermissions(
                new Activity().getApplicationContext()),
                appId,
                Regions.US_EAST_1,
                provider);
    }

    /**
     * Sets up the clients, and also tests the creation callback functionality.
     */
    @Before
    public void setup() {
        PinpointConfiguration options = createConfig(uniqueAnalyticsTag1 + (new Random()).nextInt());
        analyticsClient = new PinpointManager(options);
    }

    @Test
    public void initAndTestConstructorCallback() {
        PinpointConfiguration options = createConfig(uniqueAnalyticsTag1)
                .withInitCompletionCallback(new PinpointCallback<PinpointManager>() {
                    @Override
                    public void onComplete(PinpointManager arg0) {
                        arg0.getAnalyticsClient()
                                .addGlobalAttribute("globalComplete", "GlobalComplete");
                        assertNotNull(arg0.getTargetingClient());
                        assertNotNull(arg0.getSessionClient());
                    }
                });

        analyticsClient = new PinpointManager(options);
        assertTrue(analyticsClient.getAnalyticsClient().createEvent("testInitCallback")
                .hasAttribute("globalComplete"));
    }

    @Test
    public void initPinpointEnabledAndTestConstructorCallback() {
        PinpointConfiguration options = createConfig(uniqueAnalyticsTag1)
                .withEnablePinpoint(true)
                .withInitCompletionCallback(new PinpointCallback<PinpointManager>() {
                    @Override
                    public void onComplete(PinpointManager arg0) {
                        arg0.getAnalyticsClient()
                                .addGlobalAttribute("globalComplete", "GlobalComplete");
                        assertNotNull(arg0.getTargetingClient());
                        assertNotNull(arg0.getSessionClient());
                    }
                });

        analyticsClient = new PinpointManager(options);
        assertTrue(analyticsClient.getAnalyticsClient().createEvent("testInitCallback")
                .hasAttribute("globalComplete"));
    }

    @Test
    public void initAndTestNewConstructor() {
        PinpointConfiguration config = createConfig(uniqueAnalyticsTag1);
        analyticsClient = new PinpointManager(config);

        assertNotNull(analyticsClient);
    }
}
