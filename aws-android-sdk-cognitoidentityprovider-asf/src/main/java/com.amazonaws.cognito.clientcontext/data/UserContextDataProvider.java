/*
 * Copyright 2017-2022 Amazon.com,
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

package com.amazonaws.cognito.clientcontext.data;

import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.amazonaws.cognito.clientcontext.datacollection.ContextDataAggregator;
import com.amazonaws.cognito.clientcontext.util.SignatureGenerator;

import android.content.Context;
import android.util.Base64;
import android.util.Log;

/**
 * It provides the user context data that is sent to the server.
 */
public class UserContextDataProvider {

    private static final String TAG = UserContextDataProvider.class.getSimpleName();
    public static final String VERSION = "ANDROID20171114";

    private ContextDataAggregator aggregator;
    private SignatureGenerator signatureGenerator;

    /**
     * Private class to store an instance. This is used to ensure a singleton
     * instance of the class.
     */
    private static class InstanceHolder {
        private static final UserContextDataProvider INSTANCE = new UserContextDataProvider();
    }

    private UserContextDataProvider() {
        this(ContextDataAggregator.getInstance(), new SignatureGenerator());
    }

    /**
     * Protected constructor to instantiate a class object for unit testing.
     */
    protected UserContextDataProvider(ContextDataAggregator aggregator, SignatureGenerator signatureGenerator) {
        this.aggregator = aggregator;
        this.signatureGenerator = signatureGenerator;
    }

    /**
     * @return instance of the class
     */
    public static UserContextDataProvider getInstance() {
        return InstanceHolder.INSTANCE;
    }

    /**
     * It gets aggregated user context data, adds signature to it and provides
     * it in Base64 encoded form. Final data is JSON object with 'signature' and
     * 'payload'. Payload is a JSON object that contains 'username',
     * 'userPoolId', 'timestamp' and 'contextData'.
     *
     * @param context
     *            android application context
     * @param username
     *            username for the user
     * @param userPoolId
     *            cognito userpoolId for the application
     * @param signatureSecret
     *            secret key used while generating signature. For now, this
     *            would be application clientId.
     * @return base64 encoded userContextData.
     */
    public String getEncodedContextData(Context context, String username, String userPoolId, String signatureSecret) {
        JSONObject jsonResponse = new JSONObject();

        try {
            final Map<String, String> contextData = aggregator.getAggregatedData(context);
            JSONObject payload = getJsonPayload(contextData, username, userPoolId);
            String payloadString = payload.toString();

            String signature = signatureGenerator.getSignature(payloadString, signatureSecret, VERSION);
            jsonResponse = getJsonResponse(payloadString, signature);
            return getEncodedResponse(jsonResponse);
        } catch (Exception e) {
            Log.e(TAG, "Exception in creating JSON from context data");
            return null;
        }
    }

    private JSONObject getJsonPayload(Map<String, String> contextData, String username, String userPoolId)
            throws JSONException {
        JSONObject payload = new JSONObject();
        payload.put(ContextDataJsonKeys.CONTEXT_DATA, new JSONObject(contextData));
        payload.put(ContextDataJsonKeys.USERNAME, username);
        payload.put(ContextDataJsonKeys.USER_POOL_ID, userPoolId);
        payload.put(ContextDataJsonKeys.TIMESTAMP_MILLI_SEC, getTimestamp());
        return payload;
    }

    /**
     * Protected to allow overriding in unit test.
     */
    protected String getTimestamp() {
        return String.valueOf(System.currentTimeMillis());
    }

    private JSONObject getJsonResponse(String payload, String signature) throws JSONException {
        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put(ContextDataJsonKeys.DATA_PAYLOAD, payload);
        jsonResponse.put(ContextDataJsonKeys.SIGNATURE, signature);
        jsonResponse.put(ContextDataJsonKeys.VERSION, UserContextDataProvider.VERSION);
        return jsonResponse;
    }

    /**
     * Protected to allow overriding in unit test. Base64 is part of AndroidSdk
     * which cannot be directly invoked in unit test.
     */
    protected String getEncodedResponse(JSONObject jsonResponse) {
        byte[] responseBytes = jsonResponse.toString().getBytes(ConfigurationConstant.DEFAULT_CHARSET);
        return Base64.encodeToString(responseBytes, Base64.DEFAULT);
    }

    /**
     * Class defines constant keys that are used in JSON response object.
     */
    private class ContextDataJsonKeys {
        private static final String CONTEXT_DATA = "contextData";
        private static final String USERNAME = "username";
        private static final String USER_POOL_ID = "userPoolId";
        private static final String TIMESTAMP_MILLI_SEC = "timestamp";
        private static final String DATA_PAYLOAD = "payload";
        private static final String VERSION = "version";
        private static final String SIGNATURE = "signature";
    }
}