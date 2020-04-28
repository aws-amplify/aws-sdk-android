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
 * Archive Container Settings
 */
public class ArchiveContainerSettings implements Serializable {
    /**
     * M2ts Settings
     */
    private M2tsSettings m2tsSettings;

    /**
     * M2ts Settings
     *
     * @return M2ts Settings
     */
    public M2tsSettings getM2tsSettings() {
        return m2tsSettings;
    }

    /**
     * M2ts Settings
     *
     * @param m2tsSettings M2ts Settings
     */
    public void setM2tsSettings(M2tsSettings m2tsSettings) {
        this.m2tsSettings = m2tsSettings;
    }

    /**
     * M2ts Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param m2tsSettings M2ts Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ArchiveContainerSettings withM2tsSettings(M2tsSettings m2tsSettings) {
        this.m2tsSettings = m2tsSettings;
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
        if (getM2tsSettings() != null)
            sb.append("M2tsSettings: " + getM2tsSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getM2tsSettings() == null) ? 0 : getM2tsSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArchiveContainerSettings == false)
            return false;
        ArchiveContainerSettings other = (ArchiveContainerSettings) obj;

        if (other.getM2tsSettings() == null ^ this.getM2tsSettings() == null)
            return false;
        if (other.getM2tsSettings() != null
                && other.getM2tsSettings().equals(this.getM2tsSettings()) == false)
            return false;
        return true;
    }
}
