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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Enables the standards specified by the provided <code>StandardsArn</code>. To
 * obtain the ARN for a standard, use the
 * <code> <a>DescribeStandards</a> </code> operation.
 * </p>
 * <p>
 * For more information, see the <a href=
 * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards.html"
 * >Security Standards</a> section of the <i>AWS Security Hub User Guide</i>.
 * </p>
 */
public class BatchEnableStandardsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The list of standards checks to enable.
     * </p>
     */
    private java.util.List<StandardsSubscriptionRequest> standardsSubscriptionRequests;

    /**
     * <p>
     * The list of standards checks to enable.
     * </p>
     *
     * @return <p>
     *         The list of standards checks to enable.
     *         </p>
     */
    public java.util.List<StandardsSubscriptionRequest> getStandardsSubscriptionRequests() {
        return standardsSubscriptionRequests;
    }

    /**
     * <p>
     * The list of standards checks to enable.
     * </p>
     *
     * @param standardsSubscriptionRequests <p>
     *            The list of standards checks to enable.
     *            </p>
     */
    public void setStandardsSubscriptionRequests(
            java.util.Collection<StandardsSubscriptionRequest> standardsSubscriptionRequests) {
        if (standardsSubscriptionRequests == null) {
            this.standardsSubscriptionRequests = null;
            return;
        }

        this.standardsSubscriptionRequests = new java.util.ArrayList<StandardsSubscriptionRequest>(
                standardsSubscriptionRequests);
    }

    /**
     * <p>
     * The list of standards checks to enable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param standardsSubscriptionRequests <p>
     *            The list of standards checks to enable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchEnableStandardsRequest withStandardsSubscriptionRequests(
            StandardsSubscriptionRequest... standardsSubscriptionRequests) {
        if (getStandardsSubscriptionRequests() == null) {
            this.standardsSubscriptionRequests = new java.util.ArrayList<StandardsSubscriptionRequest>(
                    standardsSubscriptionRequests.length);
        }
        for (StandardsSubscriptionRequest value : standardsSubscriptionRequests) {
            this.standardsSubscriptionRequests.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of standards checks to enable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param standardsSubscriptionRequests <p>
     *            The list of standards checks to enable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchEnableStandardsRequest withStandardsSubscriptionRequests(
            java.util.Collection<StandardsSubscriptionRequest> standardsSubscriptionRequests) {
        setStandardsSubscriptionRequests(standardsSubscriptionRequests);
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
        if (getStandardsSubscriptionRequests() != null)
            sb.append("StandardsSubscriptionRequests: " + getStandardsSubscriptionRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getStandardsSubscriptionRequests() == null) ? 0
                        : getStandardsSubscriptionRequests().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchEnableStandardsRequest == false)
            return false;
        BatchEnableStandardsRequest other = (BatchEnableStandardsRequest) obj;

        if (other.getStandardsSubscriptionRequests() == null
                ^ this.getStandardsSubscriptionRequests() == null)
            return false;
        if (other.getStandardsSubscriptionRequests() != null
                && other.getStandardsSubscriptionRequests().equals(
                        this.getStandardsSubscriptionRequests()) == false)
            return false;
        return true;
    }
}
