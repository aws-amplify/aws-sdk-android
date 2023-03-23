/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

public class PutMessagingStreamingConfigurationsResult implements Serializable {
    /**
     * <p>
     * The requested streaming configurations.
     * </p>
     */
    private java.util.List<StreamingConfiguration> streamingConfigurations;

    /**
     * <p>
     * The requested streaming configurations.
     * </p>
     *
     * @return <p>
     *         The requested streaming configurations.
     *         </p>
     */
    public java.util.List<StreamingConfiguration> getStreamingConfigurations() {
        return streamingConfigurations;
    }

    /**
     * <p>
     * The requested streaming configurations.
     * </p>
     *
     * @param streamingConfigurations <p>
     *            The requested streaming configurations.
     *            </p>
     */
    public void setStreamingConfigurations(
            java.util.Collection<StreamingConfiguration> streamingConfigurations) {
        if (streamingConfigurations == null) {
            this.streamingConfigurations = null;
            return;
        }

        this.streamingConfigurations = new java.util.ArrayList<StreamingConfiguration>(
                streamingConfigurations);
    }

    /**
     * <p>
     * The requested streaming configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamingConfigurations <p>
     *            The requested streaming configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMessagingStreamingConfigurationsResult withStreamingConfigurations(
            StreamingConfiguration... streamingConfigurations) {
        if (getStreamingConfigurations() == null) {
            this.streamingConfigurations = new java.util.ArrayList<StreamingConfiguration>(
                    streamingConfigurations.length);
        }
        for (StreamingConfiguration value : streamingConfigurations) {
            this.streamingConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The requested streaming configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamingConfigurations <p>
     *            The requested streaming configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMessagingStreamingConfigurationsResult withStreamingConfigurations(
            java.util.Collection<StreamingConfiguration> streamingConfigurations) {
        setStreamingConfigurations(streamingConfigurations);
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
        if (getStreamingConfigurations() != null)
            sb.append("StreamingConfigurations: " + getStreamingConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getStreamingConfigurations() == null) ? 0 : getStreamingConfigurations()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMessagingStreamingConfigurationsResult == false)
            return false;
        PutMessagingStreamingConfigurationsResult other = (PutMessagingStreamingConfigurationsResult) obj;

        if (other.getStreamingConfigurations() == null ^ this.getStreamingConfigurations() == null)
            return false;
        if (other.getStreamingConfigurations() != null
                && other.getStreamingConfigurations().equals(this.getStreamingConfigurations()) == false)
            return false;
        return true;
    }
}
