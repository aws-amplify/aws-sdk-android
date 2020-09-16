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
 * <p>An activation registers one or more on-premises servers or virtual machines (VMs) with AWS so that you can configure those servers or VMs using Run Command. A server or VM that has been registered with AWS is called a managed instance.</p>
 */
public class Activation implements Serializable {
    /**
     * <p>The ID created by Systems Manager when you submitted the activation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String activationId;

    /**
     * <p>A user defined description of the activation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String description;

    /**
     * <p>A name for the managed instance when it is created.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String defaultInstanceName;

    /**
     * <p>The Amazon Identity and Access Management (IAM) role to assign to the managed instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String iamRole;

    /**
     * <p>The maximum number of managed instances that can be registered using this activation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer registrationLimit;

    /**
     * <p>The number of managed instances already registered with this activation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer registrationsCount;

    /**
     * <p>The date when this activation can no longer be used to register managed instances.</p>
     */
    private java.util.Date expirationDate;

    /**
     * <p>Whether or not the activation is expired.</p>
     */
    private Boolean expired;

    /**
     * <p>The date the activation was created.</p>
     */
    private java.util.Date createdDate;

    /**
     * <p>Tags assigned to the activation.</p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>The ID created by Systems Manager when you submitted the activation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>The ID created by Systems Manager when you submitted the activation.</p>
     */
    public String getActivationId() {
        return activationId;
    }

    /**
     * <p>The ID created by Systems Manager when you submitted the activation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param activationId <p>The ID created by Systems Manager when you submitted the activation.</p>
     */
    public void setActivationId(String activationId) {
        this.activationId = activationId;
    }

    /**
     * <p>The ID created by Systems Manager when you submitted the activation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param activationId <p>The ID created by Systems Manager when you submitted the activation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Activation withActivationId(String activationId) {
        this.activationId = activationId;
        return this;
    }

    /**
     * <p>A user defined description of the activation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return <p>A user defined description of the activation.</p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>A user defined description of the activation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description <p>A user defined description of the activation.</p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>A user defined description of the activation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description <p>A user defined description of the activation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Activation withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>A name for the managed instance when it is created.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>A name for the managed instance when it is created.</p>
     */
    public String getDefaultInstanceName() {
        return defaultInstanceName;
    }

    /**
     * <p>A name for the managed instance when it is created.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param defaultInstanceName <p>A name for the managed instance when it is created.</p>
     */
    public void setDefaultInstanceName(String defaultInstanceName) {
        this.defaultInstanceName = defaultInstanceName;
    }

    /**
     * <p>A name for the managed instance when it is created.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param defaultInstanceName <p>A name for the managed instance when it is created.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Activation withDefaultInstanceName(String defaultInstanceName) {
        this.defaultInstanceName = defaultInstanceName;
        return this;
    }

    /**
     * <p>The Amazon Identity and Access Management (IAM) role to assign to the managed instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>The Amazon Identity and Access Management (IAM) role to assign to the managed instance.</p>
     */
    public String getIamRole() {
        return iamRole;
    }

    /**
     * <p>The Amazon Identity and Access Management (IAM) role to assign to the managed instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param iamRole <p>The Amazon Identity and Access Management (IAM) role to assign to the managed instance.</p>
     */
    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>The Amazon Identity and Access Management (IAM) role to assign to the managed instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param iamRole <p>The Amazon Identity and Access Management (IAM) role to assign to the managed instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Activation withIamRole(String iamRole) {
        this.iamRole = iamRole;
        return this;
    }

    /**
     * <p>The maximum number of managed instances that can be registered using this activation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>The maximum number of managed instances that can be registered using this activation.</p>
     */
    public Integer getRegistrationLimit() {
        return registrationLimit;
    }

    /**
     * <p>The maximum number of managed instances that can be registered using this activation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param registrationLimit <p>The maximum number of managed instances that can be registered using this activation.</p>
     */
    public void setRegistrationLimit(Integer registrationLimit) {
        this.registrationLimit = registrationLimit;
    }

    /**
     * <p>The maximum number of managed instances that can be registered using this activation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param registrationLimit <p>The maximum number of managed instances that can be registered using this activation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Activation withRegistrationLimit(Integer registrationLimit) {
        this.registrationLimit = registrationLimit;
        return this;
    }

    /**
     * <p>The number of managed instances already registered with this activation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>The number of managed instances already registered with this activation.</p>
     */
    public Integer getRegistrationsCount() {
        return registrationsCount;
    }

    /**
     * <p>The number of managed instances already registered with this activation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param registrationsCount <p>The number of managed instances already registered with this activation.</p>
     */
    public void setRegistrationsCount(Integer registrationsCount) {
        this.registrationsCount = registrationsCount;
    }

    /**
     * <p>The number of managed instances already registered with this activation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param registrationsCount <p>The number of managed instances already registered with this activation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Activation withRegistrationsCount(Integer registrationsCount) {
        this.registrationsCount = registrationsCount;
        return this;
    }

    /**
     * <p>The date when this activation can no longer be used to register managed instances.</p>
     *
     * @return <p>The date when this activation can no longer be used to register managed instances.</p>
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * <p>The date when this activation can no longer be used to register managed instances.</p>
     *
     * @param expirationDate <p>The date when this activation can no longer be used to register managed instances.</p>
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>The date when this activation can no longer be used to register managed instances.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expirationDate <p>The date when this activation can no longer be used to register managed instances.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Activation withExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * <p>Whether or not the activation is expired.</p>
     *
     * @return <p>Whether or not the activation is expired.</p>
     */
    public Boolean isExpired() {
        return expired;
    }

    /**
     * <p>Whether or not the activation is expired.</p>
     *
     * @return <p>Whether or not the activation is expired.</p>
     */
    public Boolean getExpired() {
        return expired;
    }

    /**
     * <p>Whether or not the activation is expired.</p>
     *
     * @param expired <p>Whether or not the activation is expired.</p>
     */
    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    /**
     * <p>Whether or not the activation is expired.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expired <p>Whether or not the activation is expired.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Activation withExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }

    /**
     * <p>The date the activation was created.</p>
     *
     * @return <p>The date the activation was created.</p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>The date the activation was created.</p>
     *
     * @param createdDate <p>The date the activation was created.</p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>The date the activation was created.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdDate <p>The date the activation was created.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Activation withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>Tags assigned to the activation.</p>
     *
     * @return <p>Tags assigned to the activation.</p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>Tags assigned to the activation.</p>
     *
     * @param tags <p>Tags assigned to the activation.</p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>Tags assigned to the activation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags <p>Tags assigned to the activation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Activation withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>Tags assigned to the activation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags <p>Tags assigned to the activation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Activation withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getActivationId() != null) sb.append("ActivationId: " + getActivationId() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getDefaultInstanceName() != null) sb.append("DefaultInstanceName: " + getDefaultInstanceName() + ",");
        if (getIamRole() != null) sb.append("IamRole: " + getIamRole() + ",");
        if (getRegistrationLimit() != null) sb.append("RegistrationLimit: " + getRegistrationLimit() + ",");
        if (getRegistrationsCount() != null) sb.append("RegistrationsCount: " + getRegistrationsCount() + ",");
        if (getExpirationDate() != null) sb.append("ExpirationDate: " + getExpirationDate() + ",");
        if (getExpired() != null) sb.append("Expired: " + getExpired() + ",");
        if (getCreatedDate() != null) sb.append("CreatedDate: " + getCreatedDate() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivationId() == null) ? 0 : getActivationId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultInstanceName() == null) ? 0 : getDefaultInstanceName().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        hashCode = prime * hashCode + ((getRegistrationLimit() == null) ? 0 : getRegistrationLimit().hashCode());
        hashCode = prime * hashCode + ((getRegistrationsCount() == null) ? 0 : getRegistrationsCount().hashCode());
        hashCode = prime * hashCode + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        hashCode = prime * hashCode + ((getExpired() == null) ? 0 : getExpired().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Activation == false) return false;
        Activation other = (Activation)obj;

        if (other.getActivationId() == null ^ this.getActivationId() == null) return false;
        if (other.getActivationId() != null && other.getActivationId().equals(this.getActivationId()) == false) return false;
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false;
        if (other.getDefaultInstanceName() == null ^ this.getDefaultInstanceName() == null) return false;
        if (other.getDefaultInstanceName() != null && other.getDefaultInstanceName().equals(this.getDefaultInstanceName()) == false) return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null) return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false) return false;
        if (other.getRegistrationLimit() == null ^ this.getRegistrationLimit() == null) return false;
        if (other.getRegistrationLimit() != null && other.getRegistrationLimit().equals(this.getRegistrationLimit()) == false) return false;
        if (other.getRegistrationsCount() == null ^ this.getRegistrationsCount() == null) return false;
        if (other.getRegistrationsCount() != null && other.getRegistrationsCount().equals(this.getRegistrationsCount()) == false) return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null) return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false) return false;
        if (other.getExpired() == null ^ this.getExpired() == null) return false;
        if (other.getExpired() != null && other.getExpired().equals(this.getExpired()) == false) return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null) return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false) return false;
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false;
        return true;
    }
}
