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
 * Placeholder documentation for OutputDestination
 */
public class OutputDestination implements Serializable {
    /**
     * User-specified id. This is used in an output group or an output.
     */
    private String id;

    /**
     * Destination settings for a MediaPackage output; one destination for both
     * encoders.
     */
    private java.util.List<MediaPackageOutputDestinationSettings> mediaPackageSettings;

    /**
     * Destination settings for a Multiplex output; one destination for both
     * encoders.
     */
    private MultiplexProgramChannelDestinationSettings multiplexSettings;

    /**
     * Destination settings for a standard output; one destination for each
     * redundant encoder.
     */
    private java.util.List<OutputDestinationSettings> settings;

    /**
     * User-specified id. This is used in an output group or an output.
     *
     * @return User-specified id. This is used in an output group or an output.
     */
    public String getId() {
        return id;
    }

    /**
     * User-specified id. This is used in an output group or an output.
     *
     * @param id User-specified id. This is used in an output group or an
     *            output.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * User-specified id. This is used in an output group or an output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id User-specified id. This is used in an output group or an
     *            output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputDestination withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Destination settings for a MediaPackage output; one destination for both
     * encoders.
     *
     * @return Destination settings for a MediaPackage output; one destination
     *         for both encoders.
     */
    public java.util.List<MediaPackageOutputDestinationSettings> getMediaPackageSettings() {
        return mediaPackageSettings;
    }

    /**
     * Destination settings for a MediaPackage output; one destination for both
     * encoders.
     *
     * @param mediaPackageSettings Destination settings for a MediaPackage
     *            output; one destination for both encoders.
     */
    public void setMediaPackageSettings(
            java.util.Collection<MediaPackageOutputDestinationSettings> mediaPackageSettings) {
        if (mediaPackageSettings == null) {
            this.mediaPackageSettings = null;
            return;
        }

        this.mediaPackageSettings = new java.util.ArrayList<MediaPackageOutputDestinationSettings>(
                mediaPackageSettings);
    }

    /**
     * Destination settings for a MediaPackage output; one destination for both
     * encoders.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaPackageSettings Destination settings for a MediaPackage
     *            output; one destination for both encoders.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputDestination withMediaPackageSettings(
            MediaPackageOutputDestinationSettings... mediaPackageSettings) {
        if (getMediaPackageSettings() == null) {
            this.mediaPackageSettings = new java.util.ArrayList<MediaPackageOutputDestinationSettings>(
                    mediaPackageSettings.length);
        }
        for (MediaPackageOutputDestinationSettings value : mediaPackageSettings) {
            this.mediaPackageSettings.add(value);
        }
        return this;
    }

    /**
     * Destination settings for a MediaPackage output; one destination for both
     * encoders.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaPackageSettings Destination settings for a MediaPackage
     *            output; one destination for both encoders.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputDestination withMediaPackageSettings(
            java.util.Collection<MediaPackageOutputDestinationSettings> mediaPackageSettings) {
        setMediaPackageSettings(mediaPackageSettings);
        return this;
    }

    /**
     * Destination settings for a Multiplex output; one destination for both
     * encoders.
     *
     * @return Destination settings for a Multiplex output; one destination for
     *         both encoders.
     */
    public MultiplexProgramChannelDestinationSettings getMultiplexSettings() {
        return multiplexSettings;
    }

    /**
     * Destination settings for a Multiplex output; one destination for both
     * encoders.
     *
     * @param multiplexSettings Destination settings for a Multiplex output; one
     *            destination for both encoders.
     */
    public void setMultiplexSettings(MultiplexProgramChannelDestinationSettings multiplexSettings) {
        this.multiplexSettings = multiplexSettings;
    }

    /**
     * Destination settings for a Multiplex output; one destination for both
     * encoders.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiplexSettings Destination settings for a Multiplex output; one
     *            destination for both encoders.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputDestination withMultiplexSettings(
            MultiplexProgramChannelDestinationSettings multiplexSettings) {
        this.multiplexSettings = multiplexSettings;
        return this;
    }

    /**
     * Destination settings for a standard output; one destination for each
     * redundant encoder.
     *
     * @return Destination settings for a standard output; one destination for
     *         each redundant encoder.
     */
    public java.util.List<OutputDestinationSettings> getSettings() {
        return settings;
    }

    /**
     * Destination settings for a standard output; one destination for each
     * redundant encoder.
     *
     * @param settings Destination settings for a standard output; one
     *            destination for each redundant encoder.
     */
    public void setSettings(java.util.Collection<OutputDestinationSettings> settings) {
        if (settings == null) {
            this.settings = null;
            return;
        }

        this.settings = new java.util.ArrayList<OutputDestinationSettings>(settings);
    }

    /**
     * Destination settings for a standard output; one destination for each
     * redundant encoder.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings Destination settings for a standard output; one
     *            destination for each redundant encoder.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputDestination withSettings(OutputDestinationSettings... settings) {
        if (getSettings() == null) {
            this.settings = new java.util.ArrayList<OutputDestinationSettings>(settings.length);
        }
        for (OutputDestinationSettings value : settings) {
            this.settings.add(value);
        }
        return this;
    }

    /**
     * Destination settings for a standard output; one destination for each
     * redundant encoder.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings Destination settings for a standard output; one
     *            destination for each redundant encoder.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputDestination withSettings(java.util.Collection<OutputDestinationSettings> settings) {
        setSettings(settings);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getMediaPackageSettings() != null)
            sb.append("MediaPackageSettings: " + getMediaPackageSettings() + ",");
        if (getMultiplexSettings() != null)
            sb.append("MultiplexSettings: " + getMultiplexSettings() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getMediaPackageSettings() == null) ? 0 : getMediaPackageSettings().hashCode());
        hashCode = prime * hashCode
                + ((getMultiplexSettings() == null) ? 0 : getMultiplexSettings().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputDestination == false)
            return false;
        OutputDestination other = (OutputDestination) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMediaPackageSettings() == null ^ this.getMediaPackageSettings() == null)
            return false;
        if (other.getMediaPackageSettings() != null
                && other.getMediaPackageSettings().equals(this.getMediaPackageSettings()) == false)
            return false;
        if (other.getMultiplexSettings() == null ^ this.getMultiplexSettings() == null)
            return false;
        if (other.getMultiplexSettings() != null
                && other.getMultiplexSettings().equals(this.getMultiplexSettings()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        return true;
    }
}
