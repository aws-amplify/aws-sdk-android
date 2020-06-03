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
 * ESAM SignalProcessingNotification data defined by OC-SP-ESAM-API-I03-131025.
 */
public class EsamSignalProcessingNotification implements Serializable {
    /**
     * Provide your ESAM SignalProcessingNotification XML document inside your
     * JSON job settings. Form the XML document as per
     * OC-SP-ESAM-API-I03-131025. The transcoder will use the signal processing
     * instructions in the message that you supply. Provide your ESAM
     * SignalProcessingNotification XML document inside your JSON job settings.
     * For your MPEG2-TS file outputs, if you want the service to place SCTE-35
     * markers at the insertion points you specify in the XML document, you must
     * also enable SCTE-35 ESAM (scte35Esam). Note that you can either specify
     * an ESAM XML document or enable SCTE-35 passthrough. You can't do both.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\s*<(.|\n)*SignalProcessingNotification(.|\n)*>\s*$<br/>
     */
    private String sccXml;

    /**
     * Provide your ESAM SignalProcessingNotification XML document inside your
     * JSON job settings. Form the XML document as per
     * OC-SP-ESAM-API-I03-131025. The transcoder will use the signal processing
     * instructions in the message that you supply. Provide your ESAM
     * SignalProcessingNotification XML document inside your JSON job settings.
     * For your MPEG2-TS file outputs, if you want the service to place SCTE-35
     * markers at the insertion points you specify in the XML document, you must
     * also enable SCTE-35 ESAM (scte35Esam). Note that you can either specify
     * an ESAM XML document or enable SCTE-35 passthrough. You can't do both.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\s*<(.|\n)*SignalProcessingNotification(.|\n)*>\s*$<br/>
     *
     * @return Provide your ESAM SignalProcessingNotification XML document
     *         inside your JSON job settings. Form the XML document as per
     *         OC-SP-ESAM-API-I03-131025. The transcoder will use the signal
     *         processing instructions in the message that you supply. Provide
     *         your ESAM SignalProcessingNotification XML document inside your
     *         JSON job settings. For your MPEG2-TS file outputs, if you want
     *         the service to place SCTE-35 markers at the insertion points you
     *         specify in the XML document, you must also enable SCTE-35 ESAM
     *         (scte35Esam). Note that you can either specify an ESAM XML
     *         document or enable SCTE-35 passthrough. You can't do both.
     */
    public String getSccXml() {
        return sccXml;
    }

    /**
     * Provide your ESAM SignalProcessingNotification XML document inside your
     * JSON job settings. Form the XML document as per
     * OC-SP-ESAM-API-I03-131025. The transcoder will use the signal processing
     * instructions in the message that you supply. Provide your ESAM
     * SignalProcessingNotification XML document inside your JSON job settings.
     * For your MPEG2-TS file outputs, if you want the service to place SCTE-35
     * markers at the insertion points you specify in the XML document, you must
     * also enable SCTE-35 ESAM (scte35Esam). Note that you can either specify
     * an ESAM XML document or enable SCTE-35 passthrough. You can't do both.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\s*<(.|\n)*SignalProcessingNotification(.|\n)*>\s*$<br/>
     *
     * @param sccXml Provide your ESAM SignalProcessingNotification XML document
     *            inside your JSON job settings. Form the XML document as per
     *            OC-SP-ESAM-API-I03-131025. The transcoder will use the signal
     *            processing instructions in the message that you supply.
     *            Provide your ESAM SignalProcessingNotification XML document
     *            inside your JSON job settings. For your MPEG2-TS file outputs,
     *            if you want the service to place SCTE-35 markers at the
     *            insertion points you specify in the XML document, you must
     *            also enable SCTE-35 ESAM (scte35Esam). Note that you can
     *            either specify an ESAM XML document or enable SCTE-35
     *            passthrough. You can't do both.
     */
    public void setSccXml(String sccXml) {
        this.sccXml = sccXml;
    }

    /**
     * Provide your ESAM SignalProcessingNotification XML document inside your
     * JSON job settings. Form the XML document as per
     * OC-SP-ESAM-API-I03-131025. The transcoder will use the signal processing
     * instructions in the message that you supply. Provide your ESAM
     * SignalProcessingNotification XML document inside your JSON job settings.
     * For your MPEG2-TS file outputs, if you want the service to place SCTE-35
     * markers at the insertion points you specify in the XML document, you must
     * also enable SCTE-35 ESAM (scte35Esam). Note that you can either specify
     * an ESAM XML document or enable SCTE-35 passthrough. You can't do both.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\s*<(.|\n)*SignalProcessingNotification(.|\n)*>\s*$<br/>
     *
     * @param sccXml Provide your ESAM SignalProcessingNotification XML document
     *            inside your JSON job settings. Form the XML document as per
     *            OC-SP-ESAM-API-I03-131025. The transcoder will use the signal
     *            processing instructions in the message that you supply.
     *            Provide your ESAM SignalProcessingNotification XML document
     *            inside your JSON job settings. For your MPEG2-TS file outputs,
     *            if you want the service to place SCTE-35 markers at the
     *            insertion points you specify in the XML document, you must
     *            also enable SCTE-35 ESAM (scte35Esam). Note that you can
     *            either specify an ESAM XML document or enable SCTE-35
     *            passthrough. You can't do both.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EsamSignalProcessingNotification withSccXml(String sccXml) {
        this.sccXml = sccXml;
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
        if (getSccXml() != null)
            sb.append("SccXml: " + getSccXml());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSccXml() == null) ? 0 : getSccXml().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EsamSignalProcessingNotification == false)
            return false;
        EsamSignalProcessingNotification other = (EsamSignalProcessingNotification) obj;

        if (other.getSccXml() == null ^ this.getSccXml() == null)
            return false;
        if (other.getSccXml() != null && other.getSccXml().equals(this.getSccXml()) == false)
            return false;
        return true;
    }
}
