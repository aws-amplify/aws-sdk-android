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
 * Summary info for an adapter version. Contains information on the AdapterId,
 * AdapterVersion, CreationTime, FeatureTypes, and Status.
 * </p>
 */
public class AdapterVersionOverview implements Serializable {
    /**
     * <p>
     * A unique identifier for the adapter associated with a given adapter
     * version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     */
    private String adapterId;

    /**
     * <p>
     * An identified for a given adapter version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String adapterVersion;

    /**
     * <p>
     * The date and time that a given adapter version was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The feature types that the adapter version is operating on.
     * </p>
     */
    private java.util.List<String> featureTypes;

    /**
     * <p>
     * Contains information on the status of a given adapter version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, AT_RISK, DEPRECATED, CREATION_ERROR,
     * CREATION_IN_PROGRESS
     */
    private String status;

    /**
     * <p>
     * A message explaining the status of a given adapter vesion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     */
    private String statusMessage;

    /**
     * <p>
     * A unique identifier for the adapter associated with a given adapter
     * version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @return <p>
     *         A unique identifier for the adapter associated with a given
     *         adapter version.
     *         </p>
     */
    public String getAdapterId() {
        return adapterId;
    }

    /**
     * <p>
     * A unique identifier for the adapter associated with a given adapter
     * version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @param adapterId <p>
     *            A unique identifier for the adapter associated with a given
     *            adapter version.
     *            </p>
     */
    public void setAdapterId(String adapterId) {
        this.adapterId = adapterId;
    }

    /**
     * <p>
     * A unique identifier for the adapter associated with a given adapter
     * version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @param adapterId <p>
     *            A unique identifier for the adapter associated with a given
     *            adapter version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdapterVersionOverview withAdapterId(String adapterId) {
        this.adapterId = adapterId;
        return this;
    }

    /**
     * <p>
     * An identified for a given adapter version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         An identified for a given adapter version.
     *         </p>
     */
    public String getAdapterVersion() {
        return adapterVersion;
    }

    /**
     * <p>
     * An identified for a given adapter version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param adapterVersion <p>
     *            An identified for a given adapter version.
     *            </p>
     */
    public void setAdapterVersion(String adapterVersion) {
        this.adapterVersion = adapterVersion;
    }

    /**
     * <p>
     * An identified for a given adapter version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param adapterVersion <p>
     *            An identified for a given adapter version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdapterVersionOverview withAdapterVersion(String adapterVersion) {
        this.adapterVersion = adapterVersion;
        return this;
    }

    /**
     * <p>
     * The date and time that a given adapter version was created.
     * </p>
     *
     * @return <p>
     *         The date and time that a given adapter version was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The date and time that a given adapter version was created.
     * </p>
     *
     * @param creationTime <p>
     *            The date and time that a given adapter version was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that a given adapter version was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The date and time that a given adapter version was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdapterVersionOverview withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The feature types that the adapter version is operating on.
     * </p>
     *
     * @return <p>
     *         The feature types that the adapter version is operating on.
     *         </p>
     */
    public java.util.List<String> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * <p>
     * The feature types that the adapter version is operating on.
     * </p>
     *
     * @param featureTypes <p>
     *            The feature types that the adapter version is operating on.
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
     * The feature types that the adapter version is operating on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureTypes <p>
     *            The feature types that the adapter version is operating on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdapterVersionOverview withFeatureTypes(String... featureTypes) {
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
     * The feature types that the adapter version is operating on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureTypes <p>
     *            The feature types that the adapter version is operating on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdapterVersionOverview withFeatureTypes(java.util.Collection<String> featureTypes) {
        setFeatureTypes(featureTypes);
        return this;
    }

    /**
     * <p>
     * Contains information on the status of a given adapter version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, AT_RISK, DEPRECATED, CREATION_ERROR,
     * CREATION_IN_PROGRESS
     *
     * @return <p>
     *         Contains information on the status of a given adapter version.
     *         </p>
     * @see AdapterVersionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Contains information on the status of a given adapter version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, AT_RISK, DEPRECATED, CREATION_ERROR,
     * CREATION_IN_PROGRESS
     *
     * @param status <p>
     *            Contains information on the status of a given adapter version.
     *            </p>
     * @see AdapterVersionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Contains information on the status of a given adapter version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, AT_RISK, DEPRECATED, CREATION_ERROR,
     * CREATION_IN_PROGRESS
     *
     * @param status <p>
     *            Contains information on the status of a given adapter version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AdapterVersionStatus
     */
    public AdapterVersionOverview withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Contains information on the status of a given adapter version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, AT_RISK, DEPRECATED, CREATION_ERROR,
     * CREATION_IN_PROGRESS
     *
     * @param status <p>
     *            Contains information on the status of a given adapter version.
     *            </p>
     * @see AdapterVersionStatus
     */
    public void setStatus(AdapterVersionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Contains information on the status of a given adapter version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, AT_RISK, DEPRECATED, CREATION_ERROR,
     * CREATION_IN_PROGRESS
     *
     * @param status <p>
     *            Contains information on the status of a given adapter version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AdapterVersionStatus
     */
    public AdapterVersionOverview withStatus(AdapterVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A message explaining the status of a given adapter vesion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     *
     * @return <p>
     *         A message explaining the status of a given adapter vesion.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * A message explaining the status of a given adapter vesion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     *
     * @param statusMessage <p>
     *            A message explaining the status of a given adapter vesion.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message explaining the status of a given adapter vesion.
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
     * @param statusMessage <p>
     *            A message explaining the status of a given adapter vesion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdapterVersionOverview withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
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
        if (getAdapterVersion() != null)
            sb.append("AdapterVersion: " + getAdapterVersion() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getFeatureTypes() != null)
            sb.append("FeatureTypes: " + getFeatureTypes() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdapterId() == null) ? 0 : getAdapterId().hashCode());
        hashCode = prime * hashCode
                + ((getAdapterVersion() == null) ? 0 : getAdapterVersion().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getFeatureTypes() == null) ? 0 : getFeatureTypes().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdapterVersionOverview == false)
            return false;
        AdapterVersionOverview other = (AdapterVersionOverview) obj;

        if (other.getAdapterId() == null ^ this.getAdapterId() == null)
            return false;
        if (other.getAdapterId() != null
                && other.getAdapterId().equals(this.getAdapterId()) == false)
            return false;
        if (other.getAdapterVersion() == null ^ this.getAdapterVersion() == null)
            return false;
        if (other.getAdapterVersion() != null
                && other.getAdapterVersion().equals(this.getAdapterVersion()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }
}
