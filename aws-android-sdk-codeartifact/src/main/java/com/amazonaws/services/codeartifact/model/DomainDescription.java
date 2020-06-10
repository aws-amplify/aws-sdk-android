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

package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a domain. A domain is a container for repositories. When
 * you create a domain, it is empty until you add one or more repositories.
 * </p>
 */
public class DomainDescription implements Serializable {
    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     */
    private String name;

    /**
     * <p>
     * The AWS account ID that owns the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String owner;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     */
    private String arn;

    /**
     * <p>
     * The current status of a domain. The valid values are
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Deleted
     */
    private String status;

    /**
     * <p>
     * A timestamp that represents the date and time the domain was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The ARN of an AWS Key Management Service (AWS KMS) key associated with a
     * domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     */
    private String encryptionKey;

    /**
     * <p>
     * The number of repositories in the domain.
     * </p>
     */
    private Integer repositoryCount;

    /**
     * <p>
     * The total size of all assets in the domain.
     * </p>
     */
    private Long assetSizeBytes;

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @return <p>
     *         The name of the domain.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @param name <p>
     *            The name of the domain.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @param name <p>
     *            The name of the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The AWS account ID that owns the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>
     *         The AWS account ID that owns the domain.
     *         </p>
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p>
     * The AWS account ID that owns the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param owner <p>
     *            The AWS account ID that owns the domain.
     *            </p>
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The AWS account ID that owns the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param owner <p>
     *            The AWS account ID that owns the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainDescription withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the domain.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the domain.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainDescription withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The current status of a domain. The valid values are
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Deleted
     *
     * @return <p>
     *         The current status of a domain. The valid values are
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Active</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Deleted</code>
     *         </p>
     *         </li>
     *         </ul>
     * @see DomainStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of a domain. The valid values are
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Deleted
     *
     * @param status <p>
     *            The current status of a domain. The valid values are
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Active</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Deleted</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see DomainStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of a domain. The valid values are
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Deleted
     *
     * @param status <p>
     *            The current status of a domain. The valid values are
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Active</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Deleted</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainStatus
     */
    public DomainDescription withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of a domain. The valid values are
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Deleted
     *
     * @param status <p>
     *            The current status of a domain. The valid values are
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Active</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Deleted</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see DomainStatus
     */
    public void setStatus(DomainStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of a domain. The valid values are
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Deleted
     *
     * @param status <p>
     *            The current status of a domain. The valid values are
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Active</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Deleted</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainStatus
     */
    public DomainDescription withStatus(DomainStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp that represents the date and time the domain was created.
     * </p>
     *
     * @return <p>
     *         A timestamp that represents the date and time the domain was
     *         created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * A timestamp that represents the date and time the domain was created.
     * </p>
     *
     * @param createdTime <p>
     *            A timestamp that represents the date and time the domain was
     *            created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * A timestamp that represents the date and time the domain was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            A timestamp that represents the date and time the domain was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainDescription withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The ARN of an AWS Key Management Service (AWS KMS) key associated with a
     * domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @return <p>
     *         The ARN of an AWS Key Management Service (AWS KMS) key associated
     *         with a domain.
     *         </p>
     */
    public String getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * <p>
     * The ARN of an AWS Key Management Service (AWS KMS) key associated with a
     * domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param encryptionKey <p>
     *            The ARN of an AWS Key Management Service (AWS KMS) key
     *            associated with a domain.
     *            </p>
     */
    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The ARN of an AWS Key Management Service (AWS KMS) key associated with a
     * domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param encryptionKey <p>
     *            The ARN of an AWS Key Management Service (AWS KMS) key
     *            associated with a domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainDescription withEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    /**
     * <p>
     * The number of repositories in the domain.
     * </p>
     *
     * @return <p>
     *         The number of repositories in the domain.
     *         </p>
     */
    public Integer getRepositoryCount() {
        return repositoryCount;
    }

    /**
     * <p>
     * The number of repositories in the domain.
     * </p>
     *
     * @param repositoryCount <p>
     *            The number of repositories in the domain.
     *            </p>
     */
    public void setRepositoryCount(Integer repositoryCount) {
        this.repositoryCount = repositoryCount;
    }

    /**
     * <p>
     * The number of repositories in the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repositoryCount <p>
     *            The number of repositories in the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainDescription withRepositoryCount(Integer repositoryCount) {
        this.repositoryCount = repositoryCount;
        return this;
    }

    /**
     * <p>
     * The total size of all assets in the domain.
     * </p>
     *
     * @return <p>
     *         The total size of all assets in the domain.
     *         </p>
     */
    public Long getAssetSizeBytes() {
        return assetSizeBytes;
    }

    /**
     * <p>
     * The total size of all assets in the domain.
     * </p>
     *
     * @param assetSizeBytes <p>
     *            The total size of all assets in the domain.
     *            </p>
     */
    public void setAssetSizeBytes(Long assetSizeBytes) {
        this.assetSizeBytes = assetSizeBytes;
    }

    /**
     * <p>
     * The total size of all assets in the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetSizeBytes <p>
     *            The total size of all assets in the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainDescription withAssetSizeBytes(Long assetSizeBytes) {
        this.assetSizeBytes = assetSizeBytes;
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
            sb.append("name: " + getName() + ",");
        if (getOwner() != null)
            sb.append("owner: " + getOwner() + ",");
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getCreatedTime() != null)
            sb.append("createdTime: " + getCreatedTime() + ",");
        if (getEncryptionKey() != null)
            sb.append("encryptionKey: " + getEncryptionKey() + ",");
        if (getRepositoryCount() != null)
            sb.append("repositoryCount: " + getRepositoryCount() + ",");
        if (getAssetSizeBytes() != null)
            sb.append("assetSizeBytes: " + getAssetSizeBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode
                + ((getRepositoryCount() == null) ? 0 : getRepositoryCount().hashCode());
        hashCode = prime * hashCode
                + ((getAssetSizeBytes() == null) ? 0 : getAssetSizeBytes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainDescription == false)
            return false;
        DomainDescription other = (DomainDescription) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null
                && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getRepositoryCount() == null ^ this.getRepositoryCount() == null)
            return false;
        if (other.getRepositoryCount() != null
                && other.getRepositoryCount().equals(this.getRepositoryCount()) == false)
            return false;
        if (other.getAssetSizeBytes() == null ^ this.getAssetSizeBytes() == null)
            return false;
        if (other.getAssetSizeBytes() != null
                && other.getAssetSizeBytes().equals(this.getAssetSizeBytes()) == false)
            return false;
        return true;
    }
}
