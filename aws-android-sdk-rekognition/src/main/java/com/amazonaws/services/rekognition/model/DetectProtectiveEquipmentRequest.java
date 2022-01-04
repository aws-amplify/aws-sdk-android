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
 * Detects Personal Protective Equipment (PPE) worn by people detected in an
 * image. Amazon Rekognition can detect the following types of PPE.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Face cover
 * </p>
 * </li>
 * <li>
 * <p>
 * Hand cover
 * </p>
 * </li>
 * <li>
 * <p>
 * Head cover
 * </p>
 * </li>
 * </ul>
 * <p>
 * You pass the input image as base64-encoded image bytes or as a reference to
 * an image in an Amazon S3 bucket. The image must be either a PNG or JPG
 * formatted file.
 * </p>
 * <p>
 * <code>DetectProtectiveEquipment</code> detects PPE worn by up to 15 persons
 * detected in an image.
 * </p>
 * <p>
 * For each person detected in the image the API returns an array of body parts
 * (face, head, left-hand, right-hand). For each body part, an array of detected
 * items of PPE is returned, including an indicator of whether or not the PPE
 * covers the body part. The API returns the confidence it has in each detection
 * (person, PPE, body part and body part coverage). It also returns a bounding
 * box (<a>BoundingBox</a>) for each detected person and each detected item of
 * PPE.
 * </p>
 * <p>
 * You can optionally request a summary of detected PPE items with the
 * <code>SummarizationAttributes</code> input parameter. The summary provides
 * the following information.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The persons detected as wearing all of the types of PPE that you specify.
 * </p>
 * </li>
 * <li>
 * <p>
 * The persons detected as not wearing all of the types PPE that you specify.
 * </p>
 * </li>
 * <li>
 * <p>
 * The persons detected where PPE adornment could not be determined.
 * </p>
 * </li>
 * </ul>
 * <p>
 * This is a stateless API operation. That is, the operation does not persist
 * any data.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:DetectProtectiveEquipment</code> action.
 * </p>
 */
public class DetectProtectiveEquipmentRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The image in which you want to detect PPE on detected persons. The image
     * can be passed as image bytes or you can reference an image stored in an
     * Amazon S3 bucket.
     * </p>
     */
    private Image image;

    /**
     * <p>
     * An array of PPE types that you want to summarize.
     * </p>
     */
    private ProtectiveEquipmentSummarizationAttributes summarizationAttributes;

    /**
     * <p>
     * The image in which you want to detect PPE on detected persons. The image
     * can be passed as image bytes or you can reference an image stored in an
     * Amazon S3 bucket.
     * </p>
     *
     * @return <p>
     *         The image in which you want to detect PPE on detected persons.
     *         The image can be passed as image bytes or you can reference an
     *         image stored in an Amazon S3 bucket.
     *         </p>
     */
    public Image getImage() {
        return image;
    }

    /**
     * <p>
     * The image in which you want to detect PPE on detected persons. The image
     * can be passed as image bytes or you can reference an image stored in an
     * Amazon S3 bucket.
     * </p>
     *
     * @param image <p>
     *            The image in which you want to detect PPE on detected persons.
     *            The image can be passed as image bytes or you can reference an
     *            image stored in an Amazon S3 bucket.
     *            </p>
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * <p>
     * The image in which you want to detect PPE on detected persons. The image
     * can be passed as image bytes or you can reference an image stored in an
     * Amazon S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param image <p>
     *            The image in which you want to detect PPE on detected persons.
     *            The image can be passed as image bytes or you can reference an
     *            image stored in an Amazon S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectProtectiveEquipmentRequest withImage(Image image) {
        this.image = image;
        return this;
    }

    /**
     * <p>
     * An array of PPE types that you want to summarize.
     * </p>
     *
     * @return <p>
     *         An array of PPE types that you want to summarize.
     *         </p>
     */
    public ProtectiveEquipmentSummarizationAttributes getSummarizationAttributes() {
        return summarizationAttributes;
    }

    /**
     * <p>
     * An array of PPE types that you want to summarize.
     * </p>
     *
     * @param summarizationAttributes <p>
     *            An array of PPE types that you want to summarize.
     *            </p>
     */
    public void setSummarizationAttributes(
            ProtectiveEquipmentSummarizationAttributes summarizationAttributes) {
        this.summarizationAttributes = summarizationAttributes;
    }

    /**
     * <p>
     * An array of PPE types that you want to summarize.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summarizationAttributes <p>
     *            An array of PPE types that you want to summarize.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectProtectiveEquipmentRequest withSummarizationAttributes(
            ProtectiveEquipmentSummarizationAttributes summarizationAttributes) {
        this.summarizationAttributes = summarizationAttributes;
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
        if (getSummarizationAttributes() != null)
            sb.append("SummarizationAttributes: " + getSummarizationAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime
                * hashCode
                + ((getSummarizationAttributes() == null) ? 0 : getSummarizationAttributes()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectProtectiveEquipmentRequest == false)
            return false;
        DetectProtectiveEquipmentRequest other = (DetectProtectiveEquipmentRequest) obj;

        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getSummarizationAttributes() == null ^ this.getSummarizationAttributes() == null)
            return false;
        if (other.getSummarizationAttributes() != null
                && other.getSummarizationAttributes().equals(this.getSummarizationAttributes()) == false)
            return false;
        return true;
    }
}
