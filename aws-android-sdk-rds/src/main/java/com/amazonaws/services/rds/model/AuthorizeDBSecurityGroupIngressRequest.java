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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Enables ingress to a DBSecurityGroup using one of two forms of authorization.
 * First, EC2 or VPC security groups can be added to the DBSecurityGroup if the
 * application using the database is running on EC2 or VPC instances. Second, IP
 * ranges are available if the application accessing your database is running on
 * the Internet. Required parameters for this API are one of CIDR range,
 * EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either
 * EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).
 * </p>
 * <note>
 * <p>
 * You can't authorize ingress from an EC2 security group in one AWS Region to
 * an Amazon RDS DB instance in another. You can't authorize ingress from a VPC
 * security group in one VPC to an Amazon RDS DB instance in another.
 * </p>
 * </note>
 * <p>
 * For an overview of CIDR ranges, go to the <a
 * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Wikipedia
 * Tutorial</a>.
 * </p>
 */
public class AuthorizeDBSecurityGroupIngressRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the DB security group to add authorization to.
     * </p>
     */
    private String dBSecurityGroupName;

    /**
     * <p>
     * The IP range to authorize.
     * </p>
     */
    private String cIDRIP;

    /**
     * <p>
     * Name of the EC2 security group to authorize. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise,
     * <code>EC2SecurityGroupOwnerId</code> and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must
     * be provided.
     * </p>
     */
    private String eC2SecurityGroupName;

    /**
     * <p>
     * Id of the EC2 security group to authorize. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise,
     * <code>EC2SecurityGroupOwnerId</code> and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must
     * be provided.
     * </p>
     */
    private String eC2SecurityGroupId;

    /**
     * <p>
     * AWS account number of the owner of the EC2 security group specified in
     * the <code>EC2SecurityGroupName</code> parameter. The AWS access key ID
     * isn't an acceptable value. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise,
     * <code>EC2SecurityGroupOwnerId</code> and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must
     * be provided.
     * </p>
     */
    private String eC2SecurityGroupOwnerId;

    /**
     * <p>
     * The name of the DB security group to add authorization to.
     * </p>
     *
     * @return <p>
     *         The name of the DB security group to add authorization to.
     *         </p>
     */
    public String getDBSecurityGroupName() {
        return dBSecurityGroupName;
    }

    /**
     * <p>
     * The name of the DB security group to add authorization to.
     * </p>
     *
     * @param dBSecurityGroupName <p>
     *            The name of the DB security group to add authorization to.
     *            </p>
     */
    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }

    /**
     * <p>
     * The name of the DB security group to add authorization to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSecurityGroupName <p>
     *            The name of the DB security group to add authorization to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeDBSecurityGroupIngressRequest withDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
        return this;
    }

    /**
     * <p>
     * The IP range to authorize.
     * </p>
     *
     * @return <p>
     *         The IP range to authorize.
     *         </p>
     */
    public String getCIDRIP() {
        return cIDRIP;
    }

    /**
     * <p>
     * The IP range to authorize.
     * </p>
     *
     * @param cIDRIP <p>
     *            The IP range to authorize.
     *            </p>
     */
    public void setCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
    }

    /**
     * <p>
     * The IP range to authorize.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cIDRIP <p>
     *            The IP range to authorize.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeDBSecurityGroupIngressRequest withCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
        return this;
    }

    /**
     * <p>
     * Name of the EC2 security group to authorize. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise,
     * <code>EC2SecurityGroupOwnerId</code> and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must
     * be provided.
     * </p>
     *
     * @return <p>
     *         Name of the EC2 security group to authorize. For VPC DB security
     *         groups, <code>EC2SecurityGroupId</code> must be provided.
     *         Otherwise, <code>EC2SecurityGroupOwnerId</code> and either
     *         <code>EC2SecurityGroupName</code> or
     *         <code>EC2SecurityGroupId</code> must be provided.
     *         </p>
     */
    public String getEC2SecurityGroupName() {
        return eC2SecurityGroupName;
    }

    /**
     * <p>
     * Name of the EC2 security group to authorize. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise,
     * <code>EC2SecurityGroupOwnerId</code> and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must
     * be provided.
     * </p>
     *
     * @param eC2SecurityGroupName <p>
     *            Name of the EC2 security group to authorize. For VPC DB
     *            security groups, <code>EC2SecurityGroupId</code> must be
     *            provided. Otherwise, <code>EC2SecurityGroupOwnerId</code> and
     *            either <code>EC2SecurityGroupName</code> or
     *            <code>EC2SecurityGroupId</code> must be provided.
     *            </p>
     */
    public void setEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }

    /**
     * <p>
     * Name of the EC2 security group to authorize. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise,
     * <code>EC2SecurityGroupOwnerId</code> and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must
     * be provided.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eC2SecurityGroupName <p>
     *            Name of the EC2 security group to authorize. For VPC DB
     *            security groups, <code>EC2SecurityGroupId</code> must be
     *            provided. Otherwise, <code>EC2SecurityGroupOwnerId</code> and
     *            either <code>EC2SecurityGroupName</code> or
     *            <code>EC2SecurityGroupId</code> must be provided.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeDBSecurityGroupIngressRequest withEC2SecurityGroupName(
            String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
        return this;
    }

    /**
     * <p>
     * Id of the EC2 security group to authorize. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise,
     * <code>EC2SecurityGroupOwnerId</code> and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must
     * be provided.
     * </p>
     *
     * @return <p>
     *         Id of the EC2 security group to authorize. For VPC DB security
     *         groups, <code>EC2SecurityGroupId</code> must be provided.
     *         Otherwise, <code>EC2SecurityGroupOwnerId</code> and either
     *         <code>EC2SecurityGroupName</code> or
     *         <code>EC2SecurityGroupId</code> must be provided.
     *         </p>
     */
    public String getEC2SecurityGroupId() {
        return eC2SecurityGroupId;
    }

    /**
     * <p>
     * Id of the EC2 security group to authorize. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise,
     * <code>EC2SecurityGroupOwnerId</code> and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must
     * be provided.
     * </p>
     *
     * @param eC2SecurityGroupId <p>
     *            Id of the EC2 security group to authorize. For VPC DB security
     *            groups, <code>EC2SecurityGroupId</code> must be provided.
     *            Otherwise, <code>EC2SecurityGroupOwnerId</code> and either
     *            <code>EC2SecurityGroupName</code> or
     *            <code>EC2SecurityGroupId</code> must be provided.
     *            </p>
     */
    public void setEC2SecurityGroupId(String eC2SecurityGroupId) {
        this.eC2SecurityGroupId = eC2SecurityGroupId;
    }

    /**
     * <p>
     * Id of the EC2 security group to authorize. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise,
     * <code>EC2SecurityGroupOwnerId</code> and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must
     * be provided.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eC2SecurityGroupId <p>
     *            Id of the EC2 security group to authorize. For VPC DB security
     *            groups, <code>EC2SecurityGroupId</code> must be provided.
     *            Otherwise, <code>EC2SecurityGroupOwnerId</code> and either
     *            <code>EC2SecurityGroupName</code> or
     *            <code>EC2SecurityGroupId</code> must be provided.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeDBSecurityGroupIngressRequest withEC2SecurityGroupId(String eC2SecurityGroupId) {
        this.eC2SecurityGroupId = eC2SecurityGroupId;
        return this;
    }

    /**
     * <p>
     * AWS account number of the owner of the EC2 security group specified in
     * the <code>EC2SecurityGroupName</code> parameter. The AWS access key ID
     * isn't an acceptable value. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise,
     * <code>EC2SecurityGroupOwnerId</code> and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must
     * be provided.
     * </p>
     *
     * @return <p>
     *         AWS account number of the owner of the EC2 security group
     *         specified in the <code>EC2SecurityGroupName</code> parameter. The
     *         AWS access key ID isn't an acceptable value. For VPC DB security
     *         groups, <code>EC2SecurityGroupId</code> must be provided.
     *         Otherwise, <code>EC2SecurityGroupOwnerId</code> and either
     *         <code>EC2SecurityGroupName</code> or
     *         <code>EC2SecurityGroupId</code> must be provided.
     *         </p>
     */
    public String getEC2SecurityGroupOwnerId() {
        return eC2SecurityGroupOwnerId;
    }

    /**
     * <p>
     * AWS account number of the owner of the EC2 security group specified in
     * the <code>EC2SecurityGroupName</code> parameter. The AWS access key ID
     * isn't an acceptable value. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise,
     * <code>EC2SecurityGroupOwnerId</code> and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must
     * be provided.
     * </p>
     *
     * @param eC2SecurityGroupOwnerId <p>
     *            AWS account number of the owner of the EC2 security group
     *            specified in the <code>EC2SecurityGroupName</code> parameter.
     *            The AWS access key ID isn't an acceptable value. For VPC DB
     *            security groups, <code>EC2SecurityGroupId</code> must be
     *            provided. Otherwise, <code>EC2SecurityGroupOwnerId</code> and
     *            either <code>EC2SecurityGroupName</code> or
     *            <code>EC2SecurityGroupId</code> must be provided.
     *            </p>
     */
    public void setEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }

    /**
     * <p>
     * AWS account number of the owner of the EC2 security group specified in
     * the <code>EC2SecurityGroupName</code> parameter. The AWS access key ID
     * isn't an acceptable value. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise,
     * <code>EC2SecurityGroupOwnerId</code> and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must
     * be provided.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eC2SecurityGroupOwnerId <p>
     *            AWS account number of the owner of the EC2 security group
     *            specified in the <code>EC2SecurityGroupName</code> parameter.
     *            The AWS access key ID isn't an acceptable value. For VPC DB
     *            security groups, <code>EC2SecurityGroupId</code> must be
     *            provided. Otherwise, <code>EC2SecurityGroupOwnerId</code> and
     *            either <code>EC2SecurityGroupName</code> or
     *            <code>EC2SecurityGroupId</code> must be provided.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeDBSecurityGroupIngressRequest withEC2SecurityGroupOwnerId(
            String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
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
        if (getDBSecurityGroupName() != null)
            sb.append("DBSecurityGroupName: " + getDBSecurityGroupName() + ",");
        if (getCIDRIP() != null)
            sb.append("CIDRIP: " + getCIDRIP() + ",");
        if (getEC2SecurityGroupName() != null)
            sb.append("EC2SecurityGroupName: " + getEC2SecurityGroupName() + ",");
        if (getEC2SecurityGroupId() != null)
            sb.append("EC2SecurityGroupId: " + getEC2SecurityGroupId() + ",");
        if (getEC2SecurityGroupOwnerId() != null)
            sb.append("EC2SecurityGroupOwnerId: " + getEC2SecurityGroupOwnerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBSecurityGroupName() == null) ? 0 : getDBSecurityGroupName().hashCode());
        hashCode = prime * hashCode + ((getCIDRIP() == null) ? 0 : getCIDRIP().hashCode());
        hashCode = prime * hashCode
                + ((getEC2SecurityGroupName() == null) ? 0 : getEC2SecurityGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getEC2SecurityGroupId() == null) ? 0 : getEC2SecurityGroupId().hashCode());
        hashCode = prime
                * hashCode
                + ((getEC2SecurityGroupOwnerId() == null) ? 0 : getEC2SecurityGroupOwnerId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizeDBSecurityGroupIngressRequest == false)
            return false;
        AuthorizeDBSecurityGroupIngressRequest other = (AuthorizeDBSecurityGroupIngressRequest) obj;

        if (other.getDBSecurityGroupName() == null ^ this.getDBSecurityGroupName() == null)
            return false;
        if (other.getDBSecurityGroupName() != null
                && other.getDBSecurityGroupName().equals(this.getDBSecurityGroupName()) == false)
            return false;
        if (other.getCIDRIP() == null ^ this.getCIDRIP() == null)
            return false;
        if (other.getCIDRIP() != null && other.getCIDRIP().equals(this.getCIDRIP()) == false)
            return false;
        if (other.getEC2SecurityGroupName() == null ^ this.getEC2SecurityGroupName() == null)
            return false;
        if (other.getEC2SecurityGroupName() != null
                && other.getEC2SecurityGroupName().equals(this.getEC2SecurityGroupName()) == false)
            return false;
        if (other.getEC2SecurityGroupId() == null ^ this.getEC2SecurityGroupId() == null)
            return false;
        if (other.getEC2SecurityGroupId() != null
                && other.getEC2SecurityGroupId().equals(this.getEC2SecurityGroupId()) == false)
            return false;
        if (other.getEC2SecurityGroupOwnerId() == null ^ this.getEC2SecurityGroupOwnerId() == null)
            return false;
        if (other.getEC2SecurityGroupOwnerId() != null
                && other.getEC2SecurityGroupOwnerId().equals(this.getEC2SecurityGroupOwnerId()) == false)
            return false;
        return true;
    }
}
