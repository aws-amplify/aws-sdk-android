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

/**
 * <p>
 * Provides a summary of SSL/TLS certificate metadata.
 * </p>
 */
public class LoadBalancerTlsCertificateSummary implements Serializable {
    /**
     * <p>
     * The name of the SSL/TLS certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String name;

    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the
     * Lightsail load balancer.
     * </p>
     */
    private Boolean isAttached;

    /**
     * <p>
     * The name of the SSL/TLS certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the SSL/TLS certificate.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the SSL/TLS certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the SSL/TLS certificate.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the SSL/TLS certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the SSL/TLS certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificateSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the
     * Lightsail load balancer.
     * </p>
     *
     * @return <p>
     *         When <code>true</code>, the SSL/TLS certificate is attached to
     *         the Lightsail load balancer.
     *         </p>
     */
    public Boolean isIsAttached() {
        return isAttached;
    }

    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the
     * Lightsail load balancer.
     * </p>
     *
     * @return <p>
     *         When <code>true</code>, the SSL/TLS certificate is attached to
     *         the Lightsail load balancer.
     *         </p>
     */
    public Boolean getIsAttached() {
        return isAttached;
    }

    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the
     * Lightsail load balancer.
     * </p>
     *
     * @param isAttached <p>
     *            When <code>true</code>, the SSL/TLS certificate is attached to
     *            the Lightsail load balancer.
     *            </p>
     */
    public void setIsAttached(Boolean isAttached) {
        this.isAttached = isAttached;
    }

    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the
     * Lightsail load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isAttached <p>
     *            When <code>true</code>, the SSL/TLS certificate is attached to
     *            the Lightsail load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificateSummary withIsAttached(Boolean isAttached) {
        this.isAttached = isAttached;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getIsAttached() != null)
            sb.append("isAttached: " + getIsAttached());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIsAttached() == null) ? 0 : getIsAttached().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerTlsCertificateSummary == false)
            return false;
        LoadBalancerTlsCertificateSummary other = (LoadBalancerTlsCertificateSummary) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIsAttached() == null ^ this.getIsAttached() == null)
            return false;
        if (other.getIsAttached() != null
                && other.getIsAttached().equals(this.getIsAttached()) == false)
            return false;
        return true;
    }
}
