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
 * Create a new streaming distribution with tags.
 * </p>
 */
public class CreateStreamingDistributionWithTags2019_03_26Request extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The streaming distribution's configuration information.
     * </p>
     */
    private StreamingDistributionConfigWithTags streamingDistributionConfigWithTags;

    /**
     * <p>
     * The streaming distribution's configuration information.
     * </p>
     *
     * @return <p>
     *         The streaming distribution's configuration information.
     *         </p>
     */
    public StreamingDistributionConfigWithTags getStreamingDistributionConfigWithTags() {
        return streamingDistributionConfigWithTags;
    }

    /**
     * <p>
     * The streaming distribution's configuration information.
     * </p>
     *
     * @param streamingDistributionConfigWithTags <p>
     *            The streaming distribution's configuration information.
     *            </p>
     */
    public void setStreamingDistributionConfigWithTags(
            StreamingDistributionConfigWithTags streamingDistributionConfigWithTags) {
        this.streamingDistributionConfigWithTags = streamingDistributionConfigWithTags;
    }

    /**
     * <p>
     * The streaming distribution's configuration information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamingDistributionConfigWithTags <p>
     *            The streaming distribution's configuration information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamingDistributionWithTags2019_03_26Request withStreamingDistributionConfigWithTags(
            StreamingDistributionConfigWithTags streamingDistributionConfigWithTags) {
        this.streamingDistributionConfigWithTags = streamingDistributionConfigWithTags;
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
        if (getStreamingDistributionConfigWithTags() != null)
            sb.append("StreamingDistributionConfigWithTags: "
                    + getStreamingDistributionConfigWithTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getStreamingDistributionConfigWithTags() == null) ? 0
                        : getStreamingDistributionConfigWithTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStreamingDistributionWithTags2019_03_26Request == false)
            return false;
        CreateStreamingDistributionWithTags2019_03_26Request other = (CreateStreamingDistributionWithTags2019_03_26Request) obj;

        if (other.getStreamingDistributionConfigWithTags() == null
                ^ this.getStreamingDistributionConfigWithTags() == null)
            return false;
        if (other.getStreamingDistributionConfigWithTags() != null
                && other.getStreamingDistributionConfigWithTags().equals(
                        this.getStreamingDistributionConfigWithTags()) == false)
            return false;
        return true;
    }
}
