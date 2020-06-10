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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

public class IsVpcPeeredResult implements Serializable {
    /**
     * <p>
     * Returns <code>true</code> if the Lightsail VPC is peered; otherwise,
     * <code>false</code>.
     * </p>
     */
    private Boolean isPeered;

    /**
     * <p>
     * Returns <code>true</code> if the Lightsail VPC is peered; otherwise,
     * <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Returns <code>true</code> if the Lightsail VPC is peered;
     *         otherwise, <code>false</code>.
     *         </p>
     */
    public Boolean isIsPeered() {
        return isPeered;
    }

    /**
     * <p>
     * Returns <code>true</code> if the Lightsail VPC is peered; otherwise,
     * <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Returns <code>true</code> if the Lightsail VPC is peered;
     *         otherwise, <code>false</code>.
     *         </p>
     */
    public Boolean getIsPeered() {
        return isPeered;
    }

    /**
     * <p>
     * Returns <code>true</code> if the Lightsail VPC is peered; otherwise,
     * <code>false</code>.
     * </p>
     *
     * @param isPeered <p>
     *            Returns <code>true</code> if the Lightsail VPC is peered;
     *            otherwise, <code>false</code>.
     *            </p>
     */
    public void setIsPeered(Boolean isPeered) {
        this.isPeered = isPeered;
    }

    /**
     * <p>
     * Returns <code>true</code> if the Lightsail VPC is peered; otherwise,
     * <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isPeered <p>
     *            Returns <code>true</code> if the Lightsail VPC is peered;
     *            otherwise, <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IsVpcPeeredResult withIsPeered(Boolean isPeered) {
        this.isPeered = isPeered;
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
        if (getIsPeered() != null)
            sb.append("isPeered: " + getIsPeered());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsPeered() == null) ? 0 : getIsPeered().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IsVpcPeeredResult == false)
            return false;
        IsVpcPeeredResult other = (IsVpcPeeredResult) obj;

        if (other.getIsPeered() == null ^ this.getIsPeered() == null)
            return false;
        if (other.getIsPeered() != null && other.getIsPeered().equals(this.getIsPeered()) == false)
            return false;
        return true;
    }
}
