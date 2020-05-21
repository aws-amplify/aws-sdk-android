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
 * Container for the <code>MultipartUpload</code> for the Amazon S3 object.
 * </p>
 */
public class MultipartUpload implements Serializable {
    /**
     * <p>
     * Upload ID that identifies the multipart upload.
     * </p>
     */
    private String uploadId;

    /**
     * <p>
     * Key of the object for which the multipart upload was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String key;

    /**
     * <p>
     * Date and time at which the multipart upload was initiated.
     * </p>
     */
    private java.util.Date initiated;

    /**
     * <p>
     * The class of storage used to store the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     */
    private String storageClass;

    /**
     * <p>
     * Specifies the owner of the object that is part of the multipart upload.
     * </p>
     */
    private Owner owner;

    /**
     * <p>
     * Identifies who initiated the multipart upload.
     * </p>
     */
    private Initiator initiator;

    /**
     * <p>
     * Upload ID that identifies the multipart upload.
     * </p>
     *
     * @return <p>
     *         Upload ID that identifies the multipart upload.
     *         </p>
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * <p>
     * Upload ID that identifies the multipart upload.
     * </p>
     *
     * @param uploadId <p>
     *            Upload ID that identifies the multipart upload.
     *            </p>
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * Upload ID that identifies the multipart upload.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploadId <p>
     *            Upload ID that identifies the multipart upload.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultipartUpload withUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }

    /**
     * <p>
     * Key of the object for which the multipart upload was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Key of the object for which the multipart upload was initiated.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * Key of the object for which the multipart upload was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Key of the object for which the multipart upload was
     *            initiated.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Key of the object for which the multipart upload was initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Key of the object for which the multipart upload was
     *            initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultipartUpload withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * Date and time at which the multipart upload was initiated.
     * </p>
     *
     * @return <p>
     *         Date and time at which the multipart upload was initiated.
     *         </p>
     */
    public java.util.Date getInitiated() {
        return initiated;
    }

    /**
     * <p>
     * Date and time at which the multipart upload was initiated.
     * </p>
     *
     * @param initiated <p>
     *            Date and time at which the multipart upload was initiated.
     *            </p>
     */
    public void setInitiated(java.util.Date initiated) {
        this.initiated = initiated;
    }

    /**
     * <p>
     * Date and time at which the multipart upload was initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param initiated <p>
     *            Date and time at which the multipart upload was initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultipartUpload withInitiated(java.util.Date initiated) {
        this.initiated = initiated;
        return this;
    }

    /**
     * <p>
     * The class of storage used to store the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @return <p>
     *         The class of storage used to store the object.
     *         </p>
     * @see StorageClass
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
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The class of storage used to store the object.
     *            </p>
     * @see StorageClass
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
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The class of storage used to store the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageClass
     */
    public MultipartUpload withStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * <p>
     * The class of storage used to store the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The class of storage used to store the object.
     *            </p>
     * @see StorageClass
     */
    public void setStorageClass(StorageClass storageClass) {
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
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The class of storage used to store the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageClass
     */
    public MultipartUpload withStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the owner of the object that is part of the multipart upload.
     * </p>
     *
     * @return <p>
     *         Specifies the owner of the object that is part of the multipart
     *         upload.
     *         </p>
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * <p>
     * Specifies the owner of the object that is part of the multipart upload.
     * </p>
     *
     * @param owner <p>
     *            Specifies the owner of the object that is part of the
     *            multipart upload.
     *            </p>
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * Specifies the owner of the object that is part of the multipart upload.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owner <p>
     *            Specifies the owner of the object that is part of the
     *            multipart upload.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultipartUpload withOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * Identifies who initiated the multipart upload.
     * </p>
     *
     * @return <p>
     *         Identifies who initiated the multipart upload.
     *         </p>
     */
    public Initiator getInitiator() {
        return initiator;
    }

    /**
     * <p>
     * Identifies who initiated the multipart upload.
     * </p>
     *
     * @param initiator <p>
     *            Identifies who initiated the multipart upload.
     *            </p>
     */
    public void setInitiator(Initiator initiator) {
        this.initiator = initiator;
    }

    /**
     * <p>
     * Identifies who initiated the multipart upload.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param initiator <p>
     *            Identifies who initiated the multipart upload.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultipartUpload withInitiator(Initiator initiator) {
        this.initiator = initiator;
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
        if (getUploadId() != null)
            sb.append("UploadId: " + getUploadId() + ",");
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getInitiated() != null)
            sb.append("Initiated: " + getInitiated() + ",");
        if (getStorageClass() != null)
            sb.append("StorageClass: " + getStorageClass() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner() + ",");
        if (getInitiator() != null)
            sb.append("Initiator: " + getInitiator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getInitiated() == null) ? 0 : getInitiated().hashCode());
        hashCode = prime * hashCode
                + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getInitiator() == null) ? 0 : getInitiator().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultipartUpload == false)
            return false;
        MultipartUpload other = (MultipartUpload) obj;

        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getInitiated() == null ^ this.getInitiated() == null)
            return false;
        if (other.getInitiated() != null
                && other.getInitiated().equals(this.getInitiated()) == false)
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
        if (other.getInitiator() == null ^ this.getInitiator() == null)
            return false;
        if (other.getInitiator() != null
                && other.getInitiator().equals(this.getInitiator()) == false)
            return false;
        return true;
    }
}
