/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.AWSRequestMetrics;

import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Default implementation of the {@linkplain com.amazonaws.Request} interface.
 * <p>
 * This class is only intended for internal use inside the AWS client libraries.
 * Callers shouldn't ever interact directly with objects of this class.
 * @param <T> class type.
 */
public class DefaultRequest<T> implements Request<T> {

    /** The resource path being requested */
    private String resourcePath;

    private boolean streaming = false;
    /**
     * Map of the parameters being sent as part of this request.
     * <p>
     * Note that a LinkedHashMap is used, since we want to preserve the
     * insertion order so that members of a list parameter will still be ordered
     * by their indices when they are marshalled into the query string.
     */
    private final Map<String, String> parameters = new LinkedHashMap<String, String>();

    /** Map of the headers included in this request */
    private final Map<String, String> headers = new HashMap<String, String>();

    /** The service endpoint to which this request should be sent */
    private URI endpoint;

    /** The name of the service to which this request is being sent */
    private String serviceName;

    /**
     * The original, user facing request object which this internal request
     * object is representing
     */
    private final AmazonWebServiceRequest originalRequest;

    /** The HTTP method to use when sending this request. */
    private HttpMethodName httpMethod = HttpMethodName.POST;

    /** An optional stream from which to read the request payload. */
    private InputStream content;

    /** An optional time offset to account for clock skew */
    private long timeOffset;

    /** All AWS Request metrics are collected into this object. */
    private AWSRequestMetrics metrics;

    /** An optional prefix to prepend to the request endpoint host */
    private String hostPrefix;

    /** encoded uri resource path */
    private String encodedUriResourcePath;

    /**
     * Constructs a new DefaultRequest with the specified service name and the
     * original, user facing request object.
     *
     * @param serviceName The name of the service to which this request is being
     *            sent.
     * @param originalRequest The original, user facing, AWS request being
     *            represented by this internal request object.
     */
    public DefaultRequest(AmazonWebServiceRequest originalRequest, String serviceName) {
        this.serviceName = serviceName;
        this.originalRequest = originalRequest;
    }

    /**
     * Constructs a new DefaultRequest with the specified service name and no
     * specified original, user facing request object.
     *
     * @param serviceName The name of the service to which this request is being
     *            sent.
     */
    public DefaultRequest(String serviceName) {
        this(null, serviceName);
    }

    /**
     * Returns the original, user facing request object which this internal
     * request object is representing.
     *
     * @return The original, user facing request object which this request
     *         object is representing.
     */
    @Override
    public AmazonWebServiceRequest getOriginalRequest() {
        return originalRequest;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addHeader(String name, String value) {
        headers.put(name, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getResourcePath() {
        return resourcePath;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addParameter(String name, String value) {
        parameters.put(name, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Request<T> withParameter(String name, String value) {
        addParameter(name, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpMethodName getHttpMethod() {
        return httpMethod;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setHttpMethod(HttpMethodName httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setEndpoint(URI endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public URI getEndpoint() {
        return endpoint;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getServiceName() {
        return serviceName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InputStream getContent() {
        return content;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setContent(InputStream content) {
        this.content = content;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setHeaders(Map<String, String> headers) {
        this.headers.clear();
        this.headers.putAll(headers);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameters(Map<String, String> parameters) {
        this.parameters.clear();
        this.parameters.putAll(parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getHostPrefix() {
        return this.hostPrefix;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setHostPrefix(String hostPrefix) {
        this.hostPrefix = hostPrefix;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getTimeOffset() {
        return timeOffset;
    }

    /**
     * {@inheritDoc}
     */
    @Deprecated
    @Override
    public void setTimeOffset(int timeOffset) {
        this.setTimeOffset((long) timeOffset);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setTimeOffset(long timeOffset) {
        this.timeOffset = timeOffset;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Deprecated
    @SuppressWarnings("checkstyle:hiddenfield")
    public Request<T> withTimeOffset(int timeOffset) {
        return withTimeOffset((long) timeOffset);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings("checkstyle:hiddenfield")
    public Request<T> withTimeOffset(long timeOffset) {
        setTimeOffset(timeOffset);
        return this;
    }

    @Override
    @SuppressWarnings("checkstyle:hiddenfield")
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getHttpMethod()).append(" ");
        builder.append(getEndpoint()).append(" ");
        final String resourcePath = getResourcePath();

        if (resourcePath == null) {
            builder.append("/");
        }
        else {
            if (!resourcePath.startsWith("/")) {
                builder.append("/");
            }
            builder.append(resourcePath);
        }
        builder.append(" ");
        if (!getParameters().isEmpty()) {
            builder.append("Parameters: (");
            for (final String key : getParameters().keySet()) {
                final String value = getParameters().get(key);
                builder.append(key).append(": ").append(value).append(", ");
            }
            builder.append(") ");
        }

        if (!getHeaders().isEmpty()) {
            builder.append("Headers: (");
            for (final String key : getHeaders().keySet()) {
                final String value = getHeaders().get(key);
                builder.append(key).append(": ").append(value).append(", ");
            }
            builder.append(") ");
        }

        return builder.toString();
    }

    @Override
    @Deprecated
    public AWSRequestMetrics getAWSRequestMetrics() {
        return metrics;
    }

    @Override
    @Deprecated
    @SuppressWarnings("checkstyle:hiddenfield")
    public void setAWSRequestMetrics(AWSRequestMetrics metrics) {
        if (this.metrics == null) {
            this.metrics = metrics;
        } else {
            throw new IllegalStateException(
                    "AWSRequestMetrics has already been set on this request");
        }
    }

    @Override
    public boolean isStreaming() {
        return this.streaming;
    }

    @Override
    public void setStreaming(boolean streaming) {
        this.streaming = streaming;
    }

    @Override
    public String getEncodedUriResourcePath() {
        return encodedUriResourcePath;
    }

    @Override
    public void setEncodedResourcePath(String encodedUriResourcePath) {
        this.encodedUriResourcePath = encodedUriResourcePath;
    }
}
