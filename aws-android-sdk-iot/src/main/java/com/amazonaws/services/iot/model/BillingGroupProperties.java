/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The properties of a billing group.
 * </p>
 */
public class BillingGroupProperties implements Serializable {
    /**
     * <p>
     * The description of the billing group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     */
    private String billingGroupDescription;

    /**
     * <p>
     * The description of the billing group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @return <p>
     *         The description of the billing group.
     *         </p>
     */
    public String getBillingGroupDescription() {
        return billingGroupDescription;
    }

    /**
     * <p>
     * The description of the billing group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param billingGroupDescription <p>
     *            The description of the billing group.
     *            </p>
     */
    public void setBillingGroupDescription(String billingGroupDescription) {
        this.billingGroupDescription = billingGroupDescription;
    }

    /**
     * <p>
     * The description of the billing group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param billingGroupDescription <p>
     *            The description of the billing group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BillingGroupProperties withBillingGroupDescription(String billingGroupDescription) {
        this.billingGroupDescription = billingGroupDescription;
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
        if (getBillingGroupDescription() != null)
            sb.append("billingGroupDescription: " + getBillingGroupDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getBillingGroupDescription() == null) ? 0 : getBillingGroupDescription()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BillingGroupProperties == false)
            return false;
        BillingGroupProperties other = (BillingGroupProperties) obj;

        if (other.getBillingGroupDescription() == null ^ this.getBillingGroupDescription() == null)
            return false;
        if (other.getBillingGroupDescription() != null
                && other.getBillingGroupDescription().equals(this.getBillingGroupDescription()) == false)
            return false;
        return true;
    }
}
