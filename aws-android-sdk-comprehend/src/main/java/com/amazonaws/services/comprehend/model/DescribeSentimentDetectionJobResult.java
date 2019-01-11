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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

public class DescribeSentimentDetectionJobResult implements Serializable {
    /**
     * <p>
     * An object that contains the properties associated with a sentiment
     * detection job.
     * </p>
     */
    private SentimentDetectionJobProperties sentimentDetectionJobProperties;

    /**
     * <p>
     * An object that contains the properties associated with a sentiment
     * detection job.
     * </p>
     *
     * @return <p>
     *         An object that contains the properties associated with a
     *         sentiment detection job.
     *         </p>
     */
    public SentimentDetectionJobProperties getSentimentDetectionJobProperties() {
        return sentimentDetectionJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with a sentiment
     * detection job.
     * </p>
     *
     * @param sentimentDetectionJobProperties <p>
     *            An object that contains the properties associated with a
     *            sentiment detection job.
     *            </p>
     */
    public void setSentimentDetectionJobProperties(
            SentimentDetectionJobProperties sentimentDetectionJobProperties) {
        this.sentimentDetectionJobProperties = sentimentDetectionJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with a sentiment
     * detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sentimentDetectionJobProperties <p>
     *            An object that contains the properties associated with a
     *            sentiment detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSentimentDetectionJobResult withSentimentDetectionJobProperties(
            SentimentDetectionJobProperties sentimentDetectionJobProperties) {
        this.sentimentDetectionJobProperties = sentimentDetectionJobProperties;
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
        if (getSentimentDetectionJobProperties() != null)
            sb.append("SentimentDetectionJobProperties: " + getSentimentDetectionJobProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSentimentDetectionJobProperties() == null) ? 0
                        : getSentimentDetectionJobProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSentimentDetectionJobResult == false)
            return false;
        DescribeSentimentDetectionJobResult other = (DescribeSentimentDetectionJobResult) obj;

        if (other.getSentimentDetectionJobProperties() == null
                ^ this.getSentimentDetectionJobProperties() == null)
            return false;
        if (other.getSentimentDetectionJobProperties() != null
                && other.getSentimentDetectionJobProperties().equals(
                        this.getSentimentDetectionJobProperties()) == false)
            return false;
        return true;
    }
}
