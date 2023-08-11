/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Detects faces within an image that is provided as input.
 * </p>
 * <p>
 * <code>DetectFaces</code> detects the 100 largest faces in the image. For each
 * face detected, the operation returns face details. These details include a
 * bounding box of the face, a confidence value (that the bounding box contains
 * a face), and a fixed set of attributes such as facial landmarks (for example,
 * coordinates of eye and mouth), pose, presence of facial occlusion, and so on.
 * </p>
 * <p>
 * The face-detection algorithm is most effective on frontal faces. For
 * non-frontal or obscured faces, the algorithm might not detect the faces or
 * might detect faces with lower confidence.
 * </p>
 * <p>
 * You pass the input image either as base64-encoded image bytes or as a
 * reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call
 * Amazon Rekognition operations, passing image bytes is not supported. The
 * image must be either a PNG or JPEG formatted file.
 * </p>
 * <note>
 * <p>
 * This is a stateless API operation. That is, the operation does not persist
 * any data.
 * </p>
 * </note>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:DetectFaces</code> action.
 * </p>
 */
public class DetectFacesRequest extends AmazonWebServiceRequest implements Serializable {
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
    private Image image;

    /**
     * <p>
     * An array of facial attributes you want to be returned. A
     * <code>DEFAULT</code> subset of facial attributes -
     * <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>,
     * <code>Quality</code>, and <code>Landmarks</code> - will always be
     * returned. You can request for specific facial attributes (in addition to
     * the default list) - by using [<code>"DEFAULT", "FACE_OCCLUDED"</code>] or
     * just [<code>"FACE_OCCLUDED"</code>]. You can request for all facial
     * attributes by using [<code>"ALL"]</code>. Requesting more attributes may
     * increase response time.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a
     * logical "AND" operator to determine which attributes to return (in this
     * case, all attributes).
     * </p>
     * <p>
     * Note that while the FaceOccluded and EyeDirection attributes are
     * supported when using <code>DetectFaces</code>, they aren't supported when
     * analyzing videos with <code>StartFaceDetection</code> and
     * <code>GetFaceDetection</code>.
     * </p>
     */
    private java.util.List<String> attributes;

    /**
     * Default constructor for DetectFacesRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     */
    public DetectFacesRequest() {
    }

    /**
     * Constructs a new DetectFacesRequest object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param image <p>
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
    public DetectFacesRequest(Image image) {
        setImage(image);
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
    public Image getImage() {
        return image;
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
     * @param image <p>
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
    public DetectFacesRequest withImage(Image image) {
        this.image = image;
        return this;
    }

    /**
     * <p>
     * An array of facial attributes you want to be returned. A
     * <code>DEFAULT</code> subset of facial attributes -
     * <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>,
     * <code>Quality</code>, and <code>Landmarks</code> - will always be
     * returned. You can request for specific facial attributes (in addition to
     * the default list) - by using [<code>"DEFAULT", "FACE_OCCLUDED"</code>] or
     * just [<code>"FACE_OCCLUDED"</code>]. You can request for all facial
     * attributes by using [<code>"ALL"]</code>. Requesting more attributes may
     * increase response time.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a
     * logical "AND" operator to determine which attributes to return (in this
     * case, all attributes).
     * </p>
     * <p>
     * Note that while the FaceOccluded and EyeDirection attributes are
     * supported when using <code>DetectFaces</code>, they aren't supported when
     * analyzing videos with <code>StartFaceDetection</code> and
     * <code>GetFaceDetection</code>.
     * </p>
     *
     * @return <p>
     *         An array of facial attributes you want to be returned. A
     *         <code>DEFAULT</code> subset of facial attributes -
     *         <code>BoundingBox</code>, <code>Confidence</code>,
     *         <code>Pose</code>, <code>Quality</code>, and
     *         <code>Landmarks</code> - will always be returned. You can request
     *         for specific facial attributes (in addition to the default list)
     *         - by using [<code>"DEFAULT", "FACE_OCCLUDED"</code>] or just [
     *         <code>"FACE_OCCLUDED"</code>]. You can request for all facial
     *         attributes by using [<code>"ALL"]</code>. Requesting more
     *         attributes may increase response time.
     *         </p>
     *         <p>
     *         If you provide both, <code>["ALL", "DEFAULT"]</code>, the service
     *         uses a logical "AND" operator to determine which attributes to
     *         return (in this case, all attributes).
     *         </p>
     *         <p>
     *         Note that while the FaceOccluded and EyeDirection attributes are
     *         supported when using <code>DetectFaces</code>, they aren't
     *         supported when analyzing videos with
     *         <code>StartFaceDetection</code> and <code>GetFaceDetection</code>
     *         .
     *         </p>
     */
    public java.util.List<String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * An array of facial attributes you want to be returned. A
     * <code>DEFAULT</code> subset of facial attributes -
     * <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>,
     * <code>Quality</code>, and <code>Landmarks</code> - will always be
     * returned. You can request for specific facial attributes (in addition to
     * the default list) - by using [<code>"DEFAULT", "FACE_OCCLUDED"</code>] or
     * just [<code>"FACE_OCCLUDED"</code>]. You can request for all facial
     * attributes by using [<code>"ALL"]</code>. Requesting more attributes may
     * increase response time.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a
     * logical "AND" operator to determine which attributes to return (in this
     * case, all attributes).
     * </p>
     * <p>
     * Note that while the FaceOccluded and EyeDirection attributes are
     * supported when using <code>DetectFaces</code>, they aren't supported when
     * analyzing videos with <code>StartFaceDetection</code> and
     * <code>GetFaceDetection</code>.
     * </p>
     *
     * @param attributes <p>
     *            An array of facial attributes you want to be returned. A
     *            <code>DEFAULT</code> subset of facial attributes -
     *            <code>BoundingBox</code>, <code>Confidence</code>,
     *            <code>Pose</code>, <code>Quality</code>, and
     *            <code>Landmarks</code> - will always be returned. You can
     *            request for specific facial attributes (in addition to the
     *            default list) - by using [
     *            <code>"DEFAULT", "FACE_OCCLUDED"</code>] or just [
     *            <code>"FACE_OCCLUDED"</code>]. You can request for all facial
     *            attributes by using [<code>"ALL"]</code>. Requesting more
     *            attributes may increase response time.
     *            </p>
     *            <p>
     *            If you provide both, <code>["ALL", "DEFAULT"]</code>, the
     *            service uses a logical "AND" operator to determine which
     *            attributes to return (in this case, all attributes).
     *            </p>
     *            <p>
     *            Note that while the FaceOccluded and EyeDirection attributes
     *            are supported when using <code>DetectFaces</code>, they aren't
     *            supported when analyzing videos with
     *            <code>StartFaceDetection</code> and
     *            <code>GetFaceDetection</code>.
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
     * An array of facial attributes you want to be returned. A
     * <code>DEFAULT</code> subset of facial attributes -
     * <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>,
     * <code>Quality</code>, and <code>Landmarks</code> - will always be
     * returned. You can request for specific facial attributes (in addition to
     * the default list) - by using [<code>"DEFAULT", "FACE_OCCLUDED"</code>] or
     * just [<code>"FACE_OCCLUDED"</code>]. You can request for all facial
     * attributes by using [<code>"ALL"]</code>. Requesting more attributes may
     * increase response time.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a
     * logical "AND" operator to determine which attributes to return (in this
     * case, all attributes).
     * </p>
     * <p>
     * Note that while the FaceOccluded and EyeDirection attributes are
     * supported when using <code>DetectFaces</code>, they aren't supported when
     * analyzing videos with <code>StartFaceDetection</code> and
     * <code>GetFaceDetection</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            An array of facial attributes you want to be returned. A
     *            <code>DEFAULT</code> subset of facial attributes -
     *            <code>BoundingBox</code>, <code>Confidence</code>,
     *            <code>Pose</code>, <code>Quality</code>, and
     *            <code>Landmarks</code> - will always be returned. You can
     *            request for specific facial attributes (in addition to the
     *            default list) - by using [
     *            <code>"DEFAULT", "FACE_OCCLUDED"</code>] or just [
     *            <code>"FACE_OCCLUDED"</code>]. You can request for all facial
     *            attributes by using [<code>"ALL"]</code>. Requesting more
     *            attributes may increase response time.
     *            </p>
     *            <p>
     *            If you provide both, <code>["ALL", "DEFAULT"]</code>, the
     *            service uses a logical "AND" operator to determine which
     *            attributes to return (in this case, all attributes).
     *            </p>
     *            <p>
     *            Note that while the FaceOccluded and EyeDirection attributes
     *            are supported when using <code>DetectFaces</code>, they aren't
     *            supported when analyzing videos with
     *            <code>StartFaceDetection</code> and
     *            <code>GetFaceDetection</code>.
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
     * An array of facial attributes you want to be returned. A
     * <code>DEFAULT</code> subset of facial attributes -
     * <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>,
     * <code>Quality</code>, and <code>Landmarks</code> - will always be
     * returned. You can request for specific facial attributes (in addition to
     * the default list) - by using [<code>"DEFAULT", "FACE_OCCLUDED"</code>] or
     * just [<code>"FACE_OCCLUDED"</code>]. You can request for all facial
     * attributes by using [<code>"ALL"]</code>. Requesting more attributes may
     * increase response time.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a
     * logical "AND" operator to determine which attributes to return (in this
     * case, all attributes).
     * </p>
     * <p>
     * Note that while the FaceOccluded and EyeDirection attributes are
     * supported when using <code>DetectFaces</code>, they aren't supported when
     * analyzing videos with <code>StartFaceDetection</code> and
     * <code>GetFaceDetection</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            An array of facial attributes you want to be returned. A
     *            <code>DEFAULT</code> subset of facial attributes -
     *            <code>BoundingBox</code>, <code>Confidence</code>,
     *            <code>Pose</code>, <code>Quality</code>, and
     *            <code>Landmarks</code> - will always be returned. You can
     *            request for specific facial attributes (in addition to the
     *            default list) - by using [
     *            <code>"DEFAULT", "FACE_OCCLUDED"</code>] or just [
     *            <code>"FACE_OCCLUDED"</code>]. You can request for all facial
     *            attributes by using [<code>"ALL"]</code>. Requesting more
     *            attributes may increase response time.
     *            </p>
     *            <p>
     *            If you provide both, <code>["ALL", "DEFAULT"]</code>, the
     *            service uses a logical "AND" operator to determine which
     *            attributes to return (in this case, all attributes).
     *            </p>
     *            <p>
     *            Note that while the FaceOccluded and EyeDirection attributes
     *            are supported when using <code>DetectFaces</code>, they aren't
     *            supported when analyzing videos with
     *            <code>StartFaceDetection</code> and
     *            <code>GetFaceDetection</code>.
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
