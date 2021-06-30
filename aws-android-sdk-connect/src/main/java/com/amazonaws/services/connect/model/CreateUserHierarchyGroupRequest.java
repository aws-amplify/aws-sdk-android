/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates a new user hierarchy group.
 * </p>
 */
public class CreateUserHierarchyGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the user hierarchy group. Must not be more than 100
     * characters.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The identifier for the parent hierarchy group. The user hierarchy is
     * created at level one if the parent group ID is null.
     * </p>
     */
    private String parentGroupId;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The name of the user hierarchy group. Must not be more than 100
     * characters.
     * </p>
     *
     * @return <p>
     *         The name of the user hierarchy group. Must not be more than 100
     *         characters.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the user hierarchy group. Must not be more than 100
     * characters.
     * </p>
     *
     * @param name <p>
     *            The name of the user hierarchy group. Must not be more than
     *            100 characters.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the user hierarchy group. Must not be more than 100
     * characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the user hierarchy group. Must not be more than
     *            100 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserHierarchyGroupRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The identifier for the parent hierarchy group. The user hierarchy is
     * created at level one if the parent group ID is null.
     * </p>
     *
     * @return <p>
     *         The identifier for the parent hierarchy group. The user hierarchy
     *         is created at level one if the parent group ID is null.
     *         </p>
     */
    public String getParentGroupId() {
        return parentGroupId;
    }

    /**
     * <p>
     * The identifier for the parent hierarchy group. The user hierarchy is
     * created at level one if the parent group ID is null.
     * </p>
     *
     * @param parentGroupId <p>
     *            The identifier for the parent hierarchy group. The user
     *            hierarchy is created at level one if the parent group ID is
     *            null.
     *            </p>
     */
    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    /**
     * <p>
     * The identifier for the parent hierarchy group. The user hierarchy is
     * created at level one if the parent group ID is null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parentGroupId <p>
     *            The identifier for the parent hierarchy group. The user
     *            hierarchy is created at level one if the parent group ID is
     *            null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserHierarchyGroupRequest withParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserHierarchyGroupRequest withInstanceId(String instanceId) {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getParentGroupId() != null)
            sb.append("ParentGroupId: " + getParentGroupId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getParentGroupId() == null) ? 0 : getParentGroupId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserHierarchyGroupRequest == false)
            return false;
        CreateUserHierarchyGroupRequest other = (CreateUserHierarchyGroupRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getParentGroupId() == null ^ this.getParentGroupId() == null)
            return false;
        if (other.getParentGroupId() != null
                && other.getParentGroupId().equals(this.getParentGroupId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }
}
