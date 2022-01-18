/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves the geofence collection details.
 * </p>
 */
public class DescribeGeofenceCollectionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the geofence collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String collectionName;

    /**
     * <p>
     * The name of the geofence collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The name of the geofence collection.
     *         </p>
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * <p>
     * The name of the geofence collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param collectionName <p>
     *            The name of the geofence collection.
     *            </p>
     */
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * The name of the geofence collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param collectionName <p>
     *            The name of the geofence collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGeofenceCollectionRequest withCollectionName(String collectionName) {
        this.collectionName = collectionName;
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
        if (getCollectionName() != null)
            sb.append("CollectionName: " + getCollectionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGeofenceCollectionRequest == false)
            return false;
        DescribeGeofenceCollectionRequest other = (DescribeGeofenceCollectionRequest) obj;

        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null
                && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
        return true;
    }
}
