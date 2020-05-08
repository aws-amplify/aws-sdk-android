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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Defines the settings you will use for the human review workflow user
 * interface. Reviewers will see a three-panel interface with an instruction
 * area, the item to review, and an input area.
 * </p>
 */
public class CreateHumanTaskUiRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the user interface you are creating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     */
    private String humanTaskUiName;

    /**
     * <p>
     * The Liquid template for the worker user interface.
     * </p>
     */
    private UiTemplate uiTemplate;

    /**
     * <p>
     * An array of key-value pairs that contain metadata to help you categorize
     * and organize a human review workflow user interface. Each tag consists of
     * a key and a value, both of which you define.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the user interface you are creating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @return <p>
     *         The name of the user interface you are creating.
     *         </p>
     */
    public String getHumanTaskUiName() {
        return humanTaskUiName;
    }

    /**
     * <p>
     * The name of the user interface you are creating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @param humanTaskUiName <p>
     *            The name of the user interface you are creating.
     *            </p>
     */
    public void setHumanTaskUiName(String humanTaskUiName) {
        this.humanTaskUiName = humanTaskUiName;
    }

    /**
     * <p>
     * The name of the user interface you are creating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @param humanTaskUiName <p>
     *            The name of the user interface you are creating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHumanTaskUiRequest withHumanTaskUiName(String humanTaskUiName) {
        this.humanTaskUiName = humanTaskUiName;
        return this;
    }

    /**
     * <p>
     * The Liquid template for the worker user interface.
     * </p>
     *
     * @return <p>
     *         The Liquid template for the worker user interface.
     *         </p>
     */
    public UiTemplate getUiTemplate() {
        return uiTemplate;
    }

    /**
     * <p>
     * The Liquid template for the worker user interface.
     * </p>
     *
     * @param uiTemplate <p>
     *            The Liquid template for the worker user interface.
     *            </p>
     */
    public void setUiTemplate(UiTemplate uiTemplate) {
        this.uiTemplate = uiTemplate;
    }

    /**
     * <p>
     * The Liquid template for the worker user interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uiTemplate <p>
     *            The Liquid template for the worker user interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHumanTaskUiRequest withUiTemplate(UiTemplate uiTemplate) {
        this.uiTemplate = uiTemplate;
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs that contain metadata to help you categorize
     * and organize a human review workflow user interface. Each tag consists of
     * a key and a value, both of which you define.
     * </p>
     *
     * @return <p>
     *         An array of key-value pairs that contain metadata to help you
     *         categorize and organize a human review workflow user interface.
     *         Each tag consists of a key and a value, both of which you define.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs that contain metadata to help you categorize
     * and organize a human review workflow user interface. Each tag consists of
     * a key and a value, both of which you define.
     * </p>
     *
     * @param tags <p>
     *            An array of key-value pairs that contain metadata to help you
     *            categorize and organize a human review workflow user
     *            interface. Each tag consists of a key and a value, both of
     *            which you define.
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
     * An array of key-value pairs that contain metadata to help you categorize
     * and organize a human review workflow user interface. Each tag consists of
     * a key and a value, both of which you define.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array of key-value pairs that contain metadata to help you
     *            categorize and organize a human review workflow user
     *            interface. Each tag consists of a key and a value, both of
     *            which you define.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHumanTaskUiRequest withTags(Tag... tags) {
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
     * An array of key-value pairs that contain metadata to help you categorize
     * and organize a human review workflow user interface. Each tag consists of
     * a key and a value, both of which you define.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array of key-value pairs that contain metadata to help you
     *            categorize and organize a human review workflow user
     *            interface. Each tag consists of a key and a value, both of
     *            which you define.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHumanTaskUiRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getHumanTaskUiName() != null)
            sb.append("HumanTaskUiName: " + getHumanTaskUiName() + ",");
        if (getUiTemplate() != null)
            sb.append("UiTemplate: " + getUiTemplate() + ",");
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
                + ((getHumanTaskUiName() == null) ? 0 : getHumanTaskUiName().hashCode());
        hashCode = prime * hashCode + ((getUiTemplate() == null) ? 0 : getUiTemplate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHumanTaskUiRequest == false)
            return false;
        CreateHumanTaskUiRequest other = (CreateHumanTaskUiRequest) obj;

        if (other.getHumanTaskUiName() == null ^ this.getHumanTaskUiName() == null)
            return false;
        if (other.getHumanTaskUiName() != null
                && other.getHumanTaskUiName().equals(this.getHumanTaskUiName()) == false)
            return false;
        if (other.getUiTemplate() == null ^ this.getUiTemplate() == null)
            return false;
        if (other.getUiTemplate() != null
                && other.getUiTemplate().equals(this.getUiTemplate()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
