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
 * Settings for MP4 container. You can create audio-only AAC outputs with this
 * container.
 */
public class Mp4Settings implements Serializable {
    /**
     * When enabled, file composition times will start at zero, composition
     * times in the 'ctts' (composition time to sample) box for B-frames will be
     * negative, and a 'cslg' (composition shift least greatest) box will be
     * included per 14496-1 amendment 1. This improves compatibility with Apple
     * players and tools.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     */
    private String cslgAtom;

    /**
     * Ignore this setting unless compliance to the CTTS box version
     * specification matters in your workflow. Specify a value of 1 to set your
     * CTTS box version to 1 and make your output compliant with the
     * specification. When you specify a value of 1, you must also set CSLG atom
     * (cslgAtom) to the value INCLUDE. Keep the default value 0 to set your
     * CTTS box version to 0. This can provide backward compatibility for some
     * players and packagers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     */
    private Integer cttsVersion;

    /**
     * Inserts a free-space box immediately after the moov box.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     */
    private String freeSpaceBox;

    /**
     * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the
     * beginning of the archive as required for progressive downloading.
     * Otherwise it is placed normally at the end.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROGRESSIVE_DOWNLOAD, NORMAL
     */
    private String moovPlacement;

    /**
     * Overrides the "Major Brand" field in the output file. Usually not
     * necessary to specify.
     */
    private String mp4MajorBrand;

    /**
     * When enabled, file composition times will start at zero, composition
     * times in the 'ctts' (composition time to sample) box for B-frames will be
     * negative, and a 'cslg' (composition shift least greatest) box will be
     * included per 14496-1 amendment 1. This improves compatibility with Apple
     * players and tools.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @return When enabled, file composition times will start at zero,
     *         composition times in the 'ctts' (composition time to sample) box
     *         for B-frames will be negative, and a 'cslg' (composition shift
     *         least greatest) box will be included per 14496-1 amendment 1.
     *         This improves compatibility with Apple players and tools.
     * @see Mp4CslgAtom
     */
    public String getCslgAtom() {
        return cslgAtom;
    }

    /**
     * When enabled, file composition times will start at zero, composition
     * times in the 'ctts' (composition time to sample) box for B-frames will be
     * negative, and a 'cslg' (composition shift least greatest) box will be
     * included per 14496-1 amendment 1. This improves compatibility with Apple
     * players and tools.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param cslgAtom When enabled, file composition times will start at zero,
     *            composition times in the 'ctts' (composition time to sample)
     *            box for B-frames will be negative, and a 'cslg' (composition
     *            shift least greatest) box will be included per 14496-1
     *            amendment 1. This improves compatibility with Apple players
     *            and tools.
     * @see Mp4CslgAtom
     */
    public void setCslgAtom(String cslgAtom) {
        this.cslgAtom = cslgAtom;
    }

    /**
     * When enabled, file composition times will start at zero, composition
     * times in the 'ctts' (composition time to sample) box for B-frames will be
     * negative, and a 'cslg' (composition shift least greatest) box will be
     * included per 14496-1 amendment 1. This improves compatibility with Apple
     * players and tools.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param cslgAtom When enabled, file composition times will start at zero,
     *            composition times in the 'ctts' (composition time to sample)
     *            box for B-frames will be negative, and a 'cslg' (composition
     *            shift least greatest) box will be included per 14496-1
     *            amendment 1. This improves compatibility with Apple players
     *            and tools.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mp4CslgAtom
     */
    public Mp4Settings withCslgAtom(String cslgAtom) {
        this.cslgAtom = cslgAtom;
        return this;
    }

    /**
     * When enabled, file composition times will start at zero, composition
     * times in the 'ctts' (composition time to sample) box for B-frames will be
     * negative, and a 'cslg' (composition shift least greatest) box will be
     * included per 14496-1 amendment 1. This improves compatibility with Apple
     * players and tools.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param cslgAtom When enabled, file composition times will start at zero,
     *            composition times in the 'ctts' (composition time to sample)
     *            box for B-frames will be negative, and a 'cslg' (composition
     *            shift least greatest) box will be included per 14496-1
     *            amendment 1. This improves compatibility with Apple players
     *            and tools.
     * @see Mp4CslgAtom
     */
    public void setCslgAtom(Mp4CslgAtom cslgAtom) {
        this.cslgAtom = cslgAtom.toString();
    }

    /**
     * When enabled, file composition times will start at zero, composition
     * times in the 'ctts' (composition time to sample) box for B-frames will be
     * negative, and a 'cslg' (composition shift least greatest) box will be
     * included per 14496-1 amendment 1. This improves compatibility with Apple
     * players and tools.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param cslgAtom When enabled, file composition times will start at zero,
     *            composition times in the 'ctts' (composition time to sample)
     *            box for B-frames will be negative, and a 'cslg' (composition
     *            shift least greatest) box will be included per 14496-1
     *            amendment 1. This improves compatibility with Apple players
     *            and tools.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mp4CslgAtom
     */
    public Mp4Settings withCslgAtom(Mp4CslgAtom cslgAtom) {
        this.cslgAtom = cslgAtom.toString();
        return this;
    }

    /**
     * Ignore this setting unless compliance to the CTTS box version
     * specification matters in your workflow. Specify a value of 1 to set your
     * CTTS box version to 1 and make your output compliant with the
     * specification. When you specify a value of 1, you must also set CSLG atom
     * (cslgAtom) to the value INCLUDE. Keep the default value 0 to set your
     * CTTS box version to 0. This can provide backward compatibility for some
     * players and packagers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @return Ignore this setting unless compliance to the CTTS box version
     *         specification matters in your workflow. Specify a value of 1 to
     *         set your CTTS box version to 1 and make your output compliant
     *         with the specification. When you specify a value of 1, you must
     *         also set CSLG atom (cslgAtom) to the value INCLUDE. Keep the
     *         default value 0 to set your CTTS box version to 0. This can
     *         provide backward compatibility for some players and packagers.
     */
    public Integer getCttsVersion() {
        return cttsVersion;
    }

    /**
     * Ignore this setting unless compliance to the CTTS box version
     * specification matters in your workflow. Specify a value of 1 to set your
     * CTTS box version to 1 and make your output compliant with the
     * specification. When you specify a value of 1, you must also set CSLG atom
     * (cslgAtom) to the value INCLUDE. Keep the default value 0 to set your
     * CTTS box version to 0. This can provide backward compatibility for some
     * players and packagers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param cttsVersion Ignore this setting unless compliance to the CTTS box
     *            version specification matters in your workflow. Specify a
     *            value of 1 to set your CTTS box version to 1 and make your
     *            output compliant with the specification. When you specify a
     *            value of 1, you must also set CSLG atom (cslgAtom) to the
     *            value INCLUDE. Keep the default value 0 to set your CTTS box
     *            version to 0. This can provide backward compatibility for some
     *            players and packagers.
     */
    public void setCttsVersion(Integer cttsVersion) {
        this.cttsVersion = cttsVersion;
    }

    /**
     * Ignore this setting unless compliance to the CTTS box version
     * specification matters in your workflow. Specify a value of 1 to set your
     * CTTS box version to 1 and make your output compliant with the
     * specification. When you specify a value of 1, you must also set CSLG atom
     * (cslgAtom) to the value INCLUDE. Keep the default value 0 to set your
     * CTTS box version to 0. This can provide backward compatibility for some
     * players and packagers.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param cttsVersion Ignore this setting unless compliance to the CTTS box
     *            version specification matters in your workflow. Specify a
     *            value of 1 to set your CTTS box version to 1 and make your
     *            output compliant with the specification. When you specify a
     *            value of 1, you must also set CSLG atom (cslgAtom) to the
     *            value INCLUDE. Keep the default value 0 to set your CTTS box
     *            version to 0. This can provide backward compatibility for some
     *            players and packagers.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mp4Settings withCttsVersion(Integer cttsVersion) {
        this.cttsVersion = cttsVersion;
        return this;
    }

    /**
     * Inserts a free-space box immediately after the moov box.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @return Inserts a free-space box immediately after the moov box.
     * @see Mp4FreeSpaceBox
     */
    public String getFreeSpaceBox() {
        return freeSpaceBox;
    }

    /**
     * Inserts a free-space box immediately after the moov box.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param freeSpaceBox Inserts a free-space box immediately after the moov
     *            box.
     * @see Mp4FreeSpaceBox
     */
    public void setFreeSpaceBox(String freeSpaceBox) {
        this.freeSpaceBox = freeSpaceBox;
    }

    /**
     * Inserts a free-space box immediately after the moov box.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param freeSpaceBox Inserts a free-space box immediately after the moov
     *            box.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mp4FreeSpaceBox
     */
    public Mp4Settings withFreeSpaceBox(String freeSpaceBox) {
        this.freeSpaceBox = freeSpaceBox;
        return this;
    }

    /**
     * Inserts a free-space box immediately after the moov box.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param freeSpaceBox Inserts a free-space box immediately after the moov
     *            box.
     * @see Mp4FreeSpaceBox
     */
    public void setFreeSpaceBox(Mp4FreeSpaceBox freeSpaceBox) {
        this.freeSpaceBox = freeSpaceBox.toString();
    }

    /**
     * Inserts a free-space box immediately after the moov box.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param freeSpaceBox Inserts a free-space box immediately after the moov
     *            box.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mp4FreeSpaceBox
     */
    public Mp4Settings withFreeSpaceBox(Mp4FreeSpaceBox freeSpaceBox) {
        this.freeSpaceBox = freeSpaceBox.toString();
        return this;
    }

    /**
     * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the
     * beginning of the archive as required for progressive downloading.
     * Otherwise it is placed normally at the end.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROGRESSIVE_DOWNLOAD, NORMAL
     *
     * @return If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the
     *         beginning of the archive as required for progressive downloading.
     *         Otherwise it is placed normally at the end.
     * @see Mp4MoovPlacement
     */
    public String getMoovPlacement() {
        return moovPlacement;
    }

    /**
     * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the
     * beginning of the archive as required for progressive downloading.
     * Otherwise it is placed normally at the end.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROGRESSIVE_DOWNLOAD, NORMAL
     *
     * @param moovPlacement If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is
     *            relocated to the beginning of the archive as required for
     *            progressive downloading. Otherwise it is placed normally at
     *            the end.
     * @see Mp4MoovPlacement
     */
    public void setMoovPlacement(String moovPlacement) {
        this.moovPlacement = moovPlacement;
    }

    /**
     * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the
     * beginning of the archive as required for progressive downloading.
     * Otherwise it is placed normally at the end.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROGRESSIVE_DOWNLOAD, NORMAL
     *
     * @param moovPlacement If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is
     *            relocated to the beginning of the archive as required for
     *            progressive downloading. Otherwise it is placed normally at
     *            the end.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mp4MoovPlacement
     */
    public Mp4Settings withMoovPlacement(String moovPlacement) {
        this.moovPlacement = moovPlacement;
        return this;
    }

    /**
     * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the
     * beginning of the archive as required for progressive downloading.
     * Otherwise it is placed normally at the end.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROGRESSIVE_DOWNLOAD, NORMAL
     *
     * @param moovPlacement If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is
     *            relocated to the beginning of the archive as required for
     *            progressive downloading. Otherwise it is placed normally at
     *            the end.
     * @see Mp4MoovPlacement
     */
    public void setMoovPlacement(Mp4MoovPlacement moovPlacement) {
        this.moovPlacement = moovPlacement.toString();
    }

    /**
     * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the
     * beginning of the archive as required for progressive downloading.
     * Otherwise it is placed normally at the end.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROGRESSIVE_DOWNLOAD, NORMAL
     *
     * @param moovPlacement If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is
     *            relocated to the beginning of the archive as required for
     *            progressive downloading. Otherwise it is placed normally at
     *            the end.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mp4MoovPlacement
     */
    public Mp4Settings withMoovPlacement(Mp4MoovPlacement moovPlacement) {
        this.moovPlacement = moovPlacement.toString();
        return this;
    }

    /**
     * Overrides the "Major Brand" field in the output file. Usually not
     * necessary to specify.
     *
     * @return Overrides the "Major Brand" field in the output file. Usually not
     *         necessary to specify.
     */
    public String getMp4MajorBrand() {
        return mp4MajorBrand;
    }

    /**
     * Overrides the "Major Brand" field in the output file. Usually not
     * necessary to specify.
     *
     * @param mp4MajorBrand Overrides the "Major Brand" field in the output
     *            file. Usually not necessary to specify.
     */
    public void setMp4MajorBrand(String mp4MajorBrand) {
        this.mp4MajorBrand = mp4MajorBrand;
    }

    /**
     * Overrides the "Major Brand" field in the output file. Usually not
     * necessary to specify.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mp4MajorBrand Overrides the "Major Brand" field in the output
     *            file. Usually not necessary to specify.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mp4Settings withMp4MajorBrand(String mp4MajorBrand) {
        this.mp4MajorBrand = mp4MajorBrand;
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
        if (getCslgAtom() != null)
            sb.append("CslgAtom: " + getCslgAtom() + ",");
        if (getCttsVersion() != null)
            sb.append("CttsVersion: " + getCttsVersion() + ",");
        if (getFreeSpaceBox() != null)
            sb.append("FreeSpaceBox: " + getFreeSpaceBox() + ",");
        if (getMoovPlacement() != null)
            sb.append("MoovPlacement: " + getMoovPlacement() + ",");
        if (getMp4MajorBrand() != null)
            sb.append("Mp4MajorBrand: " + getMp4MajorBrand());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCslgAtom() == null) ? 0 : getCslgAtom().hashCode());
        hashCode = prime * hashCode
                + ((getCttsVersion() == null) ? 0 : getCttsVersion().hashCode());
        hashCode = prime * hashCode
                + ((getFreeSpaceBox() == null) ? 0 : getFreeSpaceBox().hashCode());
        hashCode = prime * hashCode
                + ((getMoovPlacement() == null) ? 0 : getMoovPlacement().hashCode());
        hashCode = prime * hashCode
                + ((getMp4MajorBrand() == null) ? 0 : getMp4MajorBrand().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Mp4Settings == false)
            return false;
        Mp4Settings other = (Mp4Settings) obj;

        if (other.getCslgAtom() == null ^ this.getCslgAtom() == null)
            return false;
        if (other.getCslgAtom() != null && other.getCslgAtom().equals(this.getCslgAtom()) == false)
            return false;
        if (other.getCttsVersion() == null ^ this.getCttsVersion() == null)
            return false;
        if (other.getCttsVersion() != null
                && other.getCttsVersion().equals(this.getCttsVersion()) == false)
            return false;
        if (other.getFreeSpaceBox() == null ^ this.getFreeSpaceBox() == null)
            return false;
        if (other.getFreeSpaceBox() != null
                && other.getFreeSpaceBox().equals(this.getFreeSpaceBox()) == false)
            return false;
        if (other.getMoovPlacement() == null ^ this.getMoovPlacement() == null)
            return false;
        if (other.getMoovPlacement() != null
                && other.getMoovPlacement().equals(this.getMoovPlacement()) == false)
            return false;
        if (other.getMp4MajorBrand() == null ^ this.getMp4MajorBrand() == null)
            return false;
        if (other.getMp4MajorBrand() != null
                && other.getMp4MajorBrand().equals(this.getMp4MajorBrand()) == false)
            return false;
        return true;
    }
}
