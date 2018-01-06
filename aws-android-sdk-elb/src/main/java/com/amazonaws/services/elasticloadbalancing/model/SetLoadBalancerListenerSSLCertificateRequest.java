/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the certificate that terminates the specified listener's SSL
 * connections. The specified certificate replaces any prior certificate that
 * was used on the same load balancer and port.
 * </p>
 * <p>
 * For more information about updating your SSL certificate, see <a href=
 * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_UpdatingLoadBalancerSSL.html"
 * >Updating an SSL Certificate for a Load Balancer</a> in the <i>Elastic Load
 * Balancing Developer Guide</i>.
 * </p>
 */
public class SetLoadBalancerListenerSSLCertificateRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The port that uses the specified SSL certificate.
     * </p>
     */
    private Integer loadBalancerPort;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SSL certificate.
     * </p>
     */
    private String sSLCertificateId;

    /**
     * Default constructor for SetLoadBalancerListenerSSLCertificateRequest
     * object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     */
    public SetLoadBalancerListenerSSLCertificateRequest() {
    }

    /**
     * Constructs a new SetLoadBalancerListenerSSLCertificateRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     * @param loadBalancerPort <p>
     *            The port that uses the specified SSL certificate.
     *            </p>
     * @param sSLCertificateId <p>
     *            The Amazon Resource Name (ARN) of the SSL certificate.
     *            </p>
     */
    public SetLoadBalancerListenerSSLCertificateRequest(String loadBalancerName,
            Integer loadBalancerPort, String sSLCertificateId) {
        setLoadBalancerName(loadBalancerName);
        setLoadBalancerPort(loadBalancerPort);
        setSSLCertificateId(sSLCertificateId);
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     *
     * @return <p>
     *         The name of the load balancer.
     *         </p>
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     *
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetLoadBalancerListenerSSLCertificateRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The port that uses the specified SSL certificate.
     * </p>
     *
     * @return <p>
     *         The port that uses the specified SSL certificate.
     *         </p>
     */
    public Integer getLoadBalancerPort() {
        return loadBalancerPort;
    }

    /**
     * <p>
     * The port that uses the specified SSL certificate.
     * </p>
     *
     * @param loadBalancerPort <p>
     *            The port that uses the specified SSL certificate.
     *            </p>
     */
    public void setLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
    }

    /**
     * <p>
     * The port that uses the specified SSL certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerPort <p>
     *            The port that uses the specified SSL certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetLoadBalancerListenerSSLCertificateRequest withLoadBalancerPort(
            Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SSL certificate.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the SSL certificate.
     *         </p>
     */
    public String getSSLCertificateId() {
        return sSLCertificateId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SSL certificate.
     * </p>
     *
     * @param sSLCertificateId <p>
     *            The Amazon Resource Name (ARN) of the SSL certificate.
     *            </p>
     */
    public void setSSLCertificateId(String sSLCertificateId) {
        this.sSLCertificateId = sSLCertificateId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SSL certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSLCertificateId <p>
     *            The Amazon Resource Name (ARN) of the SSL certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetLoadBalancerListenerSSLCertificateRequest withSSLCertificateId(String sSLCertificateId) {
        this.sSLCertificateId = sSLCertificateId;
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
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: " + getLoadBalancerName() + ",");
        if (getLoadBalancerPort() != null)
            sb.append("LoadBalancerPort: " + getLoadBalancerPort() + ",");
        if (getSSLCertificateId() != null)
            sb.append("SSLCertificateId: " + getSSLCertificateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode
                + ((getLoadBalancerPort() == null) ? 0 : getLoadBalancerPort().hashCode());
        hashCode = prime * hashCode
                + ((getSSLCertificateId() == null) ? 0 : getSSLCertificateId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetLoadBalancerListenerSSLCertificateRequest == false)
            return false;
        SetLoadBalancerListenerSSLCertificateRequest other = (SetLoadBalancerListenerSSLCertificateRequest) obj;

        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getLoadBalancerPort() == null ^ this.getLoadBalancerPort() == null)
            return false;
        if (other.getLoadBalancerPort() != null
                && other.getLoadBalancerPort().equals(this.getLoadBalancerPort()) == false)
            return false;
        if (other.getSSLCertificateId() == null ^ this.getSSLCertificateId() == null)
            return false;
        if (other.getSSLCertificateId() != null
                && other.getSSLCertificateId().equals(this.getSSLCertificateId()) == false)
            return false;
        return true;
    }
}
