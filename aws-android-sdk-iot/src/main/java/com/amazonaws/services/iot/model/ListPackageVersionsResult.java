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

public class ListPackageVersionsResult implements Serializable {
    /**
     * <p>
     * Lists the package versions associated to the package.
     * </p>
     */
    private java.util.List<PackageVersionSummary> packageVersionSummaries;

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists the package versions associated to the package.
     * </p>
     *
     * @return <p>
     *         Lists the package versions associated to the package.
     *         </p>
     */
    public java.util.List<PackageVersionSummary> getPackageVersionSummaries() {
        return packageVersionSummaries;
    }

    /**
     * <p>
     * Lists the package versions associated to the package.
     * </p>
     *
     * @param packageVersionSummaries <p>
     *            Lists the package versions associated to the package.
     *            </p>
     */
    public void setPackageVersionSummaries(
            java.util.Collection<PackageVersionSummary> packageVersionSummaries) {
        if (packageVersionSummaries == null) {
            this.packageVersionSummaries = null;
            return;
        }

        this.packageVersionSummaries = new java.util.ArrayList<PackageVersionSummary>(
                packageVersionSummaries);
    }

    /**
     * <p>
     * Lists the package versions associated to the package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param packageVersionSummaries <p>
     *            Lists the package versions associated to the package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPackageVersionsResult withPackageVersionSummaries(
            PackageVersionSummary... packageVersionSummaries) {
        if (getPackageVersionSummaries() == null) {
            this.packageVersionSummaries = new java.util.ArrayList<PackageVersionSummary>(
                    packageVersionSummaries.length);
        }
        for (PackageVersionSummary value : packageVersionSummaries) {
            this.packageVersionSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Lists the package versions associated to the package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param packageVersionSummaries <p>
     *            Lists the package versions associated to the package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPackageVersionsResult withPackageVersionSummaries(
            java.util.Collection<PackageVersionSummary> packageVersionSummaries) {
        setPackageVersionSummaries(packageVersionSummaries);
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
    public ListPackageVersionsResult withNextToken(String nextToken) {
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
        if (getPackageVersionSummaries() != null)
            sb.append("packageVersionSummaries: " + getPackageVersionSummaries() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPackageVersionSummaries() == null) ? 0 : getPackageVersionSummaries()
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

        if (obj instanceof ListPackageVersionsResult == false)
            return false;
        ListPackageVersionsResult other = (ListPackageVersionsResult) obj;

        if (other.getPackageVersionSummaries() == null ^ this.getPackageVersionSummaries() == null)
            return false;
        if (other.getPackageVersionSummaries() != null
                && other.getPackageVersionSummaries().equals(this.getPackageVersionSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
