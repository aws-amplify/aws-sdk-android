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

public class CreateCollectionResult implements Serializable {
    /**
     * <p>
     * HTTP status code indicating the result of the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer statusCode;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the collection. You can use this to manage
     * permissions on your resources.
     * </p>
     */
    private String collectionArn;

    /**
     * <p>
     * Version number of the face detection model associated with the collection
     * you are creating.
     * </p>
     */
    private String faceModelVersion;

    /**
     * <p>
     * HTTP status code indicating the result of the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         HTTP status code indicating the result of the operation.
     *         </p>
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * <p>
     * HTTP status code indicating the result of the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param statusCode <p>
     *            HTTP status code indicating the result of the operation.
     *            </p>
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * HTTP status code indicating the result of the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param statusCode <p>
     *            HTTP status code indicating the result of the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCollectionResult withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the collection. You can use this to manage
     * permissions on your resources.
     * </p>
     *
     * @return <p>
     *         Amazon Resource Name (ARN) of the collection. You can use this to
     *         manage permissions on your resources.
     *         </p>
     */
    public String getCollectionArn() {
        return collectionArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the collection. You can use this to manage
     * permissions on your resources.
     * </p>
     *
     * @param collectionArn <p>
     *            Amazon Resource Name (ARN) of the collection. You can use this
     *            to manage permissions on your resources.
     *            </p>
     */
    public void setCollectionArn(String collectionArn) {
        this.collectionArn = collectionArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the collection. You can use this to manage
     * permissions on your resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param collectionArn <p>
     *            Amazon Resource Name (ARN) of the collection. You can use this
     *            to manage permissions on your resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCollectionResult withCollectionArn(String collectionArn) {
        this.collectionArn = collectionArn;
        return this;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the collection
     * you are creating.
     * </p>
     *
     * @return <p>
     *         Version number of the face detection model associated with the
     *         collection you are creating.
     *         </p>
     */
    public String getFaceModelVersion() {
        return faceModelVersion;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the collection
     * you are creating.
     * </p>
     *
     * @param faceModelVersion <p>
     *            Version number of the face detection model associated with the
     *            collection you are creating.
     *            </p>
     */
    public void setFaceModelVersion(String faceModelVersion) {
        this.faceModelVersion = faceModelVersion;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the collection
     * you are creating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceModelVersion <p>
     *            Version number of the face detection model associated with the
     *            collection you are creating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCollectionResult withFaceModelVersion(String faceModelVersion) {
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
        if (getStatusCode() != null)
            sb.append("StatusCode: " + getStatusCode() + ",");
        if (getCollectionArn() != null)
            sb.append("CollectionArn: " + getCollectionArn() + ",");
        if (getFaceModelVersion() != null)
            sb.append("FaceModelVersion: " + getFaceModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode
                + ((getCollectionArn() == null) ? 0 : getCollectionArn().hashCode());
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

        if (obj instanceof CreateCollectionResult == false)
            return false;
        CreateCollectionResult other = (CreateCollectionResult) obj;

        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null
                && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getCollectionArn() == null ^ this.getCollectionArn() == null)
            return false;
        if (other.getCollectionArn() != null
                && other.getCollectionArn().equals(this.getCollectionArn()) == false)
            return false;
        if (other.getFaceModelVersion() == null ^ this.getFaceModelVersion() == null)
            return false;
        if (other.getFaceModelVersion() != null
                && other.getFaceModelVersion().equals(this.getFaceModelVersion()) == false)
            return false;
        return true;
    }
}
