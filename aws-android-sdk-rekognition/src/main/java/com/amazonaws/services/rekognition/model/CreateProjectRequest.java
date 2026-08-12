/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new Amazon Rekognition project. A project is a group of resources
 * (datasets, model versions) that you use to create and manage a Amazon
 * Rekognition Custom Labels Model or custom adapter. You can specify a feature
 * to create the project with, if no feature is specified then Custom Labels is
 * used by default. For adapters, you can also choose whether or not to have the
 * project auto update by using the AutoUpdate argument. This operation requires
 * permissions to perform the <code>rekognition:CreateProject</code> action.
 * </p>
 */
public class CreateProjectRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the project to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     */
    private String projectName;

    /**
     * <p>
     * Specifies feature that is being customized. If no value is provided
     * CUSTOM_LABELS is used as a default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTENT_MODERATION, CUSTOM_LABELS
     */
    private String feature;

    /**
     * <p>
     * Specifies whether automatic retraining should be attempted for the
     * versions of the project. Automatic retraining is done as a best effort.
     * Required argument for Content Moderation. Applicable only to adapters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String autoUpdate;

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the project.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the project to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @return <p>
     *         The name of the project to create.
     *         </p>
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * <p>
     * The name of the project to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param projectName <p>
     *            The name of the project to create.
     *            </p>
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param projectName <p>
     *            The name of the project to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectRequest withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * <p>
     * Specifies feature that is being customized. If no value is provided
     * CUSTOM_LABELS is used as a default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTENT_MODERATION, CUSTOM_LABELS
     *
     * @return <p>
     *         Specifies feature that is being customized. If no value is
     *         provided CUSTOM_LABELS is used as a default.
     *         </p>
     * @see CustomizationFeature
     */
    public String getFeature() {
        return feature;
    }

    /**
     * <p>
     * Specifies feature that is being customized. If no value is provided
     * CUSTOM_LABELS is used as a default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTENT_MODERATION, CUSTOM_LABELS
     *
     * @param feature <p>
     *            Specifies feature that is being customized. If no value is
     *            provided CUSTOM_LABELS is used as a default.
     *            </p>
     * @see CustomizationFeature
     */
    public void setFeature(String feature) {
        this.feature = feature;
    }

    /**
     * <p>
     * Specifies feature that is being customized. If no value is provided
     * CUSTOM_LABELS is used as a default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTENT_MODERATION, CUSTOM_LABELS
     *
     * @param feature <p>
     *            Specifies feature that is being customized. If no value is
     *            provided CUSTOM_LABELS is used as a default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CustomizationFeature
     */
    public CreateProjectRequest withFeature(String feature) {
        this.feature = feature;
        return this;
    }

    /**
     * <p>
     * Specifies feature that is being customized. If no value is provided
     * CUSTOM_LABELS is used as a default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTENT_MODERATION, CUSTOM_LABELS
     *
     * @param feature <p>
     *            Specifies feature that is being customized. If no value is
     *            provided CUSTOM_LABELS is used as a default.
     *            </p>
     * @see CustomizationFeature
     */
    public void setFeature(CustomizationFeature feature) {
        this.feature = feature.toString();
    }

    /**
     * <p>
     * Specifies feature that is being customized. If no value is provided
     * CUSTOM_LABELS is used as a default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTENT_MODERATION, CUSTOM_LABELS
     *
     * @param feature <p>
     *            Specifies feature that is being customized. If no value is
     *            provided CUSTOM_LABELS is used as a default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CustomizationFeature
     */
    public CreateProjectRequest withFeature(CustomizationFeature feature) {
        this.feature = feature.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether automatic retraining should be attempted for the
     * versions of the project. Automatic retraining is done as a best effort.
     * Required argument for Content Moderation. Applicable only to adapters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         Specifies whether automatic retraining should be attempted for
     *         the versions of the project. Automatic retraining is done as a
     *         best effort. Required argument for Content Moderation. Applicable
     *         only to adapters.
     *         </p>
     * @see ProjectAutoUpdate
     */
    public String getAutoUpdate() {
        return autoUpdate;
    }

    /**
     * <p>
     * Specifies whether automatic retraining should be attempted for the
     * versions of the project. Automatic retraining is done as a best effort.
     * Required argument for Content Moderation. Applicable only to adapters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            Specifies whether automatic retraining should be attempted for
     *            the versions of the project. Automatic retraining is done as a
     *            best effort. Required argument for Content Moderation.
     *            Applicable only to adapters.
     *            </p>
     * @see ProjectAutoUpdate
     */
    public void setAutoUpdate(String autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    /**
     * <p>
     * Specifies whether automatic retraining should be attempted for the
     * versions of the project. Automatic retraining is done as a best effort.
     * Required argument for Content Moderation. Applicable only to adapters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            Specifies whether automatic retraining should be attempted for
     *            the versions of the project. Automatic retraining is done as a
     *            best effort. Required argument for Content Moderation.
     *            Applicable only to adapters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProjectAutoUpdate
     */
    public CreateProjectRequest withAutoUpdate(String autoUpdate) {
        this.autoUpdate = autoUpdate;
        return this;
    }

    /**
     * <p>
     * Specifies whether automatic retraining should be attempted for the
     * versions of the project. Automatic retraining is done as a best effort.
     * Required argument for Content Moderation. Applicable only to adapters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            Specifies whether automatic retraining should be attempted for
     *            the versions of the project. Automatic retraining is done as a
     *            best effort. Required argument for Content Moderation.
     *            Applicable only to adapters.
     *            </p>
     * @see ProjectAutoUpdate
     */
    public void setAutoUpdate(ProjectAutoUpdate autoUpdate) {
        this.autoUpdate = autoUpdate.toString();
    }

    /**
     * <p>
     * Specifies whether automatic retraining should be attempted for the
     * versions of the project. Automatic retraining is done as a best effort.
     * Required argument for Content Moderation. Applicable only to adapters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            Specifies whether automatic retraining should be attempted for
     *            the versions of the project. Automatic retraining is done as a
     *            best effort. Required argument for Content Moderation.
     *            Applicable only to adapters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProjectAutoUpdate
     */
    public CreateProjectRequest withAutoUpdate(ProjectAutoUpdate autoUpdate) {
        this.autoUpdate = autoUpdate.toString();
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the project.
     * </p>
     *
     * @return <p>
     *         A set of tags (key-value pairs) that you want to attach to the
     *         project.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the project.
     * </p>
     *
     * @param tags <p>
     *            A set of tags (key-value pairs) that you want to attach to the
     *            project.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A set of tags (key-value pairs) that you want to attach to the
     *            project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the project.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectRequest addTagsEntry(String key, String value) {
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
    public CreateProjectRequest clearTagsEntries() {
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
        if (getProjectName() != null)
            sb.append("ProjectName: " + getProjectName() + ",");
        if (getFeature() != null)
            sb.append("Feature: " + getFeature() + ",");
        if (getAutoUpdate() != null)
            sb.append("AutoUpdate: " + getAutoUpdate() + ",");
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
                + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getFeature() == null) ? 0 : getFeature().hashCode());
        hashCode = prime * hashCode + ((getAutoUpdate() == null) ? 0 : getAutoUpdate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProjectRequest == false)
            return false;
        CreateProjectRequest other = (CreateProjectRequest) obj;

        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null
                && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getFeature() == null ^ this.getFeature() == null)
            return false;
        if (other.getFeature() != null && other.getFeature().equals(this.getFeature()) == false)
            return false;
        if (other.getAutoUpdate() == null ^ this.getAutoUpdate() == null)
            return false;
        if (other.getAutoUpdate() != null
                && other.getAutoUpdate().equals(this.getAutoUpdate()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
