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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the data storage option chosen for requesting Places.
 * </p>
 * <note>
 * <p>
 * By using Places, you agree that AWS may transmit your API queries to your
 * selected third party provider for processing, which may be outside the AWS
 * region you are currently using.
 * </p>
 * <p>
 * Also, when using HERE as your data provider, you may not (a) use HERE Places
 * for Asset Management, or (b) select the <code>Storage</code> option for the
 * <code>IntendedUse</code> parameter when requesting Places in Japan. For more
 * information, see the <a href="https://aws.amazon.com/service-terms/">AWS
 * Service Terms</a> for Amazon Location Service.
 * </p>
 * </note>
 */
public class DataSourceConfiguration implements Serializable {
    /**
     * <p>
     * Specifies how the results of an operation will be stored by the caller.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SingleUse</code> specifies that the results won't be stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Storage</code> specifies that the result can be cached or stored in
     * a database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value: <code>SingleUse</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SingleUse, Storage
     */
    private String intendedUse;

    /**
     * <p>
     * Specifies how the results of an operation will be stored by the caller.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SingleUse</code> specifies that the results won't be stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Storage</code> specifies that the result can be cached or stored in
     * a database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value: <code>SingleUse</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SingleUse, Storage
     *
     * @return <p>
     *         Specifies how the results of an operation will be stored by the
     *         caller.
     *         </p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SingleUse</code> specifies that the results won't be
     *         stored.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Storage</code> specifies that the result can be cached or
     *         stored in a database.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default value: <code>SingleUse</code>
     *         </p>
     * @see IntendedUse
     */
    public String getIntendedUse() {
        return intendedUse;
    }

    /**
     * <p>
     * Specifies how the results of an operation will be stored by the caller.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SingleUse</code> specifies that the results won't be stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Storage</code> specifies that the result can be cached or stored in
     * a database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value: <code>SingleUse</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SingleUse, Storage
     *
     * @param intendedUse <p>
     *            Specifies how the results of an operation will be stored by
     *            the caller.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SingleUse</code> specifies that the results won't be
     *            stored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Storage</code> specifies that the result can be cached
     *            or stored in a database.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default value: <code>SingleUse</code>
     *            </p>
     * @see IntendedUse
     */
    public void setIntendedUse(String intendedUse) {
        this.intendedUse = intendedUse;
    }

    /**
     * <p>
     * Specifies how the results of an operation will be stored by the caller.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SingleUse</code> specifies that the results won't be stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Storage</code> specifies that the result can be cached or stored in
     * a database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value: <code>SingleUse</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SingleUse, Storage
     *
     * @param intendedUse <p>
     *            Specifies how the results of an operation will be stored by
     *            the caller.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SingleUse</code> specifies that the results won't be
     *            stored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Storage</code> specifies that the result can be cached
     *            or stored in a database.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default value: <code>SingleUse</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IntendedUse
     */
    public DataSourceConfiguration withIntendedUse(String intendedUse) {
        this.intendedUse = intendedUse;
        return this;
    }

    /**
     * <p>
     * Specifies how the results of an operation will be stored by the caller.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SingleUse</code> specifies that the results won't be stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Storage</code> specifies that the result can be cached or stored in
     * a database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value: <code>SingleUse</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SingleUse, Storage
     *
     * @param intendedUse <p>
     *            Specifies how the results of an operation will be stored by
     *            the caller.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SingleUse</code> specifies that the results won't be
     *            stored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Storage</code> specifies that the result can be cached
     *            or stored in a database.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default value: <code>SingleUse</code>
     *            </p>
     * @see IntendedUse
     */
    public void setIntendedUse(IntendedUse intendedUse) {
        this.intendedUse = intendedUse.toString();
    }

    /**
     * <p>
     * Specifies how the results of an operation will be stored by the caller.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SingleUse</code> specifies that the results won't be stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Storage</code> specifies that the result can be cached or stored in
     * a database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value: <code>SingleUse</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SingleUse, Storage
     *
     * @param intendedUse <p>
     *            Specifies how the results of an operation will be stored by
     *            the caller.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SingleUse</code> specifies that the results won't be
     *            stored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Storage</code> specifies that the result can be cached
     *            or stored in a database.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default value: <code>SingleUse</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IntendedUse
     */
    public DataSourceConfiguration withIntendedUse(IntendedUse intendedUse) {
        this.intendedUse = intendedUse.toString();
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
        if (getIntendedUse() != null)
            sb.append("IntendedUse: " + getIntendedUse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIntendedUse() == null) ? 0 : getIntendedUse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceConfiguration == false)
            return false;
        DataSourceConfiguration other = (DataSourceConfiguration) obj;

        if (other.getIntendedUse() == null ^ this.getIntendedUse() == null)
            return false;
        if (other.getIntendedUse() != null
                && other.getIntendedUse().equals(this.getIntendedUse()) == false)
            return false;
        return true;
    }
}
