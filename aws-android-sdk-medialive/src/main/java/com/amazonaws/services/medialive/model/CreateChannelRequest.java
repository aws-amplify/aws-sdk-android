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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Creates a new channel
 */
public class CreateChannelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The class for this channel. STANDARD for a channel with two pipelines or
     * SINGLE_PIPELINE for a channel with one pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     */
    private String channelClass;

    /**
     * Placeholder documentation for __listOfOutputDestination
     */
    private java.util.List<OutputDestination> destinations;

    /**
     * Encoder Settings
     */
    private EncoderSettings encoderSettings;

    /**
     * List of input attachments for channel.
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
     * Name of channel.
     */
    private String name;

    /**
     * Unique request ID to be specified. This is needed to prevent retries from
     * creating multiple resources.
     */
    private String requestId;

    /**
     * Deprecated field that's only usable by whitelisted customers.
     */
    private String reserved;

    /**
     * An optional Amazon Resource Name (ARN) of the role to assume when running
     * the Channel.
     */
    private String roleArn;

    /**
     * A collection of key-value pairs.
     */
    private java.util.Map<String, String> tags;

    /**
     * The class for this channel. STANDARD for a channel with two pipelines or
     * SINGLE_PIPELINE for a channel with one pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @return The class for this channel. STANDARD for a channel with two
     *         pipelines or SINGLE_PIPELINE for a channel with one pipeline.
     * @see ChannelClass
     */
    public String getChannelClass() {
        return channelClass;
    }

    /**
     * The class for this channel. STANDARD for a channel with two pipelines or
     * SINGLE_PIPELINE for a channel with one pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @param channelClass The class for this channel. STANDARD for a channel
     *            with two pipelines or SINGLE_PIPELINE for a channel with one
     *            pipeline.
     * @see ChannelClass
     */
    public void setChannelClass(String channelClass) {
        this.channelClass = channelClass;
    }

    /**
     * The class for this channel. STANDARD for a channel with two pipelines or
     * SINGLE_PIPELINE for a channel with one pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @param channelClass The class for this channel. STANDARD for a channel
     *            with two pipelines or SINGLE_PIPELINE for a channel with one
     *            pipeline.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelClass
     */
    public CreateChannelRequest withChannelClass(String channelClass) {
        this.channelClass = channelClass;
        return this;
    }

    /**
     * The class for this channel. STANDARD for a channel with two pipelines or
     * SINGLE_PIPELINE for a channel with one pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @param channelClass The class for this channel. STANDARD for a channel
     *            with two pipelines or SINGLE_PIPELINE for a channel with one
     *            pipeline.
     * @see ChannelClass
     */
    public void setChannelClass(ChannelClass channelClass) {
        this.channelClass = channelClass.toString();
    }

    /**
     * The class for this channel. STANDARD for a channel with two pipelines or
     * SINGLE_PIPELINE for a channel with one pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @param channelClass The class for this channel. STANDARD for a channel
     *            with two pipelines or SINGLE_PIPELINE for a channel with one
     *            pipeline.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelClass
     */
    public CreateChannelRequest withChannelClass(ChannelClass channelClass) {
        this.channelClass = channelClass.toString();
        return this;
    }

    /**
     * Placeholder documentation for __listOfOutputDestination
     *
     * @return Placeholder documentation for __listOfOutputDestination
     */
    public java.util.List<OutputDestination> getDestinations() {
        return destinations;
    }

    /**
     * Placeholder documentation for __listOfOutputDestination
     *
     * @param destinations Placeholder documentation for
     *            __listOfOutputDestination
     */
    public void setDestinations(java.util.Collection<OutputDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<OutputDestination>(destinations);
    }

    /**
     * Placeholder documentation for __listOfOutputDestination
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations Placeholder documentation for
     *            __listOfOutputDestination
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withDestinations(OutputDestination... destinations) {
        if (getDestinations() == null) {
            this.destinations = new java.util.ArrayList<OutputDestination>(destinations.length);
        }
        for (OutputDestination value : destinations) {
            this.destinations.add(value);
        }
        return this;
    }

    /**
     * Placeholder documentation for __listOfOutputDestination
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations Placeholder documentation for
     *            __listOfOutputDestination
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withDestinations(
            java.util.Collection<OutputDestination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * Encoder Settings
     *
     * @return Encoder Settings
     */
    public EncoderSettings getEncoderSettings() {
        return encoderSettings;
    }

    /**
     * Encoder Settings
     *
     * @param encoderSettings Encoder Settings
     */
    public void setEncoderSettings(EncoderSettings encoderSettings) {
        this.encoderSettings = encoderSettings;
    }

    /**
     * Encoder Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encoderSettings Encoder Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withEncoderSettings(EncoderSettings encoderSettings) {
        this.encoderSettings = encoderSettings;
        return this;
    }

    /**
     * List of input attachments for channel.
     *
     * @return List of input attachments for channel.
     */
    public java.util.List<InputAttachment> getInputAttachments() {
        return inputAttachments;
    }

    /**
     * List of input attachments for channel.
     *
     * @param inputAttachments List of input attachments for channel.
     */
    public void setInputAttachments(java.util.Collection<InputAttachment> inputAttachments) {
        if (inputAttachments == null) {
            this.inputAttachments = null;
            return;
        }

        this.inputAttachments = new java.util.ArrayList<InputAttachment>(inputAttachments);
    }

    /**
     * List of input attachments for channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputAttachments List of input attachments for channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withInputAttachments(InputAttachment... inputAttachments) {
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
     * List of input attachments for channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputAttachments List of input attachments for channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withInputAttachments(
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
    public CreateChannelRequest withInputSpecification(InputSpecification inputSpecification) {
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
    public CreateChannelRequest withLogLevel(String logLevel) {
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
    public CreateChannelRequest withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
        return this;
    }

    /**
     * Name of channel.
     *
     * @return Name of channel.
     */
    public String getName() {
        return name;
    }

    /**
     * Name of channel.
     *
     * @param name Name of channel.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name of channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name Name of channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Unique request ID to be specified. This is needed to prevent retries from
     * creating multiple resources.
     * 
     * @return Unique request ID to be specified. This is needed to prevent
     *         retries from creating multiple resources.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Unique request ID to be specified. This is needed to prevent retries from
     * creating multiple resources.
     * 
     * @param requestId Unique request ID to be specified. This is needed to
     *            prevent retries from creating multiple resources.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Unique request ID to be specified. This is needed to prevent retries from
     * creating multiple resources. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestId Unique request ID to be specified. This is needed to
     *            prevent retries from creating multiple resources. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Deprecated field that's only usable by whitelisted customers.
     *
     * @return Deprecated field that's only usable by whitelisted customers.
     */
    public String getReserved() {
        return reserved;
    }

    /**
     * Deprecated field that's only usable by whitelisted customers.
     *
     * @param reserved Deprecated field that's only usable by whitelisted
     *            customers.
     */
    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    /**
     * Deprecated field that's only usable by whitelisted customers.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reserved Deprecated field that's only usable by whitelisted
     *            customers.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withReserved(String reserved) {
        this.reserved = reserved;
        return this;
    }

    /**
     * An optional Amazon Resource Name (ARN) of the role to assume when running
     * the Channel.
     *
     * @return An optional Amazon Resource Name (ARN) of the role to assume when
     *         running the Channel.
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * An optional Amazon Resource Name (ARN) of the role to assume when running
     * the Channel.
     *
     * @param roleArn An optional Amazon Resource Name (ARN) of the role to
     *            assume when running the Channel.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * An optional Amazon Resource Name (ARN) of the role to assume when running
     * the Channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn An optional Amazon Resource Name (ARN) of the role to
     *            assume when running the Channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * A collection of key-value pairs.
     *
     * @return A collection of key-value pairs.
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * A collection of key-value pairs.
     *
     * @param tags A collection of key-value pairs.
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * A collection of key-value pairs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags A collection of key-value pairs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * A collection of key-value pairs.
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateChannelRequest clearTagsEntries() {
        this.tags = null;
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
        if (getChannelClass() != null)
            sb.append("ChannelClass: " + getChannelClass() + ",");
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
        if (getRequestId() != null)
            sb.append("RequestId: " + getRequestId() + ",");
        if (getReserved() != null)
            sb.append("Reserved: " + getReserved() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChannelClass() == null) ? 0 : getChannelClass().hashCode());
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
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getReserved() == null) ? 0 : getReserved().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateChannelRequest == false)
            return false;
        CreateChannelRequest other = (CreateChannelRequest) obj;

        if (other.getChannelClass() == null ^ this.getChannelClass() == null)
            return false;
        if (other.getChannelClass() != null
                && other.getChannelClass().equals(this.getChannelClass()) == false)
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
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getReserved() == null ^ this.getReserved() == null)
            return false;
        if (other.getReserved() != null && other.getReserved().equals(this.getReserved()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
