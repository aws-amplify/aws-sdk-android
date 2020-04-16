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
 * You might need to reboot your DB instance, usually for maintenance reasons.
 * For example, if you make certain modifications, or if you change the DB
 * parameter group associated with the DB instance, you must reboot the instance
 * for the changes to take effect.
 * </p>
 * <p>
 * Rebooting a DB instance restarts the database engine service. Rebooting a DB
 * instance results in a momentary outage, during which the DB instance status
 * is set to rebooting.
 * </p>
 * <p>
 * For more information about rebooting, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_RebootInstance.html"
 * >Rebooting a DB Instance</a> in the <i>Amazon RDS User Guide.</i>
 * </p>
 */
public class RebootDBInstanceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     */
    private String dBInstanceIdentifier;

    /**
     * <p>
     * A value that indicates whether the reboot is conducted through a Multi-AZ
     * failover.
     * </p>
     * <p>
     * Constraint: You can't enable force failover if the instance isn't
     * configured for Multi-AZ.
     * </p>
     */
    private Boolean forceFailover;

    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The DB instance identifier. This parameter is stored as a
     *         lowercase string.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing DBInstance.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     *
     * @param dBInstanceIdentifier <p>
     *            The DB instance identifier. This parameter is stored as a
     *            lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing DBInstance.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceIdentifier <p>
     *            The DB instance identifier. This parameter is stored as a
     *            lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing DBInstance.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RebootDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the reboot is conducted through a Multi-AZ
     * failover.
     * </p>
     * <p>
     * Constraint: You can't enable force failover if the instance isn't
     * configured for Multi-AZ.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the reboot is conducted through a
     *         Multi-AZ failover.
     *         </p>
     *         <p>
     *         Constraint: You can't enable force failover if the instance isn't
     *         configured for Multi-AZ.
     *         </p>
     */
    public Boolean isForceFailover() {
        return forceFailover;
    }

    /**
     * <p>
     * A value that indicates whether the reboot is conducted through a Multi-AZ
     * failover.
     * </p>
     * <p>
     * Constraint: You can't enable force failover if the instance isn't
     * configured for Multi-AZ.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the reboot is conducted through a
     *         Multi-AZ failover.
     *         </p>
     *         <p>
     *         Constraint: You can't enable force failover if the instance isn't
     *         configured for Multi-AZ.
     *         </p>
     */
    public Boolean getForceFailover() {
        return forceFailover;
    }

    /**
     * <p>
     * A value that indicates whether the reboot is conducted through a Multi-AZ
     * failover.
     * </p>
     * <p>
     * Constraint: You can't enable force failover if the instance isn't
     * configured for Multi-AZ.
     * </p>
     *
     * @param forceFailover <p>
     *            A value that indicates whether the reboot is conducted through
     *            a Multi-AZ failover.
     *            </p>
     *            <p>
     *            Constraint: You can't enable force failover if the instance
     *            isn't configured for Multi-AZ.
     *            </p>
     */
    public void setForceFailover(Boolean forceFailover) {
        this.forceFailover = forceFailover;
    }

    /**
     * <p>
     * A value that indicates whether the reboot is conducted through a Multi-AZ
     * failover.
     * </p>
     * <p>
     * Constraint: You can't enable force failover if the instance isn't
     * configured for Multi-AZ.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forceFailover <p>
     *            A value that indicates whether the reboot is conducted through
     *            a Multi-AZ failover.
     *            </p>
     *            <p>
     *            Constraint: You can't enable force failover if the instance
     *            isn't configured for Multi-AZ.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RebootDBInstanceRequest withForceFailover(Boolean forceFailover) {
        this.forceFailover = forceFailover;
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
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getForceFailover() != null)
            sb.append("ForceFailover: " + getForceFailover());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getForceFailover() == null) ? 0 : getForceFailover().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RebootDBInstanceRequest == false)
            return false;
        RebootDBInstanceRequest other = (RebootDBInstanceRequest) obj;

        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null
                && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getForceFailover() == null ^ this.getForceFailover() == null)
            return false;
        if (other.getForceFailover() != null
                && other.getForceFailover().equals(this.getForceFailover()) == false)
            return false;
        return true;
    }
}
