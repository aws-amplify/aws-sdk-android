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
 * Detects explicit or suggestive adult content in a specified JPEG or PNG
 * format image. Use <code>DetectModerationLabels</code> to moderate images
 * depending on your requirements. For example, you might want to filter images
 * that contain nudity, but not images containing suggestive content.
 * </p>
 * <p>
 * To filter images, use the labels returned by
 * <code>DetectModerationLabels</code> to determine which types of content are
 * appropriate.
 * </p>
 * <p>
 * For information about moderation labels, see Detecting Unsafe Content in the
 * Amazon Rekognition Developer Guide.
 * </p>
 * <p>
 * You pass the input image either as base64-encoded image bytes or as a
 * reference to an image in an Amazon S3 bucket. If you use the Amazon CLI to
 * call Amazon Rekognition operations, passing image bytes is not supported. The
 * image must be either a PNG or JPEG formatted file.
 * </p>
 */
public class DetectModerationLabelsRequest extends AmazonWebServiceRequest implements Serializable {
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
     * Specifies the minimum confidence level for the labels to return. Amazon
     * Rekognition doesn't return any labels with a confidence level lower than
     * this specified value.
     * </p>
     * <p>
     * If you don't specify <code>MinConfidence</code>, the operation returns
     * labels with confidence values greater than or equal to 50 percent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float minConfidence;

    /**
     * Default constructor for DetectModerationLabelsRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     */
    public DetectModerationLabelsRequest() {
    }

    /**
     * Constructs a new DetectModerationLabelsRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param image <p>
     *            The input image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes is not supported.
     *            </p>
     */
    public DetectModerationLabelsRequest(Image image) {
        setImage(image);
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
    public DetectModerationLabelsRequest withImage(Image image) {
        this.image = image;
        return this;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon
     * Rekognition doesn't return any labels with a confidence level lower than
     * this specified value.
     * </p>
     * <p>
     * If you don't specify <code>MinConfidence</code>, the operation returns
     * labels with confidence values greater than or equal to 50 percent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         Specifies the minimum confidence level for the labels to return.
     *         Amazon Rekognition doesn't return any labels with a confidence
     *         level lower than this specified value.
     *         </p>
     *         <p>
     *         If you don't specify <code>MinConfidence</code>, the operation
     *         returns labels with confidence values greater than or equal to 50
     *         percent.
     *         </p>
     */
    public Float getMinConfidence() {
        return minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon
     * Rekognition doesn't return any labels with a confidence level lower than
     * this specified value.
     * </p>
     * <p>
     * If you don't specify <code>MinConfidence</code>, the operation returns
     * labels with confidence values greater than or equal to 50 percent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param minConfidence <p>
     *            Specifies the minimum confidence level for the labels to
     *            return. Amazon Rekognition doesn't return any labels with a
     *            confidence level lower than this specified value.
     *            </p>
     *            <p>
     *            If you don't specify <code>MinConfidence</code>, the operation
     *            returns labels with confidence values greater than or equal to
     *            50 percent.
     *            </p>
     */
    public void setMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon
     * Rekognition doesn't return any labels with a confidence level lower than
     * this specified value.
     * </p>
     * <p>
     * If you don't specify <code>MinConfidence</code>, the operation returns
     * labels with confidence values greater than or equal to 50 percent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param minConfidence <p>
     *            Specifies the minimum confidence level for the labels to
     *            return. Amazon Rekognition doesn't return any labels with a
     *            confidence level lower than this specified value.
     *            </p>
     *            <p>
     *            If you don't specify <code>MinConfidence</code>, the operation
     *            returns labels with confidence values greater than or equal to
     *            50 percent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectModerationLabelsRequest withMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
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
        if (getImage() != null)
            sb.append("Image: " + getImage() + ",");
        if (getMinConfidence() != null)
            sb.append("MinConfidence: " + getMinConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode
                + ((getMinConfidence() == null) ? 0 : getMinConfidence().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectModerationLabelsRequest == false)
            return false;
        DetectModerationLabelsRequest other = (DetectModerationLabelsRequest) obj;

        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getMinConfidence() == null ^ this.getMinConfidence() == null)
            return false;
        if (other.getMinConfidence() != null
                && other.getMinConfidence().equals(this.getMinConfidence()) == false)
            return false;
        return true;
    }
}
