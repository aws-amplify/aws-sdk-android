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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

/**
 * <p>
 * Detailed information about the external key store proxy (XKS proxy). Your
 * external key store proxy translates KMS requests into a format that your
 * external key manager can understand. These fields appear in a
 * <a>DescribeCustomKeyStores</a> response only when the
 * <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code>.
 * </p>
 */
public class XksProxyConfigurationType implements Serializable {
    /**
     * <p>
     * Indicates whether the external key store proxy uses a public endpoint or
     * an Amazon VPC endpoint service to communicate with KMS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_ENDPOINT, VPC_ENDPOINT_SERVICE
     */
    private String connectivity;

    /**
     * <p>
     * The part of the external key store <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateCustomKeyStore.html#KMS-CreateCustomKeyStore-request-XksProxyAuthenticationCredential"
     * >proxy authentication credential</a> that uniquely identifies the secret
     * access key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 30<br/>
     * <b>Pattern: </b>^[A-Z2-7]+$<br/>
     */
    private String accessKeyId;

    /**
     * <p>
     * The URI endpoint for the external key store proxy.
     * </p>
     * <p>
     * If the external key store proxy has a public endpoint, it is displayed
     * here.
     * </p>
     * <p>
     * If the external key store proxy uses an Amazon VPC endpoint service name,
     * this field displays the private DNS name associated with the VPC endpoint
     * service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern: </b>^https://[a-zA-Z0-9.-]+$<br/>
     */
    private String uriEndpoint;

    /**
     * <p>
     * The path to the external key store proxy APIs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern:
     * </b>^(/[a-zA-Z0-9\/_-]+/kms/xks/v\d{1,2})$|^(/kms/xks/v\d{1,2})$<br/>
     */
    private String uriPath;

    /**
     * <p>
     * The Amazon VPC endpoint service used to communicate with the external key
     * store proxy. This field appears only when the external key store proxy
     * uses an Amazon VPC endpoint service to communicate with KMS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 64<br/>
     * <b>Pattern:
     * </b>^com\.amazonaws\.vpce\.([a-z]+-){2,3}\d+\.vpce-svc-[0-9a-z]+$<br/>
     */
    private String vpcEndpointServiceName;

    /**
     * <p>
     * Indicates whether the external key store proxy uses a public endpoint or
     * an Amazon VPC endpoint service to communicate with KMS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_ENDPOINT, VPC_ENDPOINT_SERVICE
     *
     * @return <p>
     *         Indicates whether the external key store proxy uses a public
     *         endpoint or an Amazon VPC endpoint service to communicate with
     *         KMS.
     *         </p>
     * @see XksProxyConnectivityType
     */
    public String getConnectivity() {
        return connectivity;
    }

    /**
     * <p>
     * Indicates whether the external key store proxy uses a public endpoint or
     * an Amazon VPC endpoint service to communicate with KMS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_ENDPOINT, VPC_ENDPOINT_SERVICE
     *
     * @param connectivity <p>
     *            Indicates whether the external key store proxy uses a public
     *            endpoint or an Amazon VPC endpoint service to communicate with
     *            KMS.
     *            </p>
     * @see XksProxyConnectivityType
     */
    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    /**
     * <p>
     * Indicates whether the external key store proxy uses a public endpoint or
     * an Amazon VPC endpoint service to communicate with KMS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_ENDPOINT, VPC_ENDPOINT_SERVICE
     *
     * @param connectivity <p>
     *            Indicates whether the external key store proxy uses a public
     *            endpoint or an Amazon VPC endpoint service to communicate with
     *            KMS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see XksProxyConnectivityType
     */
    public XksProxyConfigurationType withConnectivity(String connectivity) {
        this.connectivity = connectivity;
        return this;
    }

    /**
     * <p>
     * Indicates whether the external key store proxy uses a public endpoint or
     * an Amazon VPC endpoint service to communicate with KMS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_ENDPOINT, VPC_ENDPOINT_SERVICE
     *
     * @param connectivity <p>
     *            Indicates whether the external key store proxy uses a public
     *            endpoint or an Amazon VPC endpoint service to communicate with
     *            KMS.
     *            </p>
     * @see XksProxyConnectivityType
     */
    public void setConnectivity(XksProxyConnectivityType connectivity) {
        this.connectivity = connectivity.toString();
    }

    /**
     * <p>
     * Indicates whether the external key store proxy uses a public endpoint or
     * an Amazon VPC endpoint service to communicate with KMS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_ENDPOINT, VPC_ENDPOINT_SERVICE
     *
     * @param connectivity <p>
     *            Indicates whether the external key store proxy uses a public
     *            endpoint or an Amazon VPC endpoint service to communicate with
     *            KMS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see XksProxyConnectivityType
     */
    public XksProxyConfigurationType withConnectivity(XksProxyConnectivityType connectivity) {
        this.connectivity = connectivity.toString();
        return this;
    }

    /**
     * <p>
     * The part of the external key store <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateCustomKeyStore.html#KMS-CreateCustomKeyStore-request-XksProxyAuthenticationCredential"
     * >proxy authentication credential</a> that uniquely identifies the secret
     * access key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 30<br/>
     * <b>Pattern: </b>^[A-Z2-7]+$<br/>
     *
     * @return <p>
     *         The part of the external key store <a href=
     *         "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateCustomKeyStore.html#KMS-CreateCustomKeyStore-request-XksProxyAuthenticationCredential"
     *         >proxy authentication credential</a> that uniquely identifies the
     *         secret access key.
     *         </p>
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * <p>
     * The part of the external key store <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateCustomKeyStore.html#KMS-CreateCustomKeyStore-request-XksProxyAuthenticationCredential"
     * >proxy authentication credential</a> that uniquely identifies the secret
     * access key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 30<br/>
     * <b>Pattern: </b>^[A-Z2-7]+$<br/>
     *
     * @param accessKeyId <p>
     *            The part of the external key store <a href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateCustomKeyStore.html#KMS-CreateCustomKeyStore-request-XksProxyAuthenticationCredential"
     *            >proxy authentication credential</a> that uniquely identifies
     *            the secret access key.
     *            </p>
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The part of the external key store <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateCustomKeyStore.html#KMS-CreateCustomKeyStore-request-XksProxyAuthenticationCredential"
     * >proxy authentication credential</a> that uniquely identifies the secret
     * access key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 30<br/>
     * <b>Pattern: </b>^[A-Z2-7]+$<br/>
     *
     * @param accessKeyId <p>
     *            The part of the external key store <a href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateCustomKeyStore.html#KMS-CreateCustomKeyStore-request-XksProxyAuthenticationCredential"
     *            >proxy authentication credential</a> that uniquely identifies
     *            the secret access key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public XksProxyConfigurationType withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * <p>
     * The URI endpoint for the external key store proxy.
     * </p>
     * <p>
     * If the external key store proxy has a public endpoint, it is displayed
     * here.
     * </p>
     * <p>
     * If the external key store proxy uses an Amazon VPC endpoint service name,
     * this field displays the private DNS name associated with the VPC endpoint
     * service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern: </b>^https://[a-zA-Z0-9.-]+$<br/>
     *
     * @return <p>
     *         The URI endpoint for the external key store proxy.
     *         </p>
     *         <p>
     *         If the external key store proxy has a public endpoint, it is
     *         displayed here.
     *         </p>
     *         <p>
     *         If the external key store proxy uses an Amazon VPC endpoint
     *         service name, this field displays the private DNS name associated
     *         with the VPC endpoint service.
     *         </p>
     */
    public String getUriEndpoint() {
        return uriEndpoint;
    }

    /**
     * <p>
     * The URI endpoint for the external key store proxy.
     * </p>
     * <p>
     * If the external key store proxy has a public endpoint, it is displayed
     * here.
     * </p>
     * <p>
     * If the external key store proxy uses an Amazon VPC endpoint service name,
     * this field displays the private DNS name associated with the VPC endpoint
     * service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern: </b>^https://[a-zA-Z0-9.-]+$<br/>
     *
     * @param uriEndpoint <p>
     *            The URI endpoint for the external key store proxy.
     *            </p>
     *            <p>
     *            If the external key store proxy has a public endpoint, it is
     *            displayed here.
     *            </p>
     *            <p>
     *            If the external key store proxy uses an Amazon VPC endpoint
     *            service name, this field displays the private DNS name
     *            associated with the VPC endpoint service.
     *            </p>
     */
    public void setUriEndpoint(String uriEndpoint) {
        this.uriEndpoint = uriEndpoint;
    }

    /**
     * <p>
     * The URI endpoint for the external key store proxy.
     * </p>
     * <p>
     * If the external key store proxy has a public endpoint, it is displayed
     * here.
     * </p>
     * <p>
     * If the external key store proxy uses an Amazon VPC endpoint service name,
     * this field displays the private DNS name associated with the VPC endpoint
     * service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern: </b>^https://[a-zA-Z0-9.-]+$<br/>
     *
     * @param uriEndpoint <p>
     *            The URI endpoint for the external key store proxy.
     *            </p>
     *            <p>
     *            If the external key store proxy has a public endpoint, it is
     *            displayed here.
     *            </p>
     *            <p>
     *            If the external key store proxy uses an Amazon VPC endpoint
     *            service name, this field displays the private DNS name
     *            associated with the VPC endpoint service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public XksProxyConfigurationType withUriEndpoint(String uriEndpoint) {
        this.uriEndpoint = uriEndpoint;
        return this;
    }

    /**
     * <p>
     * The path to the external key store proxy APIs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern:
     * </b>^(/[a-zA-Z0-9\/_-]+/kms/xks/v\d{1,2})$|^(/kms/xks/v\d{1,2})$<br/>
     *
     * @return <p>
     *         The path to the external key store proxy APIs.
     *         </p>
     */
    public String getUriPath() {
        return uriPath;
    }

    /**
     * <p>
     * The path to the external key store proxy APIs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern:
     * </b>^(/[a-zA-Z0-9\/_-]+/kms/xks/v\d{1,2})$|^(/kms/xks/v\d{1,2})$<br/>
     *
     * @param uriPath <p>
     *            The path to the external key store proxy APIs.
     *            </p>
     */
    public void setUriPath(String uriPath) {
        this.uriPath = uriPath;
    }

    /**
     * <p>
     * The path to the external key store proxy APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern:
     * </b>^(/[a-zA-Z0-9\/_-]+/kms/xks/v\d{1,2})$|^(/kms/xks/v\d{1,2})$<br/>
     *
     * @param uriPath <p>
     *            The path to the external key store proxy APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public XksProxyConfigurationType withUriPath(String uriPath) {
        this.uriPath = uriPath;
        return this;
    }

    /**
     * <p>
     * The Amazon VPC endpoint service used to communicate with the external key
     * store proxy. This field appears only when the external key store proxy
     * uses an Amazon VPC endpoint service to communicate with KMS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 64<br/>
     * <b>Pattern:
     * </b>^com\.amazonaws\.vpce\.([a-z]+-){2,3}\d+\.vpce-svc-[0-9a-z]+$<br/>
     *
     * @return <p>
     *         The Amazon VPC endpoint service used to communicate with the
     *         external key store proxy. This field appears only when the
     *         external key store proxy uses an Amazon VPC endpoint service to
     *         communicate with KMS.
     *         </p>
     */
    public String getVpcEndpointServiceName() {
        return vpcEndpointServiceName;
    }

    /**
     * <p>
     * The Amazon VPC endpoint service used to communicate with the external key
     * store proxy. This field appears only when the external key store proxy
     * uses an Amazon VPC endpoint service to communicate with KMS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 64<br/>
     * <b>Pattern:
     * </b>^com\.amazonaws\.vpce\.([a-z]+-){2,3}\d+\.vpce-svc-[0-9a-z]+$<br/>
     *
     * @param vpcEndpointServiceName <p>
     *            The Amazon VPC endpoint service used to communicate with the
     *            external key store proxy. This field appears only when the
     *            external key store proxy uses an Amazon VPC endpoint service
     *            to communicate with KMS.
     *            </p>
     */
    public void setVpcEndpointServiceName(String vpcEndpointServiceName) {
        this.vpcEndpointServiceName = vpcEndpointServiceName;
    }

    /**
     * <p>
     * The Amazon VPC endpoint service used to communicate with the external key
     * store proxy. This field appears only when the external key store proxy
     * uses an Amazon VPC endpoint service to communicate with KMS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 64<br/>
     * <b>Pattern:
     * </b>^com\.amazonaws\.vpce\.([a-z]+-){2,3}\d+\.vpce-svc-[0-9a-z]+$<br/>
     *
     * @param vpcEndpointServiceName <p>
     *            The Amazon VPC endpoint service used to communicate with the
     *            external key store proxy. This field appears only when the
     *            external key store proxy uses an Amazon VPC endpoint service
     *            to communicate with KMS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public XksProxyConfigurationType withVpcEndpointServiceName(String vpcEndpointServiceName) {
        this.vpcEndpointServiceName = vpcEndpointServiceName;
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
        if (getConnectivity() != null)
            sb.append("Connectivity: " + getConnectivity() + ",");
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: " + getAccessKeyId() + ",");
        if (getUriEndpoint() != null)
            sb.append("UriEndpoint: " + getUriEndpoint() + ",");
        if (getUriPath() != null)
            sb.append("UriPath: " + getUriPath() + ",");
        if (getVpcEndpointServiceName() != null)
            sb.append("VpcEndpointServiceName: " + getVpcEndpointServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConnectivity() == null) ? 0 : getConnectivity().hashCode());
        hashCode = prime * hashCode
                + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getUriEndpoint() == null) ? 0 : getUriEndpoint().hashCode());
        hashCode = prime * hashCode + ((getUriPath() == null) ? 0 : getUriPath().hashCode());
        hashCode = prime
                * hashCode
                + ((getVpcEndpointServiceName() == null) ? 0 : getVpcEndpointServiceName()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof XksProxyConfigurationType == false)
            return false;
        XksProxyConfigurationType other = (XksProxyConfigurationType) obj;

        if (other.getConnectivity() == null ^ this.getConnectivity() == null)
            return false;
        if (other.getConnectivity() != null
                && other.getConnectivity().equals(this.getConnectivity()) == false)
            return false;
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null
                && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        if (other.getUriEndpoint() == null ^ this.getUriEndpoint() == null)
            return false;
        if (other.getUriEndpoint() != null
                && other.getUriEndpoint().equals(this.getUriEndpoint()) == false)
            return false;
        if (other.getUriPath() == null ^ this.getUriPath() == null)
            return false;
        if (other.getUriPath() != null && other.getUriPath().equals(this.getUriPath()) == false)
            return false;
        if (other.getVpcEndpointServiceName() == null ^ this.getVpcEndpointServiceName() == null)
            return false;
        if (other.getVpcEndpointServiceName() != null
                && other.getVpcEndpointServiceName().equals(this.getVpcEndpointServiceName()) == false)
            return false;
        return true;
    }
}
