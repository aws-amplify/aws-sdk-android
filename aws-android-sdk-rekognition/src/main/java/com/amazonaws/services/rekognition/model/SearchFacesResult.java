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

public class SearchFacesResult implements Serializable {
    /**
     * <p>
     * ID of the face that was searched for matches in a collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     */
    private String searchedFaceId;

    /**
     * <p>
     * An array of faces that matched the input face, along with the confidence
     * in the match.
     * </p>
     */
    private java.util.List<FaceMatch> faceMatches;

    /**
     * <p>
     * Version number of the face detection model associated with the input
     * collection (<code>CollectionId</code>).
     * </p>
     */
    private String faceModelVersion;

    /**
     * <p>
     * ID of the face that was searched for matches in a collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         ID of the face that was searched for matches in a collection.
     *         </p>
     */
    public String getSearchedFaceId() {
        return searchedFaceId;
    }

    /**
     * <p>
     * ID of the face that was searched for matches in a collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param searchedFaceId <p>
     *            ID of the face that was searched for matches in a collection.
     *            </p>
     */
    public void setSearchedFaceId(String searchedFaceId) {
        this.searchedFaceId = searchedFaceId;
    }

    /**
     * <p>
     * ID of the face that was searched for matches in a collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param searchedFaceId <p>
     *            ID of the face that was searched for matches in a collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchFacesResult withSearchedFaceId(String searchedFaceId) {
        this.searchedFaceId = searchedFaceId;
        return this;
    }

    /**
     * <p>
     * An array of faces that matched the input face, along with the confidence
     * in the match.
     * </p>
     *
     * @return <p>
     *         An array of faces that matched the input face, along with the
     *         confidence in the match.
     *         </p>
     */
    public java.util.List<FaceMatch> getFaceMatches() {
        return faceMatches;
    }

    /**
     * <p>
     * An array of faces that matched the input face, along with the confidence
     * in the match.
     * </p>
     *
     * @param faceMatches <p>
     *            An array of faces that matched the input face, along with the
     *            confidence in the match.
     *            </p>
     */
    public void setFaceMatches(java.util.Collection<FaceMatch> faceMatches) {
        if (faceMatches == null) {
            this.faceMatches = null;
            return;
        }

        this.faceMatches = new java.util.ArrayList<FaceMatch>(faceMatches);
    }

    /**
     * <p>
     * An array of faces that matched the input face, along with the confidence
     * in the match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceMatches <p>
     *            An array of faces that matched the input face, along with the
     *            confidence in the match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchFacesResult withFaceMatches(FaceMatch... faceMatches) {
        if (getFaceMatches() == null) {
            this.faceMatches = new java.util.ArrayList<FaceMatch>(faceMatches.length);
        }
        for (FaceMatch value : faceMatches) {
            this.faceMatches.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of faces that matched the input face, along with the confidence
     * in the match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceMatches <p>
     *            An array of faces that matched the input face, along with the
     *            confidence in the match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchFacesResult withFaceMatches(java.util.Collection<FaceMatch> faceMatches) {
        setFaceMatches(faceMatches);
        return this;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the input
     * collection (<code>CollectionId</code>).
     * </p>
     *
     * @return <p>
     *         Version number of the face detection model associated with the
     *         input collection (<code>CollectionId</code>).
     *         </p>
     */
    public String getFaceModelVersion() {
        return faceModelVersion;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the input
     * collection (<code>CollectionId</code>).
     * </p>
     *
     * @param faceModelVersion <p>
     *            Version number of the face detection model associated with the
     *            input collection (<code>CollectionId</code>).
     *            </p>
     */
    public void setFaceModelVersion(String faceModelVersion) {
        this.faceModelVersion = faceModelVersion;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the input
     * collection (<code>CollectionId</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceModelVersion <p>
     *            Version number of the face detection model associated with the
     *            input collection (<code>CollectionId</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchFacesResult withFaceModelVersion(String faceModelVersion) {
        this.faceModelVersion = faceModelVersion;
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
        if (getSearchedFaceId() != null)
            sb.append("SearchedFaceId: " + getSearchedFaceId() + ",");
        if (getFaceMatches() != null)
            sb.append("FaceMatches: " + getFaceMatches() + ",");
        if (getFaceModelVersion() != null)
            sb.append("FaceModelVersion: " + getFaceModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSearchedFaceId() == null) ? 0 : getSearchedFaceId().hashCode());
        hashCode = prime * hashCode
                + ((getFaceMatches() == null) ? 0 : getFaceMatches().hashCode());
        hashCode = prime * hashCode
                + ((getFaceModelVersion() == null) ? 0 : getFaceModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchFacesResult == false)
            return false;
        SearchFacesResult other = (SearchFacesResult) obj;

        if (other.getSearchedFaceId() == null ^ this.getSearchedFaceId() == null)
            return false;
        if (other.getSearchedFaceId() != null
                && other.getSearchedFaceId().equals(this.getSearchedFaceId()) == false)
            return false;
        if (other.getFaceMatches() == null ^ this.getFaceMatches() == null)
            return false;
        if (other.getFaceMatches() != null
                && other.getFaceMatches().equals(this.getFaceMatches()) == false)
            return false;
        if (other.getFaceModelVersion() == null ^ this.getFaceModelVersion() == null)
            return false;
        if (other.getFaceModelVersion() != null
                && other.getFaceModelVersion().equals(this.getFaceModelVersion()) == false)
            return false;
        return true;
    }
}
