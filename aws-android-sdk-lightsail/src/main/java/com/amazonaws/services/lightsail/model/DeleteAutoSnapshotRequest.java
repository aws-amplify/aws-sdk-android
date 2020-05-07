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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes an automatic snapshot of an instance or disk. For more information,
 * see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class DeleteAutoSnapshotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the source instance or disk from which to delete the
     * automatic snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String resourceName;

    /**
     * <p>
     * The date of the automatic snapshot to delete in <code>YYYY-MM-DD</code>
     * format. Use the <code>get auto snapshots</code> operation to get the
     * available automatic snapshots for a resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{4}-[0-9]{2}-[0-9]{2}$<br/>
     */
    private String dateValue;

    /**
     * <p>
     * The name of the source instance or disk from which to delete the
     * automatic snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the source instance or disk from which to delete the
     *         automatic snapshot.
     *         </p>
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * <p>
     * The name of the source instance or disk from which to delete the
     * automatic snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param resourceName <p>
     *            The name of the source instance or disk from which to delete
     *            the automatic snapshot.
     *            </p>
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the source instance or disk from which to delete the
     * automatic snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param resourceName <p>
     *            The name of the source instance or disk from which to delete
     *            the automatic snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAutoSnapshotRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * <p>
     * The date of the automatic snapshot to delete in <code>YYYY-MM-DD</code>
     * format. Use the <code>get auto snapshots</code> operation to get the
     * available automatic snapshots for a resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{4}-[0-9]{2}-[0-9]{2}$<br/>
     *
     * @return <p>
     *         The date of the automatic snapshot to delete in
     *         <code>YYYY-MM-DD</code> format. Use the
     *         <code>get auto snapshots</code> operation to get the available
     *         automatic snapshots for a resource.
     *         </p>
     */
    public String getDate() {
        return dateValue;
    }

    /**
     * <p>
     * The date of the automatic snapshot to delete in <code>YYYY-MM-DD</code>
     * format. Use the <code>get auto snapshots</code> operation to get the
     * available automatic snapshots for a resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{4}-[0-9]{2}-[0-9]{2}$<br/>
     *
     * @param dateValue <p>
     *            The date of the automatic snapshot to delete in
     *            <code>YYYY-MM-DD</code> format. Use the
     *            <code>get auto snapshots</code> operation to get the available
     *            automatic snapshots for a resource.
     *            </p>
     */
    public void setDate(String dateValue) {
        this.dateValue = dateValue;
    }

    /**
     * <p>
     * The date of the automatic snapshot to delete in <code>YYYY-MM-DD</code>
     * format. Use the <code>get auto snapshots</code> operation to get the
     * available automatic snapshots for a resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{4}-[0-9]{2}-[0-9]{2}$<br/>
     *
     * @param dateValue <p>
     *            The date of the automatic snapshot to delete in
     *            <code>YYYY-MM-DD</code> format. Use the
     *            <code>get auto snapshots</code> operation to get the available
     *            automatic snapshots for a resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAutoSnapshotRequest withDate(String dateValue) {
        this.dateValue = dateValue;
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
        if (getResourceName() != null)
            sb.append("resourceName: " + getResourceName() + ",");
        if (getDate() != null)
            sb.append("date: " + getDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAutoSnapshotRequest == false)
            return false;
        DeleteAutoSnapshotRequest other = (DeleteAutoSnapshotRequest) obj;

        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null
                && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        return true;
    }
}
