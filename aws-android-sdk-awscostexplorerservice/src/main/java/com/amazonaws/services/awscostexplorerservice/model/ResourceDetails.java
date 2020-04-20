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
 * Details on the resource.
 * </p>
 */
public class ResourceDetails implements Serializable {
    /**
     * <p>
     * Details on the Amazon EC2 resource.
     * </p>
     */
    private EC2ResourceDetails eC2ResourceDetails;

    /**
     * <p>
     * Details on the Amazon EC2 resource.
     * </p>
     *
     * @return <p>
     *         Details on the Amazon EC2 resource.
     *         </p>
     */
    public EC2ResourceDetails getEC2ResourceDetails() {
        return eC2ResourceDetails;
    }

    /**
     * <p>
     * Details on the Amazon EC2 resource.
     * </p>
     *
     * @param eC2ResourceDetails <p>
     *            Details on the Amazon EC2 resource.
     *            </p>
     */
    public void setEC2ResourceDetails(EC2ResourceDetails eC2ResourceDetails) {
        this.eC2ResourceDetails = eC2ResourceDetails;
    }

    /**
     * <p>
     * Details on the Amazon EC2 resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eC2ResourceDetails <p>
     *            Details on the Amazon EC2 resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withEC2ResourceDetails(EC2ResourceDetails eC2ResourceDetails) {
        this.eC2ResourceDetails = eC2ResourceDetails;
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
        if (getEC2ResourceDetails() != null)
            sb.append("EC2ResourceDetails: " + getEC2ResourceDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEC2ResourceDetails() == null) ? 0 : getEC2ResourceDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDetails == false)
            return false;
        ResourceDetails other = (ResourceDetails) obj;

        if (other.getEC2ResourceDetails() == null ^ this.getEC2ResourceDetails() == null)
            return false;
        if (other.getEC2ResourceDetails() != null
                && other.getEC2ResourceDetails().equals(this.getEC2ResourceDetails()) == false)
            return false;
        return true;
    }
}
