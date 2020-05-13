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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about settings that define whether one or more objects
 * in an S3 bucket are replicated to S3 buckets for other AWS accounts and, if
 * so, which accounts.
 * </p>
 */
public class ReplicationDetails implements Serializable {
    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more
     * objects to any destination.
     * </p>
     */
    private Boolean replicated;

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more
     * objects to an AWS account that isn't part of the Amazon Macie
     * organization.
     * </p>
     */
    private Boolean replicatedExternally;

    /**
     * <p>
     * An array of AWS account IDs, one for each AWS account that the bucket is
     * configured to replicate one or more objects to.
     * </p>
     */
    private java.util.List<String> replicationAccounts;

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more
     * objects to any destination.
     * </p>
     *
     * @return <p>
     *         Specifies whether the bucket is configured to replicate one or
     *         more objects to any destination.
     *         </p>
     */
    public Boolean isReplicated() {
        return replicated;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more
     * objects to any destination.
     * </p>
     *
     * @return <p>
     *         Specifies whether the bucket is configured to replicate one or
     *         more objects to any destination.
     *         </p>
     */
    public Boolean getReplicated() {
        return replicated;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more
     * objects to any destination.
     * </p>
     *
     * @param replicated <p>
     *            Specifies whether the bucket is configured to replicate one or
     *            more objects to any destination.
     *            </p>
     */
    public void setReplicated(Boolean replicated) {
        this.replicated = replicated;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more
     * objects to any destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicated <p>
     *            Specifies whether the bucket is configured to replicate one or
     *            more objects to any destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationDetails withReplicated(Boolean replicated) {
        this.replicated = replicated;
        return this;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more
     * objects to an AWS account that isn't part of the Amazon Macie
     * organization.
     * </p>
     *
     * @return <p>
     *         Specifies whether the bucket is configured to replicate one or
     *         more objects to an AWS account that isn't part of the Amazon
     *         Macie organization.
     *         </p>
     */
    public Boolean isReplicatedExternally() {
        return replicatedExternally;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more
     * objects to an AWS account that isn't part of the Amazon Macie
     * organization.
     * </p>
     *
     * @return <p>
     *         Specifies whether the bucket is configured to replicate one or
     *         more objects to an AWS account that isn't part of the Amazon
     *         Macie organization.
     *         </p>
     */
    public Boolean getReplicatedExternally() {
        return replicatedExternally;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more
     * objects to an AWS account that isn't part of the Amazon Macie
     * organization.
     * </p>
     *
     * @param replicatedExternally <p>
     *            Specifies whether the bucket is configured to replicate one or
     *            more objects to an AWS account that isn't part of the Amazon
     *            Macie organization.
     *            </p>
     */
    public void setReplicatedExternally(Boolean replicatedExternally) {
        this.replicatedExternally = replicatedExternally;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more
     * objects to an AWS account that isn't part of the Amazon Macie
     * organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicatedExternally <p>
     *            Specifies whether the bucket is configured to replicate one or
     *            more objects to an AWS account that isn't part of the Amazon
     *            Macie organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationDetails withReplicatedExternally(Boolean replicatedExternally) {
        this.replicatedExternally = replicatedExternally;
        return this;
    }

    /**
     * <p>
     * An array of AWS account IDs, one for each AWS account that the bucket is
     * configured to replicate one or more objects to.
     * </p>
     *
     * @return <p>
     *         An array of AWS account IDs, one for each AWS account that the
     *         bucket is configured to replicate one or more objects to.
     *         </p>
     */
    public java.util.List<String> getReplicationAccounts() {
        return replicationAccounts;
    }

    /**
     * <p>
     * An array of AWS account IDs, one for each AWS account that the bucket is
     * configured to replicate one or more objects to.
     * </p>
     *
     * @param replicationAccounts <p>
     *            An array of AWS account IDs, one for each AWS account that the
     *            bucket is configured to replicate one or more objects to.
     *            </p>
     */
    public void setReplicationAccounts(java.util.Collection<String> replicationAccounts) {
        if (replicationAccounts == null) {
            this.replicationAccounts = null;
            return;
        }

        this.replicationAccounts = new java.util.ArrayList<String>(replicationAccounts);
    }

    /**
     * <p>
     * An array of AWS account IDs, one for each AWS account that the bucket is
     * configured to replicate one or more objects to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationAccounts <p>
     *            An array of AWS account IDs, one for each AWS account that the
     *            bucket is configured to replicate one or more objects to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationDetails withReplicationAccounts(String... replicationAccounts) {
        if (getReplicationAccounts() == null) {
            this.replicationAccounts = new java.util.ArrayList<String>(replicationAccounts.length);
        }
        for (String value : replicationAccounts) {
            this.replicationAccounts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of AWS account IDs, one for each AWS account that the bucket is
     * configured to replicate one or more objects to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationAccounts <p>
     *            An array of AWS account IDs, one for each AWS account that the
     *            bucket is configured to replicate one or more objects to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationDetails withReplicationAccounts(
            java.util.Collection<String> replicationAccounts) {
        setReplicationAccounts(replicationAccounts);
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
        if (getReplicated() != null)
            sb.append("replicated: " + getReplicated() + ",");
        if (getReplicatedExternally() != null)
            sb.append("replicatedExternally: " + getReplicatedExternally() + ",");
        if (getReplicationAccounts() != null)
            sb.append("replicationAccounts: " + getReplicationAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicated() == null) ? 0 : getReplicated().hashCode());
        hashCode = prime * hashCode
                + ((getReplicatedExternally() == null) ? 0 : getReplicatedExternally().hashCode());
        hashCode = prime * hashCode
                + ((getReplicationAccounts() == null) ? 0 : getReplicationAccounts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationDetails == false)
            return false;
        ReplicationDetails other = (ReplicationDetails) obj;

        if (other.getReplicated() == null ^ this.getReplicated() == null)
            return false;
        if (other.getReplicated() != null
                && other.getReplicated().equals(this.getReplicated()) == false)
            return false;
        if (other.getReplicatedExternally() == null ^ this.getReplicatedExternally() == null)
            return false;
        if (other.getReplicatedExternally() != null
                && other.getReplicatedExternally().equals(this.getReplicatedExternally()) == false)
            return false;
        if (other.getReplicationAccounts() == null ^ this.getReplicationAccounts() == null)
            return false;
        if (other.getReplicationAccounts() != null
                && other.getReplicationAccounts().equals(this.getReplicationAccounts()) == false)
            return false;
        return true;
    }
}
