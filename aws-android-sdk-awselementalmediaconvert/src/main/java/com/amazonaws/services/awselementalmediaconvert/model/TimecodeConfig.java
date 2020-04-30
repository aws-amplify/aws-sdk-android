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
 * These settings control how the service handles timecodes throughout the job.
 * These settings don't affect input clipping.
 */
public class TimecodeConfig implements Serializable {
    /**
     * If you use an editing platform that relies on an anchor timecode, use
     * Anchor Timecode (Anchor) to specify a timecode that will match the input
     * video frame to the output video frame. Use 24-hour format with frame
     * number, (HH:MM:SS:FF) or (HH:MM:SS;FF). This setting ignores frame rate
     * conversion. System behavior for Anchor Timecode varies depending on your
     * setting for Source (TimecodeSource). * If Source (TimecodeSource) is set
     * to Specified Start (SPECIFIEDSTART), the first input frame is the
     * specified value in Start Timecode (Start). Anchor Timecode (Anchor) and
     * Start Timecode (Start) are used calculate output timecode. * If Source
     * (TimecodeSource) is set to Start at 0 (ZEROBASED) the first frame is
     * 00:00:00:00. * If Source (TimecodeSource) is set to Embedded (EMBEDDED),
     * the first frame is the timecode value on the first input frame of the
     * input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([01][0-9]|2[0-4]):[0-5][0-9]:[0-5][0-9][:;][0-9]{2}$
     * <br/>
     */
    private String anchor;

    /**
     * Use Source (TimecodeSource) to set how timecodes are handled within this
     * job. To make sure that your video, audio, captions, and markers are
     * synchronized and that time-based features, such as image inserter, work
     * correctly, choose the Timecode source option that matches your assets.
     * All timecodes are in a 24-hour format with frame number (HH:MM:SS:FF). *
     * Embedded (EMBEDDED) - Use the timecode that is in the input video. If no
     * embedded timecode is in the source, the service will use Start at 0
     * (ZEROBASED) instead. * Start at 0 (ZEROBASED) - Set the timecode of the
     * initial frame to 00:00:00:00. * Specified Start (SPECIFIEDSTART) - Set
     * the timecode of the initial frame to a value other than zero. You use
     * Start timecode (Start) to provide this value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMBEDDED, ZEROBASED, SPECIFIEDSTART
     */
    private String source;

    /**
     * Only use when you set Source (TimecodeSource) to Specified start
     * (SPECIFIEDSTART). Use Start timecode (Start) to specify the timecode for
     * the initial frame. Use 24-hour format with frame number, (HH:MM:SS:FF) or
     * (HH:MM:SS;FF).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([01][0-9]|2[0-4]):[0-5][0-9]:[0-5][0-9][:;][0-9]{2}$
     * <br/>
     */
    private String start;

    /**
     * Only applies to outputs that support program-date-time stamp. Use
     * Timestamp offset (TimestampOffset) to overwrite the timecode date without
     * affecting the time and frame number. Provide the new date as a string in
     * the format "yyyy-mm-dd". To use Time stamp offset, you must also enable
     * Insert program-date-time (InsertProgramDateTime) in the output settings.
     * For example, if the date part of your timecodes is 2002-1-25 and you want
     * to change it to one year later, set Timestamp offset (TimestampOffset) to
     * 2003-1-25.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$
     * <br/>
     */
    private String timestampOffset;

    /**
     * If you use an editing platform that relies on an anchor timecode, use
     * Anchor Timecode (Anchor) to specify a timecode that will match the input
     * video frame to the output video frame. Use 24-hour format with frame
     * number, (HH:MM:SS:FF) or (HH:MM:SS;FF). This setting ignores frame rate
     * conversion. System behavior for Anchor Timecode varies depending on your
     * setting for Source (TimecodeSource). * If Source (TimecodeSource) is set
     * to Specified Start (SPECIFIEDSTART), the first input frame is the
     * specified value in Start Timecode (Start). Anchor Timecode (Anchor) and
     * Start Timecode (Start) are used calculate output timecode. * If Source
     * (TimecodeSource) is set to Start at 0 (ZEROBASED) the first frame is
     * 00:00:00:00. * If Source (TimecodeSource) is set to Embedded (EMBEDDED),
     * the first frame is the timecode value on the first input frame of the
     * input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([01][0-9]|2[0-4]):[0-5][0-9]:[0-5][0-9][:;][0-9]{2}$
     * <br/>
     *
     * @return If you use an editing platform that relies on an anchor timecode,
     *         use Anchor Timecode (Anchor) to specify a timecode that will
     *         match the input video frame to the output video frame. Use
     *         24-hour format with frame number, (HH:MM:SS:FF) or (HH:MM:SS;FF).
     *         This setting ignores frame rate conversion. System behavior for
     *         Anchor Timecode varies depending on your setting for Source
     *         (TimecodeSource). * If Source (TimecodeSource) is set to
     *         Specified Start (SPECIFIEDSTART), the first input frame is the
     *         specified value in Start Timecode (Start). Anchor Timecode
     *         (Anchor) and Start Timecode (Start) are used calculate output
     *         timecode. * If Source (TimecodeSource) is set to Start at 0
     *         (ZEROBASED) the first frame is 00:00:00:00. * If Source
     *         (TimecodeSource) is set to Embedded (EMBEDDED), the first frame
     *         is the timecode value on the first input frame of the input.
     */
    public String getAnchor() {
        return anchor;
    }

    /**
     * If you use an editing platform that relies on an anchor timecode, use
     * Anchor Timecode (Anchor) to specify a timecode that will match the input
     * video frame to the output video frame. Use 24-hour format with frame
     * number, (HH:MM:SS:FF) or (HH:MM:SS;FF). This setting ignores frame rate
     * conversion. System behavior for Anchor Timecode varies depending on your
     * setting for Source (TimecodeSource). * If Source (TimecodeSource) is set
     * to Specified Start (SPECIFIEDSTART), the first input frame is the
     * specified value in Start Timecode (Start). Anchor Timecode (Anchor) and
     * Start Timecode (Start) are used calculate output timecode. * If Source
     * (TimecodeSource) is set to Start at 0 (ZEROBASED) the first frame is
     * 00:00:00:00. * If Source (TimecodeSource) is set to Embedded (EMBEDDED),
     * the first frame is the timecode value on the first input frame of the
     * input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([01][0-9]|2[0-4]):[0-5][0-9]:[0-5][0-9][:;][0-9]{2}$
     * <br/>
     *
     * @param anchor If you use an editing platform that relies on an anchor
     *            timecode, use Anchor Timecode (Anchor) to specify a timecode
     *            that will match the input video frame to the output video
     *            frame. Use 24-hour format with frame number, (HH:MM:SS:FF) or
     *            (HH:MM:SS;FF). This setting ignores frame rate conversion.
     *            System behavior for Anchor Timecode varies depending on your
     *            setting for Source (TimecodeSource). * If Source
     *            (TimecodeSource) is set to Specified Start (SPECIFIEDSTART),
     *            the first input frame is the specified value in Start Timecode
     *            (Start). Anchor Timecode (Anchor) and Start Timecode (Start)
     *            are used calculate output timecode. * If Source
     *            (TimecodeSource) is set to Start at 0 (ZEROBASED) the first
     *            frame is 00:00:00:00. * If Source (TimecodeSource) is set to
     *            Embedded (EMBEDDED), the first frame is the timecode value on
     *            the first input frame of the input.
     */
    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    /**
     * If you use an editing platform that relies on an anchor timecode, use
     * Anchor Timecode (Anchor) to specify a timecode that will match the input
     * video frame to the output video frame. Use 24-hour format with frame
     * number, (HH:MM:SS:FF) or (HH:MM:SS;FF). This setting ignores frame rate
     * conversion. System behavior for Anchor Timecode varies depending on your
     * setting for Source (TimecodeSource). * If Source (TimecodeSource) is set
     * to Specified Start (SPECIFIEDSTART), the first input frame is the
     * specified value in Start Timecode (Start). Anchor Timecode (Anchor) and
     * Start Timecode (Start) are used calculate output timecode. * If Source
     * (TimecodeSource) is set to Start at 0 (ZEROBASED) the first frame is
     * 00:00:00:00. * If Source (TimecodeSource) is set to Embedded (EMBEDDED),
     * the first frame is the timecode value on the first input frame of the
     * input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([01][0-9]|2[0-4]):[0-5][0-9]:[0-5][0-9][:;][0-9]{2}$
     * <br/>
     *
     * @param anchor If you use an editing platform that relies on an anchor
     *            timecode, use Anchor Timecode (Anchor) to specify a timecode
     *            that will match the input video frame to the output video
     *            frame. Use 24-hour format with frame number, (HH:MM:SS:FF) or
     *            (HH:MM:SS;FF). This setting ignores frame rate conversion.
     *            System behavior for Anchor Timecode varies depending on your
     *            setting for Source (TimecodeSource). * If Source
     *            (TimecodeSource) is set to Specified Start (SPECIFIEDSTART),
     *            the first input frame is the specified value in Start Timecode
     *            (Start). Anchor Timecode (Anchor) and Start Timecode (Start)
     *            are used calculate output timecode. * If Source
     *            (TimecodeSource) is set to Start at 0 (ZEROBASED) the first
     *            frame is 00:00:00:00. * If Source (TimecodeSource) is set to
     *            Embedded (EMBEDDED), the first frame is the timecode value on
     *            the first input frame of the input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimecodeConfig withAnchor(String anchor) {
        this.anchor = anchor;
        return this;
    }

    /**
     * Use Source (TimecodeSource) to set how timecodes are handled within this
     * job. To make sure that your video, audio, captions, and markers are
     * synchronized and that time-based features, such as image inserter, work
     * correctly, choose the Timecode source option that matches your assets.
     * All timecodes are in a 24-hour format with frame number (HH:MM:SS:FF). *
     * Embedded (EMBEDDED) - Use the timecode that is in the input video. If no
     * embedded timecode is in the source, the service will use Start at 0
     * (ZEROBASED) instead. * Start at 0 (ZEROBASED) - Set the timecode of the
     * initial frame to 00:00:00:00. * Specified Start (SPECIFIEDSTART) - Set
     * the timecode of the initial frame to a value other than zero. You use
     * Start timecode (Start) to provide this value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMBEDDED, ZEROBASED, SPECIFIEDSTART
     *
     * @return Use Source (TimecodeSource) to set how timecodes are handled
     *         within this job. To make sure that your video, audio, captions,
     *         and markers are synchronized and that time-based features, such
     *         as image inserter, work correctly, choose the Timecode source
     *         option that matches your assets. All timecodes are in a 24-hour
     *         format with frame number (HH:MM:SS:FF). * Embedded (EMBEDDED) -
     *         Use the timecode that is in the input video. If no embedded
     *         timecode is in the source, the service will use Start at 0
     *         (ZEROBASED) instead. * Start at 0 (ZEROBASED) - Set the timecode
     *         of the initial frame to 00:00:00:00. * Specified Start
     *         (SPECIFIEDSTART) - Set the timecode of the initial frame to a
     *         value other than zero. You use Start timecode (Start) to provide
     *         this value.
     * @see TimecodeSource
     */
    public String getSource() {
        return source;
    }

    /**
     * Use Source (TimecodeSource) to set how timecodes are handled within this
     * job. To make sure that your video, audio, captions, and markers are
     * synchronized and that time-based features, such as image inserter, work
     * correctly, choose the Timecode source option that matches your assets.
     * All timecodes are in a 24-hour format with frame number (HH:MM:SS:FF). *
     * Embedded (EMBEDDED) - Use the timecode that is in the input video. If no
     * embedded timecode is in the source, the service will use Start at 0
     * (ZEROBASED) instead. * Start at 0 (ZEROBASED) - Set the timecode of the
     * initial frame to 00:00:00:00. * Specified Start (SPECIFIEDSTART) - Set
     * the timecode of the initial frame to a value other than zero. You use
     * Start timecode (Start) to provide this value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMBEDDED, ZEROBASED, SPECIFIEDSTART
     *
     * @param source Use Source (TimecodeSource) to set how timecodes are
     *            handled within this job. To make sure that your video, audio,
     *            captions, and markers are synchronized and that time-based
     *            features, such as image inserter, work correctly, choose the
     *            Timecode source option that matches your assets. All timecodes
     *            are in a 24-hour format with frame number (HH:MM:SS:FF). *
     *            Embedded (EMBEDDED) - Use the timecode that is in the input
     *            video. If no embedded timecode is in the source, the service
     *            will use Start at 0 (ZEROBASED) instead. * Start at 0
     *            (ZEROBASED) - Set the timecode of the initial frame to
     *            00:00:00:00. * Specified Start (SPECIFIEDSTART) - Set the
     *            timecode of the initial frame to a value other than zero. You
     *            use Start timecode (Start) to provide this value.
     * @see TimecodeSource
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Use Source (TimecodeSource) to set how timecodes are handled within this
     * job. To make sure that your video, audio, captions, and markers are
     * synchronized and that time-based features, such as image inserter, work
     * correctly, choose the Timecode source option that matches your assets.
     * All timecodes are in a 24-hour format with frame number (HH:MM:SS:FF). *
     * Embedded (EMBEDDED) - Use the timecode that is in the input video. If no
     * embedded timecode is in the source, the service will use Start at 0
     * (ZEROBASED) instead. * Start at 0 (ZEROBASED) - Set the timecode of the
     * initial frame to 00:00:00:00. * Specified Start (SPECIFIEDSTART) - Set
     * the timecode of the initial frame to a value other than zero. You use
     * Start timecode (Start) to provide this value.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMBEDDED, ZEROBASED, SPECIFIEDSTART
     *
     * @param source Use Source (TimecodeSource) to set how timecodes are
     *            handled within this job. To make sure that your video, audio,
     *            captions, and markers are synchronized and that time-based
     *            features, such as image inserter, work correctly, choose the
     *            Timecode source option that matches your assets. All timecodes
     *            are in a 24-hour format with frame number (HH:MM:SS:FF). *
     *            Embedded (EMBEDDED) - Use the timecode that is in the input
     *            video. If no embedded timecode is in the source, the service
     *            will use Start at 0 (ZEROBASED) instead. * Start at 0
     *            (ZEROBASED) - Set the timecode of the initial frame to
     *            00:00:00:00. * Specified Start (SPECIFIEDSTART) - Set the
     *            timecode of the initial frame to a value other than zero. You
     *            use Start timecode (Start) to provide this value.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimecodeSource
     */
    public TimecodeConfig withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Use Source (TimecodeSource) to set how timecodes are handled within this
     * job. To make sure that your video, audio, captions, and markers are
     * synchronized and that time-based features, such as image inserter, work
     * correctly, choose the Timecode source option that matches your assets.
     * All timecodes are in a 24-hour format with frame number (HH:MM:SS:FF). *
     * Embedded (EMBEDDED) - Use the timecode that is in the input video. If no
     * embedded timecode is in the source, the service will use Start at 0
     * (ZEROBASED) instead. * Start at 0 (ZEROBASED) - Set the timecode of the
     * initial frame to 00:00:00:00. * Specified Start (SPECIFIEDSTART) - Set
     * the timecode of the initial frame to a value other than zero. You use
     * Start timecode (Start) to provide this value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMBEDDED, ZEROBASED, SPECIFIEDSTART
     *
     * @param source Use Source (TimecodeSource) to set how timecodes are
     *            handled within this job. To make sure that your video, audio,
     *            captions, and markers are synchronized and that time-based
     *            features, such as image inserter, work correctly, choose the
     *            Timecode source option that matches your assets. All timecodes
     *            are in a 24-hour format with frame number (HH:MM:SS:FF). *
     *            Embedded (EMBEDDED) - Use the timecode that is in the input
     *            video. If no embedded timecode is in the source, the service
     *            will use Start at 0 (ZEROBASED) instead. * Start at 0
     *            (ZEROBASED) - Set the timecode of the initial frame to
     *            00:00:00:00. * Specified Start (SPECIFIEDSTART) - Set the
     *            timecode of the initial frame to a value other than zero. You
     *            use Start timecode (Start) to provide this value.
     * @see TimecodeSource
     */
    public void setSource(TimecodeSource source) {
        this.source = source.toString();
    }

    /**
     * Use Source (TimecodeSource) to set how timecodes are handled within this
     * job. To make sure that your video, audio, captions, and markers are
     * synchronized and that time-based features, such as image inserter, work
     * correctly, choose the Timecode source option that matches your assets.
     * All timecodes are in a 24-hour format with frame number (HH:MM:SS:FF). *
     * Embedded (EMBEDDED) - Use the timecode that is in the input video. If no
     * embedded timecode is in the source, the service will use Start at 0
     * (ZEROBASED) instead. * Start at 0 (ZEROBASED) - Set the timecode of the
     * initial frame to 00:00:00:00. * Specified Start (SPECIFIEDSTART) - Set
     * the timecode of the initial frame to a value other than zero. You use
     * Start timecode (Start) to provide this value.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMBEDDED, ZEROBASED, SPECIFIEDSTART
     *
     * @param source Use Source (TimecodeSource) to set how timecodes are
     *            handled within this job. To make sure that your video, audio,
     *            captions, and markers are synchronized and that time-based
     *            features, such as image inserter, work correctly, choose the
     *            Timecode source option that matches your assets. All timecodes
     *            are in a 24-hour format with frame number (HH:MM:SS:FF). *
     *            Embedded (EMBEDDED) - Use the timecode that is in the input
     *            video. If no embedded timecode is in the source, the service
     *            will use Start at 0 (ZEROBASED) instead. * Start at 0
     *            (ZEROBASED) - Set the timecode of the initial frame to
     *            00:00:00:00. * Specified Start (SPECIFIEDSTART) - Set the
     *            timecode of the initial frame to a value other than zero. You
     *            use Start timecode (Start) to provide this value.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimecodeSource
     */
    public TimecodeConfig withSource(TimecodeSource source) {
        this.source = source.toString();
        return this;
    }

    /**
     * Only use when you set Source (TimecodeSource) to Specified start
     * (SPECIFIEDSTART). Use Start timecode (Start) to specify the timecode for
     * the initial frame. Use 24-hour format with frame number, (HH:MM:SS:FF) or
     * (HH:MM:SS;FF).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([01][0-9]|2[0-4]):[0-5][0-9]:[0-5][0-9][:;][0-9]{2}$
     * <br/>
     *
     * @return Only use when you set Source (TimecodeSource) to Specified start
     *         (SPECIFIEDSTART). Use Start timecode (Start) to specify the
     *         timecode for the initial frame. Use 24-hour format with frame
     *         number, (HH:MM:SS:FF) or (HH:MM:SS;FF).
     */
    public String getStart() {
        return start;
    }

    /**
     * Only use when you set Source (TimecodeSource) to Specified start
     * (SPECIFIEDSTART). Use Start timecode (Start) to specify the timecode for
     * the initial frame. Use 24-hour format with frame number, (HH:MM:SS:FF) or
     * (HH:MM:SS;FF).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([01][0-9]|2[0-4]):[0-5][0-9]:[0-5][0-9][:;][0-9]{2}$
     * <br/>
     *
     * @param start Only use when you set Source (TimecodeSource) to Specified
     *            start (SPECIFIEDSTART). Use Start timecode (Start) to specify
     *            the timecode for the initial frame. Use 24-hour format with
     *            frame number, (HH:MM:SS:FF) or (HH:MM:SS;FF).
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * Only use when you set Source (TimecodeSource) to Specified start
     * (SPECIFIEDSTART). Use Start timecode (Start) to specify the timecode for
     * the initial frame. Use 24-hour format with frame number, (HH:MM:SS:FF) or
     * (HH:MM:SS;FF).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([01][0-9]|2[0-4]):[0-5][0-9]:[0-5][0-9][:;][0-9]{2}$
     * <br/>
     *
     * @param start Only use when you set Source (TimecodeSource) to Specified
     *            start (SPECIFIEDSTART). Use Start timecode (Start) to specify
     *            the timecode for the initial frame. Use 24-hour format with
     *            frame number, (HH:MM:SS:FF) or (HH:MM:SS;FF).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimecodeConfig withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * Only applies to outputs that support program-date-time stamp. Use
     * Timestamp offset (TimestampOffset) to overwrite the timecode date without
     * affecting the time and frame number. Provide the new date as a string in
     * the format "yyyy-mm-dd". To use Time stamp offset, you must also enable
     * Insert program-date-time (InsertProgramDateTime) in the output settings.
     * For example, if the date part of your timecodes is 2002-1-25 and you want
     * to change it to one year later, set Timestamp offset (TimestampOffset) to
     * 2003-1-25.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$
     * <br/>
     *
     * @return Only applies to outputs that support program-date-time stamp. Use
     *         Timestamp offset (TimestampOffset) to overwrite the timecode date
     *         without affecting the time and frame number. Provide the new date
     *         as a string in the format "yyyy-mm-dd". To use Time stamp offset,
     *         you must also enable Insert program-date-time
     *         (InsertProgramDateTime) in the output settings. For example, if
     *         the date part of your timecodes is 2002-1-25 and you want to
     *         change it to one year later, set Timestamp offset
     *         (TimestampOffset) to 2003-1-25.
     */
    public String getTimestampOffset() {
        return timestampOffset;
    }

    /**
     * Only applies to outputs that support program-date-time stamp. Use
     * Timestamp offset (TimestampOffset) to overwrite the timecode date without
     * affecting the time and frame number. Provide the new date as a string in
     * the format "yyyy-mm-dd". To use Time stamp offset, you must also enable
     * Insert program-date-time (InsertProgramDateTime) in the output settings.
     * For example, if the date part of your timecodes is 2002-1-25 and you want
     * to change it to one year later, set Timestamp offset (TimestampOffset) to
     * 2003-1-25.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$
     * <br/>
     *
     * @param timestampOffset Only applies to outputs that support
     *            program-date-time stamp. Use Timestamp offset
     *            (TimestampOffset) to overwrite the timecode date without
     *            affecting the time and frame number. Provide the new date as a
     *            string in the format "yyyy-mm-dd". To use Time stamp offset,
     *            you must also enable Insert program-date-time
     *            (InsertProgramDateTime) in the output settings. For example,
     *            if the date part of your timecodes is 2002-1-25 and you want
     *            to change it to one year later, set Timestamp offset
     *            (TimestampOffset) to 2003-1-25.
     */
    public void setTimestampOffset(String timestampOffset) {
        this.timestampOffset = timestampOffset;
    }

    /**
     * Only applies to outputs that support program-date-time stamp. Use
     * Timestamp offset (TimestampOffset) to overwrite the timecode date without
     * affecting the time and frame number. Provide the new date as a string in
     * the format "yyyy-mm-dd". To use Time stamp offset, you must also enable
     * Insert program-date-time (InsertProgramDateTime) in the output settings.
     * For example, if the date part of your timecodes is 2002-1-25 and you want
     * to change it to one year later, set Timestamp offset (TimestampOffset) to
     * 2003-1-25.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$
     * <br/>
     *
     * @param timestampOffset Only applies to outputs that support
     *            program-date-time stamp. Use Timestamp offset
     *            (TimestampOffset) to overwrite the timecode date without
     *            affecting the time and frame number. Provide the new date as a
     *            string in the format "yyyy-mm-dd". To use Time stamp offset,
     *            you must also enable Insert program-date-time
     *            (InsertProgramDateTime) in the output settings. For example,
     *            if the date part of your timecodes is 2002-1-25 and you want
     *            to change it to one year later, set Timestamp offset
     *            (TimestampOffset) to 2003-1-25.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimecodeConfig withTimestampOffset(String timestampOffset) {
        this.timestampOffset = timestampOffset;
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
        if (getAnchor() != null)
            sb.append("Anchor: " + getAnchor() + ",");
        if (getSource() != null)
            sb.append("Source: " + getSource() + ",");
        if (getStart() != null)
            sb.append("Start: " + getStart() + ",");
        if (getTimestampOffset() != null)
            sb.append("TimestampOffset: " + getTimestampOffset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnchor() == null) ? 0 : getAnchor().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode
                + ((getTimestampOffset() == null) ? 0 : getTimestampOffset().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimecodeConfig == false)
            return false;
        TimecodeConfig other = (TimecodeConfig) obj;

        if (other.getAnchor() == null ^ this.getAnchor() == null)
            return false;
        if (other.getAnchor() != null && other.getAnchor().equals(this.getAnchor()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getTimestampOffset() == null ^ this.getTimestampOffset() == null)
            return false;
        if (other.getTimestampOffset() != null
                && other.getTimestampOffset().equals(this.getTimestampOffset()) == false)
            return false;
        return true;
    }
}
