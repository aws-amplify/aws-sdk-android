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
 * Information required to start a signing job.
 * </p>
 */
public class StartSigningJobParameter implements Serializable {
    /**
     * <p>
     * Describes the code-signing profile.
     * </p>
     */
    private SigningProfileParameter signingProfileParameter;

    /**
     * <p>
     * The code-signing profile name.
     * </p>
     */
    private String signingProfileName;

    /**
     * <p>
     * The location to write the code-signed file.
     * </p>
     */
    private Destination destination;

    /**
     * <p>
     * Describes the code-signing profile.
     * </p>
     *
     * @return <p>
     *         Describes the code-signing profile.
     *         </p>
     */
    public SigningProfileParameter getSigningProfileParameter() {
        return signingProfileParameter;
    }

    /**
     * <p>
     * Describes the code-signing profile.
     * </p>
     *
     * @param signingProfileParameter <p>
     *            Describes the code-signing profile.
     *            </p>
     */
    public void setSigningProfileParameter(SigningProfileParameter signingProfileParameter) {
        this.signingProfileParameter = signingProfileParameter;
    }

    /**
     * <p>
     * Describes the code-signing profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signingProfileParameter <p>
     *            Describes the code-signing profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSigningJobParameter withSigningProfileParameter(
            SigningProfileParameter signingProfileParameter) {
        this.signingProfileParameter = signingProfileParameter;
        return this;
    }

    /**
     * <p>
     * The code-signing profile name.
     * </p>
     *
     * @return <p>
     *         The code-signing profile name.
     *         </p>
     */
    public String getSigningProfileName() {
        return signingProfileName;
    }

    /**
     * <p>
     * The code-signing profile name.
     * </p>
     *
     * @param signingProfileName <p>
     *            The code-signing profile name.
     *            </p>
     */
    public void setSigningProfileName(String signingProfileName) {
        this.signingProfileName = signingProfileName;
    }

    /**
     * <p>
     * The code-signing profile name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signingProfileName <p>
     *            The code-signing profile name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSigningJobParameter withSigningProfileName(String signingProfileName) {
        this.signingProfileName = signingProfileName;
        return this;
    }

    /**
     * <p>
     * The location to write the code-signed file.
     * </p>
     *
     * @return <p>
     *         The location to write the code-signed file.
     *         </p>
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * <p>
     * The location to write the code-signed file.
     * </p>
     *
     * @param destination <p>
     *            The location to write the code-signed file.
     *            </p>
     */
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The location to write the code-signed file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destination <p>
     *            The location to write the code-signed file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSigningJobParameter withDestination(Destination destination) {
        this.destination = destination;
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
        if (getSigningProfileParameter() != null)
            sb.append("signingProfileParameter: " + getSigningProfileParameter() + ",");
        if (getSigningProfileName() != null)
            sb.append("signingProfileName: " + getSigningProfileName() + ",");
        if (getDestination() != null)
            sb.append("destination: " + getDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSigningProfileParameter() == null) ? 0 : getSigningProfileParameter()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSigningProfileName() == null) ? 0 : getSigningProfileName().hashCode());
        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSigningJobParameter == false)
            return false;
        StartSigningJobParameter other = (StartSigningJobParameter) obj;

        if (other.getSigningProfileParameter() == null ^ this.getSigningProfileParameter() == null)
            return false;
        if (other.getSigningProfileParameter() != null
                && other.getSigningProfileParameter().equals(this.getSigningProfileParameter()) == false)
            return false;
        if (other.getSigningProfileName() == null ^ this.getSigningProfileName() == null)
            return false;
        if (other.getSigningProfileName() != null
                && other.getSigningProfileName().equals(this.getSigningProfileName()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        return true;
    }
}
