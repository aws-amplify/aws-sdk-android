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
 * Create an input
 */
public class CreateInputRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Destination settings for PUSH type inputs.
     */
    private java.util.List<InputDestinationRequest> destinations;

    /**
     * Settings for the devices.
     */
    private java.util.List<InputDeviceSettings> inputDevices;

    /**
     * A list of security groups referenced by IDs to attach to the input.
     */
    private java.util.List<String> inputSecurityGroups;

    /**
     * A list of the MediaConnect Flows that you want to use in this input. You
     * can specify as few as one Flow and presently, as many as two. The only
     * requirement is when you have more than one is that each Flow is in a
     * separate Availability Zone as this ensures your EML input is redundant to
     * AZ issues.
     */
    private java.util.List<MediaConnectFlowRequest> mediaConnectFlows;

    /**
     * Name of the input.
     */
    private String name;

    /**
     * Unique identifier of the request to ensure the request is handled exactly
     * once in case of retries.
     */
    private String requestId;

    /**
     * The Amazon Resource Name (ARN) of the role this input assumes during and
     * after creation.
     */
    private String roleArn;

    /**
     * The source URLs for a PULL-type input. Every PULL type input needs
     * exactly two source URLs for redundancy. Only specify sources for PULL
     * type Inputs. Leave Destinations empty.
     */
    private java.util.List<InputSourceRequest> sources;

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
     * Settings for a private VPC Input. When this property is specified, the
     * input destination addresses will be created in a VPC rather than with
     * public Internet addresses. This property requires setting the roleArn
     * property on Input creation. Not compatible with the inputSecurityGroups
     * property.
     */
    private InputVpcRequest vpc;

    /**
     * Destination settings for PUSH type inputs.
     *
     * @return Destination settings for PUSH type inputs.
     */
    public java.util.List<InputDestinationRequest> getDestinations() {
        return destinations;
    }

    /**
     * Destination settings for PUSH type inputs.
     *
     * @param destinations Destination settings for PUSH type inputs.
     */
    public void setDestinations(java.util.Collection<InputDestinationRequest> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<InputDestinationRequest>(destinations);
    }

    /**
     * Destination settings for PUSH type inputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations Destination settings for PUSH type inputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputRequest withDestinations(InputDestinationRequest... destinations) {
        if (getDestinations() == null) {
            this.destinations = new java.util.ArrayList<InputDestinationRequest>(
                    destinations.length);
        }
        for (InputDestinationRequest value : destinations) {
            this.destinations.add(value);
        }
        return this;
    }

    /**
     * Destination settings for PUSH type inputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations Destination settings for PUSH type inputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputRequest withDestinations(
            java.util.Collection<InputDestinationRequest> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * Settings for the devices.
     *
     * @return Settings for the devices.
     */
    public java.util.List<InputDeviceSettings> getInputDevices() {
        return inputDevices;
    }

    /**
     * Settings for the devices.
     *
     * @param inputDevices Settings for the devices.
     */
    public void setInputDevices(java.util.Collection<InputDeviceSettings> inputDevices) {
        if (inputDevices == null) {
            this.inputDevices = null;
            return;
        }

        this.inputDevices = new java.util.ArrayList<InputDeviceSettings>(inputDevices);
    }

    /**
     * Settings for the devices.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDevices Settings for the devices.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputRequest withInputDevices(InputDeviceSettings... inputDevices) {
        if (getInputDevices() == null) {
            this.inputDevices = new java.util.ArrayList<InputDeviceSettings>(inputDevices.length);
        }
        for (InputDeviceSettings value : inputDevices) {
            this.inputDevices.add(value);
        }
        return this;
    }

    /**
     * Settings for the devices.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDevices Settings for the devices.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputRequest withInputDevices(
            java.util.Collection<InputDeviceSettings> inputDevices) {
        setInputDevices(inputDevices);
        return this;
    }

    /**
     * A list of security groups referenced by IDs to attach to the input.
     *
     * @return A list of security groups referenced by IDs to attach to the
     *         input.
     */
    public java.util.List<String> getInputSecurityGroups() {
        return inputSecurityGroups;
    }

    /**
     * A list of security groups referenced by IDs to attach to the input.
     *
     * @param inputSecurityGroups A list of security groups referenced by IDs to
     *            attach to the input.
     */
    public void setInputSecurityGroups(java.util.Collection<String> inputSecurityGroups) {
        if (inputSecurityGroups == null) {
            this.inputSecurityGroups = null;
            return;
        }

        this.inputSecurityGroups = new java.util.ArrayList<String>(inputSecurityGroups);
    }

    /**
     * A list of security groups referenced by IDs to attach to the input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputSecurityGroups A list of security groups referenced by IDs to
     *            attach to the input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputRequest withInputSecurityGroups(String... inputSecurityGroups) {
        if (getInputSecurityGroups() == null) {
            this.inputSecurityGroups = new java.util.ArrayList<String>(inputSecurityGroups.length);
        }
        for (String value : inputSecurityGroups) {
            this.inputSecurityGroups.add(value);
        }
        return this;
    }

    /**
     * A list of security groups referenced by IDs to attach to the input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputSecurityGroups A list of security groups referenced by IDs to
     *            attach to the input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputRequest withInputSecurityGroups(
            java.util.Collection<String> inputSecurityGroups) {
        setInputSecurityGroups(inputSecurityGroups);
        return this;
    }

    /**
     * A list of the MediaConnect Flows that you want to use in this input. You
     * can specify as few as one Flow and presently, as many as two. The only
     * requirement is when you have more than one is that each Flow is in a
     * separate Availability Zone as this ensures your EML input is redundant to
     * AZ issues.
     * 
     * @return A list of the MediaConnect Flows that you want to use in this
     *         input. You can specify as few as one Flow and presently, as many
     *         as two. The only requirement is when you have more than one is
     *         that each Flow is in a separate Availability Zone as this ensures
     *         your EML input is redundant to AZ issues.
     */
    public java.util.List<MediaConnectFlowRequest> getMediaConnectFlows() {
        return mediaConnectFlows;
    }

    /**
     * A list of the MediaConnect Flows that you want to use in this input. You
     * can specify as few as one Flow and presently, as many as two. The only
     * requirement is when you have more than one is that each Flow is in a
     * separate Availability Zone as this ensures your EML input is redundant to
     * AZ issues.
     * 
     * @param mediaConnectFlows A list of the MediaConnect Flows that you want to
     *            use in this input. You can specify as few as one Flow and
     *            presently, as many as two. The only requirement is when you
     *            have more than one is that each Flow is in a separate
     *            Availability Zone as this ensures your EML input is redundant
     *            to AZ issues.
     */
    public void setMediaConnectFlows(java.util.Collection<MediaConnectFlowRequest> mediaConnectFlows) {
        if (mediaConnectFlows == null) {
            this.mediaConnectFlows = null;
            return;
        }

        this.mediaConnectFlows = new java.util.ArrayList<MediaConnectFlowRequest>(mediaConnectFlows);
    }

    /**
     * A list of the MediaConnect Flows that you want to use in this input. You
     * can specify as few as one Flow and presently, as many as two. The only
     * requirement is when you have more than one is that each Flow is in a
     * separate Availability Zone as this ensures your EML input is redundant to
     * AZ issues. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaConnectFlows A list of the MediaConnect Flows that you want
     *            to use in this input. You can specify as few as one Flow and
     *            presently, as many as two. The only requirement is when you
     *            have more than one is that each Flow is in a separate
     *            Availability Zone as this ensures your EML input is redundant
     *            to AZ issues. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputRequest withMediaConnectFlows(MediaConnectFlowRequest... mediaConnectFlows) {
        if (getMediaConnectFlows() == null) {
            this.mediaConnectFlows = new java.util.ArrayList<MediaConnectFlowRequest>(
                    mediaConnectFlows.length);
        }
        for (MediaConnectFlowRequest value : mediaConnectFlows) {
            this.mediaConnectFlows.add(value);
        }
        return this;
    }

    /**
     * A list of the MediaConnect Flows that you want to use in this input. You
     * can specify as few as one Flow and presently, as many as two. The only
     * requirement is when you have more than one is that each Flow is in a
     * separate Availability Zone as this ensures your EML input is redundant to
     * AZ issues. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaConnectFlows A list of the MediaConnect Flows that you want
     *            to use in this input. You can specify as few as one Flow and
     *            presently, as many as two. The only requirement is when you
     *            have more than one is that each Flow is in a separate
     *            Availability Zone as this ensures your EML input is redundant
     *            to AZ issues. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputRequest withMediaConnectFlows(
            java.util.Collection<MediaConnectFlowRequest> mediaConnectFlows) {
        setMediaConnectFlows(mediaConnectFlows);
        return this;
    }

    /**
     * Name of the input.
     *
     * @return Name of the input.
     */
    public String getName() {
        return name;
    }

    /**
     * Name of the input.
     *
     * @param name Name of the input.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name of the input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name Name of the input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Unique identifier of the request to ensure the request is handled exactly
     * once in case of retries.
     * 
     * @return Unique identifier of the request to ensure the request is handled
     *         exactly once in case of retries.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Unique identifier of the request to ensure the request is handled exactly
     * once in case of retries.
     * 
     * @param requestId Unique identifier of the request to ensure the request is
     *            handled exactly once in case of retries.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Unique identifier of the request to ensure the request is handled exactly
     * once in case of retries. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestId Unique identifier of the request to ensure the request
     *            is handled exactly once in case of retries. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputRequest withRequestId(String requestId) {
        this.requestId = requestId;
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
    public CreateInputRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * The source URLs for a PULL-type input. Every PULL type input needs
     * exactly two source URLs for redundancy. Only specify sources for PULL
     * type Inputs. Leave Destinations empty.
     * 
     * @return The source URLs for a PULL-type input. Every PULL type input needs
     *         exactly two source URLs for redundancy. Only specify sources for
     *         PULL type Inputs. Leave Destinations empty.
     */
    public java.util.List<InputSourceRequest> getSources() {
        return sources;
    }

    /**
     * The source URLs for a PULL-type input. Every PULL type input needs
     * exactly two source URLs for redundancy. Only specify sources for PULL
     * type Inputs. Leave Destinations empty.
     * 
     * @param sources The source URLs for a PULL-type input. Every PULL type
     *            input needs exactly two source URLs for redundancy. Only
     *            specify sources for PULL type Inputs. Leave Destinations
     *            empty.
     */
    public void setSources(java.util.Collection<InputSourceRequest> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<InputSourceRequest>(sources);
    }

    /**
     * The source URLs for a PULL-type input. Every PULL type input needs
     * exactly two source URLs for redundancy. Only specify sources for PULL
     * type Inputs. Leave Destinations empty. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sources The source URLs for a PULL-type input. Every PULL type
     *            input needs exactly two source URLs for redundancy. Only
     *            specify sources for PULL type Inputs. Leave Destinations
     *            empty. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputRequest withSources(InputSourceRequest... sources) {
        if (getSources() == null) {
            this.sources = new java.util.ArrayList<InputSourceRequest>(sources.length);
        }
        for (InputSourceRequest value : sources) {
            this.sources.add(value);
        }
        return this;
    }

    /**
     * The source URLs for a PULL-type input. Every PULL type input needs
     * exactly two source URLs for redundancy. Only specify sources for PULL
     * type Inputs. Leave Destinations empty. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sources The source URLs for a PULL-type input. Every PULL type
     *            input needs exactly two source URLs for redundancy. Only
     *            specify sources for PULL type Inputs. Leave Destinations
     *            empty. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputRequest withSources(java.util.Collection<InputSourceRequest> sources) {
        setSources(sources);
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
    public CreateInputRequest withTags(java.util.Map<String, String> tags) {
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
    public CreateInputRequest addTagsEntry(String key, String value) {
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
    public CreateInputRequest clearTagsEntries() {
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
    public CreateInputRequest withType(String type) {
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
    public CreateInputRequest withType(InputType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * Settings for a private VPC Input. When this property is specified, the
     * input destination addresses will be created in a VPC rather than with
     * public Internet addresses. This property requires setting the roleArn
     * property on Input creation. Not compatible with the inputSecurityGroups
     * property.
     * 
     * @return Settings for a private VPC Input. When this property is specified,
     *         the input destination addresses will be created in a VPC rather
     *         than with public Internet addresses. This property requires
     *         setting the roleArn property on Input creation. Not compatible
     *         with the inputSecurityGroups property.
     */
    public InputVpcRequest getVpc() {
        return vpc;
    }

    /**
     * Settings for a private VPC Input. When this property is specified, the
     * input destination addresses will be created in a VPC rather than with
     * public Internet addresses. This property requires setting the roleArn
     * property on Input creation. Not compatible with the inputSecurityGroups
     * property.
     * 
     * @param vpc Settings for a private VPC Input. When this property is
     *            specified, the input destination addresses will be created in
     *            a VPC rather than with public Internet addresses. This
     *            property requires setting the roleArn property on Input
     *            creation. Not compatible with the inputSecurityGroups
     *            property.
     */
    public void setVpc(InputVpcRequest vpc) {
        this.vpc = vpc;
    }

    /**
     * Settings for a private VPC Input. When this property is specified, the
     * input destination addresses will be created in a VPC rather than with
     * public Internet addresses. This property requires setting the roleArn
     * property on Input creation. Not compatible with the inputSecurityGroups
     * property. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpc Settings for a private VPC Input. When this property is
     *            specified, the input destination addresses will be created in
     *            a VPC rather than with public Internet addresses. This
     *            property requires setting the roleArn property on Input
     *            creation. Not compatible with the inputSecurityGroups
     *            property. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputRequest withVpc(InputVpcRequest vpc) {
        this.vpc = vpc;
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
        if (getDestinations() != null)
            sb.append("Destinations: " + getDestinations() + ",");
        if (getInputDevices() != null)
            sb.append("InputDevices: " + getInputDevices() + ",");
        if (getInputSecurityGroups() != null)
            sb.append("InputSecurityGroups: " + getInputSecurityGroups() + ",");
        if (getMediaConnectFlows() != null)
            sb.append("MediaConnectFlows: " + getMediaConnectFlows() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRequestId() != null)
            sb.append("RequestId: " + getRequestId() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getSources() != null)
            sb.append("Sources: " + getSources() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getVpc() != null)
            sb.append("Vpc: " + getVpc());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode
                + ((getInputDevices() == null) ? 0 : getInputDevices().hashCode());
        hashCode = prime * hashCode
                + ((getInputSecurityGroups() == null) ? 0 : getInputSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getMediaConnectFlows() == null) ? 0 : getMediaConnectFlows().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVpc() == null) ? 0 : getVpc().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInputRequest == false)
            return false;
        CreateInputRequest other = (CreateInputRequest) obj;

        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null
                && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getInputDevices() == null ^ this.getInputDevices() == null)
            return false;
        if (other.getInputDevices() != null
                && other.getInputDevices().equals(this.getInputDevices()) == false)
            return false;
        if (other.getInputSecurityGroups() == null ^ this.getInputSecurityGroups() == null)
            return false;
        if (other.getInputSecurityGroups() != null
                && other.getInputSecurityGroups().equals(this.getInputSecurityGroups()) == false)
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
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVpc() == null ^ this.getVpc() == null)
            return false;
        if (other.getVpc() != null && other.getVpc().equals(this.getVpc()) == false)
            return false;
        return true;
    }
}
