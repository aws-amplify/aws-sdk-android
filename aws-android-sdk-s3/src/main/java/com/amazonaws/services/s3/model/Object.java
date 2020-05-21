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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * An object consists of data and its descriptive metadata.
 * </p>
 */
public class Object implements Serializable {
    /**
     * <p>
     * The name that you assign to an object. You use the object key to retrieve
     * the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String key;

    /**
     * <p>
     * The date the Object was Last Modified
     * </p>
     */
    private java.util.Date lastModified;

    /**
     * <p>
     * The entity tag is an MD5 hash of the object. ETag reflects only changes
     * to the contents of an object, not its metadata.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * Size in bytes of the object
     * </p>
     */
    private Integer size;

    /**
     * <p>
     * The class of storage used to store the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, GLACIER,
     * STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE
     */
    private String storageClass;

    /**
     * <p>
     * The owner of the object
     * </p>
     */
    private Owner owner;

    /**
     * <p>
     * The name that you assign to an object. You use the object key to retrieve
     * the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The name that you assign to an object. You use the object key to
     *         retrieve the object.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The name that you assign to an object. You use the object key to retrieve
     * the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            The name that you assign to an object. You use the object key
     *            to retrieve the object.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name that you assign to an object. You use the object key to retrieve
     * the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            The name that you assign to an object. You use the object key
     *            to retrieve the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Object withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The date the Object was Last Modified
     * </p>
     *
     * @return <p>
     *         The date the Object was Last Modified
     *         </p>
     */
    public java.util.Date getLastModified() {
        return lastModified;
    }

    /**
     * <p>
     * The date the Object was Last Modified
     * </p>
     *
     * @param lastModified <p>
     *            The date the Object was Last Modified
     *            </p>
     */
    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date the Object was Last Modified
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModified <p>
     *            The date the Object was Last Modified
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Object withLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * <p>
     * The entity tag is an MD5 hash of the object. ETag reflects only changes
     * to the contents of an object, not its metadata.
     * </p>
     *
     * @return <p>
     *         The entity tag is an MD5 hash of the object. ETag reflects only
     *         changes to the contents of an object, not its metadata.
     *         </p>
     */
    public String getETag() {
        return eTag;
    }

    /**
     * <p>
     * The entity tag is an MD5 hash of the object. ETag reflects only changes
     * to the contents of an object, not its metadata.
     * </p>
     *
     * @param eTag <p>
     *            The entity tag is an MD5 hash of the object. ETag reflects
     *            only changes to the contents of an object, not its metadata.
     *            </p>
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The entity tag is an MD5 hash of the object. ETag reflects only changes
     * to the contents of an object, not its metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eTag <p>
     *            The entity tag is an MD5 hash of the object. ETag reflects
     *            only changes to the contents of an object, not its metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Object withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * <p>
     * Size in bytes of the object
     * </p>
     *
     * @return <p>
     *         Size in bytes of the object
     *         </p>
     */
    public Integer getSize() {
        return size;
    }

    /**
     * <p>
     * Size in bytes of the object
     * </p>
     *
     * @param size <p>
     *            Size in bytes of the object
     *            </p>
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * Size in bytes of the object
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param size <p>
     *            Size in bytes of the object
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Object withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * <p>
     * The class of storage used to store the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, GLACIER,
     * STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE
     *
     * @return <p>
     *         The class of storage used to store the object.
     *         </p>
     * @see ObjectStorageClass
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * <p>
     * The class of storage used to store the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, GLACIER,
     * STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The class of storage used to store the object.
     *            </p>
     * @see ObjectStorageClass
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * The class of storage used to store the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, GLACIER,
     * STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The class of storage used to store the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectStorageClass
     */
    public Object withStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * <p>
     * The class of storage used to store the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, GLACIER,
     * STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The class of storage used to store the object.
     *            </p>
     * @see ObjectStorageClass
     */
    public void setStorageClass(ObjectStorageClass storageClass) {
        this.storageClass = storageClass.toString();
    }

    /**
     * <p>
     * The class of storage used to store the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, GLACIER,
     * STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The class of storage used to store the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectStorageClass
     */
    public Object withStorageClass(ObjectStorageClass storageClass) {
        this.storageClass = storageClass.toString();
        return this;
    }

    /**
     * <p>
     * The owner of the object
     * </p>
     *
     * @return <p>
     *         The owner of the object
     *         </p>
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * <p>
     * The owner of the object
     * </p>
     *
     * @param owner <p>
     *            The owner of the object
     *            </p>
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the object
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owner <p>
     *            The owner of the object
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Object withOwner(Owner owner) {
        this.owner = owner;
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getLastModified() != null)
            sb.append("LastModified: " + getLastModified() + ",");
        if (getETag() != null)
            sb.append("ETag: " + getETag() + ",");
        if (getSize() != null)
            sb.append("Size: " + getSize() + ",");
        if (getStorageClass() != null)
            sb.append("StorageClass: " + getStorageClass() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode
                + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode
                + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Object == false)
            return false;
        Object other = (Object) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null
                && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null
                && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        return true;
    }
}
