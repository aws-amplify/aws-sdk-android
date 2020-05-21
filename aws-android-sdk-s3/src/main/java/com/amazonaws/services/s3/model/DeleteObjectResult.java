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

public class DeleteObjectResult implements Serializable {
    /**
     * <p>
     * Specifies whether the versioned object that was permanently deleted was
     * (true) or was not (false) a delete marker.
     * </p>
     */
    private Boolean deleteMarker;

    /**
     * <p>
     * Returns the version ID of the delete marker created as a result of the
     * DELETE operation.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     */
    private String requestCharged;

    /**
     * <p>
     * Specifies whether the versioned object that was permanently deleted was
     * (true) or was not (false) a delete marker.
     * </p>
     *
     * @return <p>
     *         Specifies whether the versioned object that was permanently
     *         deleted was (true) or was not (false) a delete marker.
     *         </p>
     */
    public Boolean isDeleteMarker() {
        return deleteMarker;
    }

    /**
     * <p>
     * Specifies whether the versioned object that was permanently deleted was
     * (true) or was not (false) a delete marker.
     * </p>
     *
     * @return <p>
     *         Specifies whether the versioned object that was permanently
     *         deleted was (true) or was not (false) a delete marker.
     *         </p>
     */
    public Boolean getDeleteMarker() {
        return deleteMarker;
    }

    /**
     * <p>
     * Specifies whether the versioned object that was permanently deleted was
     * (true) or was not (false) a delete marker.
     * </p>
     *
     * @param deleteMarker <p>
     *            Specifies whether the versioned object that was permanently
     *            deleted was (true) or was not (false) a delete marker.
     *            </p>
     */
    public void setDeleteMarker(Boolean deleteMarker) {
        this.deleteMarker = deleteMarker;
    }

    /**
     * <p>
     * Specifies whether the versioned object that was permanently deleted was
     * (true) or was not (false) a delete marker.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteMarker <p>
     *            Specifies whether the versioned object that was permanently
     *            deleted was (true) or was not (false) a delete marker.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteObjectResult withDeleteMarker(Boolean deleteMarker) {
        this.deleteMarker = deleteMarker;
        return this;
    }

    /**
     * <p>
     * Returns the version ID of the delete marker created as a result of the
     * DELETE operation.
     * </p>
     *
     * @return <p>
     *         Returns the version ID of the delete marker created as a result
     *         of the DELETE operation.
     *         </p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>
     * Returns the version ID of the delete marker created as a result of the
     * DELETE operation.
     * </p>
     *
     * @param versionId <p>
     *            Returns the version ID of the delete marker created as a
     *            result of the DELETE operation.
     *            </p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * Returns the version ID of the delete marker created as a result of the
     * DELETE operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionId <p>
     *            Returns the version ID of the delete marker created as a
     *            result of the DELETE operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteObjectResult withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @return <p>
     *         If present, indicates that the requester was successfully charged
     *         for the request.
     *         </p>
     * @see RequestCharged
     */
    public String getRequestCharged() {
        return requestCharged;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @see RequestCharged
     */
    public void setRequestCharged(String requestCharged) {
        this.requestCharged = requestCharged;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestCharged
     */
    public DeleteObjectResult withRequestCharged(String requestCharged) {
        this.requestCharged = requestCharged;
        return this;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @see RequestCharged
     */
    public void setRequestCharged(RequestCharged requestCharged) {
        this.requestCharged = requestCharged.toString();
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestCharged
     */
    public DeleteObjectResult withRequestCharged(RequestCharged requestCharged) {
        this.requestCharged = requestCharged.toString();
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
        if (getDeleteMarker() != null)
            sb.append("DeleteMarker: " + getDeleteMarker() + ",");
        if (getVersionId() != null)
            sb.append("VersionId: " + getVersionId() + ",");
        if (getRequestCharged() != null)
            sb.append("RequestCharged: " + getRequestCharged());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeleteMarker() == null) ? 0 : getDeleteMarker().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getRequestCharged() == null) ? 0 : getRequestCharged().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteObjectResult == false)
            return false;
        DeleteObjectResult other = (DeleteObjectResult) obj;

        if (other.getDeleteMarker() == null ^ this.getDeleteMarker() == null)
            return false;
        if (other.getDeleteMarker() != null
                && other.getDeleteMarker().equals(this.getDeleteMarker()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getRequestCharged() == null ^ this.getRequestCharged() == null)
            return false;
        if (other.getRequestCharged() != null
                && other.getRequestCharged().equals(this.getRequestCharged()) == false)
            return false;
        return true;
    }
}
