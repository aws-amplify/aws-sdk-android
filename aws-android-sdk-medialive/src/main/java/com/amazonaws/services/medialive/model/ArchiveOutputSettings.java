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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Archive Output Settings
 */
public class ArchiveOutputSettings implements Serializable {
    /**
     * Settings specific to the container type of the file.
     */
    private ArchiveContainerSettings containerSettings;

    /**
     * Output file extension. If excluded, this will be auto-selected from the
     * container type.
     */
    private String extension;

    /**
     * String concatenated to the end of the destination filename. Required for
     * multiple outputs of the same type.
     */
    private String nameModifier;

    /**
     * Settings specific to the container type of the file.
     *
     * @return Settings specific to the container type of the file.
     */
    public ArchiveContainerSettings getContainerSettings() {
        return containerSettings;
    }

    /**
     * Settings specific to the container type of the file.
     *
     * @param containerSettings Settings specific to the container type of the
     *            file.
     */
    public void setContainerSettings(ArchiveContainerSettings containerSettings) {
        this.containerSettings = containerSettings;
    }

    /**
     * Settings specific to the container type of the file.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerSettings Settings specific to the container type of the
     *            file.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ArchiveOutputSettings withContainerSettings(ArchiveContainerSettings containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    /**
     * Output file extension. If excluded, this will be auto-selected from the
     * container type.
     *
     * @return Output file extension. If excluded, this will be auto-selected
     *         from the container type.
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Output file extension. If excluded, this will be auto-selected from the
     * container type.
     *
     * @param extension Output file extension. If excluded, this will be
     *            auto-selected from the container type.
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * Output file extension. If excluded, this will be auto-selected from the
     * container type.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extension Output file extension. If excluded, this will be
     *            auto-selected from the container type.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ArchiveOutputSettings withExtension(String extension) {
        this.extension = extension;
        return this;
    }

    /**
     * String concatenated to the end of the destination filename. Required for
     * multiple outputs of the same type.
     *
     * @return String concatenated to the end of the destination filename.
     *         Required for multiple outputs of the same type.
     */
    public String getNameModifier() {
        return nameModifier;
    }

    /**
     * String concatenated to the end of the destination filename. Required for
     * multiple outputs of the same type.
     *
     * @param nameModifier String concatenated to the end of the destination
     *            filename. Required for multiple outputs of the same type.
     */
    public void setNameModifier(String nameModifier) {
        this.nameModifier = nameModifier;
    }

    /**
     * String concatenated to the end of the destination filename. Required for
     * multiple outputs of the same type.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nameModifier String concatenated to the end of the destination
     *            filename. Required for multiple outputs of the same type.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ArchiveOutputSettings withNameModifier(String nameModifier) {
        this.nameModifier = nameModifier;
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
        if (getContainerSettings() != null)
            sb.append("ContainerSettings: " + getContainerSettings() + ",");
        if (getExtension() != null)
            sb.append("Extension: " + getExtension() + ",");
        if (getNameModifier() != null)
            sb.append("NameModifier: " + getNameModifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContainerSettings() == null) ? 0 : getContainerSettings().hashCode());
        hashCode = prime * hashCode + ((getExtension() == null) ? 0 : getExtension().hashCode());
        hashCode = prime * hashCode
                + ((getNameModifier() == null) ? 0 : getNameModifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArchiveOutputSettings == false)
            return false;
        ArchiveOutputSettings other = (ArchiveOutputSettings) obj;

        if (other.getContainerSettings() == null ^ this.getContainerSettings() == null)
            return false;
        if (other.getContainerSettings() != null
                && other.getContainerSettings().equals(this.getContainerSettings()) == false)
            return false;
        if (other.getExtension() == null ^ this.getExtension() == null)
            return false;
        if (other.getExtension() != null
                && other.getExtension().equals(this.getExtension()) == false)
            return false;
        if (other.getNameModifier() == null ^ this.getNameModifier() == null)
            return false;
        if (other.getNameModifier() != null
                && other.getNameModifier().equals(this.getNameModifier()) == false)
            return false;
        return true;
    }
}
