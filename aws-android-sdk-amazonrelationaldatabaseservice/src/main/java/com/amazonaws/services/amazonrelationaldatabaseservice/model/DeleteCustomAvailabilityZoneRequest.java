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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a custom Availability Zone (AZ).
 * </p>
 * <p>
 * A custom AZ is an on-premises AZ that is integrated with a VMware vSphere
 * cluster.
 * </p>
 * <p>
 * For more information about RDS on VMware, see the <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
 * > <i>RDS on VMware User Guide.</i> </a>
 * </p>
 */
public class DeleteCustomAvailabilityZoneRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The custom AZ identifier.
     * </p>
     */
    private String customAvailabilityZoneId;

    /**
     * <p>
     * The custom AZ identifier.
     * </p>
     *
     * @return <p>
     *         The custom AZ identifier.
     *         </p>
     */
    public String getCustomAvailabilityZoneId() {
        return customAvailabilityZoneId;
    }

    /**
     * <p>
     * The custom AZ identifier.
     * </p>
     *
     * @param customAvailabilityZoneId <p>
     *            The custom AZ identifier.
     *            </p>
     */
    public void setCustomAvailabilityZoneId(String customAvailabilityZoneId) {
        this.customAvailabilityZoneId = customAvailabilityZoneId;
    }

    /**
     * <p>
     * The custom AZ identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customAvailabilityZoneId <p>
     *            The custom AZ identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteCustomAvailabilityZoneRequest withCustomAvailabilityZoneId(
            String customAvailabilityZoneId) {
        this.customAvailabilityZoneId = customAvailabilityZoneId;
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
        if (getCustomAvailabilityZoneId() != null)
            sb.append("CustomAvailabilityZoneId: " + getCustomAvailabilityZoneId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCustomAvailabilityZoneId() == null) ? 0 : getCustomAvailabilityZoneId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCustomAvailabilityZoneRequest == false)
            return false;
        DeleteCustomAvailabilityZoneRequest other = (DeleteCustomAvailabilityZoneRequest) obj;

        if (other.getCustomAvailabilityZoneId() == null
                ^ this.getCustomAvailabilityZoneId() == null)
            return false;
        if (other.getCustomAvailabilityZoneId() != null
                && other.getCustomAvailabilityZoneId().equals(this.getCustomAvailabilityZoneId()) == false)
            return false;
        return true;
    }
}
