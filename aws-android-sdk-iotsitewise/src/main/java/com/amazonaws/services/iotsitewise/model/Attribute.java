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
 * Contains an asset attribute property. For more information, see <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html#attributes"
 * >Attributes</a> in the <i>AWS IoT SiteWise User Guide</i>.
 * </p>
 */
public class Attribute implements Serializable {
    /**
     * <p>
     * The default value of the asset model property attribute. All assets that
     * you create from the asset model contain this attribute value. You can
     * update an attribute's value after you create an asset. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-attribute-values.html"
     * >Updating Attribute Values</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String defaultValue;

    /**
     * <p>
     * The default value of the asset model property attribute. All assets that
     * you create from the asset model contain this attribute value. You can
     * update an attribute's value after you create an asset. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-attribute-values.html"
     * >Updating Attribute Values</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The default value of the asset model property attribute. All
     *         assets that you create from the asset model contain this
     *         attribute value. You can update an attribute's value after you
     *         create an asset. For more information, see <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-attribute-values.html"
     *         >Updating Attribute Values</a> in the <i>AWS IoT SiteWise User
     *         Guide</i>.
     *         </p>
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <p>
     * The default value of the asset model property attribute. All assets that
     * you create from the asset model contain this attribute value. You can
     * update an attribute's value after you create an asset. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-attribute-values.html"
     * >Updating Attribute Values</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param defaultValue <p>
     *            The default value of the asset model property attribute. All
     *            assets that you create from the asset model contain this
     *            attribute value. You can update an attribute's value after you
     *            create an asset. For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-attribute-values.html"
     *            >Updating Attribute Values</a> in the <i>AWS IoT SiteWise User
     *            Guide</i>.
     *            </p>
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value of the asset model property attribute. All assets that
     * you create from the asset model contain this attribute value. You can
     * update an attribute's value after you create an asset. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-attribute-values.html"
     * >Updating Attribute Values</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param defaultValue <p>
     *            The default value of the asset model property attribute. All
     *            assets that you create from the asset model contain this
     *            attribute value. You can update an attribute's value after you
     *            create an asset. For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-attribute-values.html"
     *            >Updating Attribute Values</a> in the <i>AWS IoT SiteWise User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Attribute withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
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
        if (getDefaultValue() != null)
            sb.append("defaultValue: " + getDefaultValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Attribute == false)
            return false;
        Attribute other = (Attribute) obj;

        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null
                && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        return true;
    }
}
