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
 * Creates a Lightsail load balancer TLS certificate.
 * </p>
 * <p>
 * TLS is just an updated, more secure version of Secure Socket Layer (SSL).
 * </p>
 * <p>
 * The <code>CreateLoadBalancerTlsCertificate</code> operation supports
 * tag-based access control via resource tags applied to the resource identified
 * by <code>load balancer name</code>. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class CreateLoadBalancerTlsCertificateRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The load balancer name where you want to create the SSL/TLS certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The SSL/TLS certificate name.
     * </p>
     * <p>
     * You can have up to 10 certificates in your account at one time. Each
     * Lightsail load balancer can have up to 2 certificates associated with it
     * at one time. There is also an overall limit to the number of certificates
     * that can be issue in a 365-day period. For more information, see <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html"
     * >Limits</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String certificateName;

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for your SSL/TLS
     * certificate.
     * </p>
     */
    private String certificateDomainName;

    /**
     * <p>
     * An array of strings listing alternative domains and subdomains for your
     * SSL/TLS certificate. Lightsail will de-dupe the names for you. You can
     * have a maximum of 9 alternative names (in addition to the 1 primary
     * domain). We do not support wildcards (e.g., <code>*.example.com</code>).
     * </p>
     */
    private java.util.List<String> certificateAlternativeNames;

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The load balancer name where you want to create the SSL/TLS certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The load balancer name where you want to create the SSL/TLS
     *         certificate.
     *         </p>
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * <p>
     * The load balancer name where you want to create the SSL/TLS certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param loadBalancerName <p>
     *            The load balancer name where you want to create the SSL/TLS
     *            certificate.
     *            </p>
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The load balancer name where you want to create the SSL/TLS certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param loadBalancerName <p>
     *            The load balancer name where you want to create the SSL/TLS
     *            certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerTlsCertificateRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The SSL/TLS certificate name.
     * </p>
     * <p>
     * You can have up to 10 certificates in your account at one time. Each
     * Lightsail load balancer can have up to 2 certificates associated with it
     * at one time. There is also an overall limit to the number of certificates
     * that can be issue in a 365-day period. For more information, see <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html"
     * >Limits</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The SSL/TLS certificate name.
     *         </p>
     *         <p>
     *         You can have up to 10 certificates in your account at one time.
     *         Each Lightsail load balancer can have up to 2 certificates
     *         associated with it at one time. There is also an overall limit to
     *         the number of certificates that can be issue in a 365-day period.
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html"
     *         >Limits</a>.
     *         </p>
     */
    public String getCertificateName() {
        return certificateName;
    }

    /**
     * <p>
     * The SSL/TLS certificate name.
     * </p>
     * <p>
     * You can have up to 10 certificates in your account at one time. Each
     * Lightsail load balancer can have up to 2 certificates associated with it
     * at one time. There is also an overall limit to the number of certificates
     * that can be issue in a 365-day period. For more information, see <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html"
     * >Limits</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param certificateName <p>
     *            The SSL/TLS certificate name.
     *            </p>
     *            <p>
     *            You can have up to 10 certificates in your account at one
     *            time. Each Lightsail load balancer can have up to 2
     *            certificates associated with it at one time. There is also an
     *            overall limit to the number of certificates that can be issue
     *            in a 365-day period. For more information, see <a href=
     *            "http://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html"
     *            >Limits</a>.
     *            </p>
     */
    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The SSL/TLS certificate name.
     * </p>
     * <p>
     * You can have up to 10 certificates in your account at one time. Each
     * Lightsail load balancer can have up to 2 certificates associated with it
     * at one time. There is also an overall limit to the number of certificates
     * that can be issue in a 365-day period. For more information, see <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html"
     * >Limits</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param certificateName <p>
     *            The SSL/TLS certificate name.
     *            </p>
     *            <p>
     *            You can have up to 10 certificates in your account at one
     *            time. Each Lightsail load balancer can have up to 2
     *            certificates associated with it at one time. There is also an
     *            overall limit to the number of certificates that can be issue
     *            in a 365-day period. For more information, see <a href=
     *            "http://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html"
     *            >Limits</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerTlsCertificateRequest withCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for your SSL/TLS
     * certificate.
     * </p>
     *
     * @return <p>
     *         The domain name (e.g., <code>example.com</code>) for your SSL/TLS
     *         certificate.
     *         </p>
     */
    public String getCertificateDomainName() {
        return certificateDomainName;
    }

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for your SSL/TLS
     * certificate.
     * </p>
     *
     * @param certificateDomainName <p>
     *            The domain name (e.g., <code>example.com</code>) for your
     *            SSL/TLS certificate.
     *            </p>
     */
    public void setCertificateDomainName(String certificateDomainName) {
        this.certificateDomainName = certificateDomainName;
    }

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for your SSL/TLS
     * certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateDomainName <p>
     *            The domain name (e.g., <code>example.com</code>) for your
     *            SSL/TLS certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerTlsCertificateRequest withCertificateDomainName(
            String certificateDomainName) {
        this.certificateDomainName = certificateDomainName;
        return this;
    }

    /**
     * <p>
     * An array of strings listing alternative domains and subdomains for your
     * SSL/TLS certificate. Lightsail will de-dupe the names for you. You can
     * have a maximum of 9 alternative names (in addition to the 1 primary
     * domain). We do not support wildcards (e.g., <code>*.example.com</code>).
     * </p>
     *
     * @return <p>
     *         An array of strings listing alternative domains and subdomains
     *         for your SSL/TLS certificate. Lightsail will de-dupe the names
     *         for you. You can have a maximum of 9 alternative names (in
     *         addition to the 1 primary domain). We do not support wildcards
     *         (e.g., <code>*.example.com</code>).
     *         </p>
     */
    public java.util.List<String> getCertificateAlternativeNames() {
        return certificateAlternativeNames;
    }

    /**
     * <p>
     * An array of strings listing alternative domains and subdomains for your
     * SSL/TLS certificate. Lightsail will de-dupe the names for you. You can
     * have a maximum of 9 alternative names (in addition to the 1 primary
     * domain). We do not support wildcards (e.g., <code>*.example.com</code>).
     * </p>
     *
     * @param certificateAlternativeNames <p>
     *            An array of strings listing alternative domains and subdomains
     *            for your SSL/TLS certificate. Lightsail will de-dupe the names
     *            for you. You can have a maximum of 9 alternative names (in
     *            addition to the 1 primary domain). We do not support wildcards
     *            (e.g., <code>*.example.com</code>).
     *            </p>
     */
    public void setCertificateAlternativeNames(
            java.util.Collection<String> certificateAlternativeNames) {
        if (certificateAlternativeNames == null) {
            this.certificateAlternativeNames = null;
            return;
        }

        this.certificateAlternativeNames = new java.util.ArrayList<String>(
                certificateAlternativeNames);
    }

    /**
     * <p>
     * An array of strings listing alternative domains and subdomains for your
     * SSL/TLS certificate. Lightsail will de-dupe the names for you. You can
     * have a maximum of 9 alternative names (in addition to the 1 primary
     * domain). We do not support wildcards (e.g., <code>*.example.com</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateAlternativeNames <p>
     *            An array of strings listing alternative domains and subdomains
     *            for your SSL/TLS certificate. Lightsail will de-dupe the names
     *            for you. You can have a maximum of 9 alternative names (in
     *            addition to the 1 primary domain). We do not support wildcards
     *            (e.g., <code>*.example.com</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerTlsCertificateRequest withCertificateAlternativeNames(
            String... certificateAlternativeNames) {
        if (getCertificateAlternativeNames() == null) {
            this.certificateAlternativeNames = new java.util.ArrayList<String>(
                    certificateAlternativeNames.length);
        }
        for (String value : certificateAlternativeNames) {
            this.certificateAlternativeNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings listing alternative domains and subdomains for your
     * SSL/TLS certificate. Lightsail will de-dupe the names for you. You can
     * have a maximum of 9 alternative names (in addition to the 1 primary
     * domain). We do not support wildcards (e.g., <code>*.example.com</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateAlternativeNames <p>
     *            An array of strings listing alternative domains and subdomains
     *            for your SSL/TLS certificate. Lightsail will de-dupe the names
     *            for you. You can have a maximum of 9 alternative names (in
     *            addition to the 1 primary domain). We do not support wildcards
     *            (e.g., <code>*.example.com</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerTlsCertificateRequest withCertificateAlternativeNames(
            java.util.Collection<String> certificateAlternativeNames) {
        setCertificateAlternativeNames(certificateAlternativeNames);
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     *
     * @return <p>
     *         The tag keys and optional values to add to the resource during
     *         create.
     *         </p>
     *         <p>
     *         To tag a resource after it has been created, see the
     *         <code>tag resource</code> operation.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     *
     * @param tags <p>
     *            The tag keys and optional values to add to the resource during
     *            create.
     *            </p>
     *            <p>
     *            To tag a resource after it has been created, see the
     *            <code>tag resource</code> operation.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag keys and optional values to add to the resource during
     *            create.
     *            </p>
     *            <p>
     *            To tag a resource after it has been created, see the
     *            <code>tag resource</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerTlsCertificateRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag keys and optional values to add to the resource during
     *            create.
     *            </p>
     *            <p>
     *            To tag a resource after it has been created, see the
     *            <code>tag resource</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerTlsCertificateRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
            sb.append("certificateName: " + getCertificateName() + ",");
        if (getCertificateDomainName() != null)
            sb.append("certificateDomainName: " + getCertificateDomainName() + ",");
        if (getCertificateAlternativeNames() != null)
            sb.append("certificateAlternativeNames: " + getCertificateAlternativeNames() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
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
        hashCode = prime
                * hashCode
                + ((getCertificateDomainName() == null) ? 0 : getCertificateDomainName().hashCode());
        hashCode = prime
                * hashCode
                + ((getCertificateAlternativeNames() == null) ? 0
                        : getCertificateAlternativeNames().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLoadBalancerTlsCertificateRequest == false)
            return false;
        CreateLoadBalancerTlsCertificateRequest other = (CreateLoadBalancerTlsCertificateRequest) obj;

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
        if (other.getCertificateDomainName() == null ^ this.getCertificateDomainName() == null)
            return false;
        if (other.getCertificateDomainName() != null
                && other.getCertificateDomainName().equals(this.getCertificateDomainName()) == false)
            return false;
        if (other.getCertificateAlternativeNames() == null
                ^ this.getCertificateAlternativeNames() == null)
            return false;
        if (other.getCertificateAlternativeNames() != null
                && other.getCertificateAlternativeNames().equals(
                        this.getCertificateAlternativeNames()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
