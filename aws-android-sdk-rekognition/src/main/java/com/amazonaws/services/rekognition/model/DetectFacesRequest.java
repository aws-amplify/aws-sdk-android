/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Detects faces within an image (JPEG or PNG) that is provided as input.
 * </p>
 * <p>
 * For each face detected, the operation returns face details including a
 * bounding box of the face, a confidence value (that the bounding box contains
 * a face), and a fixed set of attributes such as facial landmarks (for example,
 * coordinates of eye and mouth), gender, presence of beard, sunglasses, etc.
 * </p>
 * <p>
 * The face-detection algorithm is most effective on frontal faces. For
 * non-frontal or obscured faces, the algorithm may not detect the faces or
 * might detect faces with lower confidence.
 * </p>
 * <note>
 * <p>
 * This is a stateless API operation. That is, the operation does not persist
 * any data.
 * </p>
 * </note>
 * <p>
 * For an example, see <a>get-started-exercise-detect-faces</a>.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:DetectFaces</code> action.
 * </p>
 */
public class DetectFacesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The image in which you want to detect faces. You can specify a blob or an
     * S3 object.
     * </p>
     */
    private Image image;

    /**
     * <p>
     * A list of facial attributes you would like to be returned. By default,
     * the API returns subset of facial attributes.
     * </p>
     * <p>
     * For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you
     * provide both, ["ALL", "DEFAULT"], the service uses a logical AND operator
     * to determine which attributes to return (in this case, it is all
     * attributes). If you specify all attributes, Rekognition performs
     * additional detection.
     * </p>
     */
    private java.util.List<String> attributes;

    /**
     * <p>
     * The image in which you want to detect faces. You can specify a blob or an
     * S3 object.
     * </p>
     *
     * @return <p>
     *         The image in which you want to detect faces. You can specify a
     *         blob or an S3 object.
     *         </p>
     */
    public Image getImage() {
        return image;
    }

    /**
     * <p>
     * The image in which you want to detect faces. You can specify a blob or an
     * S3 object.
     * </p>
     *
     * @param image <p>
     *            The image in which you want to detect faces. You can specify a
     *            blob or an S3 object.
     *            </p>
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * <p>
     * The image in which you want to detect faces. You can specify a blob or an
     * S3 object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param image <p>
     *            The image in which you want to detect faces. You can specify a
     *            blob or an S3 object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectFacesRequest withImage(Image image) {
        this.image = image;
        return this;
    }

    /**
     * <p>
     * A list of facial attributes you would like to be returned. By default,
     * the API returns subset of facial attributes.
     * </p>
     * <p>
     * For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you
     * provide both, ["ALL", "DEFAULT"], the service uses a logical AND operator
     * to determine which attributes to return (in this case, it is all
     * attributes). If you specify all attributes, Rekognition performs
     * additional detection.
     * </p>
     *
     * @return <p>
     *         A list of facial attributes you would like to be returned. By
     *         default, the API returns subset of facial attributes.
     *         </p>
     *         <p>
     *         For example, you can specify the value as, ["ALL"] or
     *         ["DEFAULT"]. If you provide both, ["ALL", "DEFAULT"], the service
     *         uses a logical AND operator to determine which attributes to
     *         return (in this case, it is all attributes). If you specify all
     *         attributes, Rekognition performs additional detection.
     *         </p>
     */
    public java.util.List<String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A list of facial attributes you would like to be returned. By default,
     * the API returns subset of facial attributes.
     * </p>
     * <p>
     * For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you
     * provide both, ["ALL", "DEFAULT"], the service uses a logical AND operator
     * to determine which attributes to return (in this case, it is all
     * attributes). If you specify all attributes, Rekognition performs
     * additional detection.
     * </p>
     *
     * @param attributes <p>
     *            A list of facial attributes you would like to be returned. By
     *            default, the API returns subset of facial attributes.
     *            </p>
     *            <p>
     *            For example, you can specify the value as, ["ALL"] or
     *            ["DEFAULT"]. If you provide both, ["ALL", "DEFAULT"], the
     *            service uses a logical AND operator to determine which
     *            attributes to return (in this case, it is all attributes). If
     *            you specify all attributes, Rekognition performs additional
     *            detection.
     *            </p>
     */
    public void setAttributes(java.util.Collection<String> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<String>(attributes);
    }

    /**
     * <p>
     * A list of facial attributes you would like to be returned. By default,
     * the API returns subset of facial attributes.
     * </p>
     * <p>
     * For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you
     * provide both, ["ALL", "DEFAULT"], the service uses a logical AND operator
     * to determine which attributes to return (in this case, it is all
     * attributes). If you specify all attributes, Rekognition performs
     * additional detection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A list of facial attributes you would like to be returned. By
     *            default, the API returns subset of facial attributes.
     *            </p>
     *            <p>
     *            For example, you can specify the value as, ["ALL"] or
     *            ["DEFAULT"]. If you provide both, ["ALL", "DEFAULT"], the
     *            service uses a logical AND operator to determine which
     *            attributes to return (in this case, it is all attributes). If
     *            you specify all attributes, Rekognition performs additional
     *            detection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectFacesRequest withAttributes(String... attributes) {
        if (getAttributes() == null) {
            this.attributes = new java.util.ArrayList<String>(attributes.length);
        }
        for (String value : attributes) {
            this.attributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of facial attributes you would like to be returned. By default,
     * the API returns subset of facial attributes.
     * </p>
     * <p>
     * For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you
     * provide both, ["ALL", "DEFAULT"], the service uses a logical AND operator
     * to determine which attributes to return (in this case, it is all
     * attributes). If you specify all attributes, Rekognition performs
     * additional detection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A list of facial attributes you would like to be returned. By
     *            default, the API returns subset of facial attributes.
     *            </p>
     *            <p>
     *            For example, you can specify the value as, ["ALL"] or
     *            ["DEFAULT"]. If you provide both, ["ALL", "DEFAULT"], the
     *            service uses a logical AND operator to determine which
     *            attributes to return (in this case, it is all attributes). If
     *            you specify all attributes, Rekognition performs additional
     *            detection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectFacesRequest withAttributes(java.util.Collection<String> attributes) {
        setAttributes(attributes);
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
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectFacesRequest == false)
            return false;
        DetectFacesRequest other = (DetectFacesRequest) obj;

        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }
}
