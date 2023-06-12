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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Searches for UserIDs within a collection based on a <code>FaceId</code> or
 * <code>UserId</code>. This API can be used to find the closest UserID (with a
 * highest similarity) to associate a face. The request must be provided with
 * either <code>FaceId</code> or <code>UserId</code>. The operation returns an
 * array of UserID that match the <code>FaceId</code> or <code>UserId</code>,
 * ordered by similarity score with the highest similarity first.
 * </p>
 */
public class SearchUsersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of an existing collection containing the UserID, used with a
     * UserId or FaceId. If a FaceId is provided, UserId isn’t required to be
     * present in the Collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     */
    private String collectionId;

    /**
     * <p>
     * ID for the existing User.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     */
    private String userId;

    /**
     * <p>
     * ID for the existing face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     */
    private String faceId;

    /**
     * <p>
     * Optional value that specifies the minimum confidence in the matched
     * UserID to return. Default value of 80.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     */
    private Float userMatchThreshold;

    /**
     * <p>
     * Maximum number of identities to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     */
    private Integer maxUsers;

    /**
     * <p>
     * The ID of an existing collection containing the UserID, used with a
     * UserId or FaceId. If a FaceId is provided, UserId isn’t required to be
     * present in the Collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @return <p>
     *         The ID of an existing collection containing the UserID, used with
     *         a UserId or FaceId. If a FaceId is provided, UserId isn’t
     *         required to be present in the Collection.
     *         </p>
     */
    public String getCollectionId() {
        return collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection containing the UserID, used with a
     * UserId or FaceId. If a FaceId is provided, UserId isn’t required to be
     * present in the Collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param collectionId <p>
     *            The ID of an existing collection containing the UserID, used
     *            with a UserId or FaceId. If a FaceId is provided, UserId isn’t
     *            required to be present in the Collection.
     *            </p>
     */
    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection containing the UserID, used with a
     * UserId or FaceId. If a FaceId is provided, UserId isn’t required to be
     * present in the Collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param collectionId <p>
     *            The ID of an existing collection containing the UserID, used
     *            with a UserId or FaceId. If a FaceId is provided, UserId isn’t
     *            required to be present in the Collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersRequest withCollectionId(String collectionId) {
        this.collectionId = collectionId;
        return this;
    }

    /**
     * <p>
     * ID for the existing User.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @return <p>
     *         ID for the existing User.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * ID for the existing User.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param userId <p>
     *            ID for the existing User.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * ID for the existing User.
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
     *            ID for the existing User.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * ID for the existing face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         ID for the existing face.
     *         </p>
     */
    public String getFaceId() {
        return faceId;
    }

    /**
     * <p>
     * ID for the existing face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param faceId <p>
     *            ID for the existing face.
     *            </p>
     */
    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    /**
     * <p>
     * ID for the existing face.
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
     *            ID for the existing face.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersRequest withFaceId(String faceId) {
        this.faceId = faceId;
        return this;
    }

    /**
     * <p>
     * Optional value that specifies the minimum confidence in the matched
     * UserID to return. Default value of 80.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @return <p>
     *         Optional value that specifies the minimum confidence in the
     *         matched UserID to return. Default value of 80.
     *         </p>
     */
    public Float getUserMatchThreshold() {
        return userMatchThreshold;
    }

    /**
     * <p>
     * Optional value that specifies the minimum confidence in the matched
     * UserID to return. Default value of 80.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param userMatchThreshold <p>
     *            Optional value that specifies the minimum confidence in the
     *            matched UserID to return. Default value of 80.
     *            </p>
     */
    public void setUserMatchThreshold(Float userMatchThreshold) {
        this.userMatchThreshold = userMatchThreshold;
    }

    /**
     * <p>
     * Optional value that specifies the minimum confidence in the matched
     * UserID to return. Default value of 80.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param userMatchThreshold <p>
     *            Optional value that specifies the minimum confidence in the
     *            matched UserID to return. Default value of 80.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersRequest withUserMatchThreshold(Float userMatchThreshold) {
        this.userMatchThreshold = userMatchThreshold;
        return this;
    }

    /**
     * <p>
     * Maximum number of identities to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @return <p>
     *         Maximum number of identities to return.
     *         </p>
     */
    public Integer getMaxUsers() {
        return maxUsers;
    }

    /**
     * <p>
     * Maximum number of identities to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxUsers <p>
     *            Maximum number of identities to return.
     *            </p>
     */
    public void setMaxUsers(Integer maxUsers) {
        this.maxUsers = maxUsers;
    }

    /**
     * <p>
     * Maximum number of identities to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxUsers <p>
     *            Maximum number of identities to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersRequest withMaxUsers(Integer maxUsers) {
        this.maxUsers = maxUsers;
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
        if (getCollectionId() != null)
            sb.append("CollectionId: " + getCollectionId() + ",");
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
        if (getFaceId() != null)
            sb.append("FaceId: " + getFaceId() + ",");
        if (getUserMatchThreshold() != null)
            sb.append("UserMatchThreshold: " + getUserMatchThreshold() + ",");
        if (getMaxUsers() != null)
            sb.append("MaxUsers: " + getMaxUsers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getFaceId() == null) ? 0 : getFaceId().hashCode());
        hashCode = prime * hashCode
                + ((getUserMatchThreshold() == null) ? 0 : getUserMatchThreshold().hashCode());
        hashCode = prime * hashCode + ((getMaxUsers() == null) ? 0 : getMaxUsers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchUsersRequest == false)
            return false;
        SearchUsersRequest other = (SearchUsersRequest) obj;

        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null
                && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getFaceId() == null ^ this.getFaceId() == null)
            return false;
        if (other.getFaceId() != null && other.getFaceId().equals(this.getFaceId()) == false)
            return false;
        if (other.getUserMatchThreshold() == null ^ this.getUserMatchThreshold() == null)
            return false;
        if (other.getUserMatchThreshold() != null
                && other.getUserMatchThreshold().equals(this.getUserMatchThreshold()) == false)
            return false;
        if (other.getMaxUsers() == null ^ this.getMaxUsers() == null)
            return false;
        if (other.getMaxUsers() != null && other.getMaxUsers().equals(this.getMaxUsers()) == false)
            return false;
        return true;
    }
}
