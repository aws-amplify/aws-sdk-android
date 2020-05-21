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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class CreateBucketResult implements Serializable {
    /**
     * <p>
     * Specifies the Region where the bucket will be created. If you are
     * creating a bucket on the US East (N. Virginia) Region (us-east-1), you do
     * not need to specify the location.
     * </p>
     */
    private String location;

    /**
     * <p>
     * Specifies the Region where the bucket will be created. If you are
     * creating a bucket on the US East (N. Virginia) Region (us-east-1), you do
     * not need to specify the location.
     * </p>
     *
     * @return <p>
     *         Specifies the Region where the bucket will be created. If you are
     *         creating a bucket on the US East (N. Virginia) Region
     *         (us-east-1), you do not need to specify the location.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * Specifies the Region where the bucket will be created. If you are
     * creating a bucket on the US East (N. Virginia) Region (us-east-1), you do
     * not need to specify the location.
     * </p>
     *
     * @param location <p>
     *            Specifies the Region where the bucket will be created. If you
     *            are creating a bucket on the US East (N. Virginia) Region
     *            (us-east-1), you do not need to specify the location.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * Specifies the Region where the bucket will be created. If you are
     * creating a bucket on the US East (N. Virginia) Region (us-east-1), you do
     * not need to specify the location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            Specifies the Region where the bucket will be created. If you
     *            are creating a bucket on the US East (N. Virginia) Region
     *            (us-east-1), you do not need to specify the location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBucketResult withLocation(String location) {
        this.location = location;
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
        if (getLocation() != null)
            sb.append("Location: " + getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBucketResult == false)
            return false;
        CreateBucketResult other = (CreateBucketResult) obj;

        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }
}
