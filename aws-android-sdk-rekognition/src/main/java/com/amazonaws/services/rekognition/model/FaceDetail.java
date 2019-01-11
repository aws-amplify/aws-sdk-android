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

/**
 * <p>
 * Structure containing attributes of the face that the algorithm detected.
 * </p>
 * <p>
 * A <code>FaceDetail</code> object contains either the default facial
 * attributes or all facial attributes. The default attributes are
 * <code>BoundingBox</code>, <code>Confidence</code>, <code>Landmarks</code>,
 * <code>Pose</code>, and <code>Quality</code>.
 * </p>
 * <p>
 * is the only Amazon Rekognition Video stored video operation that can return a
 * <code>FaceDetail</code> object with all attributes. To specify which
 * attributes to return, use the <code>FaceAttributes</code> input parameter for
 * . The following Amazon Rekognition Video operations return only the default
 * attributes. The corresponding Start operations don't have a
 * <code>FaceAttributes</code> input parameter.
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
 * The Amazon Rekognition Image and operations can return all facial attributes.
 * To specify which attributes to return, use the <code>Attributes</code> input
 * parameter for <code>DetectFaces</code>. For <code>IndexFaces</code>, use the
 * <code>DetectAttributes</code> input parameter.
 * </p>
 */
public class FaceDetail implements Serializable {
    /**
     * <p>
     * Bounding box of the face. Default attribute.
     * </p>
     */
    private BoundingBox boundingBox;

    /**
     * <p>
     * The estimated age range, in years, for the face. Low represents the
     * lowest estimated age and High represents the highest estimated age.
     * </p>
     */
    private AgeRange ageRange;

    /**
     * <p>
     * Indicates whether or not the face is smiling, and the confidence level in
     * the determination.
     * </p>
     */
    private Smile smile;

    /**
     * <p>
     * Indicates whether or not the face is wearing eye glasses, and the
     * confidence level in the determination.
     * </p>
     */
    private Eyeglasses eyeglasses;

    /**
     * <p>
     * Indicates whether or not the face is wearing sunglasses, and the
     * confidence level in the determination.
     * </p>
     */
    private Sunglasses sunglasses;

    /**
     * <p>
     * Gender of the face and the confidence level in the determination.
     * </p>
     */
    private Gender gender;

    /**
     * <p>
     * Indicates whether or not the face has a beard, and the confidence level
     * in the determination.
     * </p>
     */
    private Beard beard;

    /**
     * <p>
     * Indicates whether or not the face has a mustache, and the confidence
     * level in the determination.
     * </p>
     */
    private Mustache mustache;

    /**
     * <p>
     * Indicates whether or not the eyes on the face are open, and the
     * confidence level in the determination.
     * </p>
     */
    private EyeOpen eyesOpen;

    /**
     * <p>
     * Indicates whether or not the mouth on the face is open, and the
     * confidence level in the determination.
     * </p>
     */
    private MouthOpen mouthOpen;

    /**
     * <p>
     * The emotions detected on the face, and the confidence level in the
     * determination. For example, HAPPY, SAD, and ANGRY.
     * </p>
     */
    private java.util.List<Emotion> emotions;

    /**
     * <p>
     * Indicates the location of landmarks on the face. Default attribute.
     * </p>
     */
    private java.util.List<Landmark> landmarks;

    /**
     * <p>
     * Indicates the pose of the face as determined by its pitch, roll, and yaw.
     * Default attribute.
     * </p>
     */
    private Pose pose;

    /**
     * <p>
     * Identifies image brightness and sharpness. Default attribute.
     * </p>
     */
    private ImageQuality quality;

    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a
     * different object such as a tree). Default attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float confidence;

    /**
     * <p>
     * Bounding box of the face. Default attribute.
     * </p>
     *
     * @return <p>
     *         Bounding box of the face. Default attribute.
     *         </p>
     */
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    /**
     * <p>
     * Bounding box of the face. Default attribute.
     * </p>
     *
     * @param boundingBox <p>
     *            Bounding box of the face. Default attribute.
     *            </p>
     */
    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * <p>
     * Bounding box of the face. Default attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param boundingBox <p>
     *            Bounding box of the face. Default attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceDetail withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * <p>
     * The estimated age range, in years, for the face. Low represents the
     * lowest estimated age and High represents the highest estimated age.
     * </p>
     *
     * @return <p>
     *         The estimated age range, in years, for the face. Low represents
     *         the lowest estimated age and High represents the highest
     *         estimated age.
     *         </p>
     */
    public AgeRange getAgeRange() {
        return ageRange;
    }

    /**
     * <p>
     * The estimated age range, in years, for the face. Low represents the
     * lowest estimated age and High represents the highest estimated age.
     * </p>
     *
     * @param ageRange <p>
     *            The estimated age range, in years, for the face. Low
     *            represents the lowest estimated age and High represents the
     *            highest estimated age.
     *            </p>
     */
    public void setAgeRange(AgeRange ageRange) {
        this.ageRange = ageRange;
    }

    /**
     * <p>
     * The estimated age range, in years, for the face. Low represents the
     * lowest estimated age and High represents the highest estimated age.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ageRange <p>
     *            The estimated age range, in years, for the face. Low
     *            represents the lowest estimated age and High represents the
     *            highest estimated age.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceDetail withAgeRange(AgeRange ageRange) {
        this.ageRange = ageRange;
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the face is smiling, and the confidence level in
     * the determination.
     * </p>
     *
     * @return <p>
     *         Indicates whether or not the face is smiling, and the confidence
     *         level in the determination.
     *         </p>
     */
    public Smile getSmile() {
        return smile;
    }

    /**
     * <p>
     * Indicates whether or not the face is smiling, and the confidence level in
     * the determination.
     * </p>
     *
     * @param smile <p>
     *            Indicates whether or not the face is smiling, and the
     *            confidence level in the determination.
     *            </p>
     */
    public void setSmile(Smile smile) {
        this.smile = smile;
    }

    /**
     * <p>
     * Indicates whether or not the face is smiling, and the confidence level in
     * the determination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param smile <p>
     *            Indicates whether or not the face is smiling, and the
     *            confidence level in the determination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceDetail withSmile(Smile smile) {
        this.smile = smile;
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the face is wearing eye glasses, and the
     * confidence level in the determination.
     * </p>
     *
     * @return <p>
     *         Indicates whether or not the face is wearing eye glasses, and the
     *         confidence level in the determination.
     *         </p>
     */
    public Eyeglasses getEyeglasses() {
        return eyeglasses;
    }

    /**
     * <p>
     * Indicates whether or not the face is wearing eye glasses, and the
     * confidence level in the determination.
     * </p>
     *
     * @param eyeglasses <p>
     *            Indicates whether or not the face is wearing eye glasses, and
     *            the confidence level in the determination.
     *            </p>
     */
    public void setEyeglasses(Eyeglasses eyeglasses) {
        this.eyeglasses = eyeglasses;
    }

    /**
     * <p>
     * Indicates whether or not the face is wearing eye glasses, and the
     * confidence level in the determination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eyeglasses <p>
     *            Indicates whether or not the face is wearing eye glasses, and
     *            the confidence level in the determination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceDetail withEyeglasses(Eyeglasses eyeglasses) {
        this.eyeglasses = eyeglasses;
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the face is wearing sunglasses, and the
     * confidence level in the determination.
     * </p>
     *
     * @return <p>
     *         Indicates whether or not the face is wearing sunglasses, and the
     *         confidence level in the determination.
     *         </p>
     */
    public Sunglasses getSunglasses() {
        return sunglasses;
    }

    /**
     * <p>
     * Indicates whether or not the face is wearing sunglasses, and the
     * confidence level in the determination.
     * </p>
     *
     * @param sunglasses <p>
     *            Indicates whether or not the face is wearing sunglasses, and
     *            the confidence level in the determination.
     *            </p>
     */
    public void setSunglasses(Sunglasses sunglasses) {
        this.sunglasses = sunglasses;
    }

    /**
     * <p>
     * Indicates whether or not the face is wearing sunglasses, and the
     * confidence level in the determination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sunglasses <p>
     *            Indicates whether or not the face is wearing sunglasses, and
     *            the confidence level in the determination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceDetail withSunglasses(Sunglasses sunglasses) {
        this.sunglasses = sunglasses;
        return this;
    }

    /**
     * <p>
     * Gender of the face and the confidence level in the determination.
     * </p>
     *
     * @return <p>
     *         Gender of the face and the confidence level in the determination.
     *         </p>
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * <p>
     * Gender of the face and the confidence level in the determination.
     * </p>
     *
     * @param gender <p>
     *            Gender of the face and the confidence level in the
     *            determination.
     *            </p>
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * <p>
     * Gender of the face and the confidence level in the determination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gender <p>
     *            Gender of the face and the confidence level in the
     *            determination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceDetail withGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the face has a beard, and the confidence level
     * in the determination.
     * </p>
     *
     * @return <p>
     *         Indicates whether or not the face has a beard, and the confidence
     *         level in the determination.
     *         </p>
     */
    public Beard getBeard() {
        return beard;
    }

    /**
     * <p>
     * Indicates whether or not the face has a beard, and the confidence level
     * in the determination.
     * </p>
     *
     * @param beard <p>
     *            Indicates whether or not the face has a beard, and the
     *            confidence level in the determination.
     *            </p>
     */
    public void setBeard(Beard beard) {
        this.beard = beard;
    }

    /**
     * <p>
     * Indicates whether or not the face has a beard, and the confidence level
     * in the determination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beard <p>
     *            Indicates whether or not the face has a beard, and the
     *            confidence level in the determination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceDetail withBeard(Beard beard) {
        this.beard = beard;
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the face has a mustache, and the confidence
     * level in the determination.
     * </p>
     *
     * @return <p>
     *         Indicates whether or not the face has a mustache, and the
     *         confidence level in the determination.
     *         </p>
     */
    public Mustache getMustache() {
        return mustache;
    }

    /**
     * <p>
     * Indicates whether or not the face has a mustache, and the confidence
     * level in the determination.
     * </p>
     *
     * @param mustache <p>
     *            Indicates whether or not the face has a mustache, and the
     *            confidence level in the determination.
     *            </p>
     */
    public void setMustache(Mustache mustache) {
        this.mustache = mustache;
    }

    /**
     * <p>
     * Indicates whether or not the face has a mustache, and the confidence
     * level in the determination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mustache <p>
     *            Indicates whether or not the face has a mustache, and the
     *            confidence level in the determination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceDetail withMustache(Mustache mustache) {
        this.mustache = mustache;
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the eyes on the face are open, and the
     * confidence level in the determination.
     * </p>
     *
     * @return <p>
     *         Indicates whether or not the eyes on the face are open, and the
     *         confidence level in the determination.
     *         </p>
     */
    public EyeOpen getEyesOpen() {
        return eyesOpen;
    }

    /**
     * <p>
     * Indicates whether or not the eyes on the face are open, and the
     * confidence level in the determination.
     * </p>
     *
     * @param eyesOpen <p>
     *            Indicates whether or not the eyes on the face are open, and
     *            the confidence level in the determination.
     *            </p>
     */
    public void setEyesOpen(EyeOpen eyesOpen) {
        this.eyesOpen = eyesOpen;
    }

    /**
     * <p>
     * Indicates whether or not the eyes on the face are open, and the
     * confidence level in the determination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eyesOpen <p>
     *            Indicates whether or not the eyes on the face are open, and
     *            the confidence level in the determination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceDetail withEyesOpen(EyeOpen eyesOpen) {
        this.eyesOpen = eyesOpen;
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the mouth on the face is open, and the
     * confidence level in the determination.
     * </p>
     *
     * @return <p>
     *         Indicates whether or not the mouth on the face is open, and the
     *         confidence level in the determination.
     *         </p>
     */
    public MouthOpen getMouthOpen() {
        return mouthOpen;
    }

    /**
     * <p>
     * Indicates whether or not the mouth on the face is open, and the
     * confidence level in the determination.
     * </p>
     *
     * @param mouthOpen <p>
     *            Indicates whether or not the mouth on the face is open, and
     *            the confidence level in the determination.
     *            </p>
     */
    public void setMouthOpen(MouthOpen mouthOpen) {
        this.mouthOpen = mouthOpen;
    }

    /**
     * <p>
     * Indicates whether or not the mouth on the face is open, and the
     * confidence level in the determination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mouthOpen <p>
     *            Indicates whether or not the mouth on the face is open, and
     *            the confidence level in the determination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceDetail withMouthOpen(MouthOpen mouthOpen) {
        this.mouthOpen = mouthOpen;
        return this;
    }

    /**
     * <p>
     * The emotions detected on the face, and the confidence level in the
     * determination. For example, HAPPY, SAD, and ANGRY.
     * </p>
     *
     * @return <p>
     *         The emotions detected on the face, and the confidence level in
     *         the determination. For example, HAPPY, SAD, and ANGRY.
     *         </p>
     */
    public java.util.List<Emotion> getEmotions() {
        return emotions;
    }

    /**
     * <p>
     * The emotions detected on the face, and the confidence level in the
     * determination. For example, HAPPY, SAD, and ANGRY.
     * </p>
     *
     * @param emotions <p>
     *            The emotions detected on the face, and the confidence level in
     *            the determination. For example, HAPPY, SAD, and ANGRY.
     *            </p>
     */
    public void setEmotions(java.util.Collection<Emotion> emotions) {
        if (emotions == null) {
            this.emotions = null;
            return;
        }

        this.emotions = new java.util.ArrayList<Emotion>(emotions);
    }

    /**
     * <p>
     * The emotions detected on the face, and the confidence level in the
     * determination. For example, HAPPY, SAD, and ANGRY.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emotions <p>
     *            The emotions detected on the face, and the confidence level in
     *            the determination. For example, HAPPY, SAD, and ANGRY.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceDetail withEmotions(Emotion... emotions) {
        if (getEmotions() == null) {
            this.emotions = new java.util.ArrayList<Emotion>(emotions.length);
        }
        for (Emotion value : emotions) {
            this.emotions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The emotions detected on the face, and the confidence level in the
     * determination. For example, HAPPY, SAD, and ANGRY.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emotions <p>
     *            The emotions detected on the face, and the confidence level in
     *            the determination. For example, HAPPY, SAD, and ANGRY.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceDetail withEmotions(java.util.Collection<Emotion> emotions) {
        setEmotions(emotions);
        return this;
    }

    /**
     * <p>
     * Indicates the location of landmarks on the face. Default attribute.
     * </p>
     *
     * @return <p>
     *         Indicates the location of landmarks on the face. Default
     *         attribute.
     *         </p>
     */
    public java.util.List<Landmark> getLandmarks() {
        return landmarks;
    }

    /**
     * <p>
     * Indicates the location of landmarks on the face. Default attribute.
     * </p>
     *
     * @param landmarks <p>
     *            Indicates the location of landmarks on the face. Default
     *            attribute.
     *            </p>
     */
    public void setLandmarks(java.util.Collection<Landmark> landmarks) {
        if (landmarks == null) {
            this.landmarks = null;
            return;
        }

        this.landmarks = new java.util.ArrayList<Landmark>(landmarks);
    }

    /**
     * <p>
     * Indicates the location of landmarks on the face. Default attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param landmarks <p>
     *            Indicates the location of landmarks on the face. Default
     *            attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceDetail withLandmarks(Landmark... landmarks) {
        if (getLandmarks() == null) {
            this.landmarks = new java.util.ArrayList<Landmark>(landmarks.length);
        }
        for (Landmark value : landmarks) {
            this.landmarks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Indicates the location of landmarks on the face. Default attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param landmarks <p>
     *            Indicates the location of landmarks on the face. Default
     *            attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceDetail withLandmarks(java.util.Collection<Landmark> landmarks) {
        setLandmarks(landmarks);
        return this;
    }

    /**
     * <p>
     * Indicates the pose of the face as determined by its pitch, roll, and yaw.
     * Default attribute.
     * </p>
     *
     * @return <p>
     *         Indicates the pose of the face as determined by its pitch, roll,
     *         and yaw. Default attribute.
     *         </p>
     */
    public Pose getPose() {
        return pose;
    }

    /**
     * <p>
     * Indicates the pose of the face as determined by its pitch, roll, and yaw.
     * Default attribute.
     * </p>
     *
     * @param pose <p>
     *            Indicates the pose of the face as determined by its pitch,
     *            roll, and yaw. Default attribute.
     *            </p>
     */
    public void setPose(Pose pose) {
        this.pose = pose;
    }

    /**
     * <p>
     * Indicates the pose of the face as determined by its pitch, roll, and yaw.
     * Default attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pose <p>
     *            Indicates the pose of the face as determined by its pitch,
     *            roll, and yaw. Default attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceDetail withPose(Pose pose) {
        this.pose = pose;
        return this;
    }

    /**
     * <p>
     * Identifies image brightness and sharpness. Default attribute.
     * </p>
     *
     * @return <p>
     *         Identifies image brightness and sharpness. Default attribute.
     *         </p>
     */
    public ImageQuality getQuality() {
        return quality;
    }

    /**
     * <p>
     * Identifies image brightness and sharpness. Default attribute.
     * </p>
     *
     * @param quality <p>
     *            Identifies image brightness and sharpness. Default attribute.
     *            </p>
     */
    public void setQuality(ImageQuality quality) {
        this.quality = quality;
    }

    /**
     * <p>
     * Identifies image brightness and sharpness. Default attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quality <p>
     *            Identifies image brightness and sharpness. Default attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceDetail withQuality(ImageQuality quality) {
        this.quality = quality;
        return this;
    }

    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a
     * different object such as a tree). Default attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         Confidence level that the bounding box contains a face (and not a
     *         different object such as a tree). Default attribute.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a
     * different object such as a tree). Default attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            Confidence level that the bounding box contains a face (and
     *            not a different object such as a tree). Default attribute.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a
     * different object such as a tree). Default attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            Confidence level that the bounding box contains a face (and
     *            not a different object such as a tree). Default attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceDetail withConfidence(Float confidence) {
        this.confidence = confidence;
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
        if (getBoundingBox() != null)
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        if (getAgeRange() != null)
            sb.append("AgeRange: " + getAgeRange() + ",");
        if (getSmile() != null)
            sb.append("Smile: " + getSmile() + ",");
        if (getEyeglasses() != null)
            sb.append("Eyeglasses: " + getEyeglasses() + ",");
        if (getSunglasses() != null)
            sb.append("Sunglasses: " + getSunglasses() + ",");
        if (getGender() != null)
            sb.append("Gender: " + getGender() + ",");
        if (getBeard() != null)
            sb.append("Beard: " + getBeard() + ",");
        if (getMustache() != null)
            sb.append("Mustache: " + getMustache() + ",");
        if (getEyesOpen() != null)
            sb.append("EyesOpen: " + getEyesOpen() + ",");
        if (getMouthOpen() != null)
            sb.append("MouthOpen: " + getMouthOpen() + ",");
        if (getEmotions() != null)
            sb.append("Emotions: " + getEmotions() + ",");
        if (getLandmarks() != null)
            sb.append("Landmarks: " + getLandmarks() + ",");
        if (getPose() != null)
            sb.append("Pose: " + getPose() + ",");
        if (getQuality() != null)
            sb.append("Quality: " + getQuality() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getAgeRange() == null) ? 0 : getAgeRange().hashCode());
        hashCode = prime * hashCode + ((getSmile() == null) ? 0 : getSmile().hashCode());
        hashCode = prime * hashCode + ((getEyeglasses() == null) ? 0 : getEyeglasses().hashCode());
        hashCode = prime * hashCode + ((getSunglasses() == null) ? 0 : getSunglasses().hashCode());
        hashCode = prime * hashCode + ((getGender() == null) ? 0 : getGender().hashCode());
        hashCode = prime * hashCode + ((getBeard() == null) ? 0 : getBeard().hashCode());
        hashCode = prime * hashCode + ((getMustache() == null) ? 0 : getMustache().hashCode());
        hashCode = prime * hashCode + ((getEyesOpen() == null) ? 0 : getEyesOpen().hashCode());
        hashCode = prime * hashCode + ((getMouthOpen() == null) ? 0 : getMouthOpen().hashCode());
        hashCode = prime * hashCode + ((getEmotions() == null) ? 0 : getEmotions().hashCode());
        hashCode = prime * hashCode + ((getLandmarks() == null) ? 0 : getLandmarks().hashCode());
        hashCode = prime * hashCode + ((getPose() == null) ? 0 : getPose().hashCode());
        hashCode = prime * hashCode + ((getQuality() == null) ? 0 : getQuality().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FaceDetail == false)
            return false;
        FaceDetail other = (FaceDetail) obj;

        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null
                && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        if (other.getAgeRange() == null ^ this.getAgeRange() == null)
            return false;
        if (other.getAgeRange() != null && other.getAgeRange().equals(this.getAgeRange()) == false)
            return false;
        if (other.getSmile() == null ^ this.getSmile() == null)
            return false;
        if (other.getSmile() != null && other.getSmile().equals(this.getSmile()) == false)
            return false;
        if (other.getEyeglasses() == null ^ this.getEyeglasses() == null)
            return false;
        if (other.getEyeglasses() != null
                && other.getEyeglasses().equals(this.getEyeglasses()) == false)
            return false;
        if (other.getSunglasses() == null ^ this.getSunglasses() == null)
            return false;
        if (other.getSunglasses() != null
                && other.getSunglasses().equals(this.getSunglasses()) == false)
            return false;
        if (other.getGender() == null ^ this.getGender() == null)
            return false;
        if (other.getGender() != null && other.getGender().equals(this.getGender()) == false)
            return false;
        if (other.getBeard() == null ^ this.getBeard() == null)
            return false;
        if (other.getBeard() != null && other.getBeard().equals(this.getBeard()) == false)
            return false;
        if (other.getMustache() == null ^ this.getMustache() == null)
            return false;
        if (other.getMustache() != null && other.getMustache().equals(this.getMustache()) == false)
            return false;
        if (other.getEyesOpen() == null ^ this.getEyesOpen() == null)
            return false;
        if (other.getEyesOpen() != null && other.getEyesOpen().equals(this.getEyesOpen()) == false)
            return false;
        if (other.getMouthOpen() == null ^ this.getMouthOpen() == null)
            return false;
        if (other.getMouthOpen() != null
                && other.getMouthOpen().equals(this.getMouthOpen()) == false)
            return false;
        if (other.getEmotions() == null ^ this.getEmotions() == null)
            return false;
        if (other.getEmotions() != null && other.getEmotions().equals(this.getEmotions()) == false)
            return false;
        if (other.getLandmarks() == null ^ this.getLandmarks() == null)
            return false;
        if (other.getLandmarks() != null
                && other.getLandmarks().equals(this.getLandmarks()) == false)
            return false;
        if (other.getPose() == null ^ this.getPose() == null)
            return false;
        if (other.getPose() != null && other.getPose().equals(this.getPose()) == false)
            return false;
        if (other.getQuality() == null ^ this.getQuality() == null)
            return false;
        if (other.getQuality() != null && other.getQuality().equals(this.getQuality()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }
}
