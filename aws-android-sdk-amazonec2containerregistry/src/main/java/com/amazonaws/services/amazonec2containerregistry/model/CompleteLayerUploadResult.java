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
package com.amazonaws.services.amazonec2containerregistry.model;

import java.io.Serializable;


public class CompleteLayerUploadResult implements Serializable {
    /**
     * <p>The registry ID associated with the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String registryId;

    /**
     * <p>The repository name associated with the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     */
    private String repositoryName;

    /**
     * <p>The upload ID associated with the layer.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}<br/>
     */
    private String uploadId;

    /**
     * <p>The <code>sha256</code> digest of the image layer.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_+.]+:[a-fA-F0-9]+<br/>
     */
    private String layerDigest;

    /**
     * <p>The registry ID associated with the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>The registry ID associated with the request.</p>
     */
    public String getRegistryId() {
        return registryId;
    }

    /**
     * <p>The registry ID associated with the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>The registry ID associated with the request.</p>
     */
    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>The registry ID associated with the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>The registry ID associated with the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CompleteLayerUploadResult withRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    /**
     * <p>The repository name associated with the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @return <p>The repository name associated with the request.</p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>The repository name associated with the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @param repositoryName <p>The repository name associated with the request.</p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>The repository name associated with the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @param repositoryName <p>The repository name associated with the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CompleteLayerUploadResult withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>The upload ID associated with the layer.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>The upload ID associated with the layer.</p>
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * <p>The upload ID associated with the layer.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}<br/>
     *
     * @param uploadId <p>The upload ID associated with the layer.</p>
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>The upload ID associated with the layer.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}<br/>
     *
     * @param uploadId <p>The upload ID associated with the layer.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CompleteLayerUploadResult withUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }

    /**
     * <p>The <code>sha256</code> digest of the image layer.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_+.]+:[a-fA-F0-9]+<br/>
     *
     * @return <p>The <code>sha256</code> digest of the image layer.</p>
     */
    public String getLayerDigest() {
        return layerDigest;
    }

    /**
     * <p>The <code>sha256</code> digest of the image layer.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_+.]+:[a-fA-F0-9]+<br/>
     *
     * @param layerDigest <p>The <code>sha256</code> digest of the image layer.</p>
     */
    public void setLayerDigest(String layerDigest) {
        this.layerDigest = layerDigest;
    }

    /**
     * <p>The <code>sha256</code> digest of the image layer.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_+.]+:[a-fA-F0-9]+<br/>
     *
     * @param layerDigest <p>The <code>sha256</code> digest of the image layer.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CompleteLayerUploadResult withLayerDigest(String layerDigest) {
        this.layerDigest = layerDigest;
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
        if (getRegistryId() != null) sb.append("registryId: " + getRegistryId() + ",");
        if (getRepositoryName() != null) sb.append("repositoryName: " + getRepositoryName() + ",");
        if (getUploadId() != null) sb.append("uploadId: " + getUploadId() + ",");
        if (getLayerDigest() != null) sb.append("layerDigest: " + getLayerDigest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        hashCode = prime * hashCode + ((getLayerDigest() == null) ? 0 : getLayerDigest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CompleteLayerUploadResult == false) return false;
        CompleteLayerUploadResult other = (CompleteLayerUploadResult)obj;

        if (other.getRegistryId() == null ^ this.getRegistryId() == null) return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false) return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null) return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false) return false;
        if (other.getUploadId() == null ^ this.getUploadId() == null) return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false) return false;
        if (other.getLayerDigest() == null ^ this.getLayerDigest() == null) return false;
        if (other.getLayerDigest() != null && other.getLayerDigest().equals(this.getLayerDigest()) == false) return false;
        return true;
    }
}
