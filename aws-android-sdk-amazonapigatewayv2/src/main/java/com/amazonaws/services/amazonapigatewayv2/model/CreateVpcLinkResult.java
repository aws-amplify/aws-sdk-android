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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.io.Serializable;

public class CreateVpcLinkResult implements Serializable {
    /**
     * <p>
     * The timestamp when the VPC link was created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The name of the VPC link.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A list of security group IDs for the VPC link.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * A list of subnet IDs to include in the VPC link.
     * </p>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * Tags for the VPC link.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the VPC link.
     * </p>
     */
    private String vpcLinkId;

    /**
     * <p>
     * The status of the VPC link.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, AVAILABLE, DELETING, FAILED, INACTIVE
     */
    private String vpcLinkStatus;

    /**
     * <p>
     * A message summarizing the cause of the status of the VPC link.
     * </p>
     */
    private String vpcLinkStatusMessage;

    /**
     * <p>
     * The version of the VPC link.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V2
     */
    private String vpcLinkVersion;

    /**
     * <p>
     * The timestamp when the VPC link was created.
     * </p>
     *
     * @return <p>
     *         The timestamp when the VPC link was created.
     *         </p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * The timestamp when the VPC link was created.
     * </p>
     *
     * @param createdDate <p>
     *            The timestamp when the VPC link was created.
     *            </p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The timestamp when the VPC link was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdDate <p>
     *            The timestamp when the VPC link was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcLinkResult withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>
     * The name of the VPC link.
     * </p>
     *
     * @return <p>
     *         The name of the VPC link.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the VPC link.
     * </p>
     *
     * @param name <p>
     *            The name of the VPC link.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the VPC link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the VPC link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcLinkResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A list of security group IDs for the VPC link.
     * </p>
     *
     * @return <p>
     *         A list of security group IDs for the VPC link.
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of security group IDs for the VPC link.
     * </p>
     *
     * @param securityGroupIds <p>
     *            A list of security group IDs for the VPC link.
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
     * A list of security group IDs for the VPC link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            A list of security group IDs for the VPC link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcLinkResult withSecurityGroupIds(String... securityGroupIds) {
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
     * A list of security group IDs for the VPC link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            A list of security group IDs for the VPC link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcLinkResult withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * A list of subnet IDs to include in the VPC link.
     * </p>
     *
     * @return <p>
     *         A list of subnet IDs to include in the VPC link.
     *         </p>
     */
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * A list of subnet IDs to include in the VPC link.
     * </p>
     *
     * @param subnetIds <p>
     *            A list of subnet IDs to include in the VPC link.
     *            </p>
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * A list of subnet IDs to include in the VPC link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            A list of subnet IDs to include in the VPC link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcLinkResult withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) {
            this.subnetIds = new java.util.ArrayList<String>(subnetIds.length);
        }
        for (String value : subnetIds) {
            this.subnetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of subnet IDs to include in the VPC link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            A list of subnet IDs to include in the VPC link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcLinkResult withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * Tags for the VPC link.
     * </p>
     *
     * @return <p>
     *         Tags for the VPC link.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags for the VPC link.
     * </p>
     *
     * @param tags <p>
     *            Tags for the VPC link.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags for the VPC link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags for the VPC link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcLinkResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * Tags for the VPC link.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcLinkResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateVpcLinkResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The ID of the VPC link.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC link.
     *         </p>
     */
    public String getVpcLinkId() {
        return vpcLinkId;
    }

    /**
     * <p>
     * The ID of the VPC link.
     * </p>
     *
     * @param vpcLinkId <p>
     *            The ID of the VPC link.
     *            </p>
     */
    public void setVpcLinkId(String vpcLinkId) {
        this.vpcLinkId = vpcLinkId;
    }

    /**
     * <p>
     * The ID of the VPC link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcLinkId <p>
     *            The ID of the VPC link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcLinkResult withVpcLinkId(String vpcLinkId) {
        this.vpcLinkId = vpcLinkId;
        return this;
    }

    /**
     * <p>
     * The status of the VPC link.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, AVAILABLE, DELETING, FAILED, INACTIVE
     *
     * @return <p>
     *         The status of the VPC link.
     *         </p>
     * @see VpcLinkStatus
     */
    public String getVpcLinkStatus() {
        return vpcLinkStatus;
    }

    /**
     * <p>
     * The status of the VPC link.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, AVAILABLE, DELETING, FAILED, INACTIVE
     *
     * @param vpcLinkStatus <p>
     *            The status of the VPC link.
     *            </p>
     * @see VpcLinkStatus
     */
    public void setVpcLinkStatus(String vpcLinkStatus) {
        this.vpcLinkStatus = vpcLinkStatus;
    }

    /**
     * <p>
     * The status of the VPC link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, AVAILABLE, DELETING, FAILED, INACTIVE
     *
     * @param vpcLinkStatus <p>
     *            The status of the VPC link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpcLinkStatus
     */
    public CreateVpcLinkResult withVpcLinkStatus(String vpcLinkStatus) {
        this.vpcLinkStatus = vpcLinkStatus;
        return this;
    }

    /**
     * <p>
     * The status of the VPC link.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, AVAILABLE, DELETING, FAILED, INACTIVE
     *
     * @param vpcLinkStatus <p>
     *            The status of the VPC link.
     *            </p>
     * @see VpcLinkStatus
     */
    public void setVpcLinkStatus(VpcLinkStatus vpcLinkStatus) {
        this.vpcLinkStatus = vpcLinkStatus.toString();
    }

    /**
     * <p>
     * The status of the VPC link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, AVAILABLE, DELETING, FAILED, INACTIVE
     *
     * @param vpcLinkStatus <p>
     *            The status of the VPC link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpcLinkStatus
     */
    public CreateVpcLinkResult withVpcLinkStatus(VpcLinkStatus vpcLinkStatus) {
        this.vpcLinkStatus = vpcLinkStatus.toString();
        return this;
    }

    /**
     * <p>
     * A message summarizing the cause of the status of the VPC link.
     * </p>
     *
     * @return <p>
     *         A message summarizing the cause of the status of the VPC link.
     *         </p>
     */
    public String getVpcLinkStatusMessage() {
        return vpcLinkStatusMessage;
    }

    /**
     * <p>
     * A message summarizing the cause of the status of the VPC link.
     * </p>
     *
     * @param vpcLinkStatusMessage <p>
     *            A message summarizing the cause of the status of the VPC link.
     *            </p>
     */
    public void setVpcLinkStatusMessage(String vpcLinkStatusMessage) {
        this.vpcLinkStatusMessage = vpcLinkStatusMessage;
    }

    /**
     * <p>
     * A message summarizing the cause of the status of the VPC link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcLinkStatusMessage <p>
     *            A message summarizing the cause of the status of the VPC link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcLinkResult withVpcLinkStatusMessage(String vpcLinkStatusMessage) {
        this.vpcLinkStatusMessage = vpcLinkStatusMessage;
        return this;
    }

    /**
     * <p>
     * The version of the VPC link.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V2
     *
     * @return <p>
     *         The version of the VPC link.
     *         </p>
     * @see VpcLinkVersion
     */
    public String getVpcLinkVersion() {
        return vpcLinkVersion;
    }

    /**
     * <p>
     * The version of the VPC link.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V2
     *
     * @param vpcLinkVersion <p>
     *            The version of the VPC link.
     *            </p>
     * @see VpcLinkVersion
     */
    public void setVpcLinkVersion(String vpcLinkVersion) {
        this.vpcLinkVersion = vpcLinkVersion;
    }

    /**
     * <p>
     * The version of the VPC link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V2
     *
     * @param vpcLinkVersion <p>
     *            The version of the VPC link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpcLinkVersion
     */
    public CreateVpcLinkResult withVpcLinkVersion(String vpcLinkVersion) {
        this.vpcLinkVersion = vpcLinkVersion;
        return this;
    }

    /**
     * <p>
     * The version of the VPC link.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V2
     *
     * @param vpcLinkVersion <p>
     *            The version of the VPC link.
     *            </p>
     * @see VpcLinkVersion
     */
    public void setVpcLinkVersion(VpcLinkVersion vpcLinkVersion) {
        this.vpcLinkVersion = vpcLinkVersion.toString();
    }

    /**
     * <p>
     * The version of the VPC link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V2
     *
     * @param vpcLinkVersion <p>
     *            The version of the VPC link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpcLinkVersion
     */
    public CreateVpcLinkResult withVpcLinkVersion(VpcLinkVersion vpcLinkVersion) {
        this.vpcLinkVersion = vpcLinkVersion.toString();
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
        if (getCreatedDate() != null)
            sb.append("CreatedDate: " + getCreatedDate() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: " + getSubnetIds() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getVpcLinkId() != null)
            sb.append("VpcLinkId: " + getVpcLinkId() + ",");
        if (getVpcLinkStatus() != null)
            sb.append("VpcLinkStatus: " + getVpcLinkStatus() + ",");
        if (getVpcLinkStatusMessage() != null)
            sb.append("VpcLinkStatusMessage: " + getVpcLinkStatusMessage() + ",");
        if (getVpcLinkVersion() != null)
            sb.append("VpcLinkVersion: " + getVpcLinkVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcLinkId() == null) ? 0 : getVpcLinkId().hashCode());
        hashCode = prime * hashCode
                + ((getVpcLinkStatus() == null) ? 0 : getVpcLinkStatus().hashCode());
        hashCode = prime * hashCode
                + ((getVpcLinkStatusMessage() == null) ? 0 : getVpcLinkStatusMessage().hashCode());
        hashCode = prime * hashCode
                + ((getVpcLinkVersion() == null) ? 0 : getVpcLinkVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcLinkResult == false)
            return false;
        CreateVpcLinkResult other = (CreateVpcLinkResult) obj;

        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null
                && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null
                && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcLinkId() == null ^ this.getVpcLinkId() == null)
            return false;
        if (other.getVpcLinkId() != null
                && other.getVpcLinkId().equals(this.getVpcLinkId()) == false)
            return false;
        if (other.getVpcLinkStatus() == null ^ this.getVpcLinkStatus() == null)
            return false;
        if (other.getVpcLinkStatus() != null
                && other.getVpcLinkStatus().equals(this.getVpcLinkStatus()) == false)
            return false;
        if (other.getVpcLinkStatusMessage() == null ^ this.getVpcLinkStatusMessage() == null)
            return false;
        if (other.getVpcLinkStatusMessage() != null
                && other.getVpcLinkStatusMessage().equals(this.getVpcLinkStatusMessage()) == false)
            return false;
        if (other.getVpcLinkVersion() == null ^ this.getVpcLinkVersion() == null)
            return false;
        if (other.getVpcLinkVersion() != null
                && other.getVpcLinkVersion().equals(this.getVpcLinkVersion()) == false)
            return false;
        return true;
    }
}
