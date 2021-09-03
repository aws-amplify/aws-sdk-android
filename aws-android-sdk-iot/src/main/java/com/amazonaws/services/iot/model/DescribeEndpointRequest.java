/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a unique endpoint specific to the Amazon Web Services account making
 * the call.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >DescribeEndpoint</a> action.
 * </p>
 */
public class DescribeEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The endpoint type. Valid endpoint types include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Data</code> - Returns a VeriSign signed data endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Data-ATS</code> - Returns an ATS signed data endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:CredentialProvider</code> - Returns an IoT credentials provider
     * API endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Jobs</code> - Returns an IoT device management Jobs API
     * endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * We strongly recommend that customers use the newer
     * <code>iot:Data-ATS</code> endpoint type to avoid issues related to the
     * widespread distrust of Symantec certificate authorities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     */
    private String endpointType;

    /**
     * <p>
     * The endpoint type. Valid endpoint types include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Data</code> - Returns a VeriSign signed data endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Data-ATS</code> - Returns an ATS signed data endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:CredentialProvider</code> - Returns an IoT credentials provider
     * API endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Jobs</code> - Returns an IoT device management Jobs API
     * endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * We strongly recommend that customers use the newer
     * <code>iot:Data-ATS</code> endpoint type to avoid issues related to the
     * widespread distrust of Symantec certificate authorities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @return <p>
     *         The endpoint type. Valid endpoint types include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>iot:Data</code> - Returns a VeriSign signed data endpoint.
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>iot:Data-ATS</code> - Returns an ATS signed data endpoint.
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>iot:CredentialProvider</code> - Returns an IoT credentials
     *         provider API endpoint.
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>iot:Jobs</code> - Returns an IoT device management Jobs API
     *         endpoint.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         We strongly recommend that customers use the newer
     *         <code>iot:Data-ATS</code> endpoint type to avoid issues related
     *         to the widespread distrust of Symantec certificate authorities.
     *         </p>
     */
    public String getEndpointType() {
        return endpointType;
    }

    /**
     * <p>
     * The endpoint type. Valid endpoint types include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Data</code> - Returns a VeriSign signed data endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Data-ATS</code> - Returns an ATS signed data endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:CredentialProvider</code> - Returns an IoT credentials provider
     * API endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Jobs</code> - Returns an IoT device management Jobs API
     * endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * We strongly recommend that customers use the newer
     * <code>iot:Data-ATS</code> endpoint type to avoid issues related to the
     * widespread distrust of Symantec certificate authorities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param endpointType <p>
     *            The endpoint type. Valid endpoint types include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>iot:Data</code> - Returns a VeriSign signed data
     *            endpoint.
     *            </p>
     *            </li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>iot:Data-ATS</code> - Returns an ATS signed data
     *            endpoint.
     *            </p>
     *            </li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>iot:CredentialProvider</code> - Returns an IoT
     *            credentials provider API endpoint.
     *            </p>
     *            </li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>iot:Jobs</code> - Returns an IoT device management Jobs
     *            API endpoint.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            We strongly recommend that customers use the newer
     *            <code>iot:Data-ATS</code> endpoint type to avoid issues
     *            related to the widespread distrust of Symantec certificate
     *            authorities.
     *            </p>
     */
    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The endpoint type. Valid endpoint types include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Data</code> - Returns a VeriSign signed data endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Data-ATS</code> - Returns an ATS signed data endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:CredentialProvider</code> - Returns an IoT credentials provider
     * API endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Jobs</code> - Returns an IoT device management Jobs API
     * endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * We strongly recommend that customers use the newer
     * <code>iot:Data-ATS</code> endpoint type to avoid issues related to the
     * widespread distrust of Symantec certificate authorities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param endpointType <p>
     *            The endpoint type. Valid endpoint types include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>iot:Data</code> - Returns a VeriSign signed data
     *            endpoint.
     *            </p>
     *            </li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>iot:Data-ATS</code> - Returns an ATS signed data
     *            endpoint.
     *            </p>
     *            </li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>iot:CredentialProvider</code> - Returns an IoT
     *            credentials provider API endpoint.
     *            </p>
     *            </li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>iot:Jobs</code> - Returns an IoT device management Jobs
     *            API endpoint.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            We strongly recommend that customers use the newer
     *            <code>iot:Data-ATS</code> endpoint type to avoid issues
     *            related to the widespread distrust of Symantec certificate
     *            authorities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointRequest withEndpointType(String endpointType) {
        this.endpointType = endpointType;
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
        if (getEndpointType() != null)
            sb.append("endpointType: " + getEndpointType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEndpointRequest == false)
            return false;
        DescribeEndpointRequest other = (DescribeEndpointRequest) obj;

        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null
                && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        return true;
    }
}
