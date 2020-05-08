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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Defines a named input source, called a channel, to be used by an algorithm.
 * </p>
 */
public class ChannelSpecification implements Serializable {
    /**
     * <p>
     * The name of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[A-Za-z0-9\.\-_]+<br/>
     */
    private String name;

    /**
     * <p>
     * A brief description of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     */
    private String description;

    /**
     * <p>
     * Indicates whether the channel is required by the algorithm.
     * </p>
     */
    private Boolean isRequired;

    /**
     * <p>
     * The supported MIME types for the data.
     * </p>
     */
    private java.util.List<String> supportedContentTypes;

    /**
     * <p>
     * The allowed compression types, if data compression is used.
     * </p>
     */
    private java.util.List<String> supportedCompressionTypes;

    /**
     * <p>
     * The allowed input mode, either FILE or PIPE.
     * </p>
     * <p>
     * In FILE mode, Amazon SageMaker copies the data from the input source onto
     * the local Amazon Elastic Block Store (Amazon EBS) volumes before starting
     * your training algorithm. This is the most commonly used input mode.
     * </p>
     * <p>
     * In PIPE mode, Amazon SageMaker streams input data from the source
     * directly to your algorithm without using the EBS volume.
     * </p>
     */
    private java.util.List<String> supportedInputModes;

    /**
     * <p>
     * The name of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[A-Za-z0-9\.\-_]+<br/>
     *
     * @return <p>
     *         The name of the channel.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[A-Za-z0-9\.\-_]+<br/>
     *
     * @param name <p>
     *            The name of the channel.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[A-Za-z0-9\.\-_]+<br/>
     *
     * @param name <p>
     *            The name of the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A brief description of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @return <p>
     *         A brief description of the channel.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A brief description of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param description <p>
     *            A brief description of the channel.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param description <p>
     *            A brief description of the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelSpecification withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Indicates whether the channel is required by the algorithm.
     * </p>
     *
     * @return <p>
     *         Indicates whether the channel is required by the algorithm.
     *         </p>
     */
    public Boolean isIsRequired() {
        return isRequired;
    }

    /**
     * <p>
     * Indicates whether the channel is required by the algorithm.
     * </p>
     *
     * @return <p>
     *         Indicates whether the channel is required by the algorithm.
     *         </p>
     */
    public Boolean getIsRequired() {
        return isRequired;
    }

    /**
     * <p>
     * Indicates whether the channel is required by the algorithm.
     * </p>
     *
     * @param isRequired <p>
     *            Indicates whether the channel is required by the algorithm.
     *            </p>
     */
    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    /**
     * <p>
     * Indicates whether the channel is required by the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isRequired <p>
     *            Indicates whether the channel is required by the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelSpecification withIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     * <p>
     * The supported MIME types for the data.
     * </p>
     *
     * @return <p>
     *         The supported MIME types for the data.
     *         </p>
     */
    public java.util.List<String> getSupportedContentTypes() {
        return supportedContentTypes;
    }

    /**
     * <p>
     * The supported MIME types for the data.
     * </p>
     *
     * @param supportedContentTypes <p>
     *            The supported MIME types for the data.
     *            </p>
     */
    public void setSupportedContentTypes(java.util.Collection<String> supportedContentTypes) {
        if (supportedContentTypes == null) {
            this.supportedContentTypes = null;
            return;
        }

        this.supportedContentTypes = new java.util.ArrayList<String>(supportedContentTypes);
    }

    /**
     * <p>
     * The supported MIME types for the data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedContentTypes <p>
     *            The supported MIME types for the data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelSpecification withSupportedContentTypes(String... supportedContentTypes) {
        if (getSupportedContentTypes() == null) {
            this.supportedContentTypes = new java.util.ArrayList<String>(
                    supportedContentTypes.length);
        }
        for (String value : supportedContentTypes) {
            this.supportedContentTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The supported MIME types for the data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedContentTypes <p>
     *            The supported MIME types for the data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelSpecification withSupportedContentTypes(
            java.util.Collection<String> supportedContentTypes) {
        setSupportedContentTypes(supportedContentTypes);
        return this;
    }

    /**
     * <p>
     * The allowed compression types, if data compression is used.
     * </p>
     *
     * @return <p>
     *         The allowed compression types, if data compression is used.
     *         </p>
     */
    public java.util.List<String> getSupportedCompressionTypes() {
        return supportedCompressionTypes;
    }

    /**
     * <p>
     * The allowed compression types, if data compression is used.
     * </p>
     *
     * @param supportedCompressionTypes <p>
     *            The allowed compression types, if data compression is used.
     *            </p>
     */
    public void setSupportedCompressionTypes(java.util.Collection<String> supportedCompressionTypes) {
        if (supportedCompressionTypes == null) {
            this.supportedCompressionTypes = null;
            return;
        }

        this.supportedCompressionTypes = new java.util.ArrayList<String>(supportedCompressionTypes);
    }

    /**
     * <p>
     * The allowed compression types, if data compression is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedCompressionTypes <p>
     *            The allowed compression types, if data compression is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelSpecification withSupportedCompressionTypes(String... supportedCompressionTypes) {
        if (getSupportedCompressionTypes() == null) {
            this.supportedCompressionTypes = new java.util.ArrayList<String>(
                    supportedCompressionTypes.length);
        }
        for (String value : supportedCompressionTypes) {
            this.supportedCompressionTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The allowed compression types, if data compression is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedCompressionTypes <p>
     *            The allowed compression types, if data compression is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelSpecification withSupportedCompressionTypes(
            java.util.Collection<String> supportedCompressionTypes) {
        setSupportedCompressionTypes(supportedCompressionTypes);
        return this;
    }

    /**
     * <p>
     * The allowed input mode, either FILE or PIPE.
     * </p>
     * <p>
     * In FILE mode, Amazon SageMaker copies the data from the input source onto
     * the local Amazon Elastic Block Store (Amazon EBS) volumes before starting
     * your training algorithm. This is the most commonly used input mode.
     * </p>
     * <p>
     * In PIPE mode, Amazon SageMaker streams input data from the source
     * directly to your algorithm without using the EBS volume.
     * </p>
     *
     * @return <p>
     *         The allowed input mode, either FILE or PIPE.
     *         </p>
     *         <p>
     *         In FILE mode, Amazon SageMaker copies the data from the input
     *         source onto the local Amazon Elastic Block Store (Amazon EBS)
     *         volumes before starting your training algorithm. This is the most
     *         commonly used input mode.
     *         </p>
     *         <p>
     *         In PIPE mode, Amazon SageMaker streams input data from the source
     *         directly to your algorithm without using the EBS volume.
     *         </p>
     */
    public java.util.List<String> getSupportedInputModes() {
        return supportedInputModes;
    }

    /**
     * <p>
     * The allowed input mode, either FILE or PIPE.
     * </p>
     * <p>
     * In FILE mode, Amazon SageMaker copies the data from the input source onto
     * the local Amazon Elastic Block Store (Amazon EBS) volumes before starting
     * your training algorithm. This is the most commonly used input mode.
     * </p>
     * <p>
     * In PIPE mode, Amazon SageMaker streams input data from the source
     * directly to your algorithm without using the EBS volume.
     * </p>
     *
     * @param supportedInputModes <p>
     *            The allowed input mode, either FILE or PIPE.
     *            </p>
     *            <p>
     *            In FILE mode, Amazon SageMaker copies the data from the input
     *            source onto the local Amazon Elastic Block Store (Amazon EBS)
     *            volumes before starting your training algorithm. This is the
     *            most commonly used input mode.
     *            </p>
     *            <p>
     *            In PIPE mode, Amazon SageMaker streams input data from the
     *            source directly to your algorithm without using the EBS
     *            volume.
     *            </p>
     */
    public void setSupportedInputModes(java.util.Collection<String> supportedInputModes) {
        if (supportedInputModes == null) {
            this.supportedInputModes = null;
            return;
        }

        this.supportedInputModes = new java.util.ArrayList<String>(supportedInputModes);
    }

    /**
     * <p>
     * The allowed input mode, either FILE or PIPE.
     * </p>
     * <p>
     * In FILE mode, Amazon SageMaker copies the data from the input source onto
     * the local Amazon Elastic Block Store (Amazon EBS) volumes before starting
     * your training algorithm. This is the most commonly used input mode.
     * </p>
     * <p>
     * In PIPE mode, Amazon SageMaker streams input data from the source
     * directly to your algorithm without using the EBS volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedInputModes <p>
     *            The allowed input mode, either FILE or PIPE.
     *            </p>
     *            <p>
     *            In FILE mode, Amazon SageMaker copies the data from the input
     *            source onto the local Amazon Elastic Block Store (Amazon EBS)
     *            volumes before starting your training algorithm. This is the
     *            most commonly used input mode.
     *            </p>
     *            <p>
     *            In PIPE mode, Amazon SageMaker streams input data from the
     *            source directly to your algorithm without using the EBS
     *            volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelSpecification withSupportedInputModes(String... supportedInputModes) {
        if (getSupportedInputModes() == null) {
            this.supportedInputModes = new java.util.ArrayList<String>(supportedInputModes.length);
        }
        for (String value : supportedInputModes) {
            this.supportedInputModes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The allowed input mode, either FILE or PIPE.
     * </p>
     * <p>
     * In FILE mode, Amazon SageMaker copies the data from the input source onto
     * the local Amazon Elastic Block Store (Amazon EBS) volumes before starting
     * your training algorithm. This is the most commonly used input mode.
     * </p>
     * <p>
     * In PIPE mode, Amazon SageMaker streams input data from the source
     * directly to your algorithm without using the EBS volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedInputModes <p>
     *            The allowed input mode, either FILE or PIPE.
     *            </p>
     *            <p>
     *            In FILE mode, Amazon SageMaker copies the data from the input
     *            source onto the local Amazon Elastic Block Store (Amazon EBS)
     *            volumes before starting your training algorithm. This is the
     *            most commonly used input mode.
     *            </p>
     *            <p>
     *            In PIPE mode, Amazon SageMaker streams input data from the
     *            source directly to your algorithm without using the EBS
     *            volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelSpecification withSupportedInputModes(
            java.util.Collection<String> supportedInputModes) {
        setSupportedInputModes(supportedInputModes);
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getIsRequired() != null)
            sb.append("IsRequired: " + getIsRequired() + ",");
        if (getSupportedContentTypes() != null)
            sb.append("SupportedContentTypes: " + getSupportedContentTypes() + ",");
        if (getSupportedCompressionTypes() != null)
            sb.append("SupportedCompressionTypes: " + getSupportedCompressionTypes() + ",");
        if (getSupportedInputModes() != null)
            sb.append("SupportedInputModes: " + getSupportedInputModes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIsRequired() == null) ? 0 : getIsRequired().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportedContentTypes() == null) ? 0 : getSupportedContentTypes().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportedCompressionTypes() == null) ? 0 : getSupportedCompressionTypes()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSupportedInputModes() == null) ? 0 : getSupportedInputModes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelSpecification == false)
            return false;
        ChannelSpecification other = (ChannelSpecification) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIsRequired() == null ^ this.getIsRequired() == null)
            return false;
        if (other.getIsRequired() != null
                && other.getIsRequired().equals(this.getIsRequired()) == false)
            return false;
        if (other.getSupportedContentTypes() == null ^ this.getSupportedContentTypes() == null)
            return false;
        if (other.getSupportedContentTypes() != null
                && other.getSupportedContentTypes().equals(this.getSupportedContentTypes()) == false)
            return false;
        if (other.getSupportedCompressionTypes() == null
                ^ this.getSupportedCompressionTypes() == null)
            return false;
        if (other.getSupportedCompressionTypes() != null
                && other.getSupportedCompressionTypes().equals(this.getSupportedCompressionTypes()) == false)
            return false;
        if (other.getSupportedInputModes() == null ^ this.getSupportedInputModes() == null)
            return false;
        if (other.getSupportedInputModes() != null
                && other.getSupportedInputModes().equals(this.getSupportedInputModes()) == false)
            return false;
        return true;
    }
}
