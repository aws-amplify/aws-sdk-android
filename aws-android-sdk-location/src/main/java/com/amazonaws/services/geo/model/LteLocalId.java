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
 * LTE local identification information (local ID).
 * </p>
 */
public class LteLocalId implements Serializable {
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
     * Physical Cell ID (PCI).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 503<br/>
     */
    private Integer pci;

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
    public LteLocalId withEarfcn(Integer earfcn) {
        this.earfcn = earfcn;
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
    public LteLocalId withPci(Integer pci) {
        this.pci = pci;
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
        if (getPci() != null)
            sb.append("Pci: " + getPci());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEarfcn() == null) ? 0 : getEarfcn().hashCode());
        hashCode = prime * hashCode + ((getPci() == null) ? 0 : getPci().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LteLocalId == false)
            return false;
        LteLocalId other = (LteLocalId) obj;

        if (other.getEarfcn() == null ^ this.getEarfcn() == null)
            return false;
        if (other.getEarfcn() != null && other.getEarfcn().equals(this.getEarfcn()) == false)
            return false;
        if (other.getPci() == null ^ this.getPci() == null)
            return false;
        if (other.getPci() != null && other.getPci().equals(this.getPci()) == false)
            return false;
        return true;
    }
}
