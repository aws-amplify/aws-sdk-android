/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

/**
 * <p>
 * Details about the Long-Term Evolution (LTE) network.
 * </p>
 */
public class LteCellDetails implements Serializable {
    /**
     * <p>
     * The E-UTRAN Cell Identifier (ECI).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 268435455<br/>
     */
    private Integer cellId;

    /**
     * <p>
     * The Mobile Country Code (MCC).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>200 - 999<br/>
     */
    private Integer mcc;

    /**
     * <p>
     * The Mobile Network Code (MNC)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 999<br/>
     */
    private Integer mnc;

    /**
     * <p>
     * The LTE local identification information (local ID).
     * </p>
     */
    private LteLocalId localId;

    /**
     * <p>
     * The network measurements.
     * </p>
     */
    private java.util.List<LteNetworkMeasurements> networkMeasurements;

    /**
     * <p>
     * Timing Advance (TA).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1282<br/>
     */
    private Integer timingAdvance;

    /**
     * <p>
     * Indicates whether the LTE object is capable of supporting NR (new radio).
     * </p>
     */
    private Boolean nrCapable;

    /**
     * <p>
     * Signal power of the reference signal received, measured in
     * decibel-milliwatts (dBm).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-140 - -44<br/>
     */
    private Integer rsrp;

    /**
     * <p>
     * Signal quality of the reference Signal received, measured in decibels
     * (dB).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-19.5 - -3.0<br/>
     */
    private Float rsrq;

    /**
     * <p>
     * LTE Tracking Area Code (TAC).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     */
    private Integer tac;

    /**
     * <p>
     * The E-UTRAN Cell Identifier (ECI).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 268435455<br/>
     *
     * @return <p>
     *         The E-UTRAN Cell Identifier (ECI).
     *         </p>
     */
    public Integer getCellId() {
        return cellId;
    }

    /**
     * <p>
     * The E-UTRAN Cell Identifier (ECI).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 268435455<br/>
     *
     * @param cellId <p>
     *            The E-UTRAN Cell Identifier (ECI).
     *            </p>
     */
    public void setCellId(Integer cellId) {
        this.cellId = cellId;
    }

    /**
     * <p>
     * The E-UTRAN Cell Identifier (ECI).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 268435455<br/>
     *
     * @param cellId <p>
     *            The E-UTRAN Cell Identifier (ECI).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LteCellDetails withCellId(Integer cellId) {
        this.cellId = cellId;
        return this;
    }

    /**
     * <p>
     * The Mobile Country Code (MCC).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>200 - 999<br/>
     *
     * @return <p>
     *         The Mobile Country Code (MCC).
     *         </p>
     */
    public Integer getMcc() {
        return mcc;
    }

    /**
     * <p>
     * The Mobile Country Code (MCC).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>200 - 999<br/>
     *
     * @param mcc <p>
     *            The Mobile Country Code (MCC).
     *            </p>
     */
    public void setMcc(Integer mcc) {
        this.mcc = mcc;
    }

    /**
     * <p>
     * The Mobile Country Code (MCC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>200 - 999<br/>
     *
     * @param mcc <p>
     *            The Mobile Country Code (MCC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LteCellDetails withMcc(Integer mcc) {
        this.mcc = mcc;
        return this;
    }

    /**
     * <p>
     * The Mobile Network Code (MNC)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 999<br/>
     *
     * @return <p>
     *         The Mobile Network Code (MNC)
     *         </p>
     */
    public Integer getMnc() {
        return mnc;
    }

    /**
     * <p>
     * The Mobile Network Code (MNC)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 999<br/>
     *
     * @param mnc <p>
     *            The Mobile Network Code (MNC)
     *            </p>
     */
    public void setMnc(Integer mnc) {
        this.mnc = mnc;
    }

    /**
     * <p>
     * The Mobile Network Code (MNC)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 999<br/>
     *
     * @param mnc <p>
     *            The Mobile Network Code (MNC)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LteCellDetails withMnc(Integer mnc) {
        this.mnc = mnc;
        return this;
    }

    /**
     * <p>
     * The LTE local identification information (local ID).
     * </p>
     *
     * @return <p>
     *         The LTE local identification information (local ID).
     *         </p>
     */
    public LteLocalId getLocalId() {
        return localId;
    }

    /**
     * <p>
     * The LTE local identification information (local ID).
     * </p>
     *
     * @param localId <p>
     *            The LTE local identification information (local ID).
     *            </p>
     */
    public void setLocalId(LteLocalId localId) {
        this.localId = localId;
    }

    /**
     * <p>
     * The LTE local identification information (local ID).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localId <p>
     *            The LTE local identification information (local ID).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LteCellDetails withLocalId(LteLocalId localId) {
        this.localId = localId;
        return this;
    }

    /**
     * <p>
     * The network measurements.
     * </p>
     *
     * @return <p>
     *         The network measurements.
     *         </p>
     */
    public java.util.List<LteNetworkMeasurements> getNetworkMeasurements() {
        return networkMeasurements;
    }

    /**
     * <p>
     * The network measurements.
     * </p>
     *
     * @param networkMeasurements <p>
     *            The network measurements.
     *            </p>
     */
    public void setNetworkMeasurements(
            java.util.Collection<LteNetworkMeasurements> networkMeasurements) {
        if (networkMeasurements == null) {
            this.networkMeasurements = null;
            return;
        }

        this.networkMeasurements = new java.util.ArrayList<LteNetworkMeasurements>(
                networkMeasurements);
    }

    /**
     * <p>
     * The network measurements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkMeasurements <p>
     *            The network measurements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LteCellDetails withNetworkMeasurements(LteNetworkMeasurements... networkMeasurements) {
        if (getNetworkMeasurements() == null) {
            this.networkMeasurements = new java.util.ArrayList<LteNetworkMeasurements>(
                    networkMeasurements.length);
        }
        for (LteNetworkMeasurements value : networkMeasurements) {
            this.networkMeasurements.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The network measurements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkMeasurements <p>
     *            The network measurements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LteCellDetails withNetworkMeasurements(
            java.util.Collection<LteNetworkMeasurements> networkMeasurements) {
        setNetworkMeasurements(networkMeasurements);
        return this;
    }

    /**
     * <p>
     * Timing Advance (TA).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1282<br/>
     *
     * @return <p>
     *         Timing Advance (TA).
     *         </p>
     */
    public Integer getTimingAdvance() {
        return timingAdvance;
    }

    /**
     * <p>
     * Timing Advance (TA).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1282<br/>
     *
     * @param timingAdvance <p>
     *            Timing Advance (TA).
     *            </p>
     */
    public void setTimingAdvance(Integer timingAdvance) {
        this.timingAdvance = timingAdvance;
    }

    /**
     * <p>
     * Timing Advance (TA).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1282<br/>
     *
     * @param timingAdvance <p>
     *            Timing Advance (TA).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LteCellDetails withTimingAdvance(Integer timingAdvance) {
        this.timingAdvance = timingAdvance;
        return this;
    }

    /**
     * <p>
     * Indicates whether the LTE object is capable of supporting NR (new radio).
     * </p>
     *
     * @return <p>
     *         Indicates whether the LTE object is capable of supporting NR (new
     *         radio).
     *         </p>
     */
    public Boolean isNrCapable() {
        return nrCapable;
    }

    /**
     * <p>
     * Indicates whether the LTE object is capable of supporting NR (new radio).
     * </p>
     *
     * @return <p>
     *         Indicates whether the LTE object is capable of supporting NR (new
     *         radio).
     *         </p>
     */
    public Boolean getNrCapable() {
        return nrCapable;
    }

    /**
     * <p>
     * Indicates whether the LTE object is capable of supporting NR (new radio).
     * </p>
     *
     * @param nrCapable <p>
     *            Indicates whether the LTE object is capable of supporting NR
     *            (new radio).
     *            </p>
     */
    public void setNrCapable(Boolean nrCapable) {
        this.nrCapable = nrCapable;
    }

    /**
     * <p>
     * Indicates whether the LTE object is capable of supporting NR (new radio).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nrCapable <p>
     *            Indicates whether the LTE object is capable of supporting NR
     *            (new radio).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LteCellDetails withNrCapable(Boolean nrCapable) {
        this.nrCapable = nrCapable;
        return this;
    }

    /**
     * <p>
     * Signal power of the reference signal received, measured in
     * decibel-milliwatts (dBm).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-140 - -44<br/>
     *
     * @return <p>
     *         Signal power of the reference signal received, measured in
     *         decibel-milliwatts (dBm).
     *         </p>
     */
    public Integer getRsrp() {
        return rsrp;
    }

    /**
     * <p>
     * Signal power of the reference signal received, measured in
     * decibel-milliwatts (dBm).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-140 - -44<br/>
     *
     * @param rsrp <p>
     *            Signal power of the reference signal received, measured in
     *            decibel-milliwatts (dBm).
     *            </p>
     */
    public void setRsrp(Integer rsrp) {
        this.rsrp = rsrp;
    }

    /**
     * <p>
     * Signal power of the reference signal received, measured in
     * decibel-milliwatts (dBm).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-140 - -44<br/>
     *
     * @param rsrp <p>
     *            Signal power of the reference signal received, measured in
     *            decibel-milliwatts (dBm).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LteCellDetails withRsrp(Integer rsrp) {
        this.rsrp = rsrp;
        return this;
    }

    /**
     * <p>
     * Signal quality of the reference Signal received, measured in decibels
     * (dB).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-19.5 - -3.0<br/>
     *
     * @return <p>
     *         Signal quality of the reference Signal received, measured in
     *         decibels (dB).
     *         </p>
     */
    public Float getRsrq() {
        return rsrq;
    }

    /**
     * <p>
     * Signal quality of the reference Signal received, measured in decibels
     * (dB).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-19.5 - -3.0<br/>
     *
     * @param rsrq <p>
     *            Signal quality of the reference Signal received, measured in
     *            decibels (dB).
     *            </p>
     */
    public void setRsrq(Float rsrq) {
        this.rsrq = rsrq;
    }

    /**
     * <p>
     * Signal quality of the reference Signal received, measured in decibels
     * (dB).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-19.5 - -3.0<br/>
     *
     * @param rsrq <p>
     *            Signal quality of the reference Signal received, measured in
     *            decibels (dB).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LteCellDetails withRsrq(Float rsrq) {
        this.rsrq = rsrq;
        return this;
    }

    /**
     * <p>
     * LTE Tracking Area Code (TAC).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @return <p>
     *         LTE Tracking Area Code (TAC).
     *         </p>
     */
    public Integer getTac() {
        return tac;
    }

    /**
     * <p>
     * LTE Tracking Area Code (TAC).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param tac <p>
     *            LTE Tracking Area Code (TAC).
     *            </p>
     */
    public void setTac(Integer tac) {
        this.tac = tac;
    }

    /**
     * <p>
     * LTE Tracking Area Code (TAC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param tac <p>
     *            LTE Tracking Area Code (TAC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LteCellDetails withTac(Integer tac) {
        this.tac = tac;
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
        if (getCellId() != null)
            sb.append("CellId: " + getCellId() + ",");
        if (getMcc() != null)
            sb.append("Mcc: " + getMcc() + ",");
        if (getMnc() != null)
            sb.append("Mnc: " + getMnc() + ",");
        if (getLocalId() != null)
            sb.append("LocalId: " + getLocalId() + ",");
        if (getNetworkMeasurements() != null)
            sb.append("NetworkMeasurements: " + getNetworkMeasurements() + ",");
        if (getTimingAdvance() != null)
            sb.append("TimingAdvance: " + getTimingAdvance() + ",");
        if (getNrCapable() != null)
            sb.append("NrCapable: " + getNrCapable() + ",");
        if (getRsrp() != null)
            sb.append("Rsrp: " + getRsrp() + ",");
        if (getRsrq() != null)
            sb.append("Rsrq: " + getRsrq() + ",");
        if (getTac() != null)
            sb.append("Tac: " + getTac());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCellId() == null) ? 0 : getCellId().hashCode());
        hashCode = prime * hashCode + ((getMcc() == null) ? 0 : getMcc().hashCode());
        hashCode = prime * hashCode + ((getMnc() == null) ? 0 : getMnc().hashCode());
        hashCode = prime * hashCode + ((getLocalId() == null) ? 0 : getLocalId().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkMeasurements() == null) ? 0 : getNetworkMeasurements().hashCode());
        hashCode = prime * hashCode
                + ((getTimingAdvance() == null) ? 0 : getTimingAdvance().hashCode());
        hashCode = prime * hashCode + ((getNrCapable() == null) ? 0 : getNrCapable().hashCode());
        hashCode = prime * hashCode + ((getRsrp() == null) ? 0 : getRsrp().hashCode());
        hashCode = prime * hashCode + ((getRsrq() == null) ? 0 : getRsrq().hashCode());
        hashCode = prime * hashCode + ((getTac() == null) ? 0 : getTac().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LteCellDetails == false)
            return false;
        LteCellDetails other = (LteCellDetails) obj;

        if (other.getCellId() == null ^ this.getCellId() == null)
            return false;
        if (other.getCellId() != null && other.getCellId().equals(this.getCellId()) == false)
            return false;
        if (other.getMcc() == null ^ this.getMcc() == null)
            return false;
        if (other.getMcc() != null && other.getMcc().equals(this.getMcc()) == false)
            return false;
        if (other.getMnc() == null ^ this.getMnc() == null)
            return false;
        if (other.getMnc() != null && other.getMnc().equals(this.getMnc()) == false)
            return false;
        if (other.getLocalId() == null ^ this.getLocalId() == null)
            return false;
        if (other.getLocalId() != null && other.getLocalId().equals(this.getLocalId()) == false)
            return false;
        if (other.getNetworkMeasurements() == null ^ this.getNetworkMeasurements() == null)
            return false;
        if (other.getNetworkMeasurements() != null
                && other.getNetworkMeasurements().equals(this.getNetworkMeasurements()) == false)
            return false;
        if (other.getTimingAdvance() == null ^ this.getTimingAdvance() == null)
            return false;
        if (other.getTimingAdvance() != null
                && other.getTimingAdvance().equals(this.getTimingAdvance()) == false)
            return false;
        if (other.getNrCapable() == null ^ this.getNrCapable() == null)
            return false;
        if (other.getNrCapable() != null
                && other.getNrCapable().equals(this.getNrCapable()) == false)
            return false;
        if (other.getRsrp() == null ^ this.getRsrp() == null)
            return false;
        if (other.getRsrp() != null && other.getRsrp().equals(this.getRsrp()) == false)
            return false;
        if (other.getRsrq() == null ^ this.getRsrq() == null)
            return false;
        if (other.getRsrq() != null && other.getRsrq().equals(this.getRsrq()) == false)
            return false;
        if (other.getTac() == null ^ this.getTac() == null)
            return false;
        if (other.getTac() != null && other.getTac().equals(this.getTac()) == false)
            return false;
        return true;
    }
}
