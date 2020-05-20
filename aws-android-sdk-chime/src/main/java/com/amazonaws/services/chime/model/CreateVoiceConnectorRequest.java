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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an Amazon Chime Voice Connector under the administrator's AWS
 * account. You can choose to create an Amazon Chime Voice Connector in a
 * specific AWS Region.
 * </p>
 * <p>
 * Enabling <a>CreateVoiceConnectorRequest$RequireEncryption</a> configures your
 * Amazon Chime Voice Connector to use TLS transport for SIP signaling and
 * Secure RTP (SRTP) for media. Inbound calls use TLS transport, and unencrypted
 * outbound calls are blocked.
 * </p>
 */
public class CreateVoiceConnectorRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the Amazon Chime Voice Connector.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * <p>
     * The AWS Region in which the Amazon Chime Voice Connector is created.
     * Default value: <code>us-east-1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-west-2
     */
    private String awsRegion;

    /**
     * <p>
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * </p>
     */
    private Boolean requireEncryption;

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The name of the Amazon Chime Voice Connector.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>
     *            The name of the Amazon Chime Voice Connector.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>
     *            The name of the Amazon Chime Voice Connector.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVoiceConnectorRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The AWS Region in which the Amazon Chime Voice Connector is created.
     * Default value: <code>us-east-1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-west-2
     *
     * @return <p>
     *         The AWS Region in which the Amazon Chime Voice Connector is
     *         created. Default value: <code>us-east-1</code>.
     *         </p>
     * @see VoiceConnectorAwsRegion
     */
    public String getAwsRegion() {
        return awsRegion;
    }

    /**
     * <p>
     * The AWS Region in which the Amazon Chime Voice Connector is created.
     * Default value: <code>us-east-1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-west-2
     *
     * @param awsRegion <p>
     *            The AWS Region in which the Amazon Chime Voice Connector is
     *            created. Default value: <code>us-east-1</code>.
     *            </p>
     * @see VoiceConnectorAwsRegion
     */
    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The AWS Region in which the Amazon Chime Voice Connector is created.
     * Default value: <code>us-east-1</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-west-2
     *
     * @param awsRegion <p>
     *            The AWS Region in which the Amazon Chime Voice Connector is
     *            created. Default value: <code>us-east-1</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VoiceConnectorAwsRegion
     */
    public CreateVoiceConnectorRequest withAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
        return this;
    }

    /**
     * <p>
     * The AWS Region in which the Amazon Chime Voice Connector is created.
     * Default value: <code>us-east-1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-west-2
     *
     * @param awsRegion <p>
     *            The AWS Region in which the Amazon Chime Voice Connector is
     *            created. Default value: <code>us-east-1</code>.
     *            </p>
     * @see VoiceConnectorAwsRegion
     */
    public void setAwsRegion(VoiceConnectorAwsRegion awsRegion) {
        this.awsRegion = awsRegion.toString();
    }

    /**
     * <p>
     * The AWS Region in which the Amazon Chime Voice Connector is created.
     * Default value: <code>us-east-1</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-west-2
     *
     * @param awsRegion <p>
     *            The AWS Region in which the Amazon Chime Voice Connector is
     *            created. Default value: <code>us-east-1</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VoiceConnectorAwsRegion
     */
    public CreateVoiceConnectorRequest withAwsRegion(VoiceConnectorAwsRegion awsRegion) {
        this.awsRegion = awsRegion.toString();
        return this;
    }

    /**
     * <p>
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * </p>
     *
     * @return <p>
     *         When enabled, requires encryption for the Amazon Chime Voice
     *         Connector.
     *         </p>
     */
    public Boolean isRequireEncryption() {
        return requireEncryption;
    }

    /**
     * <p>
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * </p>
     *
     * @return <p>
     *         When enabled, requires encryption for the Amazon Chime Voice
     *         Connector.
     *         </p>
     */
    public Boolean getRequireEncryption() {
        return requireEncryption;
    }

    /**
     * <p>
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * </p>
     *
     * @param requireEncryption <p>
     *            When enabled, requires encryption for the Amazon Chime Voice
     *            Connector.
     *            </p>
     */
    public void setRequireEncryption(Boolean requireEncryption) {
        this.requireEncryption = requireEncryption;
    }

    /**
     * <p>
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireEncryption <p>
     *            When enabled, requires encryption for the Amazon Chime Voice
     *            Connector.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVoiceConnectorRequest withRequireEncryption(Boolean requireEncryption) {
        this.requireEncryption = requireEncryption;
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
            sb.append("Name: " + getName() + ",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: " + getAwsRegion() + ",");
        if (getRequireEncryption() != null)
            sb.append("RequireEncryption: " + getRequireEncryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode
                + ((getRequireEncryption() == null) ? 0 : getRequireEncryption().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVoiceConnectorRequest == false)
            return false;
        CreateVoiceConnectorRequest other = (CreateVoiceConnectorRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null
                && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        if (other.getRequireEncryption() == null ^ this.getRequireEncryption() == null)
            return false;
        if (other.getRequireEncryption() != null
                && other.getRequireEncryption().equals(this.getRequireEncryption()) == false)
            return false;
        return true;
    }
}
