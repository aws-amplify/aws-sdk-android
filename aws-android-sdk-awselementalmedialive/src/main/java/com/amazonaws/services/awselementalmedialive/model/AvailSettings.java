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
 * Avail Settings
 */
public class AvailSettings implements Serializable {
    /**
     * Scte35 Splice Insert
     */
    private Scte35SpliceInsert scte35SpliceInsert;

    /**
     * Scte35 Time Signal Apos
     */
    private Scte35TimeSignalApos scte35TimeSignalApos;

    /**
     * Scte35 Splice Insert
     *
     * @return Scte35 Splice Insert
     */
    public Scte35SpliceInsert getScte35SpliceInsert() {
        return scte35SpliceInsert;
    }

    /**
     * Scte35 Splice Insert
     *
     * @param scte35SpliceInsert Scte35 Splice Insert
     */
    public void setScte35SpliceInsert(Scte35SpliceInsert scte35SpliceInsert) {
        this.scte35SpliceInsert = scte35SpliceInsert;
    }

    /**
     * Scte35 Splice Insert
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scte35SpliceInsert Scte35 Splice Insert
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailSettings withScte35SpliceInsert(Scte35SpliceInsert scte35SpliceInsert) {
        this.scte35SpliceInsert = scte35SpliceInsert;
        return this;
    }

    /**
     * Scte35 Time Signal Apos
     *
     * @return Scte35 Time Signal Apos
     */
    public Scte35TimeSignalApos getScte35TimeSignalApos() {
        return scte35TimeSignalApos;
    }

    /**
     * Scte35 Time Signal Apos
     *
     * @param scte35TimeSignalApos Scte35 Time Signal Apos
     */
    public void setScte35TimeSignalApos(Scte35TimeSignalApos scte35TimeSignalApos) {
        this.scte35TimeSignalApos = scte35TimeSignalApos;
    }

    /**
     * Scte35 Time Signal Apos
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scte35TimeSignalApos Scte35 Time Signal Apos
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailSettings withScte35TimeSignalApos(Scte35TimeSignalApos scte35TimeSignalApos) {
        this.scte35TimeSignalApos = scte35TimeSignalApos;
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
        if (getScte35SpliceInsert() != null)
            sb.append("Scte35SpliceInsert: " + getScte35SpliceInsert() + ",");
        if (getScte35TimeSignalApos() != null)
            sb.append("Scte35TimeSignalApos: " + getScte35TimeSignalApos());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getScte35SpliceInsert() == null) ? 0 : getScte35SpliceInsert().hashCode());
        hashCode = prime * hashCode
                + ((getScte35TimeSignalApos() == null) ? 0 : getScte35TimeSignalApos().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailSettings == false)
            return false;
        AvailSettings other = (AvailSettings) obj;

        if (other.getScte35SpliceInsert() == null ^ this.getScte35SpliceInsert() == null)
            return false;
        if (other.getScte35SpliceInsert() != null
                && other.getScte35SpliceInsert().equals(this.getScte35SpliceInsert()) == false)
            return false;
        if (other.getScte35TimeSignalApos() == null ^ this.getScte35TimeSignalApos() == null)
            return false;
        if (other.getScte35TimeSignalApos() != null
                && other.getScte35TimeSignalApos().equals(this.getScte35TimeSignalApos()) == false)
            return false;
        return true;
    }
}
