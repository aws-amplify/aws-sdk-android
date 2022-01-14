/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Amazon Rekognition doesn't save the actual faces that are detected. Instead,
 * the underlying detection algorithm first detects the faces in the input
 * image. For each face, the algorithm extracts facial features into a feature
 * vector, and stores it in the backend database. Amazon Rekognition uses
 * feature vectors when it performs face match and search operations using the
 * <a>SearchFaces</a> and <a>SearchFacesByImage</a> operations.
 * </p>
 * <p>
 * For more information, see Adding Faces to a Collection in the Amazon
 * Rekognition Developer Guide.
 * </p>
 * <p>
 * To get the number of faces in a collection, call <a>DescribeCollection</a>.
 * </p>
 * <p>
 * If you're using version 1.0 of the face detection model,
 * <code>IndexFaces</code> indexes the 15 largest faces in the input image.
 * Later versions of the face detection model index the 100 largest faces in the
 * input image.
 * </p>
 * <p>
 * If you're using version 4 or later of the face model, image orientation
 * information is not returned in the <code>OrientationCorrection</code> field.
 * </p>
 * <p>
 * To determine which version of the model you're using, call
 * <a>DescribeCollection</a> and supply the collection ID. You can also get the
 * model version from the value of <code>FaceModelVersion</code> in the response
 * from <code>IndexFaces</code>
 * </p>
 * <p>
 * For more information, see Model Versioning in the Amazon Rekognition
 * Developer Guide.
 * </p>
 * <p>
 * If you provide the optional <code>ExternalImageId</code> for the input image
 * you provided, Amazon Rekognition associates this ID with all faces that it
 * detects. When you call the <a>ListFaces</a> operation, the response returns
 * the external ID. You can use this external image ID to create a client-side
 * index to associate the faces with each image. You can then use the index to
 * find all faces in an image.
 * </p>
 * <p>
 * You can specify the maximum number of faces to index with the
 * <code>MaxFaces</code> input parameter. This is useful when you want to index
 * the largest faces in an image and don't want to index smaller faces, such as
 * those belonging to people standing in the background.
 * </p>
 * <p>
 * The <code>QualityFilter</code> input parameter allows you to filter out
 * detected faces that don’t meet a required quality bar. The quality bar is
 * based on a variety of common use cases. By default, <code>IndexFaces</code>
 * chooses the quality bar that's used to filter faces. You can also explicitly
 * choose the quality bar. Use <code>QualityFilter</code>, to set the quality
 * bar by specifying <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>
 * . If you do not want to filter detected faces, specify <code>NONE</code>.
 * </p>
 * <note>
 * <p>
 * To use quality filtering, you need a collection associated with version 3 of
 * the face model or higher. To get the version of the face model associated
 * with a collection, call <a>DescribeCollection</a>.
 * </p>
 * </note>
 * <p>
 * Information about faces detected in an image, but not indexed, is returned in
 * an array of <a>UnindexedFace</a> objects, <code>UnindexedFaces</code>. Faces
 * aren't indexed for reasons such as:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The number of faces detected exceeds the value of the <code>MaxFaces</code>
 * request parameter.
 * </p>
 * </li>
 * <li>
 * <p>
 * The face is too small compared to the image dimensions.
 * </p>
 * </li>
 * <li>
 * <p>
 * The face is too blurry.
 * </p>
 * </li>
 * <li>
 * <p>
 * The image is too dark.
 * </p>
 * </li>
 * <li>
 * <p>
 * The face has an extreme pose.
 * </p>
 * </li>
 * <li>
 * <p>
 * The face doesn’t have enough detail to be suitable for face search.
 * </p>
 * </li>
 * </ul>
 * <p>
 * In response, the <code>IndexFaces</code> operation returns an array of
 * metadata for all detected faces, <code>FaceRecords</code>. This includes:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The bounding box, <code>BoundingBox</code>, of the detected face.
 * </p>
 * </li>
 * <li>
 * <p>
 * A confidence value, <code>Confidence</code>, which indicates the confidence
 * that the bounding box contains a face.
 * </p>
 * </li>
 * <li>
 * <p>
 * A face ID, <code>FaceId</code>, assigned by the service for each face that's
 * detected and stored.
 * </p>
 * </li>
 * <li>
 * <p>
 * An image ID, <code>ImageId</code>, assigned by the service for the input
 * image.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you request all facial attributes (by using the
 * <code>detectionAttributes</code> parameter), Amazon Rekognition returns
 * detailed facial attributes, such as facial landmarks (for example, location
 * of eye and mouth) and other facial attributes. If you provide the same image,
 * specify the same collection, use the same external ID, and use the same model
 * version in the <code>IndexFaces</code> operation, Amazon Rekognition doesn't
 * save duplicate face metadata.
 * </p>
 * <p/>
 * <p>
 * The input image is passed either as base64-encoded image bytes, or as a
 * reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call
 * Amazon Rekognition operations, passing image bytes isn't supported. The image
 * must be formatted as a PNG or JPEG file.
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
     * image bytes isn't supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not
     * need to base64-encode image bytes passed using the <code>Bytes</code>
     * field. For more information, see Images in the Amazon Rekognition
     * developer guide.
     * </p>
     */
    private Image image;

    /**
     * <p>
     * The ID you want to assign to all the faces detected in the image.
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
     * <code>Pose</code>, <code>Quality</code>, and <code>Landmarks</code>. If
     * you provide <code>["ALL"]</code>, all facial attributes are returned, but
     * the operation takes longer to complete.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a
     * logical AND operator to determine which attributes to return (in this
     * case, all attributes).
     * </p>
     */
    private java.util.List<String> detectionAttributes;

    /**
     * <p>
     * The maximum number of faces to index. The value of <code>MaxFaces</code>
     * must be greater than or equal to 1. <code>IndexFaces</code> returns no
     * more than 100 detected faces in an image, even if you specify a larger
     * value for <code>MaxFaces</code>.
     * </p>
     * <p>
     * If <code>IndexFaces</code> detects more faces than the value of
     * <code>MaxFaces</code>, the faces with the lowest quality are filtered out
     * first. If there are still more faces than the value of
     * <code>MaxFaces</code>, the faces with the smallest bounding boxes are
     * filtered out (up to the number that's needed to satisfy the value of
     * <code>MaxFaces</code>). Information about the unindexed faces is
     * available in the <code>UnindexedFaces</code> array.
     * </p>
     * <p>
     * The faces that are returned by <code>IndexFaces</code> are sorted by the
     * largest face bounding box size to the smallest size, in descending order.
     * </p>
     * <p>
     * <code>MaxFaces</code> can be used with a collection associated with any
     * version of the face model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxFaces;

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to
     * identify faces. Filtered faces aren't indexed. If you specify
     * <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you
     * specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>,
     * filtering removes all faces that don’t meet the chosen quality bar. The
     * default value is <code>AUTO</code>. The quality bar is based on a variety
     * of common use cases. Low-quality detections can occur for a number of
     * reasons. Some examples are an object that's misidentified as a face, a
     * face that's too blurry, or a face with a pose that's too extreme to use.
     * If you specify <code>NONE</code>, no filtering is performed.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated
     * with version 3 of the face model or higher.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AUTO, LOW, MEDIUM, HIGH
     */
    private String qualityFilter;

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
     *            passing base64-encoded image bytes isn't supported.
     *            </p>
     *            <p>
     *            If you are using an AWS SDK to call Amazon Rekognition, you
     *            might not need to base64-encode image bytes passed using the
     *            <code>Bytes</code> field. For more information, see Images in
     *            the Amazon Rekognition developer guide.
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
     * image bytes isn't supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not
     * need to base64-encode image bytes passed using the <code>Bytes</code>
     * field. For more information, see Images in the Amazon Rekognition
     * developer guide.
     * </p>
     *
     * @return <p>
     *         The input image as base64-encoded bytes or an S3 object. If you
     *         use the AWS CLI to call Amazon Rekognition operations, passing
     *         base64-encoded image bytes isn't supported.
     *         </p>
     *         <p>
     *         If you are using an AWS SDK to call Amazon Rekognition, you might
     *         not need to base64-encode image bytes passed using the
     *         <code>Bytes</code> field. For more information, see Images in the
     *         Amazon Rekognition developer guide.
     *         </p>
     */
    public Image getImage() {
        return image;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing base64-encoded
     * image bytes isn't supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not
     * need to base64-encode image bytes passed using the <code>Bytes</code>
     * field. For more information, see Images in the Amazon Rekognition
     * developer guide.
     * </p>
     *
     * @param image <p>
     *            The input image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes isn't supported.
     *            </p>
     *            <p>
     *            If you are using an AWS SDK to call Amazon Rekognition, you
     *            might not need to base64-encode image bytes passed using the
     *            <code>Bytes</code> field. For more information, see Images in
     *            the Amazon Rekognition developer guide.
     *            </p>
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing base64-encoded
     * image bytes isn't supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not
     * need to base64-encode image bytes passed using the <code>Bytes</code>
     * field. For more information, see Images in the Amazon Rekognition
     * developer guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param image <p>
     *            The input image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes isn't supported.
     *            </p>
     *            <p>
     *            If you are using an AWS SDK to call Amazon Rekognition, you
     *            might not need to base64-encode image bytes passed using the
     *            <code>Bytes</code> field. For more information, see Images in
     *            the Amazon Rekognition developer guide.
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
     * The ID you want to assign to all the faces detected in the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @return <p>
     *         The ID you want to assign to all the faces detected in the image.
     *         </p>
     */
    public String getExternalImageId() {
        return externalImageId;
    }

    /**
     * <p>
     * The ID you want to assign to all the faces detected in the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param externalImageId <p>
     *            The ID you want to assign to all the faces detected in the
     *            image.
     *            </p>
     */
    public void setExternalImageId(String externalImageId) {
        this.externalImageId = externalImageId;
    }

    /**
     * <p>
     * The ID you want to assign to all the faces detected in the image.
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
     *            The ID you want to assign to all the faces detected in the
     *            image.
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
     * <code>Pose</code>, <code>Quality</code>, and <code>Landmarks</code>. If
     * you provide <code>["ALL"]</code>, all facial attributes are returned, but
     * the operation takes longer to complete.
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
     *         <code>Confidence</code>, <code>Pose</code>, <code>Quality</code>,
     *         and <code>Landmarks</code>. If you provide <code>["ALL"]</code>,
     *         all facial attributes are returned, but the operation takes
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
     * <code>Pose</code>, <code>Quality</code>, and <code>Landmarks</code>. If
     * you provide <code>["ALL"]</code>, all facial attributes are returned, but
     * the operation takes longer to complete.
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
     *            <code>Pose</code>, <code>Quality</code>, and
     *            <code>Landmarks</code>. If you provide <code>["ALL"]</code>,
     *            all facial attributes are returned, but the operation takes
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
     * <code>Pose</code>, <code>Quality</code>, and <code>Landmarks</code>. If
     * you provide <code>["ALL"]</code>, all facial attributes are returned, but
     * the operation takes longer to complete.
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
     *            <code>Pose</code>, <code>Quality</code>, and
     *            <code>Landmarks</code>. If you provide <code>["ALL"]</code>,
     *            all facial attributes are returned, but the operation takes
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
     * <code>Pose</code>, <code>Quality</code>, and <code>Landmarks</code>. If
     * you provide <code>["ALL"]</code>, all facial attributes are returned, but
     * the operation takes longer to complete.
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
     *            <code>Pose</code>, <code>Quality</code>, and
     *            <code>Landmarks</code>. If you provide <code>["ALL"]</code>,
     *            all facial attributes are returned, but the operation takes
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
     * <p>
     * The maximum number of faces to index. The value of <code>MaxFaces</code>
     * must be greater than or equal to 1. <code>IndexFaces</code> returns no
     * more than 100 detected faces in an image, even if you specify a larger
     * value for <code>MaxFaces</code>.
     * </p>
     * <p>
     * If <code>IndexFaces</code> detects more faces than the value of
     * <code>MaxFaces</code>, the faces with the lowest quality are filtered out
     * first. If there are still more faces than the value of
     * <code>MaxFaces</code>, the faces with the smallest bounding boxes are
     * filtered out (up to the number that's needed to satisfy the value of
     * <code>MaxFaces</code>). Information about the unindexed faces is
     * available in the <code>UnindexedFaces</code> array.
     * </p>
     * <p>
     * The faces that are returned by <code>IndexFaces</code> are sorted by the
     * largest face bounding box size to the smallest size, in descending order.
     * </p>
     * <p>
     * <code>MaxFaces</code> can be used with a collection associated with any
     * version of the face model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of faces to index. The value of
     *         <code>MaxFaces</code> must be greater than or equal to 1.
     *         <code>IndexFaces</code> returns no more than 100 detected faces
     *         in an image, even if you specify a larger value for
     *         <code>MaxFaces</code>.
     *         </p>
     *         <p>
     *         If <code>IndexFaces</code> detects more faces than the value of
     *         <code>MaxFaces</code>, the faces with the lowest quality are
     *         filtered out first. If there are still more faces than the value
     *         of <code>MaxFaces</code>, the faces with the smallest bounding
     *         boxes are filtered out (up to the number that's needed to satisfy
     *         the value of <code>MaxFaces</code>). Information about the
     *         unindexed faces is available in the <code>UnindexedFaces</code>
     *         array.
     *         </p>
     *         <p>
     *         The faces that are returned by <code>IndexFaces</code> are sorted
     *         by the largest face bounding box size to the smallest size, in
     *         descending order.
     *         </p>
     *         <p>
     *         <code>MaxFaces</code> can be used with a collection associated
     *         with any version of the face model.
     *         </p>
     */
    public Integer getMaxFaces() {
        return maxFaces;
    }

    /**
     * <p>
     * The maximum number of faces to index. The value of <code>MaxFaces</code>
     * must be greater than or equal to 1. <code>IndexFaces</code> returns no
     * more than 100 detected faces in an image, even if you specify a larger
     * value for <code>MaxFaces</code>.
     * </p>
     * <p>
     * If <code>IndexFaces</code> detects more faces than the value of
     * <code>MaxFaces</code>, the faces with the lowest quality are filtered out
     * first. If there are still more faces than the value of
     * <code>MaxFaces</code>, the faces with the smallest bounding boxes are
     * filtered out (up to the number that's needed to satisfy the value of
     * <code>MaxFaces</code>). Information about the unindexed faces is
     * available in the <code>UnindexedFaces</code> array.
     * </p>
     * <p>
     * The faces that are returned by <code>IndexFaces</code> are sorted by the
     * largest face bounding box size to the smallest size, in descending order.
     * </p>
     * <p>
     * <code>MaxFaces</code> can be used with a collection associated with any
     * version of the face model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxFaces <p>
     *            The maximum number of faces to index. The value of
     *            <code>MaxFaces</code> must be greater than or equal to 1.
     *            <code>IndexFaces</code> returns no more than 100 detected
     *            faces in an image, even if you specify a larger value for
     *            <code>MaxFaces</code>.
     *            </p>
     *            <p>
     *            If <code>IndexFaces</code> detects more faces than the value
     *            of <code>MaxFaces</code>, the faces with the lowest quality
     *            are filtered out first. If there are still more faces than the
     *            value of <code>MaxFaces</code>, the faces with the smallest
     *            bounding boxes are filtered out (up to the number that's
     *            needed to satisfy the value of <code>MaxFaces</code>).
     *            Information about the unindexed faces is available in the
     *            <code>UnindexedFaces</code> array.
     *            </p>
     *            <p>
     *            The faces that are returned by <code>IndexFaces</code> are
     *            sorted by the largest face bounding box size to the smallest
     *            size, in descending order.
     *            </p>
     *            <p>
     *            <code>MaxFaces</code> can be used with a collection associated
     *            with any version of the face model.
     *            </p>
     */
    public void setMaxFaces(Integer maxFaces) {
        this.maxFaces = maxFaces;
    }

    /**
     * <p>
     * The maximum number of faces to index. The value of <code>MaxFaces</code>
     * must be greater than or equal to 1. <code>IndexFaces</code> returns no
     * more than 100 detected faces in an image, even if you specify a larger
     * value for <code>MaxFaces</code>.
     * </p>
     * <p>
     * If <code>IndexFaces</code> detects more faces than the value of
     * <code>MaxFaces</code>, the faces with the lowest quality are filtered out
     * first. If there are still more faces than the value of
     * <code>MaxFaces</code>, the faces with the smallest bounding boxes are
     * filtered out (up to the number that's needed to satisfy the value of
     * <code>MaxFaces</code>). Information about the unindexed faces is
     * available in the <code>UnindexedFaces</code> array.
     * </p>
     * <p>
     * The faces that are returned by <code>IndexFaces</code> are sorted by the
     * largest face bounding box size to the smallest size, in descending order.
     * </p>
     * <p>
     * <code>MaxFaces</code> can be used with a collection associated with any
     * version of the face model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxFaces <p>
     *            The maximum number of faces to index. The value of
     *            <code>MaxFaces</code> must be greater than or equal to 1.
     *            <code>IndexFaces</code> returns no more than 100 detected
     *            faces in an image, even if you specify a larger value for
     *            <code>MaxFaces</code>.
     *            </p>
     *            <p>
     *            If <code>IndexFaces</code> detects more faces than the value
     *            of <code>MaxFaces</code>, the faces with the lowest quality
     *            are filtered out first. If there are still more faces than the
     *            value of <code>MaxFaces</code>, the faces with the smallest
     *            bounding boxes are filtered out (up to the number that's
     *            needed to satisfy the value of <code>MaxFaces</code>).
     *            Information about the unindexed faces is available in the
     *            <code>UnindexedFaces</code> array.
     *            </p>
     *            <p>
     *            The faces that are returned by <code>IndexFaces</code> are
     *            sorted by the largest face bounding box size to the smallest
     *            size, in descending order.
     *            </p>
     *            <p>
     *            <code>MaxFaces</code> can be used with a collection associated
     *            with any version of the face model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexFacesRequest withMaxFaces(Integer maxFaces) {
        this.maxFaces = maxFaces;
        return this;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to
     * identify faces. Filtered faces aren't indexed. If you specify
     * <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you
     * specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>,
     * filtering removes all faces that don’t meet the chosen quality bar. The
     * default value is <code>AUTO</code>. The quality bar is based on a variety
     * of common use cases. Low-quality detections can occur for a number of
     * reasons. Some examples are an object that's misidentified as a face, a
     * face that's too blurry, or a face with a pose that's too extreme to use.
     * If you specify <code>NONE</code>, no filtering is performed.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated
     * with version 3 of the face model or higher.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AUTO, LOW, MEDIUM, HIGH
     *
     * @return <p>
     *         A filter that specifies a quality bar for how much filtering is
     *         done to identify faces. Filtered faces aren't indexed. If you
     *         specify <code>AUTO</code>, Amazon Rekognition chooses the quality
     *         bar. If you specify <code>LOW</code>, <code>MEDIUM</code>, or
     *         <code>HIGH</code>, filtering removes all faces that don’t meet
     *         the chosen quality bar. The default value is <code>AUTO</code>.
     *         The quality bar is based on a variety of common use cases.
     *         Low-quality detections can occur for a number of reasons. Some
     *         examples are an object that's misidentified as a face, a face
     *         that's too blurry, or a face with a pose that's too extreme to
     *         use. If you specify <code>NONE</code>, no filtering is performed.
     *         </p>
     *         <p>
     *         To use quality filtering, the collection you are using must be
     *         associated with version 3 of the face model or higher.
     *         </p>
     * @see QualityFilter
     */
    public String getQualityFilter() {
        return qualityFilter;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to
     * identify faces. Filtered faces aren't indexed. If you specify
     * <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you
     * specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>,
     * filtering removes all faces that don’t meet the chosen quality bar. The
     * default value is <code>AUTO</code>. The quality bar is based on a variety
     * of common use cases. Low-quality detections can occur for a number of
     * reasons. Some examples are an object that's misidentified as a face, a
     * face that's too blurry, or a face with a pose that's too extreme to use.
     * If you specify <code>NONE</code>, no filtering is performed.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated
     * with version 3 of the face model or higher.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AUTO, LOW, MEDIUM, HIGH
     *
     * @param qualityFilter <p>
     *            A filter that specifies a quality bar for how much filtering
     *            is done to identify faces. Filtered faces aren't indexed. If
     *            you specify <code>AUTO</code>, Amazon Rekognition chooses the
     *            quality bar. If you specify <code>LOW</code>,
     *            <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes
     *            all faces that don’t meet the chosen quality bar. The default
     *            value is <code>AUTO</code>. The quality bar is based on a
     *            variety of common use cases. Low-quality detections can occur
     *            for a number of reasons. Some examples are an object that's
     *            misidentified as a face, a face that's too blurry, or a face
     *            with a pose that's too extreme to use. If you specify
     *            <code>NONE</code>, no filtering is performed.
     *            </p>
     *            <p>
     *            To use quality filtering, the collection you are using must be
     *            associated with version 3 of the face model or higher.
     *            </p>
     * @see QualityFilter
     */
    public void setQualityFilter(String qualityFilter) {
        this.qualityFilter = qualityFilter;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to
     * identify faces. Filtered faces aren't indexed. If you specify
     * <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you
     * specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>,
     * filtering removes all faces that don’t meet the chosen quality bar. The
     * default value is <code>AUTO</code>. The quality bar is based on a variety
     * of common use cases. Low-quality detections can occur for a number of
     * reasons. Some examples are an object that's misidentified as a face, a
     * face that's too blurry, or a face with a pose that's too extreme to use.
     * If you specify <code>NONE</code>, no filtering is performed.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated
     * with version 3 of the face model or higher.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AUTO, LOW, MEDIUM, HIGH
     *
     * @param qualityFilter <p>
     *            A filter that specifies a quality bar for how much filtering
     *            is done to identify faces. Filtered faces aren't indexed. If
     *            you specify <code>AUTO</code>, Amazon Rekognition chooses the
     *            quality bar. If you specify <code>LOW</code>,
     *            <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes
     *            all faces that don’t meet the chosen quality bar. The default
     *            value is <code>AUTO</code>. The quality bar is based on a
     *            variety of common use cases. Low-quality detections can occur
     *            for a number of reasons. Some examples are an object that's
     *            misidentified as a face, a face that's too blurry, or a face
     *            with a pose that's too extreme to use. If you specify
     *            <code>NONE</code>, no filtering is performed.
     *            </p>
     *            <p>
     *            To use quality filtering, the collection you are using must be
     *            associated with version 3 of the face model or higher.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QualityFilter
     */
    public IndexFacesRequest withQualityFilter(String qualityFilter) {
        this.qualityFilter = qualityFilter;
        return this;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to
     * identify faces. Filtered faces aren't indexed. If you specify
     * <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you
     * specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>,
     * filtering removes all faces that don’t meet the chosen quality bar. The
     * default value is <code>AUTO</code>. The quality bar is based on a variety
     * of common use cases. Low-quality detections can occur for a number of
     * reasons. Some examples are an object that's misidentified as a face, a
     * face that's too blurry, or a face with a pose that's too extreme to use.
     * If you specify <code>NONE</code>, no filtering is performed.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated
     * with version 3 of the face model or higher.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AUTO, LOW, MEDIUM, HIGH
     *
     * @param qualityFilter <p>
     *            A filter that specifies a quality bar for how much filtering
     *            is done to identify faces. Filtered faces aren't indexed. If
     *            you specify <code>AUTO</code>, Amazon Rekognition chooses the
     *            quality bar. If you specify <code>LOW</code>,
     *            <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes
     *            all faces that don’t meet the chosen quality bar. The default
     *            value is <code>AUTO</code>. The quality bar is based on a
     *            variety of common use cases. Low-quality detections can occur
     *            for a number of reasons. Some examples are an object that's
     *            misidentified as a face, a face that's too blurry, or a face
     *            with a pose that's too extreme to use. If you specify
     *            <code>NONE</code>, no filtering is performed.
     *            </p>
     *            <p>
     *            To use quality filtering, the collection you are using must be
     *            associated with version 3 of the face model or higher.
     *            </p>
     * @see QualityFilter
     */
    public void setQualityFilter(QualityFilter qualityFilter) {
        this.qualityFilter = qualityFilter.toString();
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to
     * identify faces. Filtered faces aren't indexed. If you specify
     * <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you
     * specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>,
     * filtering removes all faces that don’t meet the chosen quality bar. The
     * default value is <code>AUTO</code>. The quality bar is based on a variety
     * of common use cases. Low-quality detections can occur for a number of
     * reasons. Some examples are an object that's misidentified as a face, a
     * face that's too blurry, or a face with a pose that's too extreme to use.
     * If you specify <code>NONE</code>, no filtering is performed.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated
     * with version 3 of the face model or higher.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AUTO, LOW, MEDIUM, HIGH
     *
     * @param qualityFilter <p>
     *            A filter that specifies a quality bar for how much filtering
     *            is done to identify faces. Filtered faces aren't indexed. If
     *            you specify <code>AUTO</code>, Amazon Rekognition chooses the
     *            quality bar. If you specify <code>LOW</code>,
     *            <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes
     *            all faces that don’t meet the chosen quality bar. The default
     *            value is <code>AUTO</code>. The quality bar is based on a
     *            variety of common use cases. Low-quality detections can occur
     *            for a number of reasons. Some examples are an object that's
     *            misidentified as a face, a face that's too blurry, or a face
     *            with a pose that's too extreme to use. If you specify
     *            <code>NONE</code>, no filtering is performed.
     *            </p>
     *            <p>
     *            To use quality filtering, the collection you are using must be
     *            associated with version 3 of the face model or higher.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QualityFilter
     */
    public IndexFacesRequest withQualityFilter(QualityFilter qualityFilter) {
        this.qualityFilter = qualityFilter.toString();
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
            sb.append("DetectionAttributes: " + getDetectionAttributes() + ",");
        if (getMaxFaces() != null)
            sb.append("MaxFaces: " + getMaxFaces() + ",");
        if (getQualityFilter() != null)
            sb.append("QualityFilter: " + getQualityFilter());
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
        hashCode = prime * hashCode + ((getMaxFaces() == null) ? 0 : getMaxFaces().hashCode());
        hashCode = prime * hashCode
                + ((getQualityFilter() == null) ? 0 : getQualityFilter().hashCode());
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
        if (other.getMaxFaces() == null ^ this.getMaxFaces() == null)
            return false;
        if (other.getMaxFaces() != null && other.getMaxFaces().equals(this.getMaxFaces()) == false)
            return false;
        if (other.getQualityFilter() == null ^ this.getQualityFilter() == null)
            return false;
        if (other.getQualityFilter() != null
                && other.getQualityFilter().equals(this.getQualityFilter()) == false)
            return false;
        return true;
    }
}
