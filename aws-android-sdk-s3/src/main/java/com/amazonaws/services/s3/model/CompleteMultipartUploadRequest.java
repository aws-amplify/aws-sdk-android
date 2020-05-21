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
 * Completes a multipart upload by assembling previously uploaded parts.
 * </p>
 * <p>
 * You first initiate the multipart upload and then upload all parts using the
 * <a>UploadPart</a> operation. After successfully uploading all relevant parts
 * of an upload, you call this operation to complete the upload. Upon receiving
 * this request, Amazon S3 concatenates all the parts in ascending order by part
 * number to create a new object. In the Complete Multipart Upload request, you
 * must provide the parts list. You must ensure that the parts list is complete.
 * This operation concatenates the parts that you provide in the list. For each
 * part in the list, you must provide the part number and the <code>ETag</code>
 * value, returned after that part was uploaded.
 * </p>
 * <p>
 * Processing of a Complete Multipart Upload request could take several minutes
 * to complete. After Amazon S3 begins processing the request, it sends an HTTP
 * response header that specifies a 200 OK response. While processing is in
 * progress, Amazon S3 periodically sends white space characters to keep the
 * connection from timing out. Because a request could fail after the initial
 * 200 OK response has been sent, it is important that you check the response
 * body to determine whether the request succeeded.
 * </p>
 * <p>
 * Note that if <code>CompleteMultipartUpload</code> fails, applications should
 * be prepared to retry the failed requests. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ErrorBestPractices.html"
 * >Amazon S3 Error Best Practices</a>.
 * </p>
 * <p>
 * For more information about multipart uploads, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/uploadobjusingmpu.html"
 * >Uploading Objects Using Multipart Upload</a>.
 * </p>
 * <p>
 * For information about permissions required to use the multipart upload API,
 * see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html"
 * >Multipart Upload API and Permissions</a>.
 * </p>
 * <p>
 * <code>GetBucketLifecycle</code> has the following special errors:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Error code: <code>EntityTooSmall</code>
 * </p>
 * <ul>
 * <li>
 * <p>
 * Description: Your proposed upload is smaller than the minimum allowed object
 * size. Each part must be at least 5 MB in size, except the last part.
 * </p>
 * </li>
 * <li>
 * <p>
 * 400 Bad Request
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Error code: <code>InvalidPart</code>
 * </p>
 * <ul>
 * <li>
 * <p>
 * Description: One or more of the specified parts could not be found. The part
 * might not have been uploaded, or the specified entity tag might not have
 * matched the part's entity tag.
 * </p>
 * </li>
 * <li>
 * <p>
 * 400 Bad Request
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Error code: <code>InvalidPartOrder</code>
 * </p>
 * <ul>
 * <li>
 * <p>
 * Description: The list of parts was not in ascending order. The parts list
 * must be specified in order by part number.
 * </p>
 * </li>
 * <li>
 * <p>
 * 400 Bad Request
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Error code: <code>NoSuchUpload</code>
 * </p>
 * <ul>
 * <li>
 * <p>
 * Description: The specified multipart upload does not exist. The upload ID
 * might be invalid, or the multipart upload might have been aborted or
 * completed.
 * </p>
 * </li>
 * <li>
 * <p>
 * 404 Not Found
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * The following operations are related to <code>CompleteMultipartUpload</code>:
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
 * <a>AbortMultipartUpload</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListParts</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListMultipartUploads</a>
 * </p>
 * </li>
 * </ul>
 */
public class CompleteMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Name of the bucket to which the multipart upload was initiated.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * Object key for which the multipart upload was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String key;

    /**
     * <p>
     * The container for the multipart upload request information.
     * </p>
     */
    private CompletedMultipartUpload multipartUpload;

    /**
     * <p>
     * ID for the initiated multipart upload.
     * </p>
     */
    private String uploadId;

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
     * Name of the bucket to which the multipart upload was initiated.
     * </p>
     *
     * @return <p>
     *         Name of the bucket to which the multipart upload was initiated.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * Name of the bucket to which the multipart upload was initiated.
     * </p>
     *
     * @param bucket <p>
     *            Name of the bucket to which the multipart upload was
     *            initiated.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * Name of the bucket to which the multipart upload was initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            Name of the bucket to which the multipart upload was
     *            initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompleteMultipartUploadRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * Object key for which the multipart upload was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Object key for which the multipart upload was initiated.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * Object key for which the multipart upload was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Object key for which the multipart upload was initiated.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Object key for which the multipart upload was initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Object key for which the multipart upload was initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompleteMultipartUploadRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The container for the multipart upload request information.
     * </p>
     *
     * @return <p>
     *         The container for the multipart upload request information.
     *         </p>
     */
    public CompletedMultipartUpload getMultipartUpload() {
        return multipartUpload;
    }

    /**
     * <p>
     * The container for the multipart upload request information.
     * </p>
     *
     * @param multipartUpload <p>
     *            The container for the multipart upload request information.
     *            </p>
     */
    public void setMultipartUpload(CompletedMultipartUpload multipartUpload) {
        this.multipartUpload = multipartUpload;
    }

    /**
     * <p>
     * The container for the multipart upload request information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multipartUpload <p>
     *            The container for the multipart upload request information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompleteMultipartUploadRequest withMultipartUpload(
            CompletedMultipartUpload multipartUpload) {
        this.multipartUpload = multipartUpload;
        return this;
    }

    /**
     * <p>
     * ID for the initiated multipart upload.
     * </p>
     *
     * @return <p>
     *         ID for the initiated multipart upload.
     *         </p>
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * <p>
     * ID for the initiated multipart upload.
     * </p>
     *
     * @param uploadId <p>
     *            ID for the initiated multipart upload.
     *            </p>
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * ID for the initiated multipart upload.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploadId <p>
     *            ID for the initiated multipart upload.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompleteMultipartUploadRequest withUploadId(String uploadId) {
        this.uploadId = uploadId;
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
    public CompleteMultipartUploadRequest withRequestPayer(String requestPayer) {
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
    public CompleteMultipartUploadRequest withRequestPayer(RequestPayer requestPayer) {
        this.requestPayer = requestPayer.toString();
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
        if (getMultipartUpload() != null)
            sb.append("MultipartUpload: " + getMultipartUpload() + ",");
        if (getUploadId() != null)
            sb.append("UploadId: " + getUploadId() + ",");
        if (getRequestPayer() != null)
            sb.append("RequestPayer: " + getRequestPayer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode
                + ((getMultipartUpload() == null) ? 0 : getMultipartUpload().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        hashCode = prime * hashCode
                + ((getRequestPayer() == null) ? 0 : getRequestPayer().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompleteMultipartUploadRequest == false)
            return false;
        CompleteMultipartUploadRequest other = (CompleteMultipartUploadRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getMultipartUpload() == null ^ this.getMultipartUpload() == null)
            return false;
        if (other.getMultipartUpload() != null
                && other.getMultipartUpload().equals(this.getMultipartUpload()) == false)
            return false;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        if (other.getRequestPayer() == null ^ this.getRequestPayer() == null)
            return false;
        if (other.getRequestPayer() != null
                && other.getRequestPayer().equals(this.getRequestPayer()) == false)
            return false;
        return true;
    }
}
