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
 * Associates one or more faces with an existing UserID. Takes an array of
 * <code>FaceIds</code>. Each <code>FaceId</code> that are present in the
 * <code>FaceIds</code> list is associated with the provided UserID. The maximum
 * number of total <code>FaceIds</code> per UserID is 100.
 * </p>
 * <p>
 * The <code>UserMatchThreshold</code> parameter specifies the minimum user
 * match confidence required for the face to be associated with a UserID that
 * has at least one <code>FaceID</code> already associated. This ensures that
 * the <code>FaceIds</code> are associated with the right UserID. The value
 * ranges from 0-100 and default value is 75.
 * </p>
 * <p>
 * If successful, an array of <code>AssociatedFace</code> objects containing the
 * associated <code>FaceIds</code> is returned. If a given face is already
 * associated with the given <code>UserID</code>, it will be ignored and will
 * not be returned in the response. If a given face is already associated to a
 * different <code>UserID</code>, isn't found in the collection, doesn’t meet
 * the <code>UserMatchThreshold</code>, or there are already 100 faces
 * associated with the <code>UserID</code>, it will be returned as part of an
 * array of <code>UnsuccessfulFaceAssociations.</code>
 * </p>
 * <p>
 * The <code>UserStatus</code> reflects the status of an operation which updates
 * a UserID representation with a list of given faces. The
 * <code>UserStatus</code> can be:
 * </p>
 * <ul>
 * <li>
 * <p>
 * ACTIVE - All associations or disassociations of FaceID(s) for a UserID are
 * complete.
 * </p>
 * </li>
 * <li>
 * <p>
 * CREATED - A UserID has been created, but has no FaceID(s) associated with it.
 * </p>
 * </li>
 * <li>
 * <p>
 * UPDATING - A UserID is being updated and there are current associations or
 * disassociations of FaceID(s) taking place.
 * </p>
 * </li>
 * </ul>
 */
public class AssociateFacesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of an existing collection containing the UserID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     */
    private String collectionId;

    /**
     * <p>
     * The ID for the existing UserID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     */
    private String userId;

    /**
     * <p>
     * An array of FaceIDs to associate with the UserID.
     * </p>
     */
    private java.util.List<String> faceIds;

    /**
     * <p>
     * An optional value specifying the minimum confidence in the UserID match
     * to return. The default value is 75.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     */
    private Float userMatchThreshold;

    /**
     * <p>
     * Idempotent token used to identify the request to
     * <code>AssociateFaces</code>. If you use the same token with multiple
     * <code>AssociateFaces</code> requests, the same response is returned. Use
     * ClientRequestToken to prevent the same request from being processed more
     * than once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The ID of an existing collection containing the UserID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @return <p>
     *         The ID of an existing collection containing the UserID.
     *         </p>
     */
    public String getCollectionId() {
        return collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection containing the UserID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param collectionId <p>
     *            The ID of an existing collection containing the UserID.
     *            </p>
     */
    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection containing the UserID.
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
     *            The ID of an existing collection containing the UserID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateFacesRequest withCollectionId(String collectionId) {
        this.collectionId = collectionId;
        return this;
    }

    /**
     * <p>
     * The ID for the existing UserID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @return <p>
     *         The ID for the existing UserID.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The ID for the existing UserID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param userId <p>
     *            The ID for the existing UserID.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ID for the existing UserID.
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
     *            The ID for the existing UserID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateFacesRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * An array of FaceIDs to associate with the UserID.
     * </p>
     *
     * @return <p>
     *         An array of FaceIDs to associate with the UserID.
     *         </p>
     */
    public java.util.List<String> getFaceIds() {
        return faceIds;
    }

    /**
     * <p>
     * An array of FaceIDs to associate with the UserID.
     * </p>
     *
     * @param faceIds <p>
     *            An array of FaceIDs to associate with the UserID.
     *            </p>
     */
    public void setFaceIds(java.util.Collection<String> faceIds) {
        if (faceIds == null) {
            this.faceIds = null;
            return;
        }

        this.faceIds = new java.util.ArrayList<String>(faceIds);
    }

    /**
     * <p>
     * An array of FaceIDs to associate with the UserID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceIds <p>
     *            An array of FaceIDs to associate with the UserID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateFacesRequest withFaceIds(String... faceIds) {
        if (getFaceIds() == null) {
            this.faceIds = new java.util.ArrayList<String>(faceIds.length);
        }
        for (String value : faceIds) {
            this.faceIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of FaceIDs to associate with the UserID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceIds <p>
     *            An array of FaceIDs to associate with the UserID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateFacesRequest withFaceIds(java.util.Collection<String> faceIds) {
        setFaceIds(faceIds);
        return this;
    }

    /**
     * <p>
     * An optional value specifying the minimum confidence in the UserID match
     * to return. The default value is 75.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @return <p>
     *         An optional value specifying the minimum confidence in the UserID
     *         match to return. The default value is 75.
     *         </p>
     */
    public Float getUserMatchThreshold() {
        return userMatchThreshold;
    }

    /**
     * <p>
     * An optional value specifying the minimum confidence in the UserID match
     * to return. The default value is 75.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param userMatchThreshold <p>
     *            An optional value specifying the minimum confidence in the
     *            UserID match to return. The default value is 75.
     *            </p>
     */
    public void setUserMatchThreshold(Float userMatchThreshold) {
        this.userMatchThreshold = userMatchThreshold;
    }

    /**
     * <p>
     * An optional value specifying the minimum confidence in the UserID match
     * to return. The default value is 75.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param userMatchThreshold <p>
     *            An optional value specifying the minimum confidence in the
     *            UserID match to return. The default value is 75.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateFacesRequest withUserMatchThreshold(Float userMatchThreshold) {
        this.userMatchThreshold = userMatchThreshold;
        return this;
    }

    /**
     * <p>
     * Idempotent token used to identify the request to
     * <code>AssociateFaces</code>. If you use the same token with multiple
     * <code>AssociateFaces</code> requests, the same response is returned. Use
     * ClientRequestToken to prevent the same request from being processed more
     * than once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         Idempotent token used to identify the request to
     *         <code>AssociateFaces</code>. If you use the same token with
     *         multiple <code>AssociateFaces</code> requests, the same response
     *         is returned. Use ClientRequestToken to prevent the same request
     *         from being processed more than once.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token used to identify the request to
     * <code>AssociateFaces</code>. If you use the same token with multiple
     * <code>AssociateFaces</code> requests, the same response is returned. Use
     * ClientRequestToken to prevent the same request from being processed more
     * than once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Idempotent token used to identify the request to
     *            <code>AssociateFaces</code>. If you use the same token with
     *            multiple <code>AssociateFaces</code> requests, the same
     *            response is returned. Use ClientRequestToken to prevent the
     *            same request from being processed more than once.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token used to identify the request to
     * <code>AssociateFaces</code>. If you use the same token with multiple
     * <code>AssociateFaces</code> requests, the same response is returned. Use
     * ClientRequestToken to prevent the same request from being processed more
     * than once.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Idempotent token used to identify the request to
     *            <code>AssociateFaces</code>. If you use the same token with
     *            multiple <code>AssociateFaces</code> requests, the same
     *            response is returned. Use ClientRequestToken to prevent the
     *            same request from being processed more than once.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateFacesRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
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
        if (getFaceIds() != null)
            sb.append("FaceIds: " + getFaceIds() + ",");
        if (getUserMatchThreshold() != null)
            sb.append("UserMatchThreshold: " + getUserMatchThreshold() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken());
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
        hashCode = prime * hashCode + ((getFaceIds() == null) ? 0 : getFaceIds().hashCode());
        hashCode = prime * hashCode
                + ((getUserMatchThreshold() == null) ? 0 : getUserMatchThreshold().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateFacesRequest == false)
            return false;
        AssociateFacesRequest other = (AssociateFacesRequest) obj;

        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null
                && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getFaceIds() == null ^ this.getFaceIds() == null)
            return false;
        if (other.getFaceIds() != null && other.getFaceIds().equals(this.getFaceIds()) == false)
            return false;
        if (other.getUserMatchThreshold() == null ^ this.getUserMatchThreshold() == null)
            return false;
        if (other.getUserMatchThreshold() != null
                && other.getUserMatchThreshold().equals(this.getUserMatchThreshold()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
