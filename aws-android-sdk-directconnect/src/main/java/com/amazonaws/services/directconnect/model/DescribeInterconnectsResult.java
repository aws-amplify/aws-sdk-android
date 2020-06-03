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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

public class DescribeInterconnectsResult implements Serializable {
    /**
     * <p>
     * The interconnects.
     * </p>
     */
    private java.util.List<Interconnect> interconnects;

    /**
     * <p>
     * The interconnects.
     * </p>
     *
     * @return <p>
     *         The interconnects.
     *         </p>
     */
    public java.util.List<Interconnect> getInterconnects() {
        return interconnects;
    }

    /**
     * <p>
     * The interconnects.
     * </p>
     *
     * @param interconnects <p>
     *            The interconnects.
     *            </p>
     */
    public void setInterconnects(java.util.Collection<Interconnect> interconnects) {
        if (interconnects == null) {
            this.interconnects = null;
            return;
        }

        this.interconnects = new java.util.ArrayList<Interconnect>(interconnects);
    }

    /**
     * <p>
     * The interconnects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param interconnects <p>
     *            The interconnects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInterconnectsResult withInterconnects(Interconnect... interconnects) {
        if (getInterconnects() == null) {
            this.interconnects = new java.util.ArrayList<Interconnect>(interconnects.length);
        }
        for (Interconnect value : interconnects) {
            this.interconnects.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The interconnects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param interconnects <p>
     *            The interconnects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInterconnectsResult withInterconnects(
            java.util.Collection<Interconnect> interconnects) {
        setInterconnects(interconnects);
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
        if (getInterconnects() != null)
            sb.append("interconnects: " + getInterconnects());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInterconnects() == null) ? 0 : getInterconnects().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInterconnectsResult == false)
            return false;
        DescribeInterconnectsResult other = (DescribeInterconnectsResult) obj;

        if (other.getInterconnects() == null ^ this.getInterconnects() == null)
            return false;
        if (other.getInterconnects() != null
                && other.getInterconnects().equals(this.getInterconnects()) == false)
            return false;
        return true;
    }
}
