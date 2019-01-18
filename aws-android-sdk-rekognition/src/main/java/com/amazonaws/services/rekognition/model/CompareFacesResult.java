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

public class CompareFacesResult implements Serializable {
    /**
     * <p>
     * The face in the source image that was used for comparison.
     * </p>
     */
    private ComparedSourceImageFace sourceImageFace;

    /**
     * <p>
     * An array of faces in the target image that match the source image face.
     * Each <code>CompareFacesMatch</code> object provides the bounding box, the
     * confidence level that the bounding box contains a face, and the
     * similarity score for the face in the bounding box and the face in the
     * source image.
     * </p>
     */
    private java.util.List<CompareFacesMatch> faceMatches;

    /**
     * <p>
     * An array of faces in the target image that did not match the source image
     * face.
     * </p>
     */
    private java.util.List<ComparedFace> unmatchedFaces;

    /**
     * <p>
     * The orientation of the source image (counterclockwise direction). If your
     * application displays the source image, you can use this value to correct
     * image orientation. The bounding box coordinates returned in
     * <code>SourceImageFace</code> represent the location of the face before
     * the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the source image is in .jpeg format, it might contain exchangeable
     * image (Exif) metadata that includes the image's orientation. If the Exif
     * metadata for the source image populates the orientation field, the value
     * of <code>OrientationCorrection</code> is null and the
     * <code>SourceImageFace</code> bounding box coordinates represent the
     * location of the face after Exif metadata is used to correct the
     * orientation. Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     */
    private String sourceImageOrientationCorrection;

    /**
     * <p>
     * The orientation of the target image (in counterclockwise direction). If
     * your application displays the target image, you can use this value to
     * correct the orientation of the image. The bounding box coordinates
     * returned in <code>FaceMatches</code> and <code>UnmatchedFaces</code>
     * represent face locations before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the target image is in .jpg format, it might contain Exif metadata
     * that includes the orientation of the image. If the Exif metadata for the
     * target image populates the orientation field, the value of
     * <code>OrientationCorrection</code> is null and the bounding box
     * coordinates in <code>FaceMatches</code> and <code>UnmatchedFaces</code>
     * represent the location of the face after Exif metadata is used to correct
     * the orientation. Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     */
    private String targetImageOrientationCorrection;

    /**
     * <p>
     * The face in the source image that was used for comparison.
     * </p>
     *
     * @return <p>
     *         The face in the source image that was used for comparison.
     *         </p>
     */
    public ComparedSourceImageFace getSourceImageFace() {
        return sourceImageFace;
    }

    /**
     * <p>
     * The face in the source image that was used for comparison.
     * </p>
     *
     * @param sourceImageFace <p>
     *            The face in the source image that was used for comparison.
     *            </p>
     */
    public void setSourceImageFace(ComparedSourceImageFace sourceImageFace) {
        this.sourceImageFace = sourceImageFace;
    }

    /**
     * <p>
     * The face in the source image that was used for comparison.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceImageFace <p>
     *            The face in the source image that was used for comparison.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompareFacesResult withSourceImageFace(ComparedSourceImageFace sourceImageFace) {
        this.sourceImageFace = sourceImageFace;
        return this;
    }

    /**
     * <p>
     * An array of faces in the target image that match the source image face.
     * Each <code>CompareFacesMatch</code> object provides the bounding box, the
     * confidence level that the bounding box contains a face, and the
     * similarity score for the face in the bounding box and the face in the
     * source image.
     * </p>
     *
     * @return <p>
     *         An array of faces in the target image that match the source image
     *         face. Each <code>CompareFacesMatch</code> object provides the
     *         bounding box, the confidence level that the bounding box contains
     *         a face, and the similarity score for the face in the bounding box
     *         and the face in the source image.
     *         </p>
     */
    public java.util.List<CompareFacesMatch> getFaceMatches() {
        return faceMatches;
    }

    /**
     * <p>
     * An array of faces in the target image that match the source image face.
     * Each <code>CompareFacesMatch</code> object provides the bounding box, the
     * confidence level that the bounding box contains a face, and the
     * similarity score for the face in the bounding box and the face in the
     * source image.
     * </p>
     *
     * @param faceMatches <p>
     *            An array of faces in the target image that match the source
     *            image face. Each <code>CompareFacesMatch</code> object
     *            provides the bounding box, the confidence level that the
     *            bounding box contains a face, and the similarity score for the
     *            face in the bounding box and the face in the source image.
     *            </p>
     */
    public void setFaceMatches(java.util.Collection<CompareFacesMatch> faceMatches) {
        if (faceMatches == null) {
            this.faceMatches = null;
            return;
        }

        this.faceMatches = new java.util.ArrayList<CompareFacesMatch>(faceMatches);
    }

    /**
     * <p>
     * An array of faces in the target image that match the source image face.
     * Each <code>CompareFacesMatch</code> object provides the bounding box, the
     * confidence level that the bounding box contains a face, and the
     * similarity score for the face in the bounding box and the face in the
     * source image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceMatches <p>
     *            An array of faces in the target image that match the source
     *            image face. Each <code>CompareFacesMatch</code> object
     *            provides the bounding box, the confidence level that the
     *            bounding box contains a face, and the similarity score for the
     *            face in the bounding box and the face in the source image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompareFacesResult withFaceMatches(CompareFacesMatch... faceMatches) {
        if (getFaceMatches() == null) {
            this.faceMatches = new java.util.ArrayList<CompareFacesMatch>(faceMatches.length);
        }
        for (CompareFacesMatch value : faceMatches) {
            this.faceMatches.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of faces in the target image that match the source image face.
     * Each <code>CompareFacesMatch</code> object provides the bounding box, the
     * confidence level that the bounding box contains a face, and the
     * similarity score for the face in the bounding box and the face in the
     * source image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceMatches <p>
     *            An array of faces in the target image that match the source
     *            image face. Each <code>CompareFacesMatch</code> object
     *            provides the bounding box, the confidence level that the
     *            bounding box contains a face, and the similarity score for the
     *            face in the bounding box and the face in the source image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompareFacesResult withFaceMatches(java.util.Collection<CompareFacesMatch> faceMatches) {
        setFaceMatches(faceMatches);
        return this;
    }

    /**
     * <p>
     * An array of faces in the target image that did not match the source image
     * face.
     * </p>
     *
     * @return <p>
     *         An array of faces in the target image that did not match the
     *         source image face.
     *         </p>
     */
    public java.util.List<ComparedFace> getUnmatchedFaces() {
        return unmatchedFaces;
    }

    /**
     * <p>
     * An array of faces in the target image that did not match the source image
     * face.
     * </p>
     *
     * @param unmatchedFaces <p>
     *            An array of faces in the target image that did not match the
     *            source image face.
     *            </p>
     */
    public void setUnmatchedFaces(java.util.Collection<ComparedFace> unmatchedFaces) {
        if (unmatchedFaces == null) {
            this.unmatchedFaces = null;
            return;
        }

        this.unmatchedFaces = new java.util.ArrayList<ComparedFace>(unmatchedFaces);
    }

    /**
     * <p>
     * An array of faces in the target image that did not match the source image
     * face.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unmatchedFaces <p>
     *            An array of faces in the target image that did not match the
     *            source image face.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompareFacesResult withUnmatchedFaces(ComparedFace... unmatchedFaces) {
        if (getUnmatchedFaces() == null) {
            this.unmatchedFaces = new java.util.ArrayList<ComparedFace>(unmatchedFaces.length);
        }
        for (ComparedFace value : unmatchedFaces) {
            this.unmatchedFaces.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of faces in the target image that did not match the source image
     * face.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unmatchedFaces <p>
     *            An array of faces in the target image that did not match the
     *            source image face.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompareFacesResult withUnmatchedFaces(java.util.Collection<ComparedFace> unmatchedFaces) {
        setUnmatchedFaces(unmatchedFaces);
        return this;
    }

    /**
     * <p>
     * The orientation of the source image (counterclockwise direction). If your
     * application displays the source image, you can use this value to correct
     * image orientation. The bounding box coordinates returned in
     * <code>SourceImageFace</code> represent the location of the face before
     * the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the source image is in .jpeg format, it might contain exchangeable
     * image (Exif) metadata that includes the image's orientation. If the Exif
     * metadata for the source image populates the orientation field, the value
     * of <code>OrientationCorrection</code> is null and the
     * <code>SourceImageFace</code> bounding box coordinates represent the
     * location of the face after Exif metadata is used to correct the
     * orientation. Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @return <p>
     *         The orientation of the source image (counterclockwise direction).
     *         If your application displays the source image, you can use this
     *         value to correct image orientation. The bounding box coordinates
     *         returned in <code>SourceImageFace</code> represent the location
     *         of the face before the image orientation is corrected.
     *         </p>
     *         <note>
     *         <p>
     *         If the source image is in .jpeg format, it might contain
     *         exchangeable image (Exif) metadata that includes the image's
     *         orientation. If the Exif metadata for the source image populates
     *         the orientation field, the value of
     *         <code>OrientationCorrection</code> is null and the
     *         <code>SourceImageFace</code> bounding box coordinates represent
     *         the location of the face after Exif metadata is used to correct
     *         the orientation. Images in .png format don't contain Exif
     *         metadata.
     *         </p>
     *         </note>
     * @see OrientationCorrection
     */
    public String getSourceImageOrientationCorrection() {
        return sourceImageOrientationCorrection;
    }

    /**
     * <p>
     * The orientation of the source image (counterclockwise direction). If your
     * application displays the source image, you can use this value to correct
     * image orientation. The bounding box coordinates returned in
     * <code>SourceImageFace</code> represent the location of the face before
     * the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the source image is in .jpeg format, it might contain exchangeable
     * image (Exif) metadata that includes the image's orientation. If the Exif
     * metadata for the source image populates the orientation field, the value
     * of <code>OrientationCorrection</code> is null and the
     * <code>SourceImageFace</code> bounding box coordinates represent the
     * location of the face after Exif metadata is used to correct the
     * orientation. Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param sourceImageOrientationCorrection <p>
     *            The orientation of the source image (counterclockwise
     *            direction). If your application displays the source image, you
     *            can use this value to correct image orientation. The bounding
     *            box coordinates returned in <code>SourceImageFace</code>
     *            represent the location of the face before the image
     *            orientation is corrected.
     *            </p>
     *            <note>
     *            <p>
     *            If the source image is in .jpeg format, it might contain
     *            exchangeable image (Exif) metadata that includes the image's
     *            orientation. If the Exif metadata for the source image
     *            populates the orientation field, the value of
     *            <code>OrientationCorrection</code> is null and the
     *            <code>SourceImageFace</code> bounding box coordinates
     *            represent the location of the face after Exif metadata is used
     *            to correct the orientation. Images in .png format don't
     *            contain Exif metadata.
     *            </p>
     *            </note>
     * @see OrientationCorrection
     */
    public void setSourceImageOrientationCorrection(String sourceImageOrientationCorrection) {
        this.sourceImageOrientationCorrection = sourceImageOrientationCorrection;
    }

    /**
     * <p>
     * The orientation of the source image (counterclockwise direction). If your
     * application displays the source image, you can use this value to correct
     * image orientation. The bounding box coordinates returned in
     * <code>SourceImageFace</code> represent the location of the face before
     * the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the source image is in .jpeg format, it might contain exchangeable
     * image (Exif) metadata that includes the image's orientation. If the Exif
     * metadata for the source image populates the orientation field, the value
     * of <code>OrientationCorrection</code> is null and the
     * <code>SourceImageFace</code> bounding box coordinates represent the
     * location of the face after Exif metadata is used to correct the
     * orientation. Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param sourceImageOrientationCorrection <p>
     *            The orientation of the source image (counterclockwise
     *            direction). If your application displays the source image, you
     *            can use this value to correct image orientation. The bounding
     *            box coordinates returned in <code>SourceImageFace</code>
     *            represent the location of the face before the image
     *            orientation is corrected.
     *            </p>
     *            <note>
     *            <p>
     *            If the source image is in .jpeg format, it might contain
     *            exchangeable image (Exif) metadata that includes the image's
     *            orientation. If the Exif metadata for the source image
     *            populates the orientation field, the value of
     *            <code>OrientationCorrection</code> is null and the
     *            <code>SourceImageFace</code> bounding box coordinates
     *            represent the location of the face after Exif metadata is used
     *            to correct the orientation. Images in .png format don't
     *            contain Exif metadata.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrientationCorrection
     */
    public CompareFacesResult withSourceImageOrientationCorrection(
            String sourceImageOrientationCorrection) {
        this.sourceImageOrientationCorrection = sourceImageOrientationCorrection;
        return this;
    }

    /**
     * <p>
     * The orientation of the source image (counterclockwise direction). If your
     * application displays the source image, you can use this value to correct
     * image orientation. The bounding box coordinates returned in
     * <code>SourceImageFace</code> represent the location of the face before
     * the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the source image is in .jpeg format, it might contain exchangeable
     * image (Exif) metadata that includes the image's orientation. If the Exif
     * metadata for the source image populates the orientation field, the value
     * of <code>OrientationCorrection</code> is null and the
     * <code>SourceImageFace</code> bounding box coordinates represent the
     * location of the face after Exif metadata is used to correct the
     * orientation. Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param sourceImageOrientationCorrection <p>
     *            The orientation of the source image (counterclockwise
     *            direction). If your application displays the source image, you
     *            can use this value to correct image orientation. The bounding
     *            box coordinates returned in <code>SourceImageFace</code>
     *            represent the location of the face before the image
     *            orientation is corrected.
     *            </p>
     *            <note>
     *            <p>
     *            If the source image is in .jpeg format, it might contain
     *            exchangeable image (Exif) metadata that includes the image's
     *            orientation. If the Exif metadata for the source image
     *            populates the orientation field, the value of
     *            <code>OrientationCorrection</code> is null and the
     *            <code>SourceImageFace</code> bounding box coordinates
     *            represent the location of the face after Exif metadata is used
     *            to correct the orientation. Images in .png format don't
     *            contain Exif metadata.
     *            </p>
     *            </note>
     * @see OrientationCorrection
     */
    public void setSourceImageOrientationCorrection(
            OrientationCorrection sourceImageOrientationCorrection) {
        this.sourceImageOrientationCorrection = sourceImageOrientationCorrection.toString();
    }

    /**
     * <p>
     * The orientation of the source image (counterclockwise direction). If your
     * application displays the source image, you can use this value to correct
     * image orientation. The bounding box coordinates returned in
     * <code>SourceImageFace</code> represent the location of the face before
     * the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the source image is in .jpeg format, it might contain exchangeable
     * image (Exif) metadata that includes the image's orientation. If the Exif
     * metadata for the source image populates the orientation field, the value
     * of <code>OrientationCorrection</code> is null and the
     * <code>SourceImageFace</code> bounding box coordinates represent the
     * location of the face after Exif metadata is used to correct the
     * orientation. Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param sourceImageOrientationCorrection <p>
     *            The orientation of the source image (counterclockwise
     *            direction). If your application displays the source image, you
     *            can use this value to correct image orientation. The bounding
     *            box coordinates returned in <code>SourceImageFace</code>
     *            represent the location of the face before the image
     *            orientation is corrected.
     *            </p>
     *            <note>
     *            <p>
     *            If the source image is in .jpeg format, it might contain
     *            exchangeable image (Exif) metadata that includes the image's
     *            orientation. If the Exif metadata for the source image
     *            populates the orientation field, the value of
     *            <code>OrientationCorrection</code> is null and the
     *            <code>SourceImageFace</code> bounding box coordinates
     *            represent the location of the face after Exif metadata is used
     *            to correct the orientation. Images in .png format don't
     *            contain Exif metadata.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrientationCorrection
     */
    public CompareFacesResult withSourceImageOrientationCorrection(
            OrientationCorrection sourceImageOrientationCorrection) {
        this.sourceImageOrientationCorrection = sourceImageOrientationCorrection.toString();
        return this;
    }

    /**
     * <p>
     * The orientation of the target image (in counterclockwise direction). If
     * your application displays the target image, you can use this value to
     * correct the orientation of the image. The bounding box coordinates
     * returned in <code>FaceMatches</code> and <code>UnmatchedFaces</code>
     * represent face locations before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the target image is in .jpg format, it might contain Exif metadata
     * that includes the orientation of the image. If the Exif metadata for the
     * target image populates the orientation field, the value of
     * <code>OrientationCorrection</code> is null and the bounding box
     * coordinates in <code>FaceMatches</code> and <code>UnmatchedFaces</code>
     * represent the location of the face after Exif metadata is used to correct
     * the orientation. Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @return <p>
     *         The orientation of the target image (in counterclockwise
     *         direction). If your application displays the target image, you
     *         can use this value to correct the orientation of the image. The
     *         bounding box coordinates returned in <code>FaceMatches</code> and
     *         <code>UnmatchedFaces</code> represent face locations before the
     *         image orientation is corrected.
     *         </p>
     *         <note>
     *         <p>
     *         If the target image is in .jpg format, it might contain Exif
     *         metadata that includes the orientation of the image. If the Exif
     *         metadata for the target image populates the orientation field,
     *         the value of <code>OrientationCorrection</code> is null and the
     *         bounding box coordinates in <code>FaceMatches</code> and
     *         <code>UnmatchedFaces</code> represent the location of the face
     *         after Exif metadata is used to correct the orientation. Images in
     *         .png format don't contain Exif metadata.
     *         </p>
     *         </note>
     * @see OrientationCorrection
     */
    public String getTargetImageOrientationCorrection() {
        return targetImageOrientationCorrection;
    }

    /**
     * <p>
     * The orientation of the target image (in counterclockwise direction). If
     * your application displays the target image, you can use this value to
     * correct the orientation of the image. The bounding box coordinates
     * returned in <code>FaceMatches</code> and <code>UnmatchedFaces</code>
     * represent face locations before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the target image is in .jpg format, it might contain Exif metadata
     * that includes the orientation of the image. If the Exif metadata for the
     * target image populates the orientation field, the value of
     * <code>OrientationCorrection</code> is null and the bounding box
     * coordinates in <code>FaceMatches</code> and <code>UnmatchedFaces</code>
     * represent the location of the face after Exif metadata is used to correct
     * the orientation. Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param targetImageOrientationCorrection <p>
     *            The orientation of the target image (in counterclockwise
     *            direction). If your application displays the target image, you
     *            can use this value to correct the orientation of the image.
     *            The bounding box coordinates returned in
     *            <code>FaceMatches</code> and <code>UnmatchedFaces</code>
     *            represent face locations before the image orientation is
     *            corrected.
     *            </p>
     *            <note>
     *            <p>
     *            If the target image is in .jpg format, it might contain Exif
     *            metadata that includes the orientation of the image. If the
     *            Exif metadata for the target image populates the orientation
     *            field, the value of <code>OrientationCorrection</code> is null
     *            and the bounding box coordinates in <code>FaceMatches</code>
     *            and <code>UnmatchedFaces</code> represent the location of the
     *            face after Exif metadata is used to correct the orientation.
     *            Images in .png format don't contain Exif metadata.
     *            </p>
     *            </note>
     * @see OrientationCorrection
     */
    public void setTargetImageOrientationCorrection(String targetImageOrientationCorrection) {
        this.targetImageOrientationCorrection = targetImageOrientationCorrection;
    }

    /**
     * <p>
     * The orientation of the target image (in counterclockwise direction). If
     * your application displays the target image, you can use this value to
     * correct the orientation of the image. The bounding box coordinates
     * returned in <code>FaceMatches</code> and <code>UnmatchedFaces</code>
     * represent face locations before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the target image is in .jpg format, it might contain Exif metadata
     * that includes the orientation of the image. If the Exif metadata for the
     * target image populates the orientation field, the value of
     * <code>OrientationCorrection</code> is null and the bounding box
     * coordinates in <code>FaceMatches</code> and <code>UnmatchedFaces</code>
     * represent the location of the face after Exif metadata is used to correct
     * the orientation. Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param targetImageOrientationCorrection <p>
     *            The orientation of the target image (in counterclockwise
     *            direction). If your application displays the target image, you
     *            can use this value to correct the orientation of the image.
     *            The bounding box coordinates returned in
     *            <code>FaceMatches</code> and <code>UnmatchedFaces</code>
     *            represent face locations before the image orientation is
     *            corrected.
     *            </p>
     *            <note>
     *            <p>
     *            If the target image is in .jpg format, it might contain Exif
     *            metadata that includes the orientation of the image. If the
     *            Exif metadata for the target image populates the orientation
     *            field, the value of <code>OrientationCorrection</code> is null
     *            and the bounding box coordinates in <code>FaceMatches</code>
     *            and <code>UnmatchedFaces</code> represent the location of the
     *            face after Exif metadata is used to correct the orientation.
     *            Images in .png format don't contain Exif metadata.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrientationCorrection
     */
    public CompareFacesResult withTargetImageOrientationCorrection(
            String targetImageOrientationCorrection) {
        this.targetImageOrientationCorrection = targetImageOrientationCorrection;
        return this;
    }

    /**
     * <p>
     * The orientation of the target image (in counterclockwise direction). If
     * your application displays the target image, you can use this value to
     * correct the orientation of the image. The bounding box coordinates
     * returned in <code>FaceMatches</code> and <code>UnmatchedFaces</code>
     * represent face locations before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the target image is in .jpg format, it might contain Exif metadata
     * that includes the orientation of the image. If the Exif metadata for the
     * target image populates the orientation field, the value of
     * <code>OrientationCorrection</code> is null and the bounding box
     * coordinates in <code>FaceMatches</code> and <code>UnmatchedFaces</code>
     * represent the location of the face after Exif metadata is used to correct
     * the orientation. Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param targetImageOrientationCorrection <p>
     *            The orientation of the target image (in counterclockwise
     *            direction). If your application displays the target image, you
     *            can use this value to correct the orientation of the image.
     *            The bounding box coordinates returned in
     *            <code>FaceMatches</code> and <code>UnmatchedFaces</code>
     *            represent face locations before the image orientation is
     *            corrected.
     *            </p>
     *            <note>
     *            <p>
     *            If the target image is in .jpg format, it might contain Exif
     *            metadata that includes the orientation of the image. If the
     *            Exif metadata for the target image populates the orientation
     *            field, the value of <code>OrientationCorrection</code> is null
     *            and the bounding box coordinates in <code>FaceMatches</code>
     *            and <code>UnmatchedFaces</code> represent the location of the
     *            face after Exif metadata is used to correct the orientation.
     *            Images in .png format don't contain Exif metadata.
     *            </p>
     *            </note>
     * @see OrientationCorrection
     */
    public void setTargetImageOrientationCorrection(
            OrientationCorrection targetImageOrientationCorrection) {
        this.targetImageOrientationCorrection = targetImageOrientationCorrection.toString();
    }

    /**
     * <p>
     * The orientation of the target image (in counterclockwise direction). If
     * your application displays the target image, you can use this value to
     * correct the orientation of the image. The bounding box coordinates
     * returned in <code>FaceMatches</code> and <code>UnmatchedFaces</code>
     * represent face locations before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the target image is in .jpg format, it might contain Exif metadata
     * that includes the orientation of the image. If the Exif metadata for the
     * target image populates the orientation field, the value of
     * <code>OrientationCorrection</code> is null and the bounding box
     * coordinates in <code>FaceMatches</code> and <code>UnmatchedFaces</code>
     * represent the location of the face after Exif metadata is used to correct
     * the orientation. Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param targetImageOrientationCorrection <p>
     *            The orientation of the target image (in counterclockwise
     *            direction). If your application displays the target image, you
     *            can use this value to correct the orientation of the image.
     *            The bounding box coordinates returned in
     *            <code>FaceMatches</code> and <code>UnmatchedFaces</code>
     *            represent face locations before the image orientation is
     *            corrected.
     *            </p>
     *            <note>
     *            <p>
     *            If the target image is in .jpg format, it might contain Exif
     *            metadata that includes the orientation of the image. If the
     *            Exif metadata for the target image populates the orientation
     *            field, the value of <code>OrientationCorrection</code> is null
     *            and the bounding box coordinates in <code>FaceMatches</code>
     *            and <code>UnmatchedFaces</code> represent the location of the
     *            face after Exif metadata is used to correct the orientation.
     *            Images in .png format don't contain Exif metadata.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrientationCorrection
     */
    public CompareFacesResult withTargetImageOrientationCorrection(
            OrientationCorrection targetImageOrientationCorrection) {
        this.targetImageOrientationCorrection = targetImageOrientationCorrection.toString();
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
        if (getSourceImageFace() != null)
            sb.append("SourceImageFace: " + getSourceImageFace() + ",");
        if (getFaceMatches() != null)
            sb.append("FaceMatches: " + getFaceMatches() + ",");
        if (getUnmatchedFaces() != null)
            sb.append("UnmatchedFaces: " + getUnmatchedFaces() + ",");
        if (getSourceImageOrientationCorrection() != null)
            sb.append("SourceImageOrientationCorrection: " + getSourceImageOrientationCorrection()
                    + ",");
        if (getTargetImageOrientationCorrection() != null)
            sb.append("TargetImageOrientationCorrection: " + getTargetImageOrientationCorrection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceImageFace() == null) ? 0 : getSourceImageFace().hashCode());
        hashCode = prime * hashCode
                + ((getFaceMatches() == null) ? 0 : getFaceMatches().hashCode());
        hashCode = prime * hashCode
                + ((getUnmatchedFaces() == null) ? 0 : getUnmatchedFaces().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceImageOrientationCorrection() == null) ? 0
                        : getSourceImageOrientationCorrection().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetImageOrientationCorrection() == null) ? 0
                        : getTargetImageOrientationCorrection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompareFacesResult == false)
            return false;
        CompareFacesResult other = (CompareFacesResult) obj;

        if (other.getSourceImageFace() == null ^ this.getSourceImageFace() == null)
            return false;
        if (other.getSourceImageFace() != null
                && other.getSourceImageFace().equals(this.getSourceImageFace()) == false)
            return false;
        if (other.getFaceMatches() == null ^ this.getFaceMatches() == null)
            return false;
        if (other.getFaceMatches() != null
                && other.getFaceMatches().equals(this.getFaceMatches()) == false)
            return false;
        if (other.getUnmatchedFaces() == null ^ this.getUnmatchedFaces() == null)
            return false;
        if (other.getUnmatchedFaces() != null
                && other.getUnmatchedFaces().equals(this.getUnmatchedFaces()) == false)
            return false;
        if (other.getSourceImageOrientationCorrection() == null
                ^ this.getSourceImageOrientationCorrection() == null)
            return false;
        if (other.getSourceImageOrientationCorrection() != null
                && other.getSourceImageOrientationCorrection().equals(
                        this.getSourceImageOrientationCorrection()) == false)
            return false;
        if (other.getTargetImageOrientationCorrection() == null
                ^ this.getTargetImageOrientationCorrection() == null)
            return false;
        if (other.getTargetImageOrientationCorrection() != null
                && other.getTargetImageOrientationCorrection().equals(
                        this.getTargetImageOrientationCorrection()) == false)
            return false;
        return true;
    }
}
