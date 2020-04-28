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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Updates a channel.
 */
public class UpdateChannelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * channel ID
     */
    private String channelId;

    /**
     * A list of output destinations for this channel.
     */
    private java.util.List<OutputDestination> destinations;

    /**
     * The encoder settings for this channel.
     */
    private EncoderSettings encoderSettings;

    /**
     * Placeholder documentation for __listOfInputAttachment
     */
    private java.util.List<InputAttachment> inputAttachments;

    /**
     * Specification of input for this channel (max. bitrate, resolution, codec,
     * etc.)
     */
    private InputSpecification inputSpecification;

    /**
     * The log level to write to CloudWatch Logs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, WARNING, INFO, DEBUG, DISABLED
     */
    private String logLevel;

    /**
     * The name of the channel.
     */
    private String name;

    /**
     * An optional Amazon Resource Name (ARN) of the role to assume when running
     * the Channel. If you do not specify this on an update call but the role
     * was previously set that role will be removed.
     */
    private String roleArn;

    /**
     * channel ID
     *
     * @return channel ID
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * channel ID
     *
     * @param channelId channel ID
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * channel ID
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelId channel ID
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateChannelRequest withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * A list of output destinations for this channel.
     *
     * @return A list of output destinations for this channel.
     */
    public java.util.List<OutputDestination> getDestinations() {
        return destinations;
    }

    /**
     * A list of output destinations for this channel.
     *
     * @param destinations A list of output destinations for this channel.
     */
    public void setDestinations(java.util.Collection<OutputDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<OutputDestination>(destinations);
    }

    /**
     * A list of output destinations for this channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations A list of output destinations for this channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateChannelRequest withDestinations(OutputDestination... destinations) {
        if (getDestinations() == null) {
            this.destinations = new java.util.ArrayList<OutputDestination>(destinations.length);
        }
        for (OutputDestination value : destinations) {
            this.destinations.add(value);
        }
        return this;
    }

    /**
     * A list of output destinations for this channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations A list of output destinations for this channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateChannelRequest withDestinations(
            java.util.Collection<OutputDestination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * The encoder settings for this channel.
     *
     * @return The encoder settings for this channel.
     */
    public EncoderSettings getEncoderSettings() {
        return encoderSettings;
    }

    /**
     * The encoder settings for this channel.
     *
     * @param encoderSettings The encoder settings for this channel.
     */
    public void setEncoderSettings(EncoderSettings encoderSettings) {
        this.encoderSettings = encoderSettings;
    }

    /**
     * The encoder settings for this channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encoderSettings The encoder settings for this channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateChannelRequest withEncoderSettings(EncoderSettings encoderSettings) {
        this.encoderSettings = encoderSettings;
        return this;
    }

    /**
     * Placeholder documentation for __listOfInputAttachment
     *
     * @return Placeholder documentation for __listOfInputAttachment
     */
    public java.util.List<InputAttachment> getInputAttachments() {
        return inputAttachments;
    }

    /**
     * Placeholder documentation for __listOfInputAttachment
     *
     * @param inputAttachments Placeholder documentation for
     *            __listOfInputAttachment
     */
    public void setInputAttachments(java.util.Collection<InputAttachment> inputAttachments) {
        if (inputAttachments == null) {
            this.inputAttachments = null;
            return;
        }

        this.inputAttachments = new java.util.ArrayList<InputAttachment>(inputAttachments);
    }

    /**
     * Placeholder documentation for __listOfInputAttachment
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputAttachments Placeholder documentation for
     *            __listOfInputAttachment
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateChannelRequest withInputAttachments(InputAttachment... inputAttachments) {
        if (getInputAttachments() == null) {
            this.inputAttachments = new java.util.ArrayList<InputAttachment>(
                    inputAttachments.length);
        }
        for (InputAttachment value : inputAttachments) {
            this.inputAttachments.add(value);
        }
        return this;
    }

    /**
     * Placeholder documentation for __listOfInputAttachment
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputAttachments Placeholder documentation for
     *            __listOfInputAttachment
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateChannelRequest withInputAttachments(
            java.util.Collection<InputAttachment> inputAttachments) {
        setInputAttachments(inputAttachments);
        return this;
    }

    /**
     * Specification of input for this channel (max. bitrate, resolution, codec,
     * etc.)
     *
     * @return Specification of input for this channel (max. bitrate,
     *         resolution, codec, etc.)
     */
    public InputSpecification getInputSpecification() {
        return inputSpecification;
    }

    /**
     * Specification of input for this channel (max. bitrate, resolution, codec,
     * etc.)
     *
     * @param inputSpecification Specification of input for this channel (max.
     *            bitrate, resolution, codec, etc.)
     */
    public void setInputSpecification(InputSpecification inputSpecification) {
        this.inputSpecification = inputSpecification;
    }

    /**
     * Specification of input for this channel (max. bitrate, resolution, codec,
     * etc.)
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputSpecification Specification of input for this channel (max.
     *            bitrate, resolution, codec, etc.)
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateChannelRequest withInputSpecification(InputSpecification inputSpecification) {
        this.inputSpecification = inputSpecification;
        return this;
    }

    /**
     * The log level to write to CloudWatch Logs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, WARNING, INFO, DEBUG, DISABLED
     *
     * @return The log level to write to CloudWatch Logs.
     * @see LogLevel
     */
    public String getLogLevel() {
        return logLevel;
    }

    /**
     * The log level to write to CloudWatch Logs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, WARNING, INFO, DEBUG, DISABLED
     *
     * @param logLevel The log level to write to CloudWatch Logs.
     * @see LogLevel
     */
    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * The log level to write to CloudWatch Logs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, WARNING, INFO, DEBUG, DISABLED
     *
     * @param logLevel The log level to write to CloudWatch Logs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogLevel
     */
    public UpdateChannelRequest withLogLevel(String logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * The log level to write to CloudWatch Logs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, WARNING, INFO, DEBUG, DISABLED
     *
     * @param logLevel The log level to write to CloudWatch Logs.
     * @see LogLevel
     */
    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
    }

    /**
     * The log level to write to CloudWatch Logs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, WARNING, INFO, DEBUG, DISABLED
     *
     * @param logLevel The log level to write to CloudWatch Logs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogLevel
     */
    public UpdateChannelRequest withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
        return this;
    }

    /**
     * The name of the channel.
     *
     * @return The name of the channel.
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the channel.
     *
     * @param name The name of the channel.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name The name of the channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateChannelRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * An optional Amazon Resource Name (ARN) of the role to assume when running
     * the Channel. If you do not specify this on an update call but the role
     * was previously set that role will be removed.
     *
     * @return An optional Amazon Resource Name (ARN) of the role to assume when
     *         running the Channel. If you do not specify this on an update call
     *         but the role was previously set that role will be removed.
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * An optional Amazon Resource Name (ARN) of the role to assume when running
     * the Channel. If you do not specify this on an update call but the role
     * was previously set that role will be removed.
     *
     * @param roleArn An optional Amazon Resource Name (ARN) of the role to
     *            assume when running the Channel. If you do not specify this on
     *            an update call but the role was previously set that role will
     *            be removed.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * An optional Amazon Resource Name (ARN) of the role to assume when running
     * the Channel. If you do not specify this on an update call but the role
     * was previously set that role will be removed.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn An optional Amazon Resource Name (ARN) of the role to
     *            assume when running the Channel. If you do not specify this on
     *            an update call but the role was previously set that role will
     *            be removed.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateChannelRequest withRoleArn(String roleArn) {
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
        if (getChannelId() != null)
            sb.append("ChannelId: " + getChannelId() + ",");
        if (getDestinations() != null)
            sb.append("Destinations: " + getDestinations() + ",");
        if (getEncoderSettings() != null)
            sb.append("EncoderSettings: " + getEncoderSettings() + ",");
        if (getInputAttachments() != null)
            sb.append("InputAttachments: " + getInputAttachments() + ",");
        if (getInputSpecification() != null)
            sb.append("InputSpecification: " + getInputSpecification() + ",");
        if (getLogLevel() != null)
            sb.append("LogLevel: " + getLogLevel() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        hashCode = prime * hashCode
                + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode
                + ((getEncoderSettings() == null) ? 0 : getEncoderSettings().hashCode());
        hashCode = prime * hashCode
                + ((getInputAttachments() == null) ? 0 : getInputAttachments().hashCode());
        hashCode = prime * hashCode
                + ((getInputSpecification() == null) ? 0 : getInputSpecification().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateChannelRequest == false)
            return false;
        UpdateChannelRequest other = (UpdateChannelRequest) obj;

        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null
                && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null
                && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getEncoderSettings() == null ^ this.getEncoderSettings() == null)
            return false;
        if (other.getEncoderSettings() != null
                && other.getEncoderSettings().equals(this.getEncoderSettings()) == false)
            return false;
        if (other.getInputAttachments() == null ^ this.getInputAttachments() == null)
            return false;
        if (other.getInputAttachments() != null
                && other.getInputAttachments().equals(this.getInputAttachments()) == false)
            return false;
        if (other.getInputSpecification() == null ^ this.getInputSpecification() == null)
            return false;
        if (other.getInputSpecification() != null
                && other.getInputSpecification().equals(this.getInputSpecification()) == false)
            return false;
        if (other.getLogLevel() == null ^ this.getLogLevel() == null)
            return false;
        if (other.getLogLevel() != null && other.getLogLevel().equals(this.getLogLevel()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
