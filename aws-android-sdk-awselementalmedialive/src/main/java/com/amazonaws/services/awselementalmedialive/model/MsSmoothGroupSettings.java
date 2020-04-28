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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Ms Smooth Group Settings
 */
public class MsSmoothGroupSettings implements Serializable {
    /**
     * The value of the "Acquisition Point Identity" element used in each
     * message placed in the sparse track. Only enabled if sparseTrackType is
     * not "none".
     */
    private String acquisitionPointId;

    /**
     * If set to passthrough for an audio-only MS Smooth output, the fragment
     * absolute time will be set to the current timecode. This option does not
     * write timecodes to the audio elementary stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, USE_CONFIGURED_CLOCK
     */
    private String audioOnlyTimecodeControl;

    /**
     * If set to verifyAuthenticity, verify the https certificate chain to a
     * trusted Certificate Authority (CA). This will cause https outputs to
     * self-signed certificates to fail.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF_SIGNED, VERIFY_AUTHENTICITY
     */
    private String certificateMode;

    /**
     * Number of seconds to wait before retrying connection to the IIS server if
     * the connection is lost. Content will be cached during this time and the
     * cache will be be delivered to the IIS server once the connection is
     * re-established.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer connectionRetryInterval;

    /**
     * Smooth Streaming publish point on an IIS server. Elemental Live acts as a
     * "Push" encoder to IIS.
     */
    private OutputLocationRef destination;

    /**
     * MS Smooth event ID to be sent to the IIS server. Should only be specified
     * if eventIdMode is set to useConfigured.
     */
    private String eventId;

    /**
     * Specifies whether or not to send an event ID to the IIS server. If no
     * event ID is sent and the same Live Event is used without changing the
     * publishing point, clients might see cached video from the previous run.
     * Options: - "useConfigured" - use the value provided in eventId -
     * "useTimestamp" - generate and send an event ID based on the current
     * timestamp - "noEventId" - do not send an event ID to the IIS server.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_EVENT_ID, USE_CONFIGURED, USE_TIMESTAMP
     */
    private String eventIdMode;

    /**
     * When set to sendEos, send EOS signal to IIS server when stopping the
     * event
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SEND_EOS
     */
    private String eventStopBehavior;

    /**
     * Size in seconds of file cache for streaming outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer filecacheDuration;

    /**
     * Length of mp4 fragments to generate (in seconds). Fragment length must be
     * compatible with GOP size and framerate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer fragmentLength;

    /**
     * Parameter that control output group behavior on input loss.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMIT_OUTPUT, PAUSE_OUTPUT
     */
    private String inputLossAction;

    /**
     * Number of retry attempts.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer numRetries;

    /**
     * Number of seconds before initiating a restart due to output failure, due
     * to exhausting the numRetries on one segment, or exceeding
     * filecacheDuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer restartDelay;

    /**
     * useInputSegmentation has been deprecated. The configured segment size is
     * always used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION
     */
    private String segmentationMode;

    /**
     * Number of milliseconds to delay the output from the second pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     */
    private Integer sendDelayMs;

    /**
     * If set to scte35, use incoming SCTE-35 messages to generate a sparse
     * track in this group of MS-Smooth outputs. scte35WithoutSegmentation is
     * the same as scte35, except EML will not start a new segment at a SCTE-35
     * marker. It will still encode an IDR frame at a SCTE-35 marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SCTE_35, SCTE_35_WITHOUT_SEGMENTATION
     */
    private String sparseTrackType;

    /**
     * When set to send, send stream manifest so publishing point doesn't start
     * until all streams start.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DO_NOT_SEND, SEND
     */
    private String streamManifestBehavior;

    /**
     * Timestamp offset for the event. Only used if timestampOffsetMode is set
     * to useConfiguredOffset.
     */
    private String timestampOffset;

    /**
     * Type of timestamp date offset to use. - useEventStartDate: Use the date
     * the event was started as the offset - useConfiguredOffset: Use an
     * explicitly configured date as the offset
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE_CONFIGURED_OFFSET, USE_EVENT_START_DATE
     */
    private String timestampOffsetMode;

    /**
     * The value of the "Acquisition Point Identity" element used in each
     * message placed in the sparse track. Only enabled if sparseTrackType is
     * not "none".
     *
     * @return The value of the "Acquisition Point Identity" element used in
     *         each message placed in the sparse track. Only enabled if
     *         sparseTrackType is not "none".
     */
    public String getAcquisitionPointId() {
        return acquisitionPointId;
    }

    /**
     * The value of the "Acquisition Point Identity" element used in each
     * message placed in the sparse track. Only enabled if sparseTrackType is
     * not "none".
     *
     * @param acquisitionPointId The value of the "Acquisition Point Identity"
     *            element used in each message placed in the sparse track. Only
     *            enabled if sparseTrackType is not "none".
     */
    public void setAcquisitionPointId(String acquisitionPointId) {
        this.acquisitionPointId = acquisitionPointId;
    }

    /**
     * The value of the "Acquisition Point Identity" element used in each
     * message placed in the sparse track. Only enabled if sparseTrackType is
     * not "none".
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acquisitionPointId The value of the "Acquisition Point Identity"
     *            element used in each message placed in the sparse track. Only
     *            enabled if sparseTrackType is not "none".
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MsSmoothGroupSettings withAcquisitionPointId(String acquisitionPointId) {
        this.acquisitionPointId = acquisitionPointId;
        return this;
    }

    /**
     * If set to passthrough for an audio-only MS Smooth output, the fragment
     * absolute time will be set to the current timecode. This option does not
     * write timecodes to the audio elementary stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, USE_CONFIGURED_CLOCK
     *
     * @return If set to passthrough for an audio-only MS Smooth output, the
     *         fragment absolute time will be set to the current timecode. This
     *         option does not write timecodes to the audio elementary stream.
     * @see SmoothGroupAudioOnlyTimecodeControl
     */
    public String getAudioOnlyTimecodeControl() {
        return audioOnlyTimecodeControl;
    }

    /**
     * If set to passthrough for an audio-only MS Smooth output, the fragment
     * absolute time will be set to the current timecode. This option does not
     * write timecodes to the audio elementary stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, USE_CONFIGURED_CLOCK
     *
     * @param audioOnlyTimecodeControl If set to passthrough for an audio-only
     *            MS Smooth output, the fragment absolute time will be set to
     *            the current timecode. This option does not write timecodes to
     *            the audio elementary stream.
     * @see SmoothGroupAudioOnlyTimecodeControl
     */
    public void setAudioOnlyTimecodeControl(String audioOnlyTimecodeControl) {
        this.audioOnlyTimecodeControl = audioOnlyTimecodeControl;
    }

    /**
     * If set to passthrough for an audio-only MS Smooth output, the fragment
     * absolute time will be set to the current timecode. This option does not
     * write timecodes to the audio elementary stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, USE_CONFIGURED_CLOCK
     *
     * @param audioOnlyTimecodeControl If set to passthrough for an audio-only
     *            MS Smooth output, the fragment absolute time will be set to
     *            the current timecode. This option does not write timecodes to
     *            the audio elementary stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SmoothGroupAudioOnlyTimecodeControl
     */
    public MsSmoothGroupSettings withAudioOnlyTimecodeControl(String audioOnlyTimecodeControl) {
        this.audioOnlyTimecodeControl = audioOnlyTimecodeControl;
        return this;
    }

    /**
     * If set to passthrough for an audio-only MS Smooth output, the fragment
     * absolute time will be set to the current timecode. This option does not
     * write timecodes to the audio elementary stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, USE_CONFIGURED_CLOCK
     *
     * @param audioOnlyTimecodeControl If set to passthrough for an audio-only
     *            MS Smooth output, the fragment absolute time will be set to
     *            the current timecode. This option does not write timecodes to
     *            the audio elementary stream.
     * @see SmoothGroupAudioOnlyTimecodeControl
     */
    public void setAudioOnlyTimecodeControl(
            SmoothGroupAudioOnlyTimecodeControl audioOnlyTimecodeControl) {
        this.audioOnlyTimecodeControl = audioOnlyTimecodeControl.toString();
    }

    /**
     * If set to passthrough for an audio-only MS Smooth output, the fragment
     * absolute time will be set to the current timecode. This option does not
     * write timecodes to the audio elementary stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, USE_CONFIGURED_CLOCK
     *
     * @param audioOnlyTimecodeControl If set to passthrough for an audio-only
     *            MS Smooth output, the fragment absolute time will be set to
     *            the current timecode. This option does not write timecodes to
     *            the audio elementary stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SmoothGroupAudioOnlyTimecodeControl
     */
    public MsSmoothGroupSettings withAudioOnlyTimecodeControl(
            SmoothGroupAudioOnlyTimecodeControl audioOnlyTimecodeControl) {
        this.audioOnlyTimecodeControl = audioOnlyTimecodeControl.toString();
        return this;
    }

    /**
     * If set to verifyAuthenticity, verify the https certificate chain to a
     * trusted Certificate Authority (CA). This will cause https outputs to
     * self-signed certificates to fail.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF_SIGNED, VERIFY_AUTHENTICITY
     *
     * @return If set to verifyAuthenticity, verify the https certificate chain
     *         to a trusted Certificate Authority (CA). This will cause https
     *         outputs to self-signed certificates to fail.
     * @see SmoothGroupCertificateMode
     */
    public String getCertificateMode() {
        return certificateMode;
    }

    /**
     * If set to verifyAuthenticity, verify the https certificate chain to a
     * trusted Certificate Authority (CA). This will cause https outputs to
     * self-signed certificates to fail.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF_SIGNED, VERIFY_AUTHENTICITY
     *
     * @param certificateMode If set to verifyAuthenticity, verify the https
     *            certificate chain to a trusted Certificate Authority (CA).
     *            This will cause https outputs to self-signed certificates to
     *            fail.
     * @see SmoothGroupCertificateMode
     */
    public void setCertificateMode(String certificateMode) {
        this.certificateMode = certificateMode;
    }

    /**
     * If set to verifyAuthenticity, verify the https certificate chain to a
     * trusted Certificate Authority (CA). This will cause https outputs to
     * self-signed certificates to fail.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF_SIGNED, VERIFY_AUTHENTICITY
     *
     * @param certificateMode If set to verifyAuthenticity, verify the https
     *            certificate chain to a trusted Certificate Authority (CA).
     *            This will cause https outputs to self-signed certificates to
     *            fail.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SmoothGroupCertificateMode
     */
    public MsSmoothGroupSettings withCertificateMode(String certificateMode) {
        this.certificateMode = certificateMode;
        return this;
    }

    /**
     * If set to verifyAuthenticity, verify the https certificate chain to a
     * trusted Certificate Authority (CA). This will cause https outputs to
     * self-signed certificates to fail.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF_SIGNED, VERIFY_AUTHENTICITY
     *
     * @param certificateMode If set to verifyAuthenticity, verify the https
     *            certificate chain to a trusted Certificate Authority (CA).
     *            This will cause https outputs to self-signed certificates to
     *            fail.
     * @see SmoothGroupCertificateMode
     */
    public void setCertificateMode(SmoothGroupCertificateMode certificateMode) {
        this.certificateMode = certificateMode.toString();
    }

    /**
     * If set to verifyAuthenticity, verify the https certificate chain to a
     * trusted Certificate Authority (CA). This will cause https outputs to
     * self-signed certificates to fail.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF_SIGNED, VERIFY_AUTHENTICITY
     *
     * @param certificateMode If set to verifyAuthenticity, verify the https
     *            certificate chain to a trusted Certificate Authority (CA).
     *            This will cause https outputs to self-signed certificates to
     *            fail.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SmoothGroupCertificateMode
     */
    public MsSmoothGroupSettings withCertificateMode(SmoothGroupCertificateMode certificateMode) {
        this.certificateMode = certificateMode.toString();
        return this;
    }

    /**
     * Number of seconds to wait before retrying connection to the IIS server if
     * the connection is lost. Content will be cached during this time and the
     * cache will be be delivered to the IIS server once the connection is
     * re-established.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return Number of seconds to wait before retrying connection to the IIS
     *         server if the connection is lost. Content will be cached during
     *         this time and the cache will be be delivered to the IIS server
     *         once the connection is re-established.
     */
    public Integer getConnectionRetryInterval() {
        return connectionRetryInterval;
    }

    /**
     * Number of seconds to wait before retrying connection to the IIS server if
     * the connection is lost. Content will be cached during this time and the
     * cache will be be delivered to the IIS server once the connection is
     * re-established.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param connectionRetryInterval Number of seconds to wait before retrying
     *            connection to the IIS server if the connection is lost.
     *            Content will be cached during this time and the cache will be
     *            be delivered to the IIS server once the connection is
     *            re-established.
     */
    public void setConnectionRetryInterval(Integer connectionRetryInterval) {
        this.connectionRetryInterval = connectionRetryInterval;
    }

    /**
     * Number of seconds to wait before retrying connection to the IIS server if
     * the connection is lost. Content will be cached during this time and the
     * cache will be be delivered to the IIS server once the connection is
     * re-established.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param connectionRetryInterval Number of seconds to wait before retrying
     *            connection to the IIS server if the connection is lost.
     *            Content will be cached during this time and the cache will be
     *            be delivered to the IIS server once the connection is
     *            re-established.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MsSmoothGroupSettings withConnectionRetryInterval(Integer connectionRetryInterval) {
        this.connectionRetryInterval = connectionRetryInterval;
        return this;
    }

    /**
     * Smooth Streaming publish point on an IIS server. Elemental Live acts as a
     * "Push" encoder to IIS.
     *
     * @return Smooth Streaming publish point on an IIS server. Elemental Live
     *         acts as a "Push" encoder to IIS.
     */
    public OutputLocationRef getDestination() {
        return destination;
    }

    /**
     * Smooth Streaming publish point on an IIS server. Elemental Live acts as a
     * "Push" encoder to IIS.
     *
     * @param destination Smooth Streaming publish point on an IIS server.
     *            Elemental Live acts as a "Push" encoder to IIS.
     */
    public void setDestination(OutputLocationRef destination) {
        this.destination = destination;
    }

    /**
     * Smooth Streaming publish point on an IIS server. Elemental Live acts as a
     * "Push" encoder to IIS.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destination Smooth Streaming publish point on an IIS server.
     *            Elemental Live acts as a "Push" encoder to IIS.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MsSmoothGroupSettings withDestination(OutputLocationRef destination) {
        this.destination = destination;
        return this;
    }

    /**
     * MS Smooth event ID to be sent to the IIS server. Should only be specified
     * if eventIdMode is set to useConfigured.
     *
     * @return MS Smooth event ID to be sent to the IIS server. Should only be
     *         specified if eventIdMode is set to useConfigured.
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * MS Smooth event ID to be sent to the IIS server. Should only be specified
     * if eventIdMode is set to useConfigured.
     *
     * @param eventId MS Smooth event ID to be sent to the IIS server. Should
     *            only be specified if eventIdMode is set to useConfigured.
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * MS Smooth event ID to be sent to the IIS server. Should only be specified
     * if eventIdMode is set to useConfigured.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventId MS Smooth event ID to be sent to the IIS server. Should
     *            only be specified if eventIdMode is set to useConfigured.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MsSmoothGroupSettings withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * Specifies whether or not to send an event ID to the IIS server. If no
     * event ID is sent and the same Live Event is used without changing the
     * publishing point, clients might see cached video from the previous run.
     * Options: - "useConfigured" - use the value provided in eventId -
     * "useTimestamp" - generate and send an event ID based on the current
     * timestamp - "noEventId" - do not send an event ID to the IIS server.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_EVENT_ID, USE_CONFIGURED, USE_TIMESTAMP
     *
     * @return Specifies whether or not to send an event ID to the IIS server.
     *         If no event ID is sent and the same Live Event is used without
     *         changing the publishing point, clients might see cached video
     *         from the previous run. Options: - "useConfigured" - use the value
     *         provided in eventId - "useTimestamp" - generate and send an event
     *         ID based on the current timestamp - "noEventId" - do not send an
     *         event ID to the IIS server.
     * @see SmoothGroupEventIdMode
     */
    public String getEventIdMode() {
        return eventIdMode;
    }

    /**
     * Specifies whether or not to send an event ID to the IIS server. If no
     * event ID is sent and the same Live Event is used without changing the
     * publishing point, clients might see cached video from the previous run.
     * Options: - "useConfigured" - use the value provided in eventId -
     * "useTimestamp" - generate and send an event ID based on the current
     * timestamp - "noEventId" - do not send an event ID to the IIS server.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_EVENT_ID, USE_CONFIGURED, USE_TIMESTAMP
     *
     * @param eventIdMode Specifies whether or not to send an event ID to the
     *            IIS server. If no event ID is sent and the same Live Event is
     *            used without changing the publishing point, clients might see
     *            cached video from the previous run. Options: - "useConfigured"
     *            - use the value provided in eventId - "useTimestamp" -
     *            generate and send an event ID based on the current timestamp -
     *            "noEventId" - do not send an event ID to the IIS server.
     * @see SmoothGroupEventIdMode
     */
    public void setEventIdMode(String eventIdMode) {
        this.eventIdMode = eventIdMode;
    }

    /**
     * Specifies whether or not to send an event ID to the IIS server. If no
     * event ID is sent and the same Live Event is used without changing the
     * publishing point, clients might see cached video from the previous run.
     * Options: - "useConfigured" - use the value provided in eventId -
     * "useTimestamp" - generate and send an event ID based on the current
     * timestamp - "noEventId" - do not send an event ID to the IIS server.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_EVENT_ID, USE_CONFIGURED, USE_TIMESTAMP
     *
     * @param eventIdMode Specifies whether or not to send an event ID to the
     *            IIS server. If no event ID is sent and the same Live Event is
     *            used without changing the publishing point, clients might see
     *            cached video from the previous run. Options: - "useConfigured"
     *            - use the value provided in eventId - "useTimestamp" -
     *            generate and send an event ID based on the current timestamp -
     *            "noEventId" - do not send an event ID to the IIS server.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SmoothGroupEventIdMode
     */
    public MsSmoothGroupSettings withEventIdMode(String eventIdMode) {
        this.eventIdMode = eventIdMode;
        return this;
    }

    /**
     * Specifies whether or not to send an event ID to the IIS server. If no
     * event ID is sent and the same Live Event is used without changing the
     * publishing point, clients might see cached video from the previous run.
     * Options: - "useConfigured" - use the value provided in eventId -
     * "useTimestamp" - generate and send an event ID based on the current
     * timestamp - "noEventId" - do not send an event ID to the IIS server.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_EVENT_ID, USE_CONFIGURED, USE_TIMESTAMP
     *
     * @param eventIdMode Specifies whether or not to send an event ID to the
     *            IIS server. If no event ID is sent and the same Live Event is
     *            used without changing the publishing point, clients might see
     *            cached video from the previous run. Options: - "useConfigured"
     *            - use the value provided in eventId - "useTimestamp" -
     *            generate and send an event ID based on the current timestamp -
     *            "noEventId" - do not send an event ID to the IIS server.
     * @see SmoothGroupEventIdMode
     */
    public void setEventIdMode(SmoothGroupEventIdMode eventIdMode) {
        this.eventIdMode = eventIdMode.toString();
    }

    /**
     * Specifies whether or not to send an event ID to the IIS server. If no
     * event ID is sent and the same Live Event is used without changing the
     * publishing point, clients might see cached video from the previous run.
     * Options: - "useConfigured" - use the value provided in eventId -
     * "useTimestamp" - generate and send an event ID based on the current
     * timestamp - "noEventId" - do not send an event ID to the IIS server.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_EVENT_ID, USE_CONFIGURED, USE_TIMESTAMP
     *
     * @param eventIdMode Specifies whether or not to send an event ID to the
     *            IIS server. If no event ID is sent and the same Live Event is
     *            used without changing the publishing point, clients might see
     *            cached video from the previous run. Options: - "useConfigured"
     *            - use the value provided in eventId - "useTimestamp" -
     *            generate and send an event ID based on the current timestamp -
     *            "noEventId" - do not send an event ID to the IIS server.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SmoothGroupEventIdMode
     */
    public MsSmoothGroupSettings withEventIdMode(SmoothGroupEventIdMode eventIdMode) {
        this.eventIdMode = eventIdMode.toString();
        return this;
    }

    /**
     * When set to sendEos, send EOS signal to IIS server when stopping the
     * event
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SEND_EOS
     *
     * @return When set to sendEos, send EOS signal to IIS server when stopping
     *         the event
     * @see SmoothGroupEventStopBehavior
     */
    public String getEventStopBehavior() {
        return eventStopBehavior;
    }

    /**
     * When set to sendEos, send EOS signal to IIS server when stopping the
     * event
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SEND_EOS
     *
     * @param eventStopBehavior When set to sendEos, send EOS signal to IIS
     *            server when stopping the event
     * @see SmoothGroupEventStopBehavior
     */
    public void setEventStopBehavior(String eventStopBehavior) {
        this.eventStopBehavior = eventStopBehavior;
    }

    /**
     * When set to sendEos, send EOS signal to IIS server when stopping the
     * event
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SEND_EOS
     *
     * @param eventStopBehavior When set to sendEos, send EOS signal to IIS
     *            server when stopping the event
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SmoothGroupEventStopBehavior
     */
    public MsSmoothGroupSettings withEventStopBehavior(String eventStopBehavior) {
        this.eventStopBehavior = eventStopBehavior;
        return this;
    }

    /**
     * When set to sendEos, send EOS signal to IIS server when stopping the
     * event
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SEND_EOS
     *
     * @param eventStopBehavior When set to sendEos, send EOS signal to IIS
     *            server when stopping the event
     * @see SmoothGroupEventStopBehavior
     */
    public void setEventStopBehavior(SmoothGroupEventStopBehavior eventStopBehavior) {
        this.eventStopBehavior = eventStopBehavior.toString();
    }

    /**
     * When set to sendEos, send EOS signal to IIS server when stopping the
     * event
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SEND_EOS
     *
     * @param eventStopBehavior When set to sendEos, send EOS signal to IIS
     *            server when stopping the event
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SmoothGroupEventStopBehavior
     */
    public MsSmoothGroupSettings withEventStopBehavior(
            SmoothGroupEventStopBehavior eventStopBehavior) {
        this.eventStopBehavior = eventStopBehavior.toString();
        return this;
    }

    /**
     * Size in seconds of file cache for streaming outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return Size in seconds of file cache for streaming outputs.
     */
    public Integer getFilecacheDuration() {
        return filecacheDuration;
    }

    /**
     * Size in seconds of file cache for streaming outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param filecacheDuration Size in seconds of file cache for streaming
     *            outputs.
     */
    public void setFilecacheDuration(Integer filecacheDuration) {
        this.filecacheDuration = filecacheDuration;
    }

    /**
     * Size in seconds of file cache for streaming outputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param filecacheDuration Size in seconds of file cache for streaming
     *            outputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MsSmoothGroupSettings withFilecacheDuration(Integer filecacheDuration) {
        this.filecacheDuration = filecacheDuration;
        return this;
    }

    /**
     * Length of mp4 fragments to generate (in seconds). Fragment length must be
     * compatible with GOP size and framerate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return Length of mp4 fragments to generate (in seconds). Fragment length
     *         must be compatible with GOP size and framerate.
     */
    public Integer getFragmentLength() {
        return fragmentLength;
    }

    /**
     * Length of mp4 fragments to generate (in seconds). Fragment length must be
     * compatible with GOP size and framerate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param fragmentLength Length of mp4 fragments to generate (in seconds).
     *            Fragment length must be compatible with GOP size and
     *            framerate.
     */
    public void setFragmentLength(Integer fragmentLength) {
        this.fragmentLength = fragmentLength;
    }

    /**
     * Length of mp4 fragments to generate (in seconds). Fragment length must be
     * compatible with GOP size and framerate.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param fragmentLength Length of mp4 fragments to generate (in seconds).
     *            Fragment length must be compatible with GOP size and
     *            framerate.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MsSmoothGroupSettings withFragmentLength(Integer fragmentLength) {
        this.fragmentLength = fragmentLength;
        return this;
    }

    /**
     * Parameter that control output group behavior on input loss.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMIT_OUTPUT, PAUSE_OUTPUT
     *
     * @return Parameter that control output group behavior on input loss.
     * @see InputLossActionForMsSmoothOut
     */
    public String getInputLossAction() {
        return inputLossAction;
    }

    /**
     * Parameter that control output group behavior on input loss.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMIT_OUTPUT, PAUSE_OUTPUT
     *
     * @param inputLossAction Parameter that control output group behavior on
     *            input loss.
     * @see InputLossActionForMsSmoothOut
     */
    public void setInputLossAction(String inputLossAction) {
        this.inputLossAction = inputLossAction;
    }

    /**
     * Parameter that control output group behavior on input loss.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMIT_OUTPUT, PAUSE_OUTPUT
     *
     * @param inputLossAction Parameter that control output group behavior on
     *            input loss.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputLossActionForMsSmoothOut
     */
    public MsSmoothGroupSettings withInputLossAction(String inputLossAction) {
        this.inputLossAction = inputLossAction;
        return this;
    }

    /**
     * Parameter that control output group behavior on input loss.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMIT_OUTPUT, PAUSE_OUTPUT
     *
     * @param inputLossAction Parameter that control output group behavior on
     *            input loss.
     * @see InputLossActionForMsSmoothOut
     */
    public void setInputLossAction(InputLossActionForMsSmoothOut inputLossAction) {
        this.inputLossAction = inputLossAction.toString();
    }

    /**
     * Parameter that control output group behavior on input loss.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMIT_OUTPUT, PAUSE_OUTPUT
     *
     * @param inputLossAction Parameter that control output group behavior on
     *            input loss.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputLossActionForMsSmoothOut
     */
    public MsSmoothGroupSettings withInputLossAction(InputLossActionForMsSmoothOut inputLossAction) {
        this.inputLossAction = inputLossAction.toString();
        return this;
    }

    /**
     * Number of retry attempts.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return Number of retry attempts.
     */
    public Integer getNumRetries() {
        return numRetries;
    }

    /**
     * Number of retry attempts.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numRetries Number of retry attempts.
     */
    public void setNumRetries(Integer numRetries) {
        this.numRetries = numRetries;
    }

    /**
     * Number of retry attempts.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numRetries Number of retry attempts.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MsSmoothGroupSettings withNumRetries(Integer numRetries) {
        this.numRetries = numRetries;
        return this;
    }

    /**
     * Number of seconds before initiating a restart due to output failure, due
     * to exhausting the numRetries on one segment, or exceeding
     * filecacheDuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return Number of seconds before initiating a restart due to output
     *         failure, due to exhausting the numRetries on one segment, or
     *         exceeding filecacheDuration.
     */
    public Integer getRestartDelay() {
        return restartDelay;
    }

    /**
     * Number of seconds before initiating a restart due to output failure, due
     * to exhausting the numRetries on one segment, or exceeding
     * filecacheDuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param restartDelay Number of seconds before initiating a restart due to
     *            output failure, due to exhausting the numRetries on one
     *            segment, or exceeding filecacheDuration.
     */
    public void setRestartDelay(Integer restartDelay) {
        this.restartDelay = restartDelay;
    }

    /**
     * Number of seconds before initiating a restart due to output failure, due
     * to exhausting the numRetries on one segment, or exceeding
     * filecacheDuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param restartDelay Number of seconds before initiating a restart due to
     *            output failure, due to exhausting the numRetries on one
     *            segment, or exceeding filecacheDuration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MsSmoothGroupSettings withRestartDelay(Integer restartDelay) {
        this.restartDelay = restartDelay;
        return this;
    }

    /**
     * useInputSegmentation has been deprecated. The configured segment size is
     * always used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION
     *
     * @return useInputSegmentation has been deprecated. The configured segment
     *         size is always used.
     * @see SmoothGroupSegmentationMode
     */
    public String getSegmentationMode() {
        return segmentationMode;
    }

    /**
     * useInputSegmentation has been deprecated. The configured segment size is
     * always used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION
     *
     * @param segmentationMode useInputSegmentation has been deprecated. The
     *            configured segment size is always used.
     * @see SmoothGroupSegmentationMode
     */
    public void setSegmentationMode(String segmentationMode) {
        this.segmentationMode = segmentationMode;
    }

    /**
     * useInputSegmentation has been deprecated. The configured segment size is
     * always used.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION
     *
     * @param segmentationMode useInputSegmentation has been deprecated. The
     *            configured segment size is always used.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SmoothGroupSegmentationMode
     */
    public MsSmoothGroupSettings withSegmentationMode(String segmentationMode) {
        this.segmentationMode = segmentationMode;
        return this;
    }

    /**
     * useInputSegmentation has been deprecated. The configured segment size is
     * always used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION
     *
     * @param segmentationMode useInputSegmentation has been deprecated. The
     *            configured segment size is always used.
     * @see SmoothGroupSegmentationMode
     */
    public void setSegmentationMode(SmoothGroupSegmentationMode segmentationMode) {
        this.segmentationMode = segmentationMode.toString();
    }

    /**
     * useInputSegmentation has been deprecated. The configured segment size is
     * always used.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION
     *
     * @param segmentationMode useInputSegmentation has been deprecated. The
     *            configured segment size is always used.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SmoothGroupSegmentationMode
     */
    public MsSmoothGroupSettings withSegmentationMode(SmoothGroupSegmentationMode segmentationMode) {
        this.segmentationMode = segmentationMode.toString();
        return this;
    }

    /**
     * Number of milliseconds to delay the output from the second pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     *
     * @return Number of milliseconds to delay the output from the second
     *         pipeline.
     */
    public Integer getSendDelayMs() {
        return sendDelayMs;
    }

    /**
     * Number of milliseconds to delay the output from the second pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     *
     * @param sendDelayMs Number of milliseconds to delay the output from the
     *            second pipeline.
     */
    public void setSendDelayMs(Integer sendDelayMs) {
        this.sendDelayMs = sendDelayMs;
    }

    /**
     * Number of milliseconds to delay the output from the second pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     *
     * @param sendDelayMs Number of milliseconds to delay the output from the
     *            second pipeline.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MsSmoothGroupSettings withSendDelayMs(Integer sendDelayMs) {
        this.sendDelayMs = sendDelayMs;
        return this;
    }

    /**
     * If set to scte35, use incoming SCTE-35 messages to generate a sparse
     * track in this group of MS-Smooth outputs. scte35WithoutSegmentation is
     * the same as scte35, except EML will not start a new segment at a SCTE-35
     * marker. It will still encode an IDR frame at a SCTE-35 marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SCTE_35, SCTE_35_WITHOUT_SEGMENTATION
     *
     * @return If set to scte35, use incoming SCTE-35 messages to generate a
     *         sparse track in this group of MS-Smooth outputs.
     *         scte35WithoutSegmentation is the same as scte35, except EML will
     *         not start a new segment at a SCTE-35 marker. It will still encode
     *         an IDR frame at a SCTE-35 marker.
     * @see SmoothGroupSparseTrackType
     */
    public String getSparseTrackType() {
        return sparseTrackType;
    }

    /**
     * If set to scte35, use incoming SCTE-35 messages to generate a sparse
     * track in this group of MS-Smooth outputs. scte35WithoutSegmentation is
     * the same as scte35, except EML will not start a new segment at a SCTE-35
     * marker. It will still encode an IDR frame at a SCTE-35 marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SCTE_35, SCTE_35_WITHOUT_SEGMENTATION
     *
     * @param sparseTrackType If set to scte35, use incoming SCTE-35 messages to
     *            generate a sparse track in this group of MS-Smooth outputs.
     *            scte35WithoutSegmentation is the same as scte35, except EML
     *            will not start a new segment at a SCTE-35 marker. It will
     *            still encode an IDR frame at a SCTE-35 marker.
     * @see SmoothGroupSparseTrackType
     */
    public void setSparseTrackType(String sparseTrackType) {
        this.sparseTrackType = sparseTrackType;
    }

    /**
     * If set to scte35, use incoming SCTE-35 messages to generate a sparse
     * track in this group of MS-Smooth outputs. scte35WithoutSegmentation is
     * the same as scte35, except EML will not start a new segment at a SCTE-35
     * marker. It will still encode an IDR frame at a SCTE-35 marker.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SCTE_35, SCTE_35_WITHOUT_SEGMENTATION
     *
     * @param sparseTrackType If set to scte35, use incoming SCTE-35 messages to
     *            generate a sparse track in this group of MS-Smooth outputs.
     *            scte35WithoutSegmentation is the same as scte35, except EML
     *            will not start a new segment at a SCTE-35 marker. It will
     *            still encode an IDR frame at a SCTE-35 marker.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SmoothGroupSparseTrackType
     */
    public MsSmoothGroupSettings withSparseTrackType(String sparseTrackType) {
        this.sparseTrackType = sparseTrackType;
        return this;
    }

    /**
     * If set to scte35, use incoming SCTE-35 messages to generate a sparse
     * track in this group of MS-Smooth outputs. scte35WithoutSegmentation is
     * the same as scte35, except EML will not start a new segment at a SCTE-35
     * marker. It will still encode an IDR frame at a SCTE-35 marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SCTE_35, SCTE_35_WITHOUT_SEGMENTATION
     *
     * @param sparseTrackType If set to scte35, use incoming SCTE-35 messages to
     *            generate a sparse track in this group of MS-Smooth outputs.
     *            scte35WithoutSegmentation is the same as scte35, except EML
     *            will not start a new segment at a SCTE-35 marker. It will
     *            still encode an IDR frame at a SCTE-35 marker.
     * @see SmoothGroupSparseTrackType
     */
    public void setSparseTrackType(SmoothGroupSparseTrackType sparseTrackType) {
        this.sparseTrackType = sparseTrackType.toString();
    }

    /**
     * If set to scte35, use incoming SCTE-35 messages to generate a sparse
     * track in this group of MS-Smooth outputs. scte35WithoutSegmentation is
     * the same as scte35, except EML will not start a new segment at a SCTE-35
     * marker. It will still encode an IDR frame at a SCTE-35 marker.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SCTE_35, SCTE_35_WITHOUT_SEGMENTATION
     *
     * @param sparseTrackType If set to scte35, use incoming SCTE-35 messages to
     *            generate a sparse track in this group of MS-Smooth outputs.
     *            scte35WithoutSegmentation is the same as scte35, except EML
     *            will not start a new segment at a SCTE-35 marker. It will
     *            still encode an IDR frame at a SCTE-35 marker.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SmoothGroupSparseTrackType
     */
    public MsSmoothGroupSettings withSparseTrackType(SmoothGroupSparseTrackType sparseTrackType) {
        this.sparseTrackType = sparseTrackType.toString();
        return this;
    }

    /**
     * When set to send, send stream manifest so publishing point doesn't start
     * until all streams start.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DO_NOT_SEND, SEND
     *
     * @return When set to send, send stream manifest so publishing point
     *         doesn't start until all streams start.
     * @see SmoothGroupStreamManifestBehavior
     */
    public String getStreamManifestBehavior() {
        return streamManifestBehavior;
    }

    /**
     * When set to send, send stream manifest so publishing point doesn't start
     * until all streams start.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DO_NOT_SEND, SEND
     *
     * @param streamManifestBehavior When set to send, send stream manifest so
     *            publishing point doesn't start until all streams start.
     * @see SmoothGroupStreamManifestBehavior
     */
    public void setStreamManifestBehavior(String streamManifestBehavior) {
        this.streamManifestBehavior = streamManifestBehavior;
    }

    /**
     * When set to send, send stream manifest so publishing point doesn't start
     * until all streams start.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DO_NOT_SEND, SEND
     *
     * @param streamManifestBehavior When set to send, send stream manifest so
     *            publishing point doesn't start until all streams start.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SmoothGroupStreamManifestBehavior
     */
    public MsSmoothGroupSettings withStreamManifestBehavior(String streamManifestBehavior) {
        this.streamManifestBehavior = streamManifestBehavior;
        return this;
    }

    /**
     * When set to send, send stream manifest so publishing point doesn't start
     * until all streams start.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DO_NOT_SEND, SEND
     *
     * @param streamManifestBehavior When set to send, send stream manifest so
     *            publishing point doesn't start until all streams start.
     * @see SmoothGroupStreamManifestBehavior
     */
    public void setStreamManifestBehavior(SmoothGroupStreamManifestBehavior streamManifestBehavior) {
        this.streamManifestBehavior = streamManifestBehavior.toString();
    }

    /**
     * When set to send, send stream manifest so publishing point doesn't start
     * until all streams start.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DO_NOT_SEND, SEND
     *
     * @param streamManifestBehavior When set to send, send stream manifest so
     *            publishing point doesn't start until all streams start.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SmoothGroupStreamManifestBehavior
     */
    public MsSmoothGroupSettings withStreamManifestBehavior(
            SmoothGroupStreamManifestBehavior streamManifestBehavior) {
        this.streamManifestBehavior = streamManifestBehavior.toString();
        return this;
    }

    /**
     * Timestamp offset for the event. Only used if timestampOffsetMode is set
     * to useConfiguredOffset.
     *
     * @return Timestamp offset for the event. Only used if timestampOffsetMode
     *         is set to useConfiguredOffset.
     */
    public String getTimestampOffset() {
        return timestampOffset;
    }

    /**
     * Timestamp offset for the event. Only used if timestampOffsetMode is set
     * to useConfiguredOffset.
     *
     * @param timestampOffset Timestamp offset for the event. Only used if
     *            timestampOffsetMode is set to useConfiguredOffset.
     */
    public void setTimestampOffset(String timestampOffset) {
        this.timestampOffset = timestampOffset;
    }

    /**
     * Timestamp offset for the event. Only used if timestampOffsetMode is set
     * to useConfiguredOffset.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestampOffset Timestamp offset for the event. Only used if
     *            timestampOffsetMode is set to useConfiguredOffset.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MsSmoothGroupSettings withTimestampOffset(String timestampOffset) {
        this.timestampOffset = timestampOffset;
        return this;
    }

    /**
     * Type of timestamp date offset to use. - useEventStartDate: Use the date
     * the event was started as the offset - useConfiguredOffset: Use an
     * explicitly configured date as the offset
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE_CONFIGURED_OFFSET, USE_EVENT_START_DATE
     *
     * @return Type of timestamp date offset to use. - useEventStartDate: Use
     *         the date the event was started as the offset -
     *         useConfiguredOffset: Use an explicitly configured date as the
     *         offset
     * @see SmoothGroupTimestampOffsetMode
     */
    public String getTimestampOffsetMode() {
        return timestampOffsetMode;
    }

    /**
     * Type of timestamp date offset to use. - useEventStartDate: Use the date
     * the event was started as the offset - useConfiguredOffset: Use an
     * explicitly configured date as the offset
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE_CONFIGURED_OFFSET, USE_EVENT_START_DATE
     *
     * @param timestampOffsetMode Type of timestamp date offset to use. -
     *            useEventStartDate: Use the date the event was started as the
     *            offset - useConfiguredOffset: Use an explicitly configured
     *            date as the offset
     * @see SmoothGroupTimestampOffsetMode
     */
    public void setTimestampOffsetMode(String timestampOffsetMode) {
        this.timestampOffsetMode = timestampOffsetMode;
    }

    /**
     * Type of timestamp date offset to use. - useEventStartDate: Use the date
     * the event was started as the offset - useConfiguredOffset: Use an
     * explicitly configured date as the offset
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE_CONFIGURED_OFFSET, USE_EVENT_START_DATE
     *
     * @param timestampOffsetMode Type of timestamp date offset to use. -
     *            useEventStartDate: Use the date the event was started as the
     *            offset - useConfiguredOffset: Use an explicitly configured
     *            date as the offset
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SmoothGroupTimestampOffsetMode
     */
    public MsSmoothGroupSettings withTimestampOffsetMode(String timestampOffsetMode) {
        this.timestampOffsetMode = timestampOffsetMode;
        return this;
    }

    /**
     * Type of timestamp date offset to use. - useEventStartDate: Use the date
     * the event was started as the offset - useConfiguredOffset: Use an
     * explicitly configured date as the offset
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE_CONFIGURED_OFFSET, USE_EVENT_START_DATE
     *
     * @param timestampOffsetMode Type of timestamp date offset to use. -
     *            useEventStartDate: Use the date the event was started as the
     *            offset - useConfiguredOffset: Use an explicitly configured
     *            date as the offset
     * @see SmoothGroupTimestampOffsetMode
     */
    public void setTimestampOffsetMode(SmoothGroupTimestampOffsetMode timestampOffsetMode) {
        this.timestampOffsetMode = timestampOffsetMode.toString();
    }

    /**
     * Type of timestamp date offset to use. - useEventStartDate: Use the date
     * the event was started as the offset - useConfiguredOffset: Use an
     * explicitly configured date as the offset
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE_CONFIGURED_OFFSET, USE_EVENT_START_DATE
     *
     * @param timestampOffsetMode Type of timestamp date offset to use. -
     *            useEventStartDate: Use the date the event was started as the
     *            offset - useConfiguredOffset: Use an explicitly configured
     *            date as the offset
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SmoothGroupTimestampOffsetMode
     */
    public MsSmoothGroupSettings withTimestampOffsetMode(
            SmoothGroupTimestampOffsetMode timestampOffsetMode) {
        this.timestampOffsetMode = timestampOffsetMode.toString();
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
        if (getAcquisitionPointId() != null)
            sb.append("AcquisitionPointId: " + getAcquisitionPointId() + ",");
        if (getAudioOnlyTimecodeControl() != null)
            sb.append("AudioOnlyTimecodeControl: " + getAudioOnlyTimecodeControl() + ",");
        if (getCertificateMode() != null)
            sb.append("CertificateMode: " + getCertificateMode() + ",");
        if (getConnectionRetryInterval() != null)
            sb.append("ConnectionRetryInterval: " + getConnectionRetryInterval() + ",");
        if (getDestination() != null)
            sb.append("Destination: " + getDestination() + ",");
        if (getEventId() != null)
            sb.append("EventId: " + getEventId() + ",");
        if (getEventIdMode() != null)
            sb.append("EventIdMode: " + getEventIdMode() + ",");
        if (getEventStopBehavior() != null)
            sb.append("EventStopBehavior: " + getEventStopBehavior() + ",");
        if (getFilecacheDuration() != null)
            sb.append("FilecacheDuration: " + getFilecacheDuration() + ",");
        if (getFragmentLength() != null)
            sb.append("FragmentLength: " + getFragmentLength() + ",");
        if (getInputLossAction() != null)
            sb.append("InputLossAction: " + getInputLossAction() + ",");
        if (getNumRetries() != null)
            sb.append("NumRetries: " + getNumRetries() + ",");
        if (getRestartDelay() != null)
            sb.append("RestartDelay: " + getRestartDelay() + ",");
        if (getSegmentationMode() != null)
            sb.append("SegmentationMode: " + getSegmentationMode() + ",");
        if (getSendDelayMs() != null)
            sb.append("SendDelayMs: " + getSendDelayMs() + ",");
        if (getSparseTrackType() != null)
            sb.append("SparseTrackType: " + getSparseTrackType() + ",");
        if (getStreamManifestBehavior() != null)
            sb.append("StreamManifestBehavior: " + getStreamManifestBehavior() + ",");
        if (getTimestampOffset() != null)
            sb.append("TimestampOffset: " + getTimestampOffset() + ",");
        if (getTimestampOffsetMode() != null)
            sb.append("TimestampOffsetMode: " + getTimestampOffsetMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAcquisitionPointId() == null) ? 0 : getAcquisitionPointId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAudioOnlyTimecodeControl() == null) ? 0 : getAudioOnlyTimecodeControl()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCertificateMode() == null) ? 0 : getCertificateMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getConnectionRetryInterval() == null) ? 0 : getConnectionRetryInterval()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode
                + ((getEventIdMode() == null) ? 0 : getEventIdMode().hashCode());
        hashCode = prime * hashCode
                + ((getEventStopBehavior() == null) ? 0 : getEventStopBehavior().hashCode());
        hashCode = prime * hashCode
                + ((getFilecacheDuration() == null) ? 0 : getFilecacheDuration().hashCode());
        hashCode = prime * hashCode
                + ((getFragmentLength() == null) ? 0 : getFragmentLength().hashCode());
        hashCode = prime * hashCode
                + ((getInputLossAction() == null) ? 0 : getInputLossAction().hashCode());
        hashCode = prime * hashCode + ((getNumRetries() == null) ? 0 : getNumRetries().hashCode());
        hashCode = prime * hashCode
                + ((getRestartDelay() == null) ? 0 : getRestartDelay().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentationMode() == null) ? 0 : getSegmentationMode().hashCode());
        hashCode = prime * hashCode
                + ((getSendDelayMs() == null) ? 0 : getSendDelayMs().hashCode());
        hashCode = prime * hashCode
                + ((getSparseTrackType() == null) ? 0 : getSparseTrackType().hashCode());
        hashCode = prime
                * hashCode
                + ((getStreamManifestBehavior() == null) ? 0 : getStreamManifestBehavior()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTimestampOffset() == null) ? 0 : getTimestampOffset().hashCode());
        hashCode = prime * hashCode
                + ((getTimestampOffsetMode() == null) ? 0 : getTimestampOffsetMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MsSmoothGroupSettings == false)
            return false;
        MsSmoothGroupSettings other = (MsSmoothGroupSettings) obj;

        if (other.getAcquisitionPointId() == null ^ this.getAcquisitionPointId() == null)
            return false;
        if (other.getAcquisitionPointId() != null
                && other.getAcquisitionPointId().equals(this.getAcquisitionPointId()) == false)
            return false;
        if (other.getAudioOnlyTimecodeControl() == null
                ^ this.getAudioOnlyTimecodeControl() == null)
            return false;
        if (other.getAudioOnlyTimecodeControl() != null
                && other.getAudioOnlyTimecodeControl().equals(this.getAudioOnlyTimecodeControl()) == false)
            return false;
        if (other.getCertificateMode() == null ^ this.getCertificateMode() == null)
            return false;
        if (other.getCertificateMode() != null
                && other.getCertificateMode().equals(this.getCertificateMode()) == false)
            return false;
        if (other.getConnectionRetryInterval() == null ^ this.getConnectionRetryInterval() == null)
            return false;
        if (other.getConnectionRetryInterval() != null
                && other.getConnectionRetryInterval().equals(this.getConnectionRetryInterval()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventIdMode() == null ^ this.getEventIdMode() == null)
            return false;
        if (other.getEventIdMode() != null
                && other.getEventIdMode().equals(this.getEventIdMode()) == false)
            return false;
        if (other.getEventStopBehavior() == null ^ this.getEventStopBehavior() == null)
            return false;
        if (other.getEventStopBehavior() != null
                && other.getEventStopBehavior().equals(this.getEventStopBehavior()) == false)
            return false;
        if (other.getFilecacheDuration() == null ^ this.getFilecacheDuration() == null)
            return false;
        if (other.getFilecacheDuration() != null
                && other.getFilecacheDuration().equals(this.getFilecacheDuration()) == false)
            return false;
        if (other.getFragmentLength() == null ^ this.getFragmentLength() == null)
            return false;
        if (other.getFragmentLength() != null
                && other.getFragmentLength().equals(this.getFragmentLength()) == false)
            return false;
        if (other.getInputLossAction() == null ^ this.getInputLossAction() == null)
            return false;
        if (other.getInputLossAction() != null
                && other.getInputLossAction().equals(this.getInputLossAction()) == false)
            return false;
        if (other.getNumRetries() == null ^ this.getNumRetries() == null)
            return false;
        if (other.getNumRetries() != null
                && other.getNumRetries().equals(this.getNumRetries()) == false)
            return false;
        if (other.getRestartDelay() == null ^ this.getRestartDelay() == null)
            return false;
        if (other.getRestartDelay() != null
                && other.getRestartDelay().equals(this.getRestartDelay()) == false)
            return false;
        if (other.getSegmentationMode() == null ^ this.getSegmentationMode() == null)
            return false;
        if (other.getSegmentationMode() != null
                && other.getSegmentationMode().equals(this.getSegmentationMode()) == false)
            return false;
        if (other.getSendDelayMs() == null ^ this.getSendDelayMs() == null)
            return false;
        if (other.getSendDelayMs() != null
                && other.getSendDelayMs().equals(this.getSendDelayMs()) == false)
            return false;
        if (other.getSparseTrackType() == null ^ this.getSparseTrackType() == null)
            return false;
        if (other.getSparseTrackType() != null
                && other.getSparseTrackType().equals(this.getSparseTrackType()) == false)
            return false;
        if (other.getStreamManifestBehavior() == null ^ this.getStreamManifestBehavior() == null)
            return false;
        if (other.getStreamManifestBehavior() != null
                && other.getStreamManifestBehavior().equals(this.getStreamManifestBehavior()) == false)
            return false;
        if (other.getTimestampOffset() == null ^ this.getTimestampOffset() == null)
            return false;
        if (other.getTimestampOffset() != null
                && other.getTimestampOffset().equals(this.getTimestampOffset()) == false)
            return false;
        if (other.getTimestampOffsetMode() == null ^ this.getTimestampOffsetMode() == null)
            return false;
        if (other.getTimestampOffsetMode() != null
                && other.getTimestampOffsetMode().equals(this.getTimestampOffsetMode()) == false)
            return false;
        return true;
    }
}
