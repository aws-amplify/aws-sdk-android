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
 * Creates a replication configuration or replaces an existing one. For more
 * information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html"
 * >Replication</a> in the <i>Amazon S3 Developer Guide</i>.
 * </p>
 * <note>
 * <p>
 * To perform this operation, the user or role performing the operation must
 * have the <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html"
 * >iam:PassRole</a> permission.
 * </p>
 * </note>
 * <p>
 * Specify the replication configuration in the request body. In the replication
 * configuration, you provide the name of the destination bucket where you want
 * Amazon S3 to replicate objects, the IAM role that Amazon S3 can assume to
 * replicate objects on your behalf, and other relevant information.
 * </p>
 * <p>
 * A replication configuration must include at least one rule, and can contain a
 * maximum of 1,000. Each rule identifies a subset of objects to replicate by
 * filtering the objects in the source bucket. To choose additional subsets of
 * objects to replicate, add a rule for each subset. All rules must specify the
 * same destination bucket.
 * </p>
 * <p>
 * To specify a subset of the objects in the source bucket to apply a
 * replication rule to, add the Filter element as a child of the Rule element.
 * You can filter objects based on an object key prefix, one or more object
 * tags, or both. When you add the Filter element in the configuration, you must
 * also add the following elements: <code>DeleteMarkerReplication</code>,
 * <code>Status</code>, and <code>Priority</code>.
 * </p>
 * <p>
 * For information about enabling versioning on a bucket, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html">Using
 * Versioning</a>.
 * </p>
 * <p>
 * By default, a resource owner, in this case the AWS account that created the
 * bucket, can perform this operation. The resource owner can also grant others
 * permissions to perform the operation. For more information about permissions,
 * see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html"
 * >Specifying Permissions in a Policy</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html"
 * >Managing Access Permissions to Your Amazon S3 Resources</a>.
 * </p>
 * <p>
 * <b>Handling Replication of Encrypted Objects</b>
 * </p>
 * <p>
 * By default, Amazon S3 doesn't replicate objects that are stored at rest using
 * server-side encryption with CMKs stored in AWS KMS. To replicate AWS
 * KMS-encrypted objects, add the following:
 * <code>SourceSelectionCriteria</code>, <code>SseKmsEncryptedObjects</code>,
 * <code>Status</code>, <code>EncryptionConfiguration</code>, and
 * <code>ReplicaKmsKeyID</code>. For information about replication
 * configuration, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-config-for-kms-objects.html"
 * >Replicating Objects Created with SSE Using CMKs stored in AWS KMS</a>.
 * </p>
 * <p>
 * For information on <code>PutBucketReplication</code> errors, see
 * <a>ReplicationErrorCodeList</a>
 * </p>
 * <p>
 * The following operations are related to <code>PutBucketReplication</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetBucketReplication</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBucketReplication</a>
 * </p>
 * </li>
 * </ul>
 */
public class PutBucketReplicationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the bucket
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the data. You must use this
     * header as a message integrity check to verify that the request body was
     * not corrupted in transit. For more information, see <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     * </p>
     */
    private String contentMD5;

    /**
     * <p>
     * A container for replication rules. You can add up to 1,000 rules. The
     * maximum size of a replication configuration is 2 MB.
     * </p>
     */
    private ReplicationConfiguration replicationConfiguration;

    /**
     * <p/>
     */
    private String token;

    /**
     * <p>
     * The name of the bucket
     * </p>
     *
     * @return <p>
     *         The name of the bucket
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the bucket
     * </p>
     *
     * @param bucket <p>
     *            The name of the bucket
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the bucket
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketReplicationRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the data. You must use this
     * header as a message integrity check to verify that the request body was
     * not corrupted in transit. For more information, see <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     * </p>
     *
     * @return <p>
     *         The base64-encoded 128-bit MD5 digest of the data. You must use
     *         this header as a message integrity check to verify that the
     *         request body was not corrupted in transit. For more information,
     *         see <a href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     *         </p>
     */
    public String getContentMD5() {
        return contentMD5;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the data. You must use this
     * header as a message integrity check to verify that the request body was
     * not corrupted in transit. For more information, see <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     * </p>
     *
     * @param contentMD5 <p>
     *            The base64-encoded 128-bit MD5 digest of the data. You must
     *            use this header as a message integrity check to verify that
     *            the request body was not corrupted in transit. For more
     *            information, see <a
     *            href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     *            </p>
     */
    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the data. You must use this
     * header as a message integrity check to verify that the request body was
     * not corrupted in transit. For more information, see <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentMD5 <p>
     *            The base64-encoded 128-bit MD5 digest of the data. You must
     *            use this header as a message integrity check to verify that
     *            the request body was not corrupted in transit. For more
     *            information, see <a
     *            href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketReplicationRequest withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * <p>
     * A container for replication rules. You can add up to 1,000 rules. The
     * maximum size of a replication configuration is 2 MB.
     * </p>
     *
     * @return <p>
     *         A container for replication rules. You can add up to 1,000 rules.
     *         The maximum size of a replication configuration is 2 MB.
     *         </p>
     */
    public ReplicationConfiguration getReplicationConfiguration() {
        return replicationConfiguration;
    }

    /**
     * <p>
     * A container for replication rules. You can add up to 1,000 rules. The
     * maximum size of a replication configuration is 2 MB.
     * </p>
     *
     * @param replicationConfiguration <p>
     *            A container for replication rules. You can add up to 1,000
     *            rules. The maximum size of a replication configuration is 2
     *            MB.
     *            </p>
     */
    public void setReplicationConfiguration(ReplicationConfiguration replicationConfiguration) {
        this.replicationConfiguration = replicationConfiguration;
    }

    /**
     * <p>
     * A container for replication rules. You can add up to 1,000 rules. The
     * maximum size of a replication configuration is 2 MB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationConfiguration <p>
     *            A container for replication rules. You can add up to 1,000
     *            rules. The maximum size of a replication configuration is 2
     *            MB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketReplicationRequest withReplicationConfiguration(
            ReplicationConfiguration replicationConfiguration) {
        this.replicationConfiguration = replicationConfiguration;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public String getToken() {
        return token;
    }

    /**
     * <p/>
     *
     * @param token <p/>
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param token <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketReplicationRequest withToken(String token) {
        this.token = token;
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
        if (getContentMD5() != null)
            sb.append("ContentMD5: " + getContentMD5() + ",");
        if (getReplicationConfiguration() != null)
            sb.append("ReplicationConfiguration: " + getReplicationConfiguration() + ",");
        if (getToken() != null)
            sb.append("Token: " + getToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getContentMD5() == null) ? 0 : getContentMD5().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationConfiguration() == null) ? 0 : getReplicationConfiguration()
                        .hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBucketReplicationRequest == false)
            return false;
        PutBucketReplicationRequest other = (PutBucketReplicationRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getContentMD5() == null ^ this.getContentMD5() == null)
            return false;
        if (other.getContentMD5() != null
                && other.getContentMD5().equals(this.getContentMD5()) == false)
            return false;
        if (other.getReplicationConfiguration() == null
                ^ this.getReplicationConfiguration() == null)
            return false;
        if (other.getReplicationConfiguration() != null
                && other.getReplicationConfiguration().equals(this.getReplicationConfiguration()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        return true;
    }
}
