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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the AWS resource associated with the activity that
 * prompted GuardDuty to generate a finding.
 * </p>
 */
public class Resource implements Serializable {
    /**
     * <p>
     * The IAM access key details (IAM user information) of a user that engaged
     * in the activity that prompted GuardDuty to generate a finding.
     * </p>
     */
    private AccessKeyDetails accessKeyDetails;

    /**
     * <p>
     * The information about the EC2 instance associated with the activity that
     * prompted GuardDuty to generate a finding.
     * </p>
     */
    private InstanceDetails instanceDetails;

    /**
     * <p>
     * The type of AWS resource.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The IAM access key details (IAM user information) of a user that engaged
     * in the activity that prompted GuardDuty to generate a finding.
     * </p>
     *
     * @return <p>
     *         The IAM access key details (IAM user information) of a user that
     *         engaged in the activity that prompted GuardDuty to generate a
     *         finding.
     *         </p>
     */
    public AccessKeyDetails getAccessKeyDetails() {
        return accessKeyDetails;
    }

    /**
     * <p>
     * The IAM access key details (IAM user information) of a user that engaged
     * in the activity that prompted GuardDuty to generate a finding.
     * </p>
     *
     * @param accessKeyDetails <p>
     *            The IAM access key details (IAM user information) of a user
     *            that engaged in the activity that prompted GuardDuty to
     *            generate a finding.
     *            </p>
     */
    public void setAccessKeyDetails(AccessKeyDetails accessKeyDetails) {
        this.accessKeyDetails = accessKeyDetails;
    }

    /**
     * <p>
     * The IAM access key details (IAM user information) of a user that engaged
     * in the activity that prompted GuardDuty to generate a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessKeyDetails <p>
     *            The IAM access key details (IAM user information) of a user
     *            that engaged in the activity that prompted GuardDuty to
     *            generate a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withAccessKeyDetails(AccessKeyDetails accessKeyDetails) {
        this.accessKeyDetails = accessKeyDetails;
        return this;
    }

    /**
     * <p>
     * The information about the EC2 instance associated with the activity that
     * prompted GuardDuty to generate a finding.
     * </p>
     *
     * @return <p>
     *         The information about the EC2 instance associated with the
     *         activity that prompted GuardDuty to generate a finding.
     *         </p>
     */
    public InstanceDetails getInstanceDetails() {
        return instanceDetails;
    }

    /**
     * <p>
     * The information about the EC2 instance associated with the activity that
     * prompted GuardDuty to generate a finding.
     * </p>
     *
     * @param instanceDetails <p>
     *            The information about the EC2 instance associated with the
     *            activity that prompted GuardDuty to generate a finding.
     *            </p>
     */
    public void setInstanceDetails(InstanceDetails instanceDetails) {
        this.instanceDetails = instanceDetails;
    }

    /**
     * <p>
     * The information about the EC2 instance associated with the activity that
     * prompted GuardDuty to generate a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceDetails <p>
     *            The information about the EC2 instance associated with the
     *            activity that prompted GuardDuty to generate a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withInstanceDetails(InstanceDetails instanceDetails) {
        this.instanceDetails = instanceDetails;
        return this;
    }

    /**
     * <p>
     * The type of AWS resource.
     * </p>
     *
     * @return <p>
     *         The type of AWS resource.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of AWS resource.
     * </p>
     *
     * @param resourceType <p>
     *            The type of AWS resource.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of AWS resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceType <p>
     *            The type of AWS resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withResourceType(String resourceType) {
        this.resourceType = resourceType;
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
        if (getAccessKeyDetails() != null)
            sb.append("AccessKeyDetails: " + getAccessKeyDetails() + ",");
        if (getInstanceDetails() != null)
            sb.append("InstanceDetails: " + getInstanceDetails() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessKeyDetails() == null) ? 0 : getAccessKeyDetails().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceDetails() == null) ? 0 : getInstanceDetails().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;

        if (other.getAccessKeyDetails() == null ^ this.getAccessKeyDetails() == null)
            return false;
        if (other.getAccessKeyDetails() != null
                && other.getAccessKeyDetails().equals(this.getAccessKeyDetails()) == false)
            return false;
        if (other.getInstanceDetails() == null ^ this.getInstanceDetails() == null)
            return false;
        if (other.getInstanceDetails() != null
                && other.getInstanceDetails().equals(this.getInstanceDetails()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }
}
