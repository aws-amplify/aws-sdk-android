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

/**
 * <p>
 * The Amazon Chime Voice Connector configuration, including outbound host name
 * and encryption settings.
 * </p>
 */
public class VoiceConnector implements Serializable {
    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String voiceConnectorId;

    /**
     * <p>
     * The AWS Region in which the Amazon Chime Voice Connector is created.
     * Default: <code>us-east-1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-west-2
     */
    private String awsRegion;

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
     * The outbound host name for the Amazon Chime Voice Connector.
     * </p>
     */
    private String outboundHostName;

    /**
     * <p>
     * Designates whether encryption is required for the Amazon Chime Voice
     * Connector.
     * </p>
     */
    private Boolean requireEncryption;

    /**
     * <p>
     * The Amazon Chime Voice Connector creation timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The updated Amazon Chime Voice Connector timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Chime Voice Connector ID.
     *         </p>
     */
    public String getVoiceConnectorId() {
        return voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param voiceConnectorId <p>
     *            The Amazon Chime Voice Connector ID.
     *            </p>
     */
    public void setVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param voiceConnectorId <p>
     *            The Amazon Chime Voice Connector ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceConnector withVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
        return this;
    }

    /**
     * <p>
     * The AWS Region in which the Amazon Chime Voice Connector is created.
     * Default: <code>us-east-1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-west-2
     *
     * @return <p>
     *         The AWS Region in which the Amazon Chime Voice Connector is
     *         created. Default: <code>us-east-1</code>.
     *         </p>
     * @see VoiceConnectorAwsRegion
     */
    public String getAwsRegion() {
        return awsRegion;
    }

    /**
     * <p>
     * The AWS Region in which the Amazon Chime Voice Connector is created.
     * Default: <code>us-east-1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-west-2
     *
     * @param awsRegion <p>
     *            The AWS Region in which the Amazon Chime Voice Connector is
     *            created. Default: <code>us-east-1</code>.
     *            </p>
     * @see VoiceConnectorAwsRegion
     */
    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The AWS Region in which the Amazon Chime Voice Connector is created.
     * Default: <code>us-east-1</code>.
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
     *            created. Default: <code>us-east-1</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VoiceConnectorAwsRegion
     */
    public VoiceConnector withAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
        return this;
    }

    /**
     * <p>
     * The AWS Region in which the Amazon Chime Voice Connector is created.
     * Default: <code>us-east-1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-west-2
     *
     * @param awsRegion <p>
     *            The AWS Region in which the Amazon Chime Voice Connector is
     *            created. Default: <code>us-east-1</code>.
     *            </p>
     * @see VoiceConnectorAwsRegion
     */
    public void setAwsRegion(VoiceConnectorAwsRegion awsRegion) {
        this.awsRegion = awsRegion.toString();
    }

    /**
     * <p>
     * The AWS Region in which the Amazon Chime Voice Connector is created.
     * Default: <code>us-east-1</code>.
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
     *            created. Default: <code>us-east-1</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VoiceConnectorAwsRegion
     */
    public VoiceConnector withAwsRegion(VoiceConnectorAwsRegion awsRegion) {
        this.awsRegion = awsRegion.toString();
        return this;
    }

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
    public VoiceConnector withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The outbound host name for the Amazon Chime Voice Connector.
     * </p>
     *
     * @return <p>
     *         The outbound host name for the Amazon Chime Voice Connector.
     *         </p>
     */
    public String getOutboundHostName() {
        return outboundHostName;
    }

    /**
     * <p>
     * The outbound host name for the Amazon Chime Voice Connector.
     * </p>
     *
     * @param outboundHostName <p>
     *            The outbound host name for the Amazon Chime Voice Connector.
     *            </p>
     */
    public void setOutboundHostName(String outboundHostName) {
        this.outboundHostName = outboundHostName;
    }

    /**
     * <p>
     * The outbound host name for the Amazon Chime Voice Connector.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outboundHostName <p>
     *            The outbound host name for the Amazon Chime Voice Connector.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceConnector withOutboundHostName(String outboundHostName) {
        this.outboundHostName = outboundHostName;
        return this;
    }

    /**
     * <p>
     * Designates whether encryption is required for the Amazon Chime Voice
     * Connector.
     * </p>
     *
     * @return <p>
     *         Designates whether encryption is required for the Amazon Chime
     *         Voice Connector.
     *         </p>
     */
    public Boolean isRequireEncryption() {
        return requireEncryption;
    }

    /**
     * <p>
     * Designates whether encryption is required for the Amazon Chime Voice
     * Connector.
     * </p>
     *
     * @return <p>
     *         Designates whether encryption is required for the Amazon Chime
     *         Voice Connector.
     *         </p>
     */
    public Boolean getRequireEncryption() {
        return requireEncryption;
    }

    /**
     * <p>
     * Designates whether encryption is required for the Amazon Chime Voice
     * Connector.
     * </p>
     *
     * @param requireEncryption <p>
     *            Designates whether encryption is required for the Amazon Chime
     *            Voice Connector.
     *            </p>
     */
    public void setRequireEncryption(Boolean requireEncryption) {
        this.requireEncryption = requireEncryption;
    }

    /**
     * <p>
     * Designates whether encryption is required for the Amazon Chime Voice
     * Connector.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireEncryption <p>
     *            Designates whether encryption is required for the Amazon Chime
     *            Voice Connector.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceConnector withRequireEncryption(Boolean requireEncryption) {
        this.requireEncryption = requireEncryption;
        return this;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector creation timestamp, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The Amazon Chime Voice Connector creation timestamp, in ISO 8601
     *         format.
     *         </p>
     */
    public java.util.Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector creation timestamp, in ISO 8601 format.
     * </p>
     *
     * @param createdTimestamp <p>
     *            The Amazon Chime Voice Connector creation timestamp, in ISO
     *            8601 format.
     *            </p>
     */
    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector creation timestamp, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTimestamp <p>
     *            The Amazon Chime Voice Connector creation timestamp, in ISO
     *            8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceConnector withCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    /**
     * <p>
     * The updated Amazon Chime Voice Connector timestamp, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The updated Amazon Chime Voice Connector timestamp, in ISO 8601
     *         format.
     *         </p>
     */
    public java.util.Date getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    /**
     * <p>
     * The updated Amazon Chime Voice Connector timestamp, in ISO 8601 format.
     * </p>
     *
     * @param updatedTimestamp <p>
     *            The updated Amazon Chime Voice Connector timestamp, in ISO
     *            8601 format.
     *            </p>
     */
    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The updated Amazon Chime Voice Connector timestamp, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedTimestamp <p>
     *            The updated Amazon Chime Voice Connector timestamp, in ISO
     *            8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceConnector withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
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
        if (getVoiceConnectorId() != null)
            sb.append("VoiceConnectorId: " + getVoiceConnectorId() + ",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: " + getAwsRegion() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getOutboundHostName() != null)
            sb.append("OutboundHostName: " + getOutboundHostName() + ",");
        if (getRequireEncryption() != null)
            sb.append("RequireEncryption: " + getRequireEncryption() + ",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: " + getCreatedTimestamp() + ",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: " + getUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVoiceConnectorId() == null) ? 0 : getVoiceConnectorId().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getOutboundHostName() == null) ? 0 : getOutboundHostName().hashCode());
        hashCode = prime * hashCode
                + ((getRequireEncryption() == null) ? 0 : getRequireEncryption().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoiceConnector == false)
            return false;
        VoiceConnector other = (VoiceConnector) obj;

        if (other.getVoiceConnectorId() == null ^ this.getVoiceConnectorId() == null)
            return false;
        if (other.getVoiceConnectorId() != null
                && other.getVoiceConnectorId().equals(this.getVoiceConnectorId()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null
                && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOutboundHostName() == null ^ this.getOutboundHostName() == null)
            return false;
        if (other.getOutboundHostName() != null
                && other.getOutboundHostName().equals(this.getOutboundHostName()) == false)
            return false;
        if (other.getRequireEncryption() == null ^ this.getRequireEncryption() == null)
            return false;
        if (other.getRequireEncryption() != null
                && other.getRequireEncryption().equals(this.getRequireEncryption()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null
                && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null
                && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        return true;
    }
}
