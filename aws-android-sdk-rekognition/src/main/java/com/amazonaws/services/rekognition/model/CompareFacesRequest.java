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
 * Compares a face in the <i>source</i> input image with each of the 100 largest
 * faces detected in the <i>target</i> input image.
 * </p>
 * <note>
 * <p>
 * If the source image contains multiple faces, the service detects the largest
 * face and compares it with each face detected in the target image.
 * </p>
 * </note>
 * <p>
 * You pass the input and target images either as base64-encoded image bytes or
 * as a references to images in an Amazon S3 bucket. If you use the Amazon CLI
 * to call Amazon Rekognition operations, passing image bytes is not supported.
 * The image must be either a PNG or JPEG formatted file.
 * </p>
 * <p>
 * In response, the operation returns an array of face matches ordered by
 * similarity score in descending order. For each face match, the response
 * provides a bounding box of the face, facial landmarks, pose details (pitch,
 * role, and yaw), quality (brightness and sharpness), and confidence value
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
     */
    private Image sourceImage;

    /**
     * <p>
     * The target image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing base64-encoded
     * image bytes is not supported.
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
     * @param targetImage <p>
     *            The target image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes is not supported.
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
     *
     * @return <p>
     *         The input image as base64-encoded bytes or an S3 object. If you
     *         use the AWS CLI to call Amazon Rekognition operations, passing
     *         base64-encoded image bytes is not supported.
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
     *
     * @param sourceImage <p>
     *            The input image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes is not supported.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceImage <p>
     *            The input image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes is not supported.
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
     *
     * @return <p>
     *         The target image as base64-encoded bytes or an S3 object. If you
     *         use the AWS CLI to call Amazon Rekognition operations, passing
     *         base64-encoded image bytes is not supported.
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
     *
     * @param targetImage <p>
     *            The target image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes is not supported.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetImage <p>
     *            The target image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes is not supported.
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
            sb.append("SimilarityThreshold: " + getSimilarityThreshold());
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
        return true;
    }
}
