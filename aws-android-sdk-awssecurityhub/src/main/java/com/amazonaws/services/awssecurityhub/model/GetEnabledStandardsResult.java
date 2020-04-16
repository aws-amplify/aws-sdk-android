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

public class GetEnabledStandardsResult implements Serializable {
    /**
     * <p>
     * The list of <code>StandardsSubscriptions</code> objects that include
     * information about the enabled standards.
     * </p>
     */
    private java.util.List<StandardsSubscription> standardsSubscriptions;

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of <code>StandardsSubscriptions</code> objects that include
     * information about the enabled standards.
     * </p>
     *
     * @return <p>
     *         The list of <code>StandardsSubscriptions</code> objects that
     *         include information about the enabled standards.
     *         </p>
     */
    public java.util.List<StandardsSubscription> getStandardsSubscriptions() {
        return standardsSubscriptions;
    }

    /**
     * <p>
     * The list of <code>StandardsSubscriptions</code> objects that include
     * information about the enabled standards.
     * </p>
     *
     * @param standardsSubscriptions <p>
     *            The list of <code>StandardsSubscriptions</code> objects that
     *            include information about the enabled standards.
     *            </p>
     */
    public void setStandardsSubscriptions(
            java.util.Collection<StandardsSubscription> standardsSubscriptions) {
        if (standardsSubscriptions == null) {
            this.standardsSubscriptions = null;
            return;
        }

        this.standardsSubscriptions = new java.util.ArrayList<StandardsSubscription>(
                standardsSubscriptions);
    }

    /**
     * <p>
     * The list of <code>StandardsSubscriptions</code> objects that include
     * information about the enabled standards.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param standardsSubscriptions <p>
     *            The list of <code>StandardsSubscriptions</code> objects that
     *            include information about the enabled standards.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetEnabledStandardsResult withStandardsSubscriptions(
            StandardsSubscription... standardsSubscriptions) {
        if (getStandardsSubscriptions() == null) {
            this.standardsSubscriptions = new java.util.ArrayList<StandardsSubscription>(
                    standardsSubscriptions.length);
        }
        for (StandardsSubscription value : standardsSubscriptions) {
            this.standardsSubscriptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of <code>StandardsSubscriptions</code> objects that include
     * information about the enabled standards.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param standardsSubscriptions <p>
     *            The list of <code>StandardsSubscriptions</code> objects that
     *            include information about the enabled standards.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetEnabledStandardsResult withStandardsSubscriptions(
            java.util.Collection<StandardsSubscription> standardsSubscriptions) {
        setStandardsSubscriptions(standardsSubscriptions);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     *
     * @return <p>
     *         The pagination token to use to request the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The pagination token to use to request the next page of
     *            results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The pagination token to use to request the next page of
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetEnabledStandardsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getStandardsSubscriptions() != null)
            sb.append("StandardsSubscriptions: " + getStandardsSubscriptions() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getStandardsSubscriptions() == null) ? 0 : getStandardsSubscriptions()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEnabledStandardsResult == false)
            return false;
        GetEnabledStandardsResult other = (GetEnabledStandardsResult) obj;

        if (other.getStandardsSubscriptions() == null ^ this.getStandardsSubscriptions() == null)
            return false;
        if (other.getStandardsSubscriptions() != null
                && other.getStandardsSubscriptions().equals(this.getStandardsSubscriptions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
