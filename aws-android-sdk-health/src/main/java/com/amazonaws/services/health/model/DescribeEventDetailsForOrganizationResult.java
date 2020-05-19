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

package com.amazonaws.services.health.model;

import java.io.Serializable;

public class DescribeEventDetailsForOrganizationResult implements Serializable {
    /**
     * <p>
     * Information about the events that could be retrieved.
     * </p>
     */
    private java.util.List<OrganizationEventDetails> successfulSet;

    /**
     * <p>
     * Error messages for any events that could not be retrieved.
     * </p>
     */
    private java.util.List<OrganizationEventDetailsErrorItem> failedSet;

    /**
     * <p>
     * Information about the events that could be retrieved.
     * </p>
     *
     * @return <p>
     *         Information about the events that could be retrieved.
     *         </p>
     */
    public java.util.List<OrganizationEventDetails> getSuccessfulSet() {
        return successfulSet;
    }

    /**
     * <p>
     * Information about the events that could be retrieved.
     * </p>
     *
     * @param successfulSet <p>
     *            Information about the events that could be retrieved.
     *            </p>
     */
    public void setSuccessfulSet(java.util.Collection<OrganizationEventDetails> successfulSet) {
        if (successfulSet == null) {
            this.successfulSet = null;
            return;
        }

        this.successfulSet = new java.util.ArrayList<OrganizationEventDetails>(successfulSet);
    }

    /**
     * <p>
     * Information about the events that could be retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulSet <p>
     *            Information about the events that could be retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventDetailsForOrganizationResult withSuccessfulSet(
            OrganizationEventDetails... successfulSet) {
        if (getSuccessfulSet() == null) {
            this.successfulSet = new java.util.ArrayList<OrganizationEventDetails>(
                    successfulSet.length);
        }
        for (OrganizationEventDetails value : successfulSet) {
            this.successfulSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the events that could be retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulSet <p>
     *            Information about the events that could be retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventDetailsForOrganizationResult withSuccessfulSet(
            java.util.Collection<OrganizationEventDetails> successfulSet) {
        setSuccessfulSet(successfulSet);
        return this;
    }

    /**
     * <p>
     * Error messages for any events that could not be retrieved.
     * </p>
     *
     * @return <p>
     *         Error messages for any events that could not be retrieved.
     *         </p>
     */
    public java.util.List<OrganizationEventDetailsErrorItem> getFailedSet() {
        return failedSet;
    }

    /**
     * <p>
     * Error messages for any events that could not be retrieved.
     * </p>
     *
     * @param failedSet <p>
     *            Error messages for any events that could not be retrieved.
     *            </p>
     */
    public void setFailedSet(java.util.Collection<OrganizationEventDetailsErrorItem> failedSet) {
        if (failedSet == null) {
            this.failedSet = null;
            return;
        }

        this.failedSet = new java.util.ArrayList<OrganizationEventDetailsErrorItem>(failedSet);
    }

    /**
     * <p>
     * Error messages for any events that could not be retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedSet <p>
     *            Error messages for any events that could not be retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventDetailsForOrganizationResult withFailedSet(
            OrganizationEventDetailsErrorItem... failedSet) {
        if (getFailedSet() == null) {
            this.failedSet = new java.util.ArrayList<OrganizationEventDetailsErrorItem>(
                    failedSet.length);
        }
        for (OrganizationEventDetailsErrorItem value : failedSet) {
            this.failedSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Error messages for any events that could not be retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedSet <p>
     *            Error messages for any events that could not be retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventDetailsForOrganizationResult withFailedSet(
            java.util.Collection<OrganizationEventDetailsErrorItem> failedSet) {
        setFailedSet(failedSet);
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
        if (getSuccessfulSet() != null)
            sb.append("successfulSet: " + getSuccessfulSet() + ",");
        if (getFailedSet() != null)
            sb.append("failedSet: " + getFailedSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSuccessfulSet() == null) ? 0 : getSuccessfulSet().hashCode());
        hashCode = prime * hashCode + ((getFailedSet() == null) ? 0 : getFailedSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventDetailsForOrganizationResult == false)
            return false;
        DescribeEventDetailsForOrganizationResult other = (DescribeEventDetailsForOrganizationResult) obj;

        if (other.getSuccessfulSet() == null ^ this.getSuccessfulSet() == null)
            return false;
        if (other.getSuccessfulSet() != null
                && other.getSuccessfulSet().equals(this.getSuccessfulSet()) == false)
            return false;
        if (other.getFailedSet() == null ^ this.getFailedSet() == null)
            return false;
        if (other.getFailedSet() != null
                && other.getFailedSet().equals(this.getFailedSet()) == false)
            return false;
        return true;
    }
}
