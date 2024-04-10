/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Removes the association between a <code>Face</code> supplied in an array of
 * <code>FaceIds</code> and the User. If the User is not present already, then a
 * <code>ResourceNotFound</code> exception is thrown. If successful, an array of
 * faces that are disassociated from the User is returned. If a given face is
 * already disassociated from the given UserID, it will be ignored and not be
 * returned in the response. If a given face is already associated with a
 * different User or not found in the collection it will be returned as part of
 * <code>UnsuccessfulDisassociations</code>. You can remove 1 - 100 face IDs
 * from a user at one time.
 * </p>
 */
public class DisassociateFacesRequest extends AmazonWebServiceRequest implements Serializable {
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
     * ID for the existing UserID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     */
    private String userId;

    /**
     * <p>
     * Idempotent token used to identify the request to
     * <code>DisassociateFaces</code>. If you use the same token with multiple
     * <code>DisassociateFaces</code> requests, the same response is returned.
     * Use ClientRequestToken to prevent the same request from being processed
     * more than once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * An array of face IDs to disassociate from the UserID.
     * </p>
     */
    private java.util.List<String> faceIds;

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
    public DisassociateFacesRequest withCollectionId(String collectionId) {
        this.collectionId = collectionId;
        return this;
    }

    /**
     * <p>
     * ID for the existing UserID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @return <p>
     *         ID for the existing UserID.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * ID for the existing UserID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param userId <p>
     *            ID for the existing UserID.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * ID for the existing UserID.
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
     *            ID for the existing UserID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateFacesRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * Idempotent token used to identify the request to
     * <code>DisassociateFaces</code>. If you use the same token with multiple
     * <code>DisassociateFaces</code> requests, the same response is returned.
     * Use ClientRequestToken to prevent the same request from being processed
     * more than once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         Idempotent token used to identify the request to
     *         <code>DisassociateFaces</code>. If you use the same token with
     *         multiple <code>DisassociateFaces</code> requests, the same
     *         response is returned. Use ClientRequestToken to prevent the same
     *         request from being processed more than once.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token used to identify the request to
     * <code>DisassociateFaces</code>. If you use the same token with multiple
     * <code>DisassociateFaces</code> requests, the same response is returned.
     * Use ClientRequestToken to prevent the same request from being processed
     * more than once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Idempotent token used to identify the request to
     *            <code>DisassociateFaces</code>. If you use the same token with
     *            multiple <code>DisassociateFaces</code> requests, the same
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
     * <code>DisassociateFaces</code>. If you use the same token with multiple
     * <code>DisassociateFaces</code> requests, the same response is returned.
     * Use ClientRequestToken to prevent the same request from being processed
     * more than once.
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
     *            <code>DisassociateFaces</code>. If you use the same token with
     *            multiple <code>DisassociateFaces</code> requests, the same
     *            response is returned. Use ClientRequestToken to prevent the
     *            same request from being processed more than once.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateFacesRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * An array of face IDs to disassociate from the UserID.
     * </p>
     *
     * @return <p>
     *         An array of face IDs to disassociate from the UserID.
     *         </p>
     */
    public java.util.List<String> getFaceIds() {
        return faceIds;
    }

    /**
     * <p>
     * An array of face IDs to disassociate from the UserID.
     * </p>
     *
     * @param faceIds <p>
     *            An array of face IDs to disassociate from the UserID.
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
     * An array of face IDs to disassociate from the UserID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceIds <p>
     *            An array of face IDs to disassociate from the UserID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateFacesRequest withFaceIds(String... faceIds) {
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
     * An array of face IDs to disassociate from the UserID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceIds <p>
     *            An array of face IDs to disassociate from the UserID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateFacesRequest withFaceIds(java.util.Collection<String> faceIds) {
        setFaceIds(faceIds);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getFaceIds() != null)
            sb.append("FaceIds: " + getFaceIds());
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
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getFaceIds() == null) ? 0 : getFaceIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateFacesRequest == false)
            return false;
        DisassociateFacesRequest other = (DisassociateFacesRequest) obj;

        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null
                && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getFaceIds() == null ^ this.getFaceIds() == null)
            return false;
        if (other.getFaceIds() != null && other.getFaceIds().equals(this.getFaceIds()) == false)
            return false;
        return true;
    }
}
