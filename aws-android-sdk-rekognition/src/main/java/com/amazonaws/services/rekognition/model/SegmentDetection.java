/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A technical cue or shot detection segment detected in a video. An array of
 * <code>SegmentDetection</code> objects containing all segments detected in a
 * stored video is returned by <a>GetSegmentDetection</a>.
 * </p>
 */
public class SegmentDetection implements Serializable {
    /**
     * <p>
     * The type of the segment. Valid values are <code>TECHNICAL_CUE</code> and
     * <code>SHOT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TECHNICAL_CUE, SHOT
     */
    private String type;

    /**
     * <p>
     * The start time of the detected segment in milliseconds from the start of
     * the video. This value is rounded down. For example, if the actual
     * timestamp is 100.6667 milliseconds, Amazon Rekognition Video returns a
     * value of 100 millis.
     * </p>
     */
    private Long startTimestampMillis;

    /**
     * <p>
     * The end time of the detected segment, in milliseconds, from the start of
     * the video. This value is rounded down.
     * </p>
     */
    private Long endTimestampMillis;

    /**
     * <p>
     * The duration of the detected segment in milliseconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long durationMillis;

    /**
     * <p>
     * The frame-accurate SMPTE timecode, from the start of a video, for the
     * start of a detected segment. <code>StartTimecode</code> is in
     * <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     * </p>
     */
    private String startTimecodeSMPTE;

    /**
     * <p>
     * The frame-accurate SMPTE timecode, from the start of a video, for the end
     * of a detected segment. <code>EndTimecode</code> is in <i>HH:MM:SS:fr</i>
     * format (and <i>;fr</i> for drop frame-rates).
     * </p>
     */
    private String endTimecodeSMPTE;

    /**
     * <p>
     * The duration of the timecode for the detected segment in SMPTE format.
     * </p>
     */
    private String durationSMPTE;

    /**
     * <p>
     * If the segment is a technical cue, contains information about the
     * technical cue.
     * </p>
     */
    private TechnicalCueSegment technicalCueSegment;

    /**
     * <p>
     * If the segment is a shot detection, contains information about the shot
     * detection.
     * </p>
     */
    private ShotSegment shotSegment;

    /**
     * <p>
     * The frame number of the start of a video segment, using a frame index
     * that starts with 0.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long startFrameNumber;

    /**
     * <p>
     * The frame number at the end of a video segment, using a frame index that
     * starts with 0.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long endFrameNumber;

    /**
     * <p>
     * The duration of a video segment, expressed in frames.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long durationFrames;

    /**
     * <p>
     * The type of the segment. Valid values are <code>TECHNICAL_CUE</code> and
     * <code>SHOT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TECHNICAL_CUE, SHOT
     *
     * @return <p>
     *         The type of the segment. Valid values are
     *         <code>TECHNICAL_CUE</code> and <code>SHOT</code>.
     *         </p>
     * @see SegmentType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the segment. Valid values are <code>TECHNICAL_CUE</code> and
     * <code>SHOT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TECHNICAL_CUE, SHOT
     *
     * @param type <p>
     *            The type of the segment. Valid values are
     *            <code>TECHNICAL_CUE</code> and <code>SHOT</code>.
     *            </p>
     * @see SegmentType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the segment. Valid values are <code>TECHNICAL_CUE</code> and
     * <code>SHOT</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TECHNICAL_CUE, SHOT
     *
     * @param type <p>
     *            The type of the segment. Valid values are
     *            <code>TECHNICAL_CUE</code> and <code>SHOT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SegmentType
     */
    public SegmentDetection withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the segment. Valid values are <code>TECHNICAL_CUE</code> and
     * <code>SHOT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TECHNICAL_CUE, SHOT
     *
     * @param type <p>
     *            The type of the segment. Valid values are
     *            <code>TECHNICAL_CUE</code> and <code>SHOT</code>.
     *            </p>
     * @see SegmentType
     */
    public void setType(SegmentType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the segment. Valid values are <code>TECHNICAL_CUE</code> and
     * <code>SHOT</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TECHNICAL_CUE, SHOT
     *
     * @param type <p>
     *            The type of the segment. Valid values are
     *            <code>TECHNICAL_CUE</code> and <code>SHOT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SegmentType
     */
    public SegmentDetection withType(SegmentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The start time of the detected segment in milliseconds from the start of
     * the video. This value is rounded down. For example, if the actual
     * timestamp is 100.6667 milliseconds, Amazon Rekognition Video returns a
     * value of 100 millis.
     * </p>
     *
     * @return <p>
     *         The start time of the detected segment in milliseconds from the
     *         start of the video. This value is rounded down. For example, if
     *         the actual timestamp is 100.6667 milliseconds, Amazon Rekognition
     *         Video returns a value of 100 millis.
     *         </p>
     */
    public Long getStartTimestampMillis() {
        return startTimestampMillis;
    }

    /**
     * <p>
     * The start time of the detected segment in milliseconds from the start of
     * the video. This value is rounded down. For example, if the actual
     * timestamp is 100.6667 milliseconds, Amazon Rekognition Video returns a
     * value of 100 millis.
     * </p>
     *
     * @param startTimestampMillis <p>
     *            The start time of the detected segment in milliseconds from
     *            the start of the video. This value is rounded down. For
     *            example, if the actual timestamp is 100.6667 milliseconds,
     *            Amazon Rekognition Video returns a value of 100 millis.
     *            </p>
     */
    public void setStartTimestampMillis(Long startTimestampMillis) {
        this.startTimestampMillis = startTimestampMillis;
    }

    /**
     * <p>
     * The start time of the detected segment in milliseconds from the start of
     * the video. This value is rounded down. For example, if the actual
     * timestamp is 100.6667 milliseconds, Amazon Rekognition Video returns a
     * value of 100 millis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTimestampMillis <p>
     *            The start time of the detected segment in milliseconds from
     *            the start of the video. This value is rounded down. For
     *            example, if the actual timestamp is 100.6667 milliseconds,
     *            Amazon Rekognition Video returns a value of 100 millis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDetection withStartTimestampMillis(Long startTimestampMillis) {
        this.startTimestampMillis = startTimestampMillis;
        return this;
    }

    /**
     * <p>
     * The end time of the detected segment, in milliseconds, from the start of
     * the video. This value is rounded down.
     * </p>
     *
     * @return <p>
     *         The end time of the detected segment, in milliseconds, from the
     *         start of the video. This value is rounded down.
     *         </p>
     */
    public Long getEndTimestampMillis() {
        return endTimestampMillis;
    }

    /**
     * <p>
     * The end time of the detected segment, in milliseconds, from the start of
     * the video. This value is rounded down.
     * </p>
     *
     * @param endTimestampMillis <p>
     *            The end time of the detected segment, in milliseconds, from
     *            the start of the video. This value is rounded down.
     *            </p>
     */
    public void setEndTimestampMillis(Long endTimestampMillis) {
        this.endTimestampMillis = endTimestampMillis;
    }

    /**
     * <p>
     * The end time of the detected segment, in milliseconds, from the start of
     * the video. This value is rounded down.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTimestampMillis <p>
     *            The end time of the detected segment, in milliseconds, from
     *            the start of the video. This value is rounded down.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDetection withEndTimestampMillis(Long endTimestampMillis) {
        this.endTimestampMillis = endTimestampMillis;
        return this;
    }

    /**
     * <p>
     * The duration of the detected segment in milliseconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The duration of the detected segment in milliseconds.
     *         </p>
     */
    public Long getDurationMillis() {
        return durationMillis;
    }

    /**
     * <p>
     * The duration of the detected segment in milliseconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationMillis <p>
     *            The duration of the detected segment in milliseconds.
     *            </p>
     */
    public void setDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
    }

    /**
     * <p>
     * The duration of the detected segment in milliseconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationMillis <p>
     *            The duration of the detected segment in milliseconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDetection withDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
        return this;
    }

    /**
     * <p>
     * The frame-accurate SMPTE timecode, from the start of a video, for the
     * start of a detected segment. <code>StartTimecode</code> is in
     * <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     * </p>
     *
     * @return <p>
     *         The frame-accurate SMPTE timecode, from the start of a video, for
     *         the start of a detected segment. <code>StartTimecode</code> is in
     *         <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     *         </p>
     */
    public String getStartTimecodeSMPTE() {
        return startTimecodeSMPTE;
    }

    /**
     * <p>
     * The frame-accurate SMPTE timecode, from the start of a video, for the
     * start of a detected segment. <code>StartTimecode</code> is in
     * <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     * </p>
     *
     * @param startTimecodeSMPTE <p>
     *            The frame-accurate SMPTE timecode, from the start of a video,
     *            for the start of a detected segment.
     *            <code>StartTimecode</code> is in <i>HH:MM:SS:fr</i> format
     *            (and <i>;fr</i> for drop frame-rates).
     *            </p>
     */
    public void setStartTimecodeSMPTE(String startTimecodeSMPTE) {
        this.startTimecodeSMPTE = startTimecodeSMPTE;
    }

    /**
     * <p>
     * The frame-accurate SMPTE timecode, from the start of a video, for the
     * start of a detected segment. <code>StartTimecode</code> is in
     * <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTimecodeSMPTE <p>
     *            The frame-accurate SMPTE timecode, from the start of a video,
     *            for the start of a detected segment.
     *            <code>StartTimecode</code> is in <i>HH:MM:SS:fr</i> format
     *            (and <i>;fr</i> for drop frame-rates).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDetection withStartTimecodeSMPTE(String startTimecodeSMPTE) {
        this.startTimecodeSMPTE = startTimecodeSMPTE;
        return this;
    }

    /**
     * <p>
     * The frame-accurate SMPTE timecode, from the start of a video, for the end
     * of a detected segment. <code>EndTimecode</code> is in <i>HH:MM:SS:fr</i>
     * format (and <i>;fr</i> for drop frame-rates).
     * </p>
     *
     * @return <p>
     *         The frame-accurate SMPTE timecode, from the start of a video, for
     *         the end of a detected segment. <code>EndTimecode</code> is in
     *         <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     *         </p>
     */
    public String getEndTimecodeSMPTE() {
        return endTimecodeSMPTE;
    }

    /**
     * <p>
     * The frame-accurate SMPTE timecode, from the start of a video, for the end
     * of a detected segment. <code>EndTimecode</code> is in <i>HH:MM:SS:fr</i>
     * format (and <i>;fr</i> for drop frame-rates).
     * </p>
     *
     * @param endTimecodeSMPTE <p>
     *            The frame-accurate SMPTE timecode, from the start of a video,
     *            for the end of a detected segment. <code>EndTimecode</code> is
     *            in <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop
     *            frame-rates).
     *            </p>
     */
    public void setEndTimecodeSMPTE(String endTimecodeSMPTE) {
        this.endTimecodeSMPTE = endTimecodeSMPTE;
    }

    /**
     * <p>
     * The frame-accurate SMPTE timecode, from the start of a video, for the end
     * of a detected segment. <code>EndTimecode</code> is in <i>HH:MM:SS:fr</i>
     * format (and <i>;fr</i> for drop frame-rates).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTimecodeSMPTE <p>
     *            The frame-accurate SMPTE timecode, from the start of a video,
     *            for the end of a detected segment. <code>EndTimecode</code> is
     *            in <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop
     *            frame-rates).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDetection withEndTimecodeSMPTE(String endTimecodeSMPTE) {
        this.endTimecodeSMPTE = endTimecodeSMPTE;
        return this;
    }

    /**
     * <p>
     * The duration of the timecode for the detected segment in SMPTE format.
     * </p>
     *
     * @return <p>
     *         The duration of the timecode for the detected segment in SMPTE
     *         format.
     *         </p>
     */
    public String getDurationSMPTE() {
        return durationSMPTE;
    }

    /**
     * <p>
     * The duration of the timecode for the detected segment in SMPTE format.
     * </p>
     *
     * @param durationSMPTE <p>
     *            The duration of the timecode for the detected segment in SMPTE
     *            format.
     *            </p>
     */
    public void setDurationSMPTE(String durationSMPTE) {
        this.durationSMPTE = durationSMPTE;
    }

    /**
     * <p>
     * The duration of the timecode for the detected segment in SMPTE format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param durationSMPTE <p>
     *            The duration of the timecode for the detected segment in SMPTE
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDetection withDurationSMPTE(String durationSMPTE) {
        this.durationSMPTE = durationSMPTE;
        return this;
    }

    /**
     * <p>
     * If the segment is a technical cue, contains information about the
     * technical cue.
     * </p>
     *
     * @return <p>
     *         If the segment is a technical cue, contains information about the
     *         technical cue.
     *         </p>
     */
    public TechnicalCueSegment getTechnicalCueSegment() {
        return technicalCueSegment;
    }

    /**
     * <p>
     * If the segment is a technical cue, contains information about the
     * technical cue.
     * </p>
     *
     * @param technicalCueSegment <p>
     *            If the segment is a technical cue, contains information about
     *            the technical cue.
     *            </p>
     */
    public void setTechnicalCueSegment(TechnicalCueSegment technicalCueSegment) {
        this.technicalCueSegment = technicalCueSegment;
    }

    /**
     * <p>
     * If the segment is a technical cue, contains information about the
     * technical cue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param technicalCueSegment <p>
     *            If the segment is a technical cue, contains information about
     *            the technical cue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDetection withTechnicalCueSegment(TechnicalCueSegment technicalCueSegment) {
        this.technicalCueSegment = technicalCueSegment;
        return this;
    }

    /**
     * <p>
     * If the segment is a shot detection, contains information about the shot
     * detection.
     * </p>
     *
     * @return <p>
     *         If the segment is a shot detection, contains information about
     *         the shot detection.
     *         </p>
     */
    public ShotSegment getShotSegment() {
        return shotSegment;
    }

    /**
     * <p>
     * If the segment is a shot detection, contains information about the shot
     * detection.
     * </p>
     *
     * @param shotSegment <p>
     *            If the segment is a shot detection, contains information about
     *            the shot detection.
     *            </p>
     */
    public void setShotSegment(ShotSegment shotSegment) {
        this.shotSegment = shotSegment;
    }

    /**
     * <p>
     * If the segment is a shot detection, contains information about the shot
     * detection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shotSegment <p>
     *            If the segment is a shot detection, contains information about
     *            the shot detection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDetection withShotSegment(ShotSegment shotSegment) {
        this.shotSegment = shotSegment;
        return this;
    }

    /**
     * <p>
     * The frame number of the start of a video segment, using a frame index
     * that starts with 0.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The frame number of the start of a video segment, using a frame
     *         index that starts with 0.
     *         </p>
     */
    public Long getStartFrameNumber() {
        return startFrameNumber;
    }

    /**
     * <p>
     * The frame number of the start of a video segment, using a frame index
     * that starts with 0.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param startFrameNumber <p>
     *            The frame number of the start of a video segment, using a
     *            frame index that starts with 0.
     *            </p>
     */
    public void setStartFrameNumber(Long startFrameNumber) {
        this.startFrameNumber = startFrameNumber;
    }

    /**
     * <p>
     * The frame number of the start of a video segment, using a frame index
     * that starts with 0.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param startFrameNumber <p>
     *            The frame number of the start of a video segment, using a
     *            frame index that starts with 0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDetection withStartFrameNumber(Long startFrameNumber) {
        this.startFrameNumber = startFrameNumber;
        return this;
    }

    /**
     * <p>
     * The frame number at the end of a video segment, using a frame index that
     * starts with 0.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The frame number at the end of a video segment, using a frame
     *         index that starts with 0.
     *         </p>
     */
    public Long getEndFrameNumber() {
        return endFrameNumber;
    }

    /**
     * <p>
     * The frame number at the end of a video segment, using a frame index that
     * starts with 0.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param endFrameNumber <p>
     *            The frame number at the end of a video segment, using a frame
     *            index that starts with 0.
     *            </p>
     */
    public void setEndFrameNumber(Long endFrameNumber) {
        this.endFrameNumber = endFrameNumber;
    }

    /**
     * <p>
     * The frame number at the end of a video segment, using a frame index that
     * starts with 0.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param endFrameNumber <p>
     *            The frame number at the end of a video segment, using a frame
     *            index that starts with 0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDetection withEndFrameNumber(Long endFrameNumber) {
        this.endFrameNumber = endFrameNumber;
        return this;
    }

    /**
     * <p>
     * The duration of a video segment, expressed in frames.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The duration of a video segment, expressed in frames.
     *         </p>
     */
    public Long getDurationFrames() {
        return durationFrames;
    }

    /**
     * <p>
     * The duration of a video segment, expressed in frames.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationFrames <p>
     *            The duration of a video segment, expressed in frames.
     *            </p>
     */
    public void setDurationFrames(Long durationFrames) {
        this.durationFrames = durationFrames;
    }

    /**
     * <p>
     * The duration of a video segment, expressed in frames.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationFrames <p>
     *            The duration of a video segment, expressed in frames.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDetection withDurationFrames(Long durationFrames) {
        this.durationFrames = durationFrames;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getStartTimestampMillis() != null)
            sb.append("StartTimestampMillis: " + getStartTimestampMillis() + ",");
        if (getEndTimestampMillis() != null)
            sb.append("EndTimestampMillis: " + getEndTimestampMillis() + ",");
        if (getDurationMillis() != null)
            sb.append("DurationMillis: " + getDurationMillis() + ",");
        if (getStartTimecodeSMPTE() != null)
            sb.append("StartTimecodeSMPTE: " + getStartTimecodeSMPTE() + ",");
        if (getEndTimecodeSMPTE() != null)
            sb.append("EndTimecodeSMPTE: " + getEndTimecodeSMPTE() + ",");
        if (getDurationSMPTE() != null)
            sb.append("DurationSMPTE: " + getDurationSMPTE() + ",");
        if (getTechnicalCueSegment() != null)
            sb.append("TechnicalCueSegment: " + getTechnicalCueSegment() + ",");
        if (getShotSegment() != null)
            sb.append("ShotSegment: " + getShotSegment() + ",");
        if (getStartFrameNumber() != null)
            sb.append("StartFrameNumber: " + getStartFrameNumber() + ",");
        if (getEndFrameNumber() != null)
            sb.append("EndFrameNumber: " + getEndFrameNumber() + ",");
        if (getDurationFrames() != null)
            sb.append("DurationFrames: " + getDurationFrames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getStartTimestampMillis() == null) ? 0 : getStartTimestampMillis().hashCode());
        hashCode = prime * hashCode
                + ((getEndTimestampMillis() == null) ? 0 : getEndTimestampMillis().hashCode());
        hashCode = prime * hashCode
                + ((getDurationMillis() == null) ? 0 : getDurationMillis().hashCode());
        hashCode = prime * hashCode
                + ((getStartTimecodeSMPTE() == null) ? 0 : getStartTimecodeSMPTE().hashCode());
        hashCode = prime * hashCode
                + ((getEndTimecodeSMPTE() == null) ? 0 : getEndTimecodeSMPTE().hashCode());
        hashCode = prime * hashCode
                + ((getDurationSMPTE() == null) ? 0 : getDurationSMPTE().hashCode());
        hashCode = prime * hashCode
                + ((getTechnicalCueSegment() == null) ? 0 : getTechnicalCueSegment().hashCode());
        hashCode = prime * hashCode
                + ((getShotSegment() == null) ? 0 : getShotSegment().hashCode());
        hashCode = prime * hashCode
                + ((getStartFrameNumber() == null) ? 0 : getStartFrameNumber().hashCode());
        hashCode = prime * hashCode
                + ((getEndFrameNumber() == null) ? 0 : getEndFrameNumber().hashCode());
        hashCode = prime * hashCode
                + ((getDurationFrames() == null) ? 0 : getDurationFrames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentDetection == false)
            return false;
        SegmentDetection other = (SegmentDetection) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStartTimestampMillis() == null ^ this.getStartTimestampMillis() == null)
            return false;
        if (other.getStartTimestampMillis() != null
                && other.getStartTimestampMillis().equals(this.getStartTimestampMillis()) == false)
            return false;
        if (other.getEndTimestampMillis() == null ^ this.getEndTimestampMillis() == null)
            return false;
        if (other.getEndTimestampMillis() != null
                && other.getEndTimestampMillis().equals(this.getEndTimestampMillis()) == false)
            return false;
        if (other.getDurationMillis() == null ^ this.getDurationMillis() == null)
            return false;
        if (other.getDurationMillis() != null
                && other.getDurationMillis().equals(this.getDurationMillis()) == false)
            return false;
        if (other.getStartTimecodeSMPTE() == null ^ this.getStartTimecodeSMPTE() == null)
            return false;
        if (other.getStartTimecodeSMPTE() != null
                && other.getStartTimecodeSMPTE().equals(this.getStartTimecodeSMPTE()) == false)
            return false;
        if (other.getEndTimecodeSMPTE() == null ^ this.getEndTimecodeSMPTE() == null)
            return false;
        if (other.getEndTimecodeSMPTE() != null
                && other.getEndTimecodeSMPTE().equals(this.getEndTimecodeSMPTE()) == false)
            return false;
        if (other.getDurationSMPTE() == null ^ this.getDurationSMPTE() == null)
            return false;
        if (other.getDurationSMPTE() != null
                && other.getDurationSMPTE().equals(this.getDurationSMPTE()) == false)
            return false;
        if (other.getTechnicalCueSegment() == null ^ this.getTechnicalCueSegment() == null)
            return false;
        if (other.getTechnicalCueSegment() != null
                && other.getTechnicalCueSegment().equals(this.getTechnicalCueSegment()) == false)
            return false;
        if (other.getShotSegment() == null ^ this.getShotSegment() == null)
            return false;
        if (other.getShotSegment() != null
                && other.getShotSegment().equals(this.getShotSegment()) == false)
            return false;
        if (other.getStartFrameNumber() == null ^ this.getStartFrameNumber() == null)
            return false;
        if (other.getStartFrameNumber() != null
                && other.getStartFrameNumber().equals(this.getStartFrameNumber()) == false)
            return false;
        if (other.getEndFrameNumber() == null ^ this.getEndFrameNumber() == null)
            return false;
        if (other.getEndFrameNumber() != null
                && other.getEndFrameNumber().equals(this.getEndFrameNumber()) == false)
            return false;
        if (other.getDurationFrames() == null ^ this.getDurationFrames() == null)
            return false;
        if (other.getDurationFrames() != null
                && other.getDurationFrames().equals(this.getDurationFrames()) == false)
            return false;
        return true;
    }
}
