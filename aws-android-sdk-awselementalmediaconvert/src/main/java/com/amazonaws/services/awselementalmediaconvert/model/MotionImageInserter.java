/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * Overlay motion graphics on top of your video at the time that you specify.
 */
public class MotionImageInserter implements Serializable {
    /**
     * If your motion graphic asset is a .mov file, keep this setting
     * unspecified. If your motion graphic asset is a series of .png files,
     * specify the frame rate of the overlay in frames per second, as a
     * fraction. For example, specify 24 fps as 24/1. Make sure that the number
     * of images in your series matches the frame rate and your intended overlay
     * duration. For example, if you want a 30-second overlay at 30 fps, you
     * should have 900 .png images. This overlay frame rate doesn't need to
     * match the frame rate of the underlying video.
     */
    private MotionImageInsertionFramerate framerate;

    /**
     * Specify the .mov file or series of .png files that you want to overlay on
     * your video. For .png files, provide the file name of the first file in
     * the series. Make sure that the names of the .png files end with
     * sequential numbers that specify the order that they are played in. For
     * example, overlay_000.png, overlay_001.png, overlay_002.png, and so on.
     * The sequence must start at zero, and each image file name must have the
     * same number of digits. Pad your initial file names with enough zeros to
     * complete the sequence. For example, if the first image is overlay_0.png,
     * there can be only 10 images in the sequence, with the last image being
     * overlay_9.png. But if the first image is overlay_00.png, there can be 100
     * images in the sequence.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>14 - 1285<br/>
     * <b>Pattern:
     * </b>^((s3://(.*)(\.mov|[0-9]+\.png))|(https?://(.*)(\.mov|[0-9
     * ]+\.png)(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     */
    private String input;

    /**
     * Choose the type of motion graphic asset that you are providing for your
     * overlay. You can choose either a .mov file or a series of .png files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MOV, PNG
     */
    private String insertionMode;

    /**
     * Use Offset to specify the placement of your motion graphic overlay on the
     * video frame. Specify in pixels, from the upper-left corner of the frame.
     * If you don't specify an offset, the service scales your overlay to the
     * full size of the frame. Otherwise, the service inserts the overlay at its
     * native resolution and scales the size up or down with any video scaling.
     */
    private MotionImageInsertionOffset offset;

    /**
     * Specify whether your motion graphic overlay repeats on a loop or plays
     * only once.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONCE, REPEAT
     */
    private String playback;

    /**
     * Specify when the motion overlay begins. Use timecode format (HH:MM:SS:FF
     * or HH:MM:SS;FF). Make sure that the timecode you provide here takes into
     * account how you have set up your timecode configuration under both job
     * settings and input settings. The simplest way to do that is to set both
     * to start at 0. If you need to set up your job to follow timecodes
     * embedded in your source that don't start at zero, make sure that you
     * specify a start time that is after the first embedded timecode. For more
     * information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/setting
     * -up-timecode.html Find job-wide and input timecode configuration settings
     * in your JSON job settings specification at settings>timecodeConfig>source
     * and settings>inputs>timecodeSource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 11<br/>
     * <b>Pattern: </b>^((([0-1]\d)|(2[0-3]))(:[0-5]\d){2}([:;][0-5]\d))$<br/>
     */
    private String startTime;

    /**
     * If your motion graphic asset is a .mov file, keep this setting
     * unspecified. If your motion graphic asset is a series of .png files,
     * specify the frame rate of the overlay in frames per second, as a
     * fraction. For example, specify 24 fps as 24/1. Make sure that the number
     * of images in your series matches the frame rate and your intended overlay
     * duration. For example, if you want a 30-second overlay at 30 fps, you
     * should have 900 .png images. This overlay frame rate doesn't need to
     * match the frame rate of the underlying video.
     *
     * @return If your motion graphic asset is a .mov file, keep this setting
     *         unspecified. If your motion graphic asset is a series of .png
     *         files, specify the frame rate of the overlay in frames per
     *         second, as a fraction. For example, specify 24 fps as 24/1. Make
     *         sure that the number of images in your series matches the frame
     *         rate and your intended overlay duration. For example, if you want
     *         a 30-second overlay at 30 fps, you should have 900 .png images.
     *         This overlay frame rate doesn't need to match the frame rate of
     *         the underlying video.
     */
    public MotionImageInsertionFramerate getFramerate() {
        return framerate;
    }

    /**
     * If your motion graphic asset is a .mov file, keep this setting
     * unspecified. If your motion graphic asset is a series of .png files,
     * specify the frame rate of the overlay in frames per second, as a
     * fraction. For example, specify 24 fps as 24/1. Make sure that the number
     * of images in your series matches the frame rate and your intended overlay
     * duration. For example, if you want a 30-second overlay at 30 fps, you
     * should have 900 .png images. This overlay frame rate doesn't need to
     * match the frame rate of the underlying video.
     *
     * @param framerate If your motion graphic asset is a .mov file, keep this
     *            setting unspecified. If your motion graphic asset is a series
     *            of .png files, specify the frame rate of the overlay in frames
     *            per second, as a fraction. For example, specify 24 fps as
     *            24/1. Make sure that the number of images in your series
     *            matches the frame rate and your intended overlay duration. For
     *            example, if you want a 30-second overlay at 30 fps, you should
     *            have 900 .png images. This overlay frame rate doesn't need to
     *            match the frame rate of the underlying video.
     */
    public void setFramerate(MotionImageInsertionFramerate framerate) {
        this.framerate = framerate;
    }

    /**
     * If your motion graphic asset is a .mov file, keep this setting
     * unspecified. If your motion graphic asset is a series of .png files,
     * specify the frame rate of the overlay in frames per second, as a
     * fraction. For example, specify 24 fps as 24/1. Make sure that the number
     * of images in your series matches the frame rate and your intended overlay
     * duration. For example, if you want a 30-second overlay at 30 fps, you
     * should have 900 .png images. This overlay frame rate doesn't need to
     * match the frame rate of the underlying video.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param framerate If your motion graphic asset is a .mov file, keep this
     *            setting unspecified. If your motion graphic asset is a series
     *            of .png files, specify the frame rate of the overlay in frames
     *            per second, as a fraction. For example, specify 24 fps as
     *            24/1. Make sure that the number of images in your series
     *            matches the frame rate and your intended overlay duration. For
     *            example, if you want a 30-second overlay at 30 fps, you should
     *            have 900 .png images. This overlay frame rate doesn't need to
     *            match the frame rate of the underlying video.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MotionImageInserter withFramerate(MotionImageInsertionFramerate framerate) {
        this.framerate = framerate;
        return this;
    }

    /**
     * Specify the .mov file or series of .png files that you want to overlay on
     * your video. For .png files, provide the file name of the first file in
     * the series. Make sure that the names of the .png files end with
     * sequential numbers that specify the order that they are played in. For
     * example, overlay_000.png, overlay_001.png, overlay_002.png, and so on.
     * The sequence must start at zero, and each image file name must have the
     * same number of digits. Pad your initial file names with enough zeros to
     * complete the sequence. For example, if the first image is overlay_0.png,
     * there can be only 10 images in the sequence, with the last image being
     * overlay_9.png. But if the first image is overlay_00.png, there can be 100
     * images in the sequence.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>14 - 1285<br/>
     * <b>Pattern:
     * </b>^((s3://(.*)(\.mov|[0-9]+\.png))|(https?://(.*)(\.mov|[0-9
     * ]+\.png)(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     *
     * @return Specify the .mov file or series of .png files that you want to
     *         overlay on your video. For .png files, provide the file name of
     *         the first file in the series. Make sure that the names of the
     *         .png files end with sequential numbers that specify the order
     *         that they are played in. For example, overlay_000.png,
     *         overlay_001.png, overlay_002.png, and so on. The sequence must
     *         start at zero, and each image file name must have the same number
     *         of digits. Pad your initial file names with enough zeros to
     *         complete the sequence. For example, if the first image is
     *         overlay_0.png, there can be only 10 images in the sequence, with
     *         the last image being overlay_9.png. But if the first image is
     *         overlay_00.png, there can be 100 images in the sequence.
     */
    public String getInput() {
        return input;
    }

    /**
     * Specify the .mov file or series of .png files that you want to overlay on
     * your video. For .png files, provide the file name of the first file in
     * the series. Make sure that the names of the .png files end with
     * sequential numbers that specify the order that they are played in. For
     * example, overlay_000.png, overlay_001.png, overlay_002.png, and so on.
     * The sequence must start at zero, and each image file name must have the
     * same number of digits. Pad your initial file names with enough zeros to
     * complete the sequence. For example, if the first image is overlay_0.png,
     * there can be only 10 images in the sequence, with the last image being
     * overlay_9.png. But if the first image is overlay_00.png, there can be 100
     * images in the sequence.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>14 - 1285<br/>
     * <b>Pattern:
     * </b>^((s3://(.*)(\.mov|[0-9]+\.png))|(https?://(.*)(\.mov|[0-9
     * ]+\.png)(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     *
     * @param input Specify the .mov file or series of .png files that you want
     *            to overlay on your video. For .png files, provide the file
     *            name of the first file in the series. Make sure that the names
     *            of the .png files end with sequential numbers that specify the
     *            order that they are played in. For example, overlay_000.png,
     *            overlay_001.png, overlay_002.png, and so on. The sequence must
     *            start at zero, and each image file name must have the same
     *            number of digits. Pad your initial file names with enough
     *            zeros to complete the sequence. For example, if the first
     *            image is overlay_0.png, there can be only 10 images in the
     *            sequence, with the last image being overlay_9.png. But if the
     *            first image is overlay_00.png, there can be 100 images in the
     *            sequence.
     */
    public void setInput(String input) {
        this.input = input;
    }

    /**
     * Specify the .mov file or series of .png files that you want to overlay on
     * your video. For .png files, provide the file name of the first file in
     * the series. Make sure that the names of the .png files end with
     * sequential numbers that specify the order that they are played in. For
     * example, overlay_000.png, overlay_001.png, overlay_002.png, and so on.
     * The sequence must start at zero, and each image file name must have the
     * same number of digits. Pad your initial file names with enough zeros to
     * complete the sequence. For example, if the first image is overlay_0.png,
     * there can be only 10 images in the sequence, with the last image being
     * overlay_9.png. But if the first image is overlay_00.png, there can be 100
     * images in the sequence.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>14 - 1285<br/>
     * <b>Pattern:
     * </b>^((s3://(.*)(\.mov|[0-9]+\.png))|(https?://(.*)(\.mov|[0-9
     * ]+\.png)(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     *
     * @param input Specify the .mov file or series of .png files that you want
     *            to overlay on your video. For .png files, provide the file
     *            name of the first file in the series. Make sure that the names
     *            of the .png files end with sequential numbers that specify the
     *            order that they are played in. For example, overlay_000.png,
     *            overlay_001.png, overlay_002.png, and so on. The sequence must
     *            start at zero, and each image file name must have the same
     *            number of digits. Pad your initial file names with enough
     *            zeros to complete the sequence. For example, if the first
     *            image is overlay_0.png, there can be only 10 images in the
     *            sequence, with the last image being overlay_9.png. But if the
     *            first image is overlay_00.png, there can be 100 images in the
     *            sequence.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MotionImageInserter withInput(String input) {
        this.input = input;
        return this;
    }

    /**
     * Choose the type of motion graphic asset that you are providing for your
     * overlay. You can choose either a .mov file or a series of .png files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MOV, PNG
     *
     * @return Choose the type of motion graphic asset that you are providing
     *         for your overlay. You can choose either a .mov file or a series
     *         of .png files.
     * @see MotionImageInsertionMode
     */
    public String getInsertionMode() {
        return insertionMode;
    }

    /**
     * Choose the type of motion graphic asset that you are providing for your
     * overlay. You can choose either a .mov file or a series of .png files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MOV, PNG
     *
     * @param insertionMode Choose the type of motion graphic asset that you are
     *            providing for your overlay. You can choose either a .mov file
     *            or a series of .png files.
     * @see MotionImageInsertionMode
     */
    public void setInsertionMode(String insertionMode) {
        this.insertionMode = insertionMode;
    }

    /**
     * Choose the type of motion graphic asset that you are providing for your
     * overlay. You can choose either a .mov file or a series of .png files.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MOV, PNG
     *
     * @param insertionMode Choose the type of motion graphic asset that you are
     *            providing for your overlay. You can choose either a .mov file
     *            or a series of .png files.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MotionImageInsertionMode
     */
    public MotionImageInserter withInsertionMode(String insertionMode) {
        this.insertionMode = insertionMode;
        return this;
    }

    /**
     * Choose the type of motion graphic asset that you are providing for your
     * overlay. You can choose either a .mov file or a series of .png files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MOV, PNG
     *
     * @param insertionMode Choose the type of motion graphic asset that you are
     *            providing for your overlay. You can choose either a .mov file
     *            or a series of .png files.
     * @see MotionImageInsertionMode
     */
    public void setInsertionMode(MotionImageInsertionMode insertionMode) {
        this.insertionMode = insertionMode.toString();
    }

    /**
     * Choose the type of motion graphic asset that you are providing for your
     * overlay. You can choose either a .mov file or a series of .png files.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MOV, PNG
     *
     * @param insertionMode Choose the type of motion graphic asset that you are
     *            providing for your overlay. You can choose either a .mov file
     *            or a series of .png files.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MotionImageInsertionMode
     */
    public MotionImageInserter withInsertionMode(MotionImageInsertionMode insertionMode) {
        this.insertionMode = insertionMode.toString();
        return this;
    }

    /**
     * Use Offset to specify the placement of your motion graphic overlay on the
     * video frame. Specify in pixels, from the upper-left corner of the frame.
     * If you don't specify an offset, the service scales your overlay to the
     * full size of the frame. Otherwise, the service inserts the overlay at its
     * native resolution and scales the size up or down with any video scaling.
     *
     * @return Use Offset to specify the placement of your motion graphic
     *         overlay on the video frame. Specify in pixels, from the
     *         upper-left corner of the frame. If you don't specify an offset,
     *         the service scales your overlay to the full size of the frame.
     *         Otherwise, the service inserts the overlay at its native
     *         resolution and scales the size up or down with any video scaling.
     */
    public MotionImageInsertionOffset getOffset() {
        return offset;
    }

    /**
     * Use Offset to specify the placement of your motion graphic overlay on the
     * video frame. Specify in pixels, from the upper-left corner of the frame.
     * If you don't specify an offset, the service scales your overlay to the
     * full size of the frame. Otherwise, the service inserts the overlay at its
     * native resolution and scales the size up or down with any video scaling.
     *
     * @param offset Use Offset to specify the placement of your motion graphic
     *            overlay on the video frame. Specify in pixels, from the
     *            upper-left corner of the frame. If you don't specify an
     *            offset, the service scales your overlay to the full size of
     *            the frame. Otherwise, the service inserts the overlay at its
     *            native resolution and scales the size up or down with any
     *            video scaling.
     */
    public void setOffset(MotionImageInsertionOffset offset) {
        this.offset = offset;
    }

    /**
     * Use Offset to specify the placement of your motion graphic overlay on the
     * video frame. Specify in pixels, from the upper-left corner of the frame.
     * If you don't specify an offset, the service scales your overlay to the
     * full size of the frame. Otherwise, the service inserts the overlay at its
     * native resolution and scales the size up or down with any video scaling.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offset Use Offset to specify the placement of your motion graphic
     *            overlay on the video frame. Specify in pixels, from the
     *            upper-left corner of the frame. If you don't specify an
     *            offset, the service scales your overlay to the full size of
     *            the frame. Otherwise, the service inserts the overlay at its
     *            native resolution and scales the size up or down with any
     *            video scaling.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MotionImageInserter withOffset(MotionImageInsertionOffset offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Specify whether your motion graphic overlay repeats on a loop or plays
     * only once.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONCE, REPEAT
     *
     * @return Specify whether your motion graphic overlay repeats on a loop or
     *         plays only once.
     * @see MotionImagePlayback
     */
    public String getPlayback() {
        return playback;
    }

    /**
     * Specify whether your motion graphic overlay repeats on a loop or plays
     * only once.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONCE, REPEAT
     *
     * @param playback Specify whether your motion graphic overlay repeats on a
     *            loop or plays only once.
     * @see MotionImagePlayback
     */
    public void setPlayback(String playback) {
        this.playback = playback;
    }

    /**
     * Specify whether your motion graphic overlay repeats on a loop or plays
     * only once.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONCE, REPEAT
     *
     * @param playback Specify whether your motion graphic overlay repeats on a
     *            loop or plays only once.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MotionImagePlayback
     */
    public MotionImageInserter withPlayback(String playback) {
        this.playback = playback;
        return this;
    }

    /**
     * Specify whether your motion graphic overlay repeats on a loop or plays
     * only once.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONCE, REPEAT
     *
     * @param playback Specify whether your motion graphic overlay repeats on a
     *            loop or plays only once.
     * @see MotionImagePlayback
     */
    public void setPlayback(MotionImagePlayback playback) {
        this.playback = playback.toString();
    }

    /**
     * Specify whether your motion graphic overlay repeats on a loop or plays
     * only once.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONCE, REPEAT
     *
     * @param playback Specify whether your motion graphic overlay repeats on a
     *            loop or plays only once.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MotionImagePlayback
     */
    public MotionImageInserter withPlayback(MotionImagePlayback playback) {
        this.playback = playback.toString();
        return this;
    }

    /**
     * Specify when the motion overlay begins. Use timecode format (HH:MM:SS:FF
     * or HH:MM:SS;FF). Make sure that the timecode you provide here takes into
     * account how you have set up your timecode configuration under both job
     * settings and input settings. The simplest way to do that is to set both
     * to start at 0. If you need to set up your job to follow timecodes
     * embedded in your source that don't start at zero, make sure that you
     * specify a start time that is after the first embedded timecode. For more
     * information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/setting
     * -up-timecode.html Find job-wide and input timecode configuration settings
     * in your JSON job settings specification at settings>timecodeConfig>source
     * and settings>inputs>timecodeSource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 11<br/>
     * <b>Pattern: </b>^((([0-1]\d)|(2[0-3]))(:[0-5]\d){2}([:;][0-5]\d))$<br/>
     *
     * @return Specify when the motion overlay begins. Use timecode format
     *         (HH:MM:SS:FF or HH:MM:SS;FF). Make sure that the timecode you
     *         provide here takes into account how you have set up your timecode
     *         configuration under both job settings and input settings. The
     *         simplest way to do that is to set both to start at 0. If you need
     *         to set up your job to follow timecodes embedded in your source
     *         that don't start at zero, make sure that you specify a start time
     *         that is after the first embedded timecode. For more information,
     *         see
     *         https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-
     *         timecode.html Find job-wide and input timecode configuration
     *         settings in your JSON job settings specification at
     *         settings>timecodeConfig>source and
     *         settings>inputs>timecodeSource.
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Specify when the motion overlay begins. Use timecode format (HH:MM:SS:FF
     * or HH:MM:SS;FF). Make sure that the timecode you provide here takes into
     * account how you have set up your timecode configuration under both job
     * settings and input settings. The simplest way to do that is to set both
     * to start at 0. If you need to set up your job to follow timecodes
     * embedded in your source that don't start at zero, make sure that you
     * specify a start time that is after the first embedded timecode. For more
     * information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/setting
     * -up-timecode.html Find job-wide and input timecode configuration settings
     * in your JSON job settings specification at settings>timecodeConfig>source
     * and settings>inputs>timecodeSource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 11<br/>
     * <b>Pattern: </b>^((([0-1]\d)|(2[0-3]))(:[0-5]\d){2}([:;][0-5]\d))$<br/>
     *
     * @param startTime Specify when the motion overlay begins. Use timecode
     *            format (HH:MM:SS:FF or HH:MM:SS;FF). Make sure that the
     *            timecode you provide here takes into account how you have set
     *            up your timecode configuration under both job settings and
     *            input settings. The simplest way to do that is to set both to
     *            start at 0. If you need to set up your job to follow timecodes
     *            embedded in your source that don't start at zero, make sure
     *            that you specify a start time that is after the first embedded
     *            timecode. For more information, see
     *            https://docs.aws.amazon.com
     *            /mediaconvert/latest/ug/setting-up-timecode.html Find job-wide
     *            and input timecode configuration settings in your JSON job
     *            settings specification at settings>timecodeConfig>source and
     *            settings>inputs>timecodeSource.
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * Specify when the motion overlay begins. Use timecode format (HH:MM:SS:FF
     * or HH:MM:SS;FF). Make sure that the timecode you provide here takes into
     * account how you have set up your timecode configuration under both job
     * settings and input settings. The simplest way to do that is to set both
     * to start at 0. If you need to set up your job to follow timecodes
     * embedded in your source that don't start at zero, make sure that you
     * specify a start time that is after the first embedded timecode. For more
     * information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/setting
     * -up-timecode.html Find job-wide and input timecode configuration settings
     * in your JSON job settings specification at settings>timecodeConfig>source
     * and settings>inputs>timecodeSource.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 11<br/>
     * <b>Pattern: </b>^((([0-1]\d)|(2[0-3]))(:[0-5]\d){2}([:;][0-5]\d))$<br/>
     *
     * @param startTime Specify when the motion overlay begins. Use timecode
     *            format (HH:MM:SS:FF or HH:MM:SS;FF). Make sure that the
     *            timecode you provide here takes into account how you have set
     *            up your timecode configuration under both job settings and
     *            input settings. The simplest way to do that is to set both to
     *            start at 0. If you need to set up your job to follow timecodes
     *            embedded in your source that don't start at zero, make sure
     *            that you specify a start time that is after the first embedded
     *            timecode. For more information, see
     *            https://docs.aws.amazon.com
     *            /mediaconvert/latest/ug/setting-up-timecode.html Find job-wide
     *            and input timecode configuration settings in your JSON job
     *            settings specification at settings>timecodeConfig>source and
     *            settings>inputs>timecodeSource.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MotionImageInserter withStartTime(String startTime) {
        this.startTime = startTime;
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
        if (getFramerate() != null)
            sb.append("Framerate: " + getFramerate() + ",");
        if (getInput() != null)
            sb.append("Input: " + getInput() + ",");
        if (getInsertionMode() != null)
            sb.append("InsertionMode: " + getInsertionMode() + ",");
        if (getOffset() != null)
            sb.append("Offset: " + getOffset() + ",");
        if (getPlayback() != null)
            sb.append("Playback: " + getPlayback() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFramerate() == null) ? 0 : getFramerate().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode
                + ((getInsertionMode() == null) ? 0 : getInsertionMode().hashCode());
        hashCode = prime * hashCode + ((getOffset() == null) ? 0 : getOffset().hashCode());
        hashCode = prime * hashCode + ((getPlayback() == null) ? 0 : getPlayback().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MotionImageInserter == false)
            return false;
        MotionImageInserter other = (MotionImageInserter) obj;

        if (other.getFramerate() == null ^ this.getFramerate() == null)
            return false;
        if (other.getFramerate() != null
                && other.getFramerate().equals(this.getFramerate()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getInsertionMode() == null ^ this.getInsertionMode() == null)
            return false;
        if (other.getInsertionMode() != null
                && other.getInsertionMode().equals(this.getInsertionMode()) == false)
            return false;
        if (other.getOffset() == null ^ this.getOffset() == null)
            return false;
        if (other.getOffset() != null && other.getOffset().equals(this.getOffset()) == false)
            return false;
        if (other.getPlayback() == null ^ this.getPlayback() == null)
            return false;
        if (other.getPlayback() != null && other.getPlayback().equals(this.getPlayback()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }
}
