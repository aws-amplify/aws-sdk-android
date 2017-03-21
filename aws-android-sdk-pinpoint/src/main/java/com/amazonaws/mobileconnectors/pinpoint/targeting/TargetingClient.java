/**
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * <p>
 * http://aws.amazon.com/apache2.0
 * <p>
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.pinpoint.targeting;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.mobileconnectors.pinpoint.PinpointManager;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.targeting.endpointProfile.EndpointProfile;
import com.amazonaws.services.pinpoint.model.EndpointDemographic;
import com.amazonaws.services.pinpoint.model.EndpointLocation;
import com.amazonaws.services.pinpoint.model.EndpointRequest;
import com.amazonaws.services.pinpoint.model.UpdateEndpointRequest;
import com.amazonaws.services.pinpoint.model.EndpointUser;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.VersionInfoUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static com.amazonaws.mobileconnectors.pinpoint.internal.core.util.Preconditions.checkNotNull;

public class TargetingClient {
    private static final String USER_AGENT = PinpointManager.class.getName() + "/"
            + VersionInfoUtils.getVersion();

    private static final Log log =
            LogFactory.getLog(TargetingClient.class);
    private final static int MAX_EVENT_OPERATIONS = 1000;
    private final static String CUSTOM_ATTRIBUTES_KEY = "ENDPOINT_PROFILE_CUSTOM_ATTRIBUTES";
    private final static String CUSTOM_METRICS_KEY = "ENDPOINT_PROFILE_CUSTOM_METRICS";

    private final PinpointContext context;
    private final Map<String, java.util.List<String>> globalAttributes;
    private final Map<String, Double> globalMetrics;
    private final ExecutorService endpointRunnableQueue;
    private final EndpointProfile endpointProfile;

    //For testing
    public TargetingClient(final PinpointContext context, ThreadPoolExecutor executor) {
        checkNotNull(context, "A valid pinpointContext must be provided");
        this.endpointRunnableQueue = executor;
        this.context = context;
        this.endpointProfile = new EndpointProfile(this.context);
        globalAttributes = loadAttributes();
        globalMetrics = loadMetrics();
    }

    public TargetingClient(final PinpointContext context) {
        this(context, new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(MAX_EVENT_OPERATIONS),
                new ThreadPoolExecutor.DiscardPolicy()));
    }

    /**
     * Returns the device endpoint profile.
     * TargetingClient attributes and Metrics are added to the endpoint profile.
     * @returns the current device endpoint profile
     */
    public EndpointProfile currentEndpoint() {
        // Add global  attributes.
        if (!this.globalAttributes.isEmpty()) {
            for (Map.Entry<String, java.util.List<String>> pair : globalAttributes.entrySet()) {
                this.endpointProfile.addAttribute(pair.getKey(), pair.getValue());
            }
        }

        if (!this.globalMetrics.isEmpty()) {
            for (Map.Entry<String, Double> pair : globalMetrics.entrySet()) {
                this.endpointProfile.addMetric(pair.getKey(), pair.getValue());
            }
        }
        return this.endpointProfile;
    }

    /**
     * Register the current endpoint with the Pinpoint service.
     * TargetingClient attributes and Metrics are added to the endpoint profile.
     */
    public void updateEndpointProfile() {
        this.executeUpdate(this.currentEndpoint());
    }

    /**
     * Register the provided endpoint with the Pinpoint service.
     * TargetingClient attributes and Metrics are added to the endpoint profile.
     */
    public void updateEndpointProfile(EndpointProfile endpointProfile) {
        // Add global  attributes.
        if (!this.globalAttributes.isEmpty()) {
            for (Map.Entry<String, java.util.List<String>> pair : globalAttributes.entrySet()) {
                endpointProfile.addAttribute(pair.getKey(), pair.getValue());
            }
        }

        if (!this.globalMetrics.isEmpty()) {
            for (Map.Entry<String, Double> pair : globalMetrics.entrySet()) {
                endpointProfile.addMetric(pair.getKey(), pair.getValue());
            }
        }
        this.executeUpdate(endpointProfile);
    }

    private void executeUpdate(EndpointProfile endpointProfile) {
        EndpointDemographic demographic = new EndpointDemographic().withAppVersion(endpointProfile.getDemographic().getAppVersion())
                .withLocale(endpointProfile.getDemographic().getLocale().getISO3Country())
                .withTimezone(endpointProfile.getDemographic().getTimezone())
                .withMake(endpointProfile.getDemographic().getMake())
                .withModel(endpointProfile.getDemographic().getModel())
                .withPlatform(endpointProfile.getDemographic().getPlatform())
                .withPlatformVersion(endpointProfile.getDemographic().getPlatformVersion());

        EndpointLocation location = new EndpointLocation()
                .withLatitude(endpointProfile.getLocation().getLatitude())
                .withLongitude(endpointProfile.getLocation().getLongitude())
                .withPostalCode(endpointProfile.getLocation().getPostalCode())
                .withCity(endpointProfile.getLocation().getCity())
                .withRegion(endpointProfile.getLocation().getRegion())
                .withCountry(endpointProfile.getLocation().getCountry());

        EndpointUser user = new EndpointUser();
        user.setUserId(endpointProfile.getUser().getUserId());


        final EndpointRequest endpointRequest = new EndpointRequest().
                withChannelType(endpointProfile.getChannelType()).
                withAddress(endpointProfile.getAddress()).
                withLocation(location).
                withDemographic(demographic).
                withEffectiveDate(DateUtils.formatISO8601Date(new Date(endpointProfile.getEffectiveDate()))).
                withOptOut(endpointProfile.getOptOut()).
                withAttributes(endpointProfile.getAllAttributes()).
                withMetrics(endpointProfile.getAllMetrics()).
                withUser(user);
        final UpdateEndpointRequest updateEndpointRequest = new UpdateEndpointRequest().
                withApplicationId(endpointProfile.getApplicationId()).
                withEndpointId(endpointProfile.getEndpointId()).
                withEndpointRequest(endpointRequest);

        updateEndpointRequest.getRequestClientOptions().appendUserAgent(USER_AGENT);

        endpointRunnableQueue.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    log.info(String.format("Updating EndpointProfile : %s", updateEndpointRequest.toString()));
                    context.getPinpointServiceClient().updateEndpoint(updateEndpointRequest);
                    log.info(String.format("EndpointProfile updated successfully: %s", updateEndpointRequest.toString()));
                } catch (AmazonServiceException e) {
                    log.error("AmazonServiceException occurred during endpoint update:", e);
                } catch (AmazonClientException e) {
                    log.info("AmazonClientException occurred during endpoint update:", e);
                }
            }
        });
    }

    private void saveAttributes() {
        JSONObject jsonObject = new JSONObject(globalAttributes);
        String jsonString = jsonObject.toString();
        this.context.getSystem().getPreferences().putString(CUSTOM_ATTRIBUTES_KEY, jsonString);
    }

    private Map<String, java.util.List<String>> loadAttributes() {
        Map<String, java.util.List<String>> outputMap = new ConcurrentHashMap<String, java.util.List<String>>();
        String jsonString = this.context.getSystem().getPreferences().getString(CUSTOM_ATTRIBUTES_KEY, null);
        if (jsonString == null || jsonString.equalsIgnoreCase("")) {
            return outputMap;
        }
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            Iterator<String> keysItr = jsonObject.keys();
            while (keysItr.hasNext()) {
                String key = keysItr.next();
                JSONArray jsonArray = jsonObject.getJSONArray(key);
                List<String> listValues = new ArrayList<String>();
                for (int i =0; i < jsonArray.length(); i++) {
                    listValues.add(jsonArray.getString(i));
                }
                outputMap.put(key, listValues);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return outputMap;
    }

    private void saveMetrics() {
        JSONObject jsonObject = new JSONObject(globalMetrics);
        String jsonString = jsonObject.toString();
        this.context.getSystem().getPreferences().putString(CUSTOM_METRICS_KEY, jsonString);
    }

    private Map<String, Double> loadMetrics() {
        Map<String, Double> outputMap = new ConcurrentHashMap<String, Double>();
        String jsonString = this.context.getSystem().getPreferences().getString(CUSTOM_METRICS_KEY, null);
        if (jsonString == null || jsonString.equalsIgnoreCase("")) {
            return outputMap;
        }
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            Iterator<String> keysItr = jsonObject.keys();
            while (keysItr.hasNext()) {
                String key = keysItr.next();
                Double value = jsonObject.getDouble(key);
                outputMap.put(key, value);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return outputMap;
    }

    /**
     * Adds the specified attribute to the current endpoint profile generated by this client.
     * Note: The maximum allowed attributes/metrics is 20. Attempts to add more may be ignored
     *
     * @param attributeName   the name of the  attribute to add
     * @param attributeValues the value of the  attribute
     */
    public void addAttribute(final String attributeName, final java.util.List<String> attributeValues) {
        if (attributeName == null) {
            log.debug("Null attribute name provided to addGlobalAttribute");
            return;
        }

        if (attributeValues == null) {
            log.debug("Null attribute values provided to addGlobalAttribute. attribute name:"
                    + attributeName);
            return;
        }
        globalAttributes.put(attributeName, attributeValues);
        saveAttributes();
    }

    /**
     * Removes the specified attribute. All subsequently created events will no
     * longer have this global attribute. from the current endpoint profile generated by this client.
     *
     * @param attributeName the name of the attribute to remove
     */
    public void removeAttribute(final String attributeName) {
        if (attributeName == null) {
            log.warn("Null attribute name provided to removeGlobalAttribute");
            return;
        }
        this.endpointProfile.addAttribute(attributeName, null);
        globalAttributes.remove(attributeName);
        saveAttributes();
    }

    /**
     * Adds the specified metric to the current endpoint profile generated by this client. Note: The
     * maximum allowed attributes and metrics on an endpoint update is 20. Attempts
     * to add more may be ignored
     *
     * @param metricName  the name of the metric to add
     * @param metricValue the value of the metric
     */
    public void addMetric(String metricName, Double metricValue) {
        if (metricName == null) {
            log.warn("Null metric name provided to addGlobalMetric");
            return;
        }

        if (metricValue == null) {
            log.warn("Null metric value provided to addGlobalMetric.  metric name:" + metricName);
            return;
        }

        globalMetrics.put(metricName, metricValue);
        saveMetrics();
    }

    /**
     * Removes the specified metric from the current endpoint profile generated by this client.
     *
     * @param metricName the name of the metric to remove
     */
    public void removeMetric(String metricName) {
        if (metricName == null) {
            log.warn("Null metric name provided to removeGlobalMetric");
            return;
        }
        this.endpointProfile.addMetric(metricName, null);
        globalMetrics.remove(metricName);
        saveMetrics();
    }

}
