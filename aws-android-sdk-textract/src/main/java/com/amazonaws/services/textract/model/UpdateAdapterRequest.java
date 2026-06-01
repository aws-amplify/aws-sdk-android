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
 * Update the configuration for an adapter. FeatureTypes configurations cannot
 * be updated. At least one new parameter must be specified as an argument.
 * </p>
 */
public class UpdateAdapterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A string containing a unique ID for the adapter that will be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     */
    private String adapterId;

    /**
     * <p>
     * The new description to be applied to the adapter.
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
     * The new name to be applied to the adapter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     */
    private String adapterName;

    /**
     * <p>
     * The new auto-update status to be applied to the adapter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String autoUpdate;

    /**
     * <p>
     * A string containing a unique ID for the adapter that will be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @return <p>
     *         A string containing a unique ID for the adapter that will be
     *         updated.
     *         </p>
     */
    public String getAdapterId() {
        return adapterId;
    }

    /**
     * <p>
     * A string containing a unique ID for the adapter that will be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @param adapterId <p>
     *            A string containing a unique ID for the adapter that will be
     *            updated.
     *            </p>
     */
    public void setAdapterId(String adapterId) {
        this.adapterId = adapterId;
    }

    /**
     * <p>
     * A string containing a unique ID for the adapter that will be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @param adapterId <p>
     *            A string containing a unique ID for the adapter that will be
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAdapterRequest withAdapterId(String adapterId) {
        this.adapterId = adapterId;
        return this;
    }

    /**
     * <p>
     * The new description to be applied to the adapter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     *
     * @return <p>
     *         The new description to be applied to the adapter.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The new description to be applied to the adapter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     *
     * @param description <p>
     *            The new description to be applied to the adapter.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new description to be applied to the adapter.
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
     *            The new description to be applied to the adapter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAdapterRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The new name to be applied to the adapter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     *
     * @return <p>
     *         The new name to be applied to the adapter.
     *         </p>
     */
    public String getAdapterName() {
        return adapterName;
    }

    /**
     * <p>
     * The new name to be applied to the adapter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     *
     * @param adapterName <p>
     *            The new name to be applied to the adapter.
     *            </p>
     */
    public void setAdapterName(String adapterName) {
        this.adapterName = adapterName;
    }

    /**
     * <p>
     * The new name to be applied to the adapter.
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
     *            The new name to be applied to the adapter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAdapterRequest withAdapterName(String adapterName) {
        this.adapterName = adapterName;
        return this;
    }

    /**
     * <p>
     * The new auto-update status to be applied to the adapter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         The new auto-update status to be applied to the adapter.
     *         </p>
     * @see AutoUpdate
     */
    public String getAutoUpdate() {
        return autoUpdate;
    }

    /**
     * <p>
     * The new auto-update status to be applied to the adapter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            The new auto-update status to be applied to the adapter.
     *            </p>
     * @see AutoUpdate
     */
    public void setAutoUpdate(String autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    /**
     * <p>
     * The new auto-update status to be applied to the adapter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            The new auto-update status to be applied to the adapter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoUpdate
     */
    public UpdateAdapterRequest withAutoUpdate(String autoUpdate) {
        this.autoUpdate = autoUpdate;
        return this;
    }

    /**
     * <p>
     * The new auto-update status to be applied to the adapter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            The new auto-update status to be applied to the adapter.
     *            </p>
     * @see AutoUpdate
     */
    public void setAutoUpdate(AutoUpdate autoUpdate) {
        this.autoUpdate = autoUpdate.toString();
    }

    /**
     * <p>
     * The new auto-update status to be applied to the adapter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoUpdate <p>
     *            The new auto-update status to be applied to the adapter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoUpdate
     */
    public UpdateAdapterRequest withAutoUpdate(AutoUpdate autoUpdate) {
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getAdapterName() != null)
            sb.append("AdapterName: " + getAdapterName() + ",");
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
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getAdapterName() == null) ? 0 : getAdapterName().hashCode());
        hashCode = prime * hashCode + ((getAutoUpdate() == null) ? 0 : getAutoUpdate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAdapterRequest == false)
            return false;
        UpdateAdapterRequest other = (UpdateAdapterRequest) obj;

        if (other.getAdapterId() == null ^ this.getAdapterId() == null)
            return false;
        if (other.getAdapterId() != null
                && other.getAdapterId().equals(this.getAdapterId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAdapterName() == null ^ this.getAdapterName() == null)
            return false;
        if (other.getAdapterName() != null
                && other.getAdapterName().equals(this.getAdapterName()) == false)
            return false;
        if (other.getAutoUpdate() == null ^ this.getAutoUpdate() == null)
            return false;
        if (other.getAutoUpdate() != null
                && other.getAutoUpdate().equals(this.getAutoUpdate()) == false)
            return false;
        return true;
    }
}
