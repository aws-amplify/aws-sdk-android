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
 * LTE network measurements.
 * </p>
 */
public class LteNetworkMeasurements implements Serializable {
    /**
     * <p>
     * E-UTRA (Evolved Universal Terrestrial Radio Access) absolute radio
     * frequency channel number (EARFCN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 262143<br/>
     */
    private Integer earfcn;

    /**
     * <p>
     * E-UTRAN Cell Identifier (ECI).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 268435455<br/>
     */
    private Integer cellId;

    /**
     * <p>
     * Physical Cell ID (PCI).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 503<br/>
     */
    private Integer pci;

    /**
     * <p>
     * Signal power of the reference signal received, measured in dBm
     * (decibel-milliwatts).
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
     * E-UTRA (Evolved Universal Terrestrial Radio Access) absolute radio
     * frequency channel number (EARFCN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 262143<br/>
     *
     * @return <p>
     *         E-UTRA (Evolved Universal Terrestrial Radio Access) absolute
     *         radio frequency channel number (EARFCN).
     *         </p>
     */
    public Integer getEarfcn() {
        return earfcn;
    }

    /**
     * <p>
     * E-UTRA (Evolved Universal Terrestrial Radio Access) absolute radio
     * frequency channel number (EARFCN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 262143<br/>
     *
     * @param earfcn <p>
     *            E-UTRA (Evolved Universal Terrestrial Radio Access) absolute
     *            radio frequency channel number (EARFCN).
     *            </p>
     */
    public void setEarfcn(Integer earfcn) {
        this.earfcn = earfcn;
    }

    /**
     * <p>
     * E-UTRA (Evolved Universal Terrestrial Radio Access) absolute radio
     * frequency channel number (EARFCN).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 262143<br/>
     *
     * @param earfcn <p>
     *            E-UTRA (Evolved Universal Terrestrial Radio Access) absolute
     *            radio frequency channel number (EARFCN).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LteNetworkMeasurements withEarfcn(Integer earfcn) {
        this.earfcn = earfcn;
        return this;
    }

    /**
     * <p>
     * E-UTRAN Cell Identifier (ECI).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 268435455<br/>
     *
     * @return <p>
     *         E-UTRAN Cell Identifier (ECI).
     *         </p>
     */
    public Integer getCellId() {
        return cellId;
    }

    /**
     * <p>
     * E-UTRAN Cell Identifier (ECI).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 268435455<br/>
     *
     * @param cellId <p>
     *            E-UTRAN Cell Identifier (ECI).
     *            </p>
     */
    public void setCellId(Integer cellId) {
        this.cellId = cellId;
    }

    /**
     * <p>
     * E-UTRAN Cell Identifier (ECI).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 268435455<br/>
     *
     * @param cellId <p>
     *            E-UTRAN Cell Identifier (ECI).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LteNetworkMeasurements withCellId(Integer cellId) {
        this.cellId = cellId;
        return this;
    }

    /**
     * <p>
     * Physical Cell ID (PCI).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 503<br/>
     *
     * @return <p>
     *         Physical Cell ID (PCI).
     *         </p>
     */
    public Integer getPci() {
        return pci;
    }

    /**
     * <p>
     * Physical Cell ID (PCI).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 503<br/>
     *
     * @param pci <p>
     *            Physical Cell ID (PCI).
     *            </p>
     */
    public void setPci(Integer pci) {
        this.pci = pci;
    }

    /**
     * <p>
     * Physical Cell ID (PCI).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 503<br/>
     *
     * @param pci <p>
     *            Physical Cell ID (PCI).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LteNetworkMeasurements withPci(Integer pci) {
        this.pci = pci;
        return this;
    }

    /**
     * <p>
     * Signal power of the reference signal received, measured in dBm
     * (decibel-milliwatts).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-140 - -44<br/>
     *
     * @return <p>
     *         Signal power of the reference signal received, measured in dBm
     *         (decibel-milliwatts).
     *         </p>
     */
    public Integer getRsrp() {
        return rsrp;
    }

    /**
     * <p>
     * Signal power of the reference signal received, measured in dBm
     * (decibel-milliwatts).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-140 - -44<br/>
     *
     * @param rsrp <p>
     *            Signal power of the reference signal received, measured in dBm
     *            (decibel-milliwatts).
     *            </p>
     */
    public void setRsrp(Integer rsrp) {
        this.rsrp = rsrp;
    }

    /**
     * <p>
     * Signal power of the reference signal received, measured in dBm
     * (decibel-milliwatts).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-140 - -44<br/>
     *
     * @param rsrp <p>
     *            Signal power of the reference signal received, measured in dBm
     *            (decibel-milliwatts).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LteNetworkMeasurements withRsrp(Integer rsrp) {
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
    public LteNetworkMeasurements withRsrq(Float rsrq) {
        this.rsrq = rsrq;
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
        if (getEarfcn() != null)
            sb.append("Earfcn: " + getEarfcn() + ",");
        if (getCellId() != null)
            sb.append("CellId: " + getCellId() + ",");
        if (getPci() != null)
            sb.append("Pci: " + getPci() + ",");
        if (getRsrp() != null)
            sb.append("Rsrp: " + getRsrp() + ",");
        if (getRsrq() != null)
            sb.append("Rsrq: " + getRsrq());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEarfcn() == null) ? 0 : getEarfcn().hashCode());
        hashCode = prime * hashCode + ((getCellId() == null) ? 0 : getCellId().hashCode());
        hashCode = prime * hashCode + ((getPci() == null) ? 0 : getPci().hashCode());
        hashCode = prime * hashCode + ((getRsrp() == null) ? 0 : getRsrp().hashCode());
        hashCode = prime * hashCode + ((getRsrq() == null) ? 0 : getRsrq().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LteNetworkMeasurements == false)
            return false;
        LteNetworkMeasurements other = (LteNetworkMeasurements) obj;

        if (other.getEarfcn() == null ^ this.getEarfcn() == null)
            return false;
        if (other.getEarfcn() != null && other.getEarfcn().equals(this.getEarfcn()) == false)
            return false;
        if (other.getCellId() == null ^ this.getCellId() == null)
            return false;
        if (other.getCellId() != null && other.getCellId().equals(this.getCellId()) == false)
            return false;
        if (other.getPci() == null ^ this.getPci() == null)
            return false;
        if (other.getPci() != null && other.getPci().equals(this.getPci()) == false)
            return false;
        if (other.getRsrp() == null ^ this.getRsrp() == null)
            return false;
        if (other.getRsrp() != null && other.getRsrp().equals(this.getRsrp()) == false)
            return false;
        if (other.getRsrq() == null ^ this.getRsrq() == null)
            return false;
        if (other.getRsrq() != null && other.getRsrq().equals(this.getRsrq()) == false)
            return false;
        return true;
    }
}
