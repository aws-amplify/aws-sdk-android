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

public class ListFacesResult implements Serializable {
    /**
     * <p>
     * An array of <code>Face</code> objects.
     * </p>
     */
    private java.util.List<Face> faces;

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition returns this token that
     * you can use in the subsequent request to retrieve the next set of faces.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Version number of the face detection model associated with the input
     * collection (<code>CollectionId</code>).
     * </p>
     */
    private String faceModelVersion;

    /**
     * <p>
     * An array of <code>Face</code> objects.
     * </p>
     *
     * @return <p>
     *         An array of <code>Face</code> objects.
     *         </p>
     */
    public java.util.List<Face> getFaces() {
        return faces;
    }

    /**
     * <p>
     * An array of <code>Face</code> objects.
     * </p>
     *
     * @param faces <p>
     *            An array of <code>Face</code> objects.
     *            </p>
     */
    public void setFaces(java.util.Collection<Face> faces) {
        if (faces == null) {
            this.faces = null;
            return;
        }

        this.faces = new java.util.ArrayList<Face>(faces);
    }

    /**
     * <p>
     * An array of <code>Face</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faces <p>
     *            An array of <code>Face</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFacesResult withFaces(Face... faces) {
        if (getFaces() == null) {
            this.faces = new java.util.ArrayList<Face>(faces.length);
        }
        for (Face value : faces) {
            this.faces.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Face</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faces <p>
     *            An array of <code>Face</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFacesResult withFaces(java.util.Collection<Face> faces) {
        setFaces(faces);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition returns this token that
     * you can use in the subsequent request to retrieve the next set of faces.
     * </p>
     *
     * @return <p>
     *         If the response is truncated, Amazon Rekognition returns this
     *         token that you can use in the subsequent request to retrieve the
     *         next set of faces.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition returns this token that
     * you can use in the subsequent request to retrieve the next set of faces.
     * </p>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon Rekognition returns this
     *            token that you can use in the subsequent request to retrieve
     *            the next set of faces.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition returns this token that
     * you can use in the subsequent request to retrieve the next set of faces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon Rekognition returns this
     *            token that you can use in the subsequent request to retrieve
     *            the next set of faces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFacesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
    public ListFacesResult withFaceModelVersion(String faceModelVersion) {
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
        if (getFaces() != null)
            sb.append("Faces: " + getFaces() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getFaceModelVersion() != null)
            sb.append("FaceModelVersion: " + getFaceModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFaces() == null) ? 0 : getFaces().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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

        if (obj instanceof ListFacesResult == false)
            return false;
        ListFacesResult other = (ListFacesResult) obj;

        if (other.getFaces() == null ^ this.getFaces() == null)
            return false;
        if (other.getFaces() != null && other.getFaces().equals(this.getFaces()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFaceModelVersion() == null ^ this.getFaceModelVersion() == null)
            return false;
        if (other.getFaceModelVersion() != null
                && other.getFaceModelVersion().equals(this.getFaceModelVersion()) == false)
            return false;
        return true;
    }
}
