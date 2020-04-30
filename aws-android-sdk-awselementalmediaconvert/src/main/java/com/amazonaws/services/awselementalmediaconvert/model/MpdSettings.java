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
 * Settings for MP4 segments in DASH
 */
public class MpdSettings implements Serializable {
    /**
     * Use this setting only in DASH output groups that include sidecar TTML or
     * IMSC captions. You specify sidecar captions in a separate output from
     * your audio and video. Choose Raw (RAW) for captions in a single XML file
     * in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for
     * captions in XML format contained within fragmented MP4 files. This set of
     * fragmented MP4 files is separate from your video and audio fragmented MP4
     * files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, FRAGMENTED_MP4
     */
    private String captionContainerType;

    /**
     * Use this setting only when you specify SCTE-35 markers from ESAM. Choose
     * INSERT to put SCTE-35 markers in this output at the insertion points that
     * you specify in an ESAM XML document. Provide the document in the setting
     * SCC XML (sccXml).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, NONE
     */
    private String scte35Esam;

    /**
     * Ignore this setting unless you have SCTE-35 markers in your input video
     * file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that
     * appear in your input to also appear in this output. Choose None (NONE) if
     * you don't want those SCTE-35 markers in this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     */
    private String scte35Source;

    /**
     * Use this setting only in DASH output groups that include sidecar TTML or
     * IMSC captions. You specify sidecar captions in a separate output from
     * your audio and video. Choose Raw (RAW) for captions in a single XML file
     * in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for
     * captions in XML format contained within fragmented MP4 files. This set of
     * fragmented MP4 files is separate from your video and audio fragmented MP4
     * files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, FRAGMENTED_MP4
     *
     * @return Use this setting only in DASH output groups that include sidecar
     *         TTML or IMSC captions. You specify sidecar captions in a separate
     *         output from your audio and video. Choose Raw (RAW) for captions
     *         in a single XML file in a raw container. Choose Fragmented MPEG-4
     *         (FRAGMENTED_MP4) for captions in XML format contained within
     *         fragmented MP4 files. This set of fragmented MP4 files is
     *         separate from your video and audio fragmented MP4 files.
     * @see MpdCaptionContainerType
     */
    public String getCaptionContainerType() {
        return captionContainerType;
    }

    /**
     * Use this setting only in DASH output groups that include sidecar TTML or
     * IMSC captions. You specify sidecar captions in a separate output from
     * your audio and video. Choose Raw (RAW) for captions in a single XML file
     * in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for
     * captions in XML format contained within fragmented MP4 files. This set of
     * fragmented MP4 files is separate from your video and audio fragmented MP4
     * files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, FRAGMENTED_MP4
     *
     * @param captionContainerType Use this setting only in DASH output groups
     *            that include sidecar TTML or IMSC captions. You specify
     *            sidecar captions in a separate output from your audio and
     *            video. Choose Raw (RAW) for captions in a single XML file in a
     *            raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for
     *            captions in XML format contained within fragmented MP4 files.
     *            This set of fragmented MP4 files is separate from your video
     *            and audio fragmented MP4 files.
     * @see MpdCaptionContainerType
     */
    public void setCaptionContainerType(String captionContainerType) {
        this.captionContainerType = captionContainerType;
    }

    /**
     * Use this setting only in DASH output groups that include sidecar TTML or
     * IMSC captions. You specify sidecar captions in a separate output from
     * your audio and video. Choose Raw (RAW) for captions in a single XML file
     * in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for
     * captions in XML format contained within fragmented MP4 files. This set of
     * fragmented MP4 files is separate from your video and audio fragmented MP4
     * files.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, FRAGMENTED_MP4
     *
     * @param captionContainerType Use this setting only in DASH output groups
     *            that include sidecar TTML or IMSC captions. You specify
     *            sidecar captions in a separate output from your audio and
     *            video. Choose Raw (RAW) for captions in a single XML file in a
     *            raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for
     *            captions in XML format contained within fragmented MP4 files.
     *            This set of fragmented MP4 files is separate from your video
     *            and audio fragmented MP4 files.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MpdCaptionContainerType
     */
    public MpdSettings withCaptionContainerType(String captionContainerType) {
        this.captionContainerType = captionContainerType;
        return this;
    }

    /**
     * Use this setting only in DASH output groups that include sidecar TTML or
     * IMSC captions. You specify sidecar captions in a separate output from
     * your audio and video. Choose Raw (RAW) for captions in a single XML file
     * in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for
     * captions in XML format contained within fragmented MP4 files. This set of
     * fragmented MP4 files is separate from your video and audio fragmented MP4
     * files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, FRAGMENTED_MP4
     *
     * @param captionContainerType Use this setting only in DASH output groups
     *            that include sidecar TTML or IMSC captions. You specify
     *            sidecar captions in a separate output from your audio and
     *            video. Choose Raw (RAW) for captions in a single XML file in a
     *            raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for
     *            captions in XML format contained within fragmented MP4 files.
     *            This set of fragmented MP4 files is separate from your video
     *            and audio fragmented MP4 files.
     * @see MpdCaptionContainerType
     */
    public void setCaptionContainerType(MpdCaptionContainerType captionContainerType) {
        this.captionContainerType = captionContainerType.toString();
    }

    /**
     * Use this setting only in DASH output groups that include sidecar TTML or
     * IMSC captions. You specify sidecar captions in a separate output from
     * your audio and video. Choose Raw (RAW) for captions in a single XML file
     * in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for
     * captions in XML format contained within fragmented MP4 files. This set of
     * fragmented MP4 files is separate from your video and audio fragmented MP4
     * files.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, FRAGMENTED_MP4
     *
     * @param captionContainerType Use this setting only in DASH output groups
     *            that include sidecar TTML or IMSC captions. You specify
     *            sidecar captions in a separate output from your audio and
     *            video. Choose Raw (RAW) for captions in a single XML file in a
     *            raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for
     *            captions in XML format contained within fragmented MP4 files.
     *            This set of fragmented MP4 files is separate from your video
     *            and audio fragmented MP4 files.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MpdCaptionContainerType
     */
    public MpdSettings withCaptionContainerType(MpdCaptionContainerType captionContainerType) {
        this.captionContainerType = captionContainerType.toString();
        return this;
    }

    /**
     * Use this setting only when you specify SCTE-35 markers from ESAM. Choose
     * INSERT to put SCTE-35 markers in this output at the insertion points that
     * you specify in an ESAM XML document. Provide the document in the setting
     * SCC XML (sccXml).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, NONE
     *
     * @return Use this setting only when you specify SCTE-35 markers from ESAM.
     *         Choose INSERT to put SCTE-35 markers in this output at the
     *         insertion points that you specify in an ESAM XML document.
     *         Provide the document in the setting SCC XML (sccXml).
     * @see MpdScte35Esam
     */
    public String getScte35Esam() {
        return scte35Esam;
    }

    /**
     * Use this setting only when you specify SCTE-35 markers from ESAM. Choose
     * INSERT to put SCTE-35 markers in this output at the insertion points that
     * you specify in an ESAM XML document. Provide the document in the setting
     * SCC XML (sccXml).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, NONE
     *
     * @param scte35Esam Use this setting only when you specify SCTE-35 markers
     *            from ESAM. Choose INSERT to put SCTE-35 markers in this output
     *            at the insertion points that you specify in an ESAM XML
     *            document. Provide the document in the setting SCC XML
     *            (sccXml).
     * @see MpdScte35Esam
     */
    public void setScte35Esam(String scte35Esam) {
        this.scte35Esam = scte35Esam;
    }

    /**
     * Use this setting only when you specify SCTE-35 markers from ESAM. Choose
     * INSERT to put SCTE-35 markers in this output at the insertion points that
     * you specify in an ESAM XML document. Provide the document in the setting
     * SCC XML (sccXml).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, NONE
     *
     * @param scte35Esam Use this setting only when you specify SCTE-35 markers
     *            from ESAM. Choose INSERT to put SCTE-35 markers in this output
     *            at the insertion points that you specify in an ESAM XML
     *            document. Provide the document in the setting SCC XML
     *            (sccXml).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MpdScte35Esam
     */
    public MpdSettings withScte35Esam(String scte35Esam) {
        this.scte35Esam = scte35Esam;
        return this;
    }

    /**
     * Use this setting only when you specify SCTE-35 markers from ESAM. Choose
     * INSERT to put SCTE-35 markers in this output at the insertion points that
     * you specify in an ESAM XML document. Provide the document in the setting
     * SCC XML (sccXml).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, NONE
     *
     * @param scte35Esam Use this setting only when you specify SCTE-35 markers
     *            from ESAM. Choose INSERT to put SCTE-35 markers in this output
     *            at the insertion points that you specify in an ESAM XML
     *            document. Provide the document in the setting SCC XML
     *            (sccXml).
     * @see MpdScte35Esam
     */
    public void setScte35Esam(MpdScte35Esam scte35Esam) {
        this.scte35Esam = scte35Esam.toString();
    }

    /**
     * Use this setting only when you specify SCTE-35 markers from ESAM. Choose
     * INSERT to put SCTE-35 markers in this output at the insertion points that
     * you specify in an ESAM XML document. Provide the document in the setting
     * SCC XML (sccXml).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, NONE
     *
     * @param scte35Esam Use this setting only when you specify SCTE-35 markers
     *            from ESAM. Choose INSERT to put SCTE-35 markers in this output
     *            at the insertion points that you specify in an ESAM XML
     *            document. Provide the document in the setting SCC XML
     *            (sccXml).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MpdScte35Esam
     */
    public MpdSettings withScte35Esam(MpdScte35Esam scte35Esam) {
        this.scte35Esam = scte35Esam.toString();
        return this;
    }

    /**
     * Ignore this setting unless you have SCTE-35 markers in your input video
     * file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that
     * appear in your input to also appear in this output. Choose None (NONE) if
     * you don't want those SCTE-35 markers in this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     *
     * @return Ignore this setting unless you have SCTE-35 markers in your input
     *         video file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35
     *         markers that appear in your input to also appear in this output.
     *         Choose None (NONE) if you don't want those SCTE-35 markers in
     *         this output.
     * @see MpdScte35Source
     */
    public String getScte35Source() {
        return scte35Source;
    }

    /**
     * Ignore this setting unless you have SCTE-35 markers in your input video
     * file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that
     * appear in your input to also appear in this output. Choose None (NONE) if
     * you don't want those SCTE-35 markers in this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     *
     * @param scte35Source Ignore this setting unless you have SCTE-35 markers
     *            in your input video file. Choose Passthrough (PASSTHROUGH) if
     *            you want SCTE-35 markers that appear in your input to also
     *            appear in this output. Choose None (NONE) if you don't want
     *            those SCTE-35 markers in this output.
     * @see MpdScte35Source
     */
    public void setScte35Source(String scte35Source) {
        this.scte35Source = scte35Source;
    }

    /**
     * Ignore this setting unless you have SCTE-35 markers in your input video
     * file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that
     * appear in your input to also appear in this output. Choose None (NONE) if
     * you don't want those SCTE-35 markers in this output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     *
     * @param scte35Source Ignore this setting unless you have SCTE-35 markers
     *            in your input video file. Choose Passthrough (PASSTHROUGH) if
     *            you want SCTE-35 markers that appear in your input to also
     *            appear in this output. Choose None (NONE) if you don't want
     *            those SCTE-35 markers in this output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MpdScte35Source
     */
    public MpdSettings withScte35Source(String scte35Source) {
        this.scte35Source = scte35Source;
        return this;
    }

    /**
     * Ignore this setting unless you have SCTE-35 markers in your input video
     * file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that
     * appear in your input to also appear in this output. Choose None (NONE) if
     * you don't want those SCTE-35 markers in this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     *
     * @param scte35Source Ignore this setting unless you have SCTE-35 markers
     *            in your input video file. Choose Passthrough (PASSTHROUGH) if
     *            you want SCTE-35 markers that appear in your input to also
     *            appear in this output. Choose None (NONE) if you don't want
     *            those SCTE-35 markers in this output.
     * @see MpdScte35Source
     */
    public void setScte35Source(MpdScte35Source scte35Source) {
        this.scte35Source = scte35Source.toString();
    }

    /**
     * Ignore this setting unless you have SCTE-35 markers in your input video
     * file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that
     * appear in your input to also appear in this output. Choose None (NONE) if
     * you don't want those SCTE-35 markers in this output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     *
     * @param scte35Source Ignore this setting unless you have SCTE-35 markers
     *            in your input video file. Choose Passthrough (PASSTHROUGH) if
     *            you want SCTE-35 markers that appear in your input to also
     *            appear in this output. Choose None (NONE) if you don't want
     *            those SCTE-35 markers in this output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MpdScte35Source
     */
    public MpdSettings withScte35Source(MpdScte35Source scte35Source) {
        this.scte35Source = scte35Source.toString();
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
        if (getCaptionContainerType() != null)
            sb.append("CaptionContainerType: " + getCaptionContainerType() + ",");
        if (getScte35Esam() != null)
            sb.append("Scte35Esam: " + getScte35Esam() + ",");
        if (getScte35Source() != null)
            sb.append("Scte35Source: " + getScte35Source());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCaptionContainerType() == null) ? 0 : getCaptionContainerType().hashCode());
        hashCode = prime * hashCode + ((getScte35Esam() == null) ? 0 : getScte35Esam().hashCode());
        hashCode = prime * hashCode
                + ((getScte35Source() == null) ? 0 : getScte35Source().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MpdSettings == false)
            return false;
        MpdSettings other = (MpdSettings) obj;

        if (other.getCaptionContainerType() == null ^ this.getCaptionContainerType() == null)
            return false;
        if (other.getCaptionContainerType() != null
                && other.getCaptionContainerType().equals(this.getCaptionContainerType()) == false)
            return false;
        if (other.getScte35Esam() == null ^ this.getScte35Esam() == null)
            return false;
        if (other.getScte35Esam() != null
                && other.getScte35Esam().equals(this.getScte35Esam()) == false)
            return false;
        if (other.getScte35Source() == null ^ this.getScte35Source() == null)
            return false;
        if (other.getScte35Source() != null
                && other.getScte35Source().equals(this.getScte35Source()) == false)
            return false;
        return true;
    }
}
