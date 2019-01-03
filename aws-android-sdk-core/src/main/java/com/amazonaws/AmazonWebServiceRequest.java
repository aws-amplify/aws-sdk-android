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

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.metrics.RequestMetricCollector;

/**
 * Base class for all user facing web service requests.
 */
public abstract class AmazonWebServiceRequest implements Cloneable {

    /**
     * The optional progress listener for receiving updates about object
     * download status.
     */
    private ProgressListener generalProgressListener;

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

    /**
     * The optional credentials to use for this request - overrides the default
     * credentials set at the client level.
     */
    private AWSCredentials credentials;

    /**
     * Sets the optional credentials to use for this request, overriding the
     * default credentials set at the client level.
     *
     * @param credentials The optional AWS security credentials to use for this
     *            request, overriding the default credentials set at the client
     *            level.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
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
     * @return the options stored with this request object. Intended for internal
     * use only.
     */
    public RequestClientOptions getRequestClientOptions() {
        return requestClientOptions;
    }

    /**
     * @return a request level metric collector; or null if not specified.
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
     * @param requestMetricCollector the request metric collector.
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
     * @param metricCollector the request metric collector.
     * @param <T> class type.
     * @return this for method chaining.
     * @deprecated metrics is deprecated
     */
    @Deprecated
    public <T extends AmazonWebServiceRequest> T withRequestMetricCollector(
            RequestMetricCollector metricCollector) {
        setRequestMetricCollector(metricCollector);
        @SuppressWarnings("unchecked")
        final T t = (T) this;
        return t;
    }

    /**
     * Sets the optional progress listener for receiving updates about object
     * upload status.
     *
     * @param generalProgressListener The new progress listener.
     */
    public void setGeneralProgressListener(ProgressListener generalProgressListener) {
        this.generalProgressListener = generalProgressListener;
    }

    /**
     * Returns the optional progress listener for receiving updates about object
     * upload status.
     *
     * @return the optional progress listener for receiving updates about object
     *         upload status.
     */
    public ProgressListener getGeneralProgressListener() {
        return generalProgressListener;
    }

    /**
     * Sets the optional progress listener for receiving updates about the progress of the request,
     * and returns a reference to this object so that method calls can be chained together.
     *
     * @param generalProgressListener The new progress listener.
     * @param <T> class type.
     * @return This updated PutObjectRequest object.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public <T extends AmazonWebServiceRequest> T withGeneralProgressListener(
            ProgressListener generalProgressListener) {
        setGeneralProgressListener(generalProgressListener);
        @SuppressWarnings("unchecked")
        final T t = (T) this;
        return t;
    }

    /**
     * Copies the internal state of this base class to that of the target
     * request.
     *
     * @return the target request
     */
    protected final <T extends AmazonWebServiceRequest> T copyBaseTo(T target) {
        target.setGeneralProgressListener(this.generalProgressListener);
        target.setRequestMetricCollector(requestMetricCollector);
        return target;
    }

    /**
     * The source object from which the current object was cloned; or null if
     * there isn't one.
     */
    private AmazonWebServiceRequest cloneSource;

    /**
     * @return the source object from which the current object was cloned; or
     * null if there isn't one.
     */
    public AmazonWebServiceRequest getCloneSource() {
        return cloneSource;
    }

    /**
     * @return the root object from which the current object was cloned; or null
     * if there isn't one.
     */
    public AmazonWebServiceRequest getCloneRoot() {
        AmazonWebServiceRequest cloneRoot = cloneSource;
        if (cloneRoot != null) {
            while (cloneRoot.getCloneSource() != null) {
                cloneRoot = cloneRoot.getCloneSource();
            }
        }
        return cloneRoot;
    }

    private void setCloneSource(AmazonWebServiceRequest cloneSource) {
        this.cloneSource = cloneSource;
    }

    /**
     * Creates a shallow clone of this request. Explicitly does <em>not</em>
     * clone the deep structure of the request object.
     *
     * @see Object#clone()
     */
    @Override
    public AmazonWebServiceRequest clone() {
        try {
            final AmazonWebServiceRequest cloned = (AmazonWebServiceRequest) super.clone();
            cloned.setCloneSource(this);
            return cloned;
        } catch (final CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!",
                    e);
        }
    }
}
