/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListPackagesResult implements Serializable {
    /**
     * <p>
     * The software package summary.
     * </p>
     */
    private java.util.List<PackageSummary> packageSummaries;

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The software package summary.
     * </p>
     *
     * @return <p>
     *         The software package summary.
     *         </p>
     */
    public java.util.List<PackageSummary> getPackageSummaries() {
        return packageSummaries;
    }

    /**
     * <p>
     * The software package summary.
     * </p>
     *
     * @param packageSummaries <p>
     *            The software package summary.
     *            </p>
     */
    public void setPackageSummaries(java.util.Collection<PackageSummary> packageSummaries) {
        if (packageSummaries == null) {
            this.packageSummaries = null;
            return;
        }

        this.packageSummaries = new java.util.ArrayList<PackageSummary>(packageSummaries);
    }

    /**
     * <p>
     * The software package summary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param packageSummaries <p>
     *            The software package summary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPackagesResult withPackageSummaries(PackageSummary... packageSummaries) {
        if (getPackageSummaries() == null) {
            this.packageSummaries = new java.util.ArrayList<PackageSummary>(packageSummaries.length);
        }
        for (PackageSummary value : packageSummaries) {
            this.packageSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The software package summary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param packageSummaries <p>
     *            The software package summary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPackagesResult withPackageSummaries(
            java.util.Collection<PackageSummary> packageSummaries) {
        setPackageSummaries(packageSummaries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPackagesResult withNextToken(String nextToken) {
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
        if (getPackageSummaries() != null)
            sb.append("packageSummaries: " + getPackageSummaries() + ",");
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
                + ((getPackageSummaries() == null) ? 0 : getPackageSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPackagesResult == false)
            return false;
        ListPackagesResult other = (ListPackagesResult) obj;

        if (other.getPackageSummaries() == null ^ this.getPackageSummaries() == null)
            return false;
        if (other.getPackageSummaries() != null
                && other.getPackageSummaries().equals(this.getPackageSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
