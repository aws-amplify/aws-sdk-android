/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an action to send data from an MQTT message that triggered the rule
 * to IoT SiteWise asset properties.
 * </p>
 */
public class IotSiteWiseAction implements Serializable {
    /**
     * <p>
     * A list of asset property value entries.
     * </p>
     */
    private java.util.List<PutAssetPropertyValueEntry> putAssetPropertyValueEntries;

    /**
     * <p>
     * The ARN of the role that grants IoT permission to send an asset property
     * value to IoT SiteWise. (
     * <code>"Action": "iotsitewise:BatchPutAssetPropertyValue"</code>). The
     * trust policy can restrict access to specific asset hierarchy paths.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * A list of asset property value entries.
     * </p>
     *
     * @return <p>
     *         A list of asset property value entries.
     *         </p>
     */
    public java.util.List<PutAssetPropertyValueEntry> getPutAssetPropertyValueEntries() {
        return putAssetPropertyValueEntries;
    }

    /**
     * <p>
     * A list of asset property value entries.
     * </p>
     *
     * @param putAssetPropertyValueEntries <p>
     *            A list of asset property value entries.
     *            </p>
     */
    public void setPutAssetPropertyValueEntries(
            java.util.Collection<PutAssetPropertyValueEntry> putAssetPropertyValueEntries) {
        if (putAssetPropertyValueEntries == null) {
            this.putAssetPropertyValueEntries = null;
            return;
        }

        this.putAssetPropertyValueEntries = new java.util.ArrayList<PutAssetPropertyValueEntry>(
                putAssetPropertyValueEntries);
    }

    /**
     * <p>
     * A list of asset property value entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param putAssetPropertyValueEntries <p>
     *            A list of asset property value entries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IotSiteWiseAction withPutAssetPropertyValueEntries(
            PutAssetPropertyValueEntry... putAssetPropertyValueEntries) {
        if (getPutAssetPropertyValueEntries() == null) {
            this.putAssetPropertyValueEntries = new java.util.ArrayList<PutAssetPropertyValueEntry>(
                    putAssetPropertyValueEntries.length);
        }
        for (PutAssetPropertyValueEntry value : putAssetPropertyValueEntries) {
            this.putAssetPropertyValueEntries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of asset property value entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param putAssetPropertyValueEntries <p>
     *            A list of asset property value entries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IotSiteWiseAction withPutAssetPropertyValueEntries(
            java.util.Collection<PutAssetPropertyValueEntry> putAssetPropertyValueEntries) {
        setPutAssetPropertyValueEntries(putAssetPropertyValueEntries);
        return this;
    }

    /**
     * <p>
     * The ARN of the role that grants IoT permission to send an asset property
     * value to IoT SiteWise. (
     * <code>"Action": "iotsitewise:BatchPutAssetPropertyValue"</code>). The
     * trust policy can restrict access to specific asset hierarchy paths.
     * </p>
     *
     * @return <p>
     *         The ARN of the role that grants IoT permission to send an asset
     *         property value to IoT SiteWise. (
     *         <code>"Action": "iotsitewise:BatchPutAssetPropertyValue"</code>).
     *         The trust policy can restrict access to specific asset hierarchy
     *         paths.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants IoT permission to send an asset property
     * value to IoT SiteWise. (
     * <code>"Action": "iotsitewise:BatchPutAssetPropertyValue"</code>). The
     * trust policy can restrict access to specific asset hierarchy paths.
     * </p>
     *
     * @param roleArn <p>
     *            The ARN of the role that grants IoT permission to send an
     *            asset property value to IoT SiteWise. (
     *            <code>"Action": "iotsitewise:BatchPutAssetPropertyValue"</code>
     *            ). The trust policy can restrict access to specific asset
     *            hierarchy paths.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants IoT permission to send an asset property
     * value to IoT SiteWise. (
     * <code>"Action": "iotsitewise:BatchPutAssetPropertyValue"</code>). The
     * trust policy can restrict access to specific asset hierarchy paths.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The ARN of the role that grants IoT permission to send an
     *            asset property value to IoT SiteWise. (
     *            <code>"Action": "iotsitewise:BatchPutAssetPropertyValue"</code>
     *            ). The trust policy can restrict access to specific asset
     *            hierarchy paths.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IotSiteWiseAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getPutAssetPropertyValueEntries() != null)
            sb.append("putAssetPropertyValueEntries: " + getPutAssetPropertyValueEntries() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPutAssetPropertyValueEntries() == null) ? 0
                        : getPutAssetPropertyValueEntries().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
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

        if (other.getPutAssetPropertyValueEntries() == null
                ^ this.getPutAssetPropertyValueEntries() == null)
            return false;
        if (other.getPutAssetPropertyValueEntries() != null
                && other.getPutAssetPropertyValueEntries().equals(
                        this.getPutAssetPropertyValueEntries()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
