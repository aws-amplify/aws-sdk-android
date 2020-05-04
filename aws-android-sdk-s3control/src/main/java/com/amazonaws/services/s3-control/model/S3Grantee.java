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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


/**
 * <p/>
 */
public class S3Grantee implements Serializable {
    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>id, emailAddress, uri
     */
    private String typeIdentifier;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String identifier;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String displayName;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>id, emailAddress, uri
     *
     * @return <p/>
     *
     * @see S3GranteeTypeIdentifier
     */
    public String getTypeIdentifier() {
        return typeIdentifier;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>id, emailAddress, uri
     *
     * @param typeIdentifier <p/>
     *
     * @see S3GranteeTypeIdentifier
     */
    public void setTypeIdentifier(String typeIdentifier) {
        this.typeIdentifier = typeIdentifier;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>id, emailAddress, uri
     *
     * @param typeIdentifier <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3GranteeTypeIdentifier
     */
    public S3Grantee withTypeIdentifier(String typeIdentifier) {
        this.typeIdentifier = typeIdentifier;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>id, emailAddress, uri
     *
     * @param typeIdentifier <p/>
     *
     * @see S3GranteeTypeIdentifier
     */
    public void setTypeIdentifier(S3GranteeTypeIdentifier typeIdentifier) {
        this.typeIdentifier = typeIdentifier.toString();
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>id, emailAddress, uri
     *
     * @param typeIdentifier <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3GranteeTypeIdentifier
     */
    public S3Grantee withTypeIdentifier(S3GranteeTypeIdentifier typeIdentifier) {
        this.typeIdentifier = typeIdentifier.toString();
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p/>
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param identifier <p/>
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param identifier <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3Grantee withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p/>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param displayName <p/>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param displayName <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3Grantee withDisplayName(String displayName) {
        this.displayName = displayName;
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
        if (getTypeIdentifier() != null) sb.append("TypeIdentifier: " + getTypeIdentifier() + ",");
        if (getIdentifier() != null) sb.append("Identifier: " + getIdentifier() + ",");
        if (getDisplayName() != null) sb.append("DisplayName: " + getDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeIdentifier() == null) ? 0 : getTypeIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof S3Grantee == false) return false;
        S3Grantee other = (S3Grantee)obj;

        if (other.getTypeIdentifier() == null ^ this.getTypeIdentifier() == null) return false;
        if (other.getTypeIdentifier() != null && other.getTypeIdentifier().equals(this.getTypeIdentifier()) == false) return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null) return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false) return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null) return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false) return false;
        return true;
    }
}
