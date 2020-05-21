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
 * Returns the replication configuration of a bucket.
 * </p>
 * <note>
 * <p>
 * It can take a while to propagate the put or delete a replication
 * configuration to all Amazon S3 systems. Therefore, a get request soon after
 * put or delete can return a wrong result.
 * </p>
 * </note>
 * <p>
 * For information about replication configuration, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html"
 * >Replication</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.
 * </p>
 * <p>
 * This operation requires permissions for the
 * <code>s3:GetReplicationConfiguration</code> action. For more information
 * about permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html"
 * >Using Bucket Policies and User Policies</a>.
 * </p>
 * <p>
 * If you include the <code>Filter</code> element in a replication
 * configuration, you must also include the <code>DeleteMarkerReplication</code>
 * and <code>Priority</code> elements. The response also returns those elements.
 * </p>
 * <p>
 * For information about <code>GetBucketReplication</code> errors, see
 * <a>ReplicationErrorCodeList</a>
 * </p>
 * <p>
 * The following operations are related to <code>GetBucketReplication</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>PutBucketReplication</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBucketReplication</a>
 * </p>
 * </li>
 * </ul>
 */
public class GetBucketReplicationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The bucket name for which to get the replication information.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The bucket name for which to get the replication information.
     * </p>
     *
     * @return <p>
     *         The bucket name for which to get the replication information.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The bucket name for which to get the replication information.
     * </p>
     *
     * @param bucket <p>
     *            The bucket name for which to get the replication information.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The bucket name for which to get the replication information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The bucket name for which to get the replication information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketReplicationRequest withBucket(String bucket) {
        this.bucket = bucket;
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
            sb.append("Bucket: " + getBucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketReplicationRequest == false)
            return false;
        GetBucketReplicationRequest other = (GetBucketReplicationRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        return true;
    }
}
