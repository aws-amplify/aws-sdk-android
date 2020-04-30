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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an input.
 * </p>
 */
public class CreateInputRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name you want to give to the input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     */
    private String inputName;

    /**
     * <p>
     * A brief description of the input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     */
    private String inputDescription;

    /**
     * <p>
     * The definition of the input.
     * </p>
     */
    private InputDefinition inputDefinition;

    /**
     * <p>
     * Metadata that can be used to manage the input.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name you want to give to the input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @return <p>
     *         The name you want to give to the input.
     *         </p>
     */
    public String getInputName() {
        return inputName;
    }

    /**
     * <p>
     * The name you want to give to the input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @param inputName <p>
     *            The name you want to give to the input.
     *            </p>
     */
    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    /**
     * <p>
     * The name you want to give to the input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @param inputName <p>
     *            The name you want to give to the input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputRequest withInputName(String inputName) {
        this.inputName = inputName;
        return this;
    }

    /**
     * <p>
     * A brief description of the input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @return <p>
     *         A brief description of the input.
     *         </p>
     */
    public String getInputDescription() {
        return inputDescription;
    }

    /**
     * <p>
     * A brief description of the input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param inputDescription <p>
     *            A brief description of the input.
     *            </p>
     */
    public void setInputDescription(String inputDescription) {
        this.inputDescription = inputDescription;
    }

    /**
     * <p>
     * A brief description of the input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param inputDescription <p>
     *            A brief description of the input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputRequest withInputDescription(String inputDescription) {
        this.inputDescription = inputDescription;
        return this;
    }

    /**
     * <p>
     * The definition of the input.
     * </p>
     *
     * @return <p>
     *         The definition of the input.
     *         </p>
     */
    public InputDefinition getInputDefinition() {
        return inputDefinition;
    }

    /**
     * <p>
     * The definition of the input.
     * </p>
     *
     * @param inputDefinition <p>
     *            The definition of the input.
     *            </p>
     */
    public void setInputDefinition(InputDefinition inputDefinition) {
        this.inputDefinition = inputDefinition;
    }

    /**
     * <p>
     * The definition of the input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDefinition <p>
     *            The definition of the input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputRequest withInputDefinition(InputDefinition inputDefinition) {
        this.inputDefinition = inputDefinition;
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the input.
     * </p>
     *
     * @return <p>
     *         Metadata that can be used to manage the input.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that can be used to manage the input.
     * </p>
     *
     * @param tags <p>
     *            Metadata that can be used to manage the input.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata that can be used to manage the input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata that can be used to manage the input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata that can be used to manage the input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getInputName() != null)
            sb.append("inputName: " + getInputName() + ",");
        if (getInputDescription() != null)
            sb.append("inputDescription: " + getInputDescription() + ",");
        if (getInputDefinition() != null)
            sb.append("inputDefinition: " + getInputDefinition() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputName() == null) ? 0 : getInputName().hashCode());
        hashCode = prime * hashCode
                + ((getInputDescription() == null) ? 0 : getInputDescription().hashCode());
        hashCode = prime * hashCode
                + ((getInputDefinition() == null) ? 0 : getInputDefinition().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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

        if (other.getInputName() == null ^ this.getInputName() == null)
            return false;
        if (other.getInputName() != null
                && other.getInputName().equals(this.getInputName()) == false)
            return false;
        if (other.getInputDescription() == null ^ this.getInputDescription() == null)
            return false;
        if (other.getInputDescription() != null
                && other.getInputDescription().equals(this.getInputDescription()) == false)
            return false;
        if (other.getInputDefinition() == null ^ this.getInputDefinition() == null)
            return false;
        if (other.getInputDefinition() != null
                && other.getInputDefinition().equals(this.getInputDefinition()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
