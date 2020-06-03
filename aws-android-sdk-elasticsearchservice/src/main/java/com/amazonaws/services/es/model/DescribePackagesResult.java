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

package com.amazonaws.services.es.model;

import java.io.Serializable;

/**
 * <p>
 * Container for response returned by <code> <a>DescribePackages</a> </code>
 * operation.
 * </p>
 */
public class DescribePackagesResult implements Serializable {
    /**
     * <p>
     * List of <code>PackageDetails</code> objects.
     * </p>
     */
    private java.util.List<PackageDetails> packageDetailsList;

    /**
     * The new value for the nextToken property for this object.
     */
    private String nextToken;

    /**
     * <p>
     * List of <code>PackageDetails</code> objects.
     * </p>
     *
     * @return <p>
     *         List of <code>PackageDetails</code> objects.
     *         </p>
     */
    public java.util.List<PackageDetails> getPackageDetailsList() {
        return packageDetailsList;
    }

    /**
     * <p>
     * List of <code>PackageDetails</code> objects.
     * </p>
     *
     * @param packageDetailsList <p>
     *            List of <code>PackageDetails</code> objects.
     *            </p>
     */
    public void setPackageDetailsList(java.util.Collection<PackageDetails> packageDetailsList) {
        if (packageDetailsList == null) {
            this.packageDetailsList = null;
            return;
        }

        this.packageDetailsList = new java.util.ArrayList<PackageDetails>(packageDetailsList);
    }

    /**
     * <p>
     * List of <code>PackageDetails</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param packageDetailsList <p>
     *            List of <code>PackageDetails</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagesResult withPackageDetailsList(PackageDetails... packageDetailsList) {
        if (getPackageDetailsList() == null) {
            this.packageDetailsList = new java.util.ArrayList<PackageDetails>(
                    packageDetailsList.length);
        }
        for (PackageDetails value : packageDetailsList) {
            this.packageDetailsList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of <code>PackageDetails</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param packageDetailsList <p>
     *            List of <code>PackageDetails</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagesResult withPackageDetailsList(
            java.util.Collection<PackageDetails> packageDetailsList) {
        setPackageDetailsList(packageDetailsList);
        return this;
    }

    /**
     * Returns the value of the nextToken property for this object.
     *
     * @return The value of the nextToken property for this object.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Sets the value of nextToken
     *
     * @param nextToken The new value for the nextToken property for this
     *            object.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Sets the value of the nextToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken The new value for the nextToken property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagesResult withNextToken(String nextToken) {
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
        if (getPackageDetailsList() != null)
            sb.append("PackageDetailsList: " + getPackageDetailsList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPackageDetailsList() == null) ? 0 : getPackageDetailsList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePackagesResult == false)
            return false;
        DescribePackagesResult other = (DescribePackagesResult) obj;

        if (other.getPackageDetailsList() == null ^ this.getPackageDetailsList() == null)
            return false;
        if (other.getPackageDetailsList() != null
                && other.getPackageDetailsList().equals(this.getPackageDetailsList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
