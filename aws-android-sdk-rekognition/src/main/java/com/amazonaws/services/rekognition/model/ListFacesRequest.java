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
 * Returns metadata for faces in the specified collection. This metadata
 * includes information such as the bounding box coordinates, the confidence
 * (that the bounding box contains a face), and face ID. For an example, see
 * Listing Faces in a Collection in the Amazon Rekognition Developer Guide.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:ListFaces</code> action.
 * </p>
 */
public class ListFacesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * ID of the collection from which to list the faces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     */
    private String collectionId;

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to
     * retrieve), Amazon Rekognition returns a pagination token in the response.
     * You can use this pagination token to retrieve the next set of faces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Maximum number of faces to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4096<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * An array of user IDs to filter results with when listing faces in a
     * collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     */
    private String userId;

    /**
     * <p>
     * An array of face IDs to filter results with when listing faces in a
     * collection.
     * </p>
     */
    private java.util.List<String> faceIds;

    /**
     * Default constructor for ListFacesRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     */
    public ListFacesRequest() {
    }

    /**
     * Constructs a new ListFacesRequest object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param collectionId <p>
     *            ID of the collection from which to list the faces.
     *            </p>
     */
    public ListFacesRequest(String collectionId) {
        setCollectionId(collectionId);
    }

    /**
     * <p>
     * ID of the collection from which to list the faces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @return <p>
     *         ID of the collection from which to list the faces.
     *         </p>
     */
    public String getCollectionId() {
        return collectionId;
    }

    /**
     * <p>
     * ID of the collection from which to list the faces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param collectionId <p>
     *            ID of the collection from which to list the faces.
     *            </p>
     */
    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * ID of the collection from which to list the faces.
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
     *            ID of the collection from which to list the faces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFacesRequest withCollectionId(String collectionId) {
        this.collectionId = collectionId;
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to
     * retrieve), Amazon Rekognition returns a pagination token in the response.
     * You can use this pagination token to retrieve the next set of faces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         If the previous response was incomplete (because there is more
     *         data to retrieve), Amazon Rekognition returns a pagination token
     *         in the response. You can use this pagination token to retrieve
     *         the next set of faces.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to
     * retrieve), Amazon Rekognition returns a pagination token in the response.
     * You can use this pagination token to retrieve the next set of faces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the previous response was incomplete (because there is more
     *            data to retrieve), Amazon Rekognition returns a pagination
     *            token in the response. You can use this pagination token to
     *            retrieve the next set of faces.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to
     * retrieve), Amazon Rekognition returns a pagination token in the response.
     * You can use this pagination token to retrieve the next set of faces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the previous response was incomplete (because there is more
     *            data to retrieve), Amazon Rekognition returns a pagination
     *            token in the response. You can use this pagination token to
     *            retrieve the next set of faces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFacesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Maximum number of faces to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4096<br/>
     *
     * @return <p>
     *         Maximum number of faces to return.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Maximum number of faces to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4096<br/>
     *
     * @param maxResults <p>
     *            Maximum number of faces to return.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of faces to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4096<br/>
     *
     * @param maxResults <p>
     *            Maximum number of faces to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFacesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * An array of user IDs to filter results with when listing faces in a
     * collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @return <p>
     *         An array of user IDs to filter results with when listing faces in
     *         a collection.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * An array of user IDs to filter results with when listing faces in a
     * collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param userId <p>
     *            An array of user IDs to filter results with when listing faces
     *            in a collection.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * An array of user IDs to filter results with when listing faces in a
     * collection.
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
     *            An array of user IDs to filter results with when listing faces
     *            in a collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFacesRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * An array of face IDs to filter results with when listing faces in a
     * collection.
     * </p>
     *
     * @return <p>
     *         An array of face IDs to filter results with when listing faces in
     *         a collection.
     *         </p>
     */
    public java.util.List<String> getFaceIds() {
        return faceIds;
    }

    /**
     * <p>
     * An array of face IDs to filter results with when listing faces in a
     * collection.
     * </p>
     *
     * @param faceIds <p>
     *            An array of face IDs to filter results with when listing faces
     *            in a collection.
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
     * An array of face IDs to filter results with when listing faces in a
     * collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceIds <p>
     *            An array of face IDs to filter results with when listing faces
     *            in a collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFacesRequest withFaceIds(String... faceIds) {
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
     * An array of face IDs to filter results with when listing faces in a
     * collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceIds <p>
     *            An array of face IDs to filter results with when listing faces
     *            in a collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFacesRequest withFaceIds(java.util.Collection<String> faceIds) {
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
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
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getFaceIds() == null) ? 0 : getFaceIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFacesRequest == false)
            return false;
        ListFacesRequest other = (ListFacesRequest) obj;

        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null
                && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getFaceIds() == null ^ this.getFaceIds() == null)
            return false;
        if (other.getFaceIds() != null && other.getFaceIds().equals(this.getFaceIds()) == false)
            return false;
        return true;
    }
}
