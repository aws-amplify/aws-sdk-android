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
 * Set the logging parameters for a bucket and to specify permissions for who
 * can view and modify the logging parameters. All logs are saved to buckets in
 * the same AWS Region as the source bucket. To set the logging status of a
 * bucket, you must be the bucket owner.
 * </p>
 * <p>
 * The bucket owner is automatically granted FULL_CONTROL to all logs. You use
 * the <code>Grantee</code> request element to grant access to other people. The
 * <code>Permissions</code> request element specifies the kind of access the
 * grantee has to the logs.
 * </p>
 * <p>
 * <b>Grantee Values</b>
 * </p>
 * <p>
 * You can specify the person (grantee) to whom you're assigning access rights
 * (using request elements) in the following ways:
 * </p>
 * <ul>
 * <li>
 * <p>
 * By the person's ID:
 * </p>
 * <p>
 * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="CanonicalUser"&gt;&lt;ID&gt;&lt;&gt;ID&lt;&gt;&lt;/ID&gt;&lt;DisplayName&gt;&lt;&gt;GranteesEmail&lt;&gt;&lt;/DisplayName&gt; &lt;/Grantee&gt;</code>
 * </p>
 * <p>
 * DisplayName is optional and ignored in the request.
 * </p>
 * </li>
 * <li>
 * <p>
 * By Email address:
 * </p>
 * <p>
 * <code> &lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="AmazonCustomerByEmail"&gt;&lt;EmailAddress&gt;&lt;&gt;Grantees@email.com&lt;&gt;&lt;/EmailAddress&gt;&lt;/Grantee&gt;</code>
 * </p>
 * <p>
 * The grantee is resolved to the CanonicalUser and, in a response to a GET
 * Object acl request, appears as the CanonicalUser.
 * </p>
 * </li>
 * <li>
 * <p>
 * By URI:
 * </p>
 * <p>
 * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="Group"&gt;&lt;URI&gt;&lt;&gt;http://acs.amazonaws.com/groups/global/AuthenticatedUsers&lt;&gt;&lt;/URI&gt;&lt;/Grantee&gt;</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * To enable logging, you use LoggingEnabled and its children request elements.
 * To disable logging, you use an empty BucketLoggingStatus request element:
 * </p>
 * <p>
 * <code>&lt;BucketLoggingStatus xmlns="http://doc.s3.amazonaws.com/2006-03-01" /&gt;</code>
 * </p>
 * <p>
 * For more information about server access logging, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerLogs.html">Server
 * Access Logging</a>.
 * </p>
 * <p>
 * For more information about creating a bucket, see <a>CreateBucket</a>. For
 * more information about returning the logging status of a bucket, see
 * <a>GetBucketLogging</a>.
 * </p>
 * <p>
 * The following operations are related to <code>PutBucketLogging</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>PutObject</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBucket</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateBucket</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetBucketLogging</a>
 * </p>
 * </li>
 * </ul>
 */
public class PutBucketLoggingRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the bucket for which to set the logging parameters.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * Container for logging status information.
     * </p>
     */
    private BucketLoggingStatus bucketLoggingStatus;

    /**
     * <p>
     * The MD5 hash of the <code>PutBucketLogging</code> request body.
     * </p>
     */
    private String contentMD5;

    /**
     * <p>
     * The name of the bucket for which to set the logging parameters.
     * </p>
     *
     * @return <p>
     *         The name of the bucket for which to set the logging parameters.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the bucket for which to set the logging parameters.
     * </p>
     *
     * @param bucket <p>
     *            The name of the bucket for which to set the logging
     *            parameters.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket for which to set the logging parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the bucket for which to set the logging
     *            parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketLoggingRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * Container for logging status information.
     * </p>
     *
     * @return <p>
     *         Container for logging status information.
     *         </p>
     */
    public BucketLoggingStatus getBucketLoggingStatus() {
        return bucketLoggingStatus;
    }

    /**
     * <p>
     * Container for logging status information.
     * </p>
     *
     * @param bucketLoggingStatus <p>
     *            Container for logging status information.
     *            </p>
     */
    public void setBucketLoggingStatus(BucketLoggingStatus bucketLoggingStatus) {
        this.bucketLoggingStatus = bucketLoggingStatus;
    }

    /**
     * <p>
     * Container for logging status information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketLoggingStatus <p>
     *            Container for logging status information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketLoggingRequest withBucketLoggingStatus(BucketLoggingStatus bucketLoggingStatus) {
        this.bucketLoggingStatus = bucketLoggingStatus;
        return this;
    }

    /**
     * <p>
     * The MD5 hash of the <code>PutBucketLogging</code> request body.
     * </p>
     *
     * @return <p>
     *         The MD5 hash of the <code>PutBucketLogging</code> request body.
     *         </p>
     */
    public String getContentMD5() {
        return contentMD5;
    }

    /**
     * <p>
     * The MD5 hash of the <code>PutBucketLogging</code> request body.
     * </p>
     *
     * @param contentMD5 <p>
     *            The MD5 hash of the <code>PutBucketLogging</code> request
     *            body.
     *            </p>
     */
    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    /**
     * <p>
     * The MD5 hash of the <code>PutBucketLogging</code> request body.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentMD5 <p>
     *            The MD5 hash of the <code>PutBucketLogging</code> request
     *            body.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketLoggingRequest withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
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
        if (getBucketLoggingStatus() != null)
            sb.append("BucketLoggingStatus: " + getBucketLoggingStatus() + ",");
        if (getContentMD5() != null)
            sb.append("ContentMD5: " + getContentMD5());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode
                + ((getBucketLoggingStatus() == null) ? 0 : getBucketLoggingStatus().hashCode());
        hashCode = prime * hashCode + ((getContentMD5() == null) ? 0 : getContentMD5().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBucketLoggingRequest == false)
            return false;
        PutBucketLoggingRequest other = (PutBucketLoggingRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getBucketLoggingStatus() == null ^ this.getBucketLoggingStatus() == null)
            return false;
        if (other.getBucketLoggingStatus() != null
                && other.getBucketLoggingStatus().equals(this.getBucketLoggingStatus()) == false)
            return false;
        if (other.getContentMD5() == null ^ this.getContentMD5() == null)
            return false;
        if (other.getContentMD5() != null
                && other.getContentMD5().equals(this.getContentMD5()) == false)
            return false;
        return true;
    }
}
