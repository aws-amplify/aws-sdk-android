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
 * Detects faces in the input image and adds them to the specified collection.
 * </p>
 * <p>
 * Amazon Rekognition does not save the actual faces detected. Instead, the
 * underlying detection algorithm first detects the faces in the input image,
 * and for each face extracts facial features into a feature vector, and stores
 * it in the back-end database. Amazon Rekognition uses feature vectors when
 * performing face match and search operations using the and operations.
 * </p>
 * <p>
 * If you are using version 1.0 of the face detection model,
 * <code>IndexFaces</code> indexes the 15 largest faces in the input image.
 * Later versions of the face detection model index the 100 largest faces in the
 * input image. To determine which version of the model you are using, check the
 * the value of <code>FaceModelVersion</code> in the response from
 * <code>IndexFaces</code>.
 * </p>
 * <p>
 * For more information, see Model Versioning in the Amazon Rekognition
 * Developer Guide.
 * </p>
 * <p>
 * If you provide the optional <code>ExternalImageID</code> for the input image
 * you provided, Amazon Rekognition associates this ID with all faces that it
 * detects. When you call the operation, the response returns the external ID.
 * You can use this external image ID to create a client-side index to associate
 * the faces with each image. You can then use the index to find all faces in an
 * image.
 * </p>
 * <p>
 * In response, the operation returns an array of metadata for all detected
 * faces. This includes, the bounding box of the detected face, confidence value
 * (indicating the bounding box contains a face), a face ID assigned by the
 * service for each face that is detected and stored, and an image ID assigned
 * by the service for the input image. If you request all facial attributes
 * (using the <code>detectionAttributes</code> parameter, Amazon Rekognition
 * returns detailed facial attributes such as facial landmarks (for example,
 * location of eye and mouth) and other facial attributes such gender. If you
 * provide the same image, specify the same collection, and use the same
 * external ID in the <code>IndexFaces</code> operation, Amazon Rekognition
 * doesn't save duplicate face metadata.
 * </p>
 * <p>
 * For more information, see Adding Faces to a Collection in the Amazon
 * Rekognition Developer Guide.
 * </p>
 * <p>
 * The input image is passed either as base64-encoded image bytes or as a
 * reference to an image in an Amazon S3 bucket. If you use the Amazon CLI to
 * call Amazon Rekognition operations, passing image bytes is not supported. The
 * image must be either a PNG or JPEG formatted file.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:IndexFaces</code> action.
 * </p>
 */
public class IndexFacesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of an existing collection to which you want to add the faces that
     * are detected in the input images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     */
    private String collectionId;

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing base64-encoded
     * image bytes is not supported.
     * </p>
     */
    private Image image;

    /**
     * <p>
     * ID you want to assign to all the faces detected in the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     */
    private String externalImageId;

    /**
     * <p>
     * An array of facial attributes that you want to be returned. This can be
     * the default list of attributes or all attributes. If you don't specify a
     * value for <code>Attributes</code> or if you specify
     * <code>["DEFAULT"]</code>, the API returns the following subset of facial
     * attributes: <code>BoundingBox</code>, <code>Confidence</code>,
     * <code>Pose</code>, <code>Quality</code> and <code>Landmarks</code>. If
     * you provide <code>["ALL"]</code>, all facial attributes are returned but
     * the operation will take longer to complete.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a
     * logical AND operator to determine which attributes to return (in this
     * case, all attributes).
     * </p>
     */
    private java.util.List<String> detectionAttributes;

    /**
     * Default constructor for IndexFacesRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     */
    public IndexFacesRequest() {
    }

    /**
     * Constructs a new IndexFacesRequest object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param collectionId <p>
     *            The ID of an existing collection to which you want to add the
     *            faces that are detected in the input images.
     *            </p>
     * @param image <p>
     *            The input image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes is not supported.
     *            </p>
     */
    public IndexFacesRequest(String collectionId, Image image) {
        setCollectionId(collectionId);
        setImage(image);
    }

    /**
     * <p>
     * The ID of an existing collection to which you want to add the faces that
     * are detected in the input images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @return <p>
     *         The ID of an existing collection to which you want to add the
     *         faces that are detected in the input images.
     *         </p>
     */
    public String getCollectionId() {
        return collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection to which you want to add the faces that
     * are detected in the input images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param collectionId <p>
     *            The ID of an existing collection to which you want to add the
     *            faces that are detected in the input images.
     *            </p>
     */
    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection to which you want to add the faces that
     * are detected in the input images.
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
     *            The ID of an existing collection to which you want to add the
     *            faces that are detected in the input images.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexFacesRequest withCollectionId(String collectionId) {
        this.collectionId = collectionId;
        return this;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing base64-encoded
     * image bytes is not supported.
     * </p>
     *
     * @return <p>
     *         The input image as base64-encoded bytes or an S3 object. If you
     *         use the AWS CLI to call Amazon Rekognition operations, passing
     *         base64-encoded image bytes is not supported.
     *         </p>
     */
    public Image getImage() {
        return image;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing base64-encoded
     * image bytes is not supported.
     * </p>
     *
     * @param image <p>
     *            The input image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes is not supported.
     *            </p>
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing base64-encoded
     * image bytes is not supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param image <p>
     *            The input image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes is not supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexFacesRequest withImage(Image image) {
        this.image = image;
        return this;
    }

    /**
     * <p>
     * ID you want to assign to all the faces detected in the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @return <p>
     *         ID you want to assign to all the faces detected in the image.
     *         </p>
     */
    public String getExternalImageId() {
        return externalImageId;
    }

    /**
     * <p>
     * ID you want to assign to all the faces detected in the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param externalImageId <p>
     *            ID you want to assign to all the faces detected in the image.
     *            </p>
     */
    public void setExternalImageId(String externalImageId) {
        this.externalImageId = externalImageId;
    }

    /**
     * <p>
     * ID you want to assign to all the faces detected in the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param externalImageId <p>
     *            ID you want to assign to all the faces detected in the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexFacesRequest withExternalImageId(String externalImageId) {
        this.externalImageId = externalImageId;
        return this;
    }

    /**
     * <p>
     * An array of facial attributes that you want to be returned. This can be
     * the default list of attributes or all attributes. If you don't specify a
     * value for <code>Attributes</code> or if you specify
     * <code>["DEFAULT"]</code>, the API returns the following subset of facial
     * attributes: <code>BoundingBox</code>, <code>Confidence</code>,
     * <code>Pose</code>, <code>Quality</code> and <code>Landmarks</code>. If
     * you provide <code>["ALL"]</code>, all facial attributes are returned but
     * the operation will take longer to complete.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a
     * logical AND operator to determine which attributes to return (in this
     * case, all attributes).
     * </p>
     *
     * @return <p>
     *         An array of facial attributes that you want to be returned. This
     *         can be the default list of attributes or all attributes. If you
     *         don't specify a value for <code>Attributes</code> or if you
     *         specify <code>["DEFAULT"]</code>, the API returns the following
     *         subset of facial attributes: <code>BoundingBox</code>,
     *         <code>Confidence</code>, <code>Pose</code>, <code>Quality</code>
     *         and <code>Landmarks</code>. If you provide <code>["ALL"]</code>,
     *         all facial attributes are returned but the operation will take
     *         longer to complete.
     *         </p>
     *         <p>
     *         If you provide both, <code>["ALL", "DEFAULT"]</code>, the service
     *         uses a logical AND operator to determine which attributes to
     *         return (in this case, all attributes).
     *         </p>
     */
    public java.util.List<String> getDetectionAttributes() {
        return detectionAttributes;
    }

    /**
     * <p>
     * An array of facial attributes that you want to be returned. This can be
     * the default list of attributes or all attributes. If you don't specify a
     * value for <code>Attributes</code> or if you specify
     * <code>["DEFAULT"]</code>, the API returns the following subset of facial
     * attributes: <code>BoundingBox</code>, <code>Confidence</code>,
     * <code>Pose</code>, <code>Quality</code> and <code>Landmarks</code>. If
     * you provide <code>["ALL"]</code>, all facial attributes are returned but
     * the operation will take longer to complete.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a
     * logical AND operator to determine which attributes to return (in this
     * case, all attributes).
     * </p>
     *
     * @param detectionAttributes <p>
     *            An array of facial attributes that you want to be returned.
     *            This can be the default list of attributes or all attributes.
     *            If you don't specify a value for <code>Attributes</code> or if
     *            you specify <code>["DEFAULT"]</code>, the API returns the
     *            following subset of facial attributes:
     *            <code>BoundingBox</code>, <code>Confidence</code>,
     *            <code>Pose</code>, <code>Quality</code> and
     *            <code>Landmarks</code>. If you provide <code>["ALL"]</code>,
     *            all facial attributes are returned but the operation will take
     *            longer to complete.
     *            </p>
     *            <p>
     *            If you provide both, <code>["ALL", "DEFAULT"]</code>, the
     *            service uses a logical AND operator to determine which
     *            attributes to return (in this case, all attributes).
     *            </p>
     */
    public void setDetectionAttributes(java.util.Collection<String> detectionAttributes) {
        if (detectionAttributes == null) {
            this.detectionAttributes = null;
            return;
        }

        this.detectionAttributes = new java.util.ArrayList<String>(detectionAttributes);
    }

    /**
     * <p>
     * An array of facial attributes that you want to be returned. This can be
     * the default list of attributes or all attributes. If you don't specify a
     * value for <code>Attributes</code> or if you specify
     * <code>["DEFAULT"]</code>, the API returns the following subset of facial
     * attributes: <code>BoundingBox</code>, <code>Confidence</code>,
     * <code>Pose</code>, <code>Quality</code> and <code>Landmarks</code>. If
     * you provide <code>["ALL"]</code>, all facial attributes are returned but
     * the operation will take longer to complete.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a
     * logical AND operator to determine which attributes to return (in this
     * case, all attributes).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectionAttributes <p>
     *            An array of facial attributes that you want to be returned.
     *            This can be the default list of attributes or all attributes.
     *            If you don't specify a value for <code>Attributes</code> or if
     *            you specify <code>["DEFAULT"]</code>, the API returns the
     *            following subset of facial attributes:
     *            <code>BoundingBox</code>, <code>Confidence</code>,
     *            <code>Pose</code>, <code>Quality</code> and
     *            <code>Landmarks</code>. If you provide <code>["ALL"]</code>,
     *            all facial attributes are returned but the operation will take
     *            longer to complete.
     *            </p>
     *            <p>
     *            If you provide both, <code>["ALL", "DEFAULT"]</code>, the
     *            service uses a logical AND operator to determine which
     *            attributes to return (in this case, all attributes).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexFacesRequest withDetectionAttributes(String... detectionAttributes) {
        if (getDetectionAttributes() == null) {
            this.detectionAttributes = new java.util.ArrayList<String>(detectionAttributes.length);
        }
        for (String value : detectionAttributes) {
            this.detectionAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of facial attributes that you want to be returned. This can be
     * the default list of attributes or all attributes. If you don't specify a
     * value for <code>Attributes</code> or if you specify
     * <code>["DEFAULT"]</code>, the API returns the following subset of facial
     * attributes: <code>BoundingBox</code>, <code>Confidence</code>,
     * <code>Pose</code>, <code>Quality</code> and <code>Landmarks</code>. If
     * you provide <code>["ALL"]</code>, all facial attributes are returned but
     * the operation will take longer to complete.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a
     * logical AND operator to determine which attributes to return (in this
     * case, all attributes).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectionAttributes <p>
     *            An array of facial attributes that you want to be returned.
     *            This can be the default list of attributes or all attributes.
     *            If you don't specify a value for <code>Attributes</code> or if
     *            you specify <code>["DEFAULT"]</code>, the API returns the
     *            following subset of facial attributes:
     *            <code>BoundingBox</code>, <code>Confidence</code>,
     *            <code>Pose</code>, <code>Quality</code> and
     *            <code>Landmarks</code>. If you provide <code>["ALL"]</code>,
     *            all facial attributes are returned but the operation will take
     *            longer to complete.
     *            </p>
     *            <p>
     *            If you provide both, <code>["ALL", "DEFAULT"]</code>, the
     *            service uses a logical AND operator to determine which
     *            attributes to return (in this case, all attributes).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexFacesRequest withDetectionAttributes(
            java.util.Collection<String> detectionAttributes) {
        setDetectionAttributes(detectionAttributes);
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
        if (getImage() != null)
            sb.append("Image: " + getImage() + ",");
        if (getExternalImageId() != null)
            sb.append("ExternalImageId: " + getExternalImageId() + ",");
        if (getDetectionAttributes() != null)
            sb.append("DetectionAttributes: " + getDetectionAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode
                + ((getExternalImageId() == null) ? 0 : getExternalImageId().hashCode());
        hashCode = prime * hashCode
                + ((getDetectionAttributes() == null) ? 0 : getDetectionAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IndexFacesRequest == false)
            return false;
        IndexFacesRequest other = (IndexFacesRequest) obj;

        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null
                && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getExternalImageId() == null ^ this.getExternalImageId() == null)
            return false;
        if (other.getExternalImageId() != null
                && other.getExternalImageId().equals(this.getExternalImageId()) == false)
            return false;
        if (other.getDetectionAttributes() == null ^ this.getDetectionAttributes() == null)
            return false;
        if (other.getDetectionAttributes() != null
                && other.getDetectionAttributes().equals(this.getDetectionAttributes()) == false)
            return false;
        return true;
    }
}
