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
 * Creates a Lightsail load balancer. To learn more about deciding whether to
 * load balance your application, see <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/how-to/article/configure-lightsail-instances-for-load-balancing"
 * >Configure your Lightsail instances for load balancing</a>. You can create up
 * to 5 load balancers per AWS Region in your account.
 * </p>
 * <p>
 * When you create a load balancer, you can specify a unique name and port
 * settings. To change additional load balancer settings, use the
 * <code>UpdateLoadBalancerAttribute</code> operation.
 * </p>
 * <p>
 * The <code>create load balancer</code> operation supports tag-based access
 * control via request tags. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class CreateLoadBalancerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of your load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The instance port where you're creating your load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 65535<br/>
     */
    private Integer instancePort;

    /**
     * <p>
     * The path you provided to perform the load balancer health check. If you
     * didn't specify a health check path, Lightsail uses the root path of your
     * website (e.g., <code>"/"</code>).
     * </p>
     * <p>
     * You may want to specify a custom health check path other than the root of
     * your application if your home page loads slowly or has a lot of media or
     * scripting on it.
     * </p>
     */
    private String healthCheckPath;

    /**
     * <p>
     * The name of the SSL/TLS certificate.
     * </p>
     * <p>
     * If you specify <code>certificateName</code>, then
     * <code>certificateDomainName</code> is required (and vice-versa).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String certificateName;

    /**
     * <p>
     * The domain name with which your certificate is associated (e.g.,
     * <code>example.com</code>).
     * </p>
     * <p>
     * If you specify <code>certificateDomainName</code>, then
     * <code>certificateName</code> is required (and vice-versa).
     * </p>
     */
    private String certificateDomainName;

    /**
     * <p>
     * The optional alternative domains and subdomains to use with your SSL/TLS
     * certificate (e.g., <code>www.example.com</code>, <code>example.com</code>, <code>m.example.com</code>, <code>blog.example.com</code>).
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
     * The name of your load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of your load balancer.
     *         </p>
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * <p>
     * The name of your load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param loadBalancerName <p>
     *            The name of your load balancer.
     *            </p>
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of your load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param loadBalancerName <p>
     *            The name of your load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The instance port where you're creating your load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 65535<br/>
     *
     * @return <p>
     *         The instance port where you're creating your load balancer.
     *         </p>
     */
    public Integer getInstancePort() {
        return instancePort;
    }

    /**
     * <p>
     * The instance port where you're creating your load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 65535<br/>
     *
     * @param instancePort <p>
     *            The instance port where you're creating your load balancer.
     *            </p>
     */
    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }

    /**
     * <p>
     * The instance port where you're creating your load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 65535<br/>
     *
     * @param instancePort <p>
     *            The instance port where you're creating your load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerRequest withInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
        return this;
    }

    /**
     * <p>
     * The path you provided to perform the load balancer health check. If you
     * didn't specify a health check path, Lightsail uses the root path of your
     * website (e.g., <code>"/"</code>).
     * </p>
     * <p>
     * You may want to specify a custom health check path other than the root of
     * your application if your home page loads slowly or has a lot of media or
     * scripting on it.
     * </p>
     *
     * @return <p>
     *         The path you provided to perform the load balancer health check.
     *         If you didn't specify a health check path, Lightsail uses the
     *         root path of your website (e.g., <code>"/"</code>).
     *         </p>
     *         <p>
     *         You may want to specify a custom health check path other than the
     *         root of your application if your home page loads slowly or has a
     *         lot of media or scripting on it.
     *         </p>
     */
    public String getHealthCheckPath() {
        return healthCheckPath;
    }

    /**
     * <p>
     * The path you provided to perform the load balancer health check. If you
     * didn't specify a health check path, Lightsail uses the root path of your
     * website (e.g., <code>"/"</code>).
     * </p>
     * <p>
     * You may want to specify a custom health check path other than the root of
     * your application if your home page loads slowly or has a lot of media or
     * scripting on it.
     * </p>
     *
     * @param healthCheckPath <p>
     *            The path you provided to perform the load balancer health
     *            check. If you didn't specify a health check path, Lightsail
     *            uses the root path of your website (e.g., <code>"/"</code>).
     *            </p>
     *            <p>
     *            You may want to specify a custom health check path other than
     *            the root of your application if your home page loads slowly or
     *            has a lot of media or scripting on it.
     *            </p>
     */
    public void setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
    }

    /**
     * <p>
     * The path you provided to perform the load balancer health check. If you
     * didn't specify a health check path, Lightsail uses the root path of your
     * website (e.g., <code>"/"</code>).
     * </p>
     * <p>
     * You may want to specify a custom health check path other than the root of
     * your application if your home page loads slowly or has a lot of media or
     * scripting on it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthCheckPath <p>
     *            The path you provided to perform the load balancer health
     *            check. If you didn't specify a health check path, Lightsail
     *            uses the root path of your website (e.g., <code>"/"</code>).
     *            </p>
     *            <p>
     *            You may want to specify a custom health check path other than
     *            the root of your application if your home page loads slowly or
     *            has a lot of media or scripting on it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerRequest withHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }

    /**
     * <p>
     * The name of the SSL/TLS certificate.
     * </p>
     * <p>
     * If you specify <code>certificateName</code>, then
     * <code>certificateDomainName</code> is required (and vice-versa).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the SSL/TLS certificate.
     *         </p>
     *         <p>
     *         If you specify <code>certificateName</code>, then
     *         <code>certificateDomainName</code> is required (and vice-versa).
     *         </p>
     */
    public String getCertificateName() {
        return certificateName;
    }

    /**
     * <p>
     * The name of the SSL/TLS certificate.
     * </p>
     * <p>
     * If you specify <code>certificateName</code>, then
     * <code>certificateDomainName</code> is required (and vice-versa).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param certificateName <p>
     *            The name of the SSL/TLS certificate.
     *            </p>
     *            <p>
     *            If you specify <code>certificateName</code>, then
     *            <code>certificateDomainName</code> is required (and
     *            vice-versa).
     *            </p>
     */
    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The name of the SSL/TLS certificate.
     * </p>
     * <p>
     * If you specify <code>certificateName</code>, then
     * <code>certificateDomainName</code> is required (and vice-versa).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param certificateName <p>
     *            The name of the SSL/TLS certificate.
     *            </p>
     *            <p>
     *            If you specify <code>certificateName</code>, then
     *            <code>certificateDomainName</code> is required (and
     *            vice-versa).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerRequest withCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }

    /**
     * <p>
     * The domain name with which your certificate is associated (e.g.,
     * <code>example.com</code>).
     * </p>
     * <p>
     * If you specify <code>certificateDomainName</code>, then
     * <code>certificateName</code> is required (and vice-versa).
     * </p>
     *
     * @return <p>
     *         The domain name with which your certificate is associated (e.g.,
     *         <code>example.com</code>).
     *         </p>
     *         <p>
     *         If you specify <code>certificateDomainName</code>, then
     *         <code>certificateName</code> is required (and vice-versa).
     *         </p>
     */
    public String getCertificateDomainName() {
        return certificateDomainName;
    }

    /**
     * <p>
     * The domain name with which your certificate is associated (e.g.,
     * <code>example.com</code>).
     * </p>
     * <p>
     * If you specify <code>certificateDomainName</code>, then
     * <code>certificateName</code> is required (and vice-versa).
     * </p>
     *
     * @param certificateDomainName <p>
     *            The domain name with which your certificate is associated
     *            (e.g., <code>example.com</code>).
     *            </p>
     *            <p>
     *            If you specify <code>certificateDomainName</code>, then
     *            <code>certificateName</code> is required (and vice-versa).
     *            </p>
     */
    public void setCertificateDomainName(String certificateDomainName) {
        this.certificateDomainName = certificateDomainName;
    }

    /**
     * <p>
     * The domain name with which your certificate is associated (e.g.,
     * <code>example.com</code>).
     * </p>
     * <p>
     * If you specify <code>certificateDomainName</code>, then
     * <code>certificateName</code> is required (and vice-versa).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateDomainName <p>
     *            The domain name with which your certificate is associated
     *            (e.g., <code>example.com</code>).
     *            </p>
     *            <p>
     *            If you specify <code>certificateDomainName</code>, then
     *            <code>certificateName</code> is required (and vice-versa).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerRequest withCertificateDomainName(String certificateDomainName) {
        this.certificateDomainName = certificateDomainName;
        return this;
    }

    /**
     * <p>
     * The optional alternative domains and subdomains to use with your SSL/TLS
     * certificate (e.g., <code>www.example.com</code>, <code>example.com</code>, <code>m.example.com</code>, <code>blog.example.com</code>).
     * </p>
     *
     * @return <p>
     *         The optional alternative domains and subdomains to use with your
     *         SSL/TLS certificate (e.g., <code>www.example.com</code>,
     *         <code>example.com</code>, <code>m.example.com</code>,
     *         <code>blog.example.com</code>).
     *         </p>
     */
    public java.util.List<String> getCertificateAlternativeNames() {
        return certificateAlternativeNames;
    }

    /**
     * <p>
     * The optional alternative domains and subdomains to use with your SSL/TLS
     * certificate (e.g., <code>www.example.com</code>, <code>example.com</code>, <code>m.example.com</code>, <code>blog.example.com</code>).
     * </p>
     *
     * @param certificateAlternativeNames <p>
     *            The optional alternative domains and subdomains to use with
     *            your SSL/TLS certificate (e.g., <code>www.example.com</code>,
     *            <code>example.com</code>, <code>m.example.com</code>,
     *            <code>blog.example.com</code>).
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
     * The optional alternative domains and subdomains to use with your SSL/TLS
     * certificate (e.g., <code>www.example.com</code>, <code>example.com</code>, <code>m.example.com</code>, <code>blog.example.com</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateAlternativeNames <p>
     *            The optional alternative domains and subdomains to use with
     *            your SSL/TLS certificate (e.g., <code>www.example.com</code>,
     *            <code>example.com</code>, <code>m.example.com</code>,
     *            <code>blog.example.com</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerRequest withCertificateAlternativeNames(
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
     * The optional alternative domains and subdomains to use with your SSL/TLS
     * certificate (e.g., <code>www.example.com</code>, <code>example.com</code>, <code>m.example.com</code>, <code>blog.example.com</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateAlternativeNames <p>
     *            The optional alternative domains and subdomains to use with
     *            your SSL/TLS certificate (e.g., <code>www.example.com</code>,
     *            <code>example.com</code>, <code>m.example.com</code>,
     *            <code>blog.example.com</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerRequest withCertificateAlternativeNames(
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
    public CreateLoadBalancerRequest withTags(Tag... tags) {
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
    public CreateLoadBalancerRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getInstancePort() != null)
            sb.append("instancePort: " + getInstancePort() + ",");
        if (getHealthCheckPath() != null)
            sb.append("healthCheckPath: " + getHealthCheckPath() + ",");
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
                + ((getInstancePort() == null) ? 0 : getInstancePort().hashCode());
        hashCode = prime * hashCode
                + ((getHealthCheckPath() == null) ? 0 : getHealthCheckPath().hashCode());
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

        if (obj instanceof CreateLoadBalancerRequest == false)
            return false;
        CreateLoadBalancerRequest other = (CreateLoadBalancerRequest) obj;

        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getInstancePort() == null ^ this.getInstancePort() == null)
            return false;
        if (other.getInstancePort() != null
                && other.getInstancePort().equals(this.getInstancePort()) == false)
            return false;
        if (other.getHealthCheckPath() == null ^ this.getHealthCheckPath() == null)
            return false;
        if (other.getHealthCheckPath() != null
                && other.getHealthCheckPath().equals(this.getHealthCheckPath()) == false)
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
