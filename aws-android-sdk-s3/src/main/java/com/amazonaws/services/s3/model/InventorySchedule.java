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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the schedule for generating inventory results.
 * </p>
 */
public class InventorySchedule implements Serializable {
    /**
     * <p>
     * Specifies how frequently inventory results are produced.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Daily, Weekly
     */
    private String frequency;

    /**
     * <p>
     * Specifies how frequently inventory results are produced.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Daily, Weekly
     *
     * @return <p>
     *         Specifies how frequently inventory results are produced.
     *         </p>
     * @see InventoryFrequency
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * <p>
     * Specifies how frequently inventory results are produced.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Daily, Weekly
     *
     * @param frequency <p>
     *            Specifies how frequently inventory results are produced.
     *            </p>
     * @see InventoryFrequency
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * <p>
     * Specifies how frequently inventory results are produced.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Daily, Weekly
     *
     * @param frequency <p>
     *            Specifies how frequently inventory results are produced.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InventoryFrequency
     */
    public InventorySchedule withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * <p>
     * Specifies how frequently inventory results are produced.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Daily, Weekly
     *
     * @param frequency <p>
     *            Specifies how frequently inventory results are produced.
     *            </p>
     * @see InventoryFrequency
     */
    public void setFrequency(InventoryFrequency frequency) {
        this.frequency = frequency.toString();
    }

    /**
     * <p>
     * Specifies how frequently inventory results are produced.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Daily, Weekly
     *
     * @param frequency <p>
     *            Specifies how frequently inventory results are produced.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InventoryFrequency
     */
    public InventorySchedule withFrequency(InventoryFrequency frequency) {
        this.frequency = frequency.toString();
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
        if (getFrequency() != null)
            sb.append("Frequency: " + getFrequency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventorySchedule == false)
            return false;
        InventorySchedule other = (InventorySchedule) obj;

        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null
                && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        return true;
    }
}
