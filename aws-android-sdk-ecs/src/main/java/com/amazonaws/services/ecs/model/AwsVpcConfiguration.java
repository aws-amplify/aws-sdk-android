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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * An object representing the networking details for a task or service.
 * </p>
 */
public class AwsVpcConfiguration implements Serializable {
    /**
     * <p>
     * The subnets associated with the task or service. There is a limit of 16
     * subnets that can be specified per <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified subnets must be from the same VPC.
     * </p>
     * </note>
     */
    private java.util.List<String> subnets;

    /**
     * <p>
     * The security groups associated with the task or service. If you do not
     * specify a security group, the default security group for the VPC is used.
     * There is a limit of 5 security groups that can be specified per
     * <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified security groups must be from the same VPC.
     * </p>
     * </note>
     */
    private java.util.List<String> securityGroups;

    /**
     * <p>
     * Whether the task's elastic network interface receives a public IP
     * address. The default value is <code>DISABLED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String assignPublicIp;

    /**
     * <p>
     * The subnets associated with the task or service. There is a limit of 16
     * subnets that can be specified per <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified subnets must be from the same VPC.
     * </p>
     * </note>
     *
     * @return <p>
     *         The subnets associated with the task or service. There is a limit
     *         of 16 subnets that can be specified per
     *         <code>AwsVpcConfiguration</code>.
     *         </p>
     *         <note>
     *         <p>
     *         All specified subnets must be from the same VPC.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The subnets associated with the task or service. There is a limit of 16
     * subnets that can be specified per <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified subnets must be from the same VPC.
     * </p>
     * </note>
     *
     * @param subnets <p>
     *            The subnets associated with the task or service. There is a
     *            limit of 16 subnets that can be specified per
     *            <code>AwsVpcConfiguration</code>.
     *            </p>
     *            <note>
     *            <p>
     *            All specified subnets must be from the same VPC.
     *            </p>
     *            </note>
     */
    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<String>(subnets);
    }

    /**
     * <p>
     * The subnets associated with the task or service. There is a limit of 16
     * subnets that can be specified per <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified subnets must be from the same VPC.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            The subnets associated with the task or service. There is a
     *            limit of 16 subnets that can be specified per
     *            <code>AwsVpcConfiguration</code>.
     *            </p>
     *            <note>
     *            <p>
     *            All specified subnets must be from the same VPC.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsVpcConfiguration withSubnets(String... subnets) {
        if (getSubnets() == null) {
            this.subnets = new java.util.ArrayList<String>(subnets.length);
        }
        for (String value : subnets) {
            this.subnets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The subnets associated with the task or service. There is a limit of 16
     * subnets that can be specified per <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified subnets must be from the same VPC.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            The subnets associated with the task or service. There is a
     *            limit of 16 subnets that can be specified per
     *            <code>AwsVpcConfiguration</code>.
     *            </p>
     *            <note>
     *            <p>
     *            All specified subnets must be from the same VPC.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsVpcConfiguration withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The security groups associated with the task or service. If you do not
     * specify a security group, the default security group for the VPC is used.
     * There is a limit of 5 security groups that can be specified per
     * <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified security groups must be from the same VPC.
     * </p>
     * </note>
     *
     * @return <p>
     *         The security groups associated with the task or service. If you
     *         do not specify a security group, the default security group for
     *         the VPC is used. There is a limit of 5 security groups that can
     *         be specified per <code>AwsVpcConfiguration</code>.
     *         </p>
     *         <note>
     *         <p>
     *         All specified security groups must be from the same VPC.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The security groups associated with the task or service. If you do not
     * specify a security group, the default security group for the VPC is used.
     * There is a limit of 5 security groups that can be specified per
     * <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified security groups must be from the same VPC.
     * </p>
     * </note>
     *
     * @param securityGroups <p>
     *            The security groups associated with the task or service. If
     *            you do not specify a security group, the default security
     *            group for the VPC is used. There is a limit of 5 security
     *            groups that can be specified per
     *            <code>AwsVpcConfiguration</code>.
     *            </p>
     *            <note>
     *            <p>
     *            All specified security groups must be from the same VPC.
     *            </p>
     *            </note>
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * The security groups associated with the task or service. If you do not
     * specify a security group, the default security group for the VPC is used.
     * There is a limit of 5 security groups that can be specified per
     * <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified security groups must be from the same VPC.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The security groups associated with the task or service. If
     *            you do not specify a security group, the default security
     *            group for the VPC is used. There is a limit of 5 security
     *            groups that can be specified per
     *            <code>AwsVpcConfiguration</code>.
     *            </p>
     *            <note>
     *            <p>
     *            All specified security groups must be from the same VPC.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsVpcConfiguration withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) {
            this.securityGroups = new java.util.ArrayList<String>(securityGroups.length);
        }
        for (String value : securityGroups) {
            this.securityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The security groups associated with the task or service. If you do not
     * specify a security group, the default security group for the VPC is used.
     * There is a limit of 5 security groups that can be specified per
     * <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified security groups must be from the same VPC.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The security groups associated with the task or service. If
     *            you do not specify a security group, the default security
     *            group for the VPC is used. There is a limit of 5 security
     *            groups that can be specified per
     *            <code>AwsVpcConfiguration</code>.
     *            </p>
     *            <note>
     *            <p>
     *            All specified security groups must be from the same VPC.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsVpcConfiguration withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * Whether the task's elastic network interface receives a public IP
     * address. The default value is <code>DISABLED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         Whether the task's elastic network interface receives a public IP
     *         address. The default value is <code>DISABLED</code>.
     *         </p>
     * @see AssignPublicIp
     */
    public String getAssignPublicIp() {
        return assignPublicIp;
    }

    /**
     * <p>
     * Whether the task's elastic network interface receives a public IP
     * address. The default value is <code>DISABLED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param assignPublicIp <p>
     *            Whether the task's elastic network interface receives a public
     *            IP address. The default value is <code>DISABLED</code>.
     *            </p>
     * @see AssignPublicIp
     */
    public void setAssignPublicIp(String assignPublicIp) {
        this.assignPublicIp = assignPublicIp;
    }

    /**
     * <p>
     * Whether the task's elastic network interface receives a public IP
     * address. The default value is <code>DISABLED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param assignPublicIp <p>
     *            Whether the task's elastic network interface receives a public
     *            IP address. The default value is <code>DISABLED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssignPublicIp
     */
    public AwsVpcConfiguration withAssignPublicIp(String assignPublicIp) {
        this.assignPublicIp = assignPublicIp;
        return this;
    }

    /**
     * <p>
     * Whether the task's elastic network interface receives a public IP
     * address. The default value is <code>DISABLED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param assignPublicIp <p>
     *            Whether the task's elastic network interface receives a public
     *            IP address. The default value is <code>DISABLED</code>.
     *            </p>
     * @see AssignPublicIp
     */
    public void setAssignPublicIp(AssignPublicIp assignPublicIp) {
        this.assignPublicIp = assignPublicIp.toString();
    }

    /**
     * <p>
     * Whether the task's elastic network interface receives a public IP
     * address. The default value is <code>DISABLED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param assignPublicIp <p>
     *            Whether the task's elastic network interface receives a public
     *            IP address. The default value is <code>DISABLED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssignPublicIp
     */
    public AwsVpcConfiguration withAssignPublicIp(AssignPublicIp assignPublicIp) {
        this.assignPublicIp = assignPublicIp.toString();
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
        if (getSubnets() != null)
            sb.append("subnets: " + getSubnets() + ",");
        if (getSecurityGroups() != null)
            sb.append("securityGroups: " + getSecurityGroups() + ",");
        if (getAssignPublicIp() != null)
            sb.append("assignPublicIp: " + getAssignPublicIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getAssignPublicIp() == null) ? 0 : getAssignPublicIp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsVpcConfiguration == false)
            return false;
        AwsVpcConfiguration other = (AwsVpcConfiguration) obj;

        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getAssignPublicIp() == null ^ this.getAssignPublicIp() == null)
            return false;
        if (other.getAssignPublicIp() != null
                && other.getAssignPublicIp().equals(this.getAssignPublicIp()) == false)
            return false;
        return true;
    }
}
