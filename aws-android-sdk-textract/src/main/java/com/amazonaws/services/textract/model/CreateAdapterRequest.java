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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an adapter, which can be fine-tuned for enhanced performance on user
 * provided documents. Takes an AdapterName and FeatureType. Currently the only
 * supported feature type is <code>QUERIES</code>. You can also provide a
 * Description, Tags, and a ClientRequestToken. You can choose whether or not
 * the adapter should be AutoUpdated with the AutoUpdate argument. By default,
 * AutoUpdate is set to DISABLED.
 * </p>
 */
public class CreateAdapterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name to be assigned to the adapter being created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     */
    private String adapterName;

    /**
     * <p>
     * Idempotent token is used to recognize the request. If the same token is
     * used with multiple CreateAdapter requests, the same session is returned.
     * This token is employed to avoid unintentionally creating the same session
     * multiple times.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The description to be assigned to the adapter being created.
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
     * The type of feature that the adapter is being trained on. Currrenly,
     * supported feature types are: <code>QUERIES</code>
     * </p>
     */
    private java.util.List<String> featureTypes;

    /**
     * <p>
     * Controls whether or not the adapter should automatically update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String autoUpdate;

    /**
     * <p>
     * A list of tags to be added to the adapter.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name to be assigned to the adapter being created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     *
     * @return <p>
     *         The name to be assigned to the adapter being created.
     *         </p>
     */
    public String getAdapterName() {
        return adapterName;
    }

    /**
     * <p>
     * The name to be assigned to the adapter being created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     *
     * @param adapterName <p>
     *            The name to be assigned to the adapter being created.
     *            </p>
     */
    public void setAdapterName(String adapterName) {
        this.adapterName = adapterName;
    }

    /**
     * <p>
     * The name to be assigned to the adapter being created.
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
     *            The name to be assigned to the adapter being created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAdapterRequest withAdapterName(String adapterName) {
        this.adapterName = adapterName;
        return this;
    }

    /**
     * <p>
     * Idempotent token is used to recognize the request. If the same token is
     * used with multiple CreateAdapter requests, the same session is returned.
     * This token is employed to avoid unintentionally creating the same session
     * multiple times.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         Idempotent token is used to recognize the request. If the same
     *         token is used with multiple CreateAdapter requests, the same
     *         session is returned. This token is employed to avoid
     *         unintentionally creating the same session multiple times.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token is used to recognize the request. If the same token is
     * used with multiple CreateAdapter requests, the same session is returned.
     * This token is employed to avoid unintentionally creating the same session
     * multiple times.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Idempotent token is used to recognize the request. If the same
     *            token is used with multiple CreateAdapter requests, the same
     *            session is returned. This token is employed to avoid
     *            unintentionally creating the same session multiple times.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token is used to recognize the request. If the same token is
     * used with multiple CreateAdapter requests, the same session is returned.
     * This token is employed to avoid unintentionally creating the same session
     * multiple times.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Idempotent token is used to recognize the request. If the same
     *            token is used with multiple CreateAdapter requests, the same
     *            session is returned. This token is employed to avoid
     *            unintentionally creating the same session multiple times.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAdapterRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * The description to be assigned to the adapter being created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     *
     * @return <p>
     *         The description to be assigned to the adapter being created.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description to be assigned to the adapter being created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     *
     * @param description <p>
     *            The description to be assigned to the adapter being created.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description to be assigned to the adapter being created.
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
     *            The description to be assigned to the adapter being created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAdapterRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The type of feature that the adapter is being trained on. Currrenly,
     * supported feature types are: <code>QUERIES</code>
     * </p>
     *
     * @return <p>
     *         The type of feature that the adapter is being trained on.
     *         Currrenly, supported feature types are: <code>QUERIES</code>
     *         </p>
     */
    public java.util.List<String> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * <p>
     * The type of feature that the adapter is being trained on. Currrenly,
     * supported feature types are: <code>QUERIES</code>
     * </p>
     *
     * @param featureTypes <p>
     *            The type of feature that the adapter is being trained on.
     *            Currrenly, supported feature types are: <code>QUERIES</code>
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
     * The type of feature that the adapter is being trained on. Currrenly,
     * supported feature types are: <code>QUERIES</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureTypes <p>
     *            The type of feature that the adapter is being trained on.
     *            Currrenly, supported feature types are: <code>QUERIES</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAdapterRequest withFeatureTypes(String... featureTypes) {
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
     * The type of feature that the adapter is being trained on. Currrenly,
     * supported feature types are: <code>QUERIES</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureTypes <p>
     *            The type of feature that the adapter is being trained on.
     *            Currrenly, supported feature types are: <code>QUERIES</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAdapterRequest withFeatureTypes(java.util.Collection<String> featureTypes) {
        setFeatureTypes(featureTypes);
        return this;
    }

    /**
     * <p>
     * Controls whether or not the adapter should automatically update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         Controls whether or not the adapter should automatically update.
     *         </p>
     * @see AutoUpdate
     */
    public String getAutoUpdate() {
        return autoUpdate;
    }

    /**
     * <p>
     * Controls whether or not the adapter should automatically update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            Controls whether or not the adapter should automatically
     *            update.
     *            </p>
     * @see AutoUpdate
     */
    public void setAutoUpdate(String autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    /**
     * <p>
     * Controls whether or not the adapter should automatically update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            Controls whether or not the adapter should automatically
     *            update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoUpdate
     */
    public CreateAdapterRequest withAutoUpdate(String autoUpdate) {
        this.autoUpdate = autoUpdate;
        return this;
    }

    /**
     * <p>
     * Controls whether or not the adapter should automatically update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            Controls whether or not the adapter should automatically
     *            update.
     *            </p>
     * @see AutoUpdate
     */
    public void setAutoUpdate(AutoUpdate autoUpdate) {
        this.autoUpdate = autoUpdate.toString();
    }

    /**
     * <p>
     * Controls whether or not the adapter should automatically update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            Controls whether or not the adapter should automatically
     *            update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoUpdate
     */
    public CreateAdapterRequest withAutoUpdate(AutoUpdate autoUpdate) {
        this.autoUpdate = autoUpdate.toString();
        return this;
    }

    /**
     * <p>
     * A list of tags to be added to the adapter.
     * </p>
     *
     * @return <p>
     *         A list of tags to be added to the adapter.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to be added to the adapter.
     * </p>
     *
     * @param tags <p>
     *            A list of tags to be added to the adapter.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags to be added to the adapter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to be added to the adapter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAdapterRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A list of tags to be added to the adapter.
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
    public CreateAdapterRequest addTagsEntry(String key, String value) {
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
    public CreateAdapterRequest clearTagsEntries() {
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
        if (getAdapterName() != null)
            sb.append("AdapterName: " + getAdapterName() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
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

        hashCode = prime * hashCode
                + ((getAdapterName() == null) ? 0 : getAdapterName().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
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

        if (obj instanceof CreateAdapterRequest == false)
            return false;
        CreateAdapterRequest other = (CreateAdapterRequest) obj;

        if (other.getAdapterName() == null ^ this.getAdapterName() == null)
            return false;
        if (other.getAdapterName() != null
                && other.getAdapterName().equals(this.getAdapterName()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
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
