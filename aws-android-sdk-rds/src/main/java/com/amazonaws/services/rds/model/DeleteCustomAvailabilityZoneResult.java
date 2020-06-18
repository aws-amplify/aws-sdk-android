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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

public class DeleteCustomAvailabilityZoneResult implements Serializable {
    /**
     * <p>
     * A custom Availability Zone (AZ) is an on-premises AZ that is integrated
     * with a VMware vSphere cluster.
     * </p>
     * <p>
     * For more information about RDS on VMware, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     * > <i>RDS on VMware User Guide.</i> </a>
     * </p>
     */
    private CustomAvailabilityZone customAvailabilityZone;

    /**
     * <p>
     * A custom Availability Zone (AZ) is an on-premises AZ that is integrated
     * with a VMware vSphere cluster.
     * </p>
     * <p>
     * For more information about RDS on VMware, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     * > <i>RDS on VMware User Guide.</i> </a>
     * </p>
     *
     * @return <p>
     *         A custom Availability Zone (AZ) is an on-premises AZ that is
     *         integrated with a VMware vSphere cluster.
     *         </p>
     *         <p>
     *         For more information about RDS on VMware, see the <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     *         > <i>RDS on VMware User Guide.</i> </a>
     *         </p>
     */
    public CustomAvailabilityZone getCustomAvailabilityZone() {
        return customAvailabilityZone;
    }

    /**
     * <p>
     * A custom Availability Zone (AZ) is an on-premises AZ that is integrated
     * with a VMware vSphere cluster.
     * </p>
     * <p>
     * For more information about RDS on VMware, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     * > <i>RDS on VMware User Guide.</i> </a>
     * </p>
     *
     * @param customAvailabilityZone <p>
     *            A custom Availability Zone (AZ) is an on-premises AZ that is
     *            integrated with a VMware vSphere cluster.
     *            </p>
     *            <p>
     *            For more information about RDS on VMware, see the <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     *            > <i>RDS on VMware User Guide.</i> </a>
     *            </p>
     */
    public void setCustomAvailabilityZone(CustomAvailabilityZone customAvailabilityZone) {
        this.customAvailabilityZone = customAvailabilityZone;
    }

    /**
     * <p>
     * A custom Availability Zone (AZ) is an on-premises AZ that is integrated
     * with a VMware vSphere cluster.
     * </p>
     * <p>
     * For more information about RDS on VMware, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     * > <i>RDS on VMware User Guide.</i> </a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customAvailabilityZone <p>
     *            A custom Availability Zone (AZ) is an on-premises AZ that is
     *            integrated with a VMware vSphere cluster.
     *            </p>
     *            <p>
     *            For more information about RDS on VMware, see the <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     *            > <i>RDS on VMware User Guide.</i> </a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteCustomAvailabilityZoneResult withCustomAvailabilityZone(
            CustomAvailabilityZone customAvailabilityZone) {
        this.customAvailabilityZone = customAvailabilityZone;
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
        if (getCustomAvailabilityZone() != null)
            sb.append("CustomAvailabilityZone: " + getCustomAvailabilityZone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCustomAvailabilityZone() == null) ? 0 : getCustomAvailabilityZone()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCustomAvailabilityZoneResult == false)
            return false;
        DeleteCustomAvailabilityZoneResult other = (DeleteCustomAvailabilityZoneResult) obj;

        if (other.getCustomAvailabilityZone() == null ^ this.getCustomAvailabilityZone() == null)
            return false;
        if (other.getCustomAvailabilityZone() != null
                && other.getCustomAvailabilityZone().equals(this.getCustomAvailabilityZone()) == false)
            return false;
        return true;
    }
}
