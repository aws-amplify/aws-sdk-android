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
 * Settings for a SCTE-35 time_signal.
 */
public class Scte35TimeSignalScheduleActionSettings implements Serializable {
    /**
     * The list of SCTE-35 descriptors accompanying the SCTE-35 time_signal.
     */
    private java.util.List<Scte35Descriptor> scte35Descriptors;

    /**
     * The list of SCTE-35 descriptors accompanying the SCTE-35 time_signal.
     *
     * @return The list of SCTE-35 descriptors accompanying the SCTE-35
     *         time_signal.
     */
    public java.util.List<Scte35Descriptor> getScte35Descriptors() {
        return scte35Descriptors;
    }

    /**
     * The list of SCTE-35 descriptors accompanying the SCTE-35 time_signal.
     *
     * @param scte35Descriptors The list of SCTE-35 descriptors accompanying the
     *            SCTE-35 time_signal.
     */
    public void setScte35Descriptors(java.util.Collection<Scte35Descriptor> scte35Descriptors) {
        if (scte35Descriptors == null) {
            this.scte35Descriptors = null;
            return;
        }

        this.scte35Descriptors = new java.util.ArrayList<Scte35Descriptor>(scte35Descriptors);
    }

    /**
     * The list of SCTE-35 descriptors accompanying the SCTE-35 time_signal.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scte35Descriptors The list of SCTE-35 descriptors accompanying the
     *            SCTE-35 time_signal.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Scte35TimeSignalScheduleActionSettings withScte35Descriptors(
            Scte35Descriptor... scte35Descriptors) {
        if (getScte35Descriptors() == null) {
            this.scte35Descriptors = new java.util.ArrayList<Scte35Descriptor>(
                    scte35Descriptors.length);
        }
        for (Scte35Descriptor value : scte35Descriptors) {
            this.scte35Descriptors.add(value);
        }
        return this;
    }

    /**
     * The list of SCTE-35 descriptors accompanying the SCTE-35 time_signal.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scte35Descriptors The list of SCTE-35 descriptors accompanying the
     *            SCTE-35 time_signal.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Scte35TimeSignalScheduleActionSettings withScte35Descriptors(
            java.util.Collection<Scte35Descriptor> scte35Descriptors) {
        setScte35Descriptors(scte35Descriptors);
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
        if (getScte35Descriptors() != null)
            sb.append("Scte35Descriptors: " + getScte35Descriptors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getScte35Descriptors() == null) ? 0 : getScte35Descriptors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scte35TimeSignalScheduleActionSettings == false)
            return false;
        Scte35TimeSignalScheduleActionSettings other = (Scte35TimeSignalScheduleActionSettings) obj;

        if (other.getScte35Descriptors() == null ^ this.getScte35Descriptors() == null)
            return false;
        if (other.getScte35Descriptors() != null
                && other.getScte35Descriptors().equals(this.getScte35Descriptors()) == false)
            return false;
        return true;
    }
}
