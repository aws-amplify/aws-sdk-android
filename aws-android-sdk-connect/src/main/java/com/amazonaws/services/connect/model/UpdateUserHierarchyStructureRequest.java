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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the user hierarchy structure: add, remove, and rename user hierarchy
 * levels.
 * </p>
 */
public class UpdateUserHierarchyStructureRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The hierarchy levels to update.
     * </p>
     */
    private HierarchyStructureUpdate hierarchyStructure;

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The hierarchy levels to update.
     * </p>
     *
     * @return <p>
     *         The hierarchy levels to update.
     *         </p>
     */
    public HierarchyStructureUpdate getHierarchyStructure() {
        return hierarchyStructure;
    }

    /**
     * <p>
     * The hierarchy levels to update.
     * </p>
     *
     * @param hierarchyStructure <p>
     *            The hierarchy levels to update.
     *            </p>
     */
    public void setHierarchyStructure(HierarchyStructureUpdate hierarchyStructure) {
        this.hierarchyStructure = hierarchyStructure;
    }

    /**
     * <p>
     * The hierarchy levels to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hierarchyStructure <p>
     *            The hierarchy levels to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserHierarchyStructureRequest withHierarchyStructure(
            HierarchyStructureUpdate hierarchyStructure) {
        this.hierarchyStructure = hierarchyStructure;
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserHierarchyStructureRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
        if (getHierarchyStructure() != null)
            sb.append("HierarchyStructure: " + getHierarchyStructure() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHierarchyStructure() == null) ? 0 : getHierarchyStructure().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserHierarchyStructureRequest == false)
            return false;
        UpdateUserHierarchyStructureRequest other = (UpdateUserHierarchyStructureRequest) obj;

        if (other.getHierarchyStructure() == null ^ this.getHierarchyStructure() == null)
            return false;
        if (other.getHierarchyStructure() != null
                && other.getHierarchyStructure().equals(this.getHierarchyStructure()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }
}
