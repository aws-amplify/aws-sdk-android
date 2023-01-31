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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Provides additional filters for specific data sources. Named shadow is the
 * only data source that currently supports and requires a filter. To add named
 * shadows to your fleet indexing configuration, set
 * <code>namedShadowIndexingMode</code> to be <code>ON</code> and specify your
 * shadow names in <code>filter</code>.
 * </p>
 */
public class IndexingFilter implements Serializable {
    /**
     * <p>
     * The shadow names that you select to index. The default maximum number of
     * shadow names for indexing is 10. To increase the limit, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     * >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon
     * Web Services General Reference</i>.
     * </p>
     */
    private java.util.List<String> namedShadowNames;

    /**
     * <p>
     * The shadow names that you select to index. The default maximum number of
     * shadow names for indexing is 10. To increase the limit, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     * >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon
     * Web Services General Reference</i>.
     * </p>
     *
     * @return <p>
     *         The shadow names that you select to index. The default maximum
     *         number of shadow names for indexing is 10. To increase the limit,
     *         see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *         >Amazon Web Services IoT Device Management Quotas</a> in the
     *         <i>Amazon Web Services General Reference</i>.
     *         </p>
     */
    public java.util.List<String> getNamedShadowNames() {
        return namedShadowNames;
    }

    /**
     * <p>
     * The shadow names that you select to index. The default maximum number of
     * shadow names for indexing is 10. To increase the limit, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     * >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon
     * Web Services General Reference</i>.
     * </p>
     *
     * @param namedShadowNames <p>
     *            The shadow names that you select to index. The default maximum
     *            number of shadow names for indexing is 10. To increase the
     *            limit, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *            >Amazon Web Services IoT Device Management Quotas</a> in the
     *            <i>Amazon Web Services General Reference</i>.
     *            </p>
     */
    public void setNamedShadowNames(java.util.Collection<String> namedShadowNames) {
        if (namedShadowNames == null) {
            this.namedShadowNames = null;
            return;
        }

        this.namedShadowNames = new java.util.ArrayList<String>(namedShadowNames);
    }

    /**
     * <p>
     * The shadow names that you select to index. The default maximum number of
     * shadow names for indexing is 10. To increase the limit, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     * >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon
     * Web Services General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param namedShadowNames <p>
     *            The shadow names that you select to index. The default maximum
     *            number of shadow names for indexing is 10. To increase the
     *            limit, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *            >Amazon Web Services IoT Device Management Quotas</a> in the
     *            <i>Amazon Web Services General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexingFilter withNamedShadowNames(String... namedShadowNames) {
        if (getNamedShadowNames() == null) {
            this.namedShadowNames = new java.util.ArrayList<String>(namedShadowNames.length);
        }
        for (String value : namedShadowNames) {
            this.namedShadowNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The shadow names that you select to index. The default maximum number of
     * shadow names for indexing is 10. To increase the limit, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     * >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon
     * Web Services General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param namedShadowNames <p>
     *            The shadow names that you select to index. The default maximum
     *            number of shadow names for indexing is 10. To increase the
     *            limit, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *            >Amazon Web Services IoT Device Management Quotas</a> in the
     *            <i>Amazon Web Services General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexingFilter withNamedShadowNames(java.util.Collection<String> namedShadowNames) {
        setNamedShadowNames(namedShadowNames);
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
        if (getNamedShadowNames() != null)
            sb.append("namedShadowNames: " + getNamedShadowNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNamedShadowNames() == null) ? 0 : getNamedShadowNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IndexingFilter == false)
            return false;
        IndexingFilter other = (IndexingFilter) obj;

        if (other.getNamedShadowNames() == null ^ this.getNamedShadowNames() == null)
            return false;
        if (other.getNamedShadowNames() != null
                && other.getNamedShadowNames().equals(this.getNamedShadowNames()) == false)
            return false;
        return true;
    }
}
