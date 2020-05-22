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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates an asset property's alias and notification state.
 * </p>
 * <important>
 * <p>
 * This operation overwrites the property's existing alias and notification
 * state. To keep your existing property's alias or notification state, you must
 * include the existing values in the UpdateAssetProperty request. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAssetProperty.html"
 * >DescribeAssetProperty</a>.
 * </p>
 * </important>
 */
public class UpdateAssetPropertyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the asset to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String assetId;

    /**
     * <p>
     * The ID of the asset property to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String propertyId;

    /**
     * <p>
     * The property alias that identifies the property, such as an OPC-UA server
     * data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     * >Mapping Industrial Data Streams to Asset Properties</a> in the <i>AWS
     * IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * If you omit this parameter, the alias is removed from the property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String propertyAlias;

    /**
     * <p>
     * The MQTT notification state (enabled or disabled) for this asset
     * property. When the notification state is enabled, AWS IoT SiteWise
     * publishes property value updates to a unique MQTT topic. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html"
     * >Interacting with Other Services</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <p>
     * If you omit this parameter, the notification state is set to
     * <code>DISABLED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String propertyNotificationState;

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the asset to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the asset to be updated.
     *         </p>
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * <p>
     * The ID of the asset to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param assetId <p>
     *            The ID of the asset to be updated.
     *            </p>
     */
    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset to be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param assetId <p>
     *            The ID of the asset to be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAssetPropertyRequest withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * <p>
     * The ID of the asset property to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the asset property to be updated.
     *         </p>
     */
    public String getPropertyId() {
        return propertyId;
    }

    /**
     * <p>
     * The ID of the asset property to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param propertyId <p>
     *            The ID of the asset property to be updated.
     *            </p>
     */
    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * <p>
     * The ID of the asset property to be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param propertyId <p>
     *            The ID of the asset property to be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAssetPropertyRequest withPropertyId(String propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    /**
     * <p>
     * The property alias that identifies the property, such as an OPC-UA server
     * data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     * >Mapping Industrial Data Streams to Asset Properties</a> in the <i>AWS
     * IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * If you omit this parameter, the alias is removed from the property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The property alias that identifies the property, such as an
     *         OPC-UA server data stream path (for example,
     *         <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     *         >Mapping Industrial Data Streams to Asset Properties</a> in the
     *         <i>AWS IoT SiteWise User Guide</i>.
     *         </p>
     *         <p>
     *         If you omit this parameter, the alias is removed from the
     *         property.
     *         </p>
     */
    public String getPropertyAlias() {
        return propertyAlias;
    }

    /**
     * <p>
     * The property alias that identifies the property, such as an OPC-UA server
     * data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     * >Mapping Industrial Data Streams to Asset Properties</a> in the <i>AWS
     * IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * If you omit this parameter, the alias is removed from the property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param propertyAlias <p>
     *            The property alias that identifies the property, such as an
     *            OPC-UA server data stream path (for example,
     *            <code>/company/windfarm/3/turbine/7/temperature</code>). For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     *            >Mapping Industrial Data Streams to Asset Properties</a> in
     *            the <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     *            <p>
     *            If you omit this parameter, the alias is removed from the
     *            property.
     *            </p>
     */
    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    /**
     * <p>
     * The property alias that identifies the property, such as an OPC-UA server
     * data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     * >Mapping Industrial Data Streams to Asset Properties</a> in the <i>AWS
     * IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * If you omit this parameter, the alias is removed from the property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param propertyAlias <p>
     *            The property alias that identifies the property, such as an
     *            OPC-UA server data stream path (for example,
     *            <code>/company/windfarm/3/turbine/7/temperature</code>). For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     *            >Mapping Industrial Data Streams to Asset Properties</a> in
     *            the <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     *            <p>
     *            If you omit this parameter, the alias is removed from the
     *            property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAssetPropertyRequest withPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
        return this;
    }

    /**
     * <p>
     * The MQTT notification state (enabled or disabled) for this asset
     * property. When the notification state is enabled, AWS IoT SiteWise
     * publishes property value updates to a unique MQTT topic. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html"
     * >Interacting with Other Services</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <p>
     * If you omit this parameter, the notification state is set to
     * <code>DISABLED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         The MQTT notification state (enabled or disabled) for this asset
     *         property. When the notification state is enabled, AWS IoT
     *         SiteWise publishes property value updates to a unique MQTT topic.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html"
     *         >Interacting with Other Services</a> in the <i>AWS IoT SiteWise
     *         User Guide</i>.
     *         </p>
     *         <p>
     *         If you omit this parameter, the notification state is set to
     *         <code>DISABLED</code>.
     *         </p>
     * @see PropertyNotificationState
     */
    public String getPropertyNotificationState() {
        return propertyNotificationState;
    }

    /**
     * <p>
     * The MQTT notification state (enabled or disabled) for this asset
     * property. When the notification state is enabled, AWS IoT SiteWise
     * publishes property value updates to a unique MQTT topic. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html"
     * >Interacting with Other Services</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <p>
     * If you omit this parameter, the notification state is set to
     * <code>DISABLED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param propertyNotificationState <p>
     *            The MQTT notification state (enabled or disabled) for this
     *            asset property. When the notification state is enabled, AWS
     *            IoT SiteWise publishes property value updates to a unique MQTT
     *            topic. For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html"
     *            >Interacting with Other Services</a> in the <i>AWS IoT
     *            SiteWise User Guide</i>.
     *            </p>
     *            <p>
     *            If you omit this parameter, the notification state is set to
     *            <code>DISABLED</code>.
     *            </p>
     * @see PropertyNotificationState
     */
    public void setPropertyNotificationState(String propertyNotificationState) {
        this.propertyNotificationState = propertyNotificationState;
    }

    /**
     * <p>
     * The MQTT notification state (enabled or disabled) for this asset
     * property. When the notification state is enabled, AWS IoT SiteWise
     * publishes property value updates to a unique MQTT topic. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html"
     * >Interacting with Other Services</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <p>
     * If you omit this parameter, the notification state is set to
     * <code>DISABLED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param propertyNotificationState <p>
     *            The MQTT notification state (enabled or disabled) for this
     *            asset property. When the notification state is enabled, AWS
     *            IoT SiteWise publishes property value updates to a unique MQTT
     *            topic. For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html"
     *            >Interacting with Other Services</a> in the <i>AWS IoT
     *            SiteWise User Guide</i>.
     *            </p>
     *            <p>
     *            If you omit this parameter, the notification state is set to
     *            <code>DISABLED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PropertyNotificationState
     */
    public UpdateAssetPropertyRequest withPropertyNotificationState(String propertyNotificationState) {
        this.propertyNotificationState = propertyNotificationState;
        return this;
    }

    /**
     * <p>
     * The MQTT notification state (enabled or disabled) for this asset
     * property. When the notification state is enabled, AWS IoT SiteWise
     * publishes property value updates to a unique MQTT topic. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html"
     * >Interacting with Other Services</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <p>
     * If you omit this parameter, the notification state is set to
     * <code>DISABLED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param propertyNotificationState <p>
     *            The MQTT notification state (enabled or disabled) for this
     *            asset property. When the notification state is enabled, AWS
     *            IoT SiteWise publishes property value updates to a unique MQTT
     *            topic. For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html"
     *            >Interacting with Other Services</a> in the <i>AWS IoT
     *            SiteWise User Guide</i>.
     *            </p>
     *            <p>
     *            If you omit this parameter, the notification state is set to
     *            <code>DISABLED</code>.
     *            </p>
     * @see PropertyNotificationState
     */
    public void setPropertyNotificationState(PropertyNotificationState propertyNotificationState) {
        this.propertyNotificationState = propertyNotificationState.toString();
    }

    /**
     * <p>
     * The MQTT notification state (enabled or disabled) for this asset
     * property. When the notification state is enabled, AWS IoT SiteWise
     * publishes property value updates to a unique MQTT topic. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html"
     * >Interacting with Other Services</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <p>
     * If you omit this parameter, the notification state is set to
     * <code>DISABLED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param propertyNotificationState <p>
     *            The MQTT notification state (enabled or disabled) for this
     *            asset property. When the notification state is enabled, AWS
     *            IoT SiteWise publishes property value updates to a unique MQTT
     *            topic. For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html"
     *            >Interacting with Other Services</a> in the <i>AWS IoT
     *            SiteWise User Guide</i>.
     *            </p>
     *            <p>
     *            If you omit this parameter, the notification state is set to
     *            <code>DISABLED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PropertyNotificationState
     */
    public UpdateAssetPropertyRequest withPropertyNotificationState(
            PropertyNotificationState propertyNotificationState) {
        this.propertyNotificationState = propertyNotificationState.toString();
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @return <p>
     *         A unique case-sensitive identifier that you can provide to ensure
     *         the idempotency of the request. Don't reuse this client token if
     *         a new idempotent request is required.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @param clientToken <p>
     *            A unique case-sensitive identifier that you can provide to
     *            ensure the idempotency of the request. Don't reuse this client
     *            token if a new idempotent request is required.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @param clientToken <p>
     *            A unique case-sensitive identifier that you can provide to
     *            ensure the idempotency of the request. Don't reuse this client
     *            token if a new idempotent request is required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAssetPropertyRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getAssetId() != null)
            sb.append("assetId: " + getAssetId() + ",");
        if (getPropertyId() != null)
            sb.append("propertyId: " + getPropertyId() + ",");
        if (getPropertyAlias() != null)
            sb.append("propertyAlias: " + getPropertyAlias() + ",");
        if (getPropertyNotificationState() != null)
            sb.append("propertyNotificationState: " + getPropertyNotificationState() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        hashCode = prime * hashCode
                + ((getPropertyAlias() == null) ? 0 : getPropertyAlias().hashCode());
        hashCode = prime
                * hashCode
                + ((getPropertyNotificationState() == null) ? 0 : getPropertyNotificationState()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAssetPropertyRequest == false)
            return false;
        UpdateAssetPropertyRequest other = (UpdateAssetPropertyRequest) obj;

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
        if (other.getPropertyNotificationState() == null
                ^ this.getPropertyNotificationState() == null)
            return false;
        if (other.getPropertyNotificationState() != null
                && other.getPropertyNotificationState().equals(this.getPropertyNotificationState()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
