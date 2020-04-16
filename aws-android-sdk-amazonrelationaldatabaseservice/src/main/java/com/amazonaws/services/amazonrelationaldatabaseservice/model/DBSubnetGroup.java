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

/**
 * <p>
 * Contains the details of an Amazon RDS DB subnet group.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <code>DescribeDBSubnetGroups</code> action.
 * </p>
 */
public class DBSubnetGroup implements Serializable {
    /**
     * <p>
     * The name of the DB subnet group.
     * </p>
     */
    private String dBSubnetGroupName;

    /**
     * <p>
     * Provides the description of the DB subnet group.
     * </p>
     */
    private String dBSubnetGroupDescription;

    /**
     * <p>
     * Provides the VpcId of the DB subnet group.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * Provides the status of the DB subnet group.
     * </p>
     */
    private String subnetGroupStatus;

    /**
     * <p>
     * Contains a list of <code>Subnet</code> elements.
     * </p>
     */
    private java.util.List<Subnet> subnets;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB subnet group.
     * </p>
     */
    private String dBSubnetGroupArn;

    /**
     * <p>
     * The name of the DB subnet group.
     * </p>
     *
     * @return <p>
     *         The name of the DB subnet group.
     *         </p>
     */
    public String getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }

    /**
     * <p>
     * The name of the DB subnet group.
     * </p>
     *
     * @param dBSubnetGroupName <p>
     *            The name of the DB subnet group.
     *            </p>
     */
    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * The name of the DB subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSubnetGroupName <p>
     *            The name of the DB subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSubnetGroup withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * <p>
     * Provides the description of the DB subnet group.
     * </p>
     *
     * @return <p>
     *         Provides the description of the DB subnet group.
     *         </p>
     */
    public String getDBSubnetGroupDescription() {
        return dBSubnetGroupDescription;
    }

    /**
     * <p>
     * Provides the description of the DB subnet group.
     * </p>
     *
     * @param dBSubnetGroupDescription <p>
     *            Provides the description of the DB subnet group.
     *            </p>
     */
    public void setDBSubnetGroupDescription(String dBSubnetGroupDescription) {
        this.dBSubnetGroupDescription = dBSubnetGroupDescription;
    }

    /**
     * <p>
     * Provides the description of the DB subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSubnetGroupDescription <p>
     *            Provides the description of the DB subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSubnetGroup withDBSubnetGroupDescription(String dBSubnetGroupDescription) {
        this.dBSubnetGroupDescription = dBSubnetGroupDescription;
        return this;
    }

    /**
     * <p>
     * Provides the VpcId of the DB subnet group.
     * </p>
     *
     * @return <p>
     *         Provides the VpcId of the DB subnet group.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * Provides the VpcId of the DB subnet group.
     * </p>
     *
     * @param vpcId <p>
     *            Provides the VpcId of the DB subnet group.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * Provides the VpcId of the DB subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            Provides the VpcId of the DB subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSubnetGroup withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * Provides the status of the DB subnet group.
     * </p>
     *
     * @return <p>
     *         Provides the status of the DB subnet group.
     *         </p>
     */
    public String getSubnetGroupStatus() {
        return subnetGroupStatus;
    }

    /**
     * <p>
     * Provides the status of the DB subnet group.
     * </p>
     *
     * @param subnetGroupStatus <p>
     *            Provides the status of the DB subnet group.
     *            </p>
     */
    public void setSubnetGroupStatus(String subnetGroupStatus) {
        this.subnetGroupStatus = subnetGroupStatus;
    }

    /**
     * <p>
     * Provides the status of the DB subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetGroupStatus <p>
     *            Provides the status of the DB subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSubnetGroup withSubnetGroupStatus(String subnetGroupStatus) {
        this.subnetGroupStatus = subnetGroupStatus;
        return this;
    }

    /**
     * <p>
     * Contains a list of <code>Subnet</code> elements.
     * </p>
     *
     * @return <p>
     *         Contains a list of <code>Subnet</code> elements.
     *         </p>
     */
    public java.util.List<Subnet> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * Contains a list of <code>Subnet</code> elements.
     * </p>
     *
     * @param subnets <p>
     *            Contains a list of <code>Subnet</code> elements.
     *            </p>
     */
    public void setSubnets(java.util.Collection<Subnet> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<Subnet>(subnets);
    }

    /**
     * <p>
     * Contains a list of <code>Subnet</code> elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            Contains a list of <code>Subnet</code> elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSubnetGroup withSubnets(Subnet... subnets) {
        if (getSubnets() == null) {
            this.subnets = new java.util.ArrayList<Subnet>(subnets.length);
        }
        for (Subnet value : subnets) {
            this.subnets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of <code>Subnet</code> elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            Contains a list of <code>Subnet</code> elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSubnetGroup withSubnets(java.util.Collection<Subnet> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB subnet group.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the DB subnet group.
     *         </p>
     */
    public String getDBSubnetGroupArn() {
        return dBSubnetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB subnet group.
     * </p>
     *
     * @param dBSubnetGroupArn <p>
     *            The Amazon Resource Name (ARN) for the DB subnet group.
     *            </p>
     */
    public void setDBSubnetGroupArn(String dBSubnetGroupArn) {
        this.dBSubnetGroupArn = dBSubnetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSubnetGroupArn <p>
     *            The Amazon Resource Name (ARN) for the DB subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSubnetGroup withDBSubnetGroupArn(String dBSubnetGroupArn) {
        this.dBSubnetGroupArn = dBSubnetGroupArn;
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
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
        if (getDBSubnetGroupDescription() != null)
            sb.append("DBSubnetGroupDescription: " + getDBSubnetGroupDescription() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getSubnetGroupStatus() != null)
            sb.append("SubnetGroupStatus: " + getSubnetGroupStatus() + ",");
        if (getSubnets() != null)
            sb.append("Subnets: " + getSubnets() + ",");
        if (getDBSubnetGroupArn() != null)
            sb.append("DBSubnetGroupArn: " + getDBSubnetGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBSubnetGroupDescription() == null) ? 0 : getDBSubnetGroupDescription()
                        .hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode
                + ((getSubnetGroupStatus() == null) ? 0 : getSubnetGroupStatus().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode
                + ((getDBSubnetGroupArn() == null) ? 0 : getDBSubnetGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBSubnetGroup == false)
            return false;
        DBSubnetGroup other = (DBSubnetGroup) obj;

        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null
                && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
            return false;
        if (other.getDBSubnetGroupDescription() == null
                ^ this.getDBSubnetGroupDescription() == null)
            return false;
        if (other.getDBSubnetGroupDescription() != null
                && other.getDBSubnetGroupDescription().equals(this.getDBSubnetGroupDescription()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetGroupStatus() == null ^ this.getSubnetGroupStatus() == null)
            return false;
        if (other.getSubnetGroupStatus() != null
                && other.getSubnetGroupStatus().equals(this.getSubnetGroupStatus()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getDBSubnetGroupArn() == null ^ this.getDBSubnetGroupArn() == null)
            return false;
        if (other.getDBSubnetGroupArn() != null
                && other.getDBSubnetGroupArn().equals(this.getDBSubnetGroupArn()) == false)
            return false;
        return true;
    }
}
