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
 * Detects text in the input image and converts it into machine-readable text.
 * </p>
 * <p>
 * Pass the input image as base64-encoded image bytes or as a reference to an
 * image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon
 * Rekognition operations, you must pass it as a reference to an image in an
 * Amazon S3 bucket. For the AWS CLI, passing image bytes is not supported. The
 * image must be either a .png or .jpeg formatted file.
 * </p>
 * <p>
 * The <code>DetectText</code> operation returns text in an array of elements,
 * <code>TextDetections</code>. Each <code>TextDetection</code> element provides
 * information about a single word or line of text that was detected in the
 * image.
 * </p>
 * <p>
 * A word is one or more ISO basic latin script characters that are not
 * separated by spaces. <code>DetectText</code> can detect up to 50 words in an
 * image.
 * </p>
 * <p>
 * A line is a string of equally spaced words. A line isn't necessarily a
 * complete sentence. For example, a driver's license number is detected as a
 * line. A line ends when there is no aligned text after it. Also, a line ends
 * when there is a large gap between words, relative to the length of the words.
 * This means, depending on the gap between words, Amazon Rekognition may detect
 * multiple lines in text aligned in the same direction. Periods don't represent
 * the end of a line. If a sentence spans multiple lines, the
 * <code>DetectText</code> operation returns multiple lines.
 * </p>
 * <p>
 * To determine whether a <code>TextDetection</code> element is a line of text
 * or a word, use the <code>TextDetection</code> object <code>Type</code> field.
 * </p>
 * <p>
 * To be detected, text must be within +/- 30 degrees orientation of the
 * horizontal axis.
 * </p>
 * <p>
 * For more information, see DetectText in the Amazon Rekognition Developer
 * Guide.
 * </p>
 */
public class DetectTextRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The input image as base64-encoded bytes or an Amazon S3 object. If you
     * use the AWS CLI to call Amazon Rekognition operations, you can't pass
     * image bytes.
     * </p>
     */
    private Image image;

    /**
     * <p>
     * The input image as base64-encoded bytes or an Amazon S3 object. If you
     * use the AWS CLI to call Amazon Rekognition operations, you can't pass
     * image bytes.
     * </p>
     *
     * @return <p>
     *         The input image as base64-encoded bytes or an Amazon S3 object.
     *         If you use the AWS CLI to call Amazon Rekognition operations, you
     *         can't pass image bytes.
     *         </p>
     */
    public Image getImage() {
        return image;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an Amazon S3 object. If you
     * use the AWS CLI to call Amazon Rekognition operations, you can't pass
     * image bytes.
     * </p>
     *
     * @param image <p>
     *            The input image as base64-encoded bytes or an Amazon S3
     *            object. If you use the AWS CLI to call Amazon Rekognition
     *            operations, you can't pass image bytes.
     *            </p>
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an Amazon S3 object. If you
     * use the AWS CLI to call Amazon Rekognition operations, you can't pass
     * image bytes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param image <p>
     *            The input image as base64-encoded bytes or an Amazon S3
     *            object. If you use the AWS CLI to call Amazon Rekognition
     *            operations, you can't pass image bytes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectTextRequest withImage(Image image) {
        this.image = image;
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
            sb.append("Image: " + getImage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectTextRequest == false)
            return false;
        DetectTextRequest other = (DetectTextRequest) obj;

        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        return true;
    }
}
