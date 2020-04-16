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
 * Contains the details for an Amazon RDS DB security group.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <code>DescribeDBSecurityGroups</code> action.
 * </p>
 */
public class DBSecurityGroup implements Serializable {
    /**
     * <p>
     * Provides the AWS ID of the owner of a specific DB security group.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * Specifies the name of the DB security group.
     * </p>
     */
    private String dBSecurityGroupName;

    /**
     * <p>
     * Provides the description of the DB security group.
     * </p>
     */
    private String dBSecurityGroupDescription;

    /**
     * <p>
     * Provides the VpcId of the DB security group.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * Contains a list of <code>EC2SecurityGroup</code> elements.
     * </p>
     */
    private java.util.List<EC2SecurityGroup> eC2SecurityGroups;

    /**
     * <p>
     * Contains a list of <code>IPRange</code> elements.
     * </p>
     */
    private java.util.List<IPRange> iPRanges;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB security group.
     * </p>
     */
    private String dBSecurityGroupArn;

    /**
     * <p>
     * Provides the AWS ID of the owner of a specific DB security group.
     * </p>
     *
     * @return <p>
     *         Provides the AWS ID of the owner of a specific DB security group.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * Provides the AWS ID of the owner of a specific DB security group.
     * </p>
     *
     * @param ownerId <p>
     *            Provides the AWS ID of the owner of a specific DB security
     *            group.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * Provides the AWS ID of the owner of a specific DB security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            Provides the AWS ID of the owner of a specific DB security
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSecurityGroup withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * Specifies the name of the DB security group.
     * </p>
     *
     * @return <p>
     *         Specifies the name of the DB security group.
     *         </p>
     */
    public String getDBSecurityGroupName() {
        return dBSecurityGroupName;
    }

    /**
     * <p>
     * Specifies the name of the DB security group.
     * </p>
     *
     * @param dBSecurityGroupName <p>
     *            Specifies the name of the DB security group.
     *            </p>
     */
    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }

    /**
     * <p>
     * Specifies the name of the DB security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSecurityGroupName <p>
     *            Specifies the name of the DB security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSecurityGroup withDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
        return this;
    }

    /**
     * <p>
     * Provides the description of the DB security group.
     * </p>
     *
     * @return <p>
     *         Provides the description of the DB security group.
     *         </p>
     */
    public String getDBSecurityGroupDescription() {
        return dBSecurityGroupDescription;
    }

    /**
     * <p>
     * Provides the description of the DB security group.
     * </p>
     *
     * @param dBSecurityGroupDescription <p>
     *            Provides the description of the DB security group.
     *            </p>
     */
    public void setDBSecurityGroupDescription(String dBSecurityGroupDescription) {
        this.dBSecurityGroupDescription = dBSecurityGroupDescription;
    }

    /**
     * <p>
     * Provides the description of the DB security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSecurityGroupDescription <p>
     *            Provides the description of the DB security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSecurityGroup withDBSecurityGroupDescription(String dBSecurityGroupDescription) {
        this.dBSecurityGroupDescription = dBSecurityGroupDescription;
        return this;
    }

    /**
     * <p>
     * Provides the VpcId of the DB security group.
     * </p>
     *
     * @return <p>
     *         Provides the VpcId of the DB security group.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * Provides the VpcId of the DB security group.
     * </p>
     *
     * @param vpcId <p>
     *            Provides the VpcId of the DB security group.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * Provides the VpcId of the DB security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            Provides the VpcId of the DB security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSecurityGroup withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * Contains a list of <code>EC2SecurityGroup</code> elements.
     * </p>
     *
     * @return <p>
     *         Contains a list of <code>EC2SecurityGroup</code> elements.
     *         </p>
     */
    public java.util.List<EC2SecurityGroup> getEC2SecurityGroups() {
        return eC2SecurityGroups;
    }

    /**
     * <p>
     * Contains a list of <code>EC2SecurityGroup</code> elements.
     * </p>
     *
     * @param eC2SecurityGroups <p>
     *            Contains a list of <code>EC2SecurityGroup</code> elements.
     *            </p>
     */
    public void setEC2SecurityGroups(java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        if (eC2SecurityGroups == null) {
            this.eC2SecurityGroups = null;
            return;
        }

        this.eC2SecurityGroups = new java.util.ArrayList<EC2SecurityGroup>(eC2SecurityGroups);
    }

    /**
     * <p>
     * Contains a list of <code>EC2SecurityGroup</code> elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eC2SecurityGroups <p>
     *            Contains a list of <code>EC2SecurityGroup</code> elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSecurityGroup withEC2SecurityGroups(EC2SecurityGroup... eC2SecurityGroups) {
        if (getEC2SecurityGroups() == null) {
            this.eC2SecurityGroups = new java.util.ArrayList<EC2SecurityGroup>(
                    eC2SecurityGroups.length);
        }
        for (EC2SecurityGroup value : eC2SecurityGroups) {
            this.eC2SecurityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of <code>EC2SecurityGroup</code> elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eC2SecurityGroups <p>
     *            Contains a list of <code>EC2SecurityGroup</code> elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSecurityGroup withEC2SecurityGroups(
            java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        setEC2SecurityGroups(eC2SecurityGroups);
        return this;
    }

    /**
     * <p>
     * Contains a list of <code>IPRange</code> elements.
     * </p>
     *
     * @return <p>
     *         Contains a list of <code>IPRange</code> elements.
     *         </p>
     */
    public java.util.List<IPRange> getIPRanges() {
        return iPRanges;
    }

    /**
     * <p>
     * Contains a list of <code>IPRange</code> elements.
     * </p>
     *
     * @param iPRanges <p>
     *            Contains a list of <code>IPRange</code> elements.
     *            </p>
     */
    public void setIPRanges(java.util.Collection<IPRange> iPRanges) {
        if (iPRanges == null) {
            this.iPRanges = null;
            return;
        }

        this.iPRanges = new java.util.ArrayList<IPRange>(iPRanges);
    }

    /**
     * <p>
     * Contains a list of <code>IPRange</code> elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iPRanges <p>
     *            Contains a list of <code>IPRange</code> elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSecurityGroup withIPRanges(IPRange... iPRanges) {
        if (getIPRanges() == null) {
            this.iPRanges = new java.util.ArrayList<IPRange>(iPRanges.length);
        }
        for (IPRange value : iPRanges) {
            this.iPRanges.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of <code>IPRange</code> elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iPRanges <p>
     *            Contains a list of <code>IPRange</code> elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSecurityGroup withIPRanges(java.util.Collection<IPRange> iPRanges) {
        setIPRanges(iPRanges);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB security group.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the DB security group.
     *         </p>
     */
    public String getDBSecurityGroupArn() {
        return dBSecurityGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB security group.
     * </p>
     *
     * @param dBSecurityGroupArn <p>
     *            The Amazon Resource Name (ARN) for the DB security group.
     *            </p>
     */
    public void setDBSecurityGroupArn(String dBSecurityGroupArn) {
        this.dBSecurityGroupArn = dBSecurityGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSecurityGroupArn <p>
     *            The Amazon Resource Name (ARN) for the DB security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSecurityGroup withDBSecurityGroupArn(String dBSecurityGroupArn) {
        this.dBSecurityGroupArn = dBSecurityGroupArn;
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
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getDBSecurityGroupName() != null)
            sb.append("DBSecurityGroupName: " + getDBSecurityGroupName() + ",");
        if (getDBSecurityGroupDescription() != null)
            sb.append("DBSecurityGroupDescription: " + getDBSecurityGroupDescription() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getEC2SecurityGroups() != null)
            sb.append("EC2SecurityGroups: " + getEC2SecurityGroups() + ",");
        if (getIPRanges() != null)
            sb.append("IPRanges: " + getIPRanges() + ",");
        if (getDBSecurityGroupArn() != null)
            sb.append("DBSecurityGroupArn: " + getDBSecurityGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode
                + ((getDBSecurityGroupName() == null) ? 0 : getDBSecurityGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBSecurityGroupDescription() == null) ? 0 : getDBSecurityGroupDescription()
                        .hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode
                + ((getEC2SecurityGroups() == null) ? 0 : getEC2SecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getIPRanges() == null) ? 0 : getIPRanges().hashCode());
        hashCode = prime * hashCode
                + ((getDBSecurityGroupArn() == null) ? 0 : getDBSecurityGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBSecurityGroup == false)
            return false;
        DBSecurityGroup other = (DBSecurityGroup) obj;

        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getDBSecurityGroupName() == null ^ this.getDBSecurityGroupName() == null)
            return false;
        if (other.getDBSecurityGroupName() != null
                && other.getDBSecurityGroupName().equals(this.getDBSecurityGroupName()) == false)
            return false;
        if (other.getDBSecurityGroupDescription() == null
                ^ this.getDBSecurityGroupDescription() == null)
            return false;
        if (other.getDBSecurityGroupDescription() != null
                && other.getDBSecurityGroupDescription().equals(
                        this.getDBSecurityGroupDescription()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getEC2SecurityGroups() == null ^ this.getEC2SecurityGroups() == null)
            return false;
        if (other.getEC2SecurityGroups() != null
                && other.getEC2SecurityGroups().equals(this.getEC2SecurityGroups()) == false)
            return false;
        if (other.getIPRanges() == null ^ this.getIPRanges() == null)
            return false;
        if (other.getIPRanges() != null && other.getIPRanges().equals(this.getIPRanges()) == false)
            return false;
        if (other.getDBSecurityGroupArn() == null ^ this.getDBSecurityGroupArn() == null)
            return false;
        if (other.getDBSecurityGroupArn() != null
                && other.getDBSecurityGroupArn().equals(this.getDBSecurityGroupArn()) == false)
            return false;
        return true;
    }
}
