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

public class IndexFacesResult implements Serializable {
    /**
     * <p>
     * An array of faces detected and added to the collection. For more
     * information, see Searching Faces in a Collection in the Amazon
     * Rekognition Developer Guide.
     * </p>
     */
    private java.util.List<FaceRecord> faceRecords;

    /**
     * <p>
     * If your collection is associated with a face detection model that's later
     * than version 3.0, the value of <code>OrientationCorrection</code> is
     * always null and no orientation information is returned.
     * </p>
     * <p>
     * If your collection is associated with a face detection model that's
     * version 3.0 or earlier, the following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image file format (Exif) metadata that includes the image's orientation.
     * Amazon Rekognition uses this orientation information to perform image
     * correction - the bounding box coordinates are translated to represent
     * object locations after the orientation information in the Exif metadata
     * is used to correct the image orientation. Images in .png format don't
     * contain Exif metadata. The value of <code>OrientationCorrection</code> is
     * null.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the image doesn't contain orientation information in its Exif
     * metadata, Amazon Rekognition returns an estimated orientation (ROTATE_0,
     * ROTATE_90, ROTATE_180, ROTATE_270). Amazon Rekognition doesn’t perform
     * image correction for images. The bounding box coordinates aren't
     * translated and represent the object locations before the image is
     * rotated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Bounding box information is returned in the <code>FaceRecords</code>
     * array. You can get the version of the face detection model by calling
     * <a>DescribeCollection</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     */
    private String orientationCorrection;

    /**
     * <p>
     * Latest face model being used with the collection. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/rekognition/latest/dg/face-detection-model.html"
     * >Model versioning</a>.
     * </p>
     */
    private String faceModelVersion;

    /**
     * <p>
     * An array of faces that were detected in the image but weren't indexed.
     * They weren't indexed because the quality filter identified them as low
     * quality, or the <code>MaxFaces</code> request parameter filtered them
     * out. To use the quality filter, you specify the
     * <code>QualityFilter</code> request parameter.
     * </p>
     */
    private java.util.List<UnindexedFace> unindexedFaces;

    /**
     * <p>
     * An array of faces detected and added to the collection. For more
     * information, see Searching Faces in a Collection in the Amazon
     * Rekognition Developer Guide.
     * </p>
     *
     * @return <p>
     *         An array of faces detected and added to the collection. For more
     *         information, see Searching Faces in a Collection in the Amazon
     *         Rekognition Developer Guide.
     *         </p>
     */
    public java.util.List<FaceRecord> getFaceRecords() {
        return faceRecords;
    }

    /**
     * <p>
     * An array of faces detected and added to the collection. For more
     * information, see Searching Faces in a Collection in the Amazon
     * Rekognition Developer Guide.
     * </p>
     *
     * @param faceRecords <p>
     *            An array of faces detected and added to the collection. For
     *            more information, see Searching Faces in a Collection in the
     *            Amazon Rekognition Developer Guide.
     *            </p>
     */
    public void setFaceRecords(java.util.Collection<FaceRecord> faceRecords) {
        if (faceRecords == null) {
            this.faceRecords = null;
            return;
        }

        this.faceRecords = new java.util.ArrayList<FaceRecord>(faceRecords);
    }

    /**
     * <p>
     * An array of faces detected and added to the collection. For more
     * information, see Searching Faces in a Collection in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceRecords <p>
     *            An array of faces detected and added to the collection. For
     *            more information, see Searching Faces in a Collection in the
     *            Amazon Rekognition Developer Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexFacesResult withFaceRecords(FaceRecord... faceRecords) {
        if (getFaceRecords() == null) {
            this.faceRecords = new java.util.ArrayList<FaceRecord>(faceRecords.length);
        }
        for (FaceRecord value : faceRecords) {
            this.faceRecords.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of faces detected and added to the collection. For more
     * information, see Searching Faces in a Collection in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceRecords <p>
     *            An array of faces detected and added to the collection. For
     *            more information, see Searching Faces in a Collection in the
     *            Amazon Rekognition Developer Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexFacesResult withFaceRecords(java.util.Collection<FaceRecord> faceRecords) {
        setFaceRecords(faceRecords);
        return this;
    }

    /**
     * <p>
     * If your collection is associated with a face detection model that's later
     * than version 3.0, the value of <code>OrientationCorrection</code> is
     * always null and no orientation information is returned.
     * </p>
     * <p>
     * If your collection is associated with a face detection model that's
     * version 3.0 or earlier, the following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image file format (Exif) metadata that includes the image's orientation.
     * Amazon Rekognition uses this orientation information to perform image
     * correction - the bounding box coordinates are translated to represent
     * object locations after the orientation information in the Exif metadata
     * is used to correct the image orientation. Images in .png format don't
     * contain Exif metadata. The value of <code>OrientationCorrection</code> is
     * null.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the image doesn't contain orientation information in its Exif
     * metadata, Amazon Rekognition returns an estimated orientation (ROTATE_0,
     * ROTATE_90, ROTATE_180, ROTATE_270). Amazon Rekognition doesn’t perform
     * image correction for images. The bounding box coordinates aren't
     * translated and represent the object locations before the image is
     * rotated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Bounding box information is returned in the <code>FaceRecords</code>
     * array. You can get the version of the face detection model by calling
     * <a>DescribeCollection</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @return <p>
     *         If your collection is associated with a face detection model
     *         that's later than version 3.0, the value of
     *         <code>OrientationCorrection</code> is always null and no
     *         orientation information is returned.
     *         </p>
     *         <p>
     *         If your collection is associated with a face detection model
     *         that's version 3.0 or earlier, the following applies:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the input image is in .jpeg format, it might contain
     *         exchangeable image file format (Exif) metadata that includes the
     *         image's orientation. Amazon Rekognition uses this orientation
     *         information to perform image correction - the bounding box
     *         coordinates are translated to represent object locations after
     *         the orientation information in the Exif metadata is used to
     *         correct the image orientation. Images in .png format don't
     *         contain Exif metadata. The value of
     *         <code>OrientationCorrection</code> is null.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the image doesn't contain orientation information in its Exif
     *         metadata, Amazon Rekognition returns an estimated orientation
     *         (ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270). Amazon Rekognition
     *         doesn’t perform image correction for images. The bounding box
     *         coordinates aren't translated and represent the object locations
     *         before the image is rotated.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Bounding box information is returned in the
     *         <code>FaceRecords</code> array. You can get the version of the
     *         face detection model by calling <a>DescribeCollection</a>.
     *         </p>
     * @see OrientationCorrection
     */
    public String getOrientationCorrection() {
        return orientationCorrection;
    }

    /**
     * <p>
     * If your collection is associated with a face detection model that's later
     * than version 3.0, the value of <code>OrientationCorrection</code> is
     * always null and no orientation information is returned.
     * </p>
     * <p>
     * If your collection is associated with a face detection model that's
     * version 3.0 or earlier, the following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image file format (Exif) metadata that includes the image's orientation.
     * Amazon Rekognition uses this orientation information to perform image
     * correction - the bounding box coordinates are translated to represent
     * object locations after the orientation information in the Exif metadata
     * is used to correct the image orientation. Images in .png format don't
     * contain Exif metadata. The value of <code>OrientationCorrection</code> is
     * null.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the image doesn't contain orientation information in its Exif
     * metadata, Amazon Rekognition returns an estimated orientation (ROTATE_0,
     * ROTATE_90, ROTATE_180, ROTATE_270). Amazon Rekognition doesn’t perform
     * image correction for images. The bounding box coordinates aren't
     * translated and represent the object locations before the image is
     * rotated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Bounding box information is returned in the <code>FaceRecords</code>
     * array. You can get the version of the face detection model by calling
     * <a>DescribeCollection</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            If your collection is associated with a face detection model
     *            that's later than version 3.0, the value of
     *            <code>OrientationCorrection</code> is always null and no
     *            orientation information is returned.
     *            </p>
     *            <p>
     *            If your collection is associated with a face detection model
     *            that's version 3.0 or earlier, the following applies:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the input image is in .jpeg format, it might contain
     *            exchangeable image file format (Exif) metadata that includes
     *            the image's orientation. Amazon Rekognition uses this
     *            orientation information to perform image correction - the
     *            bounding box coordinates are translated to represent object
     *            locations after the orientation information in the Exif
     *            metadata is used to correct the image orientation. Images in
     *            .png format don't contain Exif metadata. The value of
     *            <code>OrientationCorrection</code> is null.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the image doesn't contain orientation information in its
     *            Exif metadata, Amazon Rekognition returns an estimated
     *            orientation (ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270).
     *            Amazon Rekognition doesn’t perform image correction for
     *            images. The bounding box coordinates aren't translated and
     *            represent the object locations before the image is rotated.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Bounding box information is returned in the
     *            <code>FaceRecords</code> array. You can get the version of the
     *            face detection model by calling <a>DescribeCollection</a>.
     *            </p>
     * @see OrientationCorrection
     */
    public void setOrientationCorrection(String orientationCorrection) {
        this.orientationCorrection = orientationCorrection;
    }

    /**
     * <p>
     * If your collection is associated with a face detection model that's later
     * than version 3.0, the value of <code>OrientationCorrection</code> is
     * always null and no orientation information is returned.
     * </p>
     * <p>
     * If your collection is associated with a face detection model that's
     * version 3.0 or earlier, the following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image file format (Exif) metadata that includes the image's orientation.
     * Amazon Rekognition uses this orientation information to perform image
     * correction - the bounding box coordinates are translated to represent
     * object locations after the orientation information in the Exif metadata
     * is used to correct the image orientation. Images in .png format don't
     * contain Exif metadata. The value of <code>OrientationCorrection</code> is
     * null.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the image doesn't contain orientation information in its Exif
     * metadata, Amazon Rekognition returns an estimated orientation (ROTATE_0,
     * ROTATE_90, ROTATE_180, ROTATE_270). Amazon Rekognition doesn’t perform
     * image correction for images. The bounding box coordinates aren't
     * translated and represent the object locations before the image is
     * rotated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Bounding box information is returned in the <code>FaceRecords</code>
     * array. You can get the version of the face detection model by calling
     * <a>DescribeCollection</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            If your collection is associated with a face detection model
     *            that's later than version 3.0, the value of
     *            <code>OrientationCorrection</code> is always null and no
     *            orientation information is returned.
     *            </p>
     *            <p>
     *            If your collection is associated with a face detection model
     *            that's version 3.0 or earlier, the following applies:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the input image is in .jpeg format, it might contain
     *            exchangeable image file format (Exif) metadata that includes
     *            the image's orientation. Amazon Rekognition uses this
     *            orientation information to perform image correction - the
     *            bounding box coordinates are translated to represent object
     *            locations after the orientation information in the Exif
     *            metadata is used to correct the image orientation. Images in
     *            .png format don't contain Exif metadata. The value of
     *            <code>OrientationCorrection</code> is null.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the image doesn't contain orientation information in its
     *            Exif metadata, Amazon Rekognition returns an estimated
     *            orientation (ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270).
     *            Amazon Rekognition doesn’t perform image correction for
     *            images. The bounding box coordinates aren't translated and
     *            represent the object locations before the image is rotated.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Bounding box information is returned in the
     *            <code>FaceRecords</code> array. You can get the version of the
     *            face detection model by calling <a>DescribeCollection</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrientationCorrection
     */
    public IndexFacesResult withOrientationCorrection(String orientationCorrection) {
        this.orientationCorrection = orientationCorrection;
        return this;
    }

    /**
     * <p>
     * If your collection is associated with a face detection model that's later
     * than version 3.0, the value of <code>OrientationCorrection</code> is
     * always null and no orientation information is returned.
     * </p>
     * <p>
     * If your collection is associated with a face detection model that's
     * version 3.0 or earlier, the following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image file format (Exif) metadata that includes the image's orientation.
     * Amazon Rekognition uses this orientation information to perform image
     * correction - the bounding box coordinates are translated to represent
     * object locations after the orientation information in the Exif metadata
     * is used to correct the image orientation. Images in .png format don't
     * contain Exif metadata. The value of <code>OrientationCorrection</code> is
     * null.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the image doesn't contain orientation information in its Exif
     * metadata, Amazon Rekognition returns an estimated orientation (ROTATE_0,
     * ROTATE_90, ROTATE_180, ROTATE_270). Amazon Rekognition doesn’t perform
     * image correction for images. The bounding box coordinates aren't
     * translated and represent the object locations before the image is
     * rotated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Bounding box information is returned in the <code>FaceRecords</code>
     * array. You can get the version of the face detection model by calling
     * <a>DescribeCollection</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            If your collection is associated with a face detection model
     *            that's later than version 3.0, the value of
     *            <code>OrientationCorrection</code> is always null and no
     *            orientation information is returned.
     *            </p>
     *            <p>
     *            If your collection is associated with a face detection model
     *            that's version 3.0 or earlier, the following applies:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the input image is in .jpeg format, it might contain
     *            exchangeable image file format (Exif) metadata that includes
     *            the image's orientation. Amazon Rekognition uses this
     *            orientation information to perform image correction - the
     *            bounding box coordinates are translated to represent object
     *            locations after the orientation information in the Exif
     *            metadata is used to correct the image orientation. Images in
     *            .png format don't contain Exif metadata. The value of
     *            <code>OrientationCorrection</code> is null.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the image doesn't contain orientation information in its
     *            Exif metadata, Amazon Rekognition returns an estimated
     *            orientation (ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270).
     *            Amazon Rekognition doesn’t perform image correction for
     *            images. The bounding box coordinates aren't translated and
     *            represent the object locations before the image is rotated.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Bounding box information is returned in the
     *            <code>FaceRecords</code> array. You can get the version of the
     *            face detection model by calling <a>DescribeCollection</a>.
     *            </p>
     * @see OrientationCorrection
     */
    public void setOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
    }

    /**
     * <p>
     * If your collection is associated with a face detection model that's later
     * than version 3.0, the value of <code>OrientationCorrection</code> is
     * always null and no orientation information is returned.
     * </p>
     * <p>
     * If your collection is associated with a face detection model that's
     * version 3.0 or earlier, the following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image file format (Exif) metadata that includes the image's orientation.
     * Amazon Rekognition uses this orientation information to perform image
     * correction - the bounding box coordinates are translated to represent
     * object locations after the orientation information in the Exif metadata
     * is used to correct the image orientation. Images in .png format don't
     * contain Exif metadata. The value of <code>OrientationCorrection</code> is
     * null.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the image doesn't contain orientation information in its Exif
     * metadata, Amazon Rekognition returns an estimated orientation (ROTATE_0,
     * ROTATE_90, ROTATE_180, ROTATE_270). Amazon Rekognition doesn’t perform
     * image correction for images. The bounding box coordinates aren't
     * translated and represent the object locations before the image is
     * rotated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Bounding box information is returned in the <code>FaceRecords</code>
     * array. You can get the version of the face detection model by calling
     * <a>DescribeCollection</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            If your collection is associated with a face detection model
     *            that's later than version 3.0, the value of
     *            <code>OrientationCorrection</code> is always null and no
     *            orientation information is returned.
     *            </p>
     *            <p>
     *            If your collection is associated with a face detection model
     *            that's version 3.0 or earlier, the following applies:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the input image is in .jpeg format, it might contain
     *            exchangeable image file format (Exif) metadata that includes
     *            the image's orientation. Amazon Rekognition uses this
     *            orientation information to perform image correction - the
     *            bounding box coordinates are translated to represent object
     *            locations after the orientation information in the Exif
     *            metadata is used to correct the image orientation. Images in
     *            .png format don't contain Exif metadata. The value of
     *            <code>OrientationCorrection</code> is null.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the image doesn't contain orientation information in its
     *            Exif metadata, Amazon Rekognition returns an estimated
     *            orientation (ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270).
     *            Amazon Rekognition doesn’t perform image correction for
     *            images. The bounding box coordinates aren't translated and
     *            represent the object locations before the image is rotated.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Bounding box information is returned in the
     *            <code>FaceRecords</code> array. You can get the version of the
     *            face detection model by calling <a>DescribeCollection</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrientationCorrection
     */
    public IndexFacesResult withOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
        return this;
    }

    /**
     * <p>
     * Latest face model being used with the collection. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/rekognition/latest/dg/face-detection-model.html"
     * >Model versioning</a>.
     * </p>
     *
     * @return <p>
     *         Latest face model being used with the collection. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/rekognition/latest/dg/face-detection-model.html"
     *         >Model versioning</a>.
     *         </p>
     */
    public String getFaceModelVersion() {
        return faceModelVersion;
    }

    /**
     * <p>
     * Latest face model being used with the collection. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/rekognition/latest/dg/face-detection-model.html"
     * >Model versioning</a>.
     * </p>
     *
     * @param faceModelVersion <p>
     *            Latest face model being used with the collection. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/rekognition/latest/dg/face-detection-model.html"
     *            >Model versioning</a>.
     *            </p>
     */
    public void setFaceModelVersion(String faceModelVersion) {
        this.faceModelVersion = faceModelVersion;
    }

    /**
     * <p>
     * Latest face model being used with the collection. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/rekognition/latest/dg/face-detection-model.html"
     * >Model versioning</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceModelVersion <p>
     *            Latest face model being used with the collection. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/rekognition/latest/dg/face-detection-model.html"
     *            >Model versioning</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexFacesResult withFaceModelVersion(String faceModelVersion) {
        this.faceModelVersion = faceModelVersion;
        return this;
    }

    /**
     * <p>
     * An array of faces that were detected in the image but weren't indexed.
     * They weren't indexed because the quality filter identified them as low
     * quality, or the <code>MaxFaces</code> request parameter filtered them
     * out. To use the quality filter, you specify the
     * <code>QualityFilter</code> request parameter.
     * </p>
     *
     * @return <p>
     *         An array of faces that were detected in the image but weren't
     *         indexed. They weren't indexed because the quality filter
     *         identified them as low quality, or the <code>MaxFaces</code>
     *         request parameter filtered them out. To use the quality filter,
     *         you specify the <code>QualityFilter</code> request parameter.
     *         </p>
     */
    public java.util.List<UnindexedFace> getUnindexedFaces() {
        return unindexedFaces;
    }

    /**
     * <p>
     * An array of faces that were detected in the image but weren't indexed.
     * They weren't indexed because the quality filter identified them as low
     * quality, or the <code>MaxFaces</code> request parameter filtered them
     * out. To use the quality filter, you specify the
     * <code>QualityFilter</code> request parameter.
     * </p>
     *
     * @param unindexedFaces <p>
     *            An array of faces that were detected in the image but weren't
     *            indexed. They weren't indexed because the quality filter
     *            identified them as low quality, or the <code>MaxFaces</code>
     *            request parameter filtered them out. To use the quality
     *            filter, you specify the <code>QualityFilter</code> request
     *            parameter.
     *            </p>
     */
    public void setUnindexedFaces(java.util.Collection<UnindexedFace> unindexedFaces) {
        if (unindexedFaces == null) {
            this.unindexedFaces = null;
            return;
        }

        this.unindexedFaces = new java.util.ArrayList<UnindexedFace>(unindexedFaces);
    }

    /**
     * <p>
     * An array of faces that were detected in the image but weren't indexed.
     * They weren't indexed because the quality filter identified them as low
     * quality, or the <code>MaxFaces</code> request parameter filtered them
     * out. To use the quality filter, you specify the
     * <code>QualityFilter</code> request parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unindexedFaces <p>
     *            An array of faces that were detected in the image but weren't
     *            indexed. They weren't indexed because the quality filter
     *            identified them as low quality, or the <code>MaxFaces</code>
     *            request parameter filtered them out. To use the quality
     *            filter, you specify the <code>QualityFilter</code> request
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexFacesResult withUnindexedFaces(UnindexedFace... unindexedFaces) {
        if (getUnindexedFaces() == null) {
            this.unindexedFaces = new java.util.ArrayList<UnindexedFace>(unindexedFaces.length);
        }
        for (UnindexedFace value : unindexedFaces) {
            this.unindexedFaces.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of faces that were detected in the image but weren't indexed.
     * They weren't indexed because the quality filter identified them as low
     * quality, or the <code>MaxFaces</code> request parameter filtered them
     * out. To use the quality filter, you specify the
     * <code>QualityFilter</code> request parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unindexedFaces <p>
     *            An array of faces that were detected in the image but weren't
     *            indexed. They weren't indexed because the quality filter
     *            identified them as low quality, or the <code>MaxFaces</code>
     *            request parameter filtered them out. To use the quality
     *            filter, you specify the <code>QualityFilter</code> request
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexFacesResult withUnindexedFaces(java.util.Collection<UnindexedFace> unindexedFaces) {
        setUnindexedFaces(unindexedFaces);
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
        if (getFaceRecords() != null)
            sb.append("FaceRecords: " + getFaceRecords() + ",");
        if (getOrientationCorrection() != null)
            sb.append("OrientationCorrection: " + getOrientationCorrection() + ",");
        if (getFaceModelVersion() != null)
            sb.append("FaceModelVersion: " + getFaceModelVersion() + ",");
        if (getUnindexedFaces() != null)
            sb.append("UnindexedFaces: " + getUnindexedFaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFaceRecords() == null) ? 0 : getFaceRecords().hashCode());
        hashCode = prime
                * hashCode
                + ((getOrientationCorrection() == null) ? 0 : getOrientationCorrection().hashCode());
        hashCode = prime * hashCode
                + ((getFaceModelVersion() == null) ? 0 : getFaceModelVersion().hashCode());
        hashCode = prime * hashCode
                + ((getUnindexedFaces() == null) ? 0 : getUnindexedFaces().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IndexFacesResult == false)
            return false;
        IndexFacesResult other = (IndexFacesResult) obj;

        if (other.getFaceRecords() == null ^ this.getFaceRecords() == null)
            return false;
        if (other.getFaceRecords() != null
                && other.getFaceRecords().equals(this.getFaceRecords()) == false)
            return false;
        if (other.getOrientationCorrection() == null ^ this.getOrientationCorrection() == null)
            return false;
        if (other.getOrientationCorrection() != null
                && other.getOrientationCorrection().equals(this.getOrientationCorrection()) == false)
            return false;
        if (other.getFaceModelVersion() == null ^ this.getFaceModelVersion() == null)
            return false;
        if (other.getFaceModelVersion() != null
                && other.getFaceModelVersion().equals(this.getFaceModelVersion()) == false)
            return false;
        if (other.getUnindexedFaces() == null ^ this.getUnindexedFaces() == null)
            return false;
        if (other.getUnindexedFaces() != null
                && other.getUnindexedFaces().equals(this.getUnindexedFaces()) == false)
            return false;
        return true;
    }
}
