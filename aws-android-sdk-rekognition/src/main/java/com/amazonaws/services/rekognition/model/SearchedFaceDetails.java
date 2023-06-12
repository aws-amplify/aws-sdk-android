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

/**
 * <p>
 * Contains data regarding the input face used for a search.
 * </p>
 */
public class SearchedFaceDetails implements Serializable {
    /**
     * <p>
     * Structure containing attributes of the face that the algorithm detected.
     * </p>
     * <p>
     * A <code>FaceDetail</code> object contains either the default facial
     * attributes or all facial attributes. The default attributes are
     * <code>BoundingBox</code>, <code>Confidence</code>, <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>.
     * </p>
     * <p>
     * <a>GetFaceDetection</a> is the only Amazon Rekognition Video stored video
     * operation that can return a <code>FaceDetail</code> object with all
     * attributes. To specify which attributes to return, use the
     * <code>FaceAttributes</code> input parameter for
     * <a>StartFaceDetection</a>. The following Amazon Rekognition Video
     * operations return only the default attributes. The corresponding Start
     * operations don't have a <code>FaceAttributes</code> input parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * GetCelebrityRecognition
     * </p>
     * </li>
     * <li>
     * <p>
     * GetPersonTracking
     * </p>
     * </li>
     * <li>
     * <p>
     * GetFaceSearch
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Amazon Rekognition Image <a>DetectFaces</a> and <a>IndexFaces</a>
     * operations can return all facial attributes. To specify which attributes
     * to return, use the <code>Attributes</code> input parameter for
     * <code>DetectFaces</code>. For <code>IndexFaces</code>, use the
     * <code>DetectAttributes</code> input parameter.
     * </p>
     */
    private FaceDetail faceDetail;

    /**
     * <p>
     * Structure containing attributes of the face that the algorithm detected.
     * </p>
     * <p>
     * A <code>FaceDetail</code> object contains either the default facial
     * attributes or all facial attributes. The default attributes are
     * <code>BoundingBox</code>, <code>Confidence</code>, <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>.
     * </p>
     * <p>
     * <a>GetFaceDetection</a> is the only Amazon Rekognition Video stored video
     * operation that can return a <code>FaceDetail</code> object with all
     * attributes. To specify which attributes to return, use the
     * <code>FaceAttributes</code> input parameter for
     * <a>StartFaceDetection</a>. The following Amazon Rekognition Video
     * operations return only the default attributes. The corresponding Start
     * operations don't have a <code>FaceAttributes</code> input parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * GetCelebrityRecognition
     * </p>
     * </li>
     * <li>
     * <p>
     * GetPersonTracking
     * </p>
     * </li>
     * <li>
     * <p>
     * GetFaceSearch
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Amazon Rekognition Image <a>DetectFaces</a> and <a>IndexFaces</a>
     * operations can return all facial attributes. To specify which attributes
     * to return, use the <code>Attributes</code> input parameter for
     * <code>DetectFaces</code>. For <code>IndexFaces</code>, use the
     * <code>DetectAttributes</code> input parameter.
     * </p>
     *
     * @return <p>
     *         Structure containing attributes of the face that the algorithm
     *         detected.
     *         </p>
     *         <p>
     *         A <code>FaceDetail</code> object contains either the default
     *         facial attributes or all facial attributes. The default
     *         attributes are <code>BoundingBox</code>, <code>Confidence</code>,
     *         <code>Landmarks</code>, <code>Pose</code>, and
     *         <code>Quality</code>.
     *         </p>
     *         <p>
     *         <a>GetFaceDetection</a> is the only Amazon Rekognition Video
     *         stored video operation that can return a <code>FaceDetail</code>
     *         object with all attributes. To specify which attributes to
     *         return, use the <code>FaceAttributes</code> input parameter for
     *         <a>StartFaceDetection</a>. The following Amazon Rekognition Video
     *         operations return only the default attributes. The corresponding
     *         Start operations don't have a <code>FaceAttributes</code> input
     *         parameter:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         GetCelebrityRecognition
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GetPersonTracking
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GetFaceSearch
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The Amazon Rekognition Image <a>DetectFaces</a> and
     *         <a>IndexFaces</a> operations can return all facial attributes. To
     *         specify which attributes to return, use the
     *         <code>Attributes</code> input parameter for
     *         <code>DetectFaces</code>. For <code>IndexFaces</code>, use the
     *         <code>DetectAttributes</code> input parameter.
     *         </p>
     */
    public FaceDetail getFaceDetail() {
        return faceDetail;
    }

    /**
     * <p>
     * Structure containing attributes of the face that the algorithm detected.
     * </p>
     * <p>
     * A <code>FaceDetail</code> object contains either the default facial
     * attributes or all facial attributes. The default attributes are
     * <code>BoundingBox</code>, <code>Confidence</code>, <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>.
     * </p>
     * <p>
     * <a>GetFaceDetection</a> is the only Amazon Rekognition Video stored video
     * operation that can return a <code>FaceDetail</code> object with all
     * attributes. To specify which attributes to return, use the
     * <code>FaceAttributes</code> input parameter for
     * <a>StartFaceDetection</a>. The following Amazon Rekognition Video
     * operations return only the default attributes. The corresponding Start
     * operations don't have a <code>FaceAttributes</code> input parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * GetCelebrityRecognition
     * </p>
     * </li>
     * <li>
     * <p>
     * GetPersonTracking
     * </p>
     * </li>
     * <li>
     * <p>
     * GetFaceSearch
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Amazon Rekognition Image <a>DetectFaces</a> and <a>IndexFaces</a>
     * operations can return all facial attributes. To specify which attributes
     * to return, use the <code>Attributes</code> input parameter for
     * <code>DetectFaces</code>. For <code>IndexFaces</code>, use the
     * <code>DetectAttributes</code> input parameter.
     * </p>
     *
     * @param faceDetail <p>
     *            Structure containing attributes of the face that the algorithm
     *            detected.
     *            </p>
     *            <p>
     *            A <code>FaceDetail</code> object contains either the default
     *            facial attributes or all facial attributes. The default
     *            attributes are <code>BoundingBox</code>,
     *            <code>Confidence</code>, <code>Landmarks</code>,
     *            <code>Pose</code>, and <code>Quality</code>.
     *            </p>
     *            <p>
     *            <a>GetFaceDetection</a> is the only Amazon Rekognition Video
     *            stored video operation that can return a
     *            <code>FaceDetail</code> object with all attributes. To specify
     *            which attributes to return, use the
     *            <code>FaceAttributes</code> input parameter for
     *            <a>StartFaceDetection</a>. The following Amazon Rekognition
     *            Video operations return only the default attributes. The
     *            corresponding Start operations don't have a
     *            <code>FaceAttributes</code> input parameter:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            GetCelebrityRecognition
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GetPersonTracking
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GetFaceSearch
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The Amazon Rekognition Image <a>DetectFaces</a> and
     *            <a>IndexFaces</a> operations can return all facial attributes.
     *            To specify which attributes to return, use the
     *            <code>Attributes</code> input parameter for
     *            <code>DetectFaces</code>. For <code>IndexFaces</code>, use the
     *            <code>DetectAttributes</code> input parameter.
     *            </p>
     */
    public void setFaceDetail(FaceDetail faceDetail) {
        this.faceDetail = faceDetail;
    }

    /**
     * <p>
     * Structure containing attributes of the face that the algorithm detected.
     * </p>
     * <p>
     * A <code>FaceDetail</code> object contains either the default facial
     * attributes or all facial attributes. The default attributes are
     * <code>BoundingBox</code>, <code>Confidence</code>, <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>.
     * </p>
     * <p>
     * <a>GetFaceDetection</a> is the only Amazon Rekognition Video stored video
     * operation that can return a <code>FaceDetail</code> object with all
     * attributes. To specify which attributes to return, use the
     * <code>FaceAttributes</code> input parameter for
     * <a>StartFaceDetection</a>. The following Amazon Rekognition Video
     * operations return only the default attributes. The corresponding Start
     * operations don't have a <code>FaceAttributes</code> input parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * GetCelebrityRecognition
     * </p>
     * </li>
     * <li>
     * <p>
     * GetPersonTracking
     * </p>
     * </li>
     * <li>
     * <p>
     * GetFaceSearch
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Amazon Rekognition Image <a>DetectFaces</a> and <a>IndexFaces</a>
     * operations can return all facial attributes. To specify which attributes
     * to return, use the <code>Attributes</code> input parameter for
     * <code>DetectFaces</code>. For <code>IndexFaces</code>, use the
     * <code>DetectAttributes</code> input parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceDetail <p>
     *            Structure containing attributes of the face that the algorithm
     *            detected.
     *            </p>
     *            <p>
     *            A <code>FaceDetail</code> object contains either the default
     *            facial attributes or all facial attributes. The default
     *            attributes are <code>BoundingBox</code>,
     *            <code>Confidence</code>, <code>Landmarks</code>,
     *            <code>Pose</code>, and <code>Quality</code>.
     *            </p>
     *            <p>
     *            <a>GetFaceDetection</a> is the only Amazon Rekognition Video
     *            stored video operation that can return a
     *            <code>FaceDetail</code> object with all attributes. To specify
     *            which attributes to return, use the
     *            <code>FaceAttributes</code> input parameter for
     *            <a>StartFaceDetection</a>. The following Amazon Rekognition
     *            Video operations return only the default attributes. The
     *            corresponding Start operations don't have a
     *            <code>FaceAttributes</code> input parameter:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            GetCelebrityRecognition
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GetPersonTracking
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GetFaceSearch
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The Amazon Rekognition Image <a>DetectFaces</a> and
     *            <a>IndexFaces</a> operations can return all facial attributes.
     *            To specify which attributes to return, use the
     *            <code>Attributes</code> input parameter for
     *            <code>DetectFaces</code>. For <code>IndexFaces</code>, use the
     *            <code>DetectAttributes</code> input parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchedFaceDetails withFaceDetail(FaceDetail faceDetail) {
        this.faceDetail = faceDetail;
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
        if (getFaceDetail() != null)
            sb.append("FaceDetail: " + getFaceDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFaceDetail() == null) ? 0 : getFaceDetail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchedFaceDetails == false)
            return false;
        SearchedFaceDetails other = (SearchedFaceDetails) obj;

        if (other.getFaceDetail() == null ^ this.getFaceDetail() == null)
            return false;
        if (other.getFaceDetail() != null
                && other.getFaceDetail().equals(this.getFaceDetail()) == false)
            return false;
        return true;
    }
}
