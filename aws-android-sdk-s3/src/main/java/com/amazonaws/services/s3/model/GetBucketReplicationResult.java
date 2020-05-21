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

public class GetBucketReplicationResult implements Serializable {
    /**
     * <p>
     * A container for replication rules. You can add up to 1,000 rules. The
     * maximum size of a replication configuration is 2 MB.
     * </p>
     */
    private ReplicationConfiguration replicationConfiguration;

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
    public GetBucketReplicationResult withReplicationConfiguration(
            ReplicationConfiguration replicationConfiguration) {
        this.replicationConfiguration = replicationConfiguration;
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
        if (getReplicationConfiguration() != null)
            sb.append("ReplicationConfiguration: " + getReplicationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReplicationConfiguration() == null) ? 0 : getReplicationConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketReplicationResult == false)
            return false;
        GetBucketReplicationResult other = (GetBucketReplicationResult) obj;

        if (other.getReplicationConfiguration() == null
                ^ this.getReplicationConfiguration() == null)
            return false;
        if (other.getReplicationConfiguration() != null
                && other.getReplicationConfiguration().equals(this.getReplicationConfiguration()) == false)
            return false;
        return true;
    }
}
