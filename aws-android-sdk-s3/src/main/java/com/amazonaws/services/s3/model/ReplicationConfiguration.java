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
 * A container for replication rules. You can add up to 1,000 rules. The maximum
 * size of a replication configuration is 2 MB.
 * </p>
 */
public class ReplicationConfiguration implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that Amazon S3 assumes when replicating objects. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-how-setup.html"
     * >How to Set Up Replication</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     */
    private String role;

    /**
     * <p>
     * A container for one or more replication rules. A replication
     * configuration must have at least one rule and can contain a maximum of
     * 1,000 rules.
     * </p>
     */
    private java.util.List<ReplicationRule> rules;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that Amazon S3 assumes when replicating objects. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-how-setup.html"
     * >How to Set Up Replication</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Identity and Access
     *         Management (IAM) role that Amazon S3 assumes when replicating
     *         objects. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-how-setup.html"
     *         >How to Set Up Replication</a> in the <i>Amazon Simple Storage
     *         Service Developer Guide</i>.
     *         </p>
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that Amazon S3 assumes when replicating objects. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-how-setup.html"
     * >How to Set Up Replication</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     *
     * @param role <p>
     *            The Amazon Resource Name (ARN) of the AWS Identity and Access
     *            Management (IAM) role that Amazon S3 assumes when replicating
     *            objects. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-how-setup.html"
     *            >How to Set Up Replication</a> in the <i>Amazon Simple Storage
     *            Service Developer Guide</i>.
     *            </p>
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that Amazon S3 assumes when replicating objects. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-how-setup.html"
     * >How to Set Up Replication</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param role <p>
     *            The Amazon Resource Name (ARN) of the AWS Identity and Access
     *            Management (IAM) role that Amazon S3 assumes when replicating
     *            objects. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-how-setup.html"
     *            >How to Set Up Replication</a> in the <i>Amazon Simple Storage
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationConfiguration withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * <p>
     * A container for one or more replication rules. A replication
     * configuration must have at least one rule and can contain a maximum of
     * 1,000 rules.
     * </p>
     *
     * @return <p>
     *         A container for one or more replication rules. A replication
     *         configuration must have at least one rule and can contain a
     *         maximum of 1,000 rules.
     *         </p>
     */
    public java.util.List<ReplicationRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * A container for one or more replication rules. A replication
     * configuration must have at least one rule and can contain a maximum of
     * 1,000 rules.
     * </p>
     *
     * @param rules <p>
     *            A container for one or more replication rules. A replication
     *            configuration must have at least one rule and can contain a
     *            maximum of 1,000 rules.
     *            </p>
     */
    public void setRules(java.util.Collection<ReplicationRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<ReplicationRule>(rules);
    }

    /**
     * <p>
     * A container for one or more replication rules. A replication
     * configuration must have at least one rule and can contain a maximum of
     * 1,000 rules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            A container for one or more replication rules. A replication
     *            configuration must have at least one rule and can contain a
     *            maximum of 1,000 rules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationConfiguration withRules(ReplicationRule... rules) {
        if (getRules() == null) {
            this.rules = new java.util.ArrayList<ReplicationRule>(rules.length);
        }
        for (ReplicationRule value : rules) {
            this.rules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A container for one or more replication rules. A replication
     * configuration must have at least one rule and can contain a maximum of
     * 1,000 rules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            A container for one or more replication rules. A replication
     *            configuration must have at least one rule and can contain a
     *            maximum of 1,000 rules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationConfiguration withRules(java.util.Collection<ReplicationRule> rules) {
        setRules(rules);
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
        if (getRole() != null)
            sb.append("Role: " + getRole() + ",");
        if (getRules() != null)
            sb.append("Rules: " + getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationConfiguration == false)
            return false;
        ReplicationConfiguration other = (ReplicationConfiguration) obj;

        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }
}
