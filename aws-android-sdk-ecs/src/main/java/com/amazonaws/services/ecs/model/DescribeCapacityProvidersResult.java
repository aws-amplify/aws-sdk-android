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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

public class DescribeCapacityProvidersResult implements Serializable {
    /**
     * <p>
     * The list of capacity providers.
     * </p>
     */
    private java.util.List<CapacityProvider> capacityProviders;

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     */
    private java.util.List<Failure> failures;

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>DescribeCapacityProviders</code> request. When the results of a
     * <code>DescribeCapacityProviders</code> request exceed
     * <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of capacity providers.
     * </p>
     *
     * @return <p>
     *         The list of capacity providers.
     *         </p>
     */
    public java.util.List<CapacityProvider> getCapacityProviders() {
        return capacityProviders;
    }

    /**
     * <p>
     * The list of capacity providers.
     * </p>
     *
     * @param capacityProviders <p>
     *            The list of capacity providers.
     *            </p>
     */
    public void setCapacityProviders(java.util.Collection<CapacityProvider> capacityProviders) {
        if (capacityProviders == null) {
            this.capacityProviders = null;
            return;
        }

        this.capacityProviders = new java.util.ArrayList<CapacityProvider>(capacityProviders);
    }

    /**
     * <p>
     * The list of capacity providers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviders <p>
     *            The list of capacity providers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCapacityProvidersResult withCapacityProviders(
            CapacityProvider... capacityProviders) {
        if (getCapacityProviders() == null) {
            this.capacityProviders = new java.util.ArrayList<CapacityProvider>(
                    capacityProviders.length);
        }
        for (CapacityProvider value : capacityProviders) {
            this.capacityProviders.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of capacity providers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviders <p>
     *            The list of capacity providers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCapacityProvidersResult withCapacityProviders(
            java.util.Collection<CapacityProvider> capacityProviders) {
        setCapacityProviders(capacityProviders);
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     *
     * @return <p>
     *         Any failures associated with the call.
     *         </p>
     */
    public java.util.List<Failure> getFailures() {
        return failures;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     *
     * @param failures <p>
     *            Any failures associated with the call.
     *            </p>
     */
    public void setFailures(java.util.Collection<Failure> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new java.util.ArrayList<Failure>(failures);
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failures <p>
     *            Any failures associated with the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCapacityProvidersResult withFailures(Failure... failures) {
        if (getFailures() == null) {
            this.failures = new java.util.ArrayList<Failure>(failures.length);
        }
        for (Failure value : failures) {
            this.failures.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failures <p>
     *            Any failures associated with the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCapacityProvidersResult withFailures(java.util.Collection<Failure> failures) {
        setFailures(failures);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>DescribeCapacityProviders</code> request. When the results of a
     * <code>DescribeCapacityProviders</code> request exceed
     * <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     *
     * @return <p>
     *         The <code>nextToken</code> value to include in a future
     *         <code>DescribeCapacityProviders</code> request. When the results
     *         of a <code>DescribeCapacityProviders</code> request exceed
     *         <code>maxResults</code>, this value can be used to retrieve the
     *         next page of results. This value is <code>null</code> when there
     *         are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>DescribeCapacityProviders</code> request. When the results of a
     * <code>DescribeCapacityProviders</code> request exceed
     * <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>DescribeCapacityProviders</code> request. When the
     *            results of a <code>DescribeCapacityProviders</code> request
     *            exceed <code>maxResults</code>, this value can be used to
     *            retrieve the next page of results. This value is
     *            <code>null</code> when there are no more results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>DescribeCapacityProviders</code> request. When the results of a
     * <code>DescribeCapacityProviders</code> request exceed
     * <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>DescribeCapacityProviders</code> request. When the
     *            results of a <code>DescribeCapacityProviders</code> request
     *            exceed <code>maxResults</code>, this value can be used to
     *            retrieve the next page of results. This value is
     *            <code>null</code> when there are no more results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCapacityProvidersResult withNextToken(String nextToken) {
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
        if (getCapacityProviders() != null)
            sb.append("capacityProviders: " + getCapacityProviders() + ",");
        if (getFailures() != null)
            sb.append("failures: " + getFailures() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCapacityProviders() == null) ? 0 : getCapacityProviders().hashCode());
        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCapacityProvidersResult == false)
            return false;
        DescribeCapacityProvidersResult other = (DescribeCapacityProvidersResult) obj;

        if (other.getCapacityProviders() == null ^ this.getCapacityProviders() == null)
            return false;
        if (other.getCapacityProviders() != null
                && other.getCapacityProviders().equals(this.getCapacityProviders()) == false)
            return false;
        if (other.getFailures() == null ^ this.getFailures() == null)
            return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
