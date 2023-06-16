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

public class SearchUsersByImageResult implements Serializable {
    /**
     * <p>
     * An array of UserID objects that matched the input face, along with the
     * confidence in the match. The returned structure will be empty if there
     * are no matches. Returned if the SearchUsersByImageResponse action is
     * successful.
     * </p>
     */
    private java.util.List<UserMatch> userMatches;

    /**
     * <p>
     * Version number of the face detection model associated with the input
     * collection CollectionId.
     * </p>
     */
    private String faceModelVersion;

    /**
     * <p>
     * A list of FaceDetail objects containing the BoundingBox for the largest
     * face in image, as well as the confidence in the bounding box, that was
     * searched for matches. If no valid face is detected in the image the
     * response will contain no SearchedFace object.
     * </p>
     */
    private SearchedFaceDetails searchedFace;

    /**
     * <p>
     * List of UnsearchedFace objects. Contains the face details infered from
     * the specified image but not used for search. Contains reasons that
     * describe why a face wasn't used for Search.
     * </p>
     */
    private java.util.List<UnsearchedFace> unsearchedFaces;

    /**
     * <p>
     * An array of UserID objects that matched the input face, along with the
     * confidence in the match. The returned structure will be empty if there
     * are no matches. Returned if the SearchUsersByImageResponse action is
     * successful.
     * </p>
     *
     * @return <p>
     *         An array of UserID objects that matched the input face, along
     *         with the confidence in the match. The returned structure will be
     *         empty if there are no matches. Returned if the
     *         SearchUsersByImageResponse action is successful.
     *         </p>
     */
    public java.util.List<UserMatch> getUserMatches() {
        return userMatches;
    }

    /**
     * <p>
     * An array of UserID objects that matched the input face, along with the
     * confidence in the match. The returned structure will be empty if there
     * are no matches. Returned if the SearchUsersByImageResponse action is
     * successful.
     * </p>
     *
     * @param userMatches <p>
     *            An array of UserID objects that matched the input face, along
     *            with the confidence in the match. The returned structure will
     *            be empty if there are no matches. Returned if the
     *            SearchUsersByImageResponse action is successful.
     *            </p>
     */
    public void setUserMatches(java.util.Collection<UserMatch> userMatches) {
        if (userMatches == null) {
            this.userMatches = null;
            return;
        }

        this.userMatches = new java.util.ArrayList<UserMatch>(userMatches);
    }

    /**
     * <p>
     * An array of UserID objects that matched the input face, along with the
     * confidence in the match. The returned structure will be empty if there
     * are no matches. Returned if the SearchUsersByImageResponse action is
     * successful.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userMatches <p>
     *            An array of UserID objects that matched the input face, along
     *            with the confidence in the match. The returned structure will
     *            be empty if there are no matches. Returned if the
     *            SearchUsersByImageResponse action is successful.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersByImageResult withUserMatches(UserMatch... userMatches) {
        if (getUserMatches() == null) {
            this.userMatches = new java.util.ArrayList<UserMatch>(userMatches.length);
        }
        for (UserMatch value : userMatches) {
            this.userMatches.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of UserID objects that matched the input face, along with the
     * confidence in the match. The returned structure will be empty if there
     * are no matches. Returned if the SearchUsersByImageResponse action is
     * successful.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userMatches <p>
     *            An array of UserID objects that matched the input face, along
     *            with the confidence in the match. The returned structure will
     *            be empty if there are no matches. Returned if the
     *            SearchUsersByImageResponse action is successful.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersByImageResult withUserMatches(java.util.Collection<UserMatch> userMatches) {
        setUserMatches(userMatches);
        return this;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the input
     * collection CollectionId.
     * </p>
     *
     * @return <p>
     *         Version number of the face detection model associated with the
     *         input collection CollectionId.
     *         </p>
     */
    public String getFaceModelVersion() {
        return faceModelVersion;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the input
     * collection CollectionId.
     * </p>
     *
     * @param faceModelVersion <p>
     *            Version number of the face detection model associated with the
     *            input collection CollectionId.
     *            </p>
     */
    public void setFaceModelVersion(String faceModelVersion) {
        this.faceModelVersion = faceModelVersion;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the input
     * collection CollectionId.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceModelVersion <p>
     *            Version number of the face detection model associated with the
     *            input collection CollectionId.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersByImageResult withFaceModelVersion(String faceModelVersion) {
        this.faceModelVersion = faceModelVersion;
        return this;
    }

    /**
     * <p>
     * A list of FaceDetail objects containing the BoundingBox for the largest
     * face in image, as well as the confidence in the bounding box, that was
     * searched for matches. If no valid face is detected in the image the
     * response will contain no SearchedFace object.
     * </p>
     *
     * @return <p>
     *         A list of FaceDetail objects containing the BoundingBox for the
     *         largest face in image, as well as the confidence in the bounding
     *         box, that was searched for matches. If no valid face is detected
     *         in the image the response will contain no SearchedFace object.
     *         </p>
     */
    public SearchedFaceDetails getSearchedFace() {
        return searchedFace;
    }

    /**
     * <p>
     * A list of FaceDetail objects containing the BoundingBox for the largest
     * face in image, as well as the confidence in the bounding box, that was
     * searched for matches. If no valid face is detected in the image the
     * response will contain no SearchedFace object.
     * </p>
     *
     * @param searchedFace <p>
     *            A list of FaceDetail objects containing the BoundingBox for
     *            the largest face in image, as well as the confidence in the
     *            bounding box, that was searched for matches. If no valid face
     *            is detected in the image the response will contain no
     *            SearchedFace object.
     *            </p>
     */
    public void setSearchedFace(SearchedFaceDetails searchedFace) {
        this.searchedFace = searchedFace;
    }

    /**
     * <p>
     * A list of FaceDetail objects containing the BoundingBox for the largest
     * face in image, as well as the confidence in the bounding box, that was
     * searched for matches. If no valid face is detected in the image the
     * response will contain no SearchedFace object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param searchedFace <p>
     *            A list of FaceDetail objects containing the BoundingBox for
     *            the largest face in image, as well as the confidence in the
     *            bounding box, that was searched for matches. If no valid face
     *            is detected in the image the response will contain no
     *            SearchedFace object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersByImageResult withSearchedFace(SearchedFaceDetails searchedFace) {
        this.searchedFace = searchedFace;
        return this;
    }

    /**
     * <p>
     * List of UnsearchedFace objects. Contains the face details infered from
     * the specified image but not used for search. Contains reasons that
     * describe why a face wasn't used for Search.
     * </p>
     *
     * @return <p>
     *         List of UnsearchedFace objects. Contains the face details infered
     *         from the specified image but not used for search. Contains
     *         reasons that describe why a face wasn't used for Search.
     *         </p>
     */
    public java.util.List<UnsearchedFace> getUnsearchedFaces() {
        return unsearchedFaces;
    }

    /**
     * <p>
     * List of UnsearchedFace objects. Contains the face details infered from
     * the specified image but not used for search. Contains reasons that
     * describe why a face wasn't used for Search.
     * </p>
     *
     * @param unsearchedFaces <p>
     *            List of UnsearchedFace objects. Contains the face details
     *            infered from the specified image but not used for search.
     *            Contains reasons that describe why a face wasn't used for
     *            Search.
     *            </p>
     */
    public void setUnsearchedFaces(java.util.Collection<UnsearchedFace> unsearchedFaces) {
        if (unsearchedFaces == null) {
            this.unsearchedFaces = null;
            return;
        }

        this.unsearchedFaces = new java.util.ArrayList<UnsearchedFace>(unsearchedFaces);
    }

    /**
     * <p>
     * List of UnsearchedFace objects. Contains the face details infered from
     * the specified image but not used for search. Contains reasons that
     * describe why a face wasn't used for Search.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsearchedFaces <p>
     *            List of UnsearchedFace objects. Contains the face details
     *            infered from the specified image but not used for search.
     *            Contains reasons that describe why a face wasn't used for
     *            Search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersByImageResult withUnsearchedFaces(UnsearchedFace... unsearchedFaces) {
        if (getUnsearchedFaces() == null) {
            this.unsearchedFaces = new java.util.ArrayList<UnsearchedFace>(unsearchedFaces.length);
        }
        for (UnsearchedFace value : unsearchedFaces) {
            this.unsearchedFaces.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of UnsearchedFace objects. Contains the face details infered from
     * the specified image but not used for search. Contains reasons that
     * describe why a face wasn't used for Search.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsearchedFaces <p>
     *            List of UnsearchedFace objects. Contains the face details
     *            infered from the specified image but not used for search.
     *            Contains reasons that describe why a face wasn't used for
     *            Search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersByImageResult withUnsearchedFaces(
            java.util.Collection<UnsearchedFace> unsearchedFaces) {
        setUnsearchedFaces(unsearchedFaces);
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
        if (getUserMatches() != null)
            sb.append("UserMatches: " + getUserMatches() + ",");
        if (getFaceModelVersion() != null)
            sb.append("FaceModelVersion: " + getFaceModelVersion() + ",");
        if (getSearchedFace() != null)
            sb.append("SearchedFace: " + getSearchedFace() + ",");
        if (getUnsearchedFaces() != null)
            sb.append("UnsearchedFaces: " + getUnsearchedFaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserMatches() == null) ? 0 : getUserMatches().hashCode());
        hashCode = prime * hashCode
                + ((getFaceModelVersion() == null) ? 0 : getFaceModelVersion().hashCode());
        hashCode = prime * hashCode
                + ((getSearchedFace() == null) ? 0 : getSearchedFace().hashCode());
        hashCode = prime * hashCode
                + ((getUnsearchedFaces() == null) ? 0 : getUnsearchedFaces().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchUsersByImageResult == false)
            return false;
        SearchUsersByImageResult other = (SearchUsersByImageResult) obj;

        if (other.getUserMatches() == null ^ this.getUserMatches() == null)
            return false;
        if (other.getUserMatches() != null
                && other.getUserMatches().equals(this.getUserMatches()) == false)
            return false;
        if (other.getFaceModelVersion() == null ^ this.getFaceModelVersion() == null)
            return false;
        if (other.getFaceModelVersion() != null
                && other.getFaceModelVersion().equals(this.getFaceModelVersion()) == false)
            return false;
        if (other.getSearchedFace() == null ^ this.getSearchedFace() == null)
            return false;
        if (other.getSearchedFace() != null
                && other.getSearchedFace().equals(this.getSearchedFace()) == false)
            return false;
        if (other.getUnsearchedFaces() == null ^ this.getUnsearchedFaces() == null)
            return false;
        if (other.getUnsearchedFaces() != null
                && other.getUnsearchedFaces().equals(this.getUnsearchedFaces()) == false)
            return false;
        return true;
    }
}
