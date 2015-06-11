/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.metrics.RequestMetricCollector;

import java.util.HashMap;
import java.util.Map;

/**
 * Base class for all user facing web service requests.
 */
public abstract class AmazonWebServiceRequest {

    /**
     * Arbitrary options storage for individual {@link AmazonWebServiceRequest}
     * s. This field is not intended to be used by clients.
     */
    private final RequestClientOptions requestClientOptions = new RequestClientOptions();

    /**
     * A request metric collector used for this specific service request; or
     * null if there is none. This collector always takes precedence over the
     * ones specified at the http client level and AWS SDK level.
     */
    @Deprecated
    private RequestMetricCollector requestMetricCollector;

    /** The optional STS security token associated with this request */
    private String delegationToken;

    /**
     * The optional credentials to use for this request - overrides the default
     * credentials set at the client level.
     */
    private AWSCredentials credentials;

    /**
     * Returns the optional STS security token associated with the request. This
     * method is not available in the external release of the SDK.
     *
     * @return the optional STS security token associated with the request.
     * @deprecated Pass a {@link com.amazonaws.auth.AWSSessionCredentials} to
     *             your client constructor instead. Note the delegationToken
     *             methods do not work for services other than s3.
     */
    @Deprecated
    public String getDelegationToken() {
        return delegationToken;
    }

    /**
     * Sets the optional STS security token associated with the request. This
     * method is not available in the external release of the SDK.
     *
     * @param delegationToken The optional STS security token associated with
     *            the request.
     * @deprecated Pass a {@link com.amazonaws.auth.AWSSessionCredentials} to
     *             your client constructor instead. Note the delegationToken
     *             methods do not work for services other than s3.
     */
    @Deprecated
    public void setDelegationToken(String delegationToken) {
        this.delegationToken = delegationToken;
    }

    /**
     * Sets the optional credentials to use for this request, overriding the
     * default credentials set at the client level.
     *
     * @param credentials The optional AWS security credentials to use for this
     *            request, overriding the default credentials set at the client
     *            level.
     */
    public void setRequestCredentials(AWSCredentials credentials) {
        this.credentials = credentials;
    }

    /**
     * Returns the optional credentials to use to sign this request, overriding
     * the default credentials set at the client level.
     *
     * @return The optional credentials to use to sign this request, overriding
     *         the default credentials set at the client level.
     */
    public AWSCredentials getRequestCredentials() {
        return credentials;
    }

    /**
     * Internal only method for accessing private, internal request parameters.
     * Not intended for direct use by callers.
     *
     * @return private, internal request parameter information.
     * @deprecated only passes back the deprecated delegationToken
     */
    @Deprecated
    public Map<String, String> copyPrivateRequestParameters() {
        HashMap<String, String> map = new HashMap<String, String>();
        if (delegationToken != null)
            map.put("SecurityToken", delegationToken);

        return map;
    }

    /**
     * Gets the options stored with this request object. Intended for internal
     * use only.
     */
    public RequestClientOptions getRequestClientOptions() {
        return requestClientOptions;
    }

    /**
     * Returns a request level metric collector; or null if not specified.
     * 
     * @deprecated metrics is deprecated
     */
    @Deprecated
    public RequestMetricCollector getRequestMetricCollector() {
        return requestMetricCollector;
    }

    /**
     * Sets a request level request metric collector which takes precedence over
     * the ones at the http client level and AWS SDK level.
     * 
     * @deprecated metrics is deprecated
     */
    @Deprecated
    public void setRequestMetricCollector(RequestMetricCollector requestMetricCollector) {
        this.requestMetricCollector = requestMetricCollector;
    }

    /**
     * Specifies a request level metric collector which takes precedence over
     * the ones at the http client level and AWS SDK level.
     * 
     * @deprecated metrics is deprecated
     */
    @Deprecated
    public <T extends AmazonWebServiceRequest> T withRequestMetricCollector(
            RequestMetricCollector metricCollector) {
        setRequestMetricCollector(metricCollector);
        @SuppressWarnings("unchecked")
        T t = (T) this;
        return t;
    }
}
