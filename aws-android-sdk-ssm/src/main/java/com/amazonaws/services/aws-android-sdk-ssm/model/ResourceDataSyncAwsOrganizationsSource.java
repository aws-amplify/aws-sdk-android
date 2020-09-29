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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>Information about the AwsOrganizationsSource resource data sync source. A sync source of this type can synchronize data from AWS Organizations or, if an AWS Organization is not present, from multiple AWS Regions.</p>
 */
public class ResourceDataSyncAwsOrganizationsSource implements Serializable {
    /**
     * <p>If an AWS Organization is present, this is either <code>OrganizationalUnits</code> or <code>EntireOrganization</code>. For <code>OrganizationalUnits</code>, the data is aggregated from a set of organization units. For <code>EntireOrganization</code>, the data is aggregated from the entire AWS Organization. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String organizationSourceType;

    /**
     * <p>The AWS Organizations organization units included in the sync.</p>
     */
    private java.util.List<ResourceDataSyncOrganizationalUnit> organizationalUnits;

    /**
     * <p>If an AWS Organization is present, this is either <code>OrganizationalUnits</code> or <code>EntireOrganization</code>. For <code>OrganizationalUnits</code>, the data is aggregated from a set of organization units. For <code>EntireOrganization</code>, the data is aggregated from the entire AWS Organization. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>If an AWS Organization is present, this is either <code>OrganizationalUnits</code> or <code>EntireOrganization</code>. For <code>OrganizationalUnits</code>, the data is aggregated from a set of organization units. For <code>EntireOrganization</code>, the data is aggregated from the entire AWS Organization. </p>
     */
    public String getOrganizationSourceType() {
        return organizationSourceType;
    }

    /**
     * <p>If an AWS Organization is present, this is either <code>OrganizationalUnits</code> or <code>EntireOrganization</code>. For <code>OrganizationalUnits</code>, the data is aggregated from a set of organization units. For <code>EntireOrganization</code>, the data is aggregated from the entire AWS Organization. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param organizationSourceType <p>If an AWS Organization is present, this is either <code>OrganizationalUnits</code> or <code>EntireOrganization</code>. For <code>OrganizationalUnits</code>, the data is aggregated from a set of organization units. For <code>EntireOrganization</code>, the data is aggregated from the entire AWS Organization. </p>
     */
    public void setOrganizationSourceType(String organizationSourceType) {
        this.organizationSourceType = organizationSourceType;
    }

    /**
     * <p>If an AWS Organization is present, this is either <code>OrganizationalUnits</code> or <code>EntireOrganization</code>. For <code>OrganizationalUnits</code>, the data is aggregated from a set of organization units. For <code>EntireOrganization</code>, the data is aggregated from the entire AWS Organization. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param organizationSourceType <p>If an AWS Organization is present, this is either <code>OrganizationalUnits</code> or <code>EntireOrganization</code>. For <code>OrganizationalUnits</code>, the data is aggregated from a set of organization units. For <code>EntireOrganization</code>, the data is aggregated from the entire AWS Organization. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ResourceDataSyncAwsOrganizationsSource withOrganizationSourceType(String organizationSourceType) {
        this.organizationSourceType = organizationSourceType;
        return this;
    }

    /**
     * <p>The AWS Organizations organization units included in the sync.</p>
     *
     * @return <p>The AWS Organizations organization units included in the sync.</p>
     */
    public java.util.List<ResourceDataSyncOrganizationalUnit> getOrganizationalUnits() {
        return organizationalUnits;
    }

    /**
     * <p>The AWS Organizations organization units included in the sync.</p>
     *
     * @param organizationalUnits <p>The AWS Organizations organization units included in the sync.</p>
     */
    public void setOrganizationalUnits(java.util.Collection<ResourceDataSyncOrganizationalUnit> organizationalUnits) {
        if (organizationalUnits == null) {
            this.organizationalUnits = null;
            return;
        }

        this.organizationalUnits = new java.util.ArrayList<ResourceDataSyncOrganizationalUnit>(organizationalUnits);
    }

    /**
     * <p>The AWS Organizations organization units included in the sync.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param organizationalUnits <p>The AWS Organizations organization units included in the sync.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ResourceDataSyncAwsOrganizationsSource withOrganizationalUnits(ResourceDataSyncOrganizationalUnit... organizationalUnits) {
        if (getOrganizationalUnits() == null) {
            this.organizationalUnits = new java.util.ArrayList<ResourceDataSyncOrganizationalUnit>(organizationalUnits.length);
        }
        for (ResourceDataSyncOrganizationalUnit value : organizationalUnits) {
            this.organizationalUnits.add(value);
        }
        return this;
    }

    /**
     * <p>The AWS Organizations organization units included in the sync.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param organizationalUnits <p>The AWS Organizations organization units included in the sync.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ResourceDataSyncAwsOrganizationsSource withOrganizationalUnits(java.util.Collection<ResourceDataSyncOrganizationalUnit> organizationalUnits) {
        setOrganizationalUnits(organizationalUnits);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOrganizationSourceType() != null) sb.append("OrganizationSourceType: " + getOrganizationSourceType() + ",");
        if (getOrganizationalUnits() != null) sb.append("OrganizationalUnits: " + getOrganizationalUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationSourceType() == null) ? 0 : getOrganizationSourceType().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnits() == null) ? 0 : getOrganizationalUnits().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResourceDataSyncAwsOrganizationsSource == false) return false;
        ResourceDataSyncAwsOrganizationsSource other = (ResourceDataSyncAwsOrganizationsSource)obj;

        if (other.getOrganizationSourceType() == null ^ this.getOrganizationSourceType() == null) return false;
        if (other.getOrganizationSourceType() != null && other.getOrganizationSourceType().equals(this.getOrganizationSourceType()) == false) return false;
        if (other.getOrganizationalUnits() == null ^ this.getOrganizationalUnits() == null) return false;
        if (other.getOrganizationalUnits() != null && other.getOrganizationalUnits().equals(this.getOrganizationalUnits()) == false) return false;
        return true;
    }
}
