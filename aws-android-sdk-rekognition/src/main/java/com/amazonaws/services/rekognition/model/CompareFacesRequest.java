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
 * Compares a face in the <i>source</i> input image with each of the 100 largest
 * faces detected in the <i>target</i> input image.
 * </p>
 * <p>
 * If the source image contains multiple faces, the service detects the largest
 * face and compares it with each face detected in the target image.
 * </p>
 * <note>
 * <p>
 * CompareFaces uses machine learning algorithms, which are probabilistic. A
 * false negative is an incorrect prediction that a face in the target image has
 * a low similarity confidence score when compared to the face in the source
 * image. To reduce the probability of false negatives, we recommend that you
 * compare the target image against multiple source images. If you plan to use
 * <code>CompareFaces</code> to make a decision that impacts an individual's
 * rights, privacy, or access to services, we recommend that you pass the result
 * to a human for review and further validation before taking action.
 * </p>
 * </note>
 * <p>
 * You pass the input and target images either as base64-encoded image bytes or
 * as references to images in an Amazon S3 bucket. If you use the AWS CLI to
 * call Amazon Rekognition operations, passing image bytes isn't supported. The
 * image must be formatted as a PNG or JPEG file.
 * </p>
 * <p>
 * In response, the operation returns an array of face matches ordered by
 * similarity score in descending order. For each face match, the response
 * provides a bounding box of the face, facial landmarks, pose details (pitch,
 * roll, and yaw), quality (brightness and sharpness), and confidence value
 * (indicating the level of confidence that the bounding box contains a face).
 * The response also provides a similarity score, which indicates how closely
 * the faces match.
 * </p>
 * <note>
 * <p>
 * By default, only faces with a similarity score of greater than or equal to
 * 80% are returned in the response. You can change this value by specifying the
 * <code>SimilarityThreshold</code> parameter.
 * </p>
 * </note>
 * <p>
 * <code>CompareFaces</code> also returns an array of faces that don't match the
 * source image. For each face, it returns a bounding box, confidence value,
 * landmarks, pose details, and quality. The response also returns information
 * about the face in the source image, including the bounding box of the face
 * and confidence value.
 * </p>
 * <p>
 * The <code>QualityFilter</code> input parameter allows you to filter out
 * detected faces that don’t meet a required quality bar. The quality bar is
 * based on a variety of common use cases. Use <code>QualityFilter</code> to set
 * the quality bar by specifying <code>LOW</code>, <code>MEDIUM</code>, or
 * <code>HIGH</code>. If you do not want to filter detected faces, specify
 * <code>NONE</code>. The default value is <code>NONE</code>.
 * </p>
 * <p>
 * If the image doesn't contain Exif metadata, <code>CompareFaces</code> returns
 * orientation information for the source and target images. Use these values to
 * display the images with the correct image orientation.
 * </p>
 * <p>
 * If no faces are detected in the source or target images,
 * <code>CompareFaces</code> returns an <code>InvalidParameterException</code>
 * error.
 * </p>
 * <note>
 * <p>
 * This is a stateless API operation. That is, data returned by this operation
 * doesn't persist.
 * </p>
 * </note>
 * <p>
 * For an example, see Comparing Faces in Images in the Amazon Rekognition
 * Developer Guide.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:CompareFaces</code> action.
 * </p>
 */
public class CompareFacesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing base64-encoded
     * image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not
     * need to base64-encode image bytes passed using the <code>Bytes</code>
     * field. For more information, see Images in the Amazon Rekognition
     * developer guide.
     * </p>
     */
    private Image sourceImage;

    /**
     * <p>
     * The target image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing base64-encoded
     * image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not
     * need to base64-encode image bytes passed using the <code>Bytes</code>
     * field. For more information, see Images in the Amazon Rekognition
     * developer guide.
     * </p>
     */
    private Image targetImage;

    /**
     * <p>
     * The minimum level of confidence in the face matches that a match must
     * meet to be included in the <code>FaceMatches</code> array.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float similarityThreshold;

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to
     * identify faces. Filtered faces aren't compared. If you specify
     * <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you
     * specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>,
     * filtering removes all faces that don’t meet the chosen quality bar. The
     * quality bar is based on a variety of common use cases. Low-quality
     * detections can occur for a number of reasons. Some examples are an object
     * that's misidentified as a face, a face that's too blurry, or a face with
     * a pose that's too extreme to use. If you specify <code>NONE</code>, no
     * filtering is performed. The default value is <code>NONE</code>.
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
     * Default constructor for CompareFacesRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public CompareFacesRequest() {
    }

    /**
     * Constructs a new CompareFacesRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param sourceImage <p>
     *            The input image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes is not supported.
     *            </p>
     *            <p>
     *            If you are using an AWS SDK to call Amazon Rekognition, you
     *            might not need to base64-encode image bytes passed using the
     *            <code>Bytes</code> field. For more information, see Images in
     *            the Amazon Rekognition developer guide.
     *            </p>
     * @param targetImage <p>
     *            The target image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes is not supported.
     *            </p>
     *            <p>
     *            If you are using an AWS SDK to call Amazon Rekognition, you
     *            might not need to base64-encode image bytes passed using the
     *            <code>Bytes</code> field. For more information, see Images in
     *            the Amazon Rekognition developer guide.
     *            </p>
     */
    public CompareFacesRequest(Image sourceImage, Image targetImage) {
        setSourceImage(sourceImage);
        setTargetImage(targetImage);
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing base64-encoded
     * image bytes is not supported.
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
     *         base64-encoded image bytes is not supported.
     *         </p>
     *         <p>
     *         If you are using an AWS SDK to call Amazon Rekognition, you might
     *         not need to base64-encode image bytes passed using the
     *         <code>Bytes</code> field. For more information, see Images in the
     *         Amazon Rekognition developer guide.
     *         </p>
     */
    public Image getSourceImage() {
        return sourceImage;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing base64-encoded
     * image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not
     * need to base64-encode image bytes passed using the <code>Bytes</code>
     * field. For more information, see Images in the Amazon Rekognition
     * developer guide.
     * </p>
     *
     * @param sourceImage <p>
     *            The input image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes is not supported.
     *            </p>
     *            <p>
     *            If you are using an AWS SDK to call Amazon Rekognition, you
     *            might not need to base64-encode image bytes passed using the
     *            <code>Bytes</code> field. For more information, see Images in
     *            the Amazon Rekognition developer guide.
     *            </p>
     */
    public void setSourceImage(Image sourceImage) {
        this.sourceImage = sourceImage;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing base64-encoded
     * image bytes is not supported.
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
     * @param sourceImage <p>
     *            The input image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes is not supported.
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
    public CompareFacesRequest withSourceImage(Image sourceImage) {
        this.sourceImage = sourceImage;
        return this;
    }

    /**
     * <p>
     * The target image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing base64-encoded
     * image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not
     * need to base64-encode image bytes passed using the <code>Bytes</code>
     * field. For more information, see Images in the Amazon Rekognition
     * developer guide.
     * </p>
     *
     * @return <p>
     *         The target image as base64-encoded bytes or an S3 object. If you
     *         use the AWS CLI to call Amazon Rekognition operations, passing
     *         base64-encoded image bytes is not supported.
     *         </p>
     *         <p>
     *         If you are using an AWS SDK to call Amazon Rekognition, you might
     *         not need to base64-encode image bytes passed using the
     *         <code>Bytes</code> field. For more information, see Images in the
     *         Amazon Rekognition developer guide.
     *         </p>
     */
    public Image getTargetImage() {
        return targetImage;
    }

    /**
     * <p>
     * The target image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing base64-encoded
     * image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not
     * need to base64-encode image bytes passed using the <code>Bytes</code>
     * field. For more information, see Images in the Amazon Rekognition
     * developer guide.
     * </p>
     *
     * @param targetImage <p>
     *            The target image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes is not supported.
     *            </p>
     *            <p>
     *            If you are using an AWS SDK to call Amazon Rekognition, you
     *            might not need to base64-encode image bytes passed using the
     *            <code>Bytes</code> field. For more information, see Images in
     *            the Amazon Rekognition developer guide.
     *            </p>
     */
    public void setTargetImage(Image targetImage) {
        this.targetImage = targetImage;
    }

    /**
     * <p>
     * The target image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing base64-encoded
     * image bytes is not supported.
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
     * @param targetImage <p>
     *            The target image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes is not supported.
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
    public CompareFacesRequest withTargetImage(Image targetImage) {
        this.targetImage = targetImage;
        return this;
    }

    /**
     * <p>
     * The minimum level of confidence in the face matches that a match must
     * meet to be included in the <code>FaceMatches</code> array.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         The minimum level of confidence in the face matches that a match
     *         must meet to be included in the <code>FaceMatches</code> array.
     *         </p>
     */
    public Float getSimilarityThreshold() {
        return similarityThreshold;
    }

    /**
     * <p>
     * The minimum level of confidence in the face matches that a match must
     * meet to be included in the <code>FaceMatches</code> array.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param similarityThreshold <p>
     *            The minimum level of confidence in the face matches that a
     *            match must meet to be included in the <code>FaceMatches</code>
     *            array.
     *            </p>
     */
    public void setSimilarityThreshold(Float similarityThreshold) {
        this.similarityThreshold = similarityThreshold;
    }

    /**
     * <p>
     * The minimum level of confidence in the face matches that a match must
     * meet to be included in the <code>FaceMatches</code> array.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param similarityThreshold <p>
     *            The minimum level of confidence in the face matches that a
     *            match must meet to be included in the <code>FaceMatches</code>
     *            array.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompareFacesRequest withSimilarityThreshold(Float similarityThreshold) {
        this.similarityThreshold = similarityThreshold;
        return this;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to
     * identify faces. Filtered faces aren't compared. If you specify
     * <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you
     * specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>,
     * filtering removes all faces that don’t meet the chosen quality bar. The
     * quality bar is based on a variety of common use cases. Low-quality
     * detections can occur for a number of reasons. Some examples are an object
     * that's misidentified as a face, a face that's too blurry, or a face with
     * a pose that's too extreme to use. If you specify <code>NONE</code>, no
     * filtering is performed. The default value is <code>NONE</code>.
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
     *         done to identify faces. Filtered faces aren't compared. If you
     *         specify <code>AUTO</code>, Amazon Rekognition chooses the quality
     *         bar. If you specify <code>LOW</code>, <code>MEDIUM</code>, or
     *         <code>HIGH</code>, filtering removes all faces that don’t meet
     *         the chosen quality bar. The quality bar is based on a variety of
     *         common use cases. Low-quality detections can occur for a number
     *         of reasons. Some examples are an object that's misidentified as a
     *         face, a face that's too blurry, or a face with a pose that's too
     *         extreme to use. If you specify <code>NONE</code>, no filtering is
     *         performed. The default value is <code>NONE</code>.
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
     * identify faces. Filtered faces aren't compared. If you specify
     * <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you
     * specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>,
     * filtering removes all faces that don’t meet the chosen quality bar. The
     * quality bar is based on a variety of common use cases. Low-quality
     * detections can occur for a number of reasons. Some examples are an object
     * that's misidentified as a face, a face that's too blurry, or a face with
     * a pose that's too extreme to use. If you specify <code>NONE</code>, no
     * filtering is performed. The default value is <code>NONE</code>.
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
     *            is done to identify faces. Filtered faces aren't compared. If
     *            you specify <code>AUTO</code>, Amazon Rekognition chooses the
     *            quality bar. If you specify <code>LOW</code>,
     *            <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes
     *            all faces that don’t meet the chosen quality bar. The quality
     *            bar is based on a variety of common use cases. Low-quality
     *            detections can occur for a number of reasons. Some examples
     *            are an object that's misidentified as a face, a face that's
     *            too blurry, or a face with a pose that's too extreme to use.
     *            If you specify <code>NONE</code>, no filtering is performed.
     *            The default value is <code>NONE</code>.
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
     * identify faces. Filtered faces aren't compared. If you specify
     * <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you
     * specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>,
     * filtering removes all faces that don’t meet the chosen quality bar. The
     * quality bar is based on a variety of common use cases. Low-quality
     * detections can occur for a number of reasons. Some examples are an object
     * that's misidentified as a face, a face that's too blurry, or a face with
     * a pose that's too extreme to use. If you specify <code>NONE</code>, no
     * filtering is performed. The default value is <code>NONE</code>.
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
     *            is done to identify faces. Filtered faces aren't compared. If
     *            you specify <code>AUTO</code>, Amazon Rekognition chooses the
     *            quality bar. If you specify <code>LOW</code>,
     *            <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes
     *            all faces that don’t meet the chosen quality bar. The quality
     *            bar is based on a variety of common use cases. Low-quality
     *            detections can occur for a number of reasons. Some examples
     *            are an object that's misidentified as a face, a face that's
     *            too blurry, or a face with a pose that's too extreme to use.
     *            If you specify <code>NONE</code>, no filtering is performed.
     *            The default value is <code>NONE</code>.
     *            </p>
     *            <p>
     *            To use quality filtering, the collection you are using must be
     *            associated with version 3 of the face model or higher.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QualityFilter
     */
    public CompareFacesRequest withQualityFilter(String qualityFilter) {
        this.qualityFilter = qualityFilter;
        return this;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to
     * identify faces. Filtered faces aren't compared. If you specify
     * <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you
     * specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>,
     * filtering removes all faces that don’t meet the chosen quality bar. The
     * quality bar is based on a variety of common use cases. Low-quality
     * detections can occur for a number of reasons. Some examples are an object
     * that's misidentified as a face, a face that's too blurry, or a face with
     * a pose that's too extreme to use. If you specify <code>NONE</code>, no
     * filtering is performed. The default value is <code>NONE</code>.
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
     *            is done to identify faces. Filtered faces aren't compared. If
     *            you specify <code>AUTO</code>, Amazon Rekognition chooses the
     *            quality bar. If you specify <code>LOW</code>,
     *            <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes
     *            all faces that don’t meet the chosen quality bar. The quality
     *            bar is based on a variety of common use cases. Low-quality
     *            detections can occur for a number of reasons. Some examples
     *            are an object that's misidentified as a face, a face that's
     *            too blurry, or a face with a pose that's too extreme to use.
     *            If you specify <code>NONE</code>, no filtering is performed.
     *            The default value is <code>NONE</code>.
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
     * identify faces. Filtered faces aren't compared. If you specify
     * <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you
     * specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>,
     * filtering removes all faces that don’t meet the chosen quality bar. The
     * quality bar is based on a variety of common use cases. Low-quality
     * detections can occur for a number of reasons. Some examples are an object
     * that's misidentified as a face, a face that's too blurry, or a face with
     * a pose that's too extreme to use. If you specify <code>NONE</code>, no
     * filtering is performed. The default value is <code>NONE</code>.
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
     *            is done to identify faces. Filtered faces aren't compared. If
     *            you specify <code>AUTO</code>, Amazon Rekognition chooses the
     *            quality bar. If you specify <code>LOW</code>,
     *            <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes
     *            all faces that don’t meet the chosen quality bar. The quality
     *            bar is based on a variety of common use cases. Low-quality
     *            detections can occur for a number of reasons. Some examples
     *            are an object that's misidentified as a face, a face that's
     *            too blurry, or a face with a pose that's too extreme to use.
     *            If you specify <code>NONE</code>, no filtering is performed.
     *            The default value is <code>NONE</code>.
     *            </p>
     *            <p>
     *            To use quality filtering, the collection you are using must be
     *            associated with version 3 of the face model or higher.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QualityFilter
     */
    public CompareFacesRequest withQualityFilter(QualityFilter qualityFilter) {
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
        if (getSourceImage() != null)
            sb.append("SourceImage: " + getSourceImage() + ",");
        if (getTargetImage() != null)
            sb.append("TargetImage: " + getTargetImage() + ",");
        if (getSimilarityThreshold() != null)
            sb.append("SimilarityThreshold: " + getSimilarityThreshold() + ",");
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
                + ((getSourceImage() == null) ? 0 : getSourceImage().hashCode());
        hashCode = prime * hashCode
                + ((getTargetImage() == null) ? 0 : getTargetImage().hashCode());
        hashCode = prime * hashCode
                + ((getSimilarityThreshold() == null) ? 0 : getSimilarityThreshold().hashCode());
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

        if (obj instanceof CompareFacesRequest == false)
            return false;
        CompareFacesRequest other = (CompareFacesRequest) obj;

        if (other.getSourceImage() == null ^ this.getSourceImage() == null)
            return false;
        if (other.getSourceImage() != null
                && other.getSourceImage().equals(this.getSourceImage()) == false)
            return false;
        if (other.getTargetImage() == null ^ this.getTargetImage() == null)
            return false;
        if (other.getTargetImage() != null
                && other.getTargetImage().equals(this.getTargetImage()) == false)
            return false;
        if (other.getSimilarityThreshold() == null ^ this.getSimilarityThreshold() == null)
            return false;
        if (other.getSimilarityThreshold() != null
                && other.getSimilarityThreshold().equals(this.getSimilarityThreshold()) == false)
            return false;
        if (other.getQualityFilter() == null ^ this.getQualityFilter() == null)
            return false;
        if (other.getQualityFilter() != null
                && other.getQualityFilter().equals(this.getQualityFilter()) == false)
            return false;
        return true;
    }
}
