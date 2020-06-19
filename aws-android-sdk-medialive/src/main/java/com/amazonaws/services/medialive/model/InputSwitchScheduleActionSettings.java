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
 * Settings for the "switch input" action: to switch from ingesting one input to
 * ingesting another input.
 */
public class InputSwitchScheduleActionSettings implements Serializable {
    /**
     * The name of the input attachment (not the name of the input!) to switch
     * to. The name is specified in the channel configuration.
     */
    private String inputAttachmentNameReference;

    /**
     * Settings to let you create a clip of the file input, in order to set up
     * the input to ingest only a portion of the file.
     */
    private InputClippingSettings inputClippingSettings;

    /**
     * The value for the variable portion of the URL for the dynamic input, for
     * this instance of the input. Each time you use the same dynamic input in
     * an input switch action, you can provide a different value, in order to
     * connect the input to a different content source.
     */
    private java.util.List<String> urlPath;

    /**
     * The name of the input attachment (not the name of the input!) to switch
     * to. The name is specified in the channel configuration.
     *
     * @return The name of the input attachment (not the name of the input!) to
     *         switch to. The name is specified in the channel configuration.
     */
    public String getInputAttachmentNameReference() {
        return inputAttachmentNameReference;
    }

    /**
     * The name of the input attachment (not the name of the input!) to switch
     * to. The name is specified in the channel configuration.
     *
     * @param inputAttachmentNameReference The name of the input attachment (not
     *            the name of the input!) to switch to. The name is specified in
     *            the channel configuration.
     */
    public void setInputAttachmentNameReference(String inputAttachmentNameReference) {
        this.inputAttachmentNameReference = inputAttachmentNameReference;
    }

    /**
     * The name of the input attachment (not the name of the input!) to switch
     * to. The name is specified in the channel configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputAttachmentNameReference The name of the input attachment (not
     *            the name of the input!) to switch to. The name is specified in
     *            the channel configuration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputSwitchScheduleActionSettings withInputAttachmentNameReference(
            String inputAttachmentNameReference) {
        this.inputAttachmentNameReference = inputAttachmentNameReference;
        return this;
    }

    /**
     * Settings to let you create a clip of the file input, in order to set up
     * the input to ingest only a portion of the file.
     *
     * @return Settings to let you create a clip of the file input, in order to
     *         set up the input to ingest only a portion of the file.
     */
    public InputClippingSettings getInputClippingSettings() {
        return inputClippingSettings;
    }

    /**
     * Settings to let you create a clip of the file input, in order to set up
     * the input to ingest only a portion of the file.
     *
     * @param inputClippingSettings Settings to let you create a clip of the
     *            file input, in order to set up the input to ingest only a
     *            portion of the file.
     */
    public void setInputClippingSettings(InputClippingSettings inputClippingSettings) {
        this.inputClippingSettings = inputClippingSettings;
    }

    /**
     * Settings to let you create a clip of the file input, in order to set up
     * the input to ingest only a portion of the file.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputClippingSettings Settings to let you create a clip of the
     *            file input, in order to set up the input to ingest only a
     *            portion of the file.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputSwitchScheduleActionSettings withInputClippingSettings(
            InputClippingSettings inputClippingSettings) {
        this.inputClippingSettings = inputClippingSettings;
        return this;
    }

    /**
     * The value for the variable portion of the URL for the dynamic input, for
     * this instance of the input. Each time you use the same dynamic input in
     * an input switch action, you can provide a different value, in order to
     * connect the input to a different content source.
     *
     * @return The value for the variable portion of the URL for the dynamic
     *         input, for this instance of the input. Each time you use the same
     *         dynamic input in an input switch action, you can provide a
     *         different value, in order to connect the input to a different
     *         content source.
     */
    public java.util.List<String> getUrlPath() {
        return urlPath;
    }

    /**
     * The value for the variable portion of the URL for the dynamic input, for
     * this instance of the input. Each time you use the same dynamic input in
     * an input switch action, you can provide a different value, in order to
     * connect the input to a different content source.
     *
     * @param urlPath The value for the variable portion of the URL for the
     *            dynamic input, for this instance of the input. Each time you
     *            use the same dynamic input in an input switch action, you can
     *            provide a different value, in order to connect the input to a
     *            different content source.
     */
    public void setUrlPath(java.util.Collection<String> urlPath) {
        if (urlPath == null) {
            this.urlPath = null;
            return;
        }

        this.urlPath = new java.util.ArrayList<String>(urlPath);
    }

    /**
     * The value for the variable portion of the URL for the dynamic input, for
     * this instance of the input. Each time you use the same dynamic input in
     * an input switch action, you can provide a different value, in order to
     * connect the input to a different content source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param urlPath The value for the variable portion of the URL for the
     *            dynamic input, for this instance of the input. Each time you
     *            use the same dynamic input in an input switch action, you can
     *            provide a different value, in order to connect the input to a
     *            different content source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputSwitchScheduleActionSettings withUrlPath(String... urlPath) {
        if (getUrlPath() == null) {
            this.urlPath = new java.util.ArrayList<String>(urlPath.length);
        }
        for (String value : urlPath) {
            this.urlPath.add(value);
        }
        return this;
    }

    /**
     * The value for the variable portion of the URL for the dynamic input, for
     * this instance of the input. Each time you use the same dynamic input in
     * an input switch action, you can provide a different value, in order to
     * connect the input to a different content source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param urlPath The value for the variable portion of the URL for the
     *            dynamic input, for this instance of the input. Each time you
     *            use the same dynamic input in an input switch action, you can
     *            provide a different value, in order to connect the input to a
     *            different content source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputSwitchScheduleActionSettings withUrlPath(java.util.Collection<String> urlPath) {
        setUrlPath(urlPath);
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
        if (getInputAttachmentNameReference() != null)
            sb.append("InputAttachmentNameReference: " + getInputAttachmentNameReference() + ",");
        if (getInputClippingSettings() != null)
            sb.append("InputClippingSettings: " + getInputClippingSettings() + ",");
        if (getUrlPath() != null)
            sb.append("UrlPath: " + getUrlPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getInputAttachmentNameReference() == null) ? 0
                        : getInputAttachmentNameReference().hashCode());
        hashCode = prime
                * hashCode
                + ((getInputClippingSettings() == null) ? 0 : getInputClippingSettings().hashCode());
        hashCode = prime * hashCode + ((getUrlPath() == null) ? 0 : getUrlPath().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputSwitchScheduleActionSettings == false)
            return false;
        InputSwitchScheduleActionSettings other = (InputSwitchScheduleActionSettings) obj;

        if (other.getInputAttachmentNameReference() == null
                ^ this.getInputAttachmentNameReference() == null)
            return false;
        if (other.getInputAttachmentNameReference() != null
                && other.getInputAttachmentNameReference().equals(
                        this.getInputAttachmentNameReference()) == false)
            return false;
        if (other.getInputClippingSettings() == null ^ this.getInputClippingSettings() == null)
            return false;
        if (other.getInputClippingSettings() != null
                && other.getInputClippingSettings().equals(this.getInputClippingSettings()) == false)
            return false;
        if (other.getUrlPath() == null ^ this.getUrlPath() == null)
            return false;
        if (other.getUrlPath() != null && other.getUrlPath().equals(this.getUrlPath()) == false)
            return false;
        return true;
    }
}
