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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Represents an EC2 instance provisioned as part of cluster.
 * </p>
 */
public class Instance implements Serializable {
    /**
     * <p>
     * The unique identifier for the instance in Amazon EMR.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The unique identifier of the instance in Amazon EC2.
     * </p>
     */
    private String ec2InstanceId;

    /**
     * <p>
     * The public DNS name of the instance.
     * </p>
     */
    private String publicDnsName;

    /**
     * <p>
     * The public IP address of the instance.
     * </p>
     */
    private String publicIpAddress;

    /**
     * <p>
     * The private DNS name of the instance.
     * </p>
     */
    private String privateDnsName;

    /**
     * <p>
     * The private IP address of the instance.
     * </p>
     */
    private String privateIpAddress;

    /**
     * <p>
     * The current status of the instance.
     * </p>
     */
    private InstanceStatus status;

    /**
     * <p>
     * The identifier of the instance group to which this instance belongs.
     * </p>
     */
    private String instanceGroupId;

    /**
     * <p>
     * The unique identifier of the instance fleet to which an EC2 instance
     * belongs.
     * </p>
     */
    private String instanceFleetId;

    /**
     * <p>
     * The instance purchasing option. Valid values are <code>ON_DEMAND</code>
     * or <code>SPOT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     */
    private String market;

    /**
     * <p>
     * The EC2 instance type, for example <code>m3.xlarge</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String instanceType;

    /**
     * <p>
     * The list of EBS volumes that are attached to this instance.
     * </p>
     */
    private java.util.List<EbsVolume> ebsVolumes;

    /**
     * <p>
     * The unique identifier for the instance in Amazon EMR.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the instance in Amazon EMR.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the instance in Amazon EMR.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the instance in Amazon EMR.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the instance in Amazon EMR.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the instance in Amazon EMR.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the instance in Amazon EC2.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the instance in Amazon EC2.
     *         </p>
     */
    public String getEc2InstanceId() {
        return ec2InstanceId;
    }

    /**
     * <p>
     * The unique identifier of the instance in Amazon EC2.
     * </p>
     *
     * @param ec2InstanceId <p>
     *            The unique identifier of the instance in Amazon EC2.
     *            </p>
     */
    public void setEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
    }

    /**
     * <p>
     * The unique identifier of the instance in Amazon EC2.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2InstanceId <p>
     *            The unique identifier of the instance in Amazon EC2.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
        return this;
    }

    /**
     * <p>
     * The public DNS name of the instance.
     * </p>
     *
     * @return <p>
     *         The public DNS name of the instance.
     *         </p>
     */
    public String getPublicDnsName() {
        return publicDnsName;
    }

    /**
     * <p>
     * The public DNS name of the instance.
     * </p>
     *
     * @param publicDnsName <p>
     *            The public DNS name of the instance.
     *            </p>
     */
    public void setPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
    }

    /**
     * <p>
     * The public DNS name of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicDnsName <p>
     *            The public DNS name of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
        return this;
    }

    /**
     * <p>
     * The public IP address of the instance.
     * </p>
     *
     * @return <p>
     *         The public IP address of the instance.
     *         </p>
     */
    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    /**
     * <p>
     * The public IP address of the instance.
     * </p>
     *
     * @param publicIpAddress <p>
     *            The public IP address of the instance.
     *            </p>
     */
    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    /**
     * <p>
     * The public IP address of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicIpAddress <p>
     *            The public IP address of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * <p>
     * The private DNS name of the instance.
     * </p>
     *
     * @return <p>
     *         The private DNS name of the instance.
     *         </p>
     */
    public String getPrivateDnsName() {
        return privateDnsName;
    }

    /**
     * <p>
     * The private DNS name of the instance.
     * </p>
     *
     * @param privateDnsName <p>
     *            The private DNS name of the instance.
     *            </p>
     */
    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    /**
     * <p>
     * The private DNS name of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateDnsName <p>
     *            The private DNS name of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
        return this;
    }

    /**
     * <p>
     * The private IP address of the instance.
     * </p>
     *
     * @return <p>
     *         The private IP address of the instance.
     *         </p>
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the instance.
     * </p>
     *
     * @param privateIpAddress <p>
     *            The private IP address of the instance.
     *            </p>
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddress <p>
     *            The private IP address of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * <p>
     * The current status of the instance.
     * </p>
     *
     * @return <p>
     *         The current status of the instance.
     *         </p>
     */
    public InstanceStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the instance.
     * </p>
     *
     * @param status <p>
     *            The current status of the instance.
     *            </p>
     */
    public void setStatus(InstanceStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current status of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withStatus(InstanceStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The identifier of the instance group to which this instance belongs.
     * </p>
     *
     * @return <p>
     *         The identifier of the instance group to which this instance
     *         belongs.
     *         </p>
     */
    public String getInstanceGroupId() {
        return instanceGroupId;
    }

    /**
     * <p>
     * The identifier of the instance group to which this instance belongs.
     * </p>
     *
     * @param instanceGroupId <p>
     *            The identifier of the instance group to which this instance
     *            belongs.
     *            </p>
     */
    public void setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
    }

    /**
     * <p>
     * The identifier of the instance group to which this instance belongs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceGroupId <p>
     *            The identifier of the instance group to which this instance
     *            belongs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet to which an EC2 instance
     * belongs.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the instance fleet to which an EC2
     *         instance belongs.
     *         </p>
     */
    public String getInstanceFleetId() {
        return instanceFleetId;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet to which an EC2 instance
     * belongs.
     * </p>
     *
     * @param instanceFleetId <p>
     *            The unique identifier of the instance fleet to which an EC2
     *            instance belongs.
     *            </p>
     */
    public void setInstanceFleetId(String instanceFleetId) {
        this.instanceFleetId = instanceFleetId;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet to which an EC2 instance
     * belongs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceFleetId <p>
     *            The unique identifier of the instance fleet to which an EC2
     *            instance belongs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withInstanceFleetId(String instanceFleetId) {
        this.instanceFleetId = instanceFleetId;
        return this;
    }

    /**
     * <p>
     * The instance purchasing option. Valid values are <code>ON_DEMAND</code>
     * or <code>SPOT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @return <p>
     *         The instance purchasing option. Valid values are
     *         <code>ON_DEMAND</code> or <code>SPOT</code>.
     *         </p>
     * @see MarketType
     */
    public String getMarket() {
        return market;
    }

    /**
     * <p>
     * The instance purchasing option. Valid values are <code>ON_DEMAND</code>
     * or <code>SPOT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market <p>
     *            The instance purchasing option. Valid values are
     *            <code>ON_DEMAND</code> or <code>SPOT</code>.
     *            </p>
     * @see MarketType
     */
    public void setMarket(String market) {
        this.market = market;
    }

    /**
     * <p>
     * The instance purchasing option. Valid values are <code>ON_DEMAND</code>
     * or <code>SPOT</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market <p>
     *            The instance purchasing option. Valid values are
     *            <code>ON_DEMAND</code> or <code>SPOT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MarketType
     */
    public Instance withMarket(String market) {
        this.market = market;
        return this;
    }

    /**
     * <p>
     * The instance purchasing option. Valid values are <code>ON_DEMAND</code>
     * or <code>SPOT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market <p>
     *            The instance purchasing option. Valid values are
     *            <code>ON_DEMAND</code> or <code>SPOT</code>.
     *            </p>
     * @see MarketType
     */
    public void setMarket(MarketType market) {
        this.market = market.toString();
    }

    /**
     * <p>
     * The instance purchasing option. Valid values are <code>ON_DEMAND</code>
     * or <code>SPOT</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market <p>
     *            The instance purchasing option. Valid values are
     *            <code>ON_DEMAND</code> or <code>SPOT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MarketType
     */
    public Instance withMarket(MarketType market) {
        this.market = market.toString();
        return this;
    }

    /**
     * <p>
     * The EC2 instance type, for example <code>m3.xlarge</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The EC2 instance type, for example <code>m3.xlarge</code>.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The EC2 instance type, for example <code>m3.xlarge</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceType <p>
     *            The EC2 instance type, for example <code>m3.xlarge</code>.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The EC2 instance type, for example <code>m3.xlarge</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceType <p>
     *            The EC2 instance type, for example <code>m3.xlarge</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The list of EBS volumes that are attached to this instance.
     * </p>
     *
     * @return <p>
     *         The list of EBS volumes that are attached to this instance.
     *         </p>
     */
    public java.util.List<EbsVolume> getEbsVolumes() {
        return ebsVolumes;
    }

    /**
     * <p>
     * The list of EBS volumes that are attached to this instance.
     * </p>
     *
     * @param ebsVolumes <p>
     *            The list of EBS volumes that are attached to this instance.
     *            </p>
     */
    public void setEbsVolumes(java.util.Collection<EbsVolume> ebsVolumes) {
        if (ebsVolumes == null) {
            this.ebsVolumes = null;
            return;
        }

        this.ebsVolumes = new java.util.ArrayList<EbsVolume>(ebsVolumes);
    }

    /**
     * <p>
     * The list of EBS volumes that are attached to this instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsVolumes <p>
     *            The list of EBS volumes that are attached to this instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withEbsVolumes(EbsVolume... ebsVolumes) {
        if (getEbsVolumes() == null) {
            this.ebsVolumes = new java.util.ArrayList<EbsVolume>(ebsVolumes.length);
        }
        for (EbsVolume value : ebsVolumes) {
            this.ebsVolumes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of EBS volumes that are attached to this instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsVolumes <p>
     *            The list of EBS volumes that are attached to this instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withEbsVolumes(java.util.Collection<EbsVolume> ebsVolumes) {
        setEbsVolumes(ebsVolumes);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getEc2InstanceId() != null)
            sb.append("Ec2InstanceId: " + getEc2InstanceId() + ",");
        if (getPublicDnsName() != null)
            sb.append("PublicDnsName: " + getPublicDnsName() + ",");
        if (getPublicIpAddress() != null)
            sb.append("PublicIpAddress: " + getPublicIpAddress() + ",");
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: " + getPrivateDnsName() + ",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getInstanceGroupId() != null)
            sb.append("InstanceGroupId: " + getInstanceGroupId() + ",");
        if (getInstanceFleetId() != null)
            sb.append("InstanceFleetId: " + getInstanceFleetId() + ",");
        if (getMarket() != null)
            sb.append("Market: " + getMarket() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getEbsVolumes() != null)
            sb.append("EbsVolumes: " + getEbsVolumes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getEc2InstanceId() == null) ? 0 : getEc2InstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getPublicDnsName() == null) ? 0 : getPublicDnsName().hashCode());
        hashCode = prime * hashCode
                + ((getPublicIpAddress() == null) ? 0 : getPublicIpAddress().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceGroupId() == null) ? 0 : getInstanceGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceFleetId() == null) ? 0 : getInstanceFleetId().hashCode());
        hashCode = prime * hashCode + ((getMarket() == null) ? 0 : getMarket().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getEbsVolumes() == null) ? 0 : getEbsVolumes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Instance == false)
            return false;
        Instance other = (Instance) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getEc2InstanceId() == null ^ this.getEc2InstanceId() == null)
            return false;
        if (other.getEc2InstanceId() != null
                && other.getEc2InstanceId().equals(this.getEc2InstanceId()) == false)
            return false;
        if (other.getPublicDnsName() == null ^ this.getPublicDnsName() == null)
            return false;
        if (other.getPublicDnsName() != null
                && other.getPublicDnsName().equals(this.getPublicDnsName()) == false)
            return false;
        if (other.getPublicIpAddress() == null ^ this.getPublicIpAddress() == null)
            return false;
        if (other.getPublicIpAddress() != null
                && other.getPublicIpAddress().equals(this.getPublicIpAddress()) == false)
            return false;
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null)
            return false;
        if (other.getPrivateDnsName() != null
                && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null
                && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getInstanceGroupId() == null ^ this.getInstanceGroupId() == null)
            return false;
        if (other.getInstanceGroupId() != null
                && other.getInstanceGroupId().equals(this.getInstanceGroupId()) == false)
            return false;
        if (other.getInstanceFleetId() == null ^ this.getInstanceFleetId() == null)
            return false;
        if (other.getInstanceFleetId() != null
                && other.getInstanceFleetId().equals(this.getInstanceFleetId()) == false)
            return false;
        if (other.getMarket() == null ^ this.getMarket() == null)
            return false;
        if (other.getMarket() != null && other.getMarket().equals(this.getMarket()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getEbsVolumes() == null ^ this.getEbsVolumes() == null)
            return false;
        if (other.getEbsVolumes() != null
                && other.getEbsVolumes().equals(this.getEbsVolumes()) == false)
            return false;
        return true;
    }
}
