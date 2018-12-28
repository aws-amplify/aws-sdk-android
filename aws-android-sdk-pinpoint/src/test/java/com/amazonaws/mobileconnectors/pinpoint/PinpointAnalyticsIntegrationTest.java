package com.amazonaws.mobileconnectors.pinpoint;

import android.content.Context;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.pinpoint.AmazonPinpointClient;
import com.amazonaws.services.pinpoint.model.EndpointDemographic;
import com.amazonaws.services.pinpoint.model.EndpointLocation;
import com.amazonaws.services.pinpoint.model.EventsBatch;
import com.amazonaws.services.pinpoint.model.EventsRequest;
import com.amazonaws.services.pinpoint.model.Event;
import com.amazonaws.services.pinpoint.model.PublicEndpoint;
import com.amazonaws.services.pinpoint.model.PutEventsRequest;
import com.amazonaws.services.pinpoint.model.PutEventsResult;
import com.amazonaws.services.pinpoint.model.Session;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import java.util.HashMap;

/**
 * This integration test suite values can be setup with
 * amplify init
 * amplify add analytics
 * amplify push
 * Then replacing the redacted static values
 */
@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE, sdk=23)
public class PinpointAnalyticsIntegrationTest {

    public static final String COGNITO_IDENTITY_POOL = "redacted_pinpoint_cognito_identity_pool";
    public static final Regions COGNITO_REGION = Regions.US_EAST_1;
    public static final String PINPOINT_APP_ID = "redacted_pinpoint_app_id";
    public static final Regions PINPOINT_REGION = Regions.US_EAST_1;

    AmazonPinpointClient amazonPinpointClient;

    @Before
    public void setup() {
        final Context context = RuntimeEnvironment.application;
        CognitoCachingCredentialsProvider credentialsProvider = new CognitoCachingCredentialsProvider(context, COGNITO_IDENTITY_POOL, COGNITO_REGION);
        amazonPinpointClient = new AmazonPinpointClient(credentialsProvider);
        amazonPinpointClient.setRegion(Region.getRegion(PINPOINT_REGION));
    }

    @Test
    public void testSubmitEvents() {
        Event event = new Event()
                .withSession(new Session()
                        .withId("abc123ab-20181227-201702280")
                        .withStartTimestamp("2018-12-27T20:17:02.280Z"))
                .withEventType("_session.start")
                .withMetrics(new HashMap<String, Double>())
                .withTimestamp("2018-12-27T20:17:02:352Z");
        String key = "7de7c2a0-062e-4823-a766-4f24d97247fe";
        PutEventsRequest putEventsRequest = new PutEventsRequest()
                .withEventsRequest(new EventsRequest()
                        .addBatchItemEntry(key, new EventsBatch()
                                .withEndpoint(new PublicEndpoint()
                                    .withChannelType("GCM")
                                    .withDemographic(new EndpointDemographic()
                                        .withAppVersion("1.0")
                                        .withLocale("en_US")
                                        .withMake("Google")
                                        .withModel("IntegrationTest")
                                        .withPlatform("ANDROID")
                                        .withPlatformVersion("8.0.0")
                                        .withTimezone("America/Los_Angeles"))
                                    .withEffectiveDate("2018-12-27T20:16:28.893Z")
                                    .withLocation(new EndpointLocation().withCity("").withCountry("USA").withPostalCode("").withRegion(""))
                                    .withMetrics(new HashMap<String, Double>())
                                    .withOptOut("ALL"))
                                .addEventsEntry("key", event)))
                .withApplicationId(PINPOINT_APP_ID);
        PutEventsResult putEventsResult = amazonPinpointClient.putEvents(putEventsRequest);
        assert putEventsResult.getEventsResponse() != null;
        assert putEventsResult.getEventsResponse().getResults() != null;
        assert putEventsResult.getEventsResponse().getResults().get(key) != null;
    }
}
