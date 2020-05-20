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
 * Packet identifiers map for a given Multiplex program.
 */
public class MultiplexProgramPacketIdentifiersMap implements Serializable {
    /**
     * Placeholder documentation for __listOf__integer
     */
    private java.util.List<Integer> audioPids;

    /**
     * Placeholder documentation for __listOf__integer
     */
    private java.util.List<Integer> dvbSubPids;

    /**
     * Placeholder documentation for __integer
     */
    private Integer dvbTeletextPid;

    /**
     * Placeholder documentation for __integer
     */
    private Integer etvPlatformPid;

    /**
     * Placeholder documentation for __integer
     */
    private Integer etvSignalPid;

    /**
     * Placeholder documentation for __listOf__integer
     */
    private java.util.List<Integer> klvDataPids;

    /**
     * Placeholder documentation for __integer
     */
    private Integer pcrPid;

    /**
     * Placeholder documentation for __integer
     */
    private Integer pmtPid;

    /**
     * Placeholder documentation for __integer
     */
    private Integer privateMetadataPid;

    /**
     * Placeholder documentation for __listOf__integer
     */
    private java.util.List<Integer> scte27Pids;

    /**
     * Placeholder documentation for __integer
     */
    private Integer scte35Pid;

    /**
     * Placeholder documentation for __integer
     */
    private Integer timedMetadataPid;

    /**
     * Placeholder documentation for __integer
     */
    private Integer videoPid;

    /**
     * Placeholder documentation for __listOf__integer
     *
     * @return Placeholder documentation for __listOf__integer
     */
    public java.util.List<Integer> getAudioPids() {
        return audioPids;
    }

    /**
     * Placeholder documentation for __listOf__integer
     *
     * @param audioPids Placeholder documentation for __listOf__integer
     */
    public void setAudioPids(java.util.Collection<Integer> audioPids) {
        if (audioPids == null) {
            this.audioPids = null;
            return;
        }

        this.audioPids = new java.util.ArrayList<Integer>(audioPids);
    }

    /**
     * Placeholder documentation for __listOf__integer
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioPids Placeholder documentation for __listOf__integer
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramPacketIdentifiersMap withAudioPids(Integer... audioPids) {
        if (getAudioPids() == null) {
            this.audioPids = new java.util.ArrayList<Integer>(audioPids.length);
        }
        for (Integer value : audioPids) {
            this.audioPids.add(value);
        }
        return this;
    }

    /**
     * Placeholder documentation for __listOf__integer
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioPids Placeholder documentation for __listOf__integer
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramPacketIdentifiersMap withAudioPids(
            java.util.Collection<Integer> audioPids) {
        setAudioPids(audioPids);
        return this;
    }

    /**
     * Placeholder documentation for __listOf__integer
     *
     * @return Placeholder documentation for __listOf__integer
     */
    public java.util.List<Integer> getDvbSubPids() {
        return dvbSubPids;
    }

    /**
     * Placeholder documentation for __listOf__integer
     *
     * @param dvbSubPids Placeholder documentation for __listOf__integer
     */
    public void setDvbSubPids(java.util.Collection<Integer> dvbSubPids) {
        if (dvbSubPids == null) {
            this.dvbSubPids = null;
            return;
        }

        this.dvbSubPids = new java.util.ArrayList<Integer>(dvbSubPids);
    }

    /**
     * Placeholder documentation for __listOf__integer
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dvbSubPids Placeholder documentation for __listOf__integer
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramPacketIdentifiersMap withDvbSubPids(Integer... dvbSubPids) {
        if (getDvbSubPids() == null) {
            this.dvbSubPids = new java.util.ArrayList<Integer>(dvbSubPids.length);
        }
        for (Integer value : dvbSubPids) {
            this.dvbSubPids.add(value);
        }
        return this;
    }

    /**
     * Placeholder documentation for __listOf__integer
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dvbSubPids Placeholder documentation for __listOf__integer
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramPacketIdentifiersMap withDvbSubPids(
            java.util.Collection<Integer> dvbSubPids) {
        setDvbSubPids(dvbSubPids);
        return this;
    }

    /**
     * Placeholder documentation for __integer
     *
     * @return Placeholder documentation for __integer
     */
    public Integer getDvbTeletextPid() {
        return dvbTeletextPid;
    }

    /**
     * Placeholder documentation for __integer
     *
     * @param dvbTeletextPid Placeholder documentation for __integer
     */
    public void setDvbTeletextPid(Integer dvbTeletextPid) {
        this.dvbTeletextPid = dvbTeletextPid;
    }

    /**
     * Placeholder documentation for __integer
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dvbTeletextPid Placeholder documentation for __integer
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramPacketIdentifiersMap withDvbTeletextPid(Integer dvbTeletextPid) {
        this.dvbTeletextPid = dvbTeletextPid;
        return this;
    }

    /**
     * Placeholder documentation for __integer
     *
     * @return Placeholder documentation for __integer
     */
    public Integer getEtvPlatformPid() {
        return etvPlatformPid;
    }

    /**
     * Placeholder documentation for __integer
     *
     * @param etvPlatformPid Placeholder documentation for __integer
     */
    public void setEtvPlatformPid(Integer etvPlatformPid) {
        this.etvPlatformPid = etvPlatformPid;
    }

    /**
     * Placeholder documentation for __integer
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param etvPlatformPid Placeholder documentation for __integer
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramPacketIdentifiersMap withEtvPlatformPid(Integer etvPlatformPid) {
        this.etvPlatformPid = etvPlatformPid;
        return this;
    }

    /**
     * Placeholder documentation for __integer
     *
     * @return Placeholder documentation for __integer
     */
    public Integer getEtvSignalPid() {
        return etvSignalPid;
    }

    /**
     * Placeholder documentation for __integer
     *
     * @param etvSignalPid Placeholder documentation for __integer
     */
    public void setEtvSignalPid(Integer etvSignalPid) {
        this.etvSignalPid = etvSignalPid;
    }

    /**
     * Placeholder documentation for __integer
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param etvSignalPid Placeholder documentation for __integer
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramPacketIdentifiersMap withEtvSignalPid(Integer etvSignalPid) {
        this.etvSignalPid = etvSignalPid;
        return this;
    }

    /**
     * Placeholder documentation for __listOf__integer
     *
     * @return Placeholder documentation for __listOf__integer
     */
    public java.util.List<Integer> getKlvDataPids() {
        return klvDataPids;
    }

    /**
     * Placeholder documentation for __listOf__integer
     *
     * @param klvDataPids Placeholder documentation for __listOf__integer
     */
    public void setKlvDataPids(java.util.Collection<Integer> klvDataPids) {
        if (klvDataPids == null) {
            this.klvDataPids = null;
            return;
        }

        this.klvDataPids = new java.util.ArrayList<Integer>(klvDataPids);
    }

    /**
     * Placeholder documentation for __listOf__integer
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param klvDataPids Placeholder documentation for __listOf__integer
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramPacketIdentifiersMap withKlvDataPids(Integer... klvDataPids) {
        if (getKlvDataPids() == null) {
            this.klvDataPids = new java.util.ArrayList<Integer>(klvDataPids.length);
        }
        for (Integer value : klvDataPids) {
            this.klvDataPids.add(value);
        }
        return this;
    }

    /**
     * Placeholder documentation for __listOf__integer
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param klvDataPids Placeholder documentation for __listOf__integer
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramPacketIdentifiersMap withKlvDataPids(
            java.util.Collection<Integer> klvDataPids) {
        setKlvDataPids(klvDataPids);
        return this;
    }

    /**
     * Placeholder documentation for __integer
     *
     * @return Placeholder documentation for __integer
     */
    public Integer getPcrPid() {
        return pcrPid;
    }

    /**
     * Placeholder documentation for __integer
     *
     * @param pcrPid Placeholder documentation for __integer
     */
    public void setPcrPid(Integer pcrPid) {
        this.pcrPid = pcrPid;
    }

    /**
     * Placeholder documentation for __integer
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pcrPid Placeholder documentation for __integer
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramPacketIdentifiersMap withPcrPid(Integer pcrPid) {
        this.pcrPid = pcrPid;
        return this;
    }

    /**
     * Placeholder documentation for __integer
     *
     * @return Placeholder documentation for __integer
     */
    public Integer getPmtPid() {
        return pmtPid;
    }

    /**
     * Placeholder documentation for __integer
     *
     * @param pmtPid Placeholder documentation for __integer
     */
    public void setPmtPid(Integer pmtPid) {
        this.pmtPid = pmtPid;
    }

    /**
     * Placeholder documentation for __integer
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pmtPid Placeholder documentation for __integer
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramPacketIdentifiersMap withPmtPid(Integer pmtPid) {
        this.pmtPid = pmtPid;
        return this;
    }

    /**
     * Placeholder documentation for __integer
     *
     * @return Placeholder documentation for __integer
     */
    public Integer getPrivateMetadataPid() {
        return privateMetadataPid;
    }

    /**
     * Placeholder documentation for __integer
     *
     * @param privateMetadataPid Placeholder documentation for __integer
     */
    public void setPrivateMetadataPid(Integer privateMetadataPid) {
        this.privateMetadataPid = privateMetadataPid;
    }

    /**
     * Placeholder documentation for __integer
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateMetadataPid Placeholder documentation for __integer
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramPacketIdentifiersMap withPrivateMetadataPid(Integer privateMetadataPid) {
        this.privateMetadataPid = privateMetadataPid;
        return this;
    }

    /**
     * Placeholder documentation for __listOf__integer
     *
     * @return Placeholder documentation for __listOf__integer
     */
    public java.util.List<Integer> getScte27Pids() {
        return scte27Pids;
    }

    /**
     * Placeholder documentation for __listOf__integer
     *
     * @param scte27Pids Placeholder documentation for __listOf__integer
     */
    public void setScte27Pids(java.util.Collection<Integer> scte27Pids) {
        if (scte27Pids == null) {
            this.scte27Pids = null;
            return;
        }

        this.scte27Pids = new java.util.ArrayList<Integer>(scte27Pids);
    }

    /**
     * Placeholder documentation for __listOf__integer
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scte27Pids Placeholder documentation for __listOf__integer
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramPacketIdentifiersMap withScte27Pids(Integer... scte27Pids) {
        if (getScte27Pids() == null) {
            this.scte27Pids = new java.util.ArrayList<Integer>(scte27Pids.length);
        }
        for (Integer value : scte27Pids) {
            this.scte27Pids.add(value);
        }
        return this;
    }

    /**
     * Placeholder documentation for __listOf__integer
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scte27Pids Placeholder documentation for __listOf__integer
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramPacketIdentifiersMap withScte27Pids(
            java.util.Collection<Integer> scte27Pids) {
        setScte27Pids(scte27Pids);
        return this;
    }

    /**
     * Placeholder documentation for __integer
     *
     * @return Placeholder documentation for __integer
     */
    public Integer getScte35Pid() {
        return scte35Pid;
    }

    /**
     * Placeholder documentation for __integer
     *
     * @param scte35Pid Placeholder documentation for __integer
     */
    public void setScte35Pid(Integer scte35Pid) {
        this.scte35Pid = scte35Pid;
    }

    /**
     * Placeholder documentation for __integer
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scte35Pid Placeholder documentation for __integer
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramPacketIdentifiersMap withScte35Pid(Integer scte35Pid) {
        this.scte35Pid = scte35Pid;
        return this;
    }

    /**
     * Placeholder documentation for __integer
     *
     * @return Placeholder documentation for __integer
     */
    public Integer getTimedMetadataPid() {
        return timedMetadataPid;
    }

    /**
     * Placeholder documentation for __integer
     *
     * @param timedMetadataPid Placeholder documentation for __integer
     */
    public void setTimedMetadataPid(Integer timedMetadataPid) {
        this.timedMetadataPid = timedMetadataPid;
    }

    /**
     * Placeholder documentation for __integer
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timedMetadataPid Placeholder documentation for __integer
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramPacketIdentifiersMap withTimedMetadataPid(Integer timedMetadataPid) {
        this.timedMetadataPid = timedMetadataPid;
        return this;
    }

    /**
     * Placeholder documentation for __integer
     *
     * @return Placeholder documentation for __integer
     */
    public Integer getVideoPid() {
        return videoPid;
    }

    /**
     * Placeholder documentation for __integer
     *
     * @param videoPid Placeholder documentation for __integer
     */
    public void setVideoPid(Integer videoPid) {
        this.videoPid = videoPid;
    }

    /**
     * Placeholder documentation for __integer
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param videoPid Placeholder documentation for __integer
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramPacketIdentifiersMap withVideoPid(Integer videoPid) {
        this.videoPid = videoPid;
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
        if (getAudioPids() != null)
            sb.append("AudioPids: " + getAudioPids() + ",");
        if (getDvbSubPids() != null)
            sb.append("DvbSubPids: " + getDvbSubPids() + ",");
        if (getDvbTeletextPid() != null)
            sb.append("DvbTeletextPid: " + getDvbTeletextPid() + ",");
        if (getEtvPlatformPid() != null)
            sb.append("EtvPlatformPid: " + getEtvPlatformPid() + ",");
        if (getEtvSignalPid() != null)
            sb.append("EtvSignalPid: " + getEtvSignalPid() + ",");
        if (getKlvDataPids() != null)
            sb.append("KlvDataPids: " + getKlvDataPids() + ",");
        if (getPcrPid() != null)
            sb.append("PcrPid: " + getPcrPid() + ",");
        if (getPmtPid() != null)
            sb.append("PmtPid: " + getPmtPid() + ",");
        if (getPrivateMetadataPid() != null)
            sb.append("PrivateMetadataPid: " + getPrivateMetadataPid() + ",");
        if (getScte27Pids() != null)
            sb.append("Scte27Pids: " + getScte27Pids() + ",");
        if (getScte35Pid() != null)
            sb.append("Scte35Pid: " + getScte35Pid() + ",");
        if (getTimedMetadataPid() != null)
            sb.append("TimedMetadataPid: " + getTimedMetadataPid() + ",");
        if (getVideoPid() != null)
            sb.append("VideoPid: " + getVideoPid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioPids() == null) ? 0 : getAudioPids().hashCode());
        hashCode = prime * hashCode + ((getDvbSubPids() == null) ? 0 : getDvbSubPids().hashCode());
        hashCode = prime * hashCode
                + ((getDvbTeletextPid() == null) ? 0 : getDvbTeletextPid().hashCode());
        hashCode = prime * hashCode
                + ((getEtvPlatformPid() == null) ? 0 : getEtvPlatformPid().hashCode());
        hashCode = prime * hashCode
                + ((getEtvSignalPid() == null) ? 0 : getEtvSignalPid().hashCode());
        hashCode = prime * hashCode
                + ((getKlvDataPids() == null) ? 0 : getKlvDataPids().hashCode());
        hashCode = prime * hashCode + ((getPcrPid() == null) ? 0 : getPcrPid().hashCode());
        hashCode = prime * hashCode + ((getPmtPid() == null) ? 0 : getPmtPid().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateMetadataPid() == null) ? 0 : getPrivateMetadataPid().hashCode());
        hashCode = prime * hashCode + ((getScte27Pids() == null) ? 0 : getScte27Pids().hashCode());
        hashCode = prime * hashCode + ((getScte35Pid() == null) ? 0 : getScte35Pid().hashCode());
        hashCode = prime * hashCode
                + ((getTimedMetadataPid() == null) ? 0 : getTimedMetadataPid().hashCode());
        hashCode = prime * hashCode + ((getVideoPid() == null) ? 0 : getVideoPid().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiplexProgramPacketIdentifiersMap == false)
            return false;
        MultiplexProgramPacketIdentifiersMap other = (MultiplexProgramPacketIdentifiersMap) obj;

        if (other.getAudioPids() == null ^ this.getAudioPids() == null)
            return false;
        if (other.getAudioPids() != null
                && other.getAudioPids().equals(this.getAudioPids()) == false)
            return false;
        if (other.getDvbSubPids() == null ^ this.getDvbSubPids() == null)
            return false;
        if (other.getDvbSubPids() != null
                && other.getDvbSubPids().equals(this.getDvbSubPids()) == false)
            return false;
        if (other.getDvbTeletextPid() == null ^ this.getDvbTeletextPid() == null)
            return false;
        if (other.getDvbTeletextPid() != null
                && other.getDvbTeletextPid().equals(this.getDvbTeletextPid()) == false)
            return false;
        if (other.getEtvPlatformPid() == null ^ this.getEtvPlatformPid() == null)
            return false;
        if (other.getEtvPlatformPid() != null
                && other.getEtvPlatformPid().equals(this.getEtvPlatformPid()) == false)
            return false;
        if (other.getEtvSignalPid() == null ^ this.getEtvSignalPid() == null)
            return false;
        if (other.getEtvSignalPid() != null
                && other.getEtvSignalPid().equals(this.getEtvSignalPid()) == false)
            return false;
        if (other.getKlvDataPids() == null ^ this.getKlvDataPids() == null)
            return false;
        if (other.getKlvDataPids() != null
                && other.getKlvDataPids().equals(this.getKlvDataPids()) == false)
            return false;
        if (other.getPcrPid() == null ^ this.getPcrPid() == null)
            return false;
        if (other.getPcrPid() != null && other.getPcrPid().equals(this.getPcrPid()) == false)
            return false;
        if (other.getPmtPid() == null ^ this.getPmtPid() == null)
            return false;
        if (other.getPmtPid() != null && other.getPmtPid().equals(this.getPmtPid()) == false)
            return false;
        if (other.getPrivateMetadataPid() == null ^ this.getPrivateMetadataPid() == null)
            return false;
        if (other.getPrivateMetadataPid() != null
                && other.getPrivateMetadataPid().equals(this.getPrivateMetadataPid()) == false)
            return false;
        if (other.getScte27Pids() == null ^ this.getScte27Pids() == null)
            return false;
        if (other.getScte27Pids() != null
                && other.getScte27Pids().equals(this.getScte27Pids()) == false)
            return false;
        if (other.getScte35Pid() == null ^ this.getScte35Pid() == null)
            return false;
        if (other.getScte35Pid() != null
                && other.getScte35Pid().equals(this.getScte35Pid()) == false)
            return false;
        if (other.getTimedMetadataPid() == null ^ this.getTimedMetadataPid() == null)
            return false;
        if (other.getTimedMetadataPid() != null
                && other.getTimedMetadataPid().equals(this.getTimedMetadataPid()) == false)
            return false;
        if (other.getVideoPid() == null ^ this.getVideoPid() == null)
            return false;
        if (other.getVideoPid() != null && other.getVideoPid().equals(this.getVideoPid()) == false)
            return false;
        return true;
    }
}
