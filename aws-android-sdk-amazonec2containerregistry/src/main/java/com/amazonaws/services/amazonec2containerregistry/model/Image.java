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


/**
 * <p>An object representing an Amazon ECR image.</p>
 */
public class Image implements Serializable {
    /**
     * <p>The AWS account ID associated with the registry containing the image.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String registryId;

    /**
     * <p>The name of the repository associated with the image.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     */
    private String repositoryName;

    /**
     * <p>An object containing the image tag and image digest associated with an image.</p>
     */
    private ImageIdentifier imageId;

    /**
     * <p>The image manifest associated with the image.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4194304<br/>
     */
    private String imageManifest;

    /**
     * <p>The AWS account ID associated with the registry containing the image.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>The AWS account ID associated with the registry containing the image.</p>
     */
    public String getRegistryId() {
        return registryId;
    }

    /**
     * <p>The AWS account ID associated with the registry containing the image.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>The AWS account ID associated with the registry containing the image.</p>
     */
    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>The AWS account ID associated with the registry containing the image.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>The AWS account ID associated with the registry containing the image.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Image withRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    /**
     * <p>The name of the repository associated with the image.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @return <p>The name of the repository associated with the image.</p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>The name of the repository associated with the image.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @param repositoryName <p>The name of the repository associated with the image.</p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>The name of the repository associated with the image.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @param repositoryName <p>The name of the repository associated with the image.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Image withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>An object containing the image tag and image digest associated with an image.</p>
     *
     * @return <p>An object containing the image tag and image digest associated with an image.</p>
     */
    public ImageIdentifier getImageId() {
        return imageId;
    }

    /**
     * <p>An object containing the image tag and image digest associated with an image.</p>
     *
     * @param imageId <p>An object containing the image tag and image digest associated with an image.</p>
     */
    public void setImageId(ImageIdentifier imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>An object containing the image tag and image digest associated with an image.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId <p>An object containing the image tag and image digest associated with an image.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Image withImageId(ImageIdentifier imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * <p>The image manifest associated with the image.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4194304<br/>
     *
     * @return <p>The image manifest associated with the image.</p>
     */
    public String getImageManifest() {
        return imageManifest;
    }

    /**
     * <p>The image manifest associated with the image.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4194304<br/>
     *
     * @param imageManifest <p>The image manifest associated with the image.</p>
     */
    public void setImageManifest(String imageManifest) {
        this.imageManifest = imageManifest;
    }

    /**
     * <p>The image manifest associated with the image.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4194304<br/>
     *
     * @param imageManifest <p>The image manifest associated with the image.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Image withImageManifest(String imageManifest) {
        this.imageManifest = imageManifest;
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
        if (getImageId() != null) sb.append("imageId: " + getImageId() + ",");
        if (getImageManifest() != null) sb.append("imageManifest: " + getImageManifest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getImageManifest() == null) ? 0 : getImageManifest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Image == false) return false;
        Image other = (Image)obj;

        if (other.getRegistryId() == null ^ this.getRegistryId() == null) return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false) return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null) return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false) return false;
        if (other.getImageId() == null ^ this.getImageId() == null) return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false) return false;
        if (other.getImageManifest() == null ^ this.getImageManifest() == null) return false;
        if (other.getImageManifest() != null && other.getImageManifest().equals(this.getImageManifest()) == false) return false;
        return true;
    }
}
