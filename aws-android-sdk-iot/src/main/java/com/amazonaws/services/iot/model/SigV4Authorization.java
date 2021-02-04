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

/**
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4 signing process</a>.
 * </p>
 */
public class SigV4Authorization implements Serializable {
    /**
     * <p>
     * The signing region.
     * </p>
     */
    private String signingRegion;

    /**
     * <p>
     * The service name to use while signing with Sig V4.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The ARN of the signing role.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The signing region.
     * </p>
     *
     * @return <p>
     *         The signing region.
     *         </p>
     */
    public String getSigningRegion() {
        return signingRegion;
    }

    /**
     * <p>
     * The signing region.
     * </p>
     *
     * @param signingRegion <p>
     *            The signing region.
     *            </p>
     */
    public void setSigningRegion(String signingRegion) {
        this.signingRegion = signingRegion;
    }

    /**
     * <p>
     * The signing region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signingRegion <p>
     *            The signing region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SigV4Authorization withSigningRegion(String signingRegion) {
        this.signingRegion = signingRegion;
        return this;
    }

    /**
     * <p>
     * The service name to use while signing with Sig V4.
     * </p>
     *
     * @return <p>
     *         The service name to use while signing with Sig V4.
     *         </p>
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * <p>
     * The service name to use while signing with Sig V4.
     * </p>
     *
     * @param serviceName <p>
     *            The service name to use while signing with Sig V4.
     *            </p>
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The service name to use while signing with Sig V4.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceName <p>
     *            The service name to use while signing with Sig V4.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SigV4Authorization withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * <p>
     * The ARN of the signing role.
     * </p>
     *
     * @return <p>
     *         The ARN of the signing role.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the signing role.
     * </p>
     *
     * @param roleArn <p>
     *            The ARN of the signing role.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the signing role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The ARN of the signing role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SigV4Authorization withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getSigningRegion() != null)
            sb.append("signingRegion: " + getSigningRegion() + ",");
        if (getServiceName() != null)
            sb.append("serviceName: " + getServiceName() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSigningRegion() == null) ? 0 : getSigningRegion().hashCode());
        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SigV4Authorization == false)
            return false;
        SigV4Authorization other = (SigV4Authorization) obj;

        if (other.getSigningRegion() == null ^ this.getSigningRegion() == null)
            return false;
        if (other.getSigningRegion() != null
                && other.getSigningRegion().equals(this.getSigningRegion()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
