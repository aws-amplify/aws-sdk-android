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

public class CompleteMultipartUploadResult implements Serializable {
    /**
     * <p>
     * The URI that identifies the newly created object.
     * </p>
     */
    private String location;

    /**
     * <p>
     * The name of the bucket that contains the newly created object.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The object key of the newly created object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String key;

    /**
     * <p>
     * If the object expiration is configured, this will contain the expiration
     * date (expiry-date) and rule ID (rule-id). The value of rule-id is URL
     * encoded.
     * </p>
     */
    private String expiration;

    /**
     * <p>
     * Entity tag that identifies the newly created object's data. Objects with
     * different object data will have different entity tags. The entity tag is
     * an opaque string. The entity tag may or may not be an MD5 digest of the
     * object data. If the entity tag is not an MD5 digest of the object data,
     * it will contain one or more nonhexadecimal characters and/or will consist
     * of less than 32 or more than 32 hexadecimal digits.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * If you specified server-side encryption either with an Amazon S3-managed
     * encryption key or an AWS KMS customer master key (CMK) in your initiate
     * multipart upload request, the response includes this header. It confirms
     * the encryption algorithm that Amazon S3 used to encrypt the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     */
    private String serverSideEncryption;

    /**
     * <p>
     * Version ID of the newly created object, in case the bucket has versioning
     * turned on.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * If present, specifies the ID of the AWS Key Management Service (AWS KMS)
     * symmetric customer managed customer master key (CMK) that was used for
     * the object.
     * </p>
     */
    private String sSEKMSKeyId;

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     */
    private String requestCharged;

    /**
     * <p>
     * The URI that identifies the newly created object.
     * </p>
     *
     * @return <p>
     *         The URI that identifies the newly created object.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The URI that identifies the newly created object.
     * </p>
     *
     * @param location <p>
     *            The URI that identifies the newly created object.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The URI that identifies the newly created object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The URI that identifies the newly created object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompleteMultipartUploadResult withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The name of the bucket that contains the newly created object.
     * </p>
     *
     * @return <p>
     *         The name of the bucket that contains the newly created object.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the bucket that contains the newly created object.
     * </p>
     *
     * @param bucket <p>
     *            The name of the bucket that contains the newly created object.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket that contains the newly created object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the bucket that contains the newly created object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompleteMultipartUploadResult withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The object key of the newly created object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The object key of the newly created object.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The object key of the newly created object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            The object key of the newly created object.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The object key of the newly created object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            The object key of the newly created object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompleteMultipartUploadResult withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * If the object expiration is configured, this will contain the expiration
     * date (expiry-date) and rule ID (rule-id). The value of rule-id is URL
     * encoded.
     * </p>
     *
     * @return <p>
     *         If the object expiration is configured, this will contain the
     *         expiration date (expiry-date) and rule ID (rule-id). The value of
     *         rule-id is URL encoded.
     *         </p>
     */
    public String getExpiration() {
        return expiration;
    }

    /**
     * <p>
     * If the object expiration is configured, this will contain the expiration
     * date (expiry-date) and rule ID (rule-id). The value of rule-id is URL
     * encoded.
     * </p>
     *
     * @param expiration <p>
     *            If the object expiration is configured, this will contain the
     *            expiration date (expiry-date) and rule ID (rule-id). The value
     *            of rule-id is URL encoded.
     *            </p>
     */
    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * If the object expiration is configured, this will contain the expiration
     * date (expiry-date) and rule ID (rule-id). The value of rule-id is URL
     * encoded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiration <p>
     *            If the object expiration is configured, this will contain the
     *            expiration date (expiry-date) and rule ID (rule-id). The value
     *            of rule-id is URL encoded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompleteMultipartUploadResult withExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * <p>
     * Entity tag that identifies the newly created object's data. Objects with
     * different object data will have different entity tags. The entity tag is
     * an opaque string. The entity tag may or may not be an MD5 digest of the
     * object data. If the entity tag is not an MD5 digest of the object data,
     * it will contain one or more nonhexadecimal characters and/or will consist
     * of less than 32 or more than 32 hexadecimal digits.
     * </p>
     *
     * @return <p>
     *         Entity tag that identifies the newly created object's data.
     *         Objects with different object data will have different entity
     *         tags. The entity tag is an opaque string. The entity tag may or
     *         may not be an MD5 digest of the object data. If the entity tag is
     *         not an MD5 digest of the object data, it will contain one or more
     *         nonhexadecimal characters and/or will consist of less than 32 or
     *         more than 32 hexadecimal digits.
     *         </p>
     */
    public String getETag() {
        return eTag;
    }

    /**
     * <p>
     * Entity tag that identifies the newly created object's data. Objects with
     * different object data will have different entity tags. The entity tag is
     * an opaque string. The entity tag may or may not be an MD5 digest of the
     * object data. If the entity tag is not an MD5 digest of the object data,
     * it will contain one or more nonhexadecimal characters and/or will consist
     * of less than 32 or more than 32 hexadecimal digits.
     * </p>
     *
     * @param eTag <p>
     *            Entity tag that identifies the newly created object's data.
     *            Objects with different object data will have different entity
     *            tags. The entity tag is an opaque string. The entity tag may
     *            or may not be an MD5 digest of the object data. If the entity
     *            tag is not an MD5 digest of the object data, it will contain
     *            one or more nonhexadecimal characters and/or will consist of
     *            less than 32 or more than 32 hexadecimal digits.
     *            </p>
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * Entity tag that identifies the newly created object's data. Objects with
     * different object data will have different entity tags. The entity tag is
     * an opaque string. The entity tag may or may not be an MD5 digest of the
     * object data. If the entity tag is not an MD5 digest of the object data,
     * it will contain one or more nonhexadecimal characters and/or will consist
     * of less than 32 or more than 32 hexadecimal digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eTag <p>
     *            Entity tag that identifies the newly created object's data.
     *            Objects with different object data will have different entity
     *            tags. The entity tag is an opaque string. The entity tag may
     *            or may not be an MD5 digest of the object data. If the entity
     *            tag is not an MD5 digest of the object data, it will contain
     *            one or more nonhexadecimal characters and/or will consist of
     *            less than 32 or more than 32 hexadecimal digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompleteMultipartUploadResult withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * <p>
     * If you specified server-side encryption either with an Amazon S3-managed
     * encryption key or an AWS KMS customer master key (CMK) in your initiate
     * multipart upload request, the response includes this header. It confirms
     * the encryption algorithm that Amazon S3 used to encrypt the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @return <p>
     *         If you specified server-side encryption either with an Amazon
     *         S3-managed encryption key or an AWS KMS customer master key (CMK)
     *         in your initiate multipart upload request, the response includes
     *         this header. It confirms the encryption algorithm that Amazon S3
     *         used to encrypt the object.
     *         </p>
     * @see ServerSideEncryption
     */
    public String getServerSideEncryption() {
        return serverSideEncryption;
    }

    /**
     * <p>
     * If you specified server-side encryption either with an Amazon S3-managed
     * encryption key or an AWS KMS customer master key (CMK) in your initiate
     * multipart upload request, the response includes this header. It confirms
     * the encryption algorithm that Amazon S3 used to encrypt the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param serverSideEncryption <p>
     *            If you specified server-side encryption either with an Amazon
     *            S3-managed encryption key or an AWS KMS customer master key
     *            (CMK) in your initiate multipart upload request, the response
     *            includes this header. It confirms the encryption algorithm
     *            that Amazon S3 used to encrypt the object.
     *            </p>
     * @see ServerSideEncryption
     */
    public void setServerSideEncryption(String serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
    }

    /**
     * <p>
     * If you specified server-side encryption either with an Amazon S3-managed
     * encryption key or an AWS KMS customer master key (CMK) in your initiate
     * multipart upload request, the response includes this header. It confirms
     * the encryption algorithm that Amazon S3 used to encrypt the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param serverSideEncryption <p>
     *            If you specified server-side encryption either with an Amazon
     *            S3-managed encryption key or an AWS KMS customer master key
     *            (CMK) in your initiate multipart upload request, the response
     *            includes this header. It confirms the encryption algorithm
     *            that Amazon S3 used to encrypt the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServerSideEncryption
     */
    public CompleteMultipartUploadResult withServerSideEncryption(String serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
        return this;
    }

    /**
     * <p>
     * If you specified server-side encryption either with an Amazon S3-managed
     * encryption key or an AWS KMS customer master key (CMK) in your initiate
     * multipart upload request, the response includes this header. It confirms
     * the encryption algorithm that Amazon S3 used to encrypt the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param serverSideEncryption <p>
     *            If you specified server-side encryption either with an Amazon
     *            S3-managed encryption key or an AWS KMS customer master key
     *            (CMK) in your initiate multipart upload request, the response
     *            includes this header. It confirms the encryption algorithm
     *            that Amazon S3 used to encrypt the object.
     *            </p>
     * @see ServerSideEncryption
     */
    public void setServerSideEncryption(ServerSideEncryption serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption.toString();
    }

    /**
     * <p>
     * If you specified server-side encryption either with an Amazon S3-managed
     * encryption key or an AWS KMS customer master key (CMK) in your initiate
     * multipart upload request, the response includes this header. It confirms
     * the encryption algorithm that Amazon S3 used to encrypt the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param serverSideEncryption <p>
     *            If you specified server-side encryption either with an Amazon
     *            S3-managed encryption key or an AWS KMS customer master key
     *            (CMK) in your initiate multipart upload request, the response
     *            includes this header. It confirms the encryption algorithm
     *            that Amazon S3 used to encrypt the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServerSideEncryption
     */
    public CompleteMultipartUploadResult withServerSideEncryption(
            ServerSideEncryption serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption.toString();
        return this;
    }

    /**
     * <p>
     * Version ID of the newly created object, in case the bucket has versioning
     * turned on.
     * </p>
     *
     * @return <p>
     *         Version ID of the newly created object, in case the bucket has
     *         versioning turned on.
     *         </p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>
     * Version ID of the newly created object, in case the bucket has versioning
     * turned on.
     * </p>
     *
     * @param versionId <p>
     *            Version ID of the newly created object, in case the bucket has
     *            versioning turned on.
     *            </p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * Version ID of the newly created object, in case the bucket has versioning
     * turned on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionId <p>
     *            Version ID of the newly created object, in case the bucket has
     *            versioning turned on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompleteMultipartUploadResult withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * <p>
     * If present, specifies the ID of the AWS Key Management Service (AWS KMS)
     * symmetric customer managed customer master key (CMK) that was used for
     * the object.
     * </p>
     *
     * @return <p>
     *         If present, specifies the ID of the AWS Key Management Service
     *         (AWS KMS) symmetric customer managed customer master key (CMK)
     *         that was used for the object.
     *         </p>
     */
    public String getSSEKMSKeyId() {
        return sSEKMSKeyId;
    }

    /**
     * <p>
     * If present, specifies the ID of the AWS Key Management Service (AWS KMS)
     * symmetric customer managed customer master key (CMK) that was used for
     * the object.
     * </p>
     *
     * @param sSEKMSKeyId <p>
     *            If present, specifies the ID of the AWS Key Management Service
     *            (AWS KMS) symmetric customer managed customer master key (CMK)
     *            that was used for the object.
     *            </p>
     */
    public void setSSEKMSKeyId(String sSEKMSKeyId) {
        this.sSEKMSKeyId = sSEKMSKeyId;
    }

    /**
     * <p>
     * If present, specifies the ID of the AWS Key Management Service (AWS KMS)
     * symmetric customer managed customer master key (CMK) that was used for
     * the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSEKMSKeyId <p>
     *            If present, specifies the ID of the AWS Key Management Service
     *            (AWS KMS) symmetric customer managed customer master key (CMK)
     *            that was used for the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompleteMultipartUploadResult withSSEKMSKeyId(String sSEKMSKeyId) {
        this.sSEKMSKeyId = sSEKMSKeyId;
        return this;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @return <p>
     *         If present, indicates that the requester was successfully charged
     *         for the request.
     *         </p>
     * @see RequestCharged
     */
    public String getRequestCharged() {
        return requestCharged;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @see RequestCharged
     */
    public void setRequestCharged(String requestCharged) {
        this.requestCharged = requestCharged;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestCharged
     */
    public CompleteMultipartUploadResult withRequestCharged(String requestCharged) {
        this.requestCharged = requestCharged;
        return this;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @see RequestCharged
     */
    public void setRequestCharged(RequestCharged requestCharged) {
        this.requestCharged = requestCharged.toString();
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestCharged
     */
    public CompleteMultipartUploadResult withRequestCharged(RequestCharged requestCharged) {
        this.requestCharged = requestCharged.toString();
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
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getExpiration() != null)
            sb.append("Expiration: " + getExpiration() + ",");
        if (getETag() != null)
            sb.append("ETag: " + getETag() + ",");
        if (getServerSideEncryption() != null)
            sb.append("ServerSideEncryption: " + getServerSideEncryption() + ",");
        if (getVersionId() != null)
            sb.append("VersionId: " + getVersionId() + ",");
        if (getSSEKMSKeyId() != null)
            sb.append("SSEKMSKeyId: " + getSSEKMSKeyId() + ",");
        if (getRequestCharged() != null)
            sb.append("RequestCharged: " + getRequestCharged());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode
                + ((getServerSideEncryption() == null) ? 0 : getServerSideEncryption().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getSSEKMSKeyId() == null) ? 0 : getSSEKMSKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getRequestCharged() == null) ? 0 : getRequestCharged().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompleteMultipartUploadResult == false)
            return false;
        CompleteMultipartUploadResult other = (CompleteMultipartUploadResult) obj;

        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null
                && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        if (other.getServerSideEncryption() == null ^ this.getServerSideEncryption() == null)
            return false;
        if (other.getServerSideEncryption() != null
                && other.getServerSideEncryption().equals(this.getServerSideEncryption()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getSSEKMSKeyId() == null ^ this.getSSEKMSKeyId() == null)
            return false;
        if (other.getSSEKMSKeyId() != null
                && other.getSSEKMSKeyId().equals(this.getSSEKMSKeyId()) == false)
            return false;
        if (other.getRequestCharged() == null ^ this.getRequestCharged() == null)
            return false;
        if (other.getRequestCharged() != null
                && other.getRequestCharged().equals(this.getRequestCharged()) == false)
            return false;
        return true;
    }
}
