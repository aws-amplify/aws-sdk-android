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
 * A batch request for storing geofence geometries into a given geofence
 * collection, or updates the geometry of an existing geofence if a geofence ID
 * is included in the request.
 * </p>
 */
public class BatchPutGeofenceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The geofence collection storing the geofences.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String collectionName;

    /**
     * <p>
     * The batch of geofences to be stored in a geofence collection.
     * </p>
     */
    private java.util.List<BatchPutGeofenceRequestEntry> entries;

    /**
     * <p>
     * The geofence collection storing the geofences.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The geofence collection storing the geofences.
     *         </p>
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * <p>
     * The geofence collection storing the geofences.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param collectionName <p>
     *            The geofence collection storing the geofences.
     *            </p>
     */
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * The geofence collection storing the geofences.
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
     *            The geofence collection storing the geofences.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutGeofenceRequest withCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    /**
     * <p>
     * The batch of geofences to be stored in a geofence collection.
     * </p>
     *
     * @return <p>
     *         The batch of geofences to be stored in a geofence collection.
     *         </p>
     */
    public java.util.List<BatchPutGeofenceRequestEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * The batch of geofences to be stored in a geofence collection.
     * </p>
     *
     * @param entries <p>
     *            The batch of geofences to be stored in a geofence collection.
     *            </p>
     */
    public void setEntries(java.util.Collection<BatchPutGeofenceRequestEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<BatchPutGeofenceRequestEntry>(entries);
    }

    /**
     * <p>
     * The batch of geofences to be stored in a geofence collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entries <p>
     *            The batch of geofences to be stored in a geofence collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutGeofenceRequest withEntries(BatchPutGeofenceRequestEntry... entries) {
        if (getEntries() == null) {
            this.entries = new java.util.ArrayList<BatchPutGeofenceRequestEntry>(entries.length);
        }
        for (BatchPutGeofenceRequestEntry value : entries) {
            this.entries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The batch of geofences to be stored in a geofence collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entries <p>
     *            The batch of geofences to be stored in a geofence collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutGeofenceRequest withEntries(
            java.util.Collection<BatchPutGeofenceRequestEntry> entries) {
        setEntries(entries);
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
            sb.append("CollectionName: " + getCollectionName() + ",");
        if (getEntries() != null)
            sb.append("Entries: " + getEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutGeofenceRequest == false)
            return false;
        BatchPutGeofenceRequest other = (BatchPutGeofenceRequest) obj;

        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null
                && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        return true;
    }
}
