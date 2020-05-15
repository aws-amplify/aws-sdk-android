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
package com.amazonaws.services.api.ecr.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Uploads an image layer part to Amazon ECR.</p> <p>When an image is pushed, each new image layer is uploaded in parts. The maximum size of each image layer part can be 20971520 bytes (or about 20MB). The UploadLayerPart API is called once per each new image layer part.</p> <note> <p>This operation is used by the Amazon ECR proxy and is not generally used by customers for pulling and pushing images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.</p> </note>
 */
public class UploadLayerPartRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The AWS account ID associated with the registry to which you are uploading layer parts. If you do not specify a registry, the default registry is assumed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String registryId;

    /**
     * <p>The name of the repository to which you are uploading layer parts.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     */
    private String repositoryName;

    /**
     * <p>The upload ID from a previous <a>InitiateLayerUpload</a> operation to associate with the layer part upload.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}<br/>
     */
    private String uploadId;

    /**
     * <p>The position of the first byte of the layer part witin the overall image layer.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long partFirstByte;

    /**
     * <p>The position of the last byte of the layer part within the overall image layer.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long partLastByte;

    /**
     * <p>The base64-encoded layer part payload.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20971520<br/>
     */
    private java.nio.ByteBuffer layerPartBlob;

    /**
     * <p>The AWS account ID associated with the registry to which you are uploading layer parts. If you do not specify a registry, the default registry is assumed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>The AWS account ID associated with the registry to which you are uploading layer parts. If you do not specify a registry, the default registry is assumed.</p>
     */
    public String getRegistryId() {
        return registryId;
    }

    /**
     * <p>The AWS account ID associated with the registry to which you are uploading layer parts. If you do not specify a registry, the default registry is assumed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>The AWS account ID associated with the registry to which you are uploading layer parts. If you do not specify a registry, the default registry is assumed.</p>
     */
    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>The AWS account ID associated with the registry to which you are uploading layer parts. If you do not specify a registry, the default registry is assumed.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>The AWS account ID associated with the registry to which you are uploading layer parts. If you do not specify a registry, the default registry is assumed.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UploadLayerPartRequest withRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    /**
     * <p>The name of the repository to which you are uploading layer parts.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @return <p>The name of the repository to which you are uploading layer parts.</p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>The name of the repository to which you are uploading layer parts.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @param repositoryName <p>The name of the repository to which you are uploading layer parts.</p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>The name of the repository to which you are uploading layer parts.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @param repositoryName <p>The name of the repository to which you are uploading layer parts.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UploadLayerPartRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>The upload ID from a previous <a>InitiateLayerUpload</a> operation to associate with the layer part upload.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>The upload ID from a previous <a>InitiateLayerUpload</a> operation to associate with the layer part upload.</p>
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * <p>The upload ID from a previous <a>InitiateLayerUpload</a> operation to associate with the layer part upload.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}<br/>
     *
     * @param uploadId <p>The upload ID from a previous <a>InitiateLayerUpload</a> operation to associate with the layer part upload.</p>
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>The upload ID from a previous <a>InitiateLayerUpload</a> operation to associate with the layer part upload.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}<br/>
     *
     * @param uploadId <p>The upload ID from a previous <a>InitiateLayerUpload</a> operation to associate with the layer part upload.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UploadLayerPartRequest withUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }

    /**
     * <p>The position of the first byte of the layer part witin the overall image layer.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>The position of the first byte of the layer part witin the overall image layer.</p>
     */
    public Long getPartFirstByte() {
        return partFirstByte;
    }

    /**
     * <p>The position of the first byte of the layer part witin the overall image layer.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param partFirstByte <p>The position of the first byte of the layer part witin the overall image layer.</p>
     */
    public void setPartFirstByte(Long partFirstByte) {
        this.partFirstByte = partFirstByte;
    }

    /**
     * <p>The position of the first byte of the layer part witin the overall image layer.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param partFirstByte <p>The position of the first byte of the layer part witin the overall image layer.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UploadLayerPartRequest withPartFirstByte(Long partFirstByte) {
        this.partFirstByte = partFirstByte;
        return this;
    }

    /**
     * <p>The position of the last byte of the layer part within the overall image layer.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>The position of the last byte of the layer part within the overall image layer.</p>
     */
    public Long getPartLastByte() {
        return partLastByte;
    }

    /**
     * <p>The position of the last byte of the layer part within the overall image layer.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param partLastByte <p>The position of the last byte of the layer part within the overall image layer.</p>
     */
    public void setPartLastByte(Long partLastByte) {
        this.partLastByte = partLastByte;
    }

    /**
     * <p>The position of the last byte of the layer part within the overall image layer.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param partLastByte <p>The position of the last byte of the layer part within the overall image layer.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UploadLayerPartRequest withPartLastByte(Long partLastByte) {
        this.partLastByte = partLastByte;
        return this;
    }

    /**
     * <p>The base64-encoded layer part payload.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20971520<br/>
     *
     * @return <p>The base64-encoded layer part payload.</p>
     */
    public java.nio.ByteBuffer getLayerPartBlob() {
        return layerPartBlob;
    }

    /**
     * <p>The base64-encoded layer part payload.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20971520<br/>
     *
     * @param layerPartBlob <p>The base64-encoded layer part payload.</p>
     */
    public void setLayerPartBlob(java.nio.ByteBuffer layerPartBlob) {
        this.layerPartBlob = layerPartBlob;
    }

    /**
     * <p>The base64-encoded layer part payload.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20971520<br/>
     *
     * @param layerPartBlob <p>The base64-encoded layer part payload.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UploadLayerPartRequest withLayerPartBlob(java.nio.ByteBuffer layerPartBlob) {
        this.layerPartBlob = layerPartBlob;
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
        if (getPartFirstByte() != null) sb.append("partFirstByte: " + getPartFirstByte() + ",");
        if (getPartLastByte() != null) sb.append("partLastByte: " + getPartLastByte() + ",");
        if (getLayerPartBlob() != null) sb.append("layerPartBlob: " + getLayerPartBlob());
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
        hashCode = prime * hashCode + ((getPartFirstByte() == null) ? 0 : getPartFirstByte().hashCode());
        hashCode = prime * hashCode + ((getPartLastByte() == null) ? 0 : getPartLastByte().hashCode());
        hashCode = prime * hashCode + ((getLayerPartBlob() == null) ? 0 : getLayerPartBlob().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UploadLayerPartRequest == false) return false;
        UploadLayerPartRequest other = (UploadLayerPartRequest)obj;

        if (other.getRegistryId() == null ^ this.getRegistryId() == null) return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false) return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null) return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false) return false;
        if (other.getUploadId() == null ^ this.getUploadId() == null) return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false) return false;
        if (other.getPartFirstByte() == null ^ this.getPartFirstByte() == null) return false;
        if (other.getPartFirstByte() != null && other.getPartFirstByte().equals(this.getPartFirstByte()) == false) return false;
        if (other.getPartLastByte() == null ^ this.getPartLastByte() == null) return false;
        if (other.getPartLastByte() != null && other.getPartLastByte().equals(this.getPartLastByte()) == false) return false;
        if (other.getLayerPartBlob() == null ^ this.getLayerPartBlob() == null) return false;
        if (other.getLayerPartBlob() != null && other.getLayerPartBlob().equals(this.getLayerPartBlob()) == false) return false;
        return true;
    }
}
