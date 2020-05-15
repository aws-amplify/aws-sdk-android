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
 * <p>Creates or updates the image manifest and tags associated with an image.</p> <p>When an image is pushed and all new image layers have been uploaded, the PutImage API is called once to create or update the image manifest and the tags associated with the image.</p> <note> <p>This operation is used by the Amazon ECR proxy and is not generally used by customers for pulling and pushing images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.</p> </note>
 */
public class PutImageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The AWS account ID associated with the registry that contains the repository in which to put the image. If you do not specify a registry, the default registry is assumed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String registryId;

    /**
     * <p>The name of the repository in which to put the image.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     */
    private String repositoryName;

    /**
     * <p>The image manifest corresponding to the image to be uploaded.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4194304<br/>
     */
    private String imageManifest;

    /**
     * <p>The media type of the image manifest. If you push an image manifest that does not contain the <code>mediaType</code> field, you must specify the <code>imageManifestMediaType</code> in the request.</p>
     */
    private String imageManifestMediaType;

    /**
     * <p>The tag to associate with the image. This parameter is required for images that use the Docker Image Manifest V2 Schema 2 or OCI formats.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String imageTag;

    /**
     * <p>The AWS account ID associated with the registry that contains the repository in which to put the image. If you do not specify a registry, the default registry is assumed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>The AWS account ID associated with the registry that contains the repository in which to put the image. If you do not specify a registry, the default registry is assumed.</p>
     */
    public String getRegistryId() {
        return registryId;
    }

    /**
     * <p>The AWS account ID associated with the registry that contains the repository in which to put the image. If you do not specify a registry, the default registry is assumed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>The AWS account ID associated with the registry that contains the repository in which to put the image. If you do not specify a registry, the default registry is assumed.</p>
     */
    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>The AWS account ID associated with the registry that contains the repository in which to put the image. If you do not specify a registry, the default registry is assumed.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>The AWS account ID associated with the registry that contains the repository in which to put the image. If you do not specify a registry, the default registry is assumed.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutImageRequest withRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    /**
     * <p>The name of the repository in which to put the image.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @return <p>The name of the repository in which to put the image.</p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>The name of the repository in which to put the image.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @param repositoryName <p>The name of the repository in which to put the image.</p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>The name of the repository in which to put the image.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @param repositoryName <p>The name of the repository in which to put the image.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutImageRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>The image manifest corresponding to the image to be uploaded.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4194304<br/>
     *
     * @return <p>The image manifest corresponding to the image to be uploaded.</p>
     */
    public String getImageManifest() {
        return imageManifest;
    }

    /**
     * <p>The image manifest corresponding to the image to be uploaded.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4194304<br/>
     *
     * @param imageManifest <p>The image manifest corresponding to the image to be uploaded.</p>
     */
    public void setImageManifest(String imageManifest) {
        this.imageManifest = imageManifest;
    }

    /**
     * <p>The image manifest corresponding to the image to be uploaded.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4194304<br/>
     *
     * @param imageManifest <p>The image manifest corresponding to the image to be uploaded.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutImageRequest withImageManifest(String imageManifest) {
        this.imageManifest = imageManifest;
        return this;
    }

    /**
     * <p>The media type of the image manifest. If you push an image manifest that does not contain the <code>mediaType</code> field, you must specify the <code>imageManifestMediaType</code> in the request.</p>
     *
     * @return <p>The media type of the image manifest. If you push an image manifest that does not contain the <code>mediaType</code> field, you must specify the <code>imageManifestMediaType</code> in the request.</p>
     */
    public String getImageManifestMediaType() {
        return imageManifestMediaType;
    }

    /**
     * <p>The media type of the image manifest. If you push an image manifest that does not contain the <code>mediaType</code> field, you must specify the <code>imageManifestMediaType</code> in the request.</p>
     *
     * @param imageManifestMediaType <p>The media type of the image manifest. If you push an image manifest that does not contain the <code>mediaType</code> field, you must specify the <code>imageManifestMediaType</code> in the request.</p>
     */
    public void setImageManifestMediaType(String imageManifestMediaType) {
        this.imageManifestMediaType = imageManifestMediaType;
    }

    /**
     * <p>The media type of the image manifest. If you push an image manifest that does not contain the <code>mediaType</code> field, you must specify the <code>imageManifestMediaType</code> in the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageManifestMediaType <p>The media type of the image manifest. If you push an image manifest that does not contain the <code>mediaType</code> field, you must specify the <code>imageManifestMediaType</code> in the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutImageRequest withImageManifestMediaType(String imageManifestMediaType) {
        this.imageManifestMediaType = imageManifestMediaType;
        return this;
    }

    /**
     * <p>The tag to associate with the image. This parameter is required for images that use the Docker Image Manifest V2 Schema 2 or OCI formats.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>The tag to associate with the image. This parameter is required for images that use the Docker Image Manifest V2 Schema 2 or OCI formats.</p>
     */
    public String getImageTag() {
        return imageTag;
    }

    /**
     * <p>The tag to associate with the image. This parameter is required for images that use the Docker Image Manifest V2 Schema 2 or OCI formats.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param imageTag <p>The tag to associate with the image. This parameter is required for images that use the Docker Image Manifest V2 Schema 2 or OCI formats.</p>
     */
    public void setImageTag(String imageTag) {
        this.imageTag = imageTag;
    }

    /**
     * <p>The tag to associate with the image. This parameter is required for images that use the Docker Image Manifest V2 Schema 2 or OCI formats.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param imageTag <p>The tag to associate with the image. This parameter is required for images that use the Docker Image Manifest V2 Schema 2 or OCI formats.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutImageRequest withImageTag(String imageTag) {
        this.imageTag = imageTag;
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
        if (getImageManifest() != null) sb.append("imageManifest: " + getImageManifest() + ",");
        if (getImageManifestMediaType() != null) sb.append("imageManifestMediaType: " + getImageManifestMediaType() + ",");
        if (getImageTag() != null) sb.append("imageTag: " + getImageTag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getImageManifest() == null) ? 0 : getImageManifest().hashCode());
        hashCode = prime * hashCode + ((getImageManifestMediaType() == null) ? 0 : getImageManifestMediaType().hashCode());
        hashCode = prime * hashCode + ((getImageTag() == null) ? 0 : getImageTag().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutImageRequest == false) return false;
        PutImageRequest other = (PutImageRequest)obj;

        if (other.getRegistryId() == null ^ this.getRegistryId() == null) return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false) return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null) return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false) return false;
        if (other.getImageManifest() == null ^ this.getImageManifest() == null) return false;
        if (other.getImageManifest() != null && other.getImageManifest().equals(this.getImageManifest()) == false) return false;
        if (other.getImageManifestMediaType() == null ^ this.getImageManifestMediaType() == null) return false;
        if (other.getImageManifestMediaType() != null && other.getImageManifestMediaType().equals(this.getImageManifestMediaType()) == false) return false;
        if (other.getImageTag() == null ^ this.getImageTag() == null) return false;
        if (other.getImageTag() != null && other.getImageTag().equals(this.getImageTag()) == false) return false;
        return true;
    }
}
