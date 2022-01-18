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

public class CreateGeofenceCollectionResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection resource. Used
     * when you need to specify a resource across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example:
     * <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>^arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-
     * 9]+)*)?){2}:([^/].*)?$<br/>
     */
    private String collectionArn;

    /**
     * <p>
     * The name for the geofence collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String collectionName;

    /**
     * <p>
     * The timestamp for when the geofence collection was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection resource. Used
     * when you need to specify a resource across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example:
     * <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>^arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-
     * 9]+)*)?){2}:([^/].*)?$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the geofence collection
     *         resource. Used when you need to specify a resource across all
     *         AWS.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Format example:
     *         <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getCollectionArn() {
        return collectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection resource. Used
     * when you need to specify a resource across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example:
     * <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>^arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-
     * 9]+)*)?){2}:([^/].*)?$<br/>
     *
     * @param collectionArn <p>
     *            The Amazon Resource Name (ARN) for the geofence collection
     *            resource. Used when you need to specify a resource across all
     *            AWS.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Format example:
     *            <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setCollectionArn(String collectionArn) {
        this.collectionArn = collectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection resource. Used
     * when you need to specify a resource across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example:
     * <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>^arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-
     * 9]+)*)?){2}:([^/].*)?$<br/>
     *
     * @param collectionArn <p>
     *            The Amazon Resource Name (ARN) for the geofence collection
     *            resource. Used when you need to specify a resource across all
     *            AWS.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Format example:
     *            <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGeofenceCollectionResult withCollectionArn(String collectionArn) {
        this.collectionArn = collectionArn;
        return this;
    }

    /**
     * <p>
     * The name for the geofence collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The name for the geofence collection.
     *         </p>
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * <p>
     * The name for the geofence collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param collectionName <p>
     *            The name for the geofence collection.
     *            </p>
     */
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * The name for the geofence collection.
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
     *            The name for the geofence collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGeofenceCollectionResult withCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     *
     * @return <p>
     *         The timestamp for when the geofence collection was created in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *         8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     *
     * @param createTime <p>
     *            The timestamp for when the geofence collection was created in
     *            <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The timestamp for when the geofence collection was created in
     *            <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGeofenceCollectionResult withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
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
        if (getCollectionArn() != null)
            sb.append("CollectionArn: " + getCollectionArn() + ",");
        if (getCollectionName() != null)
            sb.append("CollectionName: " + getCollectionName() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCollectionArn() == null) ? 0 : getCollectionArn().hashCode());
        hashCode = prime * hashCode
                + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGeofenceCollectionResult == false)
            return false;
        CreateGeofenceCollectionResult other = (CreateGeofenceCollectionResult) obj;

        if (other.getCollectionArn() == null ^ this.getCollectionArn() == null)
            return false;
        if (other.getCollectionArn() != null
                && other.getCollectionArn().equals(this.getCollectionArn()) == false)
            return false;
        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null
                && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        return true;
    }
}
