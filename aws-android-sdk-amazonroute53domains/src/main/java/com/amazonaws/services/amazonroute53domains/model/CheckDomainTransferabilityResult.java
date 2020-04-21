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

package com.amazonaws.services.amazonroute53domains.model;

import java.io.Serializable;

/**
 * <p>
 * The CheckDomainTransferability response includes the following elements.
 * </p>
 */
public class CheckDomainTransferabilityResult implements Serializable {
    /**
     * <p>
     * A complex type that contains information about whether the specified
     * domain can be transferred to Route 53.
     * </p>
     */
    private DomainTransferability transferability;

    /**
     * <p>
     * A complex type that contains information about whether the specified
     * domain can be transferred to Route 53.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about whether the
     *         specified domain can be transferred to Route 53.
     *         </p>
     */
    public DomainTransferability getTransferability() {
        return transferability;
    }

    /**
     * <p>
     * A complex type that contains information about whether the specified
     * domain can be transferred to Route 53.
     * </p>
     *
     * @param transferability <p>
     *            A complex type that contains information about whether the
     *            specified domain can be transferred to Route 53.
     *            </p>
     */
    public void setTransferability(DomainTransferability transferability) {
        this.transferability = transferability;
    }

    /**
     * <p>
     * A complex type that contains information about whether the specified
     * domain can be transferred to Route 53.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transferability <p>
     *            A complex type that contains information about whether the
     *            specified domain can be transferred to Route 53.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CheckDomainTransferabilityResult withTransferability(
            DomainTransferability transferability) {
        this.transferability = transferability;
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
        if (getTransferability() != null)
            sb.append("Transferability: " + getTransferability());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTransferability() == null) ? 0 : getTransferability().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckDomainTransferabilityResult == false)
            return false;
        CheckDomainTransferabilityResult other = (CheckDomainTransferabilityResult) obj;

        if (other.getTransferability() == null ^ this.getTransferability() == null)
            return false;
        if (other.getTransferability() != null
                && other.getTransferability().equals(this.getTransferability()) == false)
            return false;
        return true;
    }
}
