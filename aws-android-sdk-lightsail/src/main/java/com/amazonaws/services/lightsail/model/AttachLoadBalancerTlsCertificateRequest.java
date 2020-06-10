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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Attaches a Transport Layer Security (TLS) certificate to your load balancer.
 * TLS is just an updated, more secure version of Secure Socket Layer (SSL).
 * </p>
 * <p>
 * Once you create and validate your certificate, you can attach it to your load
 * balancer. You can also use this API to rotate the certificates on your
 * account. Use the <code>AttachLoadBalancerTlsCertificate</code> action with
 * the non-attached certificate, and it will replace the existing one and become
 * the attached certificate.
 * </p>
 * <p>
 * The <code>AttachLoadBalancerTlsCertificate</code> operation supports
 * tag-based access control via resource tags applied to the resource identified
 * by <code>load balancer name</code>. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class AttachLoadBalancerTlsCertificateRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the load balancer to which you want to associate the SSL/TLS
     * certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The name of your SSL/TLS certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String certificateName;

    /**
     * <p>
     * The name of the load balancer to which you want to associate the SSL/TLS
     * certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the load balancer to which you want to associate the
     *         SSL/TLS certificate.
     *         </p>
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer to which you want to associate the SSL/TLS
     * certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param loadBalancerName <p>
     *            The name of the load balancer to which you want to associate
     *            the SSL/TLS certificate.
     *            </p>
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer to which you want to associate the SSL/TLS
     * certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param loadBalancerName <p>
     *            The name of the load balancer to which you want to associate
     *            the SSL/TLS certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachLoadBalancerTlsCertificateRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The name of your SSL/TLS certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of your SSL/TLS certificate.
     *         </p>
     */
    public String getCertificateName() {
        return certificateName;
    }

    /**
     * <p>
     * The name of your SSL/TLS certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param certificateName <p>
     *            The name of your SSL/TLS certificate.
     *            </p>
     */
    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The name of your SSL/TLS certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param certificateName <p>
     *            The name of your SSL/TLS certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachLoadBalancerTlsCertificateRequest withCertificateName(String certificateName) {
        this.certificateName = certificateName;
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
            sb.append("loadBalancerName: " + getLoadBalancerName() + ",");
        if (getCertificateName() != null)
            sb.append("certificateName: " + getCertificateName());
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
                + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachLoadBalancerTlsCertificateRequest == false)
            return false;
        AttachLoadBalancerTlsCertificateRequest other = (AttachLoadBalancerTlsCertificateRequest) obj;

        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getCertificateName() == null ^ this.getCertificateName() == null)
            return false;
        if (other.getCertificateName() != null
                && other.getCertificateName().equals(this.getCertificateName()) == false)
            return false;
        return true;
    }
}
