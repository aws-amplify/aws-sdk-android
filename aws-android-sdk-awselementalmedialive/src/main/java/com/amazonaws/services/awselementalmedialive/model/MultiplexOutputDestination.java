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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Multiplex output destination settings
 */
public class MultiplexOutputDestination implements Serializable {
    /**
     * Multiplex MediaConnect output destination settings.
     */
    private MultiplexMediaConnectOutputDestinationSettings mediaConnectSettings;

    /**
     * Multiplex MediaConnect output destination settings.
     *
     * @return Multiplex MediaConnect output destination settings.
     */
    public MultiplexMediaConnectOutputDestinationSettings getMediaConnectSettings() {
        return mediaConnectSettings;
    }

    /**
     * Multiplex MediaConnect output destination settings.
     *
     * @param mediaConnectSettings Multiplex MediaConnect output destination
     *            settings.
     */
    public void setMediaConnectSettings(
            MultiplexMediaConnectOutputDestinationSettings mediaConnectSettings) {
        this.mediaConnectSettings = mediaConnectSettings;
    }

    /**
     * Multiplex MediaConnect output destination settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaConnectSettings Multiplex MediaConnect output destination
     *            settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexOutputDestination withMediaConnectSettings(
            MultiplexMediaConnectOutputDestinationSettings mediaConnectSettings) {
        this.mediaConnectSettings = mediaConnectSettings;
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
        if (getMediaConnectSettings() != null)
            sb.append("MediaConnectSettings: " + getMediaConnectSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMediaConnectSettings() == null) ? 0 : getMediaConnectSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiplexOutputDestination == false)
            return false;
        MultiplexOutputDestination other = (MultiplexOutputDestination) obj;

        if (other.getMediaConnectSettings() == null ^ this.getMediaConnectSettings() == null)
            return false;
        if (other.getMediaConnectSettings() != null
                && other.getMediaConnectSettings().equals(this.getMediaConnectSettings()) == false)
            return false;
        return true;
    }
}
