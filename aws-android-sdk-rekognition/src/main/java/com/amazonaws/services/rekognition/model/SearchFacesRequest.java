/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * For a given input face ID, searches for matching faces in the collection the
 * face belongs to. You get a face ID when you add a face to the collection
 * using the <a>IndexFaces</a> operation. The operation compares the features of
 * the input face with faces in the specified collection.
 * </p>
 * <note>
 * <p>
 * You can also search faces without indexing faces by using the
 * <code>SearchFacesByImage</code> operation.
 * </p>
 * </note>
 * <p>
 * The operation response returns an array of faces that match, ordered by
 * similarity score with the highest similarity first. More specifically, it is
 * an array of metadata for each face match that is found. Along with the
 * metadata, the response also includes a <code>confidence</code> value for each
 * face match, indicating the confidence that the specific face matches the
 * input face.
 * </p>
 * <p>
 * For an example, see Searching for a Face Using Its Face ID in the Amazon
 * Rekognition Developer Guide.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:SearchFaces</code> action.
 * </p>
 */
public class SearchFacesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * ID of the collection the face belongs to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     */
    private String collectionId;

    /**
     * <p>
     * ID of a face to find matches for in the collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     */
    private String faceId;

    /**
     * <p>
     * Maximum number of faces to return. The operation returns the maximum
     * number of faces with the highest confidence in the match.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4096<br/>
     */
    private Integer maxFaces;

    /**
     * <p>
     * Optional value specifying the minimum confidence in the face match to
     * return. For example, don't return any matches where confidence in matches
     * is less than 70%.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float faceMatchThreshold;

    /**
     * Default constructor for SearchFacesRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     */
    public SearchFacesRequest() {
    }

    /**
     * Constructs a new SearchFacesRequest object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param collectionId <p>
     *            ID of the collection the face belongs to.
     *            </p>
     * @param faceId <p>
     *            ID of a face to find matches for in the collection.
     *            </p>
     */
    public SearchFacesRequest(String collectionId, String faceId) {
        setCollectionId(collectionId);
        setFaceId(faceId);
    }

    /**
     * <p>
     * ID of the collection the face belongs to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @return <p>
     *         ID of the collection the face belongs to.
     *         </p>
     */
    public String getCollectionId() {
        return collectionId;
    }

    /**
     * <p>
     * ID of the collection the face belongs to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param collectionId <p>
     *            ID of the collection the face belongs to.
     *            </p>
     */
    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * ID of the collection the face belongs to.
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
     *            ID of the collection the face belongs to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchFacesRequest withCollectionId(String collectionId) {
        this.collectionId = collectionId;
        return this;
    }

    /**
     * <p>
     * ID of a face to find matches for in the collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         ID of a face to find matches for in the collection.
     *         </p>
     */
    public String getFaceId() {
        return faceId;
    }

    /**
     * <p>
     * ID of a face to find matches for in the collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param faceId <p>
     *            ID of a face to find matches for in the collection.
     *            </p>
     */
    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    /**
     * <p>
     * ID of a face to find matches for in the collection.
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
     *            ID of a face to find matches for in the collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchFacesRequest withFaceId(String faceId) {
        this.faceId = faceId;
        return this;
    }

    /**
     * <p>
     * Maximum number of faces to return. The operation returns the maximum
     * number of faces with the highest confidence in the match.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4096<br/>
     *
     * @return <p>
     *         Maximum number of faces to return. The operation returns the
     *         maximum number of faces with the highest confidence in the match.
     *         </p>
     */
    public Integer getMaxFaces() {
        return maxFaces;
    }

    /**
     * <p>
     * Maximum number of faces to return. The operation returns the maximum
     * number of faces with the highest confidence in the match.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4096<br/>
     *
     * @param maxFaces <p>
     *            Maximum number of faces to return. The operation returns the
     *            maximum number of faces with the highest confidence in the
     *            match.
     *            </p>
     */
    public void setMaxFaces(Integer maxFaces) {
        this.maxFaces = maxFaces;
    }

    /**
     * <p>
     * Maximum number of faces to return. The operation returns the maximum
     * number of faces with the highest confidence in the match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4096<br/>
     *
     * @param maxFaces <p>
     *            Maximum number of faces to return. The operation returns the
     *            maximum number of faces with the highest confidence in the
     *            match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchFacesRequest withMaxFaces(Integer maxFaces) {
        this.maxFaces = maxFaces;
        return this;
    }

    /**
     * <p>
     * Optional value specifying the minimum confidence in the face match to
     * return. For example, don't return any matches where confidence in matches
     * is less than 70%.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         Optional value specifying the minimum confidence in the face
     *         match to return. For example, don't return any matches where
     *         confidence in matches is less than 70%.
     *         </p>
     */
    public Float getFaceMatchThreshold() {
        return faceMatchThreshold;
    }

    /**
     * <p>
     * Optional value specifying the minimum confidence in the face match to
     * return. For example, don't return any matches where confidence in matches
     * is less than 70%.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param faceMatchThreshold <p>
     *            Optional value specifying the minimum confidence in the face
     *            match to return. For example, don't return any matches where
     *            confidence in matches is less than 70%.
     *            </p>
     */
    public void setFaceMatchThreshold(Float faceMatchThreshold) {
        this.faceMatchThreshold = faceMatchThreshold;
    }

    /**
     * <p>
     * Optional value specifying the minimum confidence in the face match to
     * return. For example, don't return any matches where confidence in matches
     * is less than 70%.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param faceMatchThreshold <p>
     *            Optional value specifying the minimum confidence in the face
     *            match to return. For example, don't return any matches where
     *            confidence in matches is less than 70%.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchFacesRequest withFaceMatchThreshold(Float faceMatchThreshold) {
        this.faceMatchThreshold = faceMatchThreshold;
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
        if (getFaceId() != null)
            sb.append("FaceId: " + getFaceId() + ",");
        if (getMaxFaces() != null)
            sb.append("MaxFaces: " + getMaxFaces() + ",");
        if (getFaceMatchThreshold() != null)
            sb.append("FaceMatchThreshold: " + getFaceMatchThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        hashCode = prime * hashCode + ((getFaceId() == null) ? 0 : getFaceId().hashCode());
        hashCode = prime * hashCode + ((getMaxFaces() == null) ? 0 : getMaxFaces().hashCode());
        hashCode = prime * hashCode
                + ((getFaceMatchThreshold() == null) ? 0 : getFaceMatchThreshold().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchFacesRequest == false)
            return false;
        SearchFacesRequest other = (SearchFacesRequest) obj;

        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null
                && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getFaceId() == null ^ this.getFaceId() == null)
            return false;
        if (other.getFaceId() != null && other.getFaceId().equals(this.getFaceId()) == false)
            return false;
        if (other.getMaxFaces() == null ^ this.getMaxFaces() == null)
            return false;
        if (other.getMaxFaces() != null && other.getMaxFaces().equals(this.getMaxFaces()) == false)
            return false;
        if (other.getFaceMatchThreshold() == null ^ this.getFaceMatchThreshold() == null)
            return false;
        if (other.getFaceMatchThreshold() != null
                && other.getFaceMatchThreshold().equals(this.getFaceMatchThreshold()) == false)
            return false;
        return true;
    }
}
