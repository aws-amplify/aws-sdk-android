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
 * <p>An object representing a repository.</p>
 */
public class Repository implements Serializable {
    /**
     * <p>The Amazon Resource Name (ARN) that identifies the repository. The ARN contains the <code>arn:aws:ecr</code> namespace, followed by the region of the repository, AWS account ID of the repository owner, repository namespace, and repository name. For example, <code>arn:aws:ecr:region:012345678910:repository/test</code>.</p>
     */
    private String repositoryArn;

    /**
     * <p>The AWS account ID associated with the registry that contains the repository.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String registryId;

    /**
     * <p>The name of the repository.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     */
    private String repositoryName;

    /**
     * <p>The URI for the repository. You can use this URI for Docker <code>push</code> or <code>pull</code> operations.</p>
     */
    private String repositoryUri;

    /**
     * <p>The date and time, in JavaScript date format, when the repository was created.</p>
     */
    private java.util.Date createdAt;

    /**
     * <p>The tag mutability setting for the repository.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MUTABLE, IMMUTABLE
     */
    private String imageTagMutability;

    /**
     * <p>The image scanning configuration for a repository.</p>
     */
    private ImageScanningConfiguration imageScanningConfiguration;

    /**
     * <p>The Amazon Resource Name (ARN) that identifies the repository. The ARN contains the <code>arn:aws:ecr</code> namespace, followed by the region of the repository, AWS account ID of the repository owner, repository namespace, and repository name. For example, <code>arn:aws:ecr:region:012345678910:repository/test</code>.</p>
     *
     * @return <p>The Amazon Resource Name (ARN) that identifies the repository. The ARN contains the <code>arn:aws:ecr</code> namespace, followed by the region of the repository, AWS account ID of the repository owner, repository namespace, and repository name. For example, <code>arn:aws:ecr:region:012345678910:repository/test</code>.</p>
     */
    public String getRepositoryArn() {
        return repositoryArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) that identifies the repository. The ARN contains the <code>arn:aws:ecr</code> namespace, followed by the region of the repository, AWS account ID of the repository owner, repository namespace, and repository name. For example, <code>arn:aws:ecr:region:012345678910:repository/test</code>.</p>
     *
     * @param repositoryArn <p>The Amazon Resource Name (ARN) that identifies the repository. The ARN contains the <code>arn:aws:ecr</code> namespace, followed by the region of the repository, AWS account ID of the repository owner, repository namespace, and repository name. For example, <code>arn:aws:ecr:region:012345678910:repository/test</code>.</p>
     */
    public void setRepositoryArn(String repositoryArn) {
        this.repositoryArn = repositoryArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) that identifies the repository. The ARN contains the <code>arn:aws:ecr</code> namespace, followed by the region of the repository, AWS account ID of the repository owner, repository namespace, and repository name. For example, <code>arn:aws:ecr:region:012345678910:repository/test</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param repositoryArn <p>The Amazon Resource Name (ARN) that identifies the repository. The ARN contains the <code>arn:aws:ecr</code> namespace, followed by the region of the repository, AWS account ID of the repository owner, repository namespace, and repository name. For example, <code>arn:aws:ecr:region:012345678910:repository/test</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Repository withRepositoryArn(String repositoryArn) {
        this.repositoryArn = repositoryArn;
        return this;
    }

    /**
     * <p>The AWS account ID associated with the registry that contains the repository.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>The AWS account ID associated with the registry that contains the repository.</p>
     */
    public String getRegistryId() {
        return registryId;
    }

    /**
     * <p>The AWS account ID associated with the registry that contains the repository.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>The AWS account ID associated with the registry that contains the repository.</p>
     */
    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>The AWS account ID associated with the registry that contains the repository.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>The AWS account ID associated with the registry that contains the repository.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Repository withRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    /**
     * <p>The name of the repository.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @return <p>The name of the repository.</p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>The name of the repository.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @param repositoryName <p>The name of the repository.</p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>The name of the repository.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @param repositoryName <p>The name of the repository.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Repository withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>The URI for the repository. You can use this URI for Docker <code>push</code> or <code>pull</code> operations.</p>
     *
     * @return <p>The URI for the repository. You can use this URI for Docker <code>push</code> or <code>pull</code> operations.</p>
     */
    public String getRepositoryUri() {
        return repositoryUri;
    }

    /**
     * <p>The URI for the repository. You can use this URI for Docker <code>push</code> or <code>pull</code> operations.</p>
     *
     * @param repositoryUri <p>The URI for the repository. You can use this URI for Docker <code>push</code> or <code>pull</code> operations.</p>
     */
    public void setRepositoryUri(String repositoryUri) {
        this.repositoryUri = repositoryUri;
    }

    /**
     * <p>The URI for the repository. You can use this URI for Docker <code>push</code> or <code>pull</code> operations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param repositoryUri <p>The URI for the repository. You can use this URI for Docker <code>push</code> or <code>pull</code> operations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Repository withRepositoryUri(String repositoryUri) {
        this.repositoryUri = repositoryUri;
        return this;
    }

    /**
     * <p>The date and time, in JavaScript date format, when the repository was created.</p>
     *
     * @return <p>The date and time, in JavaScript date format, when the repository was created.</p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>The date and time, in JavaScript date format, when the repository was created.</p>
     *
     * @param createdAt <p>The date and time, in JavaScript date format, when the repository was created.</p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>The date and time, in JavaScript date format, when the repository was created.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAt <p>The date and time, in JavaScript date format, when the repository was created.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Repository withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>The tag mutability setting for the repository.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MUTABLE, IMMUTABLE
     *
     * @return <p>The tag mutability setting for the repository.</p>
     *
     * @see ImageTagMutability
     */
    public String getImageTagMutability() {
        return imageTagMutability;
    }

    /**
     * <p>The tag mutability setting for the repository.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MUTABLE, IMMUTABLE
     *
     * @param imageTagMutability <p>The tag mutability setting for the repository.</p>
     *
     * @see ImageTagMutability
     */
    public void setImageTagMutability(String imageTagMutability) {
        this.imageTagMutability = imageTagMutability;
    }

    /**
     * <p>The tag mutability setting for the repository.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MUTABLE, IMMUTABLE
     *
     * @param imageTagMutability <p>The tag mutability setting for the repository.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ImageTagMutability
     */
    public Repository withImageTagMutability(String imageTagMutability) {
        this.imageTagMutability = imageTagMutability;
        return this;
    }

    /**
     * <p>The tag mutability setting for the repository.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MUTABLE, IMMUTABLE
     *
     * @param imageTagMutability <p>The tag mutability setting for the repository.</p>
     *
     * @see ImageTagMutability
     */
    public void setImageTagMutability(ImageTagMutability imageTagMutability) {
        this.imageTagMutability = imageTagMutability.toString();
    }

    /**
     * <p>The tag mutability setting for the repository.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MUTABLE, IMMUTABLE
     *
     * @param imageTagMutability <p>The tag mutability setting for the repository.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ImageTagMutability
     */
    public Repository withImageTagMutability(ImageTagMutability imageTagMutability) {
        this.imageTagMutability = imageTagMutability.toString();
        return this;
    }

    /**
     * <p>The image scanning configuration for a repository.</p>
     *
     * @return <p>The image scanning configuration for a repository.</p>
     */
    public ImageScanningConfiguration getImageScanningConfiguration() {
        return imageScanningConfiguration;
    }

    /**
     * <p>The image scanning configuration for a repository.</p>
     *
     * @param imageScanningConfiguration <p>The image scanning configuration for a repository.</p>
     */
    public void setImageScanningConfiguration(ImageScanningConfiguration imageScanningConfiguration) {
        this.imageScanningConfiguration = imageScanningConfiguration;
    }

    /**
     * <p>The image scanning configuration for a repository.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageScanningConfiguration <p>The image scanning configuration for a repository.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Repository withImageScanningConfiguration(ImageScanningConfiguration imageScanningConfiguration) {
        this.imageScanningConfiguration = imageScanningConfiguration;
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
        if (getRepositoryArn() != null) sb.append("repositoryArn: " + getRepositoryArn() + ",");
        if (getRegistryId() != null) sb.append("registryId: " + getRegistryId() + ",");
        if (getRepositoryName() != null) sb.append("repositoryName: " + getRepositoryName() + ",");
        if (getRepositoryUri() != null) sb.append("repositoryUri: " + getRepositoryUri() + ",");
        if (getCreatedAt() != null) sb.append("createdAt: " + getCreatedAt() + ",");
        if (getImageTagMutability() != null) sb.append("imageTagMutability: " + getImageTagMutability() + ",");
        if (getImageScanningConfiguration() != null) sb.append("imageScanningConfiguration: " + getImageScanningConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryArn() == null) ? 0 : getRepositoryArn().hashCode());
        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getRepositoryUri() == null) ? 0 : getRepositoryUri().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getImageTagMutability() == null) ? 0 : getImageTagMutability().hashCode());
        hashCode = prime * hashCode + ((getImageScanningConfiguration() == null) ? 0 : getImageScanningConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Repository == false) return false;
        Repository other = (Repository)obj;

        if (other.getRepositoryArn() == null ^ this.getRepositoryArn() == null) return false;
        if (other.getRepositoryArn() != null && other.getRepositoryArn().equals(this.getRepositoryArn()) == false) return false;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null) return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false) return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null) return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false) return false;
        if (other.getRepositoryUri() == null ^ this.getRepositoryUri() == null) return false;
        if (other.getRepositoryUri() != null && other.getRepositoryUri().equals(this.getRepositoryUri()) == false) return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null) return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false) return false;
        if (other.getImageTagMutability() == null ^ this.getImageTagMutability() == null) return false;
        if (other.getImageTagMutability() != null && other.getImageTagMutability().equals(this.getImageTagMutability()) == false) return false;
        if (other.getImageScanningConfiguration() == null ^ this.getImageScanningConfiguration() == null) return false;
        if (other.getImageScanningConfiguration() != null && other.getImageScanningConfiguration().equals(this.getImageScanningConfiguration()) == false) return false;
        return true;
    }
}
