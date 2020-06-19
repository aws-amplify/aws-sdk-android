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
 * Updates an input.
 */
public class UpdateInputRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Destination settings for PUSH type inputs.
     */
    private java.util.List<InputDestinationRequest> destinations;

    /**
     * Settings for the devices.
     */
    private java.util.List<InputDeviceRequest> inputDevices;

    /**
     * Unique ID of the input.
     */
    private String inputId;

    /**
     * A list of security groups referenced by IDs to attach to the input.
     */
    private java.util.List<String> inputSecurityGroups;

    /**
     * A list of the MediaConnect Flow ARNs that you want to use as the source
     * of the input. You can specify as few as one Flow and presently, as many
     * as two. The only requirement is when you have more than one is that each
     * Flow is in a separate Availability Zone as this ensures your EML input is
     * redundant to AZ issues.
     */
    private java.util.List<MediaConnectFlowRequest> mediaConnectFlows;

    /**
     * Name of the input.
     */
    private String name;

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
    public UpdateInputRequest withDestinations(InputDestinationRequest... destinations) {
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
    public UpdateInputRequest withDestinations(
            java.util.Collection<InputDestinationRequest> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * Settings for the devices.
     *
     * @return Settings for the devices.
     */
    public java.util.List<InputDeviceRequest> getInputDevices() {
        return inputDevices;
    }

    /**
     * Settings for the devices.
     *
     * @param inputDevices Settings for the devices.
     */
    public void setInputDevices(java.util.Collection<InputDeviceRequest> inputDevices) {
        if (inputDevices == null) {
            this.inputDevices = null;
            return;
        }

        this.inputDevices = new java.util.ArrayList<InputDeviceRequest>(inputDevices);
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
    public UpdateInputRequest withInputDevices(InputDeviceRequest... inputDevices) {
        if (getInputDevices() == null) {
            this.inputDevices = new java.util.ArrayList<InputDeviceRequest>(inputDevices.length);
        }
        for (InputDeviceRequest value : inputDevices) {
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
    public UpdateInputRequest withInputDevices(java.util.Collection<InputDeviceRequest> inputDevices) {
        setInputDevices(inputDevices);
        return this;
    }

    /**
     * Unique ID of the input.
     *
     * @return Unique ID of the input.
     */
    public String getInputId() {
        return inputId;
    }

    /**
     * Unique ID of the input.
     *
     * @param inputId Unique ID of the input.
     */
    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    /**
     * Unique ID of the input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputId Unique ID of the input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateInputRequest withInputId(String inputId) {
        this.inputId = inputId;
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
    public UpdateInputRequest withInputSecurityGroups(String... inputSecurityGroups) {
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
    public UpdateInputRequest withInputSecurityGroups(
            java.util.Collection<String> inputSecurityGroups) {
        setInputSecurityGroups(inputSecurityGroups);
        return this;
    }

    /**
     * A list of the MediaConnect Flow ARNs that you want to use as the source
     * of the input. You can specify as few as one Flow and presently, as many
     * as two. The only requirement is when you have more than one is that each
     * Flow is in a separate Availability Zone as this ensures your EML input is
     * redundant to AZ issues.
     * 
     * @return A list of the MediaConnect Flow ARNs that you want to use as the
     *         source of the input. You can specify as few as one Flow and
     *         presently, as many as two. The only requirement is when you have
     *         more than one is that each Flow is in a separate Availability
     *         Zone as this ensures your EML input is redundant to AZ issues.
     */
    public java.util.List<MediaConnectFlowRequest> getMediaConnectFlows() {
        return mediaConnectFlows;
    }

    /**
     * A list of the MediaConnect Flow ARNs that you want to use as the source
     * of the input. You can specify as few as one Flow and presently, as many
     * as two. The only requirement is when you have more than one is that each
     * Flow is in a separate Availability Zone as this ensures your EML input is
     * redundant to AZ issues.
     * 
     * @param mediaConnectFlows A list of the MediaConnect Flow ARNs that you
     *            want to use as the source of the input. You can specify as few
     *            as one Flow and presently, as many as two. The only
     *            requirement is when you have more than one is that each Flow
     *            is in a separate Availability Zone as this ensures your EML
     *            input is redundant to AZ issues.
     */
    public void setMediaConnectFlows(java.util.Collection<MediaConnectFlowRequest> mediaConnectFlows) {
        if (mediaConnectFlows == null) {
            this.mediaConnectFlows = null;
            return;
        }

        this.mediaConnectFlows = new java.util.ArrayList<MediaConnectFlowRequest>(mediaConnectFlows);
    }

    /**
     * A list of the MediaConnect Flow ARNs that you want to use as the source
     * of the input. You can specify as few as one Flow and presently, as many
     * as two. The only requirement is when you have more than one is that each
     * Flow is in a separate Availability Zone as this ensures your EML input is
     * redundant to AZ issues. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaConnectFlows A list of the MediaConnect Flow ARNs that you
     *            want to use as the source of the input. You can specify as few
     *            as one Flow and presently, as many as two. The only
     *            requirement is when you have more than one is that each Flow
     *            is in a separate Availability Zone as this ensures your EML
     *            input is redundant to AZ issues. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateInputRequest withMediaConnectFlows(MediaConnectFlowRequest... mediaConnectFlows) {
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
     * A list of the MediaConnect Flow ARNs that you want to use as the source
     * of the input. You can specify as few as one Flow and presently, as many
     * as two. The only requirement is when you have more than one is that each
     * Flow is in a separate Availability Zone as this ensures your EML input is
     * redundant to AZ issues. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaConnectFlows A list of the MediaConnect Flow ARNs that you
     *            want to use as the source of the input. You can specify as few
     *            as one Flow and presently, as many as two. The only
     *            requirement is when you have more than one is that each Flow
     *            is in a separate Availability Zone as this ensures your EML
     *            input is redundant to AZ issues. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateInputRequest withMediaConnectFlows(
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
    public UpdateInputRequest withName(String name) {
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
    public UpdateInputRequest withRoleArn(String roleArn) {
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
    public UpdateInputRequest withSources(InputSourceRequest... sources) {
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
    public UpdateInputRequest withSources(java.util.Collection<InputSourceRequest> sources) {
        setSources(sources);
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
        if (getInputId() != null)
            sb.append("InputId: " + getInputId() + ",");
        if (getInputSecurityGroups() != null)
            sb.append("InputSecurityGroups: " + getInputSecurityGroups() + ",");
        if (getMediaConnectFlows() != null)
            sb.append("MediaConnectFlows: " + getMediaConnectFlows() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getSources() != null)
            sb.append("Sources: " + getSources());
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
        hashCode = prime * hashCode + ((getInputId() == null) ? 0 : getInputId().hashCode());
        hashCode = prime * hashCode
                + ((getInputSecurityGroups() == null) ? 0 : getInputSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getMediaConnectFlows() == null) ? 0 : getMediaConnectFlows().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateInputRequest == false)
            return false;
        UpdateInputRequest other = (UpdateInputRequest) obj;

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
        if (other.getInputId() == null ^ this.getInputId() == null)
            return false;
        if (other.getInputId() != null && other.getInputId().equals(this.getInputId()) == false)
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
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        return true;
    }
}
