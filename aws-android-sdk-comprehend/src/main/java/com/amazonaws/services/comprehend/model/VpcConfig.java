/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration parameters for an optional private Virtual Private Cloud (VPC)
 * containing the resources you are using for the job. For more information, see
 * <a href=
 * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
 * >Amazon VPC</a>.
 * </p>
 */
public class VpcConfig implements Serializable {
    /**
     * <p>
     * The ID number for a security group on an instance of your private VPC.
     * Security groups on your VPC function serve as a virtual firewall to
     * control inbound and outbound traffic and provides security for the
     * resources that you’ll be accessing on the VPC. This ID number is preceded
     * by "sg-", for instance: "sg-03b388029b0a285ea". For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html"
     * >Security Groups for your VPC</a>.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * The ID for each subnet being used in your private VPC. This subnet is a
     * subset of the a range of IPv4 addresses used by the VPC and is specific
     * to a given availability zone in the VPC’s region. This ID number is
     * preceded by "subnet-", for instance: "subnet-04ccf456919e69055". For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs
     * and Subnets</a>.
     * </p>
     */
    private java.util.List<String> subnets;

    /**
     * <p>
     * The ID number for a security group on an instance of your private VPC.
     * Security groups on your VPC function serve as a virtual firewall to
     * control inbound and outbound traffic and provides security for the
     * resources that you’ll be accessing on the VPC. This ID number is preceded
     * by "sg-", for instance: "sg-03b388029b0a285ea". For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html"
     * >Security Groups for your VPC</a>.
     * </p>
     *
     * @return <p>
     *         The ID number for a security group on an instance of your private
     *         VPC. Security groups on your VPC function serve as a virtual
     *         firewall to control inbound and outbound traffic and provides
     *         security for the resources that you’ll be accessing on the VPC.
     *         This ID number is preceded by "sg-", for instance:
     *         "sg-03b388029b0a285ea". For more information, see <a href=
     *         "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html"
     *         >Security Groups for your VPC</a>.
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The ID number for a security group on an instance of your private VPC.
     * Security groups on your VPC function serve as a virtual firewall to
     * control inbound and outbound traffic and provides security for the
     * resources that you’ll be accessing on the VPC. This ID number is preceded
     * by "sg-", for instance: "sg-03b388029b0a285ea". For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html"
     * >Security Groups for your VPC</a>.
     * </p>
     *
     * @param securityGroupIds <p>
     *            The ID number for a security group on an instance of your
     *            private VPC. Security groups on your VPC function serve as a
     *            virtual firewall to control inbound and outbound traffic and
     *            provides security for the resources that you’ll be accessing
     *            on the VPC. This ID number is preceded by "sg-", for instance:
     *            "sg-03b388029b0a285ea". For more information, see <a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html"
     *            >Security Groups for your VPC</a>.
     *            </p>
     */
    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The ID number for a security group on an instance of your private VPC.
     * Security groups on your VPC function serve as a virtual firewall to
     * control inbound and outbound traffic and provides security for the
     * resources that you’ll be accessing on the VPC. This ID number is preceded
     * by "sg-", for instance: "sg-03b388029b0a285ea". For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html"
     * >Security Groups for your VPC</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The ID number for a security group on an instance of your
     *            private VPC. Security groups on your VPC function serve as a
     *            virtual firewall to control inbound and outbound traffic and
     *            provides security for the resources that you’ll be accessing
     *            on the VPC. This ID number is preceded by "sg-", for instance:
     *            "sg-03b388029b0a285ea". For more information, see <a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html"
     *            >Security Groups for your VPC</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcConfig withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) {
            this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds.length);
        }
        for (String value : securityGroupIds) {
            this.securityGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ID number for a security group on an instance of your private VPC.
     * Security groups on your VPC function serve as a virtual firewall to
     * control inbound and outbound traffic and provides security for the
     * resources that you’ll be accessing on the VPC. This ID number is preceded
     * by "sg-", for instance: "sg-03b388029b0a285ea". For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html"
     * >Security Groups for your VPC</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The ID number for a security group on an instance of your
     *            private VPC. Security groups on your VPC function serve as a
     *            virtual firewall to control inbound and outbound traffic and
     *            provides security for the resources that you’ll be accessing
     *            on the VPC. This ID number is preceded by "sg-", for instance:
     *            "sg-03b388029b0a285ea". For more information, see <a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html"
     *            >Security Groups for your VPC</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcConfig withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The ID for each subnet being used in your private VPC. This subnet is a
     * subset of the a range of IPv4 addresses used by the VPC and is specific
     * to a given availability zone in the VPC’s region. This ID number is
     * preceded by "subnet-", for instance: "subnet-04ccf456919e69055". For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs
     * and Subnets</a>.
     * </p>
     *
     * @return <p>
     *         The ID for each subnet being used in your private VPC. This
     *         subnet is a subset of the a range of IPv4 addresses used by the
     *         VPC and is specific to a given availability zone in the VPC’s
     *         region. This ID number is preceded by "subnet-", for instance:
     *         "subnet-04ccf456919e69055". For more information, see <a href=
     *         "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     *         >VPCs and Subnets</a>.
     *         </p>
     */
    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The ID for each subnet being used in your private VPC. This subnet is a
     * subset of the a range of IPv4 addresses used by the VPC and is specific
     * to a given availability zone in the VPC’s region. This ID number is
     * preceded by "subnet-", for instance: "subnet-04ccf456919e69055". For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs
     * and Subnets</a>.
     * </p>
     *
     * @param subnets <p>
     *            The ID for each subnet being used in your private VPC. This
     *            subnet is a subset of the a range of IPv4 addresses used by
     *            the VPC and is specific to a given availability zone in the
     *            VPC’s region. This ID number is preceded by "subnet-", for
     *            instance: "subnet-04ccf456919e69055". For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     *            >VPCs and Subnets</a>.
     *            </p>
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
     * The ID for each subnet being used in your private VPC. This subnet is a
     * subset of the a range of IPv4 addresses used by the VPC and is specific
     * to a given availability zone in the VPC’s region. This ID number is
     * preceded by "subnet-", for instance: "subnet-04ccf456919e69055". For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs
     * and Subnets</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            The ID for each subnet being used in your private VPC. This
     *            subnet is a subset of the a range of IPv4 addresses used by
     *            the VPC and is specific to a given availability zone in the
     *            VPC’s region. This ID number is preceded by "subnet-", for
     *            instance: "subnet-04ccf456919e69055". For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     *            >VPCs and Subnets</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcConfig withSubnets(String... subnets) {
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
     * The ID for each subnet being used in your private VPC. This subnet is a
     * subset of the a range of IPv4 addresses used by the VPC and is specific
     * to a given availability zone in the VPC’s region. This ID number is
     * preceded by "subnet-", for instance: "subnet-04ccf456919e69055". For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs
     * and Subnets</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            The ID for each subnet being used in your private VPC. This
     *            subnet is a subset of the a range of IPv4 addresses used by
     *            the VPC and is specific to a given availability zone in the
     *            VPC’s region. This ID number is preceded by "subnet-", for
     *            instance: "subnet-04ccf456919e69055". For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     *            >VPCs and Subnets</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcConfig withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
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
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getSubnets() != null)
            sb.append("Subnets: " + getSubnets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcConfig == false)
            return false;
        VpcConfig other = (VpcConfig) obj;

        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null
                && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        return true;
    }
}
