/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes the code-signing profile.
 * </p>
 */
public class SigningProfileParameter implements Serializable {
    /**
     * <p>
     * Certificate ARN.
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * The hardware platform of your device.
     * </p>
     */
    private String platform;

    /**
     * <p>
     * The location of the code-signing certificate on your device.
     * </p>
     */
    private String certificatePathOnDevice;

    /**
     * <p>
     * Certificate ARN.
     * </p>
     *
     * @return <p>
     *         Certificate ARN.
     *         </p>
     */
    public String getCertificateArn() {
        return certificateArn;
    }

    /**
     * <p>
     * Certificate ARN.
     * </p>
     *
     * @param certificateArn <p>
     *            Certificate ARN.
     *            </p>
     */
    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * Certificate ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateArn <p>
     *            Certificate ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SigningProfileParameter withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    /**
     * <p>
     * The hardware platform of your device.
     * </p>
     *
     * @return <p>
     *         The hardware platform of your device.
     *         </p>
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * <p>
     * The hardware platform of your device.
     * </p>
     *
     * @param platform <p>
     *            The hardware platform of your device.
     *            </p>
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The hardware platform of your device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platform <p>
     *            The hardware platform of your device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SigningProfileParameter withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * <p>
     * The location of the code-signing certificate on your device.
     * </p>
     *
     * @return <p>
     *         The location of the code-signing certificate on your device.
     *         </p>
     */
    public String getCertificatePathOnDevice() {
        return certificatePathOnDevice;
    }

    /**
     * <p>
     * The location of the code-signing certificate on your device.
     * </p>
     *
     * @param certificatePathOnDevice <p>
     *            The location of the code-signing certificate on your device.
     *            </p>
     */
    public void setCertificatePathOnDevice(String certificatePathOnDevice) {
        this.certificatePathOnDevice = certificatePathOnDevice;
    }

    /**
     * <p>
     * The location of the code-signing certificate on your device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificatePathOnDevice <p>
     *            The location of the code-signing certificate on your device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SigningProfileParameter withCertificatePathOnDevice(String certificatePathOnDevice) {
        this.certificatePathOnDevice = certificatePathOnDevice;
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
        if (getCertificateArn() != null)
            sb.append("certificateArn: " + getCertificateArn() + ",");
        if (getPlatform() != null)
            sb.append("platform: " + getPlatform() + ",");
        if (getCertificatePathOnDevice() != null)
            sb.append("certificatePathOnDevice: " + getCertificatePathOnDevice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime
                * hashCode
                + ((getCertificatePathOnDevice() == null) ? 0 : getCertificatePathOnDevice()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SigningProfileParameter == false)
            return false;
        SigningProfileParameter other = (SigningProfileParameter) obj;

        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getCertificatePathOnDevice() == null ^ this.getCertificatePathOnDevice() == null)
            return false;
        if (other.getCertificatePathOnDevice() != null
                && other.getCertificatePathOnDevice().equals(this.getCertificatePathOnDevice()) == false)
            return false;
        return true;
    }
}
