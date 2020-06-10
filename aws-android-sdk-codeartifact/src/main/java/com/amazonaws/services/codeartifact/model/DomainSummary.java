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
 * Information about a domain, including its name, Amazon Resource Name (ARN),
 * and status. The <a href=
 * "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListDomains.html"
 * > <code>ListDomains</code> </a> operation returns a list of
 * <code>DomainSummary</code> objects.
 * </p>
 */
public class DomainSummary implements Serializable {
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
     * The 12-digit account number of the AWS account that owns the domain. It
     * does not include dashes or spaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String owner;

    /**
     * <p>
     * The ARN of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     */
    private String arn;

    /**
     * <p>
     * A string that contains the status of the domain. The valid values are:
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
     * A timestamp that contains the date and time the domain was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The key used to encrypt the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     */
    private String encryptionKey;

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
    public DomainSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It
     * does not include dashes or spaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>
     *         The 12-digit account number of the AWS account that owns the
     *         domain. It does not include dashes or spaces.
     *         </p>
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It
     * does not include dashes or spaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param owner <p>
     *            The 12-digit account number of the AWS account that owns the
     *            domain. It does not include dashes or spaces.
     *            </p>
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It
     * does not include dashes or spaces.
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
     *            The 12-digit account number of the AWS account that owns the
     *            domain. It does not include dashes or spaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainSummary withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * The ARN of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @return <p>
     *         The ARN of the domain.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The ARN of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param arn <p>
     *            The ARN of the domain.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the domain.
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
     *            The ARN of the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainSummary withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * A string that contains the status of the domain. The valid values are:
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
     *         A string that contains the status of the domain. The valid values
     *         are:
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
     * A string that contains the status of the domain. The valid values are:
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
     *            A string that contains the status of the domain. The valid
     *            values are:
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
     * A string that contains the status of the domain. The valid values are:
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
     *            A string that contains the status of the domain. The valid
     *            values are:
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
    public DomainSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * A string that contains the status of the domain. The valid values are:
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
     *            A string that contains the status of the domain. The valid
     *            values are:
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
     * A string that contains the status of the domain. The valid values are:
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
     *            A string that contains the status of the domain. The valid
     *            values are:
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
    public DomainSummary withStatus(DomainStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp that contains the date and time the domain was created.
     * </p>
     *
     * @return <p>
     *         A timestamp that contains the date and time the domain was
     *         created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * A timestamp that contains the date and time the domain was created.
     * </p>
     *
     * @param createdTime <p>
     *            A timestamp that contains the date and time the domain was
     *            created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * A timestamp that contains the date and time the domain was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            A timestamp that contains the date and time the domain was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainSummary withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The key used to encrypt the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @return <p>
     *         The key used to encrypt the domain.
     *         </p>
     */
    public String getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * <p>
     * The key used to encrypt the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param encryptionKey <p>
     *            The key used to encrypt the domain.
     *            </p>
     */
    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The key used to encrypt the domain.
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
     *            The key used to encrypt the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainSummary withEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
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
            sb.append("encryptionKey: " + getEncryptionKey());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainSummary == false)
            return false;
        DomainSummary other = (DomainSummary) obj;

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
        return true;
    }
}
