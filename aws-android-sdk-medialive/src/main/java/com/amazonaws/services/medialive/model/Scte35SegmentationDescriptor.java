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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Corresponds to SCTE-35 segmentation_descriptor.
 */
public class Scte35SegmentationDescriptor implements Serializable {
    /**
     * Holds the four SCTE-35 delivery restriction parameters.
     */
    private Scte35DeliveryRestrictions deliveryRestrictions;

    /**
     * Corresponds to SCTE-35 segment_num. A value that is valid for the
     * specified segmentation_type_id.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     */
    private Integer segmentNum;

    /**
     * Corresponds to SCTE-35 segmentation_event_cancel_indicator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEGMENTATION_EVENT_NOT_CANCELED,
     * SEGMENTATION_EVENT_CANCELED
     */
    private String segmentationCancelIndicator;

    /**
     * Corresponds to SCTE-35 segmentation_duration. Optional. The duration for
     * the time_signal, in 90 KHz ticks. To convert seconds to ticks, multiple
     * the seconds by 90,000. Enter time in 90 KHz clock ticks. If you do not
     * enter a duration, the time_signal will continue until you insert a
     * cancellation message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1099511627775<br/>
     */
    private Long segmentationDuration;

    /**
     * Corresponds to SCTE-35 segmentation_event_id.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     */
    private Long segmentationEventId;

    /**
     * Corresponds to SCTE-35 segmentation_type_id. One of the
     * segmentation_type_id values listed in the SCTE-35 specification. On the
     * console, enter the ID in decimal (for example, "52"). In the CLI, API, or
     * an SDK, enter the ID in hex (for example, "0x34") or decimal (for
     * example, "52").
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     */
    private Integer segmentationTypeId;

    /**
     * Corresponds to SCTE-35 segmentation_upid. Enter a string containing the
     * hexadecimal representation of the characters that make up the SCTE-35
     * segmentation_upid value. Must contain an even number of hex characters.
     * Do not include spaces between each hex pair. For example, the ASCII
     * "ADS Information" becomes hex "41445320496e666f726d6174696f6e.
     */
    private String segmentationUpid;

    /**
     * Corresponds to SCTE-35 segmentation_upid_type. On the console, enter one
     * of the types listed in the SCTE-35 specification, converted to a decimal.
     * For example, "0x0C" hex from the specification is "12" in decimal. In the
     * CLI, API, or an SDK, enter one of the types listed in the SCTE-35
     * specification, in either hex (for example, "0x0C" ) or in decimal (for
     * example, "12").
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     */
    private Integer segmentationUpidType;

    /**
     * Corresponds to SCTE-35 segments_expected. A value that is valid for the
     * specified segmentation_type_id.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     */
    private Integer segmentsExpected;

    /**
     * Corresponds to SCTE-35 sub_segment_num. A value that is valid for the
     * specified segmentation_type_id.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     */
    private Integer subSegmentNum;

    /**
     * Corresponds to SCTE-35 sub_segments_expected. A value that is valid for
     * the specified segmentation_type_id.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     */
    private Integer subSegmentsExpected;

    /**
     * Holds the four SCTE-35 delivery restriction parameters.
     *
     * @return Holds the four SCTE-35 delivery restriction parameters.
     */
    public Scte35DeliveryRestrictions getDeliveryRestrictions() {
        return deliveryRestrictions;
    }

    /**
     * Holds the four SCTE-35 delivery restriction parameters.
     *
     * @param deliveryRestrictions Holds the four SCTE-35 delivery restriction
     *            parameters.
     */
    public void setDeliveryRestrictions(Scte35DeliveryRestrictions deliveryRestrictions) {
        this.deliveryRestrictions = deliveryRestrictions;
    }

    /**
     * Holds the four SCTE-35 delivery restriction parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deliveryRestrictions Holds the four SCTE-35 delivery restriction
     *            parameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Scte35SegmentationDescriptor withDeliveryRestrictions(
            Scte35DeliveryRestrictions deliveryRestrictions) {
        this.deliveryRestrictions = deliveryRestrictions;
        return this;
    }

    /**
     * Corresponds to SCTE-35 segment_num. A value that is valid for the
     * specified segmentation_type_id.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @return Corresponds to SCTE-35 segment_num. A value that is valid for the
     *         specified segmentation_type_id.
     */
    public Integer getSegmentNum() {
        return segmentNum;
    }

    /**
     * Corresponds to SCTE-35 segment_num. A value that is valid for the
     * specified segmentation_type_id.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param segmentNum Corresponds to SCTE-35 segment_num. A value that is
     *            valid for the specified segmentation_type_id.
     */
    public void setSegmentNum(Integer segmentNum) {
        this.segmentNum = segmentNum;
    }

    /**
     * Corresponds to SCTE-35 segment_num. A value that is valid for the
     * specified segmentation_type_id.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param segmentNum Corresponds to SCTE-35 segment_num. A value that is
     *            valid for the specified segmentation_type_id.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Scte35SegmentationDescriptor withSegmentNum(Integer segmentNum) {
        this.segmentNum = segmentNum;
        return this;
    }

    /**
     * Corresponds to SCTE-35 segmentation_event_cancel_indicator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEGMENTATION_EVENT_NOT_CANCELED,
     * SEGMENTATION_EVENT_CANCELED
     *
     * @return Corresponds to SCTE-35 segmentation_event_cancel_indicator.
     * @see Scte35SegmentationCancelIndicator
     */
    public String getSegmentationCancelIndicator() {
        return segmentationCancelIndicator;
    }

    /**
     * Corresponds to SCTE-35 segmentation_event_cancel_indicator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEGMENTATION_EVENT_NOT_CANCELED,
     * SEGMENTATION_EVENT_CANCELED
     *
     * @param segmentationCancelIndicator Corresponds to SCTE-35
     *            segmentation_event_cancel_indicator.
     * @see Scte35SegmentationCancelIndicator
     */
    public void setSegmentationCancelIndicator(String segmentationCancelIndicator) {
        this.segmentationCancelIndicator = segmentationCancelIndicator;
    }

    /**
     * Corresponds to SCTE-35 segmentation_event_cancel_indicator.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEGMENTATION_EVENT_NOT_CANCELED,
     * SEGMENTATION_EVENT_CANCELED
     *
     * @param segmentationCancelIndicator Corresponds to SCTE-35
     *            segmentation_event_cancel_indicator.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scte35SegmentationCancelIndicator
     */
    public Scte35SegmentationDescriptor withSegmentationCancelIndicator(
            String segmentationCancelIndicator) {
        this.segmentationCancelIndicator = segmentationCancelIndicator;
        return this;
    }

    /**
     * Corresponds to SCTE-35 segmentation_event_cancel_indicator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEGMENTATION_EVENT_NOT_CANCELED,
     * SEGMENTATION_EVENT_CANCELED
     *
     * @param segmentationCancelIndicator Corresponds to SCTE-35
     *            segmentation_event_cancel_indicator.
     * @see Scte35SegmentationCancelIndicator
     */
    public void setSegmentationCancelIndicator(
            Scte35SegmentationCancelIndicator segmentationCancelIndicator) {
        this.segmentationCancelIndicator = segmentationCancelIndicator.toString();
    }

    /**
     * Corresponds to SCTE-35 segmentation_event_cancel_indicator.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEGMENTATION_EVENT_NOT_CANCELED,
     * SEGMENTATION_EVENT_CANCELED
     *
     * @param segmentationCancelIndicator Corresponds to SCTE-35
     *            segmentation_event_cancel_indicator.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scte35SegmentationCancelIndicator
     */
    public Scte35SegmentationDescriptor withSegmentationCancelIndicator(
            Scte35SegmentationCancelIndicator segmentationCancelIndicator) {
        this.segmentationCancelIndicator = segmentationCancelIndicator.toString();
        return this;
    }

    /**
     * Corresponds to SCTE-35 segmentation_duration. Optional. The duration for
     * the time_signal, in 90 KHz ticks. To convert seconds to ticks, multiple
     * the seconds by 90,000. Enter time in 90 KHz clock ticks. If you do not
     * enter a duration, the time_signal will continue until you insert a
     * cancellation message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1099511627775<br/>
     *
     * @return Corresponds to SCTE-35 segmentation_duration. Optional. The
     *         duration for the time_signal, in 90 KHz ticks. To convert seconds
     *         to ticks, multiple the seconds by 90,000. Enter time in 90 KHz
     *         clock ticks. If you do not enter a duration, the time_signal will
     *         continue until you insert a cancellation message.
     */
    public Long getSegmentationDuration() {
        return segmentationDuration;
    }

    /**
     * Corresponds to SCTE-35 segmentation_duration. Optional. The duration for
     * the time_signal, in 90 KHz ticks. To convert seconds to ticks, multiple
     * the seconds by 90,000. Enter time in 90 KHz clock ticks. If you do not
     * enter a duration, the time_signal will continue until you insert a
     * cancellation message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1099511627775<br/>
     *
     * @param segmentationDuration Corresponds to SCTE-35 segmentation_duration.
     *            Optional. The duration for the time_signal, in 90 KHz ticks.
     *            To convert seconds to ticks, multiple the seconds by 90,000.
     *            Enter time in 90 KHz clock ticks. If you do not enter a
     *            duration, the time_signal will continue until you insert a
     *            cancellation message.
     */
    public void setSegmentationDuration(Long segmentationDuration) {
        this.segmentationDuration = segmentationDuration;
    }

    /**
     * Corresponds to SCTE-35 segmentation_duration. Optional. The duration for
     * the time_signal, in 90 KHz ticks. To convert seconds to ticks, multiple
     * the seconds by 90,000. Enter time in 90 KHz clock ticks. If you do not
     * enter a duration, the time_signal will continue until you insert a
     * cancellation message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1099511627775<br/>
     *
     * @param segmentationDuration Corresponds to SCTE-35 segmentation_duration.
     *            Optional. The duration for the time_signal, in 90 KHz ticks.
     *            To convert seconds to ticks, multiple the seconds by 90,000.
     *            Enter time in 90 KHz clock ticks. If you do not enter a
     *            duration, the time_signal will continue until you insert a
     *            cancellation message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Scte35SegmentationDescriptor withSegmentationDuration(Long segmentationDuration) {
        this.segmentationDuration = segmentationDuration;
        return this;
    }

    /**
     * Corresponds to SCTE-35 segmentation_event_id.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     *
     * @return Corresponds to SCTE-35 segmentation_event_id.
     */
    public Long getSegmentationEventId() {
        return segmentationEventId;
    }

    /**
     * Corresponds to SCTE-35 segmentation_event_id.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     *
     * @param segmentationEventId Corresponds to SCTE-35 segmentation_event_id.
     */
    public void setSegmentationEventId(Long segmentationEventId) {
        this.segmentationEventId = segmentationEventId;
    }

    /**
     * Corresponds to SCTE-35 segmentation_event_id.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     *
     * @param segmentationEventId Corresponds to SCTE-35 segmentation_event_id.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Scte35SegmentationDescriptor withSegmentationEventId(Long segmentationEventId) {
        this.segmentationEventId = segmentationEventId;
        return this;
    }

    /**
     * Corresponds to SCTE-35 segmentation_type_id. One of the
     * segmentation_type_id values listed in the SCTE-35 specification. On the
     * console, enter the ID in decimal (for example, "52"). In the CLI, API, or
     * an SDK, enter the ID in hex (for example, "0x34") or decimal (for
     * example, "52").
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @return Corresponds to SCTE-35 segmentation_type_id. One of the
     *         segmentation_type_id values listed in the SCTE-35 specification.
     *         On the console, enter the ID in decimal (for example, "52"). In
     *         the CLI, API, or an SDK, enter the ID in hex (for example,
     *         "0x34") or decimal (for example, "52").
     */
    public Integer getSegmentationTypeId() {
        return segmentationTypeId;
    }

    /**
     * Corresponds to SCTE-35 segmentation_type_id. One of the
     * segmentation_type_id values listed in the SCTE-35 specification. On the
     * console, enter the ID in decimal (for example, "52"). In the CLI, API, or
     * an SDK, enter the ID in hex (for example, "0x34") or decimal (for
     * example, "52").
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param segmentationTypeId Corresponds to SCTE-35 segmentation_type_id.
     *            One of the segmentation_type_id values listed in the SCTE-35
     *            specification. On the console, enter the ID in decimal (for
     *            example, "52"). In the CLI, API, or an SDK, enter the ID in
     *            hex (for example, "0x34") or decimal (for example, "52").
     */
    public void setSegmentationTypeId(Integer segmentationTypeId) {
        this.segmentationTypeId = segmentationTypeId;
    }

    /**
     * Corresponds to SCTE-35 segmentation_type_id. One of the
     * segmentation_type_id values listed in the SCTE-35 specification. On the
     * console, enter the ID in decimal (for example, "52"). In the CLI, API, or
     * an SDK, enter the ID in hex (for example, "0x34") or decimal (for
     * example, "52").
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param segmentationTypeId Corresponds to SCTE-35 segmentation_type_id.
     *            One of the segmentation_type_id values listed in the SCTE-35
     *            specification. On the console, enter the ID in decimal (for
     *            example, "52"). In the CLI, API, or an SDK, enter the ID in
     *            hex (for example, "0x34") or decimal (for example, "52").
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Scte35SegmentationDescriptor withSegmentationTypeId(Integer segmentationTypeId) {
        this.segmentationTypeId = segmentationTypeId;
        return this;
    }

    /**
     * Corresponds to SCTE-35 segmentation_upid. Enter a string containing the
     * hexadecimal representation of the characters that make up the SCTE-35
     * segmentation_upid value. Must contain an even number of hex characters.
     * Do not include spaces between each hex pair. For example, the ASCII
     * "ADS Information" becomes hex "41445320496e666f726d6174696f6e.
     *
     * @return Corresponds to SCTE-35 segmentation_upid. Enter a string
     *         containing the hexadecimal representation of the characters that
     *         make up the SCTE-35 segmentation_upid value. Must contain an even
     *         number of hex characters. Do not include spaces between each hex
     *         pair. For example, the ASCII "ADS Information" becomes hex
     *         "41445320496e666f726d6174696f6e.
     */
    public String getSegmentationUpid() {
        return segmentationUpid;
    }

    /**
     * Corresponds to SCTE-35 segmentation_upid. Enter a string containing the
     * hexadecimal representation of the characters that make up the SCTE-35
     * segmentation_upid value. Must contain an even number of hex characters.
     * Do not include spaces between each hex pair. For example, the ASCII
     * "ADS Information" becomes hex "41445320496e666f726d6174696f6e.
     *
     * @param segmentationUpid Corresponds to SCTE-35 segmentation_upid. Enter a
     *            string containing the hexadecimal representation of the
     *            characters that make up the SCTE-35 segmentation_upid value.
     *            Must contain an even number of hex characters. Do not include
     *            spaces between each hex pair. For example, the ASCII
     *            "ADS Information" becomes hex "41445320496e666f726d6174696f6e.
     */
    public void setSegmentationUpid(String segmentationUpid) {
        this.segmentationUpid = segmentationUpid;
    }

    /**
     * Corresponds to SCTE-35 segmentation_upid. Enter a string containing the
     * hexadecimal representation of the characters that make up the SCTE-35
     * segmentation_upid value. Must contain an even number of hex characters.
     * Do not include spaces between each hex pair. For example, the ASCII
     * "ADS Information" becomes hex "41445320496e666f726d6174696f6e.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentationUpid Corresponds to SCTE-35 segmentation_upid. Enter a
     *            string containing the hexadecimal representation of the
     *            characters that make up the SCTE-35 segmentation_upid value.
     *            Must contain an even number of hex characters. Do not include
     *            spaces between each hex pair. For example, the ASCII
     *            "ADS Information" becomes hex "41445320496e666f726d6174696f6e.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Scte35SegmentationDescriptor withSegmentationUpid(String segmentationUpid) {
        this.segmentationUpid = segmentationUpid;
        return this;
    }

    /**
     * Corresponds to SCTE-35 segmentation_upid_type. On the console, enter one
     * of the types listed in the SCTE-35 specification, converted to a decimal.
     * For example, "0x0C" hex from the specification is "12" in decimal. In the
     * CLI, API, or an SDK, enter one of the types listed in the SCTE-35
     * specification, in either hex (for example, "0x0C" ) or in decimal (for
     * example, "12").
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @return Corresponds to SCTE-35 segmentation_upid_type. On the console,
     *         enter one of the types listed in the SCTE-35 specification,
     *         converted to a decimal. For example, "0x0C" hex from the
     *         specification is "12" in decimal. In the CLI, API, or an SDK,
     *         enter one of the types listed in the SCTE-35 specification, in
     *         either hex (for example, "0x0C" ) or in decimal (for example,
     *         "12").
     */
    public Integer getSegmentationUpidType() {
        return segmentationUpidType;
    }

    /**
     * Corresponds to SCTE-35 segmentation_upid_type. On the console, enter one
     * of the types listed in the SCTE-35 specification, converted to a decimal.
     * For example, "0x0C" hex from the specification is "12" in decimal. In the
     * CLI, API, or an SDK, enter one of the types listed in the SCTE-35
     * specification, in either hex (for example, "0x0C" ) or in decimal (for
     * example, "12").
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param segmentationUpidType Corresponds to SCTE-35
     *            segmentation_upid_type. On the console, enter one of the types
     *            listed in the SCTE-35 specification, converted to a decimal.
     *            For example, "0x0C" hex from the specification is "12" in
     *            decimal. In the CLI, API, or an SDK, enter one of the types
     *            listed in the SCTE-35 specification, in either hex (for
     *            example, "0x0C" ) or in decimal (for example, "12").
     */
    public void setSegmentationUpidType(Integer segmentationUpidType) {
        this.segmentationUpidType = segmentationUpidType;
    }

    /**
     * Corresponds to SCTE-35 segmentation_upid_type. On the console, enter one
     * of the types listed in the SCTE-35 specification, converted to a decimal.
     * For example, "0x0C" hex from the specification is "12" in decimal. In the
     * CLI, API, or an SDK, enter one of the types listed in the SCTE-35
     * specification, in either hex (for example, "0x0C" ) or in decimal (for
     * example, "12").
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param segmentationUpidType Corresponds to SCTE-35
     *            segmentation_upid_type. On the console, enter one of the types
     *            listed in the SCTE-35 specification, converted to a decimal.
     *            For example, "0x0C" hex from the specification is "12" in
     *            decimal. In the CLI, API, or an SDK, enter one of the types
     *            listed in the SCTE-35 specification, in either hex (for
     *            example, "0x0C" ) or in decimal (for example, "12").
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Scte35SegmentationDescriptor withSegmentationUpidType(Integer segmentationUpidType) {
        this.segmentationUpidType = segmentationUpidType;
        return this;
    }

    /**
     * Corresponds to SCTE-35 segments_expected. A value that is valid for the
     * specified segmentation_type_id.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @return Corresponds to SCTE-35 segments_expected. A value that is valid
     *         for the specified segmentation_type_id.
     */
    public Integer getSegmentsExpected() {
        return segmentsExpected;
    }

    /**
     * Corresponds to SCTE-35 segments_expected. A value that is valid for the
     * specified segmentation_type_id.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param segmentsExpected Corresponds to SCTE-35 segments_expected. A value
     *            that is valid for the specified segmentation_type_id.
     */
    public void setSegmentsExpected(Integer segmentsExpected) {
        this.segmentsExpected = segmentsExpected;
    }

    /**
     * Corresponds to SCTE-35 segments_expected. A value that is valid for the
     * specified segmentation_type_id.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param segmentsExpected Corresponds to SCTE-35 segments_expected. A value
     *            that is valid for the specified segmentation_type_id.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Scte35SegmentationDescriptor withSegmentsExpected(Integer segmentsExpected) {
        this.segmentsExpected = segmentsExpected;
        return this;
    }

    /**
     * Corresponds to SCTE-35 sub_segment_num. A value that is valid for the
     * specified segmentation_type_id.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @return Corresponds to SCTE-35 sub_segment_num. A value that is valid for
     *         the specified segmentation_type_id.
     */
    public Integer getSubSegmentNum() {
        return subSegmentNum;
    }

    /**
     * Corresponds to SCTE-35 sub_segment_num. A value that is valid for the
     * specified segmentation_type_id.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param subSegmentNum Corresponds to SCTE-35 sub_segment_num. A value that
     *            is valid for the specified segmentation_type_id.
     */
    public void setSubSegmentNum(Integer subSegmentNum) {
        this.subSegmentNum = subSegmentNum;
    }

    /**
     * Corresponds to SCTE-35 sub_segment_num. A value that is valid for the
     * specified segmentation_type_id.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param subSegmentNum Corresponds to SCTE-35 sub_segment_num. A value that
     *            is valid for the specified segmentation_type_id.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Scte35SegmentationDescriptor withSubSegmentNum(Integer subSegmentNum) {
        this.subSegmentNum = subSegmentNum;
        return this;
    }

    /**
     * Corresponds to SCTE-35 sub_segments_expected. A value that is valid for
     * the specified segmentation_type_id.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @return Corresponds to SCTE-35 sub_segments_expected. A value that is
     *         valid for the specified segmentation_type_id.
     */
    public Integer getSubSegmentsExpected() {
        return subSegmentsExpected;
    }

    /**
     * Corresponds to SCTE-35 sub_segments_expected. A value that is valid for
     * the specified segmentation_type_id.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param subSegmentsExpected Corresponds to SCTE-35 sub_segments_expected.
     *            A value that is valid for the specified segmentation_type_id.
     */
    public void setSubSegmentsExpected(Integer subSegmentsExpected) {
        this.subSegmentsExpected = subSegmentsExpected;
    }

    /**
     * Corresponds to SCTE-35 sub_segments_expected. A value that is valid for
     * the specified segmentation_type_id.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param subSegmentsExpected Corresponds to SCTE-35 sub_segments_expected.
     *            A value that is valid for the specified segmentation_type_id.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Scte35SegmentationDescriptor withSubSegmentsExpected(Integer subSegmentsExpected) {
        this.subSegmentsExpected = subSegmentsExpected;
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
        if (getDeliveryRestrictions() != null)
            sb.append("DeliveryRestrictions: " + getDeliveryRestrictions() + ",");
        if (getSegmentNum() != null)
            sb.append("SegmentNum: " + getSegmentNum() + ",");
        if (getSegmentationCancelIndicator() != null)
            sb.append("SegmentationCancelIndicator: " + getSegmentationCancelIndicator() + ",");
        if (getSegmentationDuration() != null)
            sb.append("SegmentationDuration: " + getSegmentationDuration() + ",");
        if (getSegmentationEventId() != null)
            sb.append("SegmentationEventId: " + getSegmentationEventId() + ",");
        if (getSegmentationTypeId() != null)
            sb.append("SegmentationTypeId: " + getSegmentationTypeId() + ",");
        if (getSegmentationUpid() != null)
            sb.append("SegmentationUpid: " + getSegmentationUpid() + ",");
        if (getSegmentationUpidType() != null)
            sb.append("SegmentationUpidType: " + getSegmentationUpidType() + ",");
        if (getSegmentsExpected() != null)
            sb.append("SegmentsExpected: " + getSegmentsExpected() + ",");
        if (getSubSegmentNum() != null)
            sb.append("SubSegmentNum: " + getSubSegmentNum() + ",");
        if (getSubSegmentsExpected() != null)
            sb.append("SubSegmentsExpected: " + getSubSegmentsExpected());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeliveryRestrictions() == null) ? 0 : getDeliveryRestrictions().hashCode());
        hashCode = prime * hashCode + ((getSegmentNum() == null) ? 0 : getSegmentNum().hashCode());
        hashCode = prime
                * hashCode
                + ((getSegmentationCancelIndicator() == null) ? 0
                        : getSegmentationCancelIndicator().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentationDuration() == null) ? 0 : getSegmentationDuration().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentationEventId() == null) ? 0 : getSegmentationEventId().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentationTypeId() == null) ? 0 : getSegmentationTypeId().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentationUpid() == null) ? 0 : getSegmentationUpid().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentationUpidType() == null) ? 0 : getSegmentationUpidType().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentsExpected() == null) ? 0 : getSegmentsExpected().hashCode());
        hashCode = prime * hashCode
                + ((getSubSegmentNum() == null) ? 0 : getSubSegmentNum().hashCode());
        hashCode = prime * hashCode
                + ((getSubSegmentsExpected() == null) ? 0 : getSubSegmentsExpected().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scte35SegmentationDescriptor == false)
            return false;
        Scte35SegmentationDescriptor other = (Scte35SegmentationDescriptor) obj;

        if (other.getDeliveryRestrictions() == null ^ this.getDeliveryRestrictions() == null)
            return false;
        if (other.getDeliveryRestrictions() != null
                && other.getDeliveryRestrictions().equals(this.getDeliveryRestrictions()) == false)
            return false;
        if (other.getSegmentNum() == null ^ this.getSegmentNum() == null)
            return false;
        if (other.getSegmentNum() != null
                && other.getSegmentNum().equals(this.getSegmentNum()) == false)
            return false;
        if (other.getSegmentationCancelIndicator() == null
                ^ this.getSegmentationCancelIndicator() == null)
            return false;
        if (other.getSegmentationCancelIndicator() != null
                && other.getSegmentationCancelIndicator().equals(
                        this.getSegmentationCancelIndicator()) == false)
            return false;
        if (other.getSegmentationDuration() == null ^ this.getSegmentationDuration() == null)
            return false;
        if (other.getSegmentationDuration() != null
                && other.getSegmentationDuration().equals(this.getSegmentationDuration()) == false)
            return false;
        if (other.getSegmentationEventId() == null ^ this.getSegmentationEventId() == null)
            return false;
        if (other.getSegmentationEventId() != null
                && other.getSegmentationEventId().equals(this.getSegmentationEventId()) == false)
            return false;
        if (other.getSegmentationTypeId() == null ^ this.getSegmentationTypeId() == null)
            return false;
        if (other.getSegmentationTypeId() != null
                && other.getSegmentationTypeId().equals(this.getSegmentationTypeId()) == false)
            return false;
        if (other.getSegmentationUpid() == null ^ this.getSegmentationUpid() == null)
            return false;
        if (other.getSegmentationUpid() != null
                && other.getSegmentationUpid().equals(this.getSegmentationUpid()) == false)
            return false;
        if (other.getSegmentationUpidType() == null ^ this.getSegmentationUpidType() == null)
            return false;
        if (other.getSegmentationUpidType() != null
                && other.getSegmentationUpidType().equals(this.getSegmentationUpidType()) == false)
            return false;
        if (other.getSegmentsExpected() == null ^ this.getSegmentsExpected() == null)
            return false;
        if (other.getSegmentsExpected() != null
                && other.getSegmentsExpected().equals(this.getSegmentsExpected()) == false)
            return false;
        if (other.getSubSegmentNum() == null ^ this.getSubSegmentNum() == null)
            return false;
        if (other.getSubSegmentNum() != null
                && other.getSubSegmentNum().equals(this.getSubSegmentNum()) == false)
            return false;
        if (other.getSubSegmentsExpected() == null ^ this.getSubSegmentsExpected() == null)
            return false;
        if (other.getSubSegmentsExpected() != null
                && other.getSubSegmentsExpected().equals(this.getSubSegmentsExpected()) == false)
            return false;
        return true;
    }
}
