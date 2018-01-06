/*
 * Copyright 2011-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.http;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.Signer;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetricsFullSupport;

import java.net.URI;
import java.util.List;

/**
 * The execution context.
 */
public class ExecutionContext {
    private final AWSRequestMetrics awsRequestMetrics;
    private final List<RequestHandler2> requestHandler2s;
    private String contextUserAgent;
    private final AmazonWebServiceClient awsClient;

    /**
     * Optional credentials to enable the runtime layer to handle signing
     * requests (and resigning on retries).
     */
    private AWSCredentials credentials;

    /** For testing purposes.
     * @param isMetricEnabled true if metric is enabled.
     */
    @Deprecated
    public ExecutionContext(boolean isMetricEnabled) {
        this(null, isMetricEnabled, null);
    }

    /** For testing purposes. */
    public ExecutionContext() {
        this(null, false, null);
    }

    /**
     * Constructor.
     * @param requestHandler2s the list of request handlers.
     * @param isMetricEnabled true if metric is enabled.
     * @param awsClient the AWS client.
     */
    public ExecutionContext(List<RequestHandler2> requestHandler2s,
            boolean isMetricEnabled, AmazonWebServiceClient awsClient) {
        this.requestHandler2s = requestHandler2s;
        awsRequestMetrics = isMetricEnabled
                ? new AWSRequestMetricsFullSupport()
                : new AWSRequestMetrics();
        this.awsClient = awsClient;
    }

    public String getContextUserAgent() {
        return contextUserAgent;
    }

    public void setContextUserAgent(String contextUserAgent) {
        this.contextUserAgent = contextUserAgent;
    }

    public List<RequestHandler2> getRequestHandler2s() {
        return requestHandler2s;
    }

    @Deprecated
    public AWSRequestMetrics getAwsRequestMetrics() {
        return awsRequestMetrics;
    }

    /**
     * There is in general no need to set the signer in the execution context,
     * since the signer for each request may differ depending on the URI of the
     * request. The exception is S3 where the signer is currently determined
     * only when the S3 client is constructed. Hence the need for this method.
     * We may consider supporting a per request level signer determination for
     * S3 later on.
     * @param signer the signer.
     */
    public void setSigner(Signer signer) {
    }

    /**
     * @param uri the URI.
     * @return the signer for the given uri. Note S3 in particular overrides
     * this method.
     */
    public Signer getSignerByURI(URI uri) {
        return awsClient == null ? null : awsClient.getSignerByURI(uri);
    }

    /**
     * Returns the optional credentials used to sign the associated request.
     *
     * @return The optional credentials used to sign the associated request.
     */
    public AWSCredentials getCredentials() {
        return credentials;
    }

    /**
     * Sets the optional credentials used to sign the associated request. If no
     * credentials are specified as part of a request's ExecutionContext, then
     * the runtime layer will not attempt to sign (or resign on retries)
     * requests.
     *
     * @param credentials The optional credentials used to sign the associated
     *            request.
     */
    public void setCredentials(AWSCredentials credentials) {
        this.credentials = credentials;
    }
}
