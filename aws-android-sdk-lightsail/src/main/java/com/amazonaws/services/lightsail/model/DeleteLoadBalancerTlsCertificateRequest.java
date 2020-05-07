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
 * Deletes an SSL/TLS certificate associated with a Lightsail load balancer.
 * </p>
 * <p>
 * The <code>DeleteLoadBalancerTlsCertificate</code> operation supports
 * tag-based access control via resource tags applied to the resource identified
 * by <code>load balancer name</code>. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class DeleteLoadBalancerTlsCertificateRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The load balancer name.
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
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String certificateName;

    /**
     * <p>
     * When <code>true</code>, forces the deletion of an SSL/TLS certificate.
     * </p>
     * <p>
     * There can be two certificates associated with a Lightsail load balancer:
     * the primary and the backup. The <code>force</code> parameter is required
     * when the primary SSL/TLS certificate is in use by an instance attached to
     * the load balancer.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The load balancer name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The load balancer name.
     *         </p>
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * <p>
     * The load balancer name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param loadBalancerName <p>
     *            The load balancer name.
     *            </p>
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The load balancer name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param loadBalancerName <p>
     *            The load balancer name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLoadBalancerTlsCertificateRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The SSL/TLS certificate name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The SSL/TLS certificate name.
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
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param certificateName <p>
     *            The SSL/TLS certificate name.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param certificateName <p>
     *            The SSL/TLS certificate name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLoadBalancerTlsCertificateRequest withCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, forces the deletion of an SSL/TLS certificate.
     * </p>
     * <p>
     * There can be two certificates associated with a Lightsail load balancer:
     * the primary and the backup. The <code>force</code> parameter is required
     * when the primary SSL/TLS certificate is in use by an instance attached to
     * the load balancer.
     * </p>
     *
     * @return <p>
     *         When <code>true</code>, forces the deletion of an SSL/TLS
     *         certificate.
     *         </p>
     *         <p>
     *         There can be two certificates associated with a Lightsail load
     *         balancer: the primary and the backup. The <code>force</code>
     *         parameter is required when the primary SSL/TLS certificate is in
     *         use by an instance attached to the load balancer.
     *         </p>
     */
    public Boolean isForce() {
        return force;
    }

    /**
     * <p>
     * When <code>true</code>, forces the deletion of an SSL/TLS certificate.
     * </p>
     * <p>
     * There can be two certificates associated with a Lightsail load balancer:
     * the primary and the backup. The <code>force</code> parameter is required
     * when the primary SSL/TLS certificate is in use by an instance attached to
     * the load balancer.
     * </p>
     *
     * @return <p>
     *         When <code>true</code>, forces the deletion of an SSL/TLS
     *         certificate.
     *         </p>
     *         <p>
     *         There can be two certificates associated with a Lightsail load
     *         balancer: the primary and the backup. The <code>force</code>
     *         parameter is required when the primary SSL/TLS certificate is in
     *         use by an instance attached to the load balancer.
     *         </p>
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * <p>
     * When <code>true</code>, forces the deletion of an SSL/TLS certificate.
     * </p>
     * <p>
     * There can be two certificates associated with a Lightsail load balancer:
     * the primary and the backup. The <code>force</code> parameter is required
     * when the primary SSL/TLS certificate is in use by an instance attached to
     * the load balancer.
     * </p>
     *
     * @param force <p>
     *            When <code>true</code>, forces the deletion of an SSL/TLS
     *            certificate.
     *            </p>
     *            <p>
     *            There can be two certificates associated with a Lightsail load
     *            balancer: the primary and the backup. The <code>force</code>
     *            parameter is required when the primary SSL/TLS certificate is
     *            in use by an instance attached to the load balancer.
     *            </p>
     */
    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * When <code>true</code>, forces the deletion of an SSL/TLS certificate.
     * </p>
     * <p>
     * There can be two certificates associated with a Lightsail load balancer:
     * the primary and the backup. The <code>force</code> parameter is required
     * when the primary SSL/TLS certificate is in use by an instance attached to
     * the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param force <p>
     *            When <code>true</code>, forces the deletion of an SSL/TLS
     *            certificate.
     *            </p>
     *            <p>
     *            There can be two certificates associated with a Lightsail load
     *            balancer: the primary and the backup. The <code>force</code>
     *            parameter is required when the primary SSL/TLS certificate is
     *            in use by an instance attached to the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLoadBalancerTlsCertificateRequest withForce(Boolean force) {
        this.force = force;
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
        if (getForce() != null)
            sb.append("force: " + getForce());
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
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLoadBalancerTlsCertificateRequest == false)
            return false;
        DeleteLoadBalancerTlsCertificateRequest other = (DeleteLoadBalancerTlsCertificateRequest) obj;

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
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }
}
