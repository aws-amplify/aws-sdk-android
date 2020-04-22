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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * Options to configure endpoint for the Elasticsearch domain.
 * </p>
 */
public class DomainEndpointOptions implements Serializable {
    /**
     * <p>
     * Specify if only HTTPS endpoint should be enabled for the Elasticsearch
     * domain.
     * </p>
     */
    private Boolean enforceHTTPS;

    /**
     * <p>
     * Specify the TLS security policy that needs to be applied to the HTTPS
     * endpoint of Elasticsearch domain. <br/>
     * It can be one of the following values:
     * <ul>
     * <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy which
     * supports TLSv1.0 and higher.</li>
     * <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy which
     * supports only TLSv1.2</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Policy-Min-TLS-1-0-2019-07,
     * Policy-Min-TLS-1-2-2019-07
     */
    private String tLSSecurityPolicy;

    /**
     * <p>
     * Specify if only HTTPS endpoint should be enabled for the Elasticsearch
     * domain.
     * </p>
     *
     * @return <p>
     *         Specify if only HTTPS endpoint should be enabled for the
     *         Elasticsearch domain.
     *         </p>
     */
    public Boolean isEnforceHTTPS() {
        return enforceHTTPS;
    }

    /**
     * <p>
     * Specify if only HTTPS endpoint should be enabled for the Elasticsearch
     * domain.
     * </p>
     *
     * @return <p>
     *         Specify if only HTTPS endpoint should be enabled for the
     *         Elasticsearch domain.
     *         </p>
     */
    public Boolean getEnforceHTTPS() {
        return enforceHTTPS;
    }

    /**
     * <p>
     * Specify if only HTTPS endpoint should be enabled for the Elasticsearch
     * domain.
     * </p>
     *
     * @param enforceHTTPS <p>
     *            Specify if only HTTPS endpoint should be enabled for the
     *            Elasticsearch domain.
     *            </p>
     */
    public void setEnforceHTTPS(Boolean enforceHTTPS) {
        this.enforceHTTPS = enforceHTTPS;
    }

    /**
     * <p>
     * Specify if only HTTPS endpoint should be enabled for the Elasticsearch
     * domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enforceHTTPS <p>
     *            Specify if only HTTPS endpoint should be enabled for the
     *            Elasticsearch domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainEndpointOptions withEnforceHTTPS(Boolean enforceHTTPS) {
        this.enforceHTTPS = enforceHTTPS;
        return this;
    }

    /**
     * <p>
     * Specify the TLS security policy that needs to be applied to the HTTPS
     * endpoint of Elasticsearch domain. <br/>
     * It can be one of the following values:
     * <ul>
     * <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy which
     * supports TLSv1.0 and higher.</li>
     * <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy which
     * supports only TLSv1.2</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Policy-Min-TLS-1-0-2019-07,
     * Policy-Min-TLS-1-2-2019-07
     *
     * @return <p>
     *         Specify the TLS security policy that needs to be applied to the
     *         HTTPS endpoint of Elasticsearch domain. <br/>
     *         It can be one of the following values:
     *         <ul>
     *         <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy which
     *         supports TLSv1.0 and higher.</li>
     *         <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy which
     *         supports only TLSv1.2</li>
     *         </ul>
     *         </p>
     * @see TLSSecurityPolicy
     */
    public String getTLSSecurityPolicy() {
        return tLSSecurityPolicy;
    }

    /**
     * <p>
     * Specify the TLS security policy that needs to be applied to the HTTPS
     * endpoint of Elasticsearch domain. <br/>
     * It can be one of the following values:
     * <ul>
     * <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy which
     * supports TLSv1.0 and higher.</li>
     * <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy which
     * supports only TLSv1.2</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Policy-Min-TLS-1-0-2019-07,
     * Policy-Min-TLS-1-2-2019-07
     *
     * @param tLSSecurityPolicy <p>
     *            Specify the TLS security policy that needs to be applied to
     *            the HTTPS endpoint of Elasticsearch domain. <br/>
     *            It can be one of the following values:
     *            <ul>
     *            <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy
     *            which supports TLSv1.0 and higher.</li>
     *            <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy
     *            which supports only TLSv1.2</li>
     *            </ul>
     *            </p>
     * @see TLSSecurityPolicy
     */
    public void setTLSSecurityPolicy(String tLSSecurityPolicy) {
        this.tLSSecurityPolicy = tLSSecurityPolicy;
    }

    /**
     * <p>
     * Specify the TLS security policy that needs to be applied to the HTTPS
     * endpoint of Elasticsearch domain. <br/>
     * It can be one of the following values:
     * <ul>
     * <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy which
     * supports TLSv1.0 and higher.</li>
     * <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy which
     * supports only TLSv1.2</li>
     * </ul>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Policy-Min-TLS-1-0-2019-07,
     * Policy-Min-TLS-1-2-2019-07
     *
     * @param tLSSecurityPolicy <p>
     *            Specify the TLS security policy that needs to be applied to
     *            the HTTPS endpoint of Elasticsearch domain. <br/>
     *            It can be one of the following values:
     *            <ul>
     *            <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy
     *            which supports TLSv1.0 and higher.</li>
     *            <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy
     *            which supports only TLSv1.2</li>
     *            </ul>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TLSSecurityPolicy
     */
    public DomainEndpointOptions withTLSSecurityPolicy(String tLSSecurityPolicy) {
        this.tLSSecurityPolicy = tLSSecurityPolicy;
        return this;
    }

    /**
     * <p>
     * Specify the TLS security policy that needs to be applied to the HTTPS
     * endpoint of Elasticsearch domain. <br/>
     * It can be one of the following values:
     * <ul>
     * <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy which
     * supports TLSv1.0 and higher.</li>
     * <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy which
     * supports only TLSv1.2</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Policy-Min-TLS-1-0-2019-07,
     * Policy-Min-TLS-1-2-2019-07
     *
     * @param tLSSecurityPolicy <p>
     *            Specify the TLS security policy that needs to be applied to
     *            the HTTPS endpoint of Elasticsearch domain. <br/>
     *            It can be one of the following values:
     *            <ul>
     *            <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy
     *            which supports TLSv1.0 and higher.</li>
     *            <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy
     *            which supports only TLSv1.2</li>
     *            </ul>
     *            </p>
     * @see TLSSecurityPolicy
     */
    public void setTLSSecurityPolicy(TLSSecurityPolicy tLSSecurityPolicy) {
        this.tLSSecurityPolicy = tLSSecurityPolicy.toString();
    }

    /**
     * <p>
     * Specify the TLS security policy that needs to be applied to the HTTPS
     * endpoint of Elasticsearch domain. <br/>
     * It can be one of the following values:
     * <ul>
     * <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy which
     * supports TLSv1.0 and higher.</li>
     * <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy which
     * supports only TLSv1.2</li>
     * </ul>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Policy-Min-TLS-1-0-2019-07,
     * Policy-Min-TLS-1-2-2019-07
     *
     * @param tLSSecurityPolicy <p>
     *            Specify the TLS security policy that needs to be applied to
     *            the HTTPS endpoint of Elasticsearch domain. <br/>
     *            It can be one of the following values:
     *            <ul>
     *            <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy
     *            which supports TLSv1.0 and higher.</li>
     *            <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy
     *            which supports only TLSv1.2</li>
     *            </ul>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TLSSecurityPolicy
     */
    public DomainEndpointOptions withTLSSecurityPolicy(TLSSecurityPolicy tLSSecurityPolicy) {
        this.tLSSecurityPolicy = tLSSecurityPolicy.toString();
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
        if (getEnforceHTTPS() != null)
            sb.append("EnforceHTTPS: " + getEnforceHTTPS() + ",");
        if (getTLSSecurityPolicy() != null)
            sb.append("TLSSecurityPolicy: " + getTLSSecurityPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEnforceHTTPS() == null) ? 0 : getEnforceHTTPS().hashCode());
        hashCode = prime * hashCode
                + ((getTLSSecurityPolicy() == null) ? 0 : getTLSSecurityPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainEndpointOptions == false)
            return false;
        DomainEndpointOptions other = (DomainEndpointOptions) obj;

        if (other.getEnforceHTTPS() == null ^ this.getEnforceHTTPS() == null)
            return false;
        if (other.getEnforceHTTPS() != null
                && other.getEnforceHTTPS().equals(this.getEnforceHTTPS()) == false)
            return false;
        if (other.getTLSSecurityPolicy() == null ^ this.getTLSSecurityPolicy() == null)
            return false;
        if (other.getTLSSecurityPolicy() != null
                && other.getTLSSecurityPolicy().equals(this.getTLSSecurityPolicy()) == false)
            return false;
        return true;
    }
}
