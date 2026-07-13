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

public class UpdateAdapterResult implements Serializable {
    /**
     * <p>
     * A string containing a unique ID for the adapter that has been updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     */
    private String adapterId;

    /**
     * <p>
     * A string containing the name of the adapter that has been updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     */
    private String adapterName;

    /**
     * <p>
     * An object specifying the creation time of the the adapter that has been
     * updated.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * A string containing the description of the adapter that has been updated.
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
     * List of the targeted feature types for the updated adapter.
     * </p>
     */
    private java.util.List<String> featureTypes;

    /**
     * <p>
     * The auto-update status of the adapter that has been updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String autoUpdate;

    /**
     * <p>
     * A string containing a unique ID for the adapter that has been updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @return <p>
     *         A string containing a unique ID for the adapter that has been
     *         updated.
     *         </p>
     */
    public String getAdapterId() {
        return adapterId;
    }

    /**
     * <p>
     * A string containing a unique ID for the adapter that has been updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @param adapterId <p>
     *            A string containing a unique ID for the adapter that has been
     *            updated.
     *            </p>
     */
    public void setAdapterId(String adapterId) {
        this.adapterId = adapterId;
    }

    /**
     * <p>
     * A string containing a unique ID for the adapter that has been updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @param adapterId <p>
     *            A string containing a unique ID for the adapter that has been
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAdapterResult withAdapterId(String adapterId) {
        this.adapterId = adapterId;
        return this;
    }

    /**
     * <p>
     * A string containing the name of the adapter that has been updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     *
     * @return <p>
     *         A string containing the name of the adapter that has been
     *         updated.
     *         </p>
     */
    public String getAdapterName() {
        return adapterName;
    }

    /**
     * <p>
     * A string containing the name of the adapter that has been updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     *
     * @param adapterName <p>
     *            A string containing the name of the adapter that has been
     *            updated.
     *            </p>
     */
    public void setAdapterName(String adapterName) {
        this.adapterName = adapterName;
    }

    /**
     * <p>
     * A string containing the name of the adapter that has been updated.
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
     *            A string containing the name of the adapter that has been
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAdapterResult withAdapterName(String adapterName) {
        this.adapterName = adapterName;
        return this;
    }

    /**
     * <p>
     * An object specifying the creation time of the the adapter that has been
     * updated.
     * </p>
     *
     * @return <p>
     *         An object specifying the creation time of the the adapter that
     *         has been updated.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * An object specifying the creation time of the the adapter that has been
     * updated.
     * </p>
     *
     * @param creationTime <p>
     *            An object specifying the creation time of the the adapter that
     *            has been updated.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * An object specifying the creation time of the the adapter that has been
     * updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            An object specifying the creation time of the the adapter that
     *            has been updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAdapterResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * A string containing the description of the adapter that has been updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     *
     * @return <p>
     *         A string containing the description of the adapter that has been
     *         updated.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A string containing the description of the adapter that has been updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     *
     * @param description <p>
     *            A string containing the description of the adapter that has
     *            been updated.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A string containing the description of the adapter that has been updated.
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
     *            A string containing the description of the adapter that has
     *            been updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAdapterResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * List of the targeted feature types for the updated adapter.
     * </p>
     *
     * @return <p>
     *         List of the targeted feature types for the updated adapter.
     *         </p>
     */
    public java.util.List<String> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * <p>
     * List of the targeted feature types for the updated adapter.
     * </p>
     *
     * @param featureTypes <p>
     *            List of the targeted feature types for the updated adapter.
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
     * List of the targeted feature types for the updated adapter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureTypes <p>
     *            List of the targeted feature types for the updated adapter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAdapterResult withFeatureTypes(String... featureTypes) {
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
     * List of the targeted feature types for the updated adapter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureTypes <p>
     *            List of the targeted feature types for the updated adapter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAdapterResult withFeatureTypes(java.util.Collection<String> featureTypes) {
        setFeatureTypes(featureTypes);
        return this;
    }

    /**
     * <p>
     * The auto-update status of the adapter that has been updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         The auto-update status of the adapter that has been updated.
     *         </p>
     * @see AutoUpdate
     */
    public String getAutoUpdate() {
        return autoUpdate;
    }

    /**
     * <p>
     * The auto-update status of the adapter that has been updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            The auto-update status of the adapter that has been updated.
     *            </p>
     * @see AutoUpdate
     */
    public void setAutoUpdate(String autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    /**
     * <p>
     * The auto-update status of the adapter that has been updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            The auto-update status of the adapter that has been updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoUpdate
     */
    public UpdateAdapterResult withAutoUpdate(String autoUpdate) {
        this.autoUpdate = autoUpdate;
        return this;
    }

    /**
     * <p>
     * The auto-update status of the adapter that has been updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            The auto-update status of the adapter that has been updated.
     *            </p>
     * @see AutoUpdate
     */
    public void setAutoUpdate(AutoUpdate autoUpdate) {
        this.autoUpdate = autoUpdate.toString();
    }

    /**
     * <p>
     * The auto-update status of the adapter that has been updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            The auto-update status of the adapter that has been updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoUpdate
     */
    public UpdateAdapterResult withAutoUpdate(AutoUpdate autoUpdate) {
        this.autoUpdate = autoUpdate.toString();
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
            sb.append("AutoUpdate: " + getAutoUpdate());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAdapterResult == false)
            return false;
        UpdateAdapterResult other = (UpdateAdapterResult) obj;

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
        return true;
    }
}
