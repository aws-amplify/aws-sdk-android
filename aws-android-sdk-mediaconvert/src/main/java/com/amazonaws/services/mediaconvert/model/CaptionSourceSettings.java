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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * If your input captions are SCC, TTML, STL, SMI, SRT, or IMSC in an xml file,
 * specify the URI of the input captions source file. If your input captions are
 * IMSC in an IMF package, use TrackSourceSettings instead of FileSoureSettings.
 */
public class CaptionSourceSettings implements Serializable {
    /**
     * Settings for ancillary captions source.
     */
    private AncillarySourceSettings ancillarySourceSettings;

    /**
     * DVB Sub Source Settings
     */
    private DvbSubSourceSettings dvbSubSourceSettings;

    /**
     * Settings for embedded captions Source
     */
    private EmbeddedSourceSettings embeddedSourceSettings;

    /**
     * If your input captions are SCC, SMI, SRT, STL, TTML, or IMSC 1.1 in an
     * xml file, specify the URI of the input caption source file. If your
     * caption source is IMSC in an IMF package, use TrackSourceSettings instead
     * of FileSoureSettings.
     */
    private FileSourceSettings fileSourceSettings;

    /**
     * Use Source (SourceType) to identify the format of your input captions.
     * The service cannot auto-detect caption format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ANCILLARY, DVB_SUB, EMBEDDED, SCTE20, SCC, TTML,
     * STL, SRT, SMI, TELETEXT, NULL_SOURCE, IMSC
     */
    private String sourceType;

    /**
     * Settings specific to Teletext caption sources, including Page number.
     */
    private TeletextSourceSettings teletextSourceSettings;

    /**
     * Settings specific to caption sources that are specified by track number.
     * Currently, this is only IMSC captions in an IMF package. If your caption
     * source is IMSC 1.1 in a separate xml file, use FileSourceSettings instead
     * of TrackSourceSettings.
     */
    private TrackSourceSettings trackSourceSettings;

    /**
     * Settings for ancillary captions source.
     *
     * @return Settings for ancillary captions source.
     */
    public AncillarySourceSettings getAncillarySourceSettings() {
        return ancillarySourceSettings;
    }

    /**
     * Settings for ancillary captions source.
     *
     * @param ancillarySourceSettings Settings for ancillary captions source.
     */
    public void setAncillarySourceSettings(AncillarySourceSettings ancillarySourceSettings) {
        this.ancillarySourceSettings = ancillarySourceSettings;
    }

    /**
     * Settings for ancillary captions source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ancillarySourceSettings Settings for ancillary captions source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionSourceSettings withAncillarySourceSettings(
            AncillarySourceSettings ancillarySourceSettings) {
        this.ancillarySourceSettings = ancillarySourceSettings;
        return this;
    }

    /**
     * DVB Sub Source Settings
     *
     * @return DVB Sub Source Settings
     */
    public DvbSubSourceSettings getDvbSubSourceSettings() {
        return dvbSubSourceSettings;
    }

    /**
     * DVB Sub Source Settings
     *
     * @param dvbSubSourceSettings DVB Sub Source Settings
     */
    public void setDvbSubSourceSettings(DvbSubSourceSettings dvbSubSourceSettings) {
        this.dvbSubSourceSettings = dvbSubSourceSettings;
    }

    /**
     * DVB Sub Source Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dvbSubSourceSettings DVB Sub Source Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionSourceSettings withDvbSubSourceSettings(DvbSubSourceSettings dvbSubSourceSettings) {
        this.dvbSubSourceSettings = dvbSubSourceSettings;
        return this;
    }

    /**
     * Settings for embedded captions Source
     *
     * @return Settings for embedded captions Source
     */
    public EmbeddedSourceSettings getEmbeddedSourceSettings() {
        return embeddedSourceSettings;
    }

    /**
     * Settings for embedded captions Source
     *
     * @param embeddedSourceSettings Settings for embedded captions Source
     */
    public void setEmbeddedSourceSettings(EmbeddedSourceSettings embeddedSourceSettings) {
        this.embeddedSourceSettings = embeddedSourceSettings;
    }

    /**
     * Settings for embedded captions Source
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param embeddedSourceSettings Settings for embedded captions Source
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionSourceSettings withEmbeddedSourceSettings(
            EmbeddedSourceSettings embeddedSourceSettings) {
        this.embeddedSourceSettings = embeddedSourceSettings;
        return this;
    }

    /**
     * If your input captions are SCC, SMI, SRT, STL, TTML, or IMSC 1.1 in an
     * xml file, specify the URI of the input caption source file. If your
     * caption source is IMSC in an IMF package, use TrackSourceSettings instead
     * of FileSoureSettings.
     *
     * @return If your input captions are SCC, SMI, SRT, STL, TTML, or IMSC 1.1
     *         in an xml file, specify the URI of the input caption source file.
     *         If your caption source is IMSC in an IMF package, use
     *         TrackSourceSettings instead of FileSoureSettings.
     */
    public FileSourceSettings getFileSourceSettings() {
        return fileSourceSettings;
    }

    /**
     * If your input captions are SCC, SMI, SRT, STL, TTML, or IMSC 1.1 in an
     * xml file, specify the URI of the input caption source file. If your
     * caption source is IMSC in an IMF package, use TrackSourceSettings instead
     * of FileSoureSettings.
     *
     * @param fileSourceSettings If your input captions are SCC, SMI, SRT, STL,
     *            TTML, or IMSC 1.1 in an xml file, specify the URI of the input
     *            caption source file. If your caption source is IMSC in an IMF
     *            package, use TrackSourceSettings instead of FileSoureSettings.
     */
    public void setFileSourceSettings(FileSourceSettings fileSourceSettings) {
        this.fileSourceSettings = fileSourceSettings;
    }

    /**
     * If your input captions are SCC, SMI, SRT, STL, TTML, or IMSC 1.1 in an
     * xml file, specify the URI of the input caption source file. If your
     * caption source is IMSC in an IMF package, use TrackSourceSettings instead
     * of FileSoureSettings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSourceSettings If your input captions are SCC, SMI, SRT, STL,
     *            TTML, or IMSC 1.1 in an xml file, specify the URI of the input
     *            caption source file. If your caption source is IMSC in an IMF
     *            package, use TrackSourceSettings instead of FileSoureSettings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionSourceSettings withFileSourceSettings(FileSourceSettings fileSourceSettings) {
        this.fileSourceSettings = fileSourceSettings;
        return this;
    }

    /**
     * Use Source (SourceType) to identify the format of your input captions.
     * The service cannot auto-detect caption format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ANCILLARY, DVB_SUB, EMBEDDED, SCTE20, SCC, TTML,
     * STL, SRT, SMI, TELETEXT, NULL_SOURCE, IMSC
     *
     * @return Use Source (SourceType) to identify the format of your input
     *         captions. The service cannot auto-detect caption format.
     * @see CaptionSourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * Use Source (SourceType) to identify the format of your input captions.
     * The service cannot auto-detect caption format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ANCILLARY, DVB_SUB, EMBEDDED, SCTE20, SCC, TTML,
     * STL, SRT, SMI, TELETEXT, NULL_SOURCE, IMSC
     *
     * @param sourceType Use Source (SourceType) to identify the format of your
     *            input captions. The service cannot auto-detect caption format.
     * @see CaptionSourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * Use Source (SourceType) to identify the format of your input captions.
     * The service cannot auto-detect caption format.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ANCILLARY, DVB_SUB, EMBEDDED, SCTE20, SCC, TTML,
     * STL, SRT, SMI, TELETEXT, NULL_SOURCE, IMSC
     *
     * @param sourceType Use Source (SourceType) to identify the format of your
     *            input captions. The service cannot auto-detect caption format.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CaptionSourceType
     */
    public CaptionSourceSettings withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Use Source (SourceType) to identify the format of your input captions.
     * The service cannot auto-detect caption format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ANCILLARY, DVB_SUB, EMBEDDED, SCTE20, SCC, TTML,
     * STL, SRT, SMI, TELETEXT, NULL_SOURCE, IMSC
     *
     * @param sourceType Use Source (SourceType) to identify the format of your
     *            input captions. The service cannot auto-detect caption format.
     * @see CaptionSourceType
     */
    public void setSourceType(CaptionSourceType sourceType) {
        this.sourceType = sourceType.toString();
    }

    /**
     * Use Source (SourceType) to identify the format of your input captions.
     * The service cannot auto-detect caption format.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ANCILLARY, DVB_SUB, EMBEDDED, SCTE20, SCC, TTML,
     * STL, SRT, SMI, TELETEXT, NULL_SOURCE, IMSC
     *
     * @param sourceType Use Source (SourceType) to identify the format of your
     *            input captions. The service cannot auto-detect caption format.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CaptionSourceType
     */
    public CaptionSourceSettings withSourceType(CaptionSourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * Settings specific to Teletext caption sources, including Page number.
     *
     * @return Settings specific to Teletext caption sources, including Page
     *         number.
     */
    public TeletextSourceSettings getTeletextSourceSettings() {
        return teletextSourceSettings;
    }

    /**
     * Settings specific to Teletext caption sources, including Page number.
     *
     * @param teletextSourceSettings Settings specific to Teletext caption
     *            sources, including Page number.
     */
    public void setTeletextSourceSettings(TeletextSourceSettings teletextSourceSettings) {
        this.teletextSourceSettings = teletextSourceSettings;
    }

    /**
     * Settings specific to Teletext caption sources, including Page number.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param teletextSourceSettings Settings specific to Teletext caption
     *            sources, including Page number.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionSourceSettings withTeletextSourceSettings(
            TeletextSourceSettings teletextSourceSettings) {
        this.teletextSourceSettings = teletextSourceSettings;
        return this;
    }

    /**
     * Settings specific to caption sources that are specified by track number.
     * Currently, this is only IMSC captions in an IMF package. If your caption
     * source is IMSC 1.1 in a separate xml file, use FileSourceSettings instead
     * of TrackSourceSettings.
     *
     * @return Settings specific to caption sources that are specified by track
     *         number. Currently, this is only IMSC captions in an IMF package.
     *         If your caption source is IMSC 1.1 in a separate xml file, use
     *         FileSourceSettings instead of TrackSourceSettings.
     */
    public TrackSourceSettings getTrackSourceSettings() {
        return trackSourceSettings;
    }

    /**
     * Settings specific to caption sources that are specified by track number.
     * Currently, this is only IMSC captions in an IMF package. If your caption
     * source is IMSC 1.1 in a separate xml file, use FileSourceSettings instead
     * of TrackSourceSettings.
     *
     * @param trackSourceSettings Settings specific to caption sources that are
     *            specified by track number. Currently, this is only IMSC
     *            captions in an IMF package. If your caption source is IMSC 1.1
     *            in a separate xml file, use FileSourceSettings instead of
     *            TrackSourceSettings.
     */
    public void setTrackSourceSettings(TrackSourceSettings trackSourceSettings) {
        this.trackSourceSettings = trackSourceSettings;
    }

    /**
     * Settings specific to caption sources that are specified by track number.
     * Currently, this is only IMSC captions in an IMF package. If your caption
     * source is IMSC 1.1 in a separate xml file, use FileSourceSettings instead
     * of TrackSourceSettings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trackSourceSettings Settings specific to caption sources that are
     *            specified by track number. Currently, this is only IMSC
     *            captions in an IMF package. If your caption source is IMSC 1.1
     *            in a separate xml file, use FileSourceSettings instead of
     *            TrackSourceSettings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionSourceSettings withTrackSourceSettings(TrackSourceSettings trackSourceSettings) {
        this.trackSourceSettings = trackSourceSettings;
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
        if (getAncillarySourceSettings() != null)
            sb.append("AncillarySourceSettings: " + getAncillarySourceSettings() + ",");
        if (getDvbSubSourceSettings() != null)
            sb.append("DvbSubSourceSettings: " + getDvbSubSourceSettings() + ",");
        if (getEmbeddedSourceSettings() != null)
            sb.append("EmbeddedSourceSettings: " + getEmbeddedSourceSettings() + ",");
        if (getFileSourceSettings() != null)
            sb.append("FileSourceSettings: " + getFileSourceSettings() + ",");
        if (getSourceType() != null)
            sb.append("SourceType: " + getSourceType() + ",");
        if (getTeletextSourceSettings() != null)
            sb.append("TeletextSourceSettings: " + getTeletextSourceSettings() + ",");
        if (getTrackSourceSettings() != null)
            sb.append("TrackSourceSettings: " + getTrackSourceSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAncillarySourceSettings() == null) ? 0 : getAncillarySourceSettings()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDvbSubSourceSettings() == null) ? 0 : getDvbSubSourceSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getEmbeddedSourceSettings() == null) ? 0 : getEmbeddedSourceSettings()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFileSourceSettings() == null) ? 0 : getFileSourceSettings().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime
                * hashCode
                + ((getTeletextSourceSettings() == null) ? 0 : getTeletextSourceSettings()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTrackSourceSettings() == null) ? 0 : getTrackSourceSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionSourceSettings == false)
            return false;
        CaptionSourceSettings other = (CaptionSourceSettings) obj;

        if (other.getAncillarySourceSettings() == null ^ this.getAncillarySourceSettings() == null)
            return false;
        if (other.getAncillarySourceSettings() != null
                && other.getAncillarySourceSettings().equals(this.getAncillarySourceSettings()) == false)
            return false;
        if (other.getDvbSubSourceSettings() == null ^ this.getDvbSubSourceSettings() == null)
            return false;
        if (other.getDvbSubSourceSettings() != null
                && other.getDvbSubSourceSettings().equals(this.getDvbSubSourceSettings()) == false)
            return false;
        if (other.getEmbeddedSourceSettings() == null ^ this.getEmbeddedSourceSettings() == null)
            return false;
        if (other.getEmbeddedSourceSettings() != null
                && other.getEmbeddedSourceSettings().equals(this.getEmbeddedSourceSettings()) == false)
            return false;
        if (other.getFileSourceSettings() == null ^ this.getFileSourceSettings() == null)
            return false;
        if (other.getFileSourceSettings() != null
                && other.getFileSourceSettings().equals(this.getFileSourceSettings()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null
                && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getTeletextSourceSettings() == null ^ this.getTeletextSourceSettings() == null)
            return false;
        if (other.getTeletextSourceSettings() != null
                && other.getTeletextSourceSettings().equals(this.getTeletextSourceSettings()) == false)
            return false;
        if (other.getTrackSourceSettings() == null ^ this.getTrackSourceSettings() == null)
            return false;
        if (other.getTrackSourceSettings() != null
                && other.getTrackSourceSettings().equals(this.getTrackSourceSettings()) == false)
            return false;
        return true;
    }
}
