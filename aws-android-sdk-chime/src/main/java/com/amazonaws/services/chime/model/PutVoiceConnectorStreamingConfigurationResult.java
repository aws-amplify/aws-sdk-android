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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

public class PutVoiceConnectorStreamingConfigurationResult implements Serializable {
    /**
     * <p>
     * The updated streaming configuration details.
     * </p>
     */
    private StreamingConfiguration streamingConfiguration;

    /**
     * <p>
     * The updated streaming configuration details.
     * </p>
     *
     * @return <p>
     *         The updated streaming configuration details.
     *         </p>
     */
    public StreamingConfiguration getStreamingConfiguration() {
        return streamingConfiguration;
    }

    /**
     * <p>
     * The updated streaming configuration details.
     * </p>
     *
     * @param streamingConfiguration <p>
     *            The updated streaming configuration details.
     *            </p>
     */
    public void setStreamingConfiguration(StreamingConfiguration streamingConfiguration) {
        this.streamingConfiguration = streamingConfiguration;
    }

    /**
     * <p>
     * The updated streaming configuration details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamingConfiguration <p>
     *            The updated streaming configuration details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutVoiceConnectorStreamingConfigurationResult withStreamingConfiguration(
            StreamingConfiguration streamingConfiguration) {
        this.streamingConfiguration = streamingConfiguration;
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
        if (getStreamingConfiguration() != null)
            sb.append("StreamingConfiguration: " + getStreamingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getStreamingConfiguration() == null) ? 0 : getStreamingConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutVoiceConnectorStreamingConfigurationResult == false)
            return false;
        PutVoiceConnectorStreamingConfigurationResult other = (PutVoiceConnectorStreamingConfigurationResult) obj;

        if (other.getStreamingConfiguration() == null ^ this.getStreamingConfiguration() == null)
            return false;
        if (other.getStreamingConfiguration() != null
                && other.getStreamingConfiguration().equals(this.getStreamingConfiguration()) == false)
            return false;
        return true;
    }
}
