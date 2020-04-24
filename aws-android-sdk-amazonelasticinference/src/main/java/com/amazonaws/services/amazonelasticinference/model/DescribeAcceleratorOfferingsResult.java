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

package com.amazonaws.services.amazonelasticinference.model;

import java.io.Serializable;

public class DescribeAcceleratorOfferingsResult implements Serializable {
    /**
     * <p>
     * The list of accelerator type offerings for a specific location.
     * </p>
     */
    private java.util.List<AcceleratorTypeOffering> acceleratorTypeOfferings;

    /**
     * <p>
     * The list of accelerator type offerings for a specific location.
     * </p>
     *
     * @return <p>
     *         The list of accelerator type offerings for a specific location.
     *         </p>
     */
    public java.util.List<AcceleratorTypeOffering> getAcceleratorTypeOfferings() {
        return acceleratorTypeOfferings;
    }

    /**
     * <p>
     * The list of accelerator type offerings for a specific location.
     * </p>
     *
     * @param acceleratorTypeOfferings <p>
     *            The list of accelerator type offerings for a specific
     *            location.
     *            </p>
     */
    public void setAcceleratorTypeOfferings(
            java.util.Collection<AcceleratorTypeOffering> acceleratorTypeOfferings) {
        if (acceleratorTypeOfferings == null) {
            this.acceleratorTypeOfferings = null;
            return;
        }

        this.acceleratorTypeOfferings = new java.util.ArrayList<AcceleratorTypeOffering>(
                acceleratorTypeOfferings);
    }

    /**
     * <p>
     * The list of accelerator type offerings for a specific location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceleratorTypeOfferings <p>
     *            The list of accelerator type offerings for a specific
     *            location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAcceleratorOfferingsResult withAcceleratorTypeOfferings(
            AcceleratorTypeOffering... acceleratorTypeOfferings) {
        if (getAcceleratorTypeOfferings() == null) {
            this.acceleratorTypeOfferings = new java.util.ArrayList<AcceleratorTypeOffering>(
                    acceleratorTypeOfferings.length);
        }
        for (AcceleratorTypeOffering value : acceleratorTypeOfferings) {
            this.acceleratorTypeOfferings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of accelerator type offerings for a specific location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceleratorTypeOfferings <p>
     *            The list of accelerator type offerings for a specific
     *            location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAcceleratorOfferingsResult withAcceleratorTypeOfferings(
            java.util.Collection<AcceleratorTypeOffering> acceleratorTypeOfferings) {
        setAcceleratorTypeOfferings(acceleratorTypeOfferings);
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
        if (getAcceleratorTypeOfferings() != null)
            sb.append("acceleratorTypeOfferings: " + getAcceleratorTypeOfferings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAcceleratorTypeOfferings() == null) ? 0 : getAcceleratorTypeOfferings()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAcceleratorOfferingsResult == false)
            return false;
        DescribeAcceleratorOfferingsResult other = (DescribeAcceleratorOfferingsResult) obj;

        if (other.getAcceleratorTypeOfferings() == null
                ^ this.getAcceleratorTypeOfferings() == null)
            return false;
        if (other.getAcceleratorTypeOfferings() != null
                && other.getAcceleratorTypeOfferings().equals(this.getAcceleratorTypeOfferings()) == false)
            return false;
        return true;
    }
}
