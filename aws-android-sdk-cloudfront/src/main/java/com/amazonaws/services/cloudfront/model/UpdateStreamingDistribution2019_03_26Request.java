/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Update a streaming distribution.
 * </p>
 */
public class UpdateStreamingDistribution2019_03_26Request extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The streaming distribution's configuration information.
     * </p>
     */
    private StreamingDistributionConfig streamingDistributionConfig;

    /**
     * <p>
     * The streaming distribution's id.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when
     * retrieving the streaming distribution's configuration. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     */
    private String ifMatch;

    /**
     * <p>
     * The streaming distribution's configuration information.
     * </p>
     *
     * @return <p>
     *         The streaming distribution's configuration information.
     *         </p>
     */
    public StreamingDistributionConfig getStreamingDistributionConfig() {
        return streamingDistributionConfig;
    }

    /**
     * <p>
     * The streaming distribution's configuration information.
     * </p>
     *
     * @param streamingDistributionConfig <p>
     *            The streaming distribution's configuration information.
     *            </p>
     */
    public void setStreamingDistributionConfig(
            StreamingDistributionConfig streamingDistributionConfig) {
        this.streamingDistributionConfig = streamingDistributionConfig;
    }

    /**
     * <p>
     * The streaming distribution's configuration information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamingDistributionConfig <p>
     *            The streaming distribution's configuration information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStreamingDistribution2019_03_26Request withStreamingDistributionConfig(
            StreamingDistributionConfig streamingDistributionConfig) {
        this.streamingDistributionConfig = streamingDistributionConfig;
        return this;
    }

    /**
     * <p>
     * The streaming distribution's id.
     * </p>
     *
     * @return <p>
     *         The streaming distribution's id.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The streaming distribution's id.
     * </p>
     *
     * @param id <p>
     *            The streaming distribution's id.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The streaming distribution's id.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The streaming distribution's id.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStreamingDistribution2019_03_26Request withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when
     * retrieving the streaming distribution's configuration. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     *
     * @return <p>
     *         The value of the <code>ETag</code> header that you received when
     *         retrieving the streaming distribution's configuration. For
     *         example: <code>E2QWRUHAPOMQZL</code>.
     *         </p>
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when
     * retrieving the streaming distribution's configuration. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     *
     * @param ifMatch <p>
     *            The value of the <code>ETag</code> header that you received
     *            when retrieving the streaming distribution's configuration.
     *            For example: <code>E2QWRUHAPOMQZL</code>.
     *            </p>
     */
    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when
     * retrieving the streaming distribution's configuration. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ifMatch <p>
     *            The value of the <code>ETag</code> header that you received
     *            when retrieving the streaming distribution's configuration.
     *            For example: <code>E2QWRUHAPOMQZL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStreamingDistribution2019_03_26Request withIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStreamingDistributionConfig() != null)
            sb.append("StreamingDistributionConfig: " + getStreamingDistributionConfig() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getIfMatch() != null)
            sb.append("IfMatch: " + getIfMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getStreamingDistributionConfig() == null) ? 0
                        : getStreamingDistributionConfig().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStreamingDistribution2019_03_26Request == false)
            return false;
        UpdateStreamingDistribution2019_03_26Request other = (UpdateStreamingDistribution2019_03_26Request) obj;

        if (other.getStreamingDistributionConfig() == null
                ^ this.getStreamingDistributionConfig() == null)
            return false;
        if (other.getStreamingDistributionConfig() != null
                && other.getStreamingDistributionConfig().equals(
                        this.getStreamingDistributionConfig()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIfMatch() == null ^ this.getIfMatch() == null)
            return false;
        if (other.getIfMatch() != null && other.getIfMatch().equals(this.getIfMatch()) == false)
            return false;
        return true;
    }
}
