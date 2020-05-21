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
 * Describes an Amazon S3 location that will receive the results of the restore
 * request.
 * </p>
 */
public class S3Location implements Serializable {
    /**
     * <p>
     * The name of the bucket where the restore results will be placed.
     * </p>
     */
    private String bucketName;

    /**
     * <p>
     * The prefix that is prepended to the restore results for this request.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * Contains the type of server-side encryption used.
     * </p>
     */
    private Encryption encryption;

    /**
     * <p>
     * The canned ACL to apply to the restore results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, aws-exec-read, bucket-owner-read,
     * bucket-owner-full-control
     */
    private String cannedACL;

    /**
     * <p>
     * A list of grants that control access to the staged results.
     * </p>
     */
    private java.util.List<Grant> accessControlList;

    /**
     * <p>
     * The tag-set that is applied to the restore results.
     * </p>
     */
    private Tagging tagging;

    /**
     * <p>
     * A list of metadata to store with the restore results in S3.
     * </p>
     */
    private java.util.List<MetadataEntry> userMetadata;

    /**
     * <p>
     * The class of storage used to store the restore results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     */
    private String storageClass;

    /**
     * <p>
     * The name of the bucket where the restore results will be placed.
     * </p>
     *
     * @return <p>
     *         The name of the bucket where the restore results will be placed.
     *         </p>
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * <p>
     * The name of the bucket where the restore results will be placed.
     * </p>
     *
     * @param bucketName <p>
     *            The name of the bucket where the restore results will be
     *            placed.
     *            </p>
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the bucket where the restore results will be placed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketName <p>
     *            The name of the bucket where the restore results will be
     *            placed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Location withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * <p>
     * The prefix that is prepended to the restore results for this request.
     * </p>
     *
     * @return <p>
     *         The prefix that is prepended to the restore results for this
     *         request.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * The prefix that is prepended to the restore results for this request.
     * </p>
     *
     * @param prefix <p>
     *            The prefix that is prepended to the restore results for this
     *            request.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The prefix that is prepended to the restore results for this request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            The prefix that is prepended to the restore results for this
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Location withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * Contains the type of server-side encryption used.
     * </p>
     *
     * @return <p>
     *         Contains the type of server-side encryption used.
     *         </p>
     */
    public Encryption getEncryption() {
        return encryption;
    }

    /**
     * <p>
     * Contains the type of server-side encryption used.
     * </p>
     *
     * @param encryption <p>
     *            Contains the type of server-side encryption used.
     *            </p>
     */
    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    /**
     * <p>
     * Contains the type of server-side encryption used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryption <p>
     *            Contains the type of server-side encryption used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Location withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * <p>
     * The canned ACL to apply to the restore results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, aws-exec-read, bucket-owner-read,
     * bucket-owner-full-control
     *
     * @return <p>
     *         The canned ACL to apply to the restore results.
     *         </p>
     * @see ObjectCannedACL
     */
    public String getCannedACL() {
        return cannedACL;
    }

    /**
     * <p>
     * The canned ACL to apply to the restore results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, aws-exec-read, bucket-owner-read,
     * bucket-owner-full-control
     *
     * @param cannedACL <p>
     *            The canned ACL to apply to the restore results.
     *            </p>
     * @see ObjectCannedACL
     */
    public void setCannedACL(String cannedACL) {
        this.cannedACL = cannedACL;
    }

    /**
     * <p>
     * The canned ACL to apply to the restore results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, aws-exec-read, bucket-owner-read,
     * bucket-owner-full-control
     *
     * @param cannedACL <p>
     *            The canned ACL to apply to the restore results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectCannedACL
     */
    public S3Location withCannedACL(String cannedACL) {
        this.cannedACL = cannedACL;
        return this;
    }

    /**
     * <p>
     * The canned ACL to apply to the restore results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, aws-exec-read, bucket-owner-read,
     * bucket-owner-full-control
     *
     * @param cannedACL <p>
     *            The canned ACL to apply to the restore results.
     *            </p>
     * @see ObjectCannedACL
     */
    public void setCannedACL(ObjectCannedACL cannedACL) {
        this.cannedACL = cannedACL.toString();
    }

    /**
     * <p>
     * The canned ACL to apply to the restore results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, aws-exec-read, bucket-owner-read,
     * bucket-owner-full-control
     *
     * @param cannedACL <p>
     *            The canned ACL to apply to the restore results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectCannedACL
     */
    public S3Location withCannedACL(ObjectCannedACL cannedACL) {
        this.cannedACL = cannedACL.toString();
        return this;
    }

    /**
     * <p>
     * A list of grants that control access to the staged results.
     * </p>
     *
     * @return <p>
     *         A list of grants that control access to the staged results.
     *         </p>
     */
    public java.util.List<Grant> getAccessControlList() {
        return accessControlList;
    }

    /**
     * <p>
     * A list of grants that control access to the staged results.
     * </p>
     *
     * @param accessControlList <p>
     *            A list of grants that control access to the staged results.
     *            </p>
     */
    public void setAccessControlList(java.util.Collection<Grant> accessControlList) {
        if (accessControlList == null) {
            this.accessControlList = null;
            return;
        }

        this.accessControlList = new java.util.ArrayList<Grant>(accessControlList);
    }

    /**
     * <p>
     * A list of grants that control access to the staged results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessControlList <p>
     *            A list of grants that control access to the staged results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Location withAccessControlList(Grant... accessControlList) {
        if (getAccessControlList() == null) {
            this.accessControlList = new java.util.ArrayList<Grant>(accessControlList.length);
        }
        for (Grant value : accessControlList) {
            this.accessControlList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of grants that control access to the staged results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessControlList <p>
     *            A list of grants that control access to the staged results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Location withAccessControlList(java.util.Collection<Grant> accessControlList) {
        setAccessControlList(accessControlList);
        return this;
    }

    /**
     * <p>
     * The tag-set that is applied to the restore results.
     * </p>
     *
     * @return <p>
     *         The tag-set that is applied to the restore results.
     *         </p>
     */
    public Tagging getTagging() {
        return tagging;
    }

    /**
     * <p>
     * The tag-set that is applied to the restore results.
     * </p>
     *
     * @param tagging <p>
     *            The tag-set that is applied to the restore results.
     *            </p>
     */
    public void setTagging(Tagging tagging) {
        this.tagging = tagging;
    }

    /**
     * <p>
     * The tag-set that is applied to the restore results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagging <p>
     *            The tag-set that is applied to the restore results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Location withTagging(Tagging tagging) {
        this.tagging = tagging;
        return this;
    }

    /**
     * <p>
     * A list of metadata to store with the restore results in S3.
     * </p>
     *
     * @return <p>
     *         A list of metadata to store with the restore results in S3.
     *         </p>
     */
    public java.util.List<MetadataEntry> getUserMetadata() {
        return userMetadata;
    }

    /**
     * <p>
     * A list of metadata to store with the restore results in S3.
     * </p>
     *
     * @param userMetadata <p>
     *            A list of metadata to store with the restore results in S3.
     *            </p>
     */
    public void setUserMetadata(java.util.Collection<MetadataEntry> userMetadata) {
        if (userMetadata == null) {
            this.userMetadata = null;
            return;
        }

        this.userMetadata = new java.util.ArrayList<MetadataEntry>(userMetadata);
    }

    /**
     * <p>
     * A list of metadata to store with the restore results in S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userMetadata <p>
     *            A list of metadata to store with the restore results in S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Location withUserMetadata(MetadataEntry... userMetadata) {
        if (getUserMetadata() == null) {
            this.userMetadata = new java.util.ArrayList<MetadataEntry>(userMetadata.length);
        }
        for (MetadataEntry value : userMetadata) {
            this.userMetadata.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of metadata to store with the restore results in S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userMetadata <p>
     *            A list of metadata to store with the restore results in S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Location withUserMetadata(java.util.Collection<MetadataEntry> userMetadata) {
        setUserMetadata(userMetadata);
        return this;
    }

    /**
     * <p>
     * The class of storage used to store the restore results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @return <p>
     *         The class of storage used to store the restore results.
     *         </p>
     * @see StorageClass
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * <p>
     * The class of storage used to store the restore results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The class of storage used to store the restore results.
     *            </p>
     * @see StorageClass
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * The class of storage used to store the restore results.
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
     *            The class of storage used to store the restore results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageClass
     */
    public S3Location withStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * <p>
     * The class of storage used to store the restore results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The class of storage used to store the restore results.
     *            </p>
     * @see StorageClass
     */
    public void setStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
    }

    /**
     * <p>
     * The class of storage used to store the restore results.
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
     *            The class of storage used to store the restore results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageClass
     */
    public S3Location withStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
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
        if (getBucketName() != null)
            sb.append("BucketName: " + getBucketName() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix() + ",");
        if (getEncryption() != null)
            sb.append("Encryption: " + getEncryption() + ",");
        if (getCannedACL() != null)
            sb.append("CannedACL: " + getCannedACL() + ",");
        if (getAccessControlList() != null)
            sb.append("AccessControlList: " + getAccessControlList() + ",");
        if (getTagging() != null)
            sb.append("Tagging: " + getTagging() + ",");
        if (getUserMetadata() != null)
            sb.append("UserMetadata: " + getUserMetadata() + ",");
        if (getStorageClass() != null)
            sb.append("StorageClass: " + getStorageClass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getCannedACL() == null) ? 0 : getCannedACL().hashCode());
        hashCode = prime * hashCode
                + ((getAccessControlList() == null) ? 0 : getAccessControlList().hashCode());
        hashCode = prime * hashCode + ((getTagging() == null) ? 0 : getTagging().hashCode());
        hashCode = prime * hashCode
                + ((getUserMetadata() == null) ? 0 : getUserMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Location == false)
            return false;
        S3Location other = (S3Location) obj;

        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null
                && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null
                && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getCannedACL() == null ^ this.getCannedACL() == null)
            return false;
        if (other.getCannedACL() != null
                && other.getCannedACL().equals(this.getCannedACL()) == false)
            return false;
        if (other.getAccessControlList() == null ^ this.getAccessControlList() == null)
            return false;
        if (other.getAccessControlList() != null
                && other.getAccessControlList().equals(this.getAccessControlList()) == false)
            return false;
        if (other.getTagging() == null ^ this.getTagging() == null)
            return false;
        if (other.getTagging() != null && other.getTagging().equals(this.getTagging()) == false)
            return false;
        if (other.getUserMetadata() == null ^ this.getUserMetadata() == null)
            return false;
        if (other.getUserMetadata() != null
                && other.getUserMetadata().equals(this.getUserMetadata()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null
                && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        return true;
    }
}
