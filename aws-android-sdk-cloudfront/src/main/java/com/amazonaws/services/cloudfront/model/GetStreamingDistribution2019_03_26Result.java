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

/**
 * <p>
 * The returned result of the corresponding request.
 * </p>
 */
public class GetStreamingDistribution2019_03_26Result implements Serializable {
    /**
     * <p>
     * The streaming distribution's information.
     * </p>
     */
    private StreamingDistribution streamingDistribution;

    /**
     * <p>
     * The current version of the streaming distribution's information. For
     * example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * The streaming distribution's information.
     * </p>
     *
     * @return <p>
     *         The streaming distribution's information.
     *         </p>
     */
    public StreamingDistribution getStreamingDistribution() {
        return streamingDistribution;
    }

    /**
     * <p>
     * The streaming distribution's information.
     * </p>
     *
     * @param streamingDistribution <p>
     *            The streaming distribution's information.
     *            </p>
     */
    public void setStreamingDistribution(StreamingDistribution streamingDistribution) {
        this.streamingDistribution = streamingDistribution;
    }

    /**
     * <p>
     * The streaming distribution's information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamingDistribution <p>
     *            The streaming distribution's information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetStreamingDistribution2019_03_26Result withStreamingDistribution(
            StreamingDistribution streamingDistribution) {
        this.streamingDistribution = streamingDistribution;
        return this;
    }

    /**
     * <p>
     * The current version of the streaming distribution's information. For
     * example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     *
     * @return <p>
     *         The current version of the streaming distribution's information.
     *         For example: <code>E2QWRUHAPOMQZL</code>.
     *         </p>
     */
    public String getETag() {
        return eTag;
    }

    /**
     * <p>
     * The current version of the streaming distribution's information. For
     * example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     *
     * @param eTag <p>
     *            The current version of the streaming distribution's
     *            information. For example: <code>E2QWRUHAPOMQZL</code>.
     *            </p>
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The current version of the streaming distribution's information. For
     * example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eTag <p>
     *            The current version of the streaming distribution's
     *            information. For example: <code>E2QWRUHAPOMQZL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetStreamingDistribution2019_03_26Result withETag(String eTag) {
        this.eTag = eTag;
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
        if (getStreamingDistribution() != null)
            sb.append("StreamingDistribution: " + getStreamingDistribution() + ",");
        if (getETag() != null)
            sb.append("ETag: " + getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getStreamingDistribution() == null) ? 0 : getStreamingDistribution().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStreamingDistribution2019_03_26Result == false)
            return false;
        GetStreamingDistribution2019_03_26Result other = (GetStreamingDistribution2019_03_26Result) obj;

        if (other.getStreamingDistribution() == null ^ this.getStreamingDistribution() == null)
            return false;
        if (other.getStreamingDistribution() != null
                && other.getStreamingDistribution().equals(this.getStreamingDistribution()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }
}
