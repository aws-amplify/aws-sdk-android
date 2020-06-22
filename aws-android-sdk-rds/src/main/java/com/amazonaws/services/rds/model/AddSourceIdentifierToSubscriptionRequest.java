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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds a source identifier to an existing RDS event notification subscription.
 * </p>
 */
public class AddSourceIdentifierToSubscriptionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the RDS event notification subscription you want to add a
     * source identifier to.
     * </p>
     */
    private String subscriptionName;

    /**
     * <p>
     * The identifier of the event source to be added.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the source type is a DB instance, then a
     * <code>DBInstanceIdentifier</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a DB security group, a
     * <code>DBSecurityGroupName</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a DB parameter group, a
     * <code>DBParameterGroupName</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a DB snapshot, a <code>DBSnapshotIdentifier</code>
     * must be supplied.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceIdentifier;

    /**
     * <p>
     * The name of the RDS event notification subscription you want to add a
     * source identifier to.
     * </p>
     *
     * @return <p>
     *         The name of the RDS event notification subscription you want to
     *         add a source identifier to.
     *         </p>
     */
    public String getSubscriptionName() {
        return subscriptionName;
    }

    /**
     * <p>
     * The name of the RDS event notification subscription you want to add a
     * source identifier to.
     * </p>
     *
     * @param subscriptionName <p>
     *            The name of the RDS event notification subscription you want
     *            to add a source identifier to.
     *            </p>
     */
    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    /**
     * <p>
     * The name of the RDS event notification subscription you want to add a
     * source identifier to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subscriptionName <p>
     *            The name of the RDS event notification subscription you want
     *            to add a source identifier to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddSourceIdentifierToSubscriptionRequest withSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }

    /**
     * <p>
     * The identifier of the event source to be added.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the source type is a DB instance, then a
     * <code>DBInstanceIdentifier</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a DB security group, a
     * <code>DBSecurityGroupName</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a DB parameter group, a
     * <code>DBParameterGroupName</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a DB snapshot, a <code>DBSnapshotIdentifier</code>
     * must be supplied.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The identifier of the event source to be added.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the source type is a DB instance, then a
     *         <code>DBInstanceIdentifier</code> must be supplied.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source type is a DB security group, a
     *         <code>DBSecurityGroupName</code> must be supplied.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source type is a DB parameter group, a
     *         <code>DBParameterGroupName</code> must be supplied.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source type is a DB snapshot, a
     *         <code>DBSnapshotIdentifier</code> must be supplied.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the event source to be added.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the source type is a DB instance, then a
     * <code>DBInstanceIdentifier</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a DB security group, a
     * <code>DBSecurityGroupName</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a DB parameter group, a
     * <code>DBParameterGroupName</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a DB snapshot, a <code>DBSnapshotIdentifier</code>
     * must be supplied.
     * </p>
     * </li>
     * </ul>
     *
     * @param sourceIdentifier <p>
     *            The identifier of the event source to be added.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the source type is a DB instance, then a
     *            <code>DBInstanceIdentifier</code> must be supplied.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source type is a DB security group, a
     *            <code>DBSecurityGroupName</code> must be supplied.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source type is a DB parameter group, a
     *            <code>DBParameterGroupName</code> must be supplied.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source type is a DB snapshot, a
     *            <code>DBSnapshotIdentifier</code> must be supplied.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the event source to be added.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the source type is a DB instance, then a
     * <code>DBInstanceIdentifier</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a DB security group, a
     * <code>DBSecurityGroupName</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a DB parameter group, a
     * <code>DBParameterGroupName</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a DB snapshot, a <code>DBSnapshotIdentifier</code>
     * must be supplied.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceIdentifier <p>
     *            The identifier of the event source to be added.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the source type is a DB instance, then a
     *            <code>DBInstanceIdentifier</code> must be supplied.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source type is a DB security group, a
     *            <code>DBSecurityGroupName</code> must be supplied.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source type is a DB parameter group, a
     *            <code>DBParameterGroupName</code> must be supplied.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source type is a DB snapshot, a
     *            <code>DBSnapshotIdentifier</code> must be supplied.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddSourceIdentifierToSubscriptionRequest withSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
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
        if (getSubscriptionName() != null)
            sb.append("SubscriptionName: " + getSubscriptionName() + ",");
        if (getSourceIdentifier() != null)
            sb.append("SourceIdentifier: " + getSourceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSubscriptionName() == null) ? 0 : getSubscriptionName().hashCode());
        hashCode = prime * hashCode
                + ((getSourceIdentifier() == null) ? 0 : getSourceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddSourceIdentifierToSubscriptionRequest == false)
            return false;
        AddSourceIdentifierToSubscriptionRequest other = (AddSourceIdentifierToSubscriptionRequest) obj;

        if (other.getSubscriptionName() == null ^ this.getSubscriptionName() == null)
            return false;
        if (other.getSubscriptionName() != null
                && other.getSubscriptionName().equals(this.getSubscriptionName()) == false)
            return false;
        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null)
            return false;
        if (other.getSourceIdentifier() != null
                && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false)
            return false;
        return true;
    }
}
