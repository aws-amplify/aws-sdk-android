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
package com.amazonaws.services.mediapackage-vod.model;

import java.io.Serializable;


/**
 * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
 */
public class DashPackage implements Serializable {
    /**
     * A list of DASH manifest configurations.
     */
    private java.util.List<DashManifest> dashManifests;

    /**
     * A Dynamic Adaptive Streaming over HTTP (DASH) encryption configuration.
     */
    private DashEncryption encryption;

    /**
     * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH)
Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
be partitioned into more than one period. If the list contains "ADS", new periods will be created where
the Asset contains SCTE-35 ad markers.

     */
    private java.util.List<String> periodTriggers;

    /**
     * Duration (in seconds) of each segment. Actual segments will be
rounded to the nearest multiple of the source segment duration.

     */
    private Integer segmentDurationSeconds;

    /**
     * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NUMBER_WITH_TIMELINE, TIME_WITH_TIMELINE, NUMBER_WITH_DURATION
     */
    private String segmentTemplateFormat;

    /**
     * A list of DASH manifest configurations.
     *
     * @return A list of DASH manifest configurations.
     */
    public java.util.List<DashManifest> getDashManifests() {
        return dashManifests;
    }

    /**
     * A list of DASH manifest configurations.
     *
     * @param dashManifests A list of DASH manifest configurations.
     */
    public void setDashManifests(java.util.Collection<DashManifest> dashManifests) {
        if (dashManifests == null) {
            this.dashManifests = null;
            return;
        }

        this.dashManifests = new java.util.ArrayList<DashManifest>(dashManifests);
    }

    /**
     * A list of DASH manifest configurations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dashManifests A list of DASH manifest configurations.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DashPackage withDashManifests(DashManifest... dashManifests) {
        if (getDashManifests() == null) {
            this.dashManifests = new java.util.ArrayList<DashManifest>(dashManifests.length);
        }
        for (DashManifest value : dashManifests) {
            this.dashManifests.add(value);
        }
        return this;
    }

    /**
     * A list of DASH manifest configurations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dashManifests A list of DASH manifest configurations.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DashPackage withDashManifests(java.util.Collection<DashManifest> dashManifests) {
        setDashManifests(dashManifests);
        return this;
    }

    /**
     * A Dynamic Adaptive Streaming over HTTP (DASH) encryption configuration.
     *
     * @return A Dynamic Adaptive Streaming over HTTP (DASH) encryption configuration.
     */
    public DashEncryption getEncryption() {
        return encryption;
    }

    /**
     * A Dynamic Adaptive Streaming over HTTP (DASH) encryption configuration.
     *
     * @param encryption A Dynamic Adaptive Streaming over HTTP (DASH) encryption configuration.
     */
    public void setEncryption(DashEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * A Dynamic Adaptive Streaming over HTTP (DASH) encryption configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param encryption A Dynamic Adaptive Streaming over HTTP (DASH) encryption configuration.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DashPackage withEncryption(DashEncryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH)
Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
be partitioned into more than one period. If the list contains "ADS", new periods will be created where
the Asset contains SCTE-35 ad markers.

     *
     * @return A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH)
Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
be partitioned into more than one period. If the list contains "ADS", new periods will be created where
the Asset contains SCTE-35 ad markers.

     */
    public java.util.List<String> getPeriodTriggers() {
        return periodTriggers;
    }

    /**
     * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH)
Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
be partitioned into more than one period. If the list contains "ADS", new periods will be created where
the Asset contains SCTE-35 ad markers.

     *
     * @param periodTriggers A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH)
Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
be partitioned into more than one period. If the list contains "ADS", new periods will be created where
the Asset contains SCTE-35 ad markers.

     */
    public void setPeriodTriggers(java.util.Collection<String> periodTriggers) {
        if (periodTriggers == null) {
            this.periodTriggers = null;
            return;
        }

        this.periodTriggers = new java.util.ArrayList<String>(periodTriggers);
    }

    /**
     * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH)
Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
be partitioned into more than one period. If the list contains "ADS", new periods will be created where
the Asset contains SCTE-35 ad markers.

     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param periodTriggers A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH)
Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
be partitioned into more than one period. If the list contains "ADS", new periods will be created where
the Asset contains SCTE-35 ad markers.

     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DashPackage withPeriodTriggers(String... periodTriggers) {
        if (getPeriodTriggers() == null) {
            this.periodTriggers = new java.util.ArrayList<String>(periodTriggers.length);
        }
        for (String value : periodTriggers) {
            this.periodTriggers.add(value);
        }
        return this;
    }

    /**
     * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH)
Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
be partitioned into more than one period. If the list contains "ADS", new periods will be created where
the Asset contains SCTE-35 ad markers.

     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param periodTriggers A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH)
Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
be partitioned into more than one period. If the list contains "ADS", new periods will be created where
the Asset contains SCTE-35 ad markers.

     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DashPackage withPeriodTriggers(java.util.Collection<String> periodTriggers) {
        setPeriodTriggers(periodTriggers);
        return this;
    }

    /**
     * Duration (in seconds) of each segment. Actual segments will be
rounded to the nearest multiple of the source segment duration.

     *
     * @return Duration (in seconds) of each segment. Actual segments will be
rounded to the nearest multiple of the source segment duration.

     */
    public Integer getSegmentDurationSeconds() {
        return segmentDurationSeconds;
    }

    /**
     * Duration (in seconds) of each segment. Actual segments will be
rounded to the nearest multiple of the source segment duration.

     *
     * @param segmentDurationSeconds Duration (in seconds) of each segment. Actual segments will be
rounded to the nearest multiple of the source segment duration.

     */
    public void setSegmentDurationSeconds(Integer segmentDurationSeconds) {
        this.segmentDurationSeconds = segmentDurationSeconds;
    }

    /**
     * Duration (in seconds) of each segment. Actual segments will be
rounded to the nearest multiple of the source segment duration.

     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param segmentDurationSeconds Duration (in seconds) of each segment. Actual segments will be
rounded to the nearest multiple of the source segment duration.

     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DashPackage withSegmentDurationSeconds(Integer segmentDurationSeconds) {
        this.segmentDurationSeconds = segmentDurationSeconds;
        return this;
    }

    /**
     * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NUMBER_WITH_TIMELINE, TIME_WITH_TIMELINE, NUMBER_WITH_DURATION
     *
     * @return Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     *
     * @see SegmentTemplateFormat
     */
    public String getSegmentTemplateFormat() {
        return segmentTemplateFormat;
    }

    /**
     * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NUMBER_WITH_TIMELINE, TIME_WITH_TIMELINE, NUMBER_WITH_DURATION
     *
     * @param segmentTemplateFormat Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     *
     * @see SegmentTemplateFormat
     */
    public void setSegmentTemplateFormat(String segmentTemplateFormat) {
        this.segmentTemplateFormat = segmentTemplateFormat;
    }

    /**
     * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NUMBER_WITH_TIMELINE, TIME_WITH_TIMELINE, NUMBER_WITH_DURATION
     *
     * @param segmentTemplateFormat Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see SegmentTemplateFormat
     */
    public DashPackage withSegmentTemplateFormat(String segmentTemplateFormat) {
        this.segmentTemplateFormat = segmentTemplateFormat;
        return this;
    }

    /**
     * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NUMBER_WITH_TIMELINE, TIME_WITH_TIMELINE, NUMBER_WITH_DURATION
     *
     * @param segmentTemplateFormat Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     *
     * @see SegmentTemplateFormat
     */
    public void setSegmentTemplateFormat(SegmentTemplateFormat segmentTemplateFormat) {
        this.segmentTemplateFormat = segmentTemplateFormat.toString();
    }

    /**
     * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NUMBER_WITH_TIMELINE, TIME_WITH_TIMELINE, NUMBER_WITH_DURATION
     *
     * @param segmentTemplateFormat Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see SegmentTemplateFormat
     */
    public DashPackage withSegmentTemplateFormat(SegmentTemplateFormat segmentTemplateFormat) {
        this.segmentTemplateFormat = segmentTemplateFormat.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDashManifests() != null) sb.append("DashManifests: " + getDashManifests() + ",");
        if (getEncryption() != null) sb.append("Encryption: " + getEncryption() + ",");
        if (getPeriodTriggers() != null) sb.append("PeriodTriggers: " + getPeriodTriggers() + ",");
        if (getSegmentDurationSeconds() != null) sb.append("SegmentDurationSeconds: " + getSegmentDurationSeconds() + ",");
        if (getSegmentTemplateFormat() != null) sb.append("SegmentTemplateFormat: " + getSegmentTemplateFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashManifests() == null) ? 0 : getDashManifests().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getPeriodTriggers() == null) ? 0 : getPeriodTriggers().hashCode());
        hashCode = prime * hashCode + ((getSegmentDurationSeconds() == null) ? 0 : getSegmentDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getSegmentTemplateFormat() == null) ? 0 : getSegmentTemplateFormat().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DashPackage == false) return false;
        DashPackage other = (DashPackage)obj;

        if (other.getDashManifests() == null ^ this.getDashManifests() == null) return false;
        if (other.getDashManifests() != null && other.getDashManifests().equals(this.getDashManifests()) == false) return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null) return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false) return false;
        if (other.getPeriodTriggers() == null ^ this.getPeriodTriggers() == null) return false;
        if (other.getPeriodTriggers() != null && other.getPeriodTriggers().equals(this.getPeriodTriggers()) == false) return false;
        if (other.getSegmentDurationSeconds() == null ^ this.getSegmentDurationSeconds() == null) return false;
        if (other.getSegmentDurationSeconds() != null && other.getSegmentDurationSeconds().equals(this.getSegmentDurationSeconds()) == false) return false;
        if (other.getSegmentTemplateFormat() == null ^ this.getSegmentTemplateFormat() == null) return false;
        if (other.getSegmentTemplateFormat() != null && other.getSegmentTemplateFormat().equals(this.getSegmentTemplateFormat()) == false) return false;
        return true;
    }
}
