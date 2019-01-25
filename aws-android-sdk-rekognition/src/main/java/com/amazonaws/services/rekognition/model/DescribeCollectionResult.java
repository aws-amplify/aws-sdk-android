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

public class DescribeCollectionResult implements Serializable {
    /**
     * The new value for the faceCount property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long faceCount;

    /**
     * The new value for the faceModelVersion property for this object.
     */
    private String faceModelVersion;

    /**
     * The new value for the collectionARN property for this object.
     */
    private String collectionARN;

    /**
     * The new value for the creationTimestamp property for this object.
     */
    private java.util.Date creationTimestamp;

    /**
     * Returns the value of the faceCount property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The value of the faceCount property for this object.
     */
    public Long getFaceCount() {
        return faceCount;
    }

    /**
     * Sets the value of faceCount
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param faceCount The new value for the faceCount property for this
     *            object.
     */
    public void setFaceCount(Long faceCount) {
        this.faceCount = faceCount;
    }

    /**
     * Sets the value of the faceCount property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param faceCount The new value for the faceCount property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCollectionResult withFaceCount(Long faceCount) {
        this.faceCount = faceCount;
        return this;
    }

    /**
     * Returns the value of the faceModelVersion property for this object.
     *
     * @return The value of the faceModelVersion property for this object.
     */
    public String getFaceModelVersion() {
        return faceModelVersion;
    }

    /**
     * Sets the value of faceModelVersion
     *
     * @param faceModelVersion The new value for the faceModelVersion property
     *            for this object.
     */
    public void setFaceModelVersion(String faceModelVersion) {
        this.faceModelVersion = faceModelVersion;
    }

    /**
     * Sets the value of the faceModelVersion property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceModelVersion The new value for the faceModelVersion property
     *            for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCollectionResult withFaceModelVersion(String faceModelVersion) {
        this.faceModelVersion = faceModelVersion;
        return this;
    }

    /**
     * Returns the value of the collectionARN property for this object.
     *
     * @return The value of the collectionARN property for this object.
     */
    public String getCollectionARN() {
        return collectionARN;
    }

    /**
     * Sets the value of collectionARN
     *
     * @param collectionARN The new value for the collectionARN property for
     *            this object.
     */
    public void setCollectionARN(String collectionARN) {
        this.collectionARN = collectionARN;
    }

    /**
     * Sets the value of the collectionARN property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param collectionARN The new value for the collectionARN property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCollectionResult withCollectionARN(String collectionARN) {
        this.collectionARN = collectionARN;
        return this;
    }

    /**
     * Returns the value of the creationTimestamp property for this object.
     *
     * @return The value of the creationTimestamp property for this object.
     */
    public java.util.Date getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * Sets the value of creationTimestamp
     *
     * @param creationTimestamp The new value for the creationTimestamp property
     *            for this object.
     */
    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * Sets the value of the creationTimestamp property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimestamp The new value for the creationTimestamp property
     *            for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCollectionResult withCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
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
        if (getFaceCount() != null)
            sb.append("FaceCount: " + getFaceCount() + ",");
        if (getFaceModelVersion() != null)
            sb.append("FaceModelVersion: " + getFaceModelVersion() + ",");
        if (getCollectionARN() != null)
            sb.append("CollectionARN: " + getCollectionARN() + ",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: " + getCreationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFaceCount() == null) ? 0 : getFaceCount().hashCode());
        hashCode = prime * hashCode
                + ((getFaceModelVersion() == null) ? 0 : getFaceModelVersion().hashCode());
        hashCode = prime * hashCode
                + ((getCollectionARN() == null) ? 0 : getCollectionARN().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCollectionResult == false)
            return false;
        DescribeCollectionResult other = (DescribeCollectionResult) obj;

        if (other.getFaceCount() == null ^ this.getFaceCount() == null)
            return false;
        if (other.getFaceCount() != null
                && other.getFaceCount().equals(this.getFaceCount()) == false)
            return false;
        if (other.getFaceModelVersion() == null ^ this.getFaceModelVersion() == null)
            return false;
        if (other.getFaceModelVersion() != null
                && other.getFaceModelVersion().equals(this.getFaceModelVersion()) == false)
            return false;
        if (other.getCollectionARN() == null ^ this.getCollectionARN() == null)
            return false;
        if (other.getCollectionARN() != null
                && other.getCollectionARN().equals(this.getCollectionARN()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null
                && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        return true;
    }
}
