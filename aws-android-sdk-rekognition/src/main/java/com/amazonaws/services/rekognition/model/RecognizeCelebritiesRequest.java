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
 * Returns an array of celebrities recognized in the input image. For more
 * information, see Recognizing Celebrities in the Amazon Rekognition Developer
 * Guide.
 * </p>
 * <p>
 * <code>RecognizeCelebrities</code> returns the 100 largest faces in the image.
 * It lists recognized celebrities in the <code>CelebrityFaces</code> array and
 * unrecognized faces in the <code>UnrecognizedFaces</code> array.
 * <code>RecognizeCelebrities</code> doesn't return celebrities whose faces are
 * not amongst the largest 100 faces in the image.
 * </p>
 * <p>
 * For each celebrity recognized, the <code>RecognizeCelebrities</code> returns
 * a <code>Celebrity</code> object. The <code>Celebrity</code> object contains
 * the celebrity name, ID, URL links to additional information, match
 * confidence, and a <code>ComparedFace</code> object that you can use to locate
 * the celebrity's face on the image.
 * </p>
 * <p>
 * Rekognition does not retain information about which images a celebrity has
 * been recognized in. Your application must store this information and use the
 * <code>Celebrity</code> ID property as a unique identifier for the celebrity.
 * If you don't store the celebrity name or additional information URLs returned
 * by <code>RecognizeCelebrities</code>, you will need the ID to identify the
 * celebrity in a call to the operation.
 * </p>
 * <p>
 * You pass the imput image either as base64-encoded image bytes or as a
 * reference to an image in an Amazon S3 bucket. If you use the Amazon CLI to
 * call Amazon Rekognition operations, passing image bytes is not supported. The
 * image must be either a PNG or JPEG formatted file.
 * </p>
 * <p>
 * For an example, see Recognizing Celebrities in an Image in the Amazon
 * Rekognition Developer Guide.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:RecognizeCelebrities</code> operation.
 * </p>
 */
public class RecognizeCelebritiesRequest extends AmazonWebServiceRequest implements Serializable {
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
    public RecognizeCelebritiesRequest withImage(Image image) {
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

        if (obj instanceof RecognizeCelebritiesRequest == false)
            return false;
        RecognizeCelebritiesRequest other = (RecognizeCelebritiesRequest) obj;

        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        return true;
    }
}
