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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

/**
 * <p>
 * The Amazon EC2 hardware specifications that you want AWS to provide
 * recommendations for.
 * </p>
 */
public class EC2Specification implements Serializable {
    /**
     * <p>
     * Whether you want a recommendation for standard or convertible
     * reservations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, CONVERTIBLE
     */
    private String offeringClass;

    /**
     * <p>
     * Whether you want a recommendation for standard or convertible
     * reservations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, CONVERTIBLE
     *
     * @return <p>
     *         Whether you want a recommendation for standard or convertible
     *         reservations.
     *         </p>
     * @see OfferingClass
     */
    public String getOfferingClass() {
        return offeringClass;
    }

    /**
     * <p>
     * Whether you want a recommendation for standard or convertible
     * reservations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, CONVERTIBLE
     *
     * @param offeringClass <p>
     *            Whether you want a recommendation for standard or convertible
     *            reservations.
     *            </p>
     * @see OfferingClass
     */
    public void setOfferingClass(String offeringClass) {
        this.offeringClass = offeringClass;
    }

    /**
     * <p>
     * Whether you want a recommendation for standard or convertible
     * reservations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, CONVERTIBLE
     *
     * @param offeringClass <p>
     *            Whether you want a recommendation for standard or convertible
     *            reservations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OfferingClass
     */
    public EC2Specification withOfferingClass(String offeringClass) {
        this.offeringClass = offeringClass;
        return this;
    }

    /**
     * <p>
     * Whether you want a recommendation for standard or convertible
     * reservations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, CONVERTIBLE
     *
     * @param offeringClass <p>
     *            Whether you want a recommendation for standard or convertible
     *            reservations.
     *            </p>
     * @see OfferingClass
     */
    public void setOfferingClass(OfferingClass offeringClass) {
        this.offeringClass = offeringClass.toString();
    }

    /**
     * <p>
     * Whether you want a recommendation for standard or convertible
     * reservations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, CONVERTIBLE
     *
     * @param offeringClass <p>
     *            Whether you want a recommendation for standard or convertible
     *            reservations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OfferingClass
     */
    public EC2Specification withOfferingClass(OfferingClass offeringClass) {
        this.offeringClass = offeringClass.toString();
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
        if (getOfferingClass() != null)
            sb.append("OfferingClass: " + getOfferingClass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOfferingClass() == null) ? 0 : getOfferingClass().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EC2Specification == false)
            return false;
        EC2Specification other = (EC2Specification) obj;

        if (other.getOfferingClass() == null ^ this.getOfferingClass() == null)
            return false;
        if (other.getOfferingClass() != null
                && other.getOfferingClass().equals(this.getOfferingClass()) == false)
            return false;
        return true;
    }
}
