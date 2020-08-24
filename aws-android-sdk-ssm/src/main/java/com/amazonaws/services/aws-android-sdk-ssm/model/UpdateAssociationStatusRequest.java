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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Updates the status of the Systems Manager document associated with the specified instance.</p>
 */
public class UpdateAssociationStatusRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The name of the Systems Manager document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>The ID of the instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     */
    private String instanceId;

    /**
     * <p>The association status.</p>
     */
    private AssociationStatus associationStatus;

    /**
     * <p>The name of the Systems Manager document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @return <p>The name of the Systems Manager document.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of the Systems Manager document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param name <p>The name of the Systems Manager document.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of the Systems Manager document.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param name <p>The name of the Systems Manager document.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateAssociationStatusRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The ID of the instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @return <p>The ID of the instance.</p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>The ID of the instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>The ID of the instance.</p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>The ID of the instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>The ID of the instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateAssociationStatusRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>The association status.</p>
     *
     * @return <p>The association status.</p>
     */
    public AssociationStatus getAssociationStatus() {
        return associationStatus;
    }

    /**
     * <p>The association status.</p>
     *
     * @param associationStatus <p>The association status.</p>
     */
    public void setAssociationStatus(AssociationStatus associationStatus) {
        this.associationStatus = associationStatus;
    }

    /**
     * <p>The association status.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associationStatus <p>The association status.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateAssociationStatusRequest withAssociationStatus(AssociationStatus associationStatus) {
        this.associationStatus = associationStatus;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getAssociationStatus() != null) sb.append("AssociationStatus: " + getAssociationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getAssociationStatus() == null) ? 0 : getAssociationStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateAssociationStatusRequest == false) return false;
        UpdateAssociationStatusRequest other = (UpdateAssociationStatusRequest)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false;
        if (other.getAssociationStatus() == null ^ this.getAssociationStatus() == null) return false;
        if (other.getAssociationStatus() != null && other.getAssociationStatus().equals(this.getAssociationStatus()) == false) return false;
        return true;
    }
}
