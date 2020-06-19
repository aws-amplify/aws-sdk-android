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

/**
 * Placeholder documentation for Input
 */
public class Input implements Serializable {
    /**
     * The Unique ARN of the input (generated, immutable).
     */
    private String arn;

    /**
     * A list of channel IDs that that input is attached to (currently an input
     * can only be attached to one channel).
     */
    private java.util.List<String> attachedChannels;

    /**
     * A list of the destinations of the input (PUSH-type).
     */
    private java.util.List<InputDestination> destinations;

    /**
     * The generated ID of the input (unique for user account, immutable).
     */
    private String id;

    /**
     * STANDARD - MediaLive expects two sources to be connected to this input.
     * If the channel is also STANDARD, both sources will be ingested. If the
     * channel is SINGLE_PIPELINE, only the first source will be ingested; the
     * second source will always be ignored, even if the first source fails.
     * SINGLE_PIPELINE - You can connect only one source to this input. If the
     * ChannelClass is also SINGLE_PIPELINE, this value is valid. If the
     * ChannelClass is STANDARD, this value is not valid because the channel
     * requires two sources in the input. <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     */
    private String inputClass;

    /**
     * Settings for the input devices.
     */
    private java.util.List<InputDeviceSettings> inputDevices;

    /**
     * Certain pull input sources can be dynamic, meaning that they can have
     * their URL's dynamically changes during input switch actions. Presently,
     * this functionality only works with MP4_FILE inputs. <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, DYNAMIC
     */
    private String inputSourceType;

    /**
     * A list of MediaConnect Flows for this input.
     */
    private java.util.List<MediaConnectFlow> mediaConnectFlows;

    /**
     * The user-assigned name (This is a mutable value).
     */
    private String name;

    /**
     * The Amazon Resource Name (ARN) of the role this input assumes during and
     * after creation.
     */
    private String roleArn;

    /**
     * A list of IDs for all the Input Security Groups attached to the input.
     */
    private java.util.List<String> securityGroups;

    /**
     * A list of the sources of the input (PULL-type).
     */
    private java.util.List<InputSource> sources;

    /**
     * Placeholder documentation for InputState
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DETACHED, ATTACHED, DELETING, DELETED
     */
    private String state;

    /**
     * A collection of key-value pairs.
     */
    private java.util.Map<String, String> tags;

    /**
     * Placeholder documentation for InputType
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UDP_PUSH, RTP_PUSH, RTMP_PUSH, RTMP_PULL,
     * URL_PULL, MP4_FILE, MEDIACONNECT, INPUT_DEVICE
     */
    private String type;

    /**
     * The Unique ARN of the input (generated, immutable).
     *
     * @return The Unique ARN of the input (generated, immutable).
     */
    public String getArn() {
        return arn;
    }

    /**
     * The Unique ARN of the input (generated, immutable).
     *
     * @param arn The Unique ARN of the input (generated, immutable).
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The Unique ARN of the input (generated, immutable).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn The Unique ARN of the input (generated, immutable).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Input withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * A list of channel IDs that that input is attached to (currently an input
     * can only be attached to one channel).
     *
     * @return A list of channel IDs that that input is attached to (currently
     *         an input can only be attached to one channel).
     */
    public java.util.List<String> getAttachedChannels() {
        return attachedChannels;
    }

    /**
     * A list of channel IDs that that input is attached to (currently an input
     * can only be attached to one channel).
     *
     * @param attachedChannels A list of channel IDs that that input is attached
     *            to (currently an input can only be attached to one channel).
     */
    public void setAttachedChannels(java.util.Collection<String> attachedChannels) {
        if (attachedChannels == null) {
            this.attachedChannels = null;
            return;
        }

        this.attachedChannels = new java.util.ArrayList<String>(attachedChannels);
    }

    /**
     * A list of channel IDs that that input is attached to (currently an input
     * can only be attached to one channel).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachedChannels A list of channel IDs that that input is attached
     *            to (currently an input can only be attached to one channel).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Input withAttachedChannels(String... attachedChannels) {
        if (getAttachedChannels() == null) {
            this.attachedChannels = new java.util.ArrayList<String>(attachedChannels.length);
        }
        for (String value : attachedChannels) {
            this.attachedChannels.add(value);
        }
        return this;
    }

    /**
     * A list of channel IDs that that input is attached to (currently an input
     * can only be attached to one channel).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachedChannels A list of channel IDs that that input is attached
     *            to (currently an input can only be attached to one channel).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Input withAttachedChannels(java.util.Collection<String> attachedChannels) {
        setAttachedChannels(attachedChannels);
        return this;
    }

    /**
     * A list of the destinations of the input (PUSH-type).
     *
     * @return A list of the destinations of the input (PUSH-type).
     */
    public java.util.List<InputDestination> getDestinations() {
        return destinations;
    }

    /**
     * A list of the destinations of the input (PUSH-type).
     *
     * @param destinations A list of the destinations of the input (PUSH-type).
     */
    public void setDestinations(java.util.Collection<InputDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<InputDestination>(destinations);
    }

    /**
     * A list of the destinations of the input (PUSH-type).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations A list of the destinations of the input (PUSH-type).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Input withDestinations(InputDestination... destinations) {
        if (getDestinations() == null) {
            this.destinations = new java.util.ArrayList<InputDestination>(destinations.length);
        }
        for (InputDestination value : destinations) {
            this.destinations.add(value);
        }
        return this;
    }

    /**
     * A list of the destinations of the input (PUSH-type).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations A list of the destinations of the input (PUSH-type).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Input withDestinations(java.util.Collection<InputDestination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * The generated ID of the input (unique for user account, immutable).
     *
     * @return The generated ID of the input (unique for user account,
     *         immutable).
     */
    public String getId() {
        return id;
    }

    /**
     * The generated ID of the input (unique for user account, immutable).
     *
     * @param id The generated ID of the input (unique for user account,
     *            immutable).
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The generated ID of the input (unique for user account, immutable).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id The generated ID of the input (unique for user account,
     *            immutable).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Input withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * STANDARD - MediaLive expects two sources to be connected to this input.
     * If the channel is also STANDARD, both sources will be ingested. If the
     * channel is SINGLE_PIPELINE, only the first source will be ingested; the
     * second source will always be ignored, even if the first source fails.
     * SINGLE_PIPELINE - You can connect only one source to this input. If the
     * ChannelClass is also SINGLE_PIPELINE, this value is valid. If the
     * ChannelClass is STANDARD, this value is not valid because the channel
     * requires two sources in the input. <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @return STANDARD - MediaLive expects two sources to be connected to this
     *         input. If the channel is also STANDARD, both sources will be
     *         ingested. If the channel is SINGLE_PIPELINE, only the first
     *         source will be ingested; the second source will always be
     *         ignored, even if the first source fails. SINGLE_PIPELINE - You
     *         can connect only one source to this input. If the ChannelClass is
     *         also SINGLE_PIPELINE, this value is valid. If the ChannelClass is
     *         STANDARD, this value is not valid because the channel requires
     *         two sources in the input. @see InputClass
     */
    public String getInputClass() {
        return inputClass;
    }

    /**
     * STANDARD - MediaLive expects two sources to be connected to this input.
     * If the channel is also STANDARD, both sources will be ingested. If the
     * channel is SINGLE_PIPELINE, only the first source will be ingested; the
     * second source will always be ignored, even if the first source fails.
     * SINGLE_PIPELINE - You can connect only one source to this input. If the
     * ChannelClass is also SINGLE_PIPELINE, this value is valid. If the
     * ChannelClass is STANDARD, this value is not valid because the channel
     * requires two sources in the input. <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @param inputClass STANDARD - MediaLive expects two sources to be
     *            connected to this input. If the channel is also STANDARD, both
     *            sources will be ingested. If the channel is SINGLE_PIPELINE,
     *            only the first source will be ingested; the second source will
     *            always be ignored, even if the first source fails.
     *            SINGLE_PIPELINE - You can connect only one source to this
     *            input. If the ChannelClass is also SINGLE_PIPELINE, this value
     *            is valid. If the ChannelClass is STANDARD, this value is not
     *            valid because the channel requires two sources in the input. @see InputClass
     */
    public void setInputClass(String inputClass) {
        this.inputClass = inputClass;
    }

    /**
     * STANDARD - MediaLive expects two sources to be connected to this input.
     * If the channel is also STANDARD, both sources will be ingested. If the
     * channel is SINGLE_PIPELINE, only the first source will be ingested; the
     * second source will always be ignored, even if the first source fails.
     * SINGLE_PIPELINE - You can connect only one source to this input. If the
     * ChannelClass is also SINGLE_PIPELINE, this value is valid. If the
     * ChannelClass is STANDARD, this value is not valid because the channel
     * requires two sources in the input. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @param inputClass STANDARD - MediaLive expects two sources to be
     *            connected to this input. If the channel is also STANDARD, both
     *            sources will be ingested. If the channel is SINGLE_PIPELINE,
     *            only the first source will be ingested; the second source will
     *            always be ignored, even if the first source fails.
     *            SINGLE_PIPELINE - You can connect only one source to this
     *            input. If the ChannelClass is also SINGLE_PIPELINE, this value
     *            is valid. If the ChannelClass is STANDARD, this value is not
     *            valid because the channel requires two sources in the input. @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputClass
     */
    public Input withInputClass(String inputClass) {
        this.inputClass = inputClass;
        return this;
    }

    /**
     * STANDARD - MediaLive expects two sources to be connected to this input.
     * If the channel is also STANDARD, both sources will be ingested. If the
     * channel is SINGLE_PIPELINE, only the first source will be ingested; the
     * second source will always be ignored, even if the first source fails.
     * SINGLE_PIPELINE - You can connect only one source to this input. If the
     * ChannelClass is also SINGLE_PIPELINE, this value is valid. If the
     * ChannelClass is STANDARD, this value is not valid because the channel
     * requires two sources in the input. <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @param inputClass STANDARD - MediaLive expects two sources to be
     *            connected to this input. If the channel is also STANDARD, both
     *            sources will be ingested. If the channel is SINGLE_PIPELINE,
     *            only the first source will be ingested; the second source will
     *            always be ignored, even if the first source fails.
     *            SINGLE_PIPELINE - You can connect only one source to this
     *            input. If the ChannelClass is also SINGLE_PIPELINE, this value
     *            is valid. If the ChannelClass is STANDARD, this value is not
     *            valid because the channel requires two sources in the input. @see InputClass
     */
    public void setInputClass(InputClass inputClass) {
        this.inputClass = inputClass.toString();
    }

    /**
     * STANDARD - MediaLive expects two sources to be connected to this input.
     * If the channel is also STANDARD, both sources will be ingested. If the
     * channel is SINGLE_PIPELINE, only the first source will be ingested; the
     * second source will always be ignored, even if the first source fails.
     * SINGLE_PIPELINE - You can connect only one source to this input. If the
     * ChannelClass is also SINGLE_PIPELINE, this value is valid. If the
     * ChannelClass is STANDARD, this value is not valid because the channel
     * requires two sources in the input. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @param inputClass STANDARD - MediaLive expects two sources to be
     *            connected to this input. If the channel is also STANDARD, both
     *            sources will be ingested. If the channel is SINGLE_PIPELINE,
     *            only the first source will be ingested; the second source will
     *            always be ignored, even if the first source fails.
     *            SINGLE_PIPELINE - You can connect only one source to this
     *            input. If the ChannelClass is also SINGLE_PIPELINE, this value
     *            is valid. If the ChannelClass is STANDARD, this value is not
     *            valid because the channel requires two sources in the input. @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputClass
     */
    public Input withInputClass(InputClass inputClass) {
        this.inputClass = inputClass.toString();
        return this;
    }

    /**
     * Settings for the input devices.
     *
     * @return Settings for the input devices.
     */
    public java.util.List<InputDeviceSettings> getInputDevices() {
        return inputDevices;
    }

    /**
     * Settings for the input devices.
     *
     * @param inputDevices Settings for the input devices.
     */
    public void setInputDevices(java.util.Collection<InputDeviceSettings> inputDevices) {
        if (inputDevices == null) {
            this.inputDevices = null;
            return;
        }

        this.inputDevices = new java.util.ArrayList<InputDeviceSettings>(inputDevices);
    }

    /**
     * Settings for the input devices.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDevices Settings for the input devices.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Input withInputDevices(InputDeviceSettings... inputDevices) {
        if (getInputDevices() == null) {
            this.inputDevices = new java.util.ArrayList<InputDeviceSettings>(inputDevices.length);
        }
        for (InputDeviceSettings value : inputDevices) {
            this.inputDevices.add(value);
        }
        return this;
    }

    /**
     * Settings for the input devices.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDevices Settings for the input devices.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Input withInputDevices(java.util.Collection<InputDeviceSettings> inputDevices) {
        setInputDevices(inputDevices);
        return this;
    }

    /**
     * Certain pull input sources can be dynamic, meaning that they can have
     * their URL's dynamically changes during input switch actions. Presently,
     * this functionality only works with MP4_FILE inputs. <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, DYNAMIC
     *
     * @return Certain pull input sources can be dynamic, meaning that they can
     *         have their URL's dynamically changes during input switch actions.
     *         Presently, this functionality only works with MP4_FILE inputs. @see InputSourceType
     */
    public String getInputSourceType() {
        return inputSourceType;
    }

    /**
     * Certain pull input sources can be dynamic, meaning that they can have
     * their URL's dynamically changes during input switch actions. Presently,
     * this functionality only works with MP4_FILE inputs. <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, DYNAMIC
     *
     * @param inputSourceType Certain pull input sources can be dynamic, meaning
     *            that they can have their URL's dynamically changes during
     *            input switch actions. Presently, this functionality only works
     *            with MP4_FILE inputs. @see InputSourceType
     */
    public void setInputSourceType(String inputSourceType) {
        this.inputSourceType = inputSourceType;
    }

    /**
     * Certain pull input sources can be dynamic, meaning that they can have
     * their URL's dynamically changes during input switch actions. Presently,
     * this functionality only works with MP4_FILE inputs. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, DYNAMIC
     *
     * @param inputSourceType Certain pull input sources can be dynamic, meaning
     *            that they can have their URL's dynamically changes during
     *            input switch actions. Presently, this functionality only works
     *            with MP4_FILE inputs. @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputSourceType
     */
    public Input withInputSourceType(String inputSourceType) {
        this.inputSourceType = inputSourceType;
        return this;
    }

    /**
     * Certain pull input sources can be dynamic, meaning that they can have
     * their URL's dynamically changes during input switch actions. Presently,
     * this functionality only works with MP4_FILE inputs. <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, DYNAMIC
     *
     * @param inputSourceType Certain pull input sources can be dynamic, meaning
     *            that they can have their URL's dynamically changes during
     *            input switch actions. Presently, this functionality only works
     *            with MP4_FILE inputs. @see InputSourceType
     */
    public void setInputSourceType(InputSourceType inputSourceType) {
        this.inputSourceType = inputSourceType.toString();
    }

    /**
     * Certain pull input sources can be dynamic, meaning that they can have
     * their URL's dynamically changes during input switch actions. Presently,
     * this functionality only works with MP4_FILE inputs. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, DYNAMIC
     *
     * @param inputSourceType Certain pull input sources can be dynamic, meaning
     *            that they can have their URL's dynamically changes during
     *            input switch actions. Presently, this functionality only works
     *            with MP4_FILE inputs. @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputSourceType
     */
    public Input withInputSourceType(InputSourceType inputSourceType) {
        this.inputSourceType = inputSourceType.toString();
        return this;
    }

    /**
     * A list of MediaConnect Flows for this input.
     *
     * @return A list of MediaConnect Flows for this input.
     */
    public java.util.List<MediaConnectFlow> getMediaConnectFlows() {
        return mediaConnectFlows;
    }

    /**
     * A list of MediaConnect Flows for this input.
     *
     * @param mediaConnectFlows A list of MediaConnect Flows for this input.
     */
    public void setMediaConnectFlows(java.util.Collection<MediaConnectFlow> mediaConnectFlows) {
        if (mediaConnectFlows == null) {
            this.mediaConnectFlows = null;
            return;
        }

        this.mediaConnectFlows = new java.util.ArrayList<MediaConnectFlow>(mediaConnectFlows);
    }

    /**
     * A list of MediaConnect Flows for this input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaConnectFlows A list of MediaConnect Flows for this input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Input withMediaConnectFlows(MediaConnectFlow... mediaConnectFlows) {
        if (getMediaConnectFlows() == null) {
            this.mediaConnectFlows = new java.util.ArrayList<MediaConnectFlow>(
                    mediaConnectFlows.length);
        }
        for (MediaConnectFlow value : mediaConnectFlows) {
            this.mediaConnectFlows.add(value);
        }
        return this;
    }

    /**
     * A list of MediaConnect Flows for this input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaConnectFlows A list of MediaConnect Flows for this input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Input withMediaConnectFlows(java.util.Collection<MediaConnectFlow> mediaConnectFlows) {
        setMediaConnectFlows(mediaConnectFlows);
        return this;
    }

    /**
     * The user-assigned name (This is a mutable value).
     *
     * @return The user-assigned name (This is a mutable value).
     */
    public String getName() {
        return name;
    }

    /**
     * The user-assigned name (This is a mutable value).
     *
     * @param name The user-assigned name (This is a mutable value).
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The user-assigned name (This is a mutable value).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name The user-assigned name (This is a mutable value).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Input withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the role this input assumes during and
     * after creation.
     *
     * @return The Amazon Resource Name (ARN) of the role this input assumes
     *         during and after creation.
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the role this input assumes during and
     * after creation.
     *
     * @param roleArn The Amazon Resource Name (ARN) of the role this input
     *            assumes during and after creation.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the role this input assumes during and
     * after creation.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn The Amazon Resource Name (ARN) of the role this input
     *            assumes during and after creation.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Input withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * A list of IDs for all the Input Security Groups attached to the input.
     *
     * @return A list of IDs for all the Input Security Groups attached to the
     *         input.
     */
    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * A list of IDs for all the Input Security Groups attached to the input.
     *
     * @param securityGroups A list of IDs for all the Input Security Groups
     *            attached to the input.
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * A list of IDs for all the Input Security Groups attached to the input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups A list of IDs for all the Input Security Groups
     *            attached to the input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Input withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) {
            this.securityGroups = new java.util.ArrayList<String>(securityGroups.length);
        }
        for (String value : securityGroups) {
            this.securityGroups.add(value);
        }
        return this;
    }

    /**
     * A list of IDs for all the Input Security Groups attached to the input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups A list of IDs for all the Input Security Groups
     *            attached to the input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Input withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * A list of the sources of the input (PULL-type).
     *
     * @return A list of the sources of the input (PULL-type).
     */
    public java.util.List<InputSource> getSources() {
        return sources;
    }

    /**
     * A list of the sources of the input (PULL-type).
     *
     * @param sources A list of the sources of the input (PULL-type).
     */
    public void setSources(java.util.Collection<InputSource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<InputSource>(sources);
    }

    /**
     * A list of the sources of the input (PULL-type).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sources A list of the sources of the input (PULL-type).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Input withSources(InputSource... sources) {
        if (getSources() == null) {
            this.sources = new java.util.ArrayList<InputSource>(sources.length);
        }
        for (InputSource value : sources) {
            this.sources.add(value);
        }
        return this;
    }

    /**
     * A list of the sources of the input (PULL-type).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sources A list of the sources of the input (PULL-type).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Input withSources(java.util.Collection<InputSource> sources) {
        setSources(sources);
        return this;
    }

    /**
     * Placeholder documentation for InputState
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DETACHED, ATTACHED, DELETING, DELETED
     *
     * @return Placeholder documentation for InputState
     * @see InputState
     */
    public String getState() {
        return state;
    }

    /**
     * Placeholder documentation for InputState
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DETACHED, ATTACHED, DELETING, DELETED
     *
     * @param state Placeholder documentation for InputState
     * @see InputState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Placeholder documentation for InputState
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DETACHED, ATTACHED, DELETING, DELETED
     *
     * @param state Placeholder documentation for InputState
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputState
     */
    public Input withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Placeholder documentation for InputState
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DETACHED, ATTACHED, DELETING, DELETED
     *
     * @param state Placeholder documentation for InputState
     * @see InputState
     */
    public void setState(InputState state) {
        this.state = state.toString();
    }

    /**
     * Placeholder documentation for InputState
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DETACHED, ATTACHED, DELETING, DELETED
     *
     * @param state Placeholder documentation for InputState
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputState
     */
    public Input withState(InputState state) {
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
    public Input withTags(java.util.Map<String, String> tags) {
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
    public Input addTagsEntry(String key, String value) {
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
    public Input clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * Placeholder documentation for InputType
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UDP_PUSH, RTP_PUSH, RTMP_PUSH, RTMP_PULL,
     * URL_PULL, MP4_FILE, MEDIACONNECT, INPUT_DEVICE
     *
     * @return Placeholder documentation for InputType
     * @see InputType
     */
    public String getType() {
        return type;
    }

    /**
     * Placeholder documentation for InputType
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UDP_PUSH, RTP_PUSH, RTMP_PUSH, RTMP_PULL,
     * URL_PULL, MP4_FILE, MEDIACONNECT, INPUT_DEVICE
     *
     * @param type Placeholder documentation for InputType
     * @see InputType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Placeholder documentation for InputType
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UDP_PUSH, RTP_PUSH, RTMP_PUSH, RTMP_PULL,
     * URL_PULL, MP4_FILE, MEDIACONNECT, INPUT_DEVICE
     *
     * @param type Placeholder documentation for InputType
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputType
     */
    public Input withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Placeholder documentation for InputType
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UDP_PUSH, RTP_PUSH, RTMP_PUSH, RTMP_PULL,
     * URL_PULL, MP4_FILE, MEDIACONNECT, INPUT_DEVICE
     *
     * @param type Placeholder documentation for InputType
     * @see InputType
     */
    public void setType(InputType type) {
        this.type = type.toString();
    }

    /**
     * Placeholder documentation for InputType
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UDP_PUSH, RTP_PUSH, RTMP_PUSH, RTMP_PULL,
     * URL_PULL, MP4_FILE, MEDIACONNECT, INPUT_DEVICE
     *
     * @param type Placeholder documentation for InputType
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputType
     */
    public Input withType(InputType type) {
        this.type = type.toString();
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
        if (getAttachedChannels() != null)
            sb.append("AttachedChannels: " + getAttachedChannels() + ",");
        if (getDestinations() != null)
            sb.append("Destinations: " + getDestinations() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getInputClass() != null)
            sb.append("InputClass: " + getInputClass() + ",");
        if (getInputDevices() != null)
            sb.append("InputDevices: " + getInputDevices() + ",");
        if (getInputSourceType() != null)
            sb.append("InputSourceType: " + getInputSourceType() + ",");
        if (getMediaConnectFlows() != null)
            sb.append("MediaConnectFlows: " + getMediaConnectFlows() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getSources() != null)
            sb.append("Sources: " + getSources() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getAttachedChannels() == null) ? 0 : getAttachedChannels().hashCode());
        hashCode = prime * hashCode
                + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getInputClass() == null) ? 0 : getInputClass().hashCode());
        hashCode = prime * hashCode
                + ((getInputDevices() == null) ? 0 : getInputDevices().hashCode());
        hashCode = prime * hashCode
                + ((getInputSourceType() == null) ? 0 : getInputSourceType().hashCode());
        hashCode = prime * hashCode
                + ((getMediaConnectFlows() == null) ? 0 : getMediaConnectFlows().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Input == false)
            return false;
        Input other = (Input) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAttachedChannels() == null ^ this.getAttachedChannels() == null)
            return false;
        if (other.getAttachedChannels() != null
                && other.getAttachedChannels().equals(this.getAttachedChannels()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null
                && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getInputClass() == null ^ this.getInputClass() == null)
            return false;
        if (other.getInputClass() != null
                && other.getInputClass().equals(this.getInputClass()) == false)
            return false;
        if (other.getInputDevices() == null ^ this.getInputDevices() == null)
            return false;
        if (other.getInputDevices() != null
                && other.getInputDevices().equals(this.getInputDevices()) == false)
            return false;
        if (other.getInputSourceType() == null ^ this.getInputSourceType() == null)
            return false;
        if (other.getInputSourceType() != null
                && other.getInputSourceType().equals(this.getInputSourceType()) == false)
            return false;
        if (other.getMediaConnectFlows() == null ^ this.getMediaConnectFlows() == null)
            return false;
        if (other.getMediaConnectFlows() != null
                && other.getMediaConnectFlows().equals(this.getMediaConnectFlows()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
