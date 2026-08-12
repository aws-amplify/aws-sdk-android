/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Information about flow associations.
 * </p>
 */
public class FlowAssociationSummary implements Serializable {
    /**
     * <p>
     * The identifier of the resource.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     */
    private String flowId;

    /**
     * <p>
     * The type of resource association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE_PHONE_NUMBER
     */
    private String resourceType;

    /**
     * <p>
     * The identifier of the resource.
     * </p>
     *
     * @return <p>
     *         The identifier of the resource.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The identifier of the resource.
     * </p>
     *
     * @param resourceId <p>
     *            The identifier of the resource.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceId <p>
     *            The identifier of the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlowAssociationSummary withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     *
     * @return <p>
     *         The identifier of the flow.
     *         </p>
     */
    public String getFlowId() {
        return flowId;
    }

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     *
     * @param flowId <p>
     *            The identifier of the flow.
     *            </p>
     */
    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flowId <p>
     *            The identifier of the flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlowAssociationSummary withFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }

    /**
     * <p>
     * The type of resource association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE_PHONE_NUMBER
     *
     * @return <p>
     *         The type of resource association.
     *         </p>
     * @see ListFlowAssociationResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE_PHONE_NUMBER
     *
     * @param resourceType <p>
     *            The type of resource association.
     *            </p>
     * @see ListFlowAssociationResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE_PHONE_NUMBER
     *
     * @param resourceType <p>
     *            The type of resource association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ListFlowAssociationResourceType
     */
    public FlowAssociationSummary withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of resource association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE_PHONE_NUMBER
     *
     * @param resourceType <p>
     *            The type of resource association.
     *            </p>
     * @see ListFlowAssociationResourceType
     */
    public void setResourceType(ListFlowAssociationResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of resource association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE_PHONE_NUMBER
     *
     * @param resourceType <p>
     *            The type of resource association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ListFlowAssociationResourceType
     */
    public FlowAssociationSummary withResourceType(ListFlowAssociationResourceType resourceType) {
        this.resourceType = resourceType.toString();
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
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getFlowId() != null)
            sb.append("FlowId: " + getFlowId() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getFlowId() == null) ? 0 : getFlowId().hashCode());
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

        if (obj instanceof FlowAssociationSummary == false)
            return false;
        FlowAssociationSummary other = (FlowAssociationSummary) obj;

        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getFlowId() == null ^ this.getFlowId() == null)
            return false;
        if (other.getFlowId() != null && other.getFlowId().equals(this.getFlowId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }
}
