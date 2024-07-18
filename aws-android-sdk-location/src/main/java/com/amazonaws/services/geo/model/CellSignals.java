/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

/**
 * <p>
 * The cellular network communication infrastructure that the device uses.
 * </p>
 */
public class CellSignals implements Serializable {
    /**
     * <p>
     * Information about the Long-Term Evolution (LTE) network the device is
     * connected to.
     * </p>
     */
    private java.util.List<LteCellDetails> lteCellDetails;

    /**
     * <p>
     * Information about the Long-Term Evolution (LTE) network the device is
     * connected to.
     * </p>
     *
     * @return <p>
     *         Information about the Long-Term Evolution (LTE) network the
     *         device is connected to.
     *         </p>
     */
    public java.util.List<LteCellDetails> getLteCellDetails() {
        return lteCellDetails;
    }

    /**
     * <p>
     * Information about the Long-Term Evolution (LTE) network the device is
     * connected to.
     * </p>
     *
     * @param lteCellDetails <p>
     *            Information about the Long-Term Evolution (LTE) network the
     *            device is connected to.
     *            </p>
     */
    public void setLteCellDetails(java.util.Collection<LteCellDetails> lteCellDetails) {
        if (lteCellDetails == null) {
            this.lteCellDetails = null;
            return;
        }

        this.lteCellDetails = new java.util.ArrayList<LteCellDetails>(lteCellDetails);
    }

    /**
     * <p>
     * Information about the Long-Term Evolution (LTE) network the device is
     * connected to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lteCellDetails <p>
     *            Information about the Long-Term Evolution (LTE) network the
     *            device is connected to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CellSignals withLteCellDetails(LteCellDetails... lteCellDetails) {
        if (getLteCellDetails() == null) {
            this.lteCellDetails = new java.util.ArrayList<LteCellDetails>(lteCellDetails.length);
        }
        for (LteCellDetails value : lteCellDetails) {
            this.lteCellDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Long-Term Evolution (LTE) network the device is
     * connected to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lteCellDetails <p>
     *            Information about the Long-Term Evolution (LTE) network the
     *            device is connected to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CellSignals withLteCellDetails(java.util.Collection<LteCellDetails> lteCellDetails) {
        setLteCellDetails(lteCellDetails);
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
        if (getLteCellDetails() != null)
            sb.append("LteCellDetails: " + getLteCellDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLteCellDetails() == null) ? 0 : getLteCellDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CellSignals == false)
            return false;
        CellSignals other = (CellSignals) obj;

        if (other.getLteCellDetails() == null ^ this.getLteCellDetails() == null)
            return false;
        if (other.getLteCellDetails() != null
                && other.getLteCellDetails().equals(this.getLteCellDetails()) == false)
            return false;
        return true;
    }
}
