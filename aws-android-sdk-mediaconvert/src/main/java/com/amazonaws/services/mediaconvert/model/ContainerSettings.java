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
 * Container specific settings.
 */
public class ContainerSettings implements Serializable {
    /**
     * Settings for MP4 segments in CMAF
     */
    private CmfcSettings cmfcSettings;

    /**
     * Container for this output. Some containers require a container settings
     * object. If not specified, the default object will be created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>F4V, ISMV, M2TS, M3U8, CMFC, MOV, MP4, MPD, MXF,
     * WEBM, RAW
     */
    private String container;

    /**
     * Settings for F4v container
     */
    private F4vSettings f4vSettings;

    /**
     * MPEG-2 TS container settings. These apply to outputs in a File output
     * group when the output's container (ContainerType) is MPEG-2 Transport
     * Stream (M2TS). In these assets, data is organized by the program map
     * table (PMT). Each transport stream program contains subsets of data,
     * including audio, video, and metadata. Each of these subsets of data has a
     * numerical label called a packet identifier (PID). Each transport stream
     * program corresponds to one MediaConvert output. The PMT lists the types
     * of data in a program along with their PID. Downstream systems and players
     * use the program map table to look up the PID for each type of data it
     * accesses and then uses the PIDs to locate specific data within the asset.
     */
    private M2tsSettings m2tsSettings;

    /**
     * Settings for TS segments in HLS
     */
    private M3u8Settings m3u8Settings;

    /**
     * Settings for MOV Container.
     */
    private MovSettings movSettings;

    /**
     * Settings for MP4 container. You can create audio-only AAC outputs with
     * this container.
     */
    private Mp4Settings mp4Settings;

    /**
     * Settings for MP4 segments in DASH
     */
    private MpdSettings mpdSettings;

    /**
     * MXF settings
     */
    private MxfSettings mxfSettings;

    /**
     * Settings for MP4 segments in CMAF
     *
     * @return Settings for MP4 segments in CMAF
     */
    public CmfcSettings getCmfcSettings() {
        return cmfcSettings;
    }

    /**
     * Settings for MP4 segments in CMAF
     *
     * @param cmfcSettings Settings for MP4 segments in CMAF
     */
    public void setCmfcSettings(CmfcSettings cmfcSettings) {
        this.cmfcSettings = cmfcSettings;
    }

    /**
     * Settings for MP4 segments in CMAF
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cmfcSettings Settings for MP4 segments in CMAF
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerSettings withCmfcSettings(CmfcSettings cmfcSettings) {
        this.cmfcSettings = cmfcSettings;
        return this;
    }

    /**
     * Container for this output. Some containers require a container settings
     * object. If not specified, the default object will be created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>F4V, ISMV, M2TS, M3U8, CMFC, MOV, MP4, MPD, MXF,
     * WEBM, RAW
     *
     * @return Container for this output. Some containers require a container
     *         settings object. If not specified, the default object will be
     *         created.
     * @see ContainerType
     */
    public String getContainer() {
        return container;
    }

    /**
     * Container for this output. Some containers require a container settings
     * object. If not specified, the default object will be created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>F4V, ISMV, M2TS, M3U8, CMFC, MOV, MP4, MPD, MXF,
     * WEBM, RAW
     *
     * @param container Container for this output. Some containers require a
     *            container settings object. If not specified, the default
     *            object will be created.
     * @see ContainerType
     */
    public void setContainer(String container) {
        this.container = container;
    }

    /**
     * Container for this output. Some containers require a container settings
     * object. If not specified, the default object will be created.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>F4V, ISMV, M2TS, M3U8, CMFC, MOV, MP4, MPD, MXF,
     * WEBM, RAW
     *
     * @param container Container for this output. Some containers require a
     *            container settings object. If not specified, the default
     *            object will be created.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContainerType
     */
    public ContainerSettings withContainer(String container) {
        this.container = container;
        return this;
    }

    /**
     * Container for this output. Some containers require a container settings
     * object. If not specified, the default object will be created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>F4V, ISMV, M2TS, M3U8, CMFC, MOV, MP4, MPD, MXF,
     * WEBM, RAW
     *
     * @param container Container for this output. Some containers require a
     *            container settings object. If not specified, the default
     *            object will be created.
     * @see ContainerType
     */
    public void setContainer(ContainerType container) {
        this.container = container.toString();
    }

    /**
     * Container for this output. Some containers require a container settings
     * object. If not specified, the default object will be created.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>F4V, ISMV, M2TS, M3U8, CMFC, MOV, MP4, MPD, MXF,
     * WEBM, RAW
     *
     * @param container Container for this output. Some containers require a
     *            container settings object. If not specified, the default
     *            object will be created.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContainerType
     */
    public ContainerSettings withContainer(ContainerType container) {
        this.container = container.toString();
        return this;
    }

    /**
     * Settings for F4v container
     *
     * @return Settings for F4v container
     */
    public F4vSettings getF4vSettings() {
        return f4vSettings;
    }

    /**
     * Settings for F4v container
     *
     * @param f4vSettings Settings for F4v container
     */
    public void setF4vSettings(F4vSettings f4vSettings) {
        this.f4vSettings = f4vSettings;
    }

    /**
     * Settings for F4v container
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param f4vSettings Settings for F4v container
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerSettings withF4vSettings(F4vSettings f4vSettings) {
        this.f4vSettings = f4vSettings;
        return this;
    }

    /**
     * MPEG-2 TS container settings. These apply to outputs in a File output
     * group when the output's container (ContainerType) is MPEG-2 Transport
     * Stream (M2TS). In these assets, data is organized by the program map
     * table (PMT). Each transport stream program contains subsets of data,
     * including audio, video, and metadata. Each of these subsets of data has a
     * numerical label called a packet identifier (PID). Each transport stream
     * program corresponds to one MediaConvert output. The PMT lists the types
     * of data in a program along with their PID. Downstream systems and players
     * use the program map table to look up the PID for each type of data it
     * accesses and then uses the PIDs to locate specific data within the asset.
     *
     * @return MPEG-2 TS container settings. These apply to outputs in a File
     *         output group when the output's container (ContainerType) is
     *         MPEG-2 Transport Stream (M2TS). In these assets, data is
     *         organized by the program map table (PMT). Each transport stream
     *         program contains subsets of data, including audio, video, and
     *         metadata. Each of these subsets of data has a numerical label
     *         called a packet identifier (PID). Each transport stream program
     *         corresponds to one MediaConvert output. The PMT lists the types
     *         of data in a program along with their PID. Downstream systems and
     *         players use the program map table to look up the PID for each
     *         type of data it accesses and then uses the PIDs to locate
     *         specific data within the asset.
     */
    public M2tsSettings getM2tsSettings() {
        return m2tsSettings;
    }

    /**
     * MPEG-2 TS container settings. These apply to outputs in a File output
     * group when the output's container (ContainerType) is MPEG-2 Transport
     * Stream (M2TS). In these assets, data is organized by the program map
     * table (PMT). Each transport stream program contains subsets of data,
     * including audio, video, and metadata. Each of these subsets of data has a
     * numerical label called a packet identifier (PID). Each transport stream
     * program corresponds to one MediaConvert output. The PMT lists the types
     * of data in a program along with their PID. Downstream systems and players
     * use the program map table to look up the PID for each type of data it
     * accesses and then uses the PIDs to locate specific data within the asset.
     *
     * @param m2tsSettings MPEG-2 TS container settings. These apply to outputs
     *            in a File output group when the output's container
     *            (ContainerType) is MPEG-2 Transport Stream (M2TS). In these
     *            assets, data is organized by the program map table (PMT). Each
     *            transport stream program contains subsets of data, including
     *            audio, video, and metadata. Each of these subsets of data has
     *            a numerical label called a packet identifier (PID). Each
     *            transport stream program corresponds to one MediaConvert
     *            output. The PMT lists the types of data in a program along
     *            with their PID. Downstream systems and players use the program
     *            map table to look up the PID for each type of data it accesses
     *            and then uses the PIDs to locate specific data within the
     *            asset.
     */
    public void setM2tsSettings(M2tsSettings m2tsSettings) {
        this.m2tsSettings = m2tsSettings;
    }

    /**
     * MPEG-2 TS container settings. These apply to outputs in a File output
     * group when the output's container (ContainerType) is MPEG-2 Transport
     * Stream (M2TS). In these assets, data is organized by the program map
     * table (PMT). Each transport stream program contains subsets of data,
     * including audio, video, and metadata. Each of these subsets of data has a
     * numerical label called a packet identifier (PID). Each transport stream
     * program corresponds to one MediaConvert output. The PMT lists the types
     * of data in a program along with their PID. Downstream systems and players
     * use the program map table to look up the PID for each type of data it
     * accesses and then uses the PIDs to locate specific data within the asset.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param m2tsSettings MPEG-2 TS container settings. These apply to outputs
     *            in a File output group when the output's container
     *            (ContainerType) is MPEG-2 Transport Stream (M2TS). In these
     *            assets, data is organized by the program map table (PMT). Each
     *            transport stream program contains subsets of data, including
     *            audio, video, and metadata. Each of these subsets of data has
     *            a numerical label called a packet identifier (PID). Each
     *            transport stream program corresponds to one MediaConvert
     *            output. The PMT lists the types of data in a program along
     *            with their PID. Downstream systems and players use the program
     *            map table to look up the PID for each type of data it accesses
     *            and then uses the PIDs to locate specific data within the
     *            asset.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerSettings withM2tsSettings(M2tsSettings m2tsSettings) {
        this.m2tsSettings = m2tsSettings;
        return this;
    }

    /**
     * Settings for TS segments in HLS
     *
     * @return Settings for TS segments in HLS
     */
    public M3u8Settings getM3u8Settings() {
        return m3u8Settings;
    }

    /**
     * Settings for TS segments in HLS
     *
     * @param m3u8Settings Settings for TS segments in HLS
     */
    public void setM3u8Settings(M3u8Settings m3u8Settings) {
        this.m3u8Settings = m3u8Settings;
    }

    /**
     * Settings for TS segments in HLS
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param m3u8Settings Settings for TS segments in HLS
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerSettings withM3u8Settings(M3u8Settings m3u8Settings) {
        this.m3u8Settings = m3u8Settings;
        return this;
    }

    /**
     * Settings for MOV Container.
     *
     * @return Settings for MOV Container.
     */
    public MovSettings getMovSettings() {
        return movSettings;
    }

    /**
     * Settings for MOV Container.
     *
     * @param movSettings Settings for MOV Container.
     */
    public void setMovSettings(MovSettings movSettings) {
        this.movSettings = movSettings;
    }

    /**
     * Settings for MOV Container.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param movSettings Settings for MOV Container.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerSettings withMovSettings(MovSettings movSettings) {
        this.movSettings = movSettings;
        return this;
    }

    /**
     * Settings for MP4 container. You can create audio-only AAC outputs with
     * this container.
     *
     * @return Settings for MP4 container. You can create audio-only AAC outputs
     *         with this container.
     */
    public Mp4Settings getMp4Settings() {
        return mp4Settings;
    }

    /**
     * Settings for MP4 container. You can create audio-only AAC outputs with
     * this container.
     *
     * @param mp4Settings Settings for MP4 container. You can create audio-only
     *            AAC outputs with this container.
     */
    public void setMp4Settings(Mp4Settings mp4Settings) {
        this.mp4Settings = mp4Settings;
    }

    /**
     * Settings for MP4 container. You can create audio-only AAC outputs with
     * this container.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mp4Settings Settings for MP4 container. You can create audio-only
     *            AAC outputs with this container.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerSettings withMp4Settings(Mp4Settings mp4Settings) {
        this.mp4Settings = mp4Settings;
        return this;
    }

    /**
     * Settings for MP4 segments in DASH
     *
     * @return Settings for MP4 segments in DASH
     */
    public MpdSettings getMpdSettings() {
        return mpdSettings;
    }

    /**
     * Settings for MP4 segments in DASH
     *
     * @param mpdSettings Settings for MP4 segments in DASH
     */
    public void setMpdSettings(MpdSettings mpdSettings) {
        this.mpdSettings = mpdSettings;
    }

    /**
     * Settings for MP4 segments in DASH
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mpdSettings Settings for MP4 segments in DASH
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerSettings withMpdSettings(MpdSettings mpdSettings) {
        this.mpdSettings = mpdSettings;
        return this;
    }

    /**
     * MXF settings
     *
     * @return MXF settings
     */
    public MxfSettings getMxfSettings() {
        return mxfSettings;
    }

    /**
     * MXF settings
     *
     * @param mxfSettings MXF settings
     */
    public void setMxfSettings(MxfSettings mxfSettings) {
        this.mxfSettings = mxfSettings;
    }

    /**
     * MXF settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mxfSettings MXF settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerSettings withMxfSettings(MxfSettings mxfSettings) {
        this.mxfSettings = mxfSettings;
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
        if (getCmfcSettings() != null)
            sb.append("CmfcSettings: " + getCmfcSettings() + ",");
        if (getContainer() != null)
            sb.append("Container: " + getContainer() + ",");
        if (getF4vSettings() != null)
            sb.append("F4vSettings: " + getF4vSettings() + ",");
        if (getM2tsSettings() != null)
            sb.append("M2tsSettings: " + getM2tsSettings() + ",");
        if (getM3u8Settings() != null)
            sb.append("M3u8Settings: " + getM3u8Settings() + ",");
        if (getMovSettings() != null)
            sb.append("MovSettings: " + getMovSettings() + ",");
        if (getMp4Settings() != null)
            sb.append("Mp4Settings: " + getMp4Settings() + ",");
        if (getMpdSettings() != null)
            sb.append("MpdSettings: " + getMpdSettings() + ",");
        if (getMxfSettings() != null)
            sb.append("MxfSettings: " + getMxfSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCmfcSettings() == null) ? 0 : getCmfcSettings().hashCode());
        hashCode = prime * hashCode + ((getContainer() == null) ? 0 : getContainer().hashCode());
        hashCode = prime * hashCode
                + ((getF4vSettings() == null) ? 0 : getF4vSettings().hashCode());
        hashCode = prime * hashCode
                + ((getM2tsSettings() == null) ? 0 : getM2tsSettings().hashCode());
        hashCode = prime * hashCode
                + ((getM3u8Settings() == null) ? 0 : getM3u8Settings().hashCode());
        hashCode = prime * hashCode
                + ((getMovSettings() == null) ? 0 : getMovSettings().hashCode());
        hashCode = prime * hashCode
                + ((getMp4Settings() == null) ? 0 : getMp4Settings().hashCode());
        hashCode = prime * hashCode
                + ((getMpdSettings() == null) ? 0 : getMpdSettings().hashCode());
        hashCode = prime * hashCode
                + ((getMxfSettings() == null) ? 0 : getMxfSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerSettings == false)
            return false;
        ContainerSettings other = (ContainerSettings) obj;

        if (other.getCmfcSettings() == null ^ this.getCmfcSettings() == null)
            return false;
        if (other.getCmfcSettings() != null
                && other.getCmfcSettings().equals(this.getCmfcSettings()) == false)
            return false;
        if (other.getContainer() == null ^ this.getContainer() == null)
            return false;
        if (other.getContainer() != null
                && other.getContainer().equals(this.getContainer()) == false)
            return false;
        if (other.getF4vSettings() == null ^ this.getF4vSettings() == null)
            return false;
        if (other.getF4vSettings() != null
                && other.getF4vSettings().equals(this.getF4vSettings()) == false)
            return false;
        if (other.getM2tsSettings() == null ^ this.getM2tsSettings() == null)
            return false;
        if (other.getM2tsSettings() != null
                && other.getM2tsSettings().equals(this.getM2tsSettings()) == false)
            return false;
        if (other.getM3u8Settings() == null ^ this.getM3u8Settings() == null)
            return false;
        if (other.getM3u8Settings() != null
                && other.getM3u8Settings().equals(this.getM3u8Settings()) == false)
            return false;
        if (other.getMovSettings() == null ^ this.getMovSettings() == null)
            return false;
        if (other.getMovSettings() != null
                && other.getMovSettings().equals(this.getMovSettings()) == false)
            return false;
        if (other.getMp4Settings() == null ^ this.getMp4Settings() == null)
            return false;
        if (other.getMp4Settings() != null
                && other.getMp4Settings().equals(this.getMp4Settings()) == false)
            return false;
        if (other.getMpdSettings() == null ^ this.getMpdSettings() == null)
            return false;
        if (other.getMpdSettings() != null
                && other.getMpdSettings().equals(this.getMpdSettings()) == false)
            return false;
        if (other.getMxfSettings() == null ^ this.getMxfSettings() == null)
            return false;
        if (other.getMxfSettings() != null
                && other.getMxfSettings().equals(this.getMxfSettings()) == false)
            return false;
        return true;
    }
}
