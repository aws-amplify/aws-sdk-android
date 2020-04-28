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

/**
 * Placeholder documentation for StopChannelResponse
 */
public class StopChannelResult implements Serializable {
    /**
     * The unique arn of the channel.
     */
    private String arn;

    /**
     * The class for this channel. STANDARD for a channel with two pipelines or
     * SINGLE_PIPELINE for a channel with one pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     */
    private String channelClass;

    /**
     * A list of destinations of the channel. For UDP outputs, there is one
     * destination per output. For other types (HLS, for example), there is one
     * destination per packager.
     */
    private java.util.List<OutputDestination> destinations;

    /**
     * The endpoints where outgoing connections initiate from
     */
    private java.util.List<ChannelEgressEndpoint> egressEndpoints;

    /**
     * Encoder Settings
     */
    private EncoderSettings encoderSettings;

    /**
     * The unique id of the channel.
     */
    private String id;

    /**
     * List of input attachments for channel.
     */
    private java.util.List<InputAttachment> inputAttachments;

    /**
     * Placeholder documentation for InputSpecification
     */
    private InputSpecification inputSpecification;

    /**
     * The log level being written to CloudWatch Logs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, WARNING, INFO, DEBUG, DISABLED
     */
    private String logLevel;

    /**
     * The name of the channel. (user-mutable)
     */
    private String name;

    /**
     * Runtime details for the pipelines of a running channel.
     */
    private java.util.List<PipelineDetail> pipelineDetails;

    /**
     * The number of currently healthy pipelines.
     */
    private Integer pipelinesRunningCount;

    /**
     * The Amazon Resource Name (ARN) of the role assumed when running the
     * Channel.
     */
    private String roleArn;

    /**
     * Placeholder documentation for ChannelState
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING,
     * RECOVERING, STOPPING, DELETING, DELETED, UPDATING, UPDATE_FAILED
     */
    private String state;

    /**
     * A collection of key-value pairs.
     */
    private java.util.Map<String, String> tags;

    /**
     * The unique arn of the channel.
     *
     * @return The unique arn of the channel.
     */
    public String getArn() {
        return arn;
    }

    /**
     * The unique arn of the channel.
     *
     * @param arn The unique arn of the channel.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The unique arn of the channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn The unique arn of the channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopChannelResult withArn(String arn) {
        this.arn = arn;
        return this;
    }

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
    public StopChannelResult withChannelClass(String channelClass) {
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
    public StopChannelResult withChannelClass(ChannelClass channelClass) {
        this.channelClass = channelClass.toString();
        return this;
    }

    /**
     * A list of destinations of the channel. For UDP outputs, there is one
     * destination per output. For other types (HLS, for example), there is one
     * destination per packager.
     * 
     * @return A list of destinations of the channel. For UDP outputs, there is
     *         one destination per output. For other types (HLS, for example),
     *         there is one destination per packager.
     */
    public java.util.List<OutputDestination> getDestinations() {
        return destinations;
    }

    /**
     * A list of destinations of the channel. For UDP outputs, there is one
     * destination per output. For other types (HLS, for example), there is one
     * destination per packager.
     * 
     * @param destinations A list of destinations of the channel. For UDP
     *            outputs, there is one destination per output. For other types
     *            (HLS, for example), there is one destination per packager.
     */
    public void setDestinations(java.util.Collection<OutputDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<OutputDestination>(destinations);
    }

    /**
     * A list of destinations of the channel. For UDP outputs, there is one
     * destination per output. For other types (HLS, for example), there is one
     * destination per packager. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations A list of destinations of the channel. For UDP
     *            outputs, there is one destination per output. For other types
     *            (HLS, for example), there is one destination per packager. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopChannelResult withDestinations(OutputDestination... destinations) {
        if (getDestinations() == null) {
            this.destinations = new java.util.ArrayList<OutputDestination>(destinations.length);
        }
        for (OutputDestination value : destinations) {
            this.destinations.add(value);
        }
        return this;
    }

    /**
     * A list of destinations of the channel. For UDP outputs, there is one
     * destination per output. For other types (HLS, for example), there is one
     * destination per packager. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations A list of destinations of the channel. For UDP
     *            outputs, there is one destination per output. For other types
     *            (HLS, for example), there is one destination per packager. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopChannelResult withDestinations(java.util.Collection<OutputDestination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * The endpoints where outgoing connections initiate from
     *
     * @return The endpoints where outgoing connections initiate from
     */
    public java.util.List<ChannelEgressEndpoint> getEgressEndpoints() {
        return egressEndpoints;
    }

    /**
     * The endpoints where outgoing connections initiate from
     *
     * @param egressEndpoints The endpoints where outgoing connections initiate
     *            from
     */
    public void setEgressEndpoints(java.util.Collection<ChannelEgressEndpoint> egressEndpoints) {
        if (egressEndpoints == null) {
            this.egressEndpoints = null;
            return;
        }

        this.egressEndpoints = new java.util.ArrayList<ChannelEgressEndpoint>(egressEndpoints);
    }

    /**
     * The endpoints where outgoing connections initiate from
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param egressEndpoints The endpoints where outgoing connections initiate
     *            from
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopChannelResult withEgressEndpoints(ChannelEgressEndpoint... egressEndpoints) {
        if (getEgressEndpoints() == null) {
            this.egressEndpoints = new java.util.ArrayList<ChannelEgressEndpoint>(
                    egressEndpoints.length);
        }
        for (ChannelEgressEndpoint value : egressEndpoints) {
            this.egressEndpoints.add(value);
        }
        return this;
    }

    /**
     * The endpoints where outgoing connections initiate from
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param egressEndpoints The endpoints where outgoing connections initiate
     *            from
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopChannelResult withEgressEndpoints(
            java.util.Collection<ChannelEgressEndpoint> egressEndpoints) {
        setEgressEndpoints(egressEndpoints);
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
    public StopChannelResult withEncoderSettings(EncoderSettings encoderSettings) {
        this.encoderSettings = encoderSettings;
        return this;
    }

    /**
     * The unique id of the channel.
     *
     * @return The unique id of the channel.
     */
    public String getId() {
        return id;
    }

    /**
     * The unique id of the channel.
     *
     * @param id The unique id of the channel.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique id of the channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id The unique id of the channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopChannelResult withId(String id) {
        this.id = id;
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
    public StopChannelResult withInputAttachments(InputAttachment... inputAttachments) {
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
    public StopChannelResult withInputAttachments(
            java.util.Collection<InputAttachment> inputAttachments) {
        setInputAttachments(inputAttachments);
        return this;
    }

    /**
     * Placeholder documentation for InputSpecification
     *
     * @return Placeholder documentation for InputSpecification
     */
    public InputSpecification getInputSpecification() {
        return inputSpecification;
    }

    /**
     * Placeholder documentation for InputSpecification
     *
     * @param inputSpecification Placeholder documentation for
     *            InputSpecification
     */
    public void setInputSpecification(InputSpecification inputSpecification) {
        this.inputSpecification = inputSpecification;
    }

    /**
     * Placeholder documentation for InputSpecification
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputSpecification Placeholder documentation for
     *            InputSpecification
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopChannelResult withInputSpecification(InputSpecification inputSpecification) {
        this.inputSpecification = inputSpecification;
        return this;
    }

    /**
     * The log level being written to CloudWatch Logs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, WARNING, INFO, DEBUG, DISABLED
     *
     * @return The log level being written to CloudWatch Logs.
     * @see LogLevel
     */
    public String getLogLevel() {
        return logLevel;
    }

    /**
     * The log level being written to CloudWatch Logs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, WARNING, INFO, DEBUG, DISABLED
     *
     * @param logLevel The log level being written to CloudWatch Logs.
     * @see LogLevel
     */
    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * The log level being written to CloudWatch Logs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, WARNING, INFO, DEBUG, DISABLED
     *
     * @param logLevel The log level being written to CloudWatch Logs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogLevel
     */
    public StopChannelResult withLogLevel(String logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * The log level being written to CloudWatch Logs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, WARNING, INFO, DEBUG, DISABLED
     *
     * @param logLevel The log level being written to CloudWatch Logs.
     * @see LogLevel
     */
    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
    }

    /**
     * The log level being written to CloudWatch Logs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, WARNING, INFO, DEBUG, DISABLED
     *
     * @param logLevel The log level being written to CloudWatch Logs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogLevel
     */
    public StopChannelResult withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
        return this;
    }

    /**
     * The name of the channel. (user-mutable)
     *
     * @return The name of the channel. (user-mutable)
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the channel. (user-mutable)
     *
     * @param name The name of the channel. (user-mutable)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the channel. (user-mutable)
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name The name of the channel. (user-mutable)
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopChannelResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Runtime details for the pipelines of a running channel.
     *
     * @return Runtime details for the pipelines of a running channel.
     */
    public java.util.List<PipelineDetail> getPipelineDetails() {
        return pipelineDetails;
    }

    /**
     * Runtime details for the pipelines of a running channel.
     *
     * @param pipelineDetails Runtime details for the pipelines of a running
     *            channel.
     */
    public void setPipelineDetails(java.util.Collection<PipelineDetail> pipelineDetails) {
        if (pipelineDetails == null) {
            this.pipelineDetails = null;
            return;
        }

        this.pipelineDetails = new java.util.ArrayList<PipelineDetail>(pipelineDetails);
    }

    /**
     * Runtime details for the pipelines of a running channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pipelineDetails Runtime details for the pipelines of a running
     *            channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopChannelResult withPipelineDetails(PipelineDetail... pipelineDetails) {
        if (getPipelineDetails() == null) {
            this.pipelineDetails = new java.util.ArrayList<PipelineDetail>(pipelineDetails.length);
        }
        for (PipelineDetail value : pipelineDetails) {
            this.pipelineDetails.add(value);
        }
        return this;
    }

    /**
     * Runtime details for the pipelines of a running channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pipelineDetails Runtime details for the pipelines of a running
     *            channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopChannelResult withPipelineDetails(
            java.util.Collection<PipelineDetail> pipelineDetails) {
        setPipelineDetails(pipelineDetails);
        return this;
    }

    /**
     * The number of currently healthy pipelines.
     *
     * @return The number of currently healthy pipelines.
     */
    public Integer getPipelinesRunningCount() {
        return pipelinesRunningCount;
    }

    /**
     * The number of currently healthy pipelines.
     *
     * @param pipelinesRunningCount The number of currently healthy pipelines.
     */
    public void setPipelinesRunningCount(Integer pipelinesRunningCount) {
        this.pipelinesRunningCount = pipelinesRunningCount;
    }

    /**
     * The number of currently healthy pipelines.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pipelinesRunningCount The number of currently healthy pipelines.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopChannelResult withPipelinesRunningCount(Integer pipelinesRunningCount) {
        this.pipelinesRunningCount = pipelinesRunningCount;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the role assumed when running the
     * Channel.
     *
     * @return The Amazon Resource Name (ARN) of the role assumed when running
     *         the Channel.
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the role assumed when running the
     * Channel.
     *
     * @param roleArn The Amazon Resource Name (ARN) of the role assumed when
     *            running the Channel.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the role assumed when running the
     * Channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn The Amazon Resource Name (ARN) of the role assumed when
     *            running the Channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopChannelResult withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * Placeholder documentation for ChannelState
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING,
     * RECOVERING, STOPPING, DELETING, DELETED, UPDATING, UPDATE_FAILED
     *
     * @return Placeholder documentation for ChannelState
     * @see ChannelState
     */
    public String getState() {
        return state;
    }

    /**
     * Placeholder documentation for ChannelState
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING,
     * RECOVERING, STOPPING, DELETING, DELETED, UPDATING, UPDATE_FAILED
     *
     * @param state Placeholder documentation for ChannelState
     * @see ChannelState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Placeholder documentation for ChannelState
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING,
     * RECOVERING, STOPPING, DELETING, DELETED, UPDATING, UPDATE_FAILED
     *
     * @param state Placeholder documentation for ChannelState
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelState
     */
    public StopChannelResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Placeholder documentation for ChannelState
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING,
     * RECOVERING, STOPPING, DELETING, DELETED, UPDATING, UPDATE_FAILED
     *
     * @param state Placeholder documentation for ChannelState
     * @see ChannelState
     */
    public void setState(ChannelState state) {
        this.state = state.toString();
    }

    /**
     * Placeholder documentation for ChannelState
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING,
     * RECOVERING, STOPPING, DELETING, DELETED, UPDATING, UPDATE_FAILED
     *
     * @param state Placeholder documentation for ChannelState
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelState
     */
    public StopChannelResult withState(ChannelState state) {
        this.state = state.toString();
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
    public StopChannelResult withTags(java.util.Map<String, String> tags) {
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
    public StopChannelResult addTagsEntry(String key, String value) {
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
    public StopChannelResult clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getChannelClass() != null)
            sb.append("ChannelClass: " + getChannelClass() + ",");
        if (getDestinations() != null)
            sb.append("Destinations: " + getDestinations() + ",");
        if (getEgressEndpoints() != null)
            sb.append("EgressEndpoints: " + getEgressEndpoints() + ",");
        if (getEncoderSettings() != null)
            sb.append("EncoderSettings: " + getEncoderSettings() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getInputAttachments() != null)
            sb.append("InputAttachments: " + getInputAttachments() + ",");
        if (getInputSpecification() != null)
            sb.append("InputSpecification: " + getInputSpecification() + ",");
        if (getLogLevel() != null)
            sb.append("LogLevel: " + getLogLevel() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getPipelineDetails() != null)
            sb.append("PipelineDetails: " + getPipelineDetails() + ",");
        if (getPipelinesRunningCount() != null)
            sb.append("PipelinesRunningCount: " + getPipelinesRunningCount() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getChannelClass() == null) ? 0 : getChannelClass().hashCode());
        hashCode = prime * hashCode
                + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode
                + ((getEgressEndpoints() == null) ? 0 : getEgressEndpoints().hashCode());
        hashCode = prime * hashCode
                + ((getEncoderSettings() == null) ? 0 : getEncoderSettings().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getInputAttachments() == null) ? 0 : getInputAttachments().hashCode());
        hashCode = prime * hashCode
                + ((getInputSpecification() == null) ? 0 : getInputSpecification().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getPipelineDetails() == null) ? 0 : getPipelineDetails().hashCode());
        hashCode = prime
                * hashCode
                + ((getPipelinesRunningCount() == null) ? 0 : getPipelinesRunningCount().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopChannelResult == false)
            return false;
        StopChannelResult other = (StopChannelResult) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
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
        if (other.getEgressEndpoints() == null ^ this.getEgressEndpoints() == null)
            return false;
        if (other.getEgressEndpoints() != null
                && other.getEgressEndpoints().equals(this.getEgressEndpoints()) == false)
            return false;
        if (other.getEncoderSettings() == null ^ this.getEncoderSettings() == null)
            return false;
        if (other.getEncoderSettings() != null
                && other.getEncoderSettings().equals(this.getEncoderSettings()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        if (other.getPipelineDetails() == null ^ this.getPipelineDetails() == null)
            return false;
        if (other.getPipelineDetails() != null
                && other.getPipelineDetails().equals(this.getPipelineDetails()) == false)
            return false;
        if (other.getPipelinesRunningCount() == null ^ this.getPipelinesRunningCount() == null)
            return false;
        if (other.getPipelinesRunningCount() != null
                && other.getPipelinesRunningCount().equals(this.getPipelinesRunningCount()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
