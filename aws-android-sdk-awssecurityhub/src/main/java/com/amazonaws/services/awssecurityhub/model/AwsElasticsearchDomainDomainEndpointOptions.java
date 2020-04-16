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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Additional options for the domain endpoint, such as whether to require HTTPS
 * for all traffic.
 * </p>
 */
public class AwsElasticsearchDomainDomainEndpointOptions implements Serializable {
    /**
     * <p>
     * Whether to require that all traffic to the domain arrive over HTTPS.
     * </p>
     */
    private Boolean enforceHTTPS;

    /**
     * <p>
     * The TLS security policy to apply to the HTTPS endpoint of the
     * Elasticsearch domain.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Policy-Min-TLS-1-0-2019-07</code>, which supports TLSv1.0 and
     * higher
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy-Min-TLS-1-2-2019-07</code>, which only supports TLSv1.2
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String tLSSecurityPolicy;

    /**
     * <p>
     * Whether to require that all traffic to the domain arrive over HTTPS.
     * </p>
     *
     * @return <p>
     *         Whether to require that all traffic to the domain arrive over
     *         HTTPS.
     *         </p>
     */
    public Boolean isEnforceHTTPS() {
        return enforceHTTPS;
    }

    /**
     * <p>
     * Whether to require that all traffic to the domain arrive over HTTPS.
     * </p>
     *
     * @return <p>
     *         Whether to require that all traffic to the domain arrive over
     *         HTTPS.
     *         </p>
     */
    public Boolean getEnforceHTTPS() {
        return enforceHTTPS;
    }

    /**
     * <p>
     * Whether to require that all traffic to the domain arrive over HTTPS.
     * </p>
     *
     * @param enforceHTTPS <p>
     *            Whether to require that all traffic to the domain arrive over
     *            HTTPS.
     *            </p>
     */
    public void setEnforceHTTPS(Boolean enforceHTTPS) {
        this.enforceHTTPS = enforceHTTPS;
    }

    /**
     * <p>
     * Whether to require that all traffic to the domain arrive over HTTPS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enforceHTTPS <p>
     *            Whether to require that all traffic to the domain arrive over
     *            HTTPS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElasticsearchDomainDomainEndpointOptions withEnforceHTTPS(Boolean enforceHTTPS) {
        this.enforceHTTPS = enforceHTTPS;
        return this;
    }

    /**
     * <p>
     * The TLS security policy to apply to the HTTPS endpoint of the
     * Elasticsearch domain.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Policy-Min-TLS-1-0-2019-07</code>, which supports TLSv1.0 and
     * higher
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy-Min-TLS-1-2-2019-07</code>, which only supports TLSv1.2
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The TLS security policy to apply to the HTTPS endpoint of the
     *         Elasticsearch domain.
     *         </p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Policy-Min-TLS-1-0-2019-07</code>, which supports TLSv1.0
     *         and higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Policy-Min-TLS-1-2-2019-07</code>, which only supports
     *         TLSv1.2
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getTLSSecurityPolicy() {
        return tLSSecurityPolicy;
    }

    /**
     * <p>
     * The TLS security policy to apply to the HTTPS endpoint of the
     * Elasticsearch domain.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Policy-Min-TLS-1-0-2019-07</code>, which supports TLSv1.0 and
     * higher
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy-Min-TLS-1-2-2019-07</code>, which only supports TLSv1.2
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param tLSSecurityPolicy <p>
     *            The TLS security policy to apply to the HTTPS endpoint of the
     *            Elasticsearch domain.
     *            </p>
     *            <p>
     *            Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Policy-Min-TLS-1-0-2019-07</code>, which supports
     *            TLSv1.0 and higher
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Policy-Min-TLS-1-2-2019-07</code>, which only supports
     *            TLSv1.2
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTLSSecurityPolicy(String tLSSecurityPolicy) {
        this.tLSSecurityPolicy = tLSSecurityPolicy;
    }

    /**
     * <p>
     * The TLS security policy to apply to the HTTPS endpoint of the
     * Elasticsearch domain.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Policy-Min-TLS-1-0-2019-07</code>, which supports TLSv1.0 and
     * higher
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy-Min-TLS-1-2-2019-07</code>, which only supports TLSv1.2
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param tLSSecurityPolicy <p>
     *            The TLS security policy to apply to the HTTPS endpoint of the
     *            Elasticsearch domain.
     *            </p>
     *            <p>
     *            Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Policy-Min-TLS-1-0-2019-07</code>, which supports
     *            TLSv1.0 and higher
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Policy-Min-TLS-1-2-2019-07</code>, which only supports
     *            TLSv1.2
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElasticsearchDomainDomainEndpointOptions withTLSSecurityPolicy(
            String tLSSecurityPolicy) {
        this.tLSSecurityPolicy = tLSSecurityPolicy;
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

        if (obj instanceof AwsElasticsearchDomainDomainEndpointOptions == false)
            return false;
        AwsElasticsearchDomainDomainEndpointOptions other = (AwsElasticsearchDomainDomainEndpointOptions) obj;

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
