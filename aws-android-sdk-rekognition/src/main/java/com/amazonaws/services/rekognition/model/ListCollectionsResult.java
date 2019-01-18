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

public class ListCollectionsResult implements Serializable {
    /**
     * <p>
     * An array of collection IDs.
     * </p>
     */
    private java.util.List<String> collectionIds;

    /**
     * <p>
     * If the result is truncated, the response provides a
     * <code>NextToken</code> that you can use in the subsequent request to
     * fetch the next set of collection IDs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Version numbers of the face detection models associated with the
     * collections in the array <code>CollectionIds</code>. For example, the
     * value of <code>FaceModelVersions[2]</code> is the version number for the
     * face detection model used by the collection in
     * <code>CollectionId[2]</code>.
     * </p>
     */
    private java.util.List<String> faceModelVersions;

    /**
     * <p>
     * An array of collection IDs.
     * </p>
     *
     * @return <p>
     *         An array of collection IDs.
     *         </p>
     */
    public java.util.List<String> getCollectionIds() {
        return collectionIds;
    }

    /**
     * <p>
     * An array of collection IDs.
     * </p>
     *
     * @param collectionIds <p>
     *            An array of collection IDs.
     *            </p>
     */
    public void setCollectionIds(java.util.Collection<String> collectionIds) {
        if (collectionIds == null) {
            this.collectionIds = null;
            return;
        }

        this.collectionIds = new java.util.ArrayList<String>(collectionIds);
    }

    /**
     * <p>
     * An array of collection IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param collectionIds <p>
     *            An array of collection IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCollectionsResult withCollectionIds(String... collectionIds) {
        if (getCollectionIds() == null) {
            this.collectionIds = new java.util.ArrayList<String>(collectionIds.length);
        }
        for (String value : collectionIds) {
            this.collectionIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of collection IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param collectionIds <p>
     *            An array of collection IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCollectionsResult withCollectionIds(java.util.Collection<String> collectionIds) {
        setCollectionIds(collectionIds);
        return this;
    }

    /**
     * <p>
     * If the result is truncated, the response provides a
     * <code>NextToken</code> that you can use in the subsequent request to
     * fetch the next set of collection IDs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         If the result is truncated, the response provides a
     *         <code>NextToken</code> that you can use in the subsequent request
     *         to fetch the next set of collection IDs.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the result is truncated, the response provides a
     * <code>NextToken</code> that you can use in the subsequent request to
     * fetch the next set of collection IDs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the result is truncated, the response provides a
     *            <code>NextToken</code> that you can use in the subsequent
     *            request to fetch the next set of collection IDs.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result is truncated, the response provides a
     * <code>NextToken</code> that you can use in the subsequent request to
     * fetch the next set of collection IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the result is truncated, the response provides a
     *            <code>NextToken</code> that you can use in the subsequent
     *            request to fetch the next set of collection IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCollectionsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Version numbers of the face detection models associated with the
     * collections in the array <code>CollectionIds</code>. For example, the
     * value of <code>FaceModelVersions[2]</code> is the version number for the
     * face detection model used by the collection in
     * <code>CollectionId[2]</code>.
     * </p>
     *
     * @return <p>
     *         Version numbers of the face detection models associated with the
     *         collections in the array <code>CollectionIds</code>. For example,
     *         the value of <code>FaceModelVersions[2]</code> is the version
     *         number for the face detection model used by the collection in
     *         <code>CollectionId[2]</code>.
     *         </p>
     */
    public java.util.List<String> getFaceModelVersions() {
        return faceModelVersions;
    }

    /**
     * <p>
     * Version numbers of the face detection models associated with the
     * collections in the array <code>CollectionIds</code>. For example, the
     * value of <code>FaceModelVersions[2]</code> is the version number for the
     * face detection model used by the collection in
     * <code>CollectionId[2]</code>.
     * </p>
     *
     * @param faceModelVersions <p>
     *            Version numbers of the face detection models associated with
     *            the collections in the array <code>CollectionIds</code>. For
     *            example, the value of <code>FaceModelVersions[2]</code> is the
     *            version number for the face detection model used by the
     *            collection in <code>CollectionId[2]</code>.
     *            </p>
     */
    public void setFaceModelVersions(java.util.Collection<String> faceModelVersions) {
        if (faceModelVersions == null) {
            this.faceModelVersions = null;
            return;
        }

        this.faceModelVersions = new java.util.ArrayList<String>(faceModelVersions);
    }

    /**
     * <p>
     * Version numbers of the face detection models associated with the
     * collections in the array <code>CollectionIds</code>. For example, the
     * value of <code>FaceModelVersions[2]</code> is the version number for the
     * face detection model used by the collection in
     * <code>CollectionId[2]</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceModelVersions <p>
     *            Version numbers of the face detection models associated with
     *            the collections in the array <code>CollectionIds</code>. For
     *            example, the value of <code>FaceModelVersions[2]</code> is the
     *            version number for the face detection model used by the
     *            collection in <code>CollectionId[2]</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCollectionsResult withFaceModelVersions(String... faceModelVersions) {
        if (getFaceModelVersions() == null) {
            this.faceModelVersions = new java.util.ArrayList<String>(faceModelVersions.length);
        }
        for (String value : faceModelVersions) {
            this.faceModelVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Version numbers of the face detection models associated with the
     * collections in the array <code>CollectionIds</code>. For example, the
     * value of <code>FaceModelVersions[2]</code> is the version number for the
     * face detection model used by the collection in
     * <code>CollectionId[2]</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceModelVersions <p>
     *            Version numbers of the face detection models associated with
     *            the collections in the array <code>CollectionIds</code>. For
     *            example, the value of <code>FaceModelVersions[2]</code> is the
     *            version number for the face detection model used by the
     *            collection in <code>CollectionId[2]</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCollectionsResult withFaceModelVersions(
            java.util.Collection<String> faceModelVersions) {
        setFaceModelVersions(faceModelVersions);
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
        if (getCollectionIds() != null)
            sb.append("CollectionIds: " + getCollectionIds() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getFaceModelVersions() != null)
            sb.append("FaceModelVersions: " + getFaceModelVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCollectionIds() == null) ? 0 : getCollectionIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getFaceModelVersions() == null) ? 0 : getFaceModelVersions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCollectionsResult == false)
            return false;
        ListCollectionsResult other = (ListCollectionsResult) obj;

        if (other.getCollectionIds() == null ^ this.getCollectionIds() == null)
            return false;
        if (other.getCollectionIds() != null
                && other.getCollectionIds().equals(this.getCollectionIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFaceModelVersions() == null ^ this.getFaceModelVersions() == null)
            return false;
        if (other.getFaceModelVersions() != null
                && other.getFaceModelVersions().equals(this.getFaceModelVersions()) == false)
            return false;
        return true;
    }
}
