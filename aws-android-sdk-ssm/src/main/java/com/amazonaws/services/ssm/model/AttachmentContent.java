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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * A structure that includes attributes that describe a document attachment.
 * </p>
 */
public class AttachmentContent implements Serializable {
    /**
     * <p>
     * The name of an attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>
     * The size of an attachment in bytes.
     * </p>
     */
    private Long size;

    /**
     * <p>
     * The cryptographic hash value of the document content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String hash;

    /**
     * <p>
     * The hash algorithm used to calculate the hash value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256
     */
    private String hashType;

    /**
     * <p>
     * The URL location of the attachment content.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The name of an attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>
     *         The name of an attachment.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of an attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of an attachment.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of an attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of an attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachmentContent withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The size of an attachment in bytes.
     * </p>
     *
     * @return <p>
     *         The size of an attachment in bytes.
     *         </p>
     */
    public Long getSize() {
        return size;
    }

    /**
     * <p>
     * The size of an attachment in bytes.
     * </p>
     *
     * @param size <p>
     *            The size of an attachment in bytes.
     *            </p>
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of an attachment in bytes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param size <p>
     *            The size of an attachment in bytes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachmentContent withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * <p>
     * The cryptographic hash value of the document content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The cryptographic hash value of the document content.
     *         </p>
     */
    public String getHash() {
        return hash;
    }

    /**
     * <p>
     * The cryptographic hash value of the document content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param hash <p>
     *            The cryptographic hash value of the document content.
     *            </p>
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * <p>
     * The cryptographic hash value of the document content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param hash <p>
     *            The cryptographic hash value of the document content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachmentContent withHash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * <p>
     * The hash algorithm used to calculate the hash value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256
     *
     * @return <p>
     *         The hash algorithm used to calculate the hash value.
     *         </p>
     * @see AttachmentHashType
     */
    public String getHashType() {
        return hashType;
    }

    /**
     * <p>
     * The hash algorithm used to calculate the hash value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256
     *
     * @param hashType <p>
     *            The hash algorithm used to calculate the hash value.
     *            </p>
     * @see AttachmentHashType
     */
    public void setHashType(String hashType) {
        this.hashType = hashType;
    }

    /**
     * <p>
     * The hash algorithm used to calculate the hash value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256
     *
     * @param hashType <p>
     *            The hash algorithm used to calculate the hash value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AttachmentHashType
     */
    public AttachmentContent withHashType(String hashType) {
        this.hashType = hashType;
        return this;
    }

    /**
     * <p>
     * The hash algorithm used to calculate the hash value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256
     *
     * @param hashType <p>
     *            The hash algorithm used to calculate the hash value.
     *            </p>
     * @see AttachmentHashType
     */
    public void setHashType(AttachmentHashType hashType) {
        this.hashType = hashType.toString();
    }

    /**
     * <p>
     * The hash algorithm used to calculate the hash value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256
     *
     * @param hashType <p>
     *            The hash algorithm used to calculate the hash value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AttachmentHashType
     */
    public AttachmentContent withHashType(AttachmentHashType hashType) {
        this.hashType = hashType.toString();
        return this;
    }

    /**
     * <p>
     * The URL location of the attachment content.
     * </p>
     *
     * @return <p>
     *         The URL location of the attachment content.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The URL location of the attachment content.
     * </p>
     *
     * @param url <p>
     *            The URL location of the attachment content.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL location of the attachment content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param url <p>
     *            The URL location of the attachment content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachmentContent withUrl(String url) {
        this.url = url;
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
            sb.append("Name: " + getName() + ",");
        if (getSize() != null)
            sb.append("Size: " + getSize() + ",");
        if (getHash() != null)
            sb.append("Hash: " + getHash() + ",");
        if (getHashType() != null)
            sb.append("HashType: " + getHashType() + ",");
        if (getUrl() != null)
            sb.append("Url: " + getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getHash() == null) ? 0 : getHash().hashCode());
        hashCode = prime * hashCode + ((getHashType() == null) ? 0 : getHashType().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachmentContent == false)
            return false;
        AttachmentContent other = (AttachmentContent) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getHash() == null ^ this.getHash() == null)
            return false;
        if (other.getHash() != null && other.getHash().equals(this.getHash()) == false)
            return false;
        if (other.getHashType() == null ^ this.getHashType() == null)
            return false;
        if (other.getHashType() != null && other.getHashType().equals(this.getHashType()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }
}
