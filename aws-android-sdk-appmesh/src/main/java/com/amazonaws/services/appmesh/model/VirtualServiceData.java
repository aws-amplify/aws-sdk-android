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
 * An object that represents a virtual service returned by a describe operation.
 * </p>
 */
public class VirtualServiceData implements Serializable {
    /**
     * <p>
     * The name of the service mesh that the virtual service resides in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String meshName;

    /**
     * <p>
     * An object that represents metadata for a resource.
     * </p>
     */
    private ResourceMetadata metadata;

    /**
     * <p>
     * The specifications of the virtual service.
     * </p>
     */
    private VirtualServiceSpec spec;

    /**
     * <p>
     * The current status of the virtual service.
     * </p>
     */
    private VirtualServiceStatus status;

    /**
     * <p>
     * The name of the virtual service.
     * </p>
     */
    private String virtualServiceName;

    /**
     * <p>
     * The name of the service mesh that the virtual service resides in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the service mesh that the virtual service resides in.
     *         </p>
     */
    public String getMeshName() {
        return meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the virtual service resides in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh that the virtual service resides
     *            in.
     *            </p>
     */
    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the virtual service resides in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh that the virtual service resides
     *            in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualServiceData withMeshName(String meshName) {
        this.meshName = meshName;
        return this;
    }

    /**
     * <p>
     * An object that represents metadata for a resource.
     * </p>
     *
     * @return <p>
     *         An object that represents metadata for a resource.
     *         </p>
     */
    public ResourceMetadata getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * An object that represents metadata for a resource.
     * </p>
     *
     * @param metadata <p>
     *            An object that represents metadata for a resource.
     *            </p>
     */
    public void setMetadata(ResourceMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * An object that represents metadata for a resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadata <p>
     *            An object that represents metadata for a resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualServiceData withMetadata(ResourceMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * <p>
     * The specifications of the virtual service.
     * </p>
     *
     * @return <p>
     *         The specifications of the virtual service.
     *         </p>
     */
    public VirtualServiceSpec getSpec() {
        return spec;
    }

    /**
     * <p>
     * The specifications of the virtual service.
     * </p>
     *
     * @param spec <p>
     *            The specifications of the virtual service.
     *            </p>
     */
    public void setSpec(VirtualServiceSpec spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The specifications of the virtual service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spec <p>
     *            The specifications of the virtual service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualServiceData withSpec(VirtualServiceSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
     * <p>
     * The current status of the virtual service.
     * </p>
     *
     * @return <p>
     *         The current status of the virtual service.
     *         </p>
     */
    public VirtualServiceStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the virtual service.
     * </p>
     *
     * @param status <p>
     *            The current status of the virtual service.
     *            </p>
     */
    public void setStatus(VirtualServiceStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the virtual service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current status of the virtual service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualServiceData withStatus(VirtualServiceStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The name of the virtual service.
     * </p>
     *
     * @return <p>
     *         The name of the virtual service.
     *         </p>
     */
    public String getVirtualServiceName() {
        return virtualServiceName;
    }

    /**
     * <p>
     * The name of the virtual service.
     * </p>
     *
     * @param virtualServiceName <p>
     *            The name of the virtual service.
     *            </p>
     */
    public void setVirtualServiceName(String virtualServiceName) {
        this.virtualServiceName = virtualServiceName;
    }

    /**
     * <p>
     * The name of the virtual service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualServiceName <p>
     *            The name of the virtual service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualServiceData withVirtualServiceName(String virtualServiceName) {
        this.virtualServiceName = virtualServiceName;
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
        if (getVirtualServiceName() != null)
            sb.append("virtualServiceName: " + getVirtualServiceName());
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
                + ((getVirtualServiceName() == null) ? 0 : getVirtualServiceName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualServiceData == false)
            return false;
        VirtualServiceData other = (VirtualServiceData) obj;

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
        if (other.getVirtualServiceName() == null ^ this.getVirtualServiceName() == null)
            return false;
        if (other.getVirtualServiceName() != null
                && other.getVirtualServiceName().equals(this.getVirtualServiceName()) == false)
            return false;
        return true;
    }
}
