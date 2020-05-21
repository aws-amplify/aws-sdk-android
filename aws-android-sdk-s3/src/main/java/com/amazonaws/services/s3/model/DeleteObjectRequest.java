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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes the null version (if there is one) of an object and inserts a delete
 * marker, which becomes the latest version of the object. If there isn't a null
 * version, Amazon S3 does not remove any objects.
 * </p>
 * <p>
 * To remove a specific version, you must be the bucket owner and you must use
 * the version Id subresource. Using this subresource permanently deletes the
 * version. If the object deleted is a delete marker, Amazon S3 sets the
 * response header, <code>x-amz-delete-marker</code>, to true.
 * </p>
 * <p>
 * If the object you want to delete is in a bucket where the bucket versioning
 * configuration is MFA Delete enabled, you must include the
 * <code>x-amz-mfa</code> request header in the DELETE <code>versionId</code>
 * request. Requests that include <code>x-amz-mfa</code> must use HTTPS.
 * </p>
 * <p>
 * For more information about MFA Delete, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMFADelete.html"
 * >Using MFA Delete</a>. To see sample requests that use versioning, see <a
 * href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectDELETE.html#ExampleVersionObjectDelete"
 * >Sample Request</a>.
 * </p>
 * <p>
 * You can delete objects by explicitly calling the DELETE Object API or
 * configure its lifecycle (<a>PutBucketLifecycle</a>) to enable Amazon S3 to
 * remove them for you. If you want to block users or accounts from removing or
 * deleting objects from your bucket, you must deny them the
 * <code>s3:DeleteObject</code>, <code>s3:DeleteObjectVersion</code>, and
 * <code>s3:PutLifeCycleConfiguration</code> actions.
 * </p>
 * <p>
 * The following operation is related to <code>DeleteObject</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>PutObject</a>
 * </p>
 * </li>
 * </ul>
 */
public class DeleteObjectRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The bucket name of the bucket containing the object.
     * </p>
     * <p>
     * When using this API with an access point, you must direct requests to the
     * access point hostname. The access point hostname takes the form
     * <i>AccessPointName
     * </i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When
     * using this operation using an access point through the AWS SDKs, you
     * provide the access point ARN in place of the bucket name. For more
     * information about access point ARNs, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     * >Using Access Points</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * Key name of the object to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String key;

    /**
     * <p>
     * The concatenation of the authentication device's serial number, a space,
     * and the value that is displayed on your authentication device. Required
     * to permanently delete a versioned object if versioning is configured with
     * MFA delete enabled.
     * </p>
     */
    private String mFA;

    /**
     * <p>
     * VersionId used to reference a specific version of the object.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * Confirms that the requester knows that they will be charged for the
     * request. Bucket owners need not specify this parameter in their requests.
     * For information about downloading objects from requester pays buckets,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     * >Downloading Objects in Requestor Pays Buckets</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     */
    private String requestPayer;

    /**
     * <p>
     * Indicates whether S3 Object Lock should bypass Governance-mode
     * restrictions to process this operation.
     * </p>
     */
    private Boolean bypassGovernanceRetention;

    /**
     * <p>
     * The bucket name of the bucket containing the object.
     * </p>
     * <p>
     * When using this API with an access point, you must direct requests to the
     * access point hostname. The access point hostname takes the form
     * <i>AccessPointName
     * </i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When
     * using this operation using an access point through the AWS SDKs, you
     * provide the access point ARN in place of the bucket name. For more
     * information about access point ARNs, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     * >Using Access Points</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The bucket name of the bucket containing the object.
     *         </p>
     *         <p>
     *         When using this API with an access point, you must direct
     *         requests to the access point hostname. The access point hostname
     *         takes the form
     *         <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint
     *         .<i>Region</i>.amazonaws.com. When using this operation using an
     *         access point through the AWS SDKs, you provide the access point
     *         ARN in place of the bucket name. For more information about
     *         access point ARNs, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     *         >Using Access Points</a> in the <i>Amazon Simple Storage Service
     *         Developer Guide</i>.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The bucket name of the bucket containing the object.
     * </p>
     * <p>
     * When using this API with an access point, you must direct requests to the
     * access point hostname. The access point hostname takes the form
     * <i>AccessPointName
     * </i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When
     * using this operation using an access point through the AWS SDKs, you
     * provide the access point ARN in place of the bucket name. For more
     * information about access point ARNs, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     * >Using Access Points</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     *
     * @param bucket <p>
     *            The bucket name of the bucket containing the object.
     *            </p>
     *            <p>
     *            When using this API with an access point, you must direct
     *            requests to the access point hostname. The access point
     *            hostname takes the form
     *            <i>AccessPointName</i>-<i>AccountId</i>
     *            .s3-accesspoint.<i>Region</i>.amazonaws.com. When using this
     *            operation using an access point through the AWS SDKs, you
     *            provide the access point ARN in place of the bucket name. For
     *            more information about access point ARNs, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     *            >Using Access Points</a> in the <i>Amazon Simple Storage
     *            Service Developer Guide</i>.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The bucket name of the bucket containing the object.
     * </p>
     * <p>
     * When using this API with an access point, you must direct requests to the
     * access point hostname. The access point hostname takes the form
     * <i>AccessPointName
     * </i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When
     * using this operation using an access point through the AWS SDKs, you
     * provide the access point ARN in place of the bucket name. For more
     * information about access point ARNs, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     * >Using Access Points</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The bucket name of the bucket containing the object.
     *            </p>
     *            <p>
     *            When using this API with an access point, you must direct
     *            requests to the access point hostname. The access point
     *            hostname takes the form
     *            <i>AccessPointName</i>-<i>AccountId</i>
     *            .s3-accesspoint.<i>Region</i>.amazonaws.com. When using this
     *            operation using an access point through the AWS SDKs, you
     *            provide the access point ARN in place of the bucket name. For
     *            more information about access point ARNs, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     *            >Using Access Points</a> in the <i>Amazon Simple Storage
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteObjectRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * Key name of the object to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Key name of the object to delete.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * Key name of the object to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Key name of the object to delete.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Key name of the object to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Key name of the object to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteObjectRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The concatenation of the authentication device's serial number, a space,
     * and the value that is displayed on your authentication device. Required
     * to permanently delete a versioned object if versioning is configured with
     * MFA delete enabled.
     * </p>
     *
     * @return <p>
     *         The concatenation of the authentication device's serial number, a
     *         space, and the value that is displayed on your authentication
     *         device. Required to permanently delete a versioned object if
     *         versioning is configured with MFA delete enabled.
     *         </p>
     */
    public String getMFA() {
        return mFA;
    }

    /**
     * <p>
     * The concatenation of the authentication device's serial number, a space,
     * and the value that is displayed on your authentication device. Required
     * to permanently delete a versioned object if versioning is configured with
     * MFA delete enabled.
     * </p>
     *
     * @param mFA <p>
     *            The concatenation of the authentication device's serial
     *            number, a space, and the value that is displayed on your
     *            authentication device. Required to permanently delete a
     *            versioned object if versioning is configured with MFA delete
     *            enabled.
     *            </p>
     */
    public void setMFA(String mFA) {
        this.mFA = mFA;
    }

    /**
     * <p>
     * The concatenation of the authentication device's serial number, a space,
     * and the value that is displayed on your authentication device. Required
     * to permanently delete a versioned object if versioning is configured with
     * MFA delete enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mFA <p>
     *            The concatenation of the authentication device's serial
     *            number, a space, and the value that is displayed on your
     *            authentication device. Required to permanently delete a
     *            versioned object if versioning is configured with MFA delete
     *            enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteObjectRequest withMFA(String mFA) {
        this.mFA = mFA;
        return this;
    }

    /**
     * <p>
     * VersionId used to reference a specific version of the object.
     * </p>
     *
     * @return <p>
     *         VersionId used to reference a specific version of the object.
     *         </p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>
     * VersionId used to reference a specific version of the object.
     * </p>
     *
     * @param versionId <p>
     *            VersionId used to reference a specific version of the object.
     *            </p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * VersionId used to reference a specific version of the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionId <p>
     *            VersionId used to reference a specific version of the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteObjectRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * <p>
     * Confirms that the requester knows that they will be charged for the
     * request. Bucket owners need not specify this parameter in their requests.
     * For information about downloading objects from requester pays buckets,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     * >Downloading Objects in Requestor Pays Buckets</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @return <p>
     *         Confirms that the requester knows that they will be charged for
     *         the request. Bucket owners need not specify this parameter in
     *         their requests. For information about downloading objects from
     *         requester pays buckets, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     *         >Downloading Objects in Requestor Pays Buckets</a> in the
     *         <i>Amazon S3 Developer Guide</i>.
     *         </p>
     * @see RequestPayer
     */
    public String getRequestPayer() {
        return requestPayer;
    }

    /**
     * <p>
     * Confirms that the requester knows that they will be charged for the
     * request. Bucket owners need not specify this parameter in their requests.
     * For information about downloading objects from requester pays buckets,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     * >Downloading Objects in Requestor Pays Buckets</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestPayer <p>
     *            Confirms that the requester knows that they will be charged
     *            for the request. Bucket owners need not specify this parameter
     *            in their requests. For information about downloading objects
     *            from requester pays buckets, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     *            >Downloading Objects in Requestor Pays Buckets</a> in the
     *            <i>Amazon S3 Developer Guide</i>.
     *            </p>
     * @see RequestPayer
     */
    public void setRequestPayer(String requestPayer) {
        this.requestPayer = requestPayer;
    }

    /**
     * <p>
     * Confirms that the requester knows that they will be charged for the
     * request. Bucket owners need not specify this parameter in their requests.
     * For information about downloading objects from requester pays buckets,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     * >Downloading Objects in Requestor Pays Buckets</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestPayer <p>
     *            Confirms that the requester knows that they will be charged
     *            for the request. Bucket owners need not specify this parameter
     *            in their requests. For information about downloading objects
     *            from requester pays buckets, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     *            >Downloading Objects in Requestor Pays Buckets</a> in the
     *            <i>Amazon S3 Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestPayer
     */
    public DeleteObjectRequest withRequestPayer(String requestPayer) {
        this.requestPayer = requestPayer;
        return this;
    }

    /**
     * <p>
     * Confirms that the requester knows that they will be charged for the
     * request. Bucket owners need not specify this parameter in their requests.
     * For information about downloading objects from requester pays buckets,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     * >Downloading Objects in Requestor Pays Buckets</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestPayer <p>
     *            Confirms that the requester knows that they will be charged
     *            for the request. Bucket owners need not specify this parameter
     *            in their requests. For information about downloading objects
     *            from requester pays buckets, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     *            >Downloading Objects in Requestor Pays Buckets</a> in the
     *            <i>Amazon S3 Developer Guide</i>.
     *            </p>
     * @see RequestPayer
     */
    public void setRequestPayer(RequestPayer requestPayer) {
        this.requestPayer = requestPayer.toString();
    }

    /**
     * <p>
     * Confirms that the requester knows that they will be charged for the
     * request. Bucket owners need not specify this parameter in their requests.
     * For information about downloading objects from requester pays buckets,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     * >Downloading Objects in Requestor Pays Buckets</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestPayer <p>
     *            Confirms that the requester knows that they will be charged
     *            for the request. Bucket owners need not specify this parameter
     *            in their requests. For information about downloading objects
     *            from requester pays buckets, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     *            >Downloading Objects in Requestor Pays Buckets</a> in the
     *            <i>Amazon S3 Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestPayer
     */
    public DeleteObjectRequest withRequestPayer(RequestPayer requestPayer) {
        this.requestPayer = requestPayer.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether S3 Object Lock should bypass Governance-mode
     * restrictions to process this operation.
     * </p>
     *
     * @return <p>
     *         Indicates whether S3 Object Lock should bypass Governance-mode
     *         restrictions to process this operation.
     *         </p>
     */
    public Boolean isBypassGovernanceRetention() {
        return bypassGovernanceRetention;
    }

    /**
     * <p>
     * Indicates whether S3 Object Lock should bypass Governance-mode
     * restrictions to process this operation.
     * </p>
     *
     * @return <p>
     *         Indicates whether S3 Object Lock should bypass Governance-mode
     *         restrictions to process this operation.
     *         </p>
     */
    public Boolean getBypassGovernanceRetention() {
        return bypassGovernanceRetention;
    }

    /**
     * <p>
     * Indicates whether S3 Object Lock should bypass Governance-mode
     * restrictions to process this operation.
     * </p>
     *
     * @param bypassGovernanceRetention <p>
     *            Indicates whether S3 Object Lock should bypass Governance-mode
     *            restrictions to process this operation.
     *            </p>
     */
    public void setBypassGovernanceRetention(Boolean bypassGovernanceRetention) {
        this.bypassGovernanceRetention = bypassGovernanceRetention;
    }

    /**
     * <p>
     * Indicates whether S3 Object Lock should bypass Governance-mode
     * restrictions to process this operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bypassGovernanceRetention <p>
     *            Indicates whether S3 Object Lock should bypass Governance-mode
     *            restrictions to process this operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteObjectRequest withBypassGovernanceRetention(Boolean bypassGovernanceRetention) {
        this.bypassGovernanceRetention = bypassGovernanceRetention;
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
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getMFA() != null)
            sb.append("MFA: " + getMFA() + ",");
        if (getVersionId() != null)
            sb.append("VersionId: " + getVersionId() + ",");
        if (getRequestPayer() != null)
            sb.append("RequestPayer: " + getRequestPayer() + ",");
        if (getBypassGovernanceRetention() != null)
            sb.append("BypassGovernanceRetention: " + getBypassGovernanceRetention());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getMFA() == null) ? 0 : getMFA().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getRequestPayer() == null) ? 0 : getRequestPayer().hashCode());
        hashCode = prime
                * hashCode
                + ((getBypassGovernanceRetention() == null) ? 0 : getBypassGovernanceRetention()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteObjectRequest == false)
            return false;
        DeleteObjectRequest other = (DeleteObjectRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getMFA() == null ^ this.getMFA() == null)
            return false;
        if (other.getMFA() != null && other.getMFA().equals(this.getMFA()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getRequestPayer() == null ^ this.getRequestPayer() == null)
            return false;
        if (other.getRequestPayer() != null
                && other.getRequestPayer().equals(this.getRequestPayer()) == false)
            return false;
        if (other.getBypassGovernanceRetention() == null
                ^ this.getBypassGovernanceRetention() == null)
            return false;
        if (other.getBypassGovernanceRetention() != null
                && other.getBypassGovernanceRetention().equals(this.getBypassGovernanceRetention()) == false)
            return false;
        return true;
    }
}
