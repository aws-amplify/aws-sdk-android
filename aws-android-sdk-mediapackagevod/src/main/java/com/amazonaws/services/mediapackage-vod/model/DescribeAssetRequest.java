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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Returns a description of a MediaPackage VOD Asset resource.
 */
public class DescribeAssetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The ID of an MediaPackage VOD Asset resource.
     */
    private String id;

    /**
     * The ID of an MediaPackage VOD Asset resource.
     *
     * @return The ID of an MediaPackage VOD Asset resource.
     */
    public String getId() {
        return id;
    }

    /**
     * The ID of an MediaPackage VOD Asset resource.
     *
     * @param id The ID of an MediaPackage VOD Asset resource.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The ID of an MediaPackage VOD Asset resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The ID of an MediaPackage VOD Asset resource.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeAssetRequest withId(String id) {
        this.id = id;
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
        if (getId() != null) sb.append("Id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAssetRequest == false) return false;
        DescribeAssetRequest other = (DescribeAssetRequest)obj;

        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false;
        return true;
    }
}
