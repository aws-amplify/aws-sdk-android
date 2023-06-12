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
 * Contains metadata for a UserID matched with a given face.
 * </p>
 */
public class MatchedUser implements Serializable {
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
     * The status of the user matched to a provided FaceID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, UPDATING, CREATING, CREATED
     */
    private String userStatus;

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
    public MatchedUser withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * The status of the user matched to a provided FaceID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, UPDATING, CREATING, CREATED
     *
     * @return <p>
     *         The status of the user matched to a provided FaceID.
     *         </p>
     * @see UserStatus
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * <p>
     * The status of the user matched to a provided FaceID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, UPDATING, CREATING, CREATED
     *
     * @param userStatus <p>
     *            The status of the user matched to a provided FaceID.
     *            </p>
     * @see UserStatus
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * <p>
     * The status of the user matched to a provided FaceID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, UPDATING, CREATING, CREATED
     *
     * @param userStatus <p>
     *            The status of the user matched to a provided FaceID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserStatus
     */
    public MatchedUser withUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    /**
     * <p>
     * The status of the user matched to a provided FaceID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, UPDATING, CREATING, CREATED
     *
     * @param userStatus <p>
     *            The status of the user matched to a provided FaceID.
     *            </p>
     * @see UserStatus
     */
    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus.toString();
    }

    /**
     * <p>
     * The status of the user matched to a provided FaceID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, UPDATING, CREATING, CREATED
     *
     * @param userStatus <p>
     *            The status of the user matched to a provided FaceID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserStatus
     */
    public MatchedUser withUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus.toString();
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
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
        if (getUserStatus() != null)
            sb.append("UserStatus: " + getUserStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MatchedUser == false)
            return false;
        MatchedUser other = (MatchedUser) obj;

        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getUserStatus() == null ^ this.getUserStatus() == null)
            return false;
        if (other.getUserStatus() != null
                && other.getUserStatus().equals(this.getUserStatus()) == false)
            return false;
        return true;
    }
}
