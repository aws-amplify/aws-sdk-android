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

/**
 * <p>
 * Sends information about the detector model instance and the event that
 * triggered the action to a specified asset property in AWS IoT SiteWise.
 * </p>
 * <important>
 * <p>
 * You must specify either <code>propertyAlias</code> or both
 * <code>assetId</code> and <code>propertyId</code> to identify the target asset
 * property in AWS IoT SiteWise.
 * </p>
 * </important>
 * <p>
 * For parameters that are string data type, you can specify the following
 * options:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use a string. For example, the <code>propertyAlias</code> value can be
 * <code>'/company/windfarm/3/turbine/7/temperature'</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use an expression. For example, the <code>propertyAlias</code> value can be
 * <code>'company/windfarm/${$input.TemperatureInput.sensorData.windfarmID}/turbine/${$input.TemperatureInput.sensorData.turbineID}/temperature'</code>
 * .
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html"
 * >Expressions</a> in the <i>AWS IoT Events Developer Guide</i>.
 * </p>
 * </li>
 * </ul>
 */
public class IotSiteWiseAction implements Serializable {
    /**
     * <p>
     * A unique identifier for this entry. You can use the entry ID to track
     * which data entry causes an error in case of failure. The default is a new
     * unique identifier. You can also specify an expression.
     * </p>
     */
    private String entryId;

    /**
     * <p>
     * The ID of the asset that has the specified property. You can specify an
     * expression.
     * </p>
     */
    private String assetId;

    /**
     * <p>
     * The ID of the asset property. You can specify an expression.
     * </p>
     */
    private String propertyId;

    /**
     * <p>
     * The alias of the asset property. You can also specify an expression.
     * </p>
     */
    private String propertyAlias;

    /**
     * <p>
     * The value to send to the asset property. This value contains timestamp,
     * quality, and value (TQV) information.
     * </p>
     */
    private AssetPropertyValue propertyValue;

    /**
     * <p>
     * A unique identifier for this entry. You can use the entry ID to track
     * which data entry causes an error in case of failure. The default is a new
     * unique identifier. You can also specify an expression.
     * </p>
     *
     * @return <p>
     *         A unique identifier for this entry. You can use the entry ID to
     *         track which data entry causes an error in case of failure. The
     *         default is a new unique identifier. You can also specify an
     *         expression.
     *         </p>
     */
    public String getEntryId() {
        return entryId;
    }

    /**
     * <p>
     * A unique identifier for this entry. You can use the entry ID to track
     * which data entry causes an error in case of failure. The default is a new
     * unique identifier. You can also specify an expression.
     * </p>
     *
     * @param entryId <p>
     *            A unique identifier for this entry. You can use the entry ID
     *            to track which data entry causes an error in case of failure.
     *            The default is a new unique identifier. You can also specify
     *            an expression.
     *            </p>
     */
    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * <p>
     * A unique identifier for this entry. You can use the entry ID to track
     * which data entry causes an error in case of failure. The default is a new
     * unique identifier. You can also specify an expression.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entryId <p>
     *            A unique identifier for this entry. You can use the entry ID
     *            to track which data entry causes an error in case of failure.
     *            The default is a new unique identifier. You can also specify
     *            an expression.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IotSiteWiseAction withEntryId(String entryId) {
        this.entryId = entryId;
        return this;
    }

    /**
     * <p>
     * The ID of the asset that has the specified property. You can specify an
     * expression.
     * </p>
     *
     * @return <p>
     *         The ID of the asset that has the specified property. You can
     *         specify an expression.
     *         </p>
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * <p>
     * The ID of the asset that has the specified property. You can specify an
     * expression.
     * </p>
     *
     * @param assetId <p>
     *            The ID of the asset that has the specified property. You can
     *            specify an expression.
     *            </p>
     */
    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset that has the specified property. You can specify an
     * expression.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetId <p>
     *            The ID of the asset that has the specified property. You can
     *            specify an expression.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IotSiteWiseAction withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * <p>
     * The ID of the asset property. You can specify an expression.
     * </p>
     *
     * @return <p>
     *         The ID of the asset property. You can specify an expression.
     *         </p>
     */
    public String getPropertyId() {
        return propertyId;
    }

    /**
     * <p>
     * The ID of the asset property. You can specify an expression.
     * </p>
     *
     * @param propertyId <p>
     *            The ID of the asset property. You can specify an expression.
     *            </p>
     */
    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * <p>
     * The ID of the asset property. You can specify an expression.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propertyId <p>
     *            The ID of the asset property. You can specify an expression.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IotSiteWiseAction withPropertyId(String propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    /**
     * <p>
     * The alias of the asset property. You can also specify an expression.
     * </p>
     *
     * @return <p>
     *         The alias of the asset property. You can also specify an
     *         expression.
     *         </p>
     */
    public String getPropertyAlias() {
        return propertyAlias;
    }

    /**
     * <p>
     * The alias of the asset property. You can also specify an expression.
     * </p>
     *
     * @param propertyAlias <p>
     *            The alias of the asset property. You can also specify an
     *            expression.
     *            </p>
     */
    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    /**
     * <p>
     * The alias of the asset property. You can also specify an expression.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propertyAlias <p>
     *            The alias of the asset property. You can also specify an
     *            expression.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IotSiteWiseAction withPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
        return this;
    }

    /**
     * <p>
     * The value to send to the asset property. This value contains timestamp,
     * quality, and value (TQV) information.
     * </p>
     *
     * @return <p>
     *         The value to send to the asset property. This value contains
     *         timestamp, quality, and value (TQV) information.
     *         </p>
     */
    public AssetPropertyValue getPropertyValue() {
        return propertyValue;
    }

    /**
     * <p>
     * The value to send to the asset property. This value contains timestamp,
     * quality, and value (TQV) information.
     * </p>
     *
     * @param propertyValue <p>
     *            The value to send to the asset property. This value contains
     *            timestamp, quality, and value (TQV) information.
     *            </p>
     */
    public void setPropertyValue(AssetPropertyValue propertyValue) {
        this.propertyValue = propertyValue;
    }

    /**
     * <p>
     * The value to send to the asset property. This value contains timestamp,
     * quality, and value (TQV) information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propertyValue <p>
     *            The value to send to the asset property. This value contains
     *            timestamp, quality, and value (TQV) information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IotSiteWiseAction withPropertyValue(AssetPropertyValue propertyValue) {
        this.propertyValue = propertyValue;
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
        if (getEntryId() != null)
            sb.append("entryId: " + getEntryId() + ",");
        if (getAssetId() != null)
            sb.append("assetId: " + getAssetId() + ",");
        if (getPropertyId() != null)
            sb.append("propertyId: " + getPropertyId() + ",");
        if (getPropertyAlias() != null)
            sb.append("propertyAlias: " + getPropertyAlias() + ",");
        if (getPropertyValue() != null)
            sb.append("propertyValue: " + getPropertyValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryId() == null) ? 0 : getEntryId().hashCode());
        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        hashCode = prime * hashCode
                + ((getPropertyAlias() == null) ? 0 : getPropertyAlias().hashCode());
        hashCode = prime * hashCode
                + ((getPropertyValue() == null) ? 0 : getPropertyValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IotSiteWiseAction == false)
            return false;
        IotSiteWiseAction other = (IotSiteWiseAction) obj;

        if (other.getEntryId() == null ^ this.getEntryId() == null)
            return false;
        if (other.getEntryId() != null && other.getEntryId().equals(this.getEntryId()) == false)
            return false;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getPropertyId() == null ^ this.getPropertyId() == null)
            return false;
        if (other.getPropertyId() != null
                && other.getPropertyId().equals(this.getPropertyId()) == false)
            return false;
        if (other.getPropertyAlias() == null ^ this.getPropertyAlias() == null)
            return false;
        if (other.getPropertyAlias() != null
                && other.getPropertyAlias().equals(this.getPropertyAlias()) == false)
            return false;
        if (other.getPropertyValue() == null ^ this.getPropertyValue() == null)
            return false;
        if (other.getPropertyValue() != null
                && other.getPropertyValue().equals(this.getPropertyValue()) == false)
            return false;
        return true;
    }
}
