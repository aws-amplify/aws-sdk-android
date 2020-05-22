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

/**
 * <p>
 * Contains asset property information.
 * </p>
 */
public class Property implements Serializable {
    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String id;

    /**
     * <p>
     * The name of the property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String name;

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
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String alias;

    /**
     * <p>
     * The asset property's notification topic and state. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>
     * </p>
     */
    private PropertyNotification notification;

    /**
     * <p>
     * The property data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DOUBLE, BOOLEAN
     */
    private String dataType;

    /**
     * <p>
     * The unit (such as <code>Newtons</code> or <code>RPM</code>) of the asset
     * property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String unit;

    /**
     * <p>
     * The property type (see <code>PropertyType</code>). A property contains
     * one type.
     * </p>
     */
    private PropertyType type;

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the asset property.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param id <p>
     *            The ID of the asset property.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the asset property.
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
     * @param id <p>
     *            The ID of the asset property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Property withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The name of the property.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param name <p>
     *            The name of the property.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param name <p>
     *            The name of the property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Property withName(String name) {
        this.name = name;
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
     */
    public String getAlias() {
        return alias;
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
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param alias <p>
     *            The property alias that identifies the property, such as an
     *            OPC-UA server data stream path (for example,
     *            <code>/company/windfarm/3/turbine/7/temperature</code>). For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     *            >Mapping Industrial Data Streams to Asset Properties</a> in
     *            the <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     */
    public void setAlias(String alias) {
        this.alias = alias;
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param alias <p>
     *            The property alias that identifies the property, such as an
     *            OPC-UA server data stream path (for example,
     *            <code>/company/windfarm/3/turbine/7/temperature</code>). For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     *            >Mapping Industrial Data Streams to Asset Properties</a> in
     *            the <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Property withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * <p>
     * The asset property's notification topic and state. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>
     * </p>
     *
     * @return <p>
     *         The asset property's notification topic and state. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     *         >UpdateAssetProperty</a>
     *         </p>
     */
    public PropertyNotification getNotification() {
        return notification;
    }

    /**
     * <p>
     * The asset property's notification topic and state. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>
     * </p>
     *
     * @param notification <p>
     *            The asset property's notification topic and state. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     *            >UpdateAssetProperty</a>
     *            </p>
     */
    public void setNotification(PropertyNotification notification) {
        this.notification = notification;
    }

    /**
     * <p>
     * The asset property's notification topic and state. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notification <p>
     *            The asset property's notification topic and state. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     *            >UpdateAssetProperty</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Property withNotification(PropertyNotification notification) {
        this.notification = notification;
        return this;
    }

    /**
     * <p>
     * The property data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DOUBLE, BOOLEAN
     *
     * @return <p>
     *         The property data type.
     *         </p>
     * @see PropertyDataType
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * <p>
     * The property data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DOUBLE, BOOLEAN
     *
     * @param dataType <p>
     *            The property data type.
     *            </p>
     * @see PropertyDataType
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The property data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DOUBLE, BOOLEAN
     *
     * @param dataType <p>
     *            The property data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PropertyDataType
     */
    public Property withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * <p>
     * The property data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DOUBLE, BOOLEAN
     *
     * @param dataType <p>
     *            The property data type.
     *            </p>
     * @see PropertyDataType
     */
    public void setDataType(PropertyDataType dataType) {
        this.dataType = dataType.toString();
    }

    /**
     * <p>
     * The property data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DOUBLE, BOOLEAN
     *
     * @param dataType <p>
     *            The property data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PropertyDataType
     */
    public Property withDataType(PropertyDataType dataType) {
        this.dataType = dataType.toString();
        return this;
    }

    /**
     * <p>
     * The unit (such as <code>Newtons</code> or <code>RPM</code>) of the asset
     * property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The unit (such as <code>Newtons</code> or <code>RPM</code>) of
     *         the asset property.
     *         </p>
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * The unit (such as <code>Newtons</code> or <code>RPM</code>) of the asset
     * property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param unit <p>
     *            The unit (such as <code>Newtons</code> or <code>RPM</code>) of
     *            the asset property.
     *            </p>
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit (such as <code>Newtons</code> or <code>RPM</code>) of the asset
     * property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param unit <p>
     *            The unit (such as <code>Newtons</code> or <code>RPM</code>) of
     *            the asset property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Property withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * <p>
     * The property type (see <code>PropertyType</code>). A property contains
     * one type.
     * </p>
     *
     * @return <p>
     *         The property type (see <code>PropertyType</code>). A property
     *         contains one type.
     *         </p>
     */
    public PropertyType getType() {
        return type;
    }

    /**
     * <p>
     * The property type (see <code>PropertyType</code>). A property contains
     * one type.
     * </p>
     *
     * @param type <p>
     *            The property type (see <code>PropertyType</code>). A property
     *            contains one type.
     *            </p>
     */
    public void setType(PropertyType type) {
        this.type = type;
    }

    /**
     * <p>
     * The property type (see <code>PropertyType</code>). A property contains
     * one type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The property type (see <code>PropertyType</code>). A property
     *            contains one type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Property withType(PropertyType type) {
        this.type = type;
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
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getAlias() != null)
            sb.append("alias: " + getAlias() + ",");
        if (getNotification() != null)
            sb.append("notification: " + getNotification() + ",");
        if (getDataType() != null)
            sb.append("dataType: " + getDataType() + ",");
        if (getUnit() != null)
            sb.append("unit: " + getUnit() + ",");
        if (getType() != null)
            sb.append("type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode
                + ((getNotification() == null) ? 0 : getNotification().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Property == false)
            return false;
        Property other = (Property) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getNotification() == null ^ this.getNotification() == null)
            return false;
        if (other.getNotification() != null
                && other.getNotification().equals(this.getNotification()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
