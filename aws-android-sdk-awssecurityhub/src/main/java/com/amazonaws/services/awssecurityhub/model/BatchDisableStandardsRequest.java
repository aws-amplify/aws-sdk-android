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
 * Disables the standards specified by the provided
 * <code>StandardsSubscriptionArns</code>.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards.html"
 * >Security Standards</a> section of the <i>AWS Security Hub User Guide</i>.
 * </p>
 */
public class BatchDisableStandardsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARNs of the standards subscriptions to disable.
     * </p>
     */
    private java.util.List<String> standardsSubscriptionArns;

    /**
     * <p>
     * The ARNs of the standards subscriptions to disable.
     * </p>
     *
     * @return <p>
     *         The ARNs of the standards subscriptions to disable.
     *         </p>
     */
    public java.util.List<String> getStandardsSubscriptionArns() {
        return standardsSubscriptionArns;
    }

    /**
     * <p>
     * The ARNs of the standards subscriptions to disable.
     * </p>
     *
     * @param standardsSubscriptionArns <p>
     *            The ARNs of the standards subscriptions to disable.
     *            </p>
     */
    public void setStandardsSubscriptionArns(java.util.Collection<String> standardsSubscriptionArns) {
        if (standardsSubscriptionArns == null) {
            this.standardsSubscriptionArns = null;
            return;
        }

        this.standardsSubscriptionArns = new java.util.ArrayList<String>(standardsSubscriptionArns);
    }

    /**
     * <p>
     * The ARNs of the standards subscriptions to disable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param standardsSubscriptionArns <p>
     *            The ARNs of the standards subscriptions to disable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDisableStandardsRequest withStandardsSubscriptionArns(
            String... standardsSubscriptionArns) {
        if (getStandardsSubscriptionArns() == null) {
            this.standardsSubscriptionArns = new java.util.ArrayList<String>(
                    standardsSubscriptionArns.length);
        }
        for (String value : standardsSubscriptionArns) {
            this.standardsSubscriptionArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of the standards subscriptions to disable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param standardsSubscriptionArns <p>
     *            The ARNs of the standards subscriptions to disable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDisableStandardsRequest withStandardsSubscriptionArns(
            java.util.Collection<String> standardsSubscriptionArns) {
        setStandardsSubscriptionArns(standardsSubscriptionArns);
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
        if (getStandardsSubscriptionArns() != null)
            sb.append("StandardsSubscriptionArns: " + getStandardsSubscriptionArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getStandardsSubscriptionArns() == null) ? 0 : getStandardsSubscriptionArns()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDisableStandardsRequest == false)
            return false;
        BatchDisableStandardsRequest other = (BatchDisableStandardsRequest) obj;

        if (other.getStandardsSubscriptionArns() == null
                ^ this.getStandardsSubscriptionArns() == null)
            return false;
        if (other.getStandardsSubscriptionArns() != null
                && other.getStandardsSubscriptionArns().equals(this.getStandardsSubscriptionArns()) == false)
            return false;
        return true;
    }
}
