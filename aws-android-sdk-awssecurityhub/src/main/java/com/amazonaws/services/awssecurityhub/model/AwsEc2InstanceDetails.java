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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * The details of an Amazon EC2 instance.
 * </p>
 */
public class AwsEc2InstanceDetails implements Serializable {
    /**
     * <p>
     * The instance type of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String type;

    /**
     * <p>
     * The Amazon Machine Image (AMI) ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String imageId;

    /**
     * <p>
     * The IPv4 addresses associated with the instance.
     * </p>
     */
    private java.util.List<String> ipV4Addresses;

    /**
     * <p>
     * The IPv6 addresses associated with the instance.
     * </p>
     */
    private java.util.List<String> ipV6Addresses;

    /**
     * <p>
     * The key name associated with the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String keyName;

    /**
     * <p>
     * The IAM profile ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String iamInstanceProfileArn;

    /**
     * <p>
     * The identifier of the VPC that the instance was launched in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String vpcId;

    /**
     * <p>
     * The identifier of the subnet that the instance was launched in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String subnetId;

    /**
     * <p>
     * The date/time the instance was launched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String launchedAt;

    /**
     * <p>
     * The instance type of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The instance type of the instance.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The instance type of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param type <p>
     *            The instance type of the instance.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The instance type of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param type <p>
     *            The instance type of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2InstanceDetails withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Machine Image (AMI) ID of the instance.
     *         </p>
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param imageId <p>
     *            The Amazon Machine Image (AMI) ID of the instance.
     *            </p>
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) ID of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param imageId <p>
     *            The Amazon Machine Image (AMI) ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2InstanceDetails withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * <p>
     * The IPv4 addresses associated with the instance.
     * </p>
     *
     * @return <p>
     *         The IPv4 addresses associated with the instance.
     *         </p>
     */
    public java.util.List<String> getIpV4Addresses() {
        return ipV4Addresses;
    }

    /**
     * <p>
     * The IPv4 addresses associated with the instance.
     * </p>
     *
     * @param ipV4Addresses <p>
     *            The IPv4 addresses associated with the instance.
     *            </p>
     */
    public void setIpV4Addresses(java.util.Collection<String> ipV4Addresses) {
        if (ipV4Addresses == null) {
            this.ipV4Addresses = null;
            return;
        }

        this.ipV4Addresses = new java.util.ArrayList<String>(ipV4Addresses);
    }

    /**
     * <p>
     * The IPv4 addresses associated with the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipV4Addresses <p>
     *            The IPv4 addresses associated with the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2InstanceDetails withIpV4Addresses(String... ipV4Addresses) {
        if (getIpV4Addresses() == null) {
            this.ipV4Addresses = new java.util.ArrayList<String>(ipV4Addresses.length);
        }
        for (String value : ipV4Addresses) {
            this.ipV4Addresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IPv4 addresses associated with the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipV4Addresses <p>
     *            The IPv4 addresses associated with the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2InstanceDetails withIpV4Addresses(java.util.Collection<String> ipV4Addresses) {
        setIpV4Addresses(ipV4Addresses);
        return this;
    }

    /**
     * <p>
     * The IPv6 addresses associated with the instance.
     * </p>
     *
     * @return <p>
     *         The IPv6 addresses associated with the instance.
     *         </p>
     */
    public java.util.List<String> getIpV6Addresses() {
        return ipV6Addresses;
    }

    /**
     * <p>
     * The IPv6 addresses associated with the instance.
     * </p>
     *
     * @param ipV6Addresses <p>
     *            The IPv6 addresses associated with the instance.
     *            </p>
     */
    public void setIpV6Addresses(java.util.Collection<String> ipV6Addresses) {
        if (ipV6Addresses == null) {
            this.ipV6Addresses = null;
            return;
        }

        this.ipV6Addresses = new java.util.ArrayList<String>(ipV6Addresses);
    }

    /**
     * <p>
     * The IPv6 addresses associated with the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipV6Addresses <p>
     *            The IPv6 addresses associated with the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2InstanceDetails withIpV6Addresses(String... ipV6Addresses) {
        if (getIpV6Addresses() == null) {
            this.ipV6Addresses = new java.util.ArrayList<String>(ipV6Addresses.length);
        }
        for (String value : ipV6Addresses) {
            this.ipV6Addresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IPv6 addresses associated with the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipV6Addresses <p>
     *            The IPv6 addresses associated with the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2InstanceDetails withIpV6Addresses(java.util.Collection<String> ipV6Addresses) {
        setIpV6Addresses(ipV6Addresses);
        return this;
    }

    /**
     * <p>
     * The key name associated with the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The key name associated with the instance.
     *         </p>
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * <p>
     * The key name associated with the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param keyName <p>
     *            The key name associated with the instance.
     *            </p>
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The key name associated with the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param keyName <p>
     *            The key name associated with the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2InstanceDetails withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * <p>
     * The IAM profile ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The IAM profile ARN of the instance.
     *         </p>
     */
    public String getIamInstanceProfileArn() {
        return iamInstanceProfileArn;
    }

    /**
     * <p>
     * The IAM profile ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param iamInstanceProfileArn <p>
     *            The IAM profile ARN of the instance.
     *            </p>
     */
    public void setIamInstanceProfileArn(String iamInstanceProfileArn) {
        this.iamInstanceProfileArn = iamInstanceProfileArn;
    }

    /**
     * <p>
     * The IAM profile ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param iamInstanceProfileArn <p>
     *            The IAM profile ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2InstanceDetails withIamInstanceProfileArn(String iamInstanceProfileArn) {
        this.iamInstanceProfileArn = iamInstanceProfileArn;
        return this;
    }

    /**
     * <p>
     * The identifier of the VPC that the instance was launched in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The identifier of the VPC that the instance was launched in.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC that the instance was launched in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param vpcId <p>
     *            The identifier of the VPC that the instance was launched in.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC that the instance was launched in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param vpcId <p>
     *            The identifier of the VPC that the instance was launched in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2InstanceDetails withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The identifier of the subnet that the instance was launched in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The identifier of the subnet that the instance was launched in.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The identifier of the subnet that the instance was launched in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param subnetId <p>
     *            The identifier of the subnet that the instance was launched
     *            in.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The identifier of the subnet that the instance was launched in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param subnetId <p>
     *            The identifier of the subnet that the instance was launched
     *            in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2InstanceDetails withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * <p>
     * The date/time the instance was launched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The date/time the instance was launched.
     *         </p>
     */
    public String getLaunchedAt() {
        return launchedAt;
    }

    /**
     * <p>
     * The date/time the instance was launched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param launchedAt <p>
     *            The date/time the instance was launched.
     *            </p>
     */
    public void setLaunchedAt(String launchedAt) {
        this.launchedAt = launchedAt;
    }

    /**
     * <p>
     * The date/time the instance was launched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param launchedAt <p>
     *            The date/time the instance was launched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2InstanceDetails withLaunchedAt(String launchedAt) {
        this.launchedAt = launchedAt;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getIpV4Addresses() != null)
            sb.append("IpV4Addresses: " + getIpV4Addresses() + ",");
        if (getIpV6Addresses() != null)
            sb.append("IpV6Addresses: " + getIpV6Addresses() + ",");
        if (getKeyName() != null)
            sb.append("KeyName: " + getKeyName() + ",");
        if (getIamInstanceProfileArn() != null)
            sb.append("IamInstanceProfileArn: " + getIamInstanceProfileArn() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getLaunchedAt() != null)
            sb.append("LaunchedAt: " + getLaunchedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode
                + ((getIpV4Addresses() == null) ? 0 : getIpV4Addresses().hashCode());
        hashCode = prime * hashCode
                + ((getIpV6Addresses() == null) ? 0 : getIpV6Addresses().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime
                * hashCode
                + ((getIamInstanceProfileArn() == null) ? 0 : getIamInstanceProfileArn().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getLaunchedAt() == null) ? 0 : getLaunchedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2InstanceDetails == false)
            return false;
        AwsEc2InstanceDetails other = (AwsEc2InstanceDetails) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getIpV4Addresses() == null ^ this.getIpV4Addresses() == null)
            return false;
        if (other.getIpV4Addresses() != null
                && other.getIpV4Addresses().equals(this.getIpV4Addresses()) == false)
            return false;
        if (other.getIpV6Addresses() == null ^ this.getIpV6Addresses() == null)
            return false;
        if (other.getIpV6Addresses() != null
                && other.getIpV6Addresses().equals(this.getIpV6Addresses()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getIamInstanceProfileArn() == null ^ this.getIamInstanceProfileArn() == null)
            return false;
        if (other.getIamInstanceProfileArn() != null
                && other.getIamInstanceProfileArn().equals(this.getIamInstanceProfileArn()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getLaunchedAt() == null ^ this.getLaunchedAt() == null)
            return false;
        if (other.getLaunchedAt() != null
                && other.getLaunchedAt().equals(this.getLaunchedAt()) == false)
            return false;
        return true;
    }
}
