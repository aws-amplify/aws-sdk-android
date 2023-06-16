/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Contains metadata like FaceId, UserID, and Reasons, for a face that was
 * unsuccessfully deleted.
 * </p>
 */
public class UnsuccessfulFaceDeletion implements Serializable {
    /**
     * <p>
     * A unique identifier assigned to the face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     */
    private String faceId;

    /**
     * <p>
     * A provided ID for the UserID. Unique within the collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     */
    private String userId;

    /**
     * <p>
     * The reason why the deletion was unsuccessful.
     * </p>
     */
    private java.util.List<String> reasons;

    /**
     * <p>
     * A unique identifier assigned to the face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         A unique identifier assigned to the face.
     *         </p>
     */
    public String getFaceId() {
        return faceId;
    }

    /**
     * <p>
     * A unique identifier assigned to the face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param faceId <p>
     *            A unique identifier assigned to the face.
     *            </p>
     */
    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    /**
     * <p>
     * A unique identifier assigned to the face.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param faceId <p>
     *            A unique identifier assigned to the face.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnsuccessfulFaceDeletion withFaceId(String faceId) {
        this.faceId = faceId;
        return this;
    }

    /**
     * <p>
     * A provided ID for the UserID. Unique within the collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @return <p>
     *         A provided ID for the UserID. Unique within the collection.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * A provided ID for the UserID. Unique within the collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param userId <p>
     *            A provided ID for the UserID. Unique within the collection.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * A provided ID for the UserID. Unique within the collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param userId <p>
     *            A provided ID for the UserID. Unique within the collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnsuccessfulFaceDeletion withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * The reason why the deletion was unsuccessful.
     * </p>
     *
     * @return <p>
     *         The reason why the deletion was unsuccessful.
     *         </p>
     */
    public java.util.List<String> getReasons() {
        return reasons;
    }

    /**
     * <p>
     * The reason why the deletion was unsuccessful.
     * </p>
     *
     * @param reasons <p>
     *            The reason why the deletion was unsuccessful.
     *            </p>
     */
    public void setReasons(java.util.Collection<String> reasons) {
        if (reasons == null) {
            this.reasons = null;
            return;
        }

        this.reasons = new java.util.ArrayList<String>(reasons);
    }

    /**
     * <p>
     * The reason why the deletion was unsuccessful.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reasons <p>
     *            The reason why the deletion was unsuccessful.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnsuccessfulFaceDeletion withReasons(String... reasons) {
        if (getReasons() == null) {
            this.reasons = new java.util.ArrayList<String>(reasons.length);
        }
        for (String value : reasons) {
            this.reasons.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The reason why the deletion was unsuccessful.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reasons <p>
     *            The reason why the deletion was unsuccessful.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnsuccessfulFaceDeletion withReasons(java.util.Collection<String> reasons) {
        setReasons(reasons);
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
        if (getFaceId() != null)
            sb.append("FaceId: " + getFaceId() + ",");
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
        if (getReasons() != null)
            sb.append("Reasons: " + getReasons());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFaceId() == null) ? 0 : getFaceId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getReasons() == null) ? 0 : getReasons().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnsuccessfulFaceDeletion == false)
            return false;
        UnsuccessfulFaceDeletion other = (UnsuccessfulFaceDeletion) obj;

        if (other.getFaceId() == null ^ this.getFaceId() == null)
            return false;
        if (other.getFaceId() != null && other.getFaceId().equals(this.getFaceId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getReasons() == null ^ this.getReasons() == null)
            return false;
        if (other.getReasons() != null && other.getReasons().equals(this.getReasons()) == false)
            return false;
        return true;
    }
}
