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
 * Inserts DVB Service Description Table (NIT) at the specified table repetition
 * interval.
 */
public class DvbSdtSettings implements Serializable {
    /**
     * Selects method of inserting SDT information into output stream.
     * "Follow input SDT" copies SDT information from input stream to output
     * stream. "Follow input SDT if present" copies SDT information from input
     * stream to output stream if SDT information is present in the input,
     * otherwise it will fall back on the user-defined values. Enter
     * "SDT  Manually" means user will enter the SDT information. "No SDT" means
     * output stream will not contain SDT information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SDT_FOLLOW, SDT_FOLLOW_IF_PRESENT, SDT_MANUAL,
     * SDT_NONE
     */
    private String outputSdt;

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>25 - 2000<br/>
     */
    private Integer sdtInterval;

    /**
     * The service name placed in the service_descriptor in the Service
     * Description Table. Maximum length is 256 characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String serviceName;

    /**
     * The service provider name placed in the service_descriptor in the Service
     * Description Table. Maximum length is 256 characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String serviceProviderName;

    /**
     * Selects method of inserting SDT information into output stream.
     * "Follow input SDT" copies SDT information from input stream to output
     * stream. "Follow input SDT if present" copies SDT information from input
     * stream to output stream if SDT information is present in the input,
     * otherwise it will fall back on the user-defined values. Enter
     * "SDT  Manually" means user will enter the SDT information. "No SDT" means
     * output stream will not contain SDT information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SDT_FOLLOW, SDT_FOLLOW_IF_PRESENT, SDT_MANUAL,
     * SDT_NONE
     *
     * @return Selects method of inserting SDT information into output stream.
     *         "Follow input SDT" copies SDT information from input stream to
     *         output stream. "Follow input SDT if present" copies SDT
     *         information from input stream to output stream if SDT information
     *         is present in the input, otherwise it will fall back on the
     *         user-defined values. Enter "SDT  Manually" means user will enter
     *         the SDT information. "No SDT" means output stream will not
     *         contain SDT information.
     * @see OutputSdt
     */
    public String getOutputSdt() {
        return outputSdt;
    }

    /**
     * Selects method of inserting SDT information into output stream.
     * "Follow input SDT" copies SDT information from input stream to output
     * stream. "Follow input SDT if present" copies SDT information from input
     * stream to output stream if SDT information is present in the input,
     * otherwise it will fall back on the user-defined values. Enter
     * "SDT  Manually" means user will enter the SDT information. "No SDT" means
     * output stream will not contain SDT information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SDT_FOLLOW, SDT_FOLLOW_IF_PRESENT, SDT_MANUAL,
     * SDT_NONE
     *
     * @param outputSdt Selects method of inserting SDT information into output
     *            stream. "Follow input SDT" copies SDT information from input
     *            stream to output stream. "Follow input SDT if present" copies
     *            SDT information from input stream to output stream if SDT
     *            information is present in the input, otherwise it will fall
     *            back on the user-defined values. Enter "SDT  Manually" means
     *            user will enter the SDT information. "No SDT" means output
     *            stream will not contain SDT information.
     * @see OutputSdt
     */
    public void setOutputSdt(String outputSdt) {
        this.outputSdt = outputSdt;
    }

    /**
     * Selects method of inserting SDT information into output stream.
     * "Follow input SDT" copies SDT information from input stream to output
     * stream. "Follow input SDT if present" copies SDT information from input
     * stream to output stream if SDT information is present in the input,
     * otherwise it will fall back on the user-defined values. Enter
     * "SDT  Manually" means user will enter the SDT information. "No SDT" means
     * output stream will not contain SDT information.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SDT_FOLLOW, SDT_FOLLOW_IF_PRESENT, SDT_MANUAL,
     * SDT_NONE
     *
     * @param outputSdt Selects method of inserting SDT information into output
     *            stream. "Follow input SDT" copies SDT information from input
     *            stream to output stream. "Follow input SDT if present" copies
     *            SDT information from input stream to output stream if SDT
     *            information is present in the input, otherwise it will fall
     *            back on the user-defined values. Enter "SDT  Manually" means
     *            user will enter the SDT information. "No SDT" means output
     *            stream will not contain SDT information.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OutputSdt
     */
    public DvbSdtSettings withOutputSdt(String outputSdt) {
        this.outputSdt = outputSdt;
        return this;
    }

    /**
     * Selects method of inserting SDT information into output stream.
     * "Follow input SDT" copies SDT information from input stream to output
     * stream. "Follow input SDT if present" copies SDT information from input
     * stream to output stream if SDT information is present in the input,
     * otherwise it will fall back on the user-defined values. Enter
     * "SDT  Manually" means user will enter the SDT information. "No SDT" means
     * output stream will not contain SDT information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SDT_FOLLOW, SDT_FOLLOW_IF_PRESENT, SDT_MANUAL,
     * SDT_NONE
     *
     * @param outputSdt Selects method of inserting SDT information into output
     *            stream. "Follow input SDT" copies SDT information from input
     *            stream to output stream. "Follow input SDT if present" copies
     *            SDT information from input stream to output stream if SDT
     *            information is present in the input, otherwise it will fall
     *            back on the user-defined values. Enter "SDT  Manually" means
     *            user will enter the SDT information. "No SDT" means output
     *            stream will not contain SDT information.
     * @see OutputSdt
     */
    public void setOutputSdt(OutputSdt outputSdt) {
        this.outputSdt = outputSdt.toString();
    }

    /**
     * Selects method of inserting SDT information into output stream.
     * "Follow input SDT" copies SDT information from input stream to output
     * stream. "Follow input SDT if present" copies SDT information from input
     * stream to output stream if SDT information is present in the input,
     * otherwise it will fall back on the user-defined values. Enter
     * "SDT  Manually" means user will enter the SDT information. "No SDT" means
     * output stream will not contain SDT information.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SDT_FOLLOW, SDT_FOLLOW_IF_PRESENT, SDT_MANUAL,
     * SDT_NONE
     *
     * @param outputSdt Selects method of inserting SDT information into output
     *            stream. "Follow input SDT" copies SDT information from input
     *            stream to output stream. "Follow input SDT if present" copies
     *            SDT information from input stream to output stream if SDT
     *            information is present in the input, otherwise it will fall
     *            back on the user-defined values. Enter "SDT  Manually" means
     *            user will enter the SDT information. "No SDT" means output
     *            stream will not contain SDT information.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OutputSdt
     */
    public DvbSdtSettings withOutputSdt(OutputSdt outputSdt) {
        this.outputSdt = outputSdt.toString();
        return this;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>25 - 2000<br/>
     *
     * @return The number of milliseconds between instances of this table in the
     *         output transport stream.
     */
    public Integer getSdtInterval() {
        return sdtInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>25 - 2000<br/>
     *
     * @param sdtInterval The number of milliseconds between instances of this
     *            table in the output transport stream.
     */
    public void setSdtInterval(Integer sdtInterval) {
        this.sdtInterval = sdtInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>25 - 2000<br/>
     *
     * @param sdtInterval The number of milliseconds between instances of this
     *            table in the output transport stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DvbSdtSettings withSdtInterval(Integer sdtInterval) {
        this.sdtInterval = sdtInterval;
        return this;
    }

    /**
     * The service name placed in the service_descriptor in the Service
     * Description Table. Maximum length is 256 characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The service name placed in the service_descriptor in the Service
     *         Description Table. Maximum length is 256 characters.
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * The service name placed in the service_descriptor in the Service
     * Description Table. Maximum length is 256 characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param serviceName The service name placed in the service_descriptor in
     *            the Service Description Table. Maximum length is 256
     *            characters.
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * The service name placed in the service_descriptor in the Service
     * Description Table. Maximum length is 256 characters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param serviceName The service name placed in the service_descriptor in
     *            the Service Description Table. Maximum length is 256
     *            characters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DvbSdtSettings withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * The service provider name placed in the service_descriptor in the Service
     * Description Table. Maximum length is 256 characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The service provider name placed in the service_descriptor in the
     *         Service Description Table. Maximum length is 256 characters.
     */
    public String getServiceProviderName() {
        return serviceProviderName;
    }

    /**
     * The service provider name placed in the service_descriptor in the Service
     * Description Table. Maximum length is 256 characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param serviceProviderName The service provider name placed in the
     *            service_descriptor in the Service Description Table. Maximum
     *            length is 256 characters.
     */
    public void setServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
    }

    /**
     * The service provider name placed in the service_descriptor in the Service
     * Description Table. Maximum length is 256 characters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param serviceProviderName The service provider name placed in the
     *            service_descriptor in the Service Description Table. Maximum
     *            length is 256 characters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DvbSdtSettings withServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
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
        if (getOutputSdt() != null)
            sb.append("OutputSdt: " + getOutputSdt() + ",");
        if (getSdtInterval() != null)
            sb.append("SdtInterval: " + getSdtInterval() + ",");
        if (getServiceName() != null)
            sb.append("ServiceName: " + getServiceName() + ",");
        if (getServiceProviderName() != null)
            sb.append("ServiceProviderName: " + getServiceProviderName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputSdt() == null) ? 0 : getOutputSdt().hashCode());
        hashCode = prime * hashCode
                + ((getSdtInterval() == null) ? 0 : getSdtInterval().hashCode());
        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode
                + ((getServiceProviderName() == null) ? 0 : getServiceProviderName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DvbSdtSettings == false)
            return false;
        DvbSdtSettings other = (DvbSdtSettings) obj;

        if (other.getOutputSdt() == null ^ this.getOutputSdt() == null)
            return false;
        if (other.getOutputSdt() != null
                && other.getOutputSdt().equals(this.getOutputSdt()) == false)
            return false;
        if (other.getSdtInterval() == null ^ this.getSdtInterval() == null)
            return false;
        if (other.getSdtInterval() != null
                && other.getSdtInterval().equals(this.getSdtInterval()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getServiceProviderName() == null ^ this.getServiceProviderName() == null)
            return false;
        if (other.getServiceProviderName() != null
                && other.getServiceProviderName().equals(this.getServiceProviderName()) == false)
            return false;
        return true;
    }
}
