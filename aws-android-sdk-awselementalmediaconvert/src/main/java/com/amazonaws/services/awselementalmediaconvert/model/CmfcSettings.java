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
 * Settings for MP4 segments in CMAF
 */
public class CmfcSettings implements Serializable {
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
     * @see CmfcScte35Esam
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
     * @see CmfcScte35Esam
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
     * @see CmfcScte35Esam
     */
    public CmfcSettings withScte35Esam(String scte35Esam) {
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
     * @see CmfcScte35Esam
     */
    public void setScte35Esam(CmfcScte35Esam scte35Esam) {
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
     * @see CmfcScte35Esam
     */
    public CmfcSettings withScte35Esam(CmfcScte35Esam scte35Esam) {
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
     * @see CmfcScte35Source
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
     * @see CmfcScte35Source
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
     * @see CmfcScte35Source
     */
    public CmfcSettings withScte35Source(String scte35Source) {
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
     * @see CmfcScte35Source
     */
    public void setScte35Source(CmfcScte35Source scte35Source) {
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
     * @see CmfcScte35Source
     */
    public CmfcSettings withScte35Source(CmfcScte35Source scte35Source) {
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

        if (obj instanceof CmfcSettings == false)
            return false;
        CmfcSettings other = (CmfcSettings) obj;

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
