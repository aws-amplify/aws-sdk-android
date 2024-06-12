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

/**
 * <p>
 * Contains information on the adapter, including the adapter ID, Name, Creation
 * time, and feature types.
 * </p>
 */
public class AdapterOverview implements Serializable {
    /**
     * <p>
     * A unique identifier for the adapter resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     */
    private String adapterId;

    /**
     * <p>
     * A string naming the adapter resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     */
    private String adapterName;

    /**
     * <p>
     * The date and time that the adapter was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The feature types that the adapter is operating on.
     * </p>
     */
    private java.util.List<String> featureTypes;

    /**
     * <p>
     * A unique identifier for the adapter resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @return <p>
     *         A unique identifier for the adapter resource.
     *         </p>
     */
    public String getAdapterId() {
        return adapterId;
    }

    /**
     * <p>
     * A unique identifier for the adapter resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @param adapterId <p>
     *            A unique identifier for the adapter resource.
     *            </p>
     */
    public void setAdapterId(String adapterId) {
        this.adapterId = adapterId;
    }

    /**
     * <p>
     * A unique identifier for the adapter resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @param adapterId <p>
     *            A unique identifier for the adapter resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdapterOverview withAdapterId(String adapterId) {
        this.adapterId = adapterId;
        return this;
    }

    /**
     * <p>
     * A string naming the adapter resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     *
     * @return <p>
     *         A string naming the adapter resource.
     *         </p>
     */
    public String getAdapterName() {
        return adapterName;
    }

    /**
     * <p>
     * A string naming the adapter resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     *
     * @param adapterName <p>
     *            A string naming the adapter resource.
     *            </p>
     */
    public void setAdapterName(String adapterName) {
        this.adapterName = adapterName;
    }

    /**
     * <p>
     * A string naming the adapter resource.
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
     *            A string naming the adapter resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdapterOverview withAdapterName(String adapterName) {
        this.adapterName = adapterName;
        return this;
    }

    /**
     * <p>
     * The date and time that the adapter was created.
     * </p>
     *
     * @return <p>
     *         The date and time that the adapter was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The date and time that the adapter was created.
     * </p>
     *
     * @param creationTime <p>
     *            The date and time that the adapter was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the adapter was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The date and time that the adapter was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdapterOverview withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The feature types that the adapter is operating on.
     * </p>
     *
     * @return <p>
     *         The feature types that the adapter is operating on.
     *         </p>
     */
    public java.util.List<String> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * <p>
     * The feature types that the adapter is operating on.
     * </p>
     *
     * @param featureTypes <p>
     *            The feature types that the adapter is operating on.
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
     * The feature types that the adapter is operating on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureTypes <p>
     *            The feature types that the adapter is operating on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdapterOverview withFeatureTypes(String... featureTypes) {
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
     * The feature types that the adapter is operating on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureTypes <p>
     *            The feature types that the adapter is operating on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdapterOverview withFeatureTypes(java.util.Collection<String> featureTypes) {
        setFeatureTypes(featureTypes);
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
        if (getFeatureTypes() != null)
            sb.append("FeatureTypes: " + getFeatureTypes());
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
                + ((getFeatureTypes() == null) ? 0 : getFeatureTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdapterOverview == false)
            return false;
        AdapterOverview other = (AdapterOverview) obj;

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
        if (other.getFeatureTypes() == null ^ this.getFeatureTypes() == null)
            return false;
        if (other.getFeatureTypes() != null
                && other.getFeatureTypes().equals(this.getFeatureTypes()) == false)
            return false;
        return true;
    }
}
