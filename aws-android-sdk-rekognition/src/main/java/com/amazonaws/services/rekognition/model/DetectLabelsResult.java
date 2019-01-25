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

public class DetectLabelsResult implements Serializable {
    /**
     * <p>
     * An array of labels for the real-world objects detected.
     * </p>
     */
    private java.util.List<Label> labels;

    /**
     * <p>
     * The orientation of the input image (counter-clockwise direction). If your
     * application displays the image, you can use this value to correct the
     * orientation. If Amazon Rekognition detects that the input image was
     * rotated (for example, by 90 degrees), it first corrects the orientation
     * before detecting the labels.
     * </p>
     * <note>
     * <p>
     * If the input image Exif metadata populates the orientation field, Amazon
     * Rekognition does not perform orientation correction and the value of
     * OrientationCorrection will be null.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     */
    private String orientationCorrection;

    /**
     * <p>
     * An array of labels for the real-world objects detected.
     * </p>
     *
     * @return <p>
     *         An array of labels for the real-world objects detected.
     *         </p>
     */
    public java.util.List<Label> getLabels() {
        return labels;
    }

    /**
     * <p>
     * An array of labels for the real-world objects detected.
     * </p>
     *
     * @param labels <p>
     *            An array of labels for the real-world objects detected.
     *            </p>
     */
    public void setLabels(java.util.Collection<Label> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<Label>(labels);
    }

    /**
     * <p>
     * An array of labels for the real-world objects detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labels <p>
     *            An array of labels for the real-world objects detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsResult withLabels(Label... labels) {
        if (getLabels() == null) {
            this.labels = new java.util.ArrayList<Label>(labels.length);
        }
        for (Label value : labels) {
            this.labels.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of labels for the real-world objects detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labels <p>
     *            An array of labels for the real-world objects detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsResult withLabels(java.util.Collection<Label> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * <p>
     * The orientation of the input image (counter-clockwise direction). If your
     * application displays the image, you can use this value to correct the
     * orientation. If Amazon Rekognition detects that the input image was
     * rotated (for example, by 90 degrees), it first corrects the orientation
     * before detecting the labels.
     * </p>
     * <note>
     * <p>
     * If the input image Exif metadata populates the orientation field, Amazon
     * Rekognition does not perform orientation correction and the value of
     * OrientationCorrection will be null.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @return <p>
     *         The orientation of the input image (counter-clockwise direction).
     *         If your application displays the image, you can use this value to
     *         correct the orientation. If Amazon Rekognition detects that the
     *         input image was rotated (for example, by 90 degrees), it first
     *         corrects the orientation before detecting the labels.
     *         </p>
     *         <note>
     *         <p>
     *         If the input image Exif metadata populates the orientation field,
     *         Amazon Rekognition does not perform orientation correction and
     *         the value of OrientationCorrection will be null.
     *         </p>
     *         </note>
     * @see OrientationCorrection
     */
    public String getOrientationCorrection() {
        return orientationCorrection;
    }

    /**
     * <p>
     * The orientation of the input image (counter-clockwise direction). If your
     * application displays the image, you can use this value to correct the
     * orientation. If Amazon Rekognition detects that the input image was
     * rotated (for example, by 90 degrees), it first corrects the orientation
     * before detecting the labels.
     * </p>
     * <note>
     * <p>
     * If the input image Exif metadata populates the orientation field, Amazon
     * Rekognition does not perform orientation correction and the value of
     * OrientationCorrection will be null.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            The orientation of the input image (counter-clockwise
     *            direction). If your application displays the image, you can
     *            use this value to correct the orientation. If Amazon
     *            Rekognition detects that the input image was rotated (for
     *            example, by 90 degrees), it first corrects the orientation
     *            before detecting the labels.
     *            </p>
     *            <note>
     *            <p>
     *            If the input image Exif metadata populates the orientation
     *            field, Amazon Rekognition does not perform orientation
     *            correction and the value of OrientationCorrection will be
     *            null.
     *            </p>
     *            </note>
     * @see OrientationCorrection
     */
    public void setOrientationCorrection(String orientationCorrection) {
        this.orientationCorrection = orientationCorrection;
    }

    /**
     * <p>
     * The orientation of the input image (counter-clockwise direction). If your
     * application displays the image, you can use this value to correct the
     * orientation. If Amazon Rekognition detects that the input image was
     * rotated (for example, by 90 degrees), it first corrects the orientation
     * before detecting the labels.
     * </p>
     * <note>
     * <p>
     * If the input image Exif metadata populates the orientation field, Amazon
     * Rekognition does not perform orientation correction and the value of
     * OrientationCorrection will be null.
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
     *            The orientation of the input image (counter-clockwise
     *            direction). If your application displays the image, you can
     *            use this value to correct the orientation. If Amazon
     *            Rekognition detects that the input image was rotated (for
     *            example, by 90 degrees), it first corrects the orientation
     *            before detecting the labels.
     *            </p>
     *            <note>
     *            <p>
     *            If the input image Exif metadata populates the orientation
     *            field, Amazon Rekognition does not perform orientation
     *            correction and the value of OrientationCorrection will be
     *            null.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrientationCorrection
     */
    public DetectLabelsResult withOrientationCorrection(String orientationCorrection) {
        this.orientationCorrection = orientationCorrection;
        return this;
    }

    /**
     * <p>
     * The orientation of the input image (counter-clockwise direction). If your
     * application displays the image, you can use this value to correct the
     * orientation. If Amazon Rekognition detects that the input image was
     * rotated (for example, by 90 degrees), it first corrects the orientation
     * before detecting the labels.
     * </p>
     * <note>
     * <p>
     * If the input image Exif metadata populates the orientation field, Amazon
     * Rekognition does not perform orientation correction and the value of
     * OrientationCorrection will be null.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            The orientation of the input image (counter-clockwise
     *            direction). If your application displays the image, you can
     *            use this value to correct the orientation. If Amazon
     *            Rekognition detects that the input image was rotated (for
     *            example, by 90 degrees), it first corrects the orientation
     *            before detecting the labels.
     *            </p>
     *            <note>
     *            <p>
     *            If the input image Exif metadata populates the orientation
     *            field, Amazon Rekognition does not perform orientation
     *            correction and the value of OrientationCorrection will be
     *            null.
     *            </p>
     *            </note>
     * @see OrientationCorrection
     */
    public void setOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
    }

    /**
     * <p>
     * The orientation of the input image (counter-clockwise direction). If your
     * application displays the image, you can use this value to correct the
     * orientation. If Amazon Rekognition detects that the input image was
     * rotated (for example, by 90 degrees), it first corrects the orientation
     * before detecting the labels.
     * </p>
     * <note>
     * <p>
     * If the input image Exif metadata populates the orientation field, Amazon
     * Rekognition does not perform orientation correction and the value of
     * OrientationCorrection will be null.
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
     *            The orientation of the input image (counter-clockwise
     *            direction). If your application displays the image, you can
     *            use this value to correct the orientation. If Amazon
     *            Rekognition detects that the input image was rotated (for
     *            example, by 90 degrees), it first corrects the orientation
     *            before detecting the labels.
     *            </p>
     *            <note>
     *            <p>
     *            If the input image Exif metadata populates the orientation
     *            field, Amazon Rekognition does not perform orientation
     *            correction and the value of OrientationCorrection will be
     *            null.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrientationCorrection
     */
    public DetectLabelsResult withOrientationCorrection(OrientationCorrection orientationCorrection) {
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
        if (getLabels() != null)
            sb.append("Labels: " + getLabels() + ",");
        if (getOrientationCorrection() != null)
            sb.append("OrientationCorrection: " + getOrientationCorrection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
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

        if (obj instanceof DetectLabelsResult == false)
            return false;
        DetectLabelsResult other = (DetectLabelsResult) obj;

        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getOrientationCorrection() == null ^ this.getOrientationCorrection() == null)
            return false;
        if (other.getOrientationCorrection() != null
                && other.getOrientationCorrection().equals(this.getOrientationCorrection()) == false)
            return false;
        return true;
    }
}
