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

public class RecognizeCelebritiesResult implements Serializable {
    /**
     * <p>
     * Details about each celebrity found in the image. Amazon Rekognition can
     * detect a maximum of 15 celebrities in an image.
     * </p>
     */
    private java.util.List<Celebrity> celebrityFaces;

    /**
     * <p>
     * Details about each unrecognized face in the image.
     * </p>
     */
    private java.util.List<ComparedFace> unrecognizedFaces;

    /**
     * <p>
     * The orientation of the input image (counterclockwise direction). If your
     * application displays the image, you can use this value to correct the
     * orientation. The bounding box coordinates returned in
     * <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code> represent
     * face locations before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image (Exif) metadata that includes the image's orientation. If so, and
     * the Exif metadata for the input image populates the orientation field,
     * the value of <code>OrientationCorrection</code> is null and the
     * <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code> bounding
     * box coordinates represent face locations after Exif metadata is used to
     * correct the image orientation. Images in .png format don't contain Exif
     * metadata.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     */
    private String orientationCorrection;

    /**
     * <p>
     * Details about each celebrity found in the image. Amazon Rekognition can
     * detect a maximum of 15 celebrities in an image.
     * </p>
     *
     * @return <p>
     *         Details about each celebrity found in the image. Amazon
     *         Rekognition can detect a maximum of 15 celebrities in an image.
     *         </p>
     */
    public java.util.List<Celebrity> getCelebrityFaces() {
        return celebrityFaces;
    }

    /**
     * <p>
     * Details about each celebrity found in the image. Amazon Rekognition can
     * detect a maximum of 15 celebrities in an image.
     * </p>
     *
     * @param celebrityFaces <p>
     *            Details about each celebrity found in the image. Amazon
     *            Rekognition can detect a maximum of 15 celebrities in an
     *            image.
     *            </p>
     */
    public void setCelebrityFaces(java.util.Collection<Celebrity> celebrityFaces) {
        if (celebrityFaces == null) {
            this.celebrityFaces = null;
            return;
        }

        this.celebrityFaces = new java.util.ArrayList<Celebrity>(celebrityFaces);
    }

    /**
     * <p>
     * Details about each celebrity found in the image. Amazon Rekognition can
     * detect a maximum of 15 celebrities in an image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param celebrityFaces <p>
     *            Details about each celebrity found in the image. Amazon
     *            Rekognition can detect a maximum of 15 celebrities in an
     *            image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecognizeCelebritiesResult withCelebrityFaces(Celebrity... celebrityFaces) {
        if (getCelebrityFaces() == null) {
            this.celebrityFaces = new java.util.ArrayList<Celebrity>(celebrityFaces.length);
        }
        for (Celebrity value : celebrityFaces) {
            this.celebrityFaces.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Details about each celebrity found in the image. Amazon Rekognition can
     * detect a maximum of 15 celebrities in an image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param celebrityFaces <p>
     *            Details about each celebrity found in the image. Amazon
     *            Rekognition can detect a maximum of 15 celebrities in an
     *            image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecognizeCelebritiesResult withCelebrityFaces(
            java.util.Collection<Celebrity> celebrityFaces) {
        setCelebrityFaces(celebrityFaces);
        return this;
    }

    /**
     * <p>
     * Details about each unrecognized face in the image.
     * </p>
     *
     * @return <p>
     *         Details about each unrecognized face in the image.
     *         </p>
     */
    public java.util.List<ComparedFace> getUnrecognizedFaces() {
        return unrecognizedFaces;
    }

    /**
     * <p>
     * Details about each unrecognized face in the image.
     * </p>
     *
     * @param unrecognizedFaces <p>
     *            Details about each unrecognized face in the image.
     *            </p>
     */
    public void setUnrecognizedFaces(java.util.Collection<ComparedFace> unrecognizedFaces) {
        if (unrecognizedFaces == null) {
            this.unrecognizedFaces = null;
            return;
        }

        this.unrecognizedFaces = new java.util.ArrayList<ComparedFace>(unrecognizedFaces);
    }

    /**
     * <p>
     * Details about each unrecognized face in the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unrecognizedFaces <p>
     *            Details about each unrecognized face in the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecognizeCelebritiesResult withUnrecognizedFaces(ComparedFace... unrecognizedFaces) {
        if (getUnrecognizedFaces() == null) {
            this.unrecognizedFaces = new java.util.ArrayList<ComparedFace>(unrecognizedFaces.length);
        }
        for (ComparedFace value : unrecognizedFaces) {
            this.unrecognizedFaces.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Details about each unrecognized face in the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unrecognizedFaces <p>
     *            Details about each unrecognized face in the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecognizeCelebritiesResult withUnrecognizedFaces(
            java.util.Collection<ComparedFace> unrecognizedFaces) {
        setUnrecognizedFaces(unrecognizedFaces);
        return this;
    }

    /**
     * <p>
     * The orientation of the input image (counterclockwise direction). If your
     * application displays the image, you can use this value to correct the
     * orientation. The bounding box coordinates returned in
     * <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code> represent
     * face locations before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image (Exif) metadata that includes the image's orientation. If so, and
     * the Exif metadata for the input image populates the orientation field,
     * the value of <code>OrientationCorrection</code> is null and the
     * <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code> bounding
     * box coordinates represent face locations after Exif metadata is used to
     * correct the image orientation. Images in .png format don't contain Exif
     * metadata.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @return <p>
     *         The orientation of the input image (counterclockwise direction).
     *         If your application displays the image, you can use this value to
     *         correct the orientation. The bounding box coordinates returned in
     *         <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code>
     *         represent face locations before the image orientation is
     *         corrected.
     *         </p>
     *         <note>
     *         <p>
     *         If the input image is in .jpeg format, it might contain
     *         exchangeable image (Exif) metadata that includes the image's
     *         orientation. If so, and the Exif metadata for the input image
     *         populates the orientation field, the value of
     *         <code>OrientationCorrection</code> is null and the
     *         <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code>
     *         bounding box coordinates represent face locations after Exif
     *         metadata is used to correct the image orientation. Images in .png
     *         format don't contain Exif metadata.
     *         </p>
     *         </note>
     * @see OrientationCorrection
     */
    public String getOrientationCorrection() {
        return orientationCorrection;
    }

    /**
     * <p>
     * The orientation of the input image (counterclockwise direction). If your
     * application displays the image, you can use this value to correct the
     * orientation. The bounding box coordinates returned in
     * <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code> represent
     * face locations before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image (Exif) metadata that includes the image's orientation. If so, and
     * the Exif metadata for the input image populates the orientation field,
     * the value of <code>OrientationCorrection</code> is null and the
     * <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code> bounding
     * box coordinates represent face locations after Exif metadata is used to
     * correct the image orientation. Images in .png format don't contain Exif
     * metadata.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            The orientation of the input image (counterclockwise
     *            direction). If your application displays the image, you can
     *            use this value to correct the orientation. The bounding box
     *            coordinates returned in <code>CelebrityFaces</code> and
     *            <code>UnrecognizedFaces</code> represent face locations before
     *            the image orientation is corrected.
     *            </p>
     *            <note>
     *            <p>
     *            If the input image is in .jpeg format, it might contain
     *            exchangeable image (Exif) metadata that includes the image's
     *            orientation. If so, and the Exif metadata for the input image
     *            populates the orientation field, the value of
     *            <code>OrientationCorrection</code> is null and the
     *            <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code>
     *            bounding box coordinates represent face locations after Exif
     *            metadata is used to correct the image orientation. Images in
     *            .png format don't contain Exif metadata.
     *            </p>
     *            </note>
     * @see OrientationCorrection
     */
    public void setOrientationCorrection(String orientationCorrection) {
        this.orientationCorrection = orientationCorrection;
    }

    /**
     * <p>
     * The orientation of the input image (counterclockwise direction). If your
     * application displays the image, you can use this value to correct the
     * orientation. The bounding box coordinates returned in
     * <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code> represent
     * face locations before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image (Exif) metadata that includes the image's orientation. If so, and
     * the Exif metadata for the input image populates the orientation field,
     * the value of <code>OrientationCorrection</code> is null and the
     * <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code> bounding
     * box coordinates represent face locations after Exif metadata is used to
     * correct the image orientation. Images in .png format don't contain Exif
     * metadata.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            The orientation of the input image (counterclockwise
     *            direction). If your application displays the image, you can
     *            use this value to correct the orientation. The bounding box
     *            coordinates returned in <code>CelebrityFaces</code> and
     *            <code>UnrecognizedFaces</code> represent face locations before
     *            the image orientation is corrected.
     *            </p>
     *            <note>
     *            <p>
     *            If the input image is in .jpeg format, it might contain
     *            exchangeable image (Exif) metadata that includes the image's
     *            orientation. If so, and the Exif metadata for the input image
     *            populates the orientation field, the value of
     *            <code>OrientationCorrection</code> is null and the
     *            <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code>
     *            bounding box coordinates represent face locations after Exif
     *            metadata is used to correct the image orientation. Images in
     *            .png format don't contain Exif metadata.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrientationCorrection
     */
    public RecognizeCelebritiesResult withOrientationCorrection(String orientationCorrection) {
        this.orientationCorrection = orientationCorrection;
        return this;
    }

    /**
     * <p>
     * The orientation of the input image (counterclockwise direction). If your
     * application displays the image, you can use this value to correct the
     * orientation. The bounding box coordinates returned in
     * <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code> represent
     * face locations before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image (Exif) metadata that includes the image's orientation. If so, and
     * the Exif metadata for the input image populates the orientation field,
     * the value of <code>OrientationCorrection</code> is null and the
     * <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code> bounding
     * box coordinates represent face locations after Exif metadata is used to
     * correct the image orientation. Images in .png format don't contain Exif
     * metadata.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            The orientation of the input image (counterclockwise
     *            direction). If your application displays the image, you can
     *            use this value to correct the orientation. The bounding box
     *            coordinates returned in <code>CelebrityFaces</code> and
     *            <code>UnrecognizedFaces</code> represent face locations before
     *            the image orientation is corrected.
     *            </p>
     *            <note>
     *            <p>
     *            If the input image is in .jpeg format, it might contain
     *            exchangeable image (Exif) metadata that includes the image's
     *            orientation. If so, and the Exif metadata for the input image
     *            populates the orientation field, the value of
     *            <code>OrientationCorrection</code> is null and the
     *            <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code>
     *            bounding box coordinates represent face locations after Exif
     *            metadata is used to correct the image orientation. Images in
     *            .png format don't contain Exif metadata.
     *            </p>
     *            </note>
     * @see OrientationCorrection
     */
    public void setOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
    }

    /**
     * <p>
     * The orientation of the input image (counterclockwise direction). If your
     * application displays the image, you can use this value to correct the
     * orientation. The bounding box coordinates returned in
     * <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code> represent
     * face locations before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image (Exif) metadata that includes the image's orientation. If so, and
     * the Exif metadata for the input image populates the orientation field,
     * the value of <code>OrientationCorrection</code> is null and the
     * <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code> bounding
     * box coordinates represent face locations after Exif metadata is used to
     * correct the image orientation. Images in .png format don't contain Exif
     * metadata.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            The orientation of the input image (counterclockwise
     *            direction). If your application displays the image, you can
     *            use this value to correct the orientation. The bounding box
     *            coordinates returned in <code>CelebrityFaces</code> and
     *            <code>UnrecognizedFaces</code> represent face locations before
     *            the image orientation is corrected.
     *            </p>
     *            <note>
     *            <p>
     *            If the input image is in .jpeg format, it might contain
     *            exchangeable image (Exif) metadata that includes the image's
     *            orientation. If so, and the Exif metadata for the input image
     *            populates the orientation field, the value of
     *            <code>OrientationCorrection</code> is null and the
     *            <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code>
     *            bounding box coordinates represent face locations after Exif
     *            metadata is used to correct the image orientation. Images in
     *            .png format don't contain Exif metadata.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrientationCorrection
     */
    public RecognizeCelebritiesResult withOrientationCorrection(
            OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
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
        if (getCelebrityFaces() != null)
            sb.append("CelebrityFaces: " + getCelebrityFaces() + ",");
        if (getUnrecognizedFaces() != null)
            sb.append("UnrecognizedFaces: " + getUnrecognizedFaces() + ",");
        if (getOrientationCorrection() != null)
            sb.append("OrientationCorrection: " + getOrientationCorrection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCelebrityFaces() == null) ? 0 : getCelebrityFaces().hashCode());
        hashCode = prime * hashCode
                + ((getUnrecognizedFaces() == null) ? 0 : getUnrecognizedFaces().hashCode());
        hashCode = prime
                * hashCode
                + ((getOrientationCorrection() == null) ? 0 : getOrientationCorrection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecognizeCelebritiesResult == false)
            return false;
        RecognizeCelebritiesResult other = (RecognizeCelebritiesResult) obj;

        if (other.getCelebrityFaces() == null ^ this.getCelebrityFaces() == null)
            return false;
        if (other.getCelebrityFaces() != null
                && other.getCelebrityFaces().equals(this.getCelebrityFaces()) == false)
            return false;
        if (other.getUnrecognizedFaces() == null ^ this.getUnrecognizedFaces() == null)
            return false;
        if (other.getUnrecognizedFaces() != null
                && other.getUnrecognizedFaces().equals(this.getUnrecognizedFaces()) == false)
            return false;
        if (other.getOrientationCorrection() == null ^ this.getOrientationCorrection() == null)
            return false;
        if (other.getOrientationCorrection() != null
                && other.getOrientationCorrection().equals(this.getOrientationCorrection()) == false)
            return false;
        return true;
    }
}
