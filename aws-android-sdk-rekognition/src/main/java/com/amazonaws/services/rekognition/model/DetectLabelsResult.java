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

public class DetectLabelsResult implements Serializable {
    /**
     * <p>
     * An array of labels for the real-world objects detected.
     * </p>
     */
    private java.util.List<Label> labels;

    /**
     * <p>
     * The value of <code>OrientationCorrection</code> is always null.
     * </p>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image file format (Exif) metadata that includes the image's orientation.
     * Amazon Rekognition uses this orientation information to perform image
     * correction. The bounding box coordinates are translated to represent
     * object locations after the orientation information in the Exif metadata
     * is used to correct the image orientation. Images in .png format don't
     * contain Exif metadata.
     * </p>
     * <p>
     * Amazon Rekognition doesn’t perform image correction for images in .png
     * format and .jpeg images without orientation information in the image Exif
     * metadata. The bounding box coordinates aren't translated and represent
     * the object locations before the image is rotated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     */
    private String orientationCorrection;

    /**
     * <p>
     * Version number of the label detection model that was used to detect
     * labels.
     * </p>
     */
    private String labelModelVersion;

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
     * The value of <code>OrientationCorrection</code> is always null.
     * </p>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image file format (Exif) metadata that includes the image's orientation.
     * Amazon Rekognition uses this orientation information to perform image
     * correction. The bounding box coordinates are translated to represent
     * object locations after the orientation information in the Exif metadata
     * is used to correct the image orientation. Images in .png format don't
     * contain Exif metadata.
     * </p>
     * <p>
     * Amazon Rekognition doesn’t perform image correction for images in .png
     * format and .jpeg images without orientation information in the image Exif
     * metadata. The bounding box coordinates aren't translated and represent
     * the object locations before the image is rotated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @return <p>
     *         The value of <code>OrientationCorrection</code> is always null.
     *         </p>
     *         <p>
     *         If the input image is in .jpeg format, it might contain
     *         exchangeable image file format (Exif) metadata that includes the
     *         image's orientation. Amazon Rekognition uses this orientation
     *         information to perform image correction. The bounding box
     *         coordinates are translated to represent object locations after
     *         the orientation information in the Exif metadata is used to
     *         correct the image orientation. Images in .png format don't
     *         contain Exif metadata.
     *         </p>
     *         <p>
     *         Amazon Rekognition doesn’t perform image correction for images in
     *         .png format and .jpeg images without orientation information in
     *         the image Exif metadata. The bounding box coordinates aren't
     *         translated and represent the object locations before the image is
     *         rotated.
     *         </p>
     * @see OrientationCorrection
     */
    public String getOrientationCorrection() {
        return orientationCorrection;
    }

    /**
     * <p>
     * The value of <code>OrientationCorrection</code> is always null.
     * </p>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image file format (Exif) metadata that includes the image's orientation.
     * Amazon Rekognition uses this orientation information to perform image
     * correction. The bounding box coordinates are translated to represent
     * object locations after the orientation information in the Exif metadata
     * is used to correct the image orientation. Images in .png format don't
     * contain Exif metadata.
     * </p>
     * <p>
     * Amazon Rekognition doesn’t perform image correction for images in .png
     * format and .jpeg images without orientation information in the image Exif
     * metadata. The bounding box coordinates aren't translated and represent
     * the object locations before the image is rotated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            The value of <code>OrientationCorrection</code> is always
     *            null.
     *            </p>
     *            <p>
     *            If the input image is in .jpeg format, it might contain
     *            exchangeable image file format (Exif) metadata that includes
     *            the image's orientation. Amazon Rekognition uses this
     *            orientation information to perform image correction. The
     *            bounding box coordinates are translated to represent object
     *            locations after the orientation information in the Exif
     *            metadata is used to correct the image orientation. Images in
     *            .png format don't contain Exif metadata.
     *            </p>
     *            <p>
     *            Amazon Rekognition doesn’t perform image correction for images
     *            in .png format and .jpeg images without orientation
     *            information in the image Exif metadata. The bounding box
     *            coordinates aren't translated and represent the object
     *            locations before the image is rotated.
     *            </p>
     * @see OrientationCorrection
     */
    public void setOrientationCorrection(String orientationCorrection) {
        this.orientationCorrection = orientationCorrection;
    }

    /**
     * <p>
     * The value of <code>OrientationCorrection</code> is always null.
     * </p>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image file format (Exif) metadata that includes the image's orientation.
     * Amazon Rekognition uses this orientation information to perform image
     * correction. The bounding box coordinates are translated to represent
     * object locations after the orientation information in the Exif metadata
     * is used to correct the image orientation. Images in .png format don't
     * contain Exif metadata.
     * </p>
     * <p>
     * Amazon Rekognition doesn’t perform image correction for images in .png
     * format and .jpeg images without orientation information in the image Exif
     * metadata. The bounding box coordinates aren't translated and represent
     * the object locations before the image is rotated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            The value of <code>OrientationCorrection</code> is always
     *            null.
     *            </p>
     *            <p>
     *            If the input image is in .jpeg format, it might contain
     *            exchangeable image file format (Exif) metadata that includes
     *            the image's orientation. Amazon Rekognition uses this
     *            orientation information to perform image correction. The
     *            bounding box coordinates are translated to represent object
     *            locations after the orientation information in the Exif
     *            metadata is used to correct the image orientation. Images in
     *            .png format don't contain Exif metadata.
     *            </p>
     *            <p>
     *            Amazon Rekognition doesn’t perform image correction for images
     *            in .png format and .jpeg images without orientation
     *            information in the image Exif metadata. The bounding box
     *            coordinates aren't translated and represent the object
     *            locations before the image is rotated.
     *            </p>
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
     * The value of <code>OrientationCorrection</code> is always null.
     * </p>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image file format (Exif) metadata that includes the image's orientation.
     * Amazon Rekognition uses this orientation information to perform image
     * correction. The bounding box coordinates are translated to represent
     * object locations after the orientation information in the Exif metadata
     * is used to correct the image orientation. Images in .png format don't
     * contain Exif metadata.
     * </p>
     * <p>
     * Amazon Rekognition doesn’t perform image correction for images in .png
     * format and .jpeg images without orientation information in the image Exif
     * metadata. The bounding box coordinates aren't translated and represent
     * the object locations before the image is rotated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            The value of <code>OrientationCorrection</code> is always
     *            null.
     *            </p>
     *            <p>
     *            If the input image is in .jpeg format, it might contain
     *            exchangeable image file format (Exif) metadata that includes
     *            the image's orientation. Amazon Rekognition uses this
     *            orientation information to perform image correction. The
     *            bounding box coordinates are translated to represent object
     *            locations after the orientation information in the Exif
     *            metadata is used to correct the image orientation. Images in
     *            .png format don't contain Exif metadata.
     *            </p>
     *            <p>
     *            Amazon Rekognition doesn’t perform image correction for images
     *            in .png format and .jpeg images without orientation
     *            information in the image Exif metadata. The bounding box
     *            coordinates aren't translated and represent the object
     *            locations before the image is rotated.
     *            </p>
     * @see OrientationCorrection
     */
    public void setOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
    }

    /**
     * <p>
     * The value of <code>OrientationCorrection</code> is always null.
     * </p>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image file format (Exif) metadata that includes the image's orientation.
     * Amazon Rekognition uses this orientation information to perform image
     * correction. The bounding box coordinates are translated to represent
     * object locations after the orientation information in the Exif metadata
     * is used to correct the image orientation. Images in .png format don't
     * contain Exif metadata.
     * </p>
     * <p>
     * Amazon Rekognition doesn’t perform image correction for images in .png
     * format and .jpeg images without orientation information in the image Exif
     * metadata. The bounding box coordinates aren't translated and represent
     * the object locations before the image is rotated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            The value of <code>OrientationCorrection</code> is always
     *            null.
     *            </p>
     *            <p>
     *            If the input image is in .jpeg format, it might contain
     *            exchangeable image file format (Exif) metadata that includes
     *            the image's orientation. Amazon Rekognition uses this
     *            orientation information to perform image correction. The
     *            bounding box coordinates are translated to represent object
     *            locations after the orientation information in the Exif
     *            metadata is used to correct the image orientation. Images in
     *            .png format don't contain Exif metadata.
     *            </p>
     *            <p>
     *            Amazon Rekognition doesn’t perform image correction for images
     *            in .png format and .jpeg images without orientation
     *            information in the image Exif metadata. The bounding box
     *            coordinates aren't translated and represent the object
     *            locations before the image is rotated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrientationCorrection
     */
    public DetectLabelsResult withOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
        return this;
    }

    /**
     * <p>
     * Version number of the label detection model that was used to detect
     * labels.
     * </p>
     *
     * @return <p>
     *         Version number of the label detection model that was used to
     *         detect labels.
     *         </p>
     */
    public String getLabelModelVersion() {
        return labelModelVersion;
    }

    /**
     * <p>
     * Version number of the label detection model that was used to detect
     * labels.
     * </p>
     *
     * @param labelModelVersion <p>
     *            Version number of the label detection model that was used to
     *            detect labels.
     *            </p>
     */
    public void setLabelModelVersion(String labelModelVersion) {
        this.labelModelVersion = labelModelVersion;
    }

    /**
     * <p>
     * Version number of the label detection model that was used to detect
     * labels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelModelVersion <p>
     *            Version number of the label detection model that was used to
     *            detect labels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsResult withLabelModelVersion(String labelModelVersion) {
        this.labelModelVersion = labelModelVersion;
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
            sb.append("OrientationCorrection: " + getOrientationCorrection() + ",");
        if (getLabelModelVersion() != null)
            sb.append("LabelModelVersion: " + getLabelModelVersion());
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
        hashCode = prime * hashCode
                + ((getLabelModelVersion() == null) ? 0 : getLabelModelVersion().hashCode());
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
        if (other.getLabelModelVersion() == null ^ this.getLabelModelVersion() == null)
            return false;
        if (other.getLabelModelVersion() != null
                && other.getLabelModelVersion().equals(this.getLabelModelVersion()) == false)
            return false;
        return true;
    }
}
