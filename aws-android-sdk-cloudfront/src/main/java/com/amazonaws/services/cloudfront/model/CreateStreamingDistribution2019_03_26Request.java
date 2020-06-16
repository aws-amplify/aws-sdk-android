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
 * Creates a new RTMP distribution. An RTMP distribution is similar to a web
 * distribution, but an RTMP distribution streams media files using the Adobe
 * Real-Time Messaging Protocol (RTMP) instead of serving files using HTTP.
 * </p>
 * <p>
 * To create a new distribution, submit a <code>POST</code> request to the
 * <i>CloudFront API version</i>/distribution resource. The request body must
 * include a document with a <i>StreamingDistributionConfig</i> element. The
 * response echoes the <code>StreamingDistributionConfig</code> element and
 * returns other information about the RTMP distribution.
 * </p>
 * <p>
 * To get the status of your request, use the <i>GET StreamingDistribution</i>
 * API action. When the value of <code>Enabled</code> is <code>true</code> and
 * the value of <code>Status</code> is <code>Deployed</code>, your distribution
 * is ready. A distribution usually deploys in less than 15 minutes.
 * </p>
 * <p>
 * For more information about web distributions, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-rtmp.html"
 * >Working with RTMP Distributions</a> in the <i>Amazon CloudFront Developer
 * Guide</i>.
 * </p>
 * <important>
 * <p>
 * Beginning with the 2012-05-05 version of the CloudFront API, we made
 * substantial changes to the format of the XML document that you include in the
 * request body when you create or update a web distribution or an RTMP
 * distribution, and when you invalidate objects. With previous versions of the
 * API, we discovered that it was too easy to accidentally delete one or more
 * values for an element that accepts multiple values, for example, CNAMEs and
 * trusted signers. Our changes for the 2012-05-05 release are intended to
 * prevent these accidental deletions and to notify you when there's a mismatch
 * between the number of values you say you're specifying in the
 * <code>Quantity</code> element and the number of values specified.
 * </p>
 * </important>
 */
public class CreateStreamingDistribution2019_03_26Request extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The streaming distribution's configuration information.
     * </p>
     */
    private StreamingDistributionConfig streamingDistributionConfig;

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
    public CreateStreamingDistribution2019_03_26Request withStreamingDistributionConfig(
            StreamingDistributionConfig streamingDistributionConfig) {
        this.streamingDistributionConfig = streamingDistributionConfig;
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
            sb.append("StreamingDistributionConfig: " + getStreamingDistributionConfig());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStreamingDistribution2019_03_26Request == false)
            return false;
        CreateStreamingDistribution2019_03_26Request other = (CreateStreamingDistribution2019_03_26Request) obj;

        if (other.getStreamingDistributionConfig() == null
                ^ this.getStreamingDistributionConfig() == null)
            return false;
        if (other.getStreamingDistributionConfig() != null
                && other.getStreamingDistributionConfig().equals(
                        this.getStreamingDistributionConfig()) == false)
            return false;
        return true;
    }
}
