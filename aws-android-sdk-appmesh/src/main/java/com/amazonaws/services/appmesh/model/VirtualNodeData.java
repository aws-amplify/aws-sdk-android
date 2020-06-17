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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents a virtual node returned by a describe operation.
 * </p>
 */
public class VirtualNodeData implements Serializable {
    /**
     * <p>
     * The name of the service mesh that the virtual node resides in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String meshName;

    /**
     * <p>
     * The associated metadata for the virtual node.
     * </p>
     */
    private ResourceMetadata metadata;

    /**
     * <p>
     * The specifications of the virtual node.
     * </p>
     */
    private VirtualNodeSpec spec;

    /**
     * <p>
     * The current status for the virtual node.
     * </p>
     */
    private VirtualNodeStatus status;

    /**
     * <p>
     * The name of the virtual node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String virtualNodeName;

    /**
     * <p>
     * The name of the service mesh that the virtual node resides in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the service mesh that the virtual node resides in.
     *         </p>
     */
    public String getMeshName() {
        return meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the virtual node resides in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh that the virtual node resides in.
     *            </p>
     */
    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the virtual node resides in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh that the virtual node resides in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeData withMeshName(String meshName) {
        this.meshName = meshName;
        return this;
    }

    /**
     * <p>
     * The associated metadata for the virtual node.
     * </p>
     *
     * @return <p>
     *         The associated metadata for the virtual node.
     *         </p>
     */
    public ResourceMetadata getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * The associated metadata for the virtual node.
     * </p>
     *
     * @param metadata <p>
     *            The associated metadata for the virtual node.
     *            </p>
     */
    public void setMetadata(ResourceMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The associated metadata for the virtual node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadata <p>
     *            The associated metadata for the virtual node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeData withMetadata(ResourceMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * <p>
     * The specifications of the virtual node.
     * </p>
     *
     * @return <p>
     *         The specifications of the virtual node.
     *         </p>
     */
    public VirtualNodeSpec getSpec() {
        return spec;
    }

    /**
     * <p>
     * The specifications of the virtual node.
     * </p>
     *
     * @param spec <p>
     *            The specifications of the virtual node.
     *            </p>
     */
    public void setSpec(VirtualNodeSpec spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The specifications of the virtual node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spec <p>
     *            The specifications of the virtual node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeData withSpec(VirtualNodeSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
     * <p>
     * The current status for the virtual node.
     * </p>
     *
     * @return <p>
     *         The current status for the virtual node.
     *         </p>
     */
    public VirtualNodeStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status for the virtual node.
     * </p>
     *
     * @param status <p>
     *            The current status for the virtual node.
     *            </p>
     */
    public void setStatus(VirtualNodeStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status for the virtual node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current status for the virtual node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeData withStatus(VirtualNodeStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The name of the virtual node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the virtual node.
     *         </p>
     */
    public String getVirtualNodeName() {
        return virtualNodeName;
    }

    /**
     * <p>
     * The name of the virtual node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param virtualNodeName <p>
     *            The name of the virtual node.
     *            </p>
     */
    public void setVirtualNodeName(String virtualNodeName) {
        this.virtualNodeName = virtualNodeName;
    }

    /**
     * <p>
     * The name of the virtual node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param virtualNodeName <p>
     *            The name of the virtual node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeData withVirtualNodeName(String virtualNodeName) {
        this.virtualNodeName = virtualNodeName;
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
        if (getMeshName() != null)
            sb.append("meshName: " + getMeshName() + ",");
        if (getMetadata() != null)
            sb.append("metadata: " + getMetadata() + ",");
        if (getSpec() != null)
            sb.append("spec: " + getSpec() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getVirtualNodeName() != null)
            sb.append("virtualNodeName: " + getVirtualNodeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualNodeName() == null) ? 0 : getVirtualNodeName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualNodeData == false)
            return false;
        VirtualNodeData other = (VirtualNodeData) obj;

        if (other.getMeshName() == null ^ this.getMeshName() == null)
            return false;
        if (other.getMeshName() != null && other.getMeshName().equals(this.getMeshName()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getSpec() == null ^ this.getSpec() == null)
            return false;
        if (other.getSpec() != null && other.getSpec().equals(this.getSpec()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getVirtualNodeName() == null ^ this.getVirtualNodeName() == null)
            return false;
        if (other.getVirtualNodeName() != null
                && other.getVirtualNodeName().equals(this.getVirtualNodeName()) == false)
            return false;
        return true;
    }
}
