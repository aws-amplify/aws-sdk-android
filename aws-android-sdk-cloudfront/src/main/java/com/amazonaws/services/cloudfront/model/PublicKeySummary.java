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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * <p>
 * A complex data type for public key information.
 * </p>
 */
public class PublicKeySummary implements Serializable {
    /**
     * <p>
     * ID for public key information summary.
     * </p>
     */
    private String id;

    /**
     * <p>
     * Name for public key information summary.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Creation time for public key information summary.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * Encoded key for public key information summary.
     * </p>
     */
    private String encodedKey;

    /**
     * <p>
     * Comment for public key information summary.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * ID for public key information summary.
     * </p>
     *
     * @return <p>
     *         ID for public key information summary.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * ID for public key information summary.
     * </p>
     *
     * @param id <p>
     *            ID for public key information summary.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * ID for public key information summary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            ID for public key information summary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicKeySummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * Name for public key information summary.
     * </p>
     *
     * @return <p>
     *         Name for public key information summary.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Name for public key information summary.
     * </p>
     *
     * @param name <p>
     *            Name for public key information summary.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name for public key information summary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            Name for public key information summary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicKeySummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Creation time for public key information summary.
     * </p>
     *
     * @return <p>
     *         Creation time for public key information summary.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * Creation time for public key information summary.
     * </p>
     *
     * @param createdTime <p>
     *            Creation time for public key information summary.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * Creation time for public key information summary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            Creation time for public key information summary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicKeySummary withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * Encoded key for public key information summary.
     * </p>
     *
     * @return <p>
     *         Encoded key for public key information summary.
     *         </p>
     */
    public String getEncodedKey() {
        return encodedKey;
    }

    /**
     * <p>
     * Encoded key for public key information summary.
     * </p>
     *
     * @param encodedKey <p>
     *            Encoded key for public key information summary.
     *            </p>
     */
    public void setEncodedKey(String encodedKey) {
        this.encodedKey = encodedKey;
    }

    /**
     * <p>
     * Encoded key for public key information summary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encodedKey <p>
     *            Encoded key for public key information summary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicKeySummary withEncodedKey(String encodedKey) {
        this.encodedKey = encodedKey;
        return this;
    }

    /**
     * <p>
     * Comment for public key information summary.
     * </p>
     *
     * @return <p>
     *         Comment for public key information summary.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * Comment for public key information summary.
     * </p>
     *
     * @param comment <p>
     *            Comment for public key information summary.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * Comment for public key information summary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param comment <p>
     *            Comment for public key information summary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicKeySummary withComment(String comment) {
        this.comment = comment;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getEncodedKey() != null)
            sb.append("EncodedKey: " + getEncodedKey() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getEncodedKey() == null) ? 0 : getEncodedKey().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublicKeySummary == false)
            return false;
        PublicKeySummary other = (PublicKeySummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getEncodedKey() == null ^ this.getEncodedKey() == null)
            return false;
        if (other.getEncodedKey() != null
                && other.getEncodedKey().equals(this.getEncodedKey()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }
}
