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
 * This operation enables you to delete multiple objects from a bucket using a
 * single HTTP request. If you know the object keys that you want to delete,
 * then this operation provides a suitable alternative to sending individual
 * delete requests, reducing per-request overhead.
 * </p>
 * <p>
 * The request contains a list of up to 1000 keys that you want to delete. In
 * the XML, you provide the object key names, and optionally, version IDs if you
 * want to delete a specific version of the object from a versioning-enabled
 * bucket. For each key, Amazon S3 performs a delete operation and returns the
 * result of that delete, success, or failure, in the response. Note that if the
 * object specified in the request is not found, Amazon S3 returns the result as
 * deleted.
 * </p>
 * <p>
 * The operation supports two modes for the response: verbose and quiet. By
 * default, the operation uses verbose mode in which the response includes the
 * result of deletion of each key in your request. In quiet mode the response
 * includes only keys where the delete operation encountered an error. For a
 * successful deletion, the operation does not return any information about the
 * delete in the response body.
 * </p>
 * <p>
 * When performing this operation on an MFA Delete enabled bucket, that attempts
 * to delete any versioned objects, you must include an MFA token. If you do not
 * provide one, the entire request will fail, even if there are non-versioned
 * objects you are trying to delete. If you provide an invalid token, whether
 * there are versioned keys in the request or not, the entire Multi-Object
 * Delete request will fail. For information about MFA Delete, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html#MultiFactorAuthenticationDelete"
 * > MFA Delete</a>.
 * </p>
 * <p>
 * Finally, the Content-MD5 header is required for all Multi-Object Delete
 * requests. Amazon S3 uses the header value to ensure that your request body
 * has not been altered in transit.
 * </p>
 * <p>
 * The following operations are related to <code>DeleteObjects</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateMultipartUpload</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UploadPart</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CompleteMultipartUpload</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListParts</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>AbortMultipartUpload</a>
 * </p>
 * </li>
 * </ul>
 */
public class DeleteObjectsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The bucket name containing the objects to delete.
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
     * Container for the request.
     * </p>
     */
    private Delete delete;

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
     * Specifies whether you want to delete this object even if it has a
     * Governance-type Object Lock in place. You must have sufficient
     * permissions to perform this operation.
     * </p>
     */
    private Boolean bypassGovernanceRetention;

    /**
     * <p>
     * The bucket name containing the objects to delete.
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
     *         The bucket name containing the objects to delete.
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
     * The bucket name containing the objects to delete.
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
     *            The bucket name containing the objects to delete.
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
     * The bucket name containing the objects to delete.
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
     *            The bucket name containing the objects to delete.
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
    public DeleteObjectsRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * Container for the request.
     * </p>
     *
     * @return <p>
     *         Container for the request.
     *         </p>
     */
    public Delete getDelete() {
        return delete;
    }

    /**
     * <p>
     * Container for the request.
     * </p>
     *
     * @param delete <p>
     *            Container for the request.
     *            </p>
     */
    public void setDelete(Delete delete) {
        this.delete = delete;
    }

    /**
     * <p>
     * Container for the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delete <p>
     *            Container for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteObjectsRequest withDelete(Delete delete) {
        this.delete = delete;
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
    public DeleteObjectsRequest withMFA(String mFA) {
        this.mFA = mFA;
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
    public DeleteObjectsRequest withRequestPayer(String requestPayer) {
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
    public DeleteObjectsRequest withRequestPayer(RequestPayer requestPayer) {
        this.requestPayer = requestPayer.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether you want to delete this object even if it has a
     * Governance-type Object Lock in place. You must have sufficient
     * permissions to perform this operation.
     * </p>
     *
     * @return <p>
     *         Specifies whether you want to delete this object even if it has a
     *         Governance-type Object Lock in place. You must have sufficient
     *         permissions to perform this operation.
     *         </p>
     */
    public Boolean isBypassGovernanceRetention() {
        return bypassGovernanceRetention;
    }

    /**
     * <p>
     * Specifies whether you want to delete this object even if it has a
     * Governance-type Object Lock in place. You must have sufficient
     * permissions to perform this operation.
     * </p>
     *
     * @return <p>
     *         Specifies whether you want to delete this object even if it has a
     *         Governance-type Object Lock in place. You must have sufficient
     *         permissions to perform this operation.
     *         </p>
     */
    public Boolean getBypassGovernanceRetention() {
        return bypassGovernanceRetention;
    }

    /**
     * <p>
     * Specifies whether you want to delete this object even if it has a
     * Governance-type Object Lock in place. You must have sufficient
     * permissions to perform this operation.
     * </p>
     *
     * @param bypassGovernanceRetention <p>
     *            Specifies whether you want to delete this object even if it
     *            has a Governance-type Object Lock in place. You must have
     *            sufficient permissions to perform this operation.
     *            </p>
     */
    public void setBypassGovernanceRetention(Boolean bypassGovernanceRetention) {
        this.bypassGovernanceRetention = bypassGovernanceRetention;
    }

    /**
     * <p>
     * Specifies whether you want to delete this object even if it has a
     * Governance-type Object Lock in place. You must have sufficient
     * permissions to perform this operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bypassGovernanceRetention <p>
     *            Specifies whether you want to delete this object even if it
     *            has a Governance-type Object Lock in place. You must have
     *            sufficient permissions to perform this operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteObjectsRequest withBypassGovernanceRetention(Boolean bypassGovernanceRetention) {
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
        if (getDelete() != null)
            sb.append("Delete: " + getDelete() + ",");
        if (getMFA() != null)
            sb.append("MFA: " + getMFA() + ",");
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
        hashCode = prime * hashCode + ((getDelete() == null) ? 0 : getDelete().hashCode());
        hashCode = prime * hashCode + ((getMFA() == null) ? 0 : getMFA().hashCode());
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

        if (obj instanceof DeleteObjectsRequest == false)
            return false;
        DeleteObjectsRequest other = (DeleteObjectsRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getDelete() == null ^ this.getDelete() == null)
            return false;
        if (other.getDelete() != null && other.getDelete().equals(this.getDelete()) == false)
            return false;
        if (other.getMFA() == null ^ this.getMFA() == null)
            return false;
        if (other.getMFA() != null && other.getMFA().equals(this.getMFA()) == false)
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
