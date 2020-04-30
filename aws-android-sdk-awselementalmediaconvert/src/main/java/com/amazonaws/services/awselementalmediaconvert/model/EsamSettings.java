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
 * Settings for Event Signaling And Messaging (ESAM). If you don't do ad
 * insertion, you can ignore these settings.
 */
public class EsamSettings implements Serializable {
    /**
     * Specifies an ESAM ManifestConfirmConditionNotification XML as per
     * OC-SP-ESAM-API-I03-131025. The transcoder uses the manifest conditioning
     * instructions that you provide in the setting MCC XML (mccXml).
     */
    private EsamManifestConfirmConditionNotification manifestConfirmConditionNotification;

    /**
     * Specifies the stream distance, in milliseconds, between the SCTE 35
     * messages that the transcoder places and the splice points that they refer
     * to. If the time between the start of the asset and the SCTE-35 message is
     * less than this value, then the transcoder places the SCTE-35 marker at
     * the beginning of the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 30000<br/>
     */
    private Integer responseSignalPreroll;

    /**
     * Specifies an ESAM SignalProcessingNotification XML as per
     * OC-SP-ESAM-API-I03-131025. The transcoder uses the signal processing
     * instructions that you provide in the setting SCC XML (sccXml).
     */
    private EsamSignalProcessingNotification signalProcessingNotification;

    /**
     * Specifies an ESAM ManifestConfirmConditionNotification XML as per
     * OC-SP-ESAM-API-I03-131025. The transcoder uses the manifest conditioning
     * instructions that you provide in the setting MCC XML (mccXml).
     *
     * @return Specifies an ESAM ManifestConfirmConditionNotification XML as per
     *         OC-SP-ESAM-API-I03-131025. The transcoder uses the manifest
     *         conditioning instructions that you provide in the setting MCC XML
     *         (mccXml).
     */
    public EsamManifestConfirmConditionNotification getManifestConfirmConditionNotification() {
        return manifestConfirmConditionNotification;
    }

    /**
     * Specifies an ESAM ManifestConfirmConditionNotification XML as per
     * OC-SP-ESAM-API-I03-131025. The transcoder uses the manifest conditioning
     * instructions that you provide in the setting MCC XML (mccXml).
     *
     * @param manifestConfirmConditionNotification Specifies an ESAM
     *            ManifestConfirmConditionNotification XML as per
     *            OC-SP-ESAM-API-I03-131025. The transcoder uses the manifest
     *            conditioning instructions that you provide in the setting MCC
     *            XML (mccXml).
     */
    public void setManifestConfirmConditionNotification(
            EsamManifestConfirmConditionNotification manifestConfirmConditionNotification) {
        this.manifestConfirmConditionNotification = manifestConfirmConditionNotification;
    }

    /**
     * Specifies an ESAM ManifestConfirmConditionNotification XML as per
     * OC-SP-ESAM-API-I03-131025. The transcoder uses the manifest conditioning
     * instructions that you provide in the setting MCC XML (mccXml).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param manifestConfirmConditionNotification Specifies an ESAM
     *            ManifestConfirmConditionNotification XML as per
     *            OC-SP-ESAM-API-I03-131025. The transcoder uses the manifest
     *            conditioning instructions that you provide in the setting MCC
     *            XML (mccXml).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EsamSettings withManifestConfirmConditionNotification(
            EsamManifestConfirmConditionNotification manifestConfirmConditionNotification) {
        this.manifestConfirmConditionNotification = manifestConfirmConditionNotification;
        return this;
    }

    /**
     * Specifies the stream distance, in milliseconds, between the SCTE 35
     * messages that the transcoder places and the splice points that they refer
     * to. If the time between the start of the asset and the SCTE-35 message is
     * less than this value, then the transcoder places the SCTE-35 marker at
     * the beginning of the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 30000<br/>
     *
     * @return Specifies the stream distance, in milliseconds, between the SCTE
     *         35 messages that the transcoder places and the splice points that
     *         they refer to. If the time between the start of the asset and the
     *         SCTE-35 message is less than this value, then the transcoder
     *         places the SCTE-35 marker at the beginning of the stream.
     */
    public Integer getResponseSignalPreroll() {
        return responseSignalPreroll;
    }

    /**
     * Specifies the stream distance, in milliseconds, between the SCTE 35
     * messages that the transcoder places and the splice points that they refer
     * to. If the time between the start of the asset and the SCTE-35 message is
     * less than this value, then the transcoder places the SCTE-35 marker at
     * the beginning of the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 30000<br/>
     *
     * @param responseSignalPreroll Specifies the stream distance, in
     *            milliseconds, between the SCTE 35 messages that the transcoder
     *            places and the splice points that they refer to. If the time
     *            between the start of the asset and the SCTE-35 message is less
     *            than this value, then the transcoder places the SCTE-35 marker
     *            at the beginning of the stream.
     */
    public void setResponseSignalPreroll(Integer responseSignalPreroll) {
        this.responseSignalPreroll = responseSignalPreroll;
    }

    /**
     * Specifies the stream distance, in milliseconds, between the SCTE 35
     * messages that the transcoder places and the splice points that they refer
     * to. If the time between the start of the asset and the SCTE-35 message is
     * less than this value, then the transcoder places the SCTE-35 marker at
     * the beginning of the stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 30000<br/>
     *
     * @param responseSignalPreroll Specifies the stream distance, in
     *            milliseconds, between the SCTE 35 messages that the transcoder
     *            places and the splice points that they refer to. If the time
     *            between the start of the asset and the SCTE-35 message is less
     *            than this value, then the transcoder places the SCTE-35 marker
     *            at the beginning of the stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EsamSettings withResponseSignalPreroll(Integer responseSignalPreroll) {
        this.responseSignalPreroll = responseSignalPreroll;
        return this;
    }

    /**
     * Specifies an ESAM SignalProcessingNotification XML as per
     * OC-SP-ESAM-API-I03-131025. The transcoder uses the signal processing
     * instructions that you provide in the setting SCC XML (sccXml).
     *
     * @return Specifies an ESAM SignalProcessingNotification XML as per
     *         OC-SP-ESAM-API-I03-131025. The transcoder uses the signal
     *         processing instructions that you provide in the setting SCC XML
     *         (sccXml).
     */
    public EsamSignalProcessingNotification getSignalProcessingNotification() {
        return signalProcessingNotification;
    }

    /**
     * Specifies an ESAM SignalProcessingNotification XML as per
     * OC-SP-ESAM-API-I03-131025. The transcoder uses the signal processing
     * instructions that you provide in the setting SCC XML (sccXml).
     *
     * @param signalProcessingNotification Specifies an ESAM
     *            SignalProcessingNotification XML as per
     *            OC-SP-ESAM-API-I03-131025. The transcoder uses the signal
     *            processing instructions that you provide in the setting SCC
     *            XML (sccXml).
     */
    public void setSignalProcessingNotification(
            EsamSignalProcessingNotification signalProcessingNotification) {
        this.signalProcessingNotification = signalProcessingNotification;
    }

    /**
     * Specifies an ESAM SignalProcessingNotification XML as per
     * OC-SP-ESAM-API-I03-131025. The transcoder uses the signal processing
     * instructions that you provide in the setting SCC XML (sccXml).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signalProcessingNotification Specifies an ESAM
     *            SignalProcessingNotification XML as per
     *            OC-SP-ESAM-API-I03-131025. The transcoder uses the signal
     *            processing instructions that you provide in the setting SCC
     *            XML (sccXml).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EsamSettings withSignalProcessingNotification(
            EsamSignalProcessingNotification signalProcessingNotification) {
        this.signalProcessingNotification = signalProcessingNotification;
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
        if (getManifestConfirmConditionNotification() != null)
            sb.append("ManifestConfirmConditionNotification: "
                    + getManifestConfirmConditionNotification() + ",");
        if (getResponseSignalPreroll() != null)
            sb.append("ResponseSignalPreroll: " + getResponseSignalPreroll() + ",");
        if (getSignalProcessingNotification() != null)
            sb.append("SignalProcessingNotification: " + getSignalProcessingNotification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getManifestConfirmConditionNotification() == null) ? 0
                        : getManifestConfirmConditionNotification().hashCode());
        hashCode = prime
                * hashCode
                + ((getResponseSignalPreroll() == null) ? 0 : getResponseSignalPreroll().hashCode());
        hashCode = prime
                * hashCode
                + ((getSignalProcessingNotification() == null) ? 0
                        : getSignalProcessingNotification().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EsamSettings == false)
            return false;
        EsamSettings other = (EsamSettings) obj;

        if (other.getManifestConfirmConditionNotification() == null
                ^ this.getManifestConfirmConditionNotification() == null)
            return false;
        if (other.getManifestConfirmConditionNotification() != null
                && other.getManifestConfirmConditionNotification().equals(
                        this.getManifestConfirmConditionNotification()) == false)
            return false;
        if (other.getResponseSignalPreroll() == null ^ this.getResponseSignalPreroll() == null)
            return false;
        if (other.getResponseSignalPreroll() != null
                && other.getResponseSignalPreroll().equals(this.getResponseSignalPreroll()) == false)
            return false;
        if (other.getSignalProcessingNotification() == null
                ^ this.getSignalProcessingNotification() == null)
            return false;
        if (other.getSignalProcessingNotification() != null
                && other.getSignalProcessingNotification().equals(
                        this.getSignalProcessingNotification()) == false)
            return false;
        return true;
    }
}
