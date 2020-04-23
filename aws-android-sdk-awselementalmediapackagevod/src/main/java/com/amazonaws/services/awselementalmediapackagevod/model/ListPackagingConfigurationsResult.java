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

package com.amazonaws.services.awselementalmediapackagevod.model;

import java.io.Serializable;

public class ListPackagingConfigurationsResult implements Serializable {
    /**
     * A token that can be used to resume pagination from the end of the
     * collection.
     */
    private String nextToken;

    /**
     * A list of MediaPackage VOD PackagingConfiguration resources.
     */
    private java.util.List<PackagingConfiguration> packagingConfigurations;

    /**
     * A token that can be used to resume pagination from the end of the
     * collection.
     *
     * @return A token that can be used to resume pagination from the end of the
     *         collection.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * A token that can be used to resume pagination from the end of the
     * collection.
     *
     * @param nextToken A token that can be used to resume pagination from the
     *            end of the collection.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token that can be used to resume pagination from the end of the
     * collection.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken A token that can be used to resume pagination from the
     *            end of the collection.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPackagingConfigurationsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * A list of MediaPackage VOD PackagingConfiguration resources.
     *
     * @return A list of MediaPackage VOD PackagingConfiguration resources.
     */
    public java.util.List<PackagingConfiguration> getPackagingConfigurations() {
        return packagingConfigurations;
    }

    /**
     * A list of MediaPackage VOD PackagingConfiguration resources.
     *
     * @param packagingConfigurations A list of MediaPackage VOD
     *            PackagingConfiguration resources.
     */
    public void setPackagingConfigurations(
            java.util.Collection<PackagingConfiguration> packagingConfigurations) {
        if (packagingConfigurations == null) {
            this.packagingConfigurations = null;
            return;
        }

        this.packagingConfigurations = new java.util.ArrayList<PackagingConfiguration>(
                packagingConfigurations);
    }

    /**
     * A list of MediaPackage VOD PackagingConfiguration resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param packagingConfigurations A list of MediaPackage VOD
     *            PackagingConfiguration resources.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPackagingConfigurationsResult withPackagingConfigurations(
            PackagingConfiguration... packagingConfigurations) {
        if (getPackagingConfigurations() == null) {
            this.packagingConfigurations = new java.util.ArrayList<PackagingConfiguration>(
                    packagingConfigurations.length);
        }
        for (PackagingConfiguration value : packagingConfigurations) {
            this.packagingConfigurations.add(value);
        }
        return this;
    }

    /**
     * A list of MediaPackage VOD PackagingConfiguration resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param packagingConfigurations A list of MediaPackage VOD
     *            PackagingConfiguration resources.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPackagingConfigurationsResult withPackagingConfigurations(
            java.util.Collection<PackagingConfiguration> packagingConfigurations) {
        setPackagingConfigurations(packagingConfigurations);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getPackagingConfigurations() != null)
            sb.append("PackagingConfigurations: " + getPackagingConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getPackagingConfigurations() == null) ? 0 : getPackagingConfigurations()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPackagingConfigurationsResult == false)
            return false;
        ListPackagingConfigurationsResult other = (ListPackagingConfigurationsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPackagingConfigurations() == null ^ this.getPackagingConfigurations() == null)
            return false;
        if (other.getPackagingConfigurations() != null
                && other.getPackagingConfigurations().equals(this.getPackagingConfigurations()) == false)
            return false;
        return true;
    }
}
