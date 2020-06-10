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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a resource change that will occur when a plan is executed.
 * </p>
 */
public class ResourceChange implements Serializable {
    /**
     * <p>
     * The change action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, MODIFY, REMOVE
     */
    private String action;

    /**
     * <p>
     * The ID of the resource, as defined in the CloudFormation template.
     * </p>
     */
    private String logicalResourceId;

    /**
     * <p>
     * The ID of the resource, if it was already created.
     * </p>
     */
    private String physicalResourceId;

    /**
     * <p>
     * The type of resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String resourceType;

    /**
     * <p>
     * If the change type is <code>Modify</code>, indicates whether the existing
     * resource is deleted and replaced with a new one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRUE, FALSE, CONDITIONAL
     */
    private String replacement;

    /**
     * <p>
     * The change scope.
     * </p>
     */
    private java.util.List<String> scope;

    /**
     * <p>
     * Information about the resource changes.
     * </p>
     */
    private java.util.List<ResourceChangeDetail> details;

    /**
     * <p>
     * The change action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, MODIFY, REMOVE
     *
     * @return <p>
     *         The change action.
     *         </p>
     * @see ChangeAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The change action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, MODIFY, REMOVE
     *
     * @param action <p>
     *            The change action.
     *            </p>
     * @see ChangeAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The change action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, MODIFY, REMOVE
     *
     * @param action <p>
     *            The change action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public ResourceChange withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The change action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, MODIFY, REMOVE
     *
     * @param action <p>
     *            The change action.
     *            </p>
     * @see ChangeAction
     */
    public void setAction(ChangeAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * The change action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, MODIFY, REMOVE
     *
     * @param action <p>
     *            The change action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public ResourceChange withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the resource, as defined in the CloudFormation template.
     * </p>
     *
     * @return <p>
     *         The ID of the resource, as defined in the CloudFormation
     *         template.
     *         </p>
     */
    public String getLogicalResourceId() {
        return logicalResourceId;
    }

    /**
     * <p>
     * The ID of the resource, as defined in the CloudFormation template.
     * </p>
     *
     * @param logicalResourceId <p>
     *            The ID of the resource, as defined in the CloudFormation
     *            template.
     *            </p>
     */
    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * The ID of the resource, as defined in the CloudFormation template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logicalResourceId <p>
     *            The ID of the resource, as defined in the CloudFormation
     *            template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceChange withLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }

    /**
     * <p>
     * The ID of the resource, if it was already created.
     * </p>
     *
     * @return <p>
     *         The ID of the resource, if it was already created.
     *         </p>
     */
    public String getPhysicalResourceId() {
        return physicalResourceId;
    }

    /**
     * <p>
     * The ID of the resource, if it was already created.
     * </p>
     *
     * @param physicalResourceId <p>
     *            The ID of the resource, if it was already created.
     *            </p>
     */
    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    /**
     * <p>
     * The ID of the resource, if it was already created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param physicalResourceId <p>
     *            The ID of the resource, if it was already created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceChange withPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
        return this;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The type of resource.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceType <p>
     *            The type of resource.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceType <p>
     *            The type of resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceChange withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * If the change type is <code>Modify</code>, indicates whether the existing
     * resource is deleted and replaced with a new one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRUE, FALSE, CONDITIONAL
     *
     * @return <p>
     *         If the change type is <code>Modify</code>, indicates whether the
     *         existing resource is deleted and replaced with a new one.
     *         </p>
     * @see Replacement
     */
    public String getReplacement() {
        return replacement;
    }

    /**
     * <p>
     * If the change type is <code>Modify</code>, indicates whether the existing
     * resource is deleted and replaced with a new one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRUE, FALSE, CONDITIONAL
     *
     * @param replacement <p>
     *            If the change type is <code>Modify</code>, indicates whether
     *            the existing resource is deleted and replaced with a new one.
     *            </p>
     * @see Replacement
     */
    public void setReplacement(String replacement) {
        this.replacement = replacement;
    }

    /**
     * <p>
     * If the change type is <code>Modify</code>, indicates whether the existing
     * resource is deleted and replaced with a new one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRUE, FALSE, CONDITIONAL
     *
     * @param replacement <p>
     *            If the change type is <code>Modify</code>, indicates whether
     *            the existing resource is deleted and replaced with a new one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Replacement
     */
    public ResourceChange withReplacement(String replacement) {
        this.replacement = replacement;
        return this;
    }

    /**
     * <p>
     * If the change type is <code>Modify</code>, indicates whether the existing
     * resource is deleted and replaced with a new one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRUE, FALSE, CONDITIONAL
     *
     * @param replacement <p>
     *            If the change type is <code>Modify</code>, indicates whether
     *            the existing resource is deleted and replaced with a new one.
     *            </p>
     * @see Replacement
     */
    public void setReplacement(Replacement replacement) {
        this.replacement = replacement.toString();
    }

    /**
     * <p>
     * If the change type is <code>Modify</code>, indicates whether the existing
     * resource is deleted and replaced with a new one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRUE, FALSE, CONDITIONAL
     *
     * @param replacement <p>
     *            If the change type is <code>Modify</code>, indicates whether
     *            the existing resource is deleted and replaced with a new one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Replacement
     */
    public ResourceChange withReplacement(Replacement replacement) {
        this.replacement = replacement.toString();
        return this;
    }

    /**
     * <p>
     * The change scope.
     * </p>
     *
     * @return <p>
     *         The change scope.
     *         </p>
     */
    public java.util.List<String> getScope() {
        return scope;
    }

    /**
     * <p>
     * The change scope.
     * </p>
     *
     * @param scope <p>
     *            The change scope.
     *            </p>
     */
    public void setScope(java.util.Collection<String> scope) {
        if (scope == null) {
            this.scope = null;
            return;
        }

        this.scope = new java.util.ArrayList<String>(scope);
    }

    /**
     * <p>
     * The change scope.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scope <p>
     *            The change scope.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceChange withScope(String... scope) {
        if (getScope() == null) {
            this.scope = new java.util.ArrayList<String>(scope.length);
        }
        for (String value : scope) {
            this.scope.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The change scope.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scope <p>
     *            The change scope.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceChange withScope(java.util.Collection<String> scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * Information about the resource changes.
     * </p>
     *
     * @return <p>
     *         Information about the resource changes.
     *         </p>
     */
    public java.util.List<ResourceChangeDetail> getDetails() {
        return details;
    }

    /**
     * <p>
     * Information about the resource changes.
     * </p>
     *
     * @param details <p>
     *            Information about the resource changes.
     *            </p>
     */
    public void setDetails(java.util.Collection<ResourceChangeDetail> details) {
        if (details == null) {
            this.details = null;
            return;
        }

        this.details = new java.util.ArrayList<ResourceChangeDetail>(details);
    }

    /**
     * <p>
     * Information about the resource changes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param details <p>
     *            Information about the resource changes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceChange withDetails(ResourceChangeDetail... details) {
        if (getDetails() == null) {
            this.details = new java.util.ArrayList<ResourceChangeDetail>(details.length);
        }
        for (ResourceChangeDetail value : details) {
            this.details.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the resource changes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param details <p>
     *            Information about the resource changes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceChange withDetails(java.util.Collection<ResourceChangeDetail> details) {
        setDetails(details);
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
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: " + getLogicalResourceId() + ",");
        if (getPhysicalResourceId() != null)
            sb.append("PhysicalResourceId: " + getPhysicalResourceId() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getReplacement() != null)
            sb.append("Replacement: " + getReplacement() + ",");
        if (getScope() != null)
            sb.append("Scope: " + getScope() + ",");
        if (getDetails() != null)
            sb.append("Details: " + getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode
                + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getReplacement() == null) ? 0 : getReplacement().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceChange == false)
            return false;
        ResourceChange other = (ResourceChange) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null
                && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        if (other.getPhysicalResourceId() == null ^ this.getPhysicalResourceId() == null)
            return false;
        if (other.getPhysicalResourceId() != null
                && other.getPhysicalResourceId().equals(this.getPhysicalResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getReplacement() == null ^ this.getReplacement() == null)
            return false;
        if (other.getReplacement() != null
                && other.getReplacement().equals(this.getReplacement()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }
}
