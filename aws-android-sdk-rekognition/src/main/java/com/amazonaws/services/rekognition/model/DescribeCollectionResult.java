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
     * <p>
     * The number of faces that are indexed into the collection. To index faces
     * into a collection, use <a>IndexFaces</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long faceCount;

    /**
     * <p>
     * The version of the face model that's used by the collection for face
     * detection.
     * </p>
     * <p>
     * For more information, see Model Versioning in the Amazon Rekognition
     * Developer Guide.
     * </p>
     */
    private String faceModelVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collection.
     * </p>
     */
    private String collectionARN;

    /**
     * <p>
     * The number of milliseconds since the Unix epoch time until the creation
     * of the collection. The Unix epoch time is 00:00:00 Coordinated Universal
     * Time (UTC), Thursday, 1 January 1970.
     * </p>
     */
    private java.util.Date creationTimestamp;

    /**
     * <p>
     * The number of faces that are indexed into the collection. To index faces
     * into a collection, use <a>IndexFaces</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of faces that are indexed into the collection. To
     *         index faces into a collection, use <a>IndexFaces</a>.
     *         </p>
     */
    public Long getFaceCount() {
        return faceCount;
    }

    /**
     * <p>
     * The number of faces that are indexed into the collection. To index faces
     * into a collection, use <a>IndexFaces</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param faceCount <p>
     *            The number of faces that are indexed into the collection. To
     *            index faces into a collection, use <a>IndexFaces</a>.
     *            </p>
     */
    public void setFaceCount(Long faceCount) {
        this.faceCount = faceCount;
    }

    /**
     * <p>
     * The number of faces that are indexed into the collection. To index faces
     * into a collection, use <a>IndexFaces</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param faceCount <p>
     *            The number of faces that are indexed into the collection. To
     *            index faces into a collection, use <a>IndexFaces</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCollectionResult withFaceCount(Long faceCount) {
        this.faceCount = faceCount;
        return this;
    }

    /**
     * <p>
     * The version of the face model that's used by the collection for face
     * detection.
     * </p>
     * <p>
     * For more information, see Model Versioning in the Amazon Rekognition
     * Developer Guide.
     * </p>
     *
     * @return <p>
     *         The version of the face model that's used by the collection for
     *         face detection.
     *         </p>
     *         <p>
     *         For more information, see Model Versioning in the Amazon
     *         Rekognition Developer Guide.
     *         </p>
     */
    public String getFaceModelVersion() {
        return faceModelVersion;
    }

    /**
     * <p>
     * The version of the face model that's used by the collection for face
     * detection.
     * </p>
     * <p>
     * For more information, see Model Versioning in the Amazon Rekognition
     * Developer Guide.
     * </p>
     *
     * @param faceModelVersion <p>
     *            The version of the face model that's used by the collection
     *            for face detection.
     *            </p>
     *            <p>
     *            For more information, see Model Versioning in the Amazon
     *            Rekognition Developer Guide.
     *            </p>
     */
    public void setFaceModelVersion(String faceModelVersion) {
        this.faceModelVersion = faceModelVersion;
    }

    /**
     * <p>
     * The version of the face model that's used by the collection for face
     * detection.
     * </p>
     * <p>
     * For more information, see Model Versioning in the Amazon Rekognition
     * Developer Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceModelVersion <p>
     *            The version of the face model that's used by the collection
     *            for face detection.
     *            </p>
     *            <p>
     *            For more information, see Model Versioning in the Amazon
     *            Rekognition Developer Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCollectionResult withFaceModelVersion(String faceModelVersion) {
        this.faceModelVersion = faceModelVersion;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collection.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the collection.
     *         </p>
     */
    public String getCollectionARN() {
        return collectionARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collection.
     * </p>
     *
     * @param collectionARN <p>
     *            The Amazon Resource Name (ARN) of the collection.
     *            </p>
     */
    public void setCollectionARN(String collectionARN) {
        this.collectionARN = collectionARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param collectionARN <p>
     *            The Amazon Resource Name (ARN) of the collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCollectionResult withCollectionARN(String collectionARN) {
        this.collectionARN = collectionARN;
        return this;
    }

    /**
     * <p>
     * The number of milliseconds since the Unix epoch time until the creation
     * of the collection. The Unix epoch time is 00:00:00 Coordinated Universal
     * Time (UTC), Thursday, 1 January 1970.
     * </p>
     *
     * @return <p>
     *         The number of milliseconds since the Unix epoch time until the
     *         creation of the collection. The Unix epoch time is 00:00:00
     *         Coordinated Universal Time (UTC), Thursday, 1 January 1970.
     *         </p>
     */
    public java.util.Date getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * <p>
     * The number of milliseconds since the Unix epoch time until the creation
     * of the collection. The Unix epoch time is 00:00:00 Coordinated Universal
     * Time (UTC), Thursday, 1 January 1970.
     * </p>
     *
     * @param creationTimestamp <p>
     *            The number of milliseconds since the Unix epoch time until the
     *            creation of the collection. The Unix epoch time is 00:00:00
     *            Coordinated Universal Time (UTC), Thursday, 1 January 1970.
     *            </p>
     */
    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The number of milliseconds since the Unix epoch time until the creation
     * of the collection. The Unix epoch time is 00:00:00 Coordinated Universal
     * Time (UTC), Thursday, 1 January 1970.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimestamp <p>
     *            The number of milliseconds since the Unix epoch time until the
     *            creation of the collection. The Unix epoch time is 00:00:00
     *            Coordinated Universal Time (UTC), Thursday, 1 January 1970.
     *            </p>
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
