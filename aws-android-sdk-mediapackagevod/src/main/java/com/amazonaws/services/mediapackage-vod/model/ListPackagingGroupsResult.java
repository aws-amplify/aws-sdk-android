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
package com.amazonaws.services.mediapackage-vod.model;

import java.io.Serializable;


public class ListPackagingGroupsResult implements Serializable {
    /**
     * A token that can be used to resume pagination from the end of the collection.
     */
    private String nextToken;

    /**
     * A list of MediaPackage VOD PackagingGroup resources.
     */
    private java.util.List<PackagingGroup> packagingGroups;

    /**
     * A token that can be used to resume pagination from the end of the collection.
     *
     * @return A token that can be used to resume pagination from the end of the collection.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * A token that can be used to resume pagination from the end of the collection.
     *
     * @param nextToken A token that can be used to resume pagination from the end of the collection.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token that can be used to resume pagination from the end of the collection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A token that can be used to resume pagination from the end of the collection.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListPackagingGroupsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * A list of MediaPackage VOD PackagingGroup resources.
     *
     * @return A list of MediaPackage VOD PackagingGroup resources.
     */
    public java.util.List<PackagingGroup> getPackagingGroups() {
        return packagingGroups;
    }

    /**
     * A list of MediaPackage VOD PackagingGroup resources.
     *
     * @param packagingGroups A list of MediaPackage VOD PackagingGroup resources.
     */
    public void setPackagingGroups(java.util.Collection<PackagingGroup> packagingGroups) {
        if (packagingGroups == null) {
            this.packagingGroups = null;
            return;
        }

        this.packagingGroups = new java.util.ArrayList<PackagingGroup>(packagingGroups);
    }

    /**
     * A list of MediaPackage VOD PackagingGroup resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param packagingGroups A list of MediaPackage VOD PackagingGroup resources.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListPackagingGroupsResult withPackagingGroups(PackagingGroup... packagingGroups) {
        if (getPackagingGroups() == null) {
            this.packagingGroups = new java.util.ArrayList<PackagingGroup>(packagingGroups.length);
        }
        for (PackagingGroup value : packagingGroups) {
            this.packagingGroups.add(value);
        }
        return this;
    }

    /**
     * A list of MediaPackage VOD PackagingGroup resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param packagingGroups A list of MediaPackage VOD PackagingGroup resources.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListPackagingGroupsResult withPackagingGroups(java.util.Collection<PackagingGroup> packagingGroups) {
        setPackagingGroups(packagingGroups);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getPackagingGroups() != null) sb.append("PackagingGroups: " + getPackagingGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPackagingGroups() == null) ? 0 : getPackagingGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListPackagingGroupsResult == false) return false;
        ListPackagingGroupsResult other = (ListPackagingGroupsResult)obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getPackagingGroups() == null ^ this.getPackagingGroups() == null) return false;
        if (other.getPackagingGroups() != null && other.getPackagingGroups().equals(this.getPackagingGroups()) == false) return false;
        return true;
    }
}
