/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

public class GetAdapterResult implements Serializable {
    /**
     * <p>
     * A string identifying the adapter that information has been retrieved for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     */
    private String adapterId;

    /**
     * <p>
     * The name of the requested adapter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     */
    private String adapterName;

    /**
     * <p>
     * The date and time the requested adapter was created at.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The description for the requested adapter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     */
    private String description;

    /**
     * <p>
     * List of the targeted feature types for the requested adapter.
     * </p>
     */
    private java.util.List<String> featureTypes;

    /**
     * <p>
     * Binary value indicating if the adapter is being automatically updated or
     * not.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String autoUpdate;

    /**
     * <p>
     * A set of tags (key-value pairs) associated with the adapter that has been
     * retrieved.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A string identifying the adapter that information has been retrieved for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @return <p>
     *         A string identifying the adapter that information has been
     *         retrieved for.
     *         </p>
     */
    public String getAdapterId() {
        return adapterId;
    }

    /**
     * <p>
     * A string identifying the adapter that information has been retrieved for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @param adapterId <p>
     *            A string identifying the adapter that information has been
     *            retrieved for.
     *            </p>
     */
    public void setAdapterId(String adapterId) {
        this.adapterId = adapterId;
    }

    /**
     * <p>
     * A string identifying the adapter that information has been retrieved for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @param adapterId <p>
     *            A string identifying the adapter that information has been
     *            retrieved for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAdapterResult withAdapterId(String adapterId) {
        this.adapterId = adapterId;
        return this;
    }

    /**
     * <p>
     * The name of the requested adapter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     *
     * @return <p>
     *         The name of the requested adapter.
     *         </p>
     */
    public String getAdapterName() {
        return adapterName;
    }

    /**
     * <p>
     * The name of the requested adapter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     *
     * @param adapterName <p>
     *            The name of the requested adapter.
     *            </p>
     */
    public void setAdapterName(String adapterName) {
        this.adapterName = adapterName;
    }

    /**
     * <p>
     * The name of the requested adapter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     *
     * @param adapterName <p>
     *            The name of the requested adapter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAdapterResult withAdapterName(String adapterName) {
        this.adapterName = adapterName;
        return this;
    }

    /**
     * <p>
     * The date and time the requested adapter was created at.
     * </p>
     *
     * @return <p>
     *         The date and time the requested adapter was created at.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The date and time the requested adapter was created at.
     * </p>
     *
     * @param creationTime <p>
     *            The date and time the requested adapter was created at.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time the requested adapter was created at.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The date and time the requested adapter was created at.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAdapterResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The description for the requested adapter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     *
     * @return <p>
     *         The description for the requested adapter.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description for the requested adapter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     *
     * @param description <p>
     *            The description for the requested adapter.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the requested adapter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     *
     * @param description <p>
     *            The description for the requested adapter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAdapterResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * List of the targeted feature types for the requested adapter.
     * </p>
     *
     * @return <p>
     *         List of the targeted feature types for the requested adapter.
     *         </p>
     */
    public java.util.List<String> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * <p>
     * List of the targeted feature types for the requested adapter.
     * </p>
     *
     * @param featureTypes <p>
     *            List of the targeted feature types for the requested adapter.
     *            </p>
     */
    public void setFeatureTypes(java.util.Collection<String> featureTypes) {
        if (featureTypes == null) {
            this.featureTypes = null;
            return;
        }

        this.featureTypes = new java.util.ArrayList<String>(featureTypes);
    }

    /**
     * <p>
     * List of the targeted feature types for the requested adapter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureTypes <p>
     *            List of the targeted feature types for the requested adapter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAdapterResult withFeatureTypes(String... featureTypes) {
        if (getFeatureTypes() == null) {
            this.featureTypes = new java.util.ArrayList<String>(featureTypes.length);
        }
        for (String value : featureTypes) {
            this.featureTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of the targeted feature types for the requested adapter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureTypes <p>
     *            List of the targeted feature types for the requested adapter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAdapterResult withFeatureTypes(java.util.Collection<String> featureTypes) {
        setFeatureTypes(featureTypes);
        return this;
    }

    /**
     * <p>
     * Binary value indicating if the adapter is being automatically updated or
     * not.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         Binary value indicating if the adapter is being automatically
     *         updated or not.
     *         </p>
     * @see AutoUpdate
     */
    public String getAutoUpdate() {
        return autoUpdate;
    }

    /**
     * <p>
     * Binary value indicating if the adapter is being automatically updated or
     * not.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            Binary value indicating if the adapter is being automatically
     *            updated or not.
     *            </p>
     * @see AutoUpdate
     */
    public void setAutoUpdate(String autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    /**
     * <p>
     * Binary value indicating if the adapter is being automatically updated or
     * not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            Binary value indicating if the adapter is being automatically
     *            updated or not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoUpdate
     */
    public GetAdapterResult withAutoUpdate(String autoUpdate) {
        this.autoUpdate = autoUpdate;
        return this;
    }

    /**
     * <p>
     * Binary value indicating if the adapter is being automatically updated or
     * not.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            Binary value indicating if the adapter is being automatically
     *            updated or not.
     *            </p>
     * @see AutoUpdate
     */
    public void setAutoUpdate(AutoUpdate autoUpdate) {
        this.autoUpdate = autoUpdate.toString();
    }

    /**
     * <p>
     * Binary value indicating if the adapter is being automatically updated or
     * not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            Binary value indicating if the adapter is being automatically
     *            updated or not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoUpdate
     */
    public GetAdapterResult withAutoUpdate(AutoUpdate autoUpdate) {
        this.autoUpdate = autoUpdate.toString();
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) associated with the adapter that has been
     * retrieved.
     * </p>
     *
     * @return <p>
     *         A set of tags (key-value pairs) associated with the adapter that
     *         has been retrieved.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) associated with the adapter that has been
     * retrieved.
     * </p>
     *
     * @param tags <p>
     *            A set of tags (key-value pairs) associated with the adapter
     *            that has been retrieved.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) associated with the adapter that has been
     * retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A set of tags (key-value pairs) associated with the adapter
     *            that has been retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAdapterResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) associated with the adapter that has been
     * retrieved.
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
    public GetAdapterResult addTagsEntry(String key, String value) {
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
    public GetAdapterResult clearTagsEntries() {
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
        if (getAdapterId() != null)
            sb.append("AdapterId: " + getAdapterId() + ",");
        if (getAdapterName() != null)
            sb.append("AdapterName: " + getAdapterName() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getFeatureTypes() != null)
            sb.append("FeatureTypes: " + getFeatureTypes() + ",");
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

        hashCode = prime * hashCode + ((getAdapterId() == null) ? 0 : getAdapterId().hashCode());
        hashCode = prime * hashCode
                + ((getAdapterName() == null) ? 0 : getAdapterName().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getFeatureTypes() == null) ? 0 : getFeatureTypes().hashCode());
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

        if (obj instanceof GetAdapterResult == false)
            return false;
        GetAdapterResult other = (GetAdapterResult) obj;

        if (other.getAdapterId() == null ^ this.getAdapterId() == null)
            return false;
        if (other.getAdapterId() != null
                && other.getAdapterId().equals(this.getAdapterId()) == false)
            return false;
        if (other.getAdapterName() == null ^ this.getAdapterName() == null)
            return false;
        if (other.getAdapterName() != null
                && other.getAdapterName().equals(this.getAdapterName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFeatureTypes() == null ^ this.getFeatureTypes() == null)
            return false;
        if (other.getFeatureTypes() != null
                && other.getFeatureTypes().equals(this.getFeatureTypes()) == false)
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
