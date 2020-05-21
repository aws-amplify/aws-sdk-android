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

/**
 * <p>
 * Information about the deleted object.
 * </p>
 */
public class DeletedObject implements Serializable {
    /**
     * <p>
     * The name of the deleted object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String key;

    /**
     * <p>
     * The version ID of the deleted object.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * Specifies whether the versioned object that was permanently deleted was
     * (true) or was not (false) a delete marker. In a simple DELETE, this
     * header indicates whether (true) or not (false) a delete marker was
     * created.
     * </p>
     */
    private Boolean deleteMarker;

    /**
     * <p>
     * The version ID of the delete marker created as a result of the DELETE
     * operation. If you delete a specific object version, the value returned by
     * this header is the version ID of the object version deleted.
     * </p>
     */
    private String deleteMarkerVersionId;

    /**
     * <p>
     * The name of the deleted object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The name of the deleted object.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The name of the deleted object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            The name of the deleted object.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the deleted object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            The name of the deleted object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeletedObject withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The version ID of the deleted object.
     * </p>
     *
     * @return <p>
     *         The version ID of the deleted object.
     *         </p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>
     * The version ID of the deleted object.
     * </p>
     *
     * @param versionId <p>
     *            The version ID of the deleted object.
     *            </p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The version ID of the deleted object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionId <p>
     *            The version ID of the deleted object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeletedObject withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * <p>
     * Specifies whether the versioned object that was permanently deleted was
     * (true) or was not (false) a delete marker. In a simple DELETE, this
     * header indicates whether (true) or not (false) a delete marker was
     * created.
     * </p>
     *
     * @return <p>
     *         Specifies whether the versioned object that was permanently
     *         deleted was (true) or was not (false) a delete marker. In a
     *         simple DELETE, this header indicates whether (true) or not
     *         (false) a delete marker was created.
     *         </p>
     */
    public Boolean isDeleteMarker() {
        return deleteMarker;
    }

    /**
     * <p>
     * Specifies whether the versioned object that was permanently deleted was
     * (true) or was not (false) a delete marker. In a simple DELETE, this
     * header indicates whether (true) or not (false) a delete marker was
     * created.
     * </p>
     *
     * @return <p>
     *         Specifies whether the versioned object that was permanently
     *         deleted was (true) or was not (false) a delete marker. In a
     *         simple DELETE, this header indicates whether (true) or not
     *         (false) a delete marker was created.
     *         </p>
     */
    public Boolean getDeleteMarker() {
        return deleteMarker;
    }

    /**
     * <p>
     * Specifies whether the versioned object that was permanently deleted was
     * (true) or was not (false) a delete marker. In a simple DELETE, this
     * header indicates whether (true) or not (false) a delete marker was
     * created.
     * </p>
     *
     * @param deleteMarker <p>
     *            Specifies whether the versioned object that was permanently
     *            deleted was (true) or was not (false) a delete marker. In a
     *            simple DELETE, this header indicates whether (true) or not
     *            (false) a delete marker was created.
     *            </p>
     */
    public void setDeleteMarker(Boolean deleteMarker) {
        this.deleteMarker = deleteMarker;
    }

    /**
     * <p>
     * Specifies whether the versioned object that was permanently deleted was
     * (true) or was not (false) a delete marker. In a simple DELETE, this
     * header indicates whether (true) or not (false) a delete marker was
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteMarker <p>
     *            Specifies whether the versioned object that was permanently
     *            deleted was (true) or was not (false) a delete marker. In a
     *            simple DELETE, this header indicates whether (true) or not
     *            (false) a delete marker was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeletedObject withDeleteMarker(Boolean deleteMarker) {
        this.deleteMarker = deleteMarker;
        return this;
    }

    /**
     * <p>
     * The version ID of the delete marker created as a result of the DELETE
     * operation. If you delete a specific object version, the value returned by
     * this header is the version ID of the object version deleted.
     * </p>
     *
     * @return <p>
     *         The version ID of the delete marker created as a result of the
     *         DELETE operation. If you delete a specific object version, the
     *         value returned by this header is the version ID of the object
     *         version deleted.
     *         </p>
     */
    public String getDeleteMarkerVersionId() {
        return deleteMarkerVersionId;
    }

    /**
     * <p>
     * The version ID of the delete marker created as a result of the DELETE
     * operation. If you delete a specific object version, the value returned by
     * this header is the version ID of the object version deleted.
     * </p>
     *
     * @param deleteMarkerVersionId <p>
     *            The version ID of the delete marker created as a result of the
     *            DELETE operation. If you delete a specific object version, the
     *            value returned by this header is the version ID of the object
     *            version deleted.
     *            </p>
     */
    public void setDeleteMarkerVersionId(String deleteMarkerVersionId) {
        this.deleteMarkerVersionId = deleteMarkerVersionId;
    }

    /**
     * <p>
     * The version ID of the delete marker created as a result of the DELETE
     * operation. If you delete a specific object version, the value returned by
     * this header is the version ID of the object version deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteMarkerVersionId <p>
     *            The version ID of the delete marker created as a result of the
     *            DELETE operation. If you delete a specific object version, the
     *            value returned by this header is the version ID of the object
     *            version deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeletedObject withDeleteMarkerVersionId(String deleteMarkerVersionId) {
        this.deleteMarkerVersionId = deleteMarkerVersionId;
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getVersionId() != null)
            sb.append("VersionId: " + getVersionId() + ",");
        if (getDeleteMarker() != null)
            sb.append("DeleteMarker: " + getDeleteMarker() + ",");
        if (getDeleteMarkerVersionId() != null)
            sb.append("DeleteMarkerVersionId: " + getDeleteMarkerVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getDeleteMarker() == null) ? 0 : getDeleteMarker().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeleteMarkerVersionId() == null) ? 0 : getDeleteMarkerVersionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletedObject == false)
            return false;
        DeletedObject other = (DeletedObject) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getDeleteMarker() == null ^ this.getDeleteMarker() == null)
            return false;
        if (other.getDeleteMarker() != null
                && other.getDeleteMarker().equals(this.getDeleteMarker()) == false)
            return false;
        if (other.getDeleteMarkerVersionId() == null ^ this.getDeleteMarkerVersionId() == null)
            return false;
        if (other.getDeleteMarkerVersionId() != null
                && other.getDeleteMarkerVersionId().equals(this.getDeleteMarkerVersionId()) == false)
            return false;
        return true;
    }
}
