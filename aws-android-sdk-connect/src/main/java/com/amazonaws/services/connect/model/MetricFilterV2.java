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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the filter used when retrieving metrics.
 * <code>MetricFiltersV2</code> can be used on the following metrics:
 * <code>AVG_AGENT_CONNECTING_TIME</code>, <code>CONTACTS_CREATED</code>,
 * <code>CONTACTS_HANDLED</code>, <code>SUM_CONTACTS_DISCONNECTED</code>.
 * </p>
 */
public class MetricFilterV2 implements Serializable {
    /**
     * <p>
     * The key to use for filtering data.
     * </p>
     * <p>
     * Valid metric filter keys: <code>INITIATION_METHOD</code>,
     * <code>DISCONNECT_REASON</code>. These are the same values as the
     * <code>InitiationMethod</code> and <code>DisconnectReason</code> in the
     * contact record. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/ctr-data-model.html#ctr-ContactTraceRecord"
     * >ContactTraceRecord</a> in the <i>Amazon Connect Administrator's
     * Guide</i>.
     * </p>
     */
    private String metricFilterKey;

    /**
     * <p>
     * The values to use for filtering data.
     * </p>
     * <p>
     * Valid metric filter values for <code>INITIATION_METHOD</code>:
     * <code>INBOUND</code> | <code>OUTBOUND</code> | <code>TRANSFER</code> |
     * <code>QUEUE_TRANSFER</code> | <code>CALLBACK</code> | <code>API</code>
     * </p>
     * <p>
     * Valid metric filter values for <code>DISCONNECT_REASON</code>:
     * <code>CUSTOMER_DISCONNECT</code> | <code>AGENT_DISCONNECT</code> |
     * <code>THIRD_PARTY_DISCONNECT</code> | <code>TELECOM_PROBLEM</code> |
     * <code>BARGED</code> | <code>CONTACT_FLOW_DISCONNECT</code> |
     * <code>OTHER</code> | <code>EXPIRED</code> | <code>API</code>
     * </p>
     */
    private java.util.List<String> metricFilterValues;

    /**
     * <p>
     * The key to use for filtering data.
     * </p>
     * <p>
     * Valid metric filter keys: <code>INITIATION_METHOD</code>,
     * <code>DISCONNECT_REASON</code>. These are the same values as the
     * <code>InitiationMethod</code> and <code>DisconnectReason</code> in the
     * contact record. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/ctr-data-model.html#ctr-ContactTraceRecord"
     * >ContactTraceRecord</a> in the <i>Amazon Connect Administrator's
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The key to use for filtering data.
     *         </p>
     *         <p>
     *         Valid metric filter keys: <code>INITIATION_METHOD</code>,
     *         <code>DISCONNECT_REASON</code>. These are the same values as the
     *         <code>InitiationMethod</code> and <code>DisconnectReason</code>
     *         in the contact record. For more information, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/ctr-data-model.html#ctr-ContactTraceRecord"
     *         >ContactTraceRecord</a> in the <i>Amazon Connect Administrator's
     *         Guide</i>.
     *         </p>
     */
    public String getMetricFilterKey() {
        return metricFilterKey;
    }

    /**
     * <p>
     * The key to use for filtering data.
     * </p>
     * <p>
     * Valid metric filter keys: <code>INITIATION_METHOD</code>,
     * <code>DISCONNECT_REASON</code>. These are the same values as the
     * <code>InitiationMethod</code> and <code>DisconnectReason</code> in the
     * contact record. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/ctr-data-model.html#ctr-ContactTraceRecord"
     * >ContactTraceRecord</a> in the <i>Amazon Connect Administrator's
     * Guide</i>.
     * </p>
     *
     * @param metricFilterKey <p>
     *            The key to use for filtering data.
     *            </p>
     *            <p>
     *            Valid metric filter keys: <code>INITIATION_METHOD</code>,
     *            <code>DISCONNECT_REASON</code>. These are the same values as
     *            the <code>InitiationMethod</code> and
     *            <code>DisconnectReason</code> in the contact record. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/ctr-data-model.html#ctr-ContactTraceRecord"
     *            >ContactTraceRecord</a> in the <i>Amazon Connect
     *            Administrator's Guide</i>.
     *            </p>
     */
    public void setMetricFilterKey(String metricFilterKey) {
        this.metricFilterKey = metricFilterKey;
    }

    /**
     * <p>
     * The key to use for filtering data.
     * </p>
     * <p>
     * Valid metric filter keys: <code>INITIATION_METHOD</code>,
     * <code>DISCONNECT_REASON</code>. These are the same values as the
     * <code>InitiationMethod</code> and <code>DisconnectReason</code> in the
     * contact record. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/ctr-data-model.html#ctr-ContactTraceRecord"
     * >ContactTraceRecord</a> in the <i>Amazon Connect Administrator's
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricFilterKey <p>
     *            The key to use for filtering data.
     *            </p>
     *            <p>
     *            Valid metric filter keys: <code>INITIATION_METHOD</code>,
     *            <code>DISCONNECT_REASON</code>. These are the same values as
     *            the <code>InitiationMethod</code> and
     *            <code>DisconnectReason</code> in the contact record. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/ctr-data-model.html#ctr-ContactTraceRecord"
     *            >ContactTraceRecord</a> in the <i>Amazon Connect
     *            Administrator's Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricFilterV2 withMetricFilterKey(String metricFilterKey) {
        this.metricFilterKey = metricFilterKey;
        return this;
    }

    /**
     * <p>
     * The values to use for filtering data.
     * </p>
     * <p>
     * Valid metric filter values for <code>INITIATION_METHOD</code>:
     * <code>INBOUND</code> | <code>OUTBOUND</code> | <code>TRANSFER</code> |
     * <code>QUEUE_TRANSFER</code> | <code>CALLBACK</code> | <code>API</code>
     * </p>
     * <p>
     * Valid metric filter values for <code>DISCONNECT_REASON</code>:
     * <code>CUSTOMER_DISCONNECT</code> | <code>AGENT_DISCONNECT</code> |
     * <code>THIRD_PARTY_DISCONNECT</code> | <code>TELECOM_PROBLEM</code> |
     * <code>BARGED</code> | <code>CONTACT_FLOW_DISCONNECT</code> |
     * <code>OTHER</code> | <code>EXPIRED</code> | <code>API</code>
     * </p>
     *
     * @return <p>
     *         The values to use for filtering data.
     *         </p>
     *         <p>
     *         Valid metric filter values for <code>INITIATION_METHOD</code>:
     *         <code>INBOUND</code> | <code>OUTBOUND</code> |
     *         <code>TRANSFER</code> | <code>QUEUE_TRANSFER</code> |
     *         <code>CALLBACK</code> | <code>API</code>
     *         </p>
     *         <p>
     *         Valid metric filter values for <code>DISCONNECT_REASON</code>:
     *         <code>CUSTOMER_DISCONNECT</code> | <code>AGENT_DISCONNECT</code>
     *         | <code>THIRD_PARTY_DISCONNECT</code> |
     *         <code>TELECOM_PROBLEM</code> | <code>BARGED</code> |
     *         <code>CONTACT_FLOW_DISCONNECT</code> | <code>OTHER</code> |
     *         <code>EXPIRED</code> | <code>API</code>
     *         </p>
     */
    public java.util.List<String> getMetricFilterValues() {
        return metricFilterValues;
    }

    /**
     * <p>
     * The values to use for filtering data.
     * </p>
     * <p>
     * Valid metric filter values for <code>INITIATION_METHOD</code>:
     * <code>INBOUND</code> | <code>OUTBOUND</code> | <code>TRANSFER</code> |
     * <code>QUEUE_TRANSFER</code> | <code>CALLBACK</code> | <code>API</code>
     * </p>
     * <p>
     * Valid metric filter values for <code>DISCONNECT_REASON</code>:
     * <code>CUSTOMER_DISCONNECT</code> | <code>AGENT_DISCONNECT</code> |
     * <code>THIRD_PARTY_DISCONNECT</code> | <code>TELECOM_PROBLEM</code> |
     * <code>BARGED</code> | <code>CONTACT_FLOW_DISCONNECT</code> |
     * <code>OTHER</code> | <code>EXPIRED</code> | <code>API</code>
     * </p>
     *
     * @param metricFilterValues <p>
     *            The values to use for filtering data.
     *            </p>
     *            <p>
     *            Valid metric filter values for <code>INITIATION_METHOD</code>:
     *            <code>INBOUND</code> | <code>OUTBOUND</code> |
     *            <code>TRANSFER</code> | <code>QUEUE_TRANSFER</code> |
     *            <code>CALLBACK</code> | <code>API</code>
     *            </p>
     *            <p>
     *            Valid metric filter values for <code>DISCONNECT_REASON</code>:
     *            <code>CUSTOMER_DISCONNECT</code> |
     *            <code>AGENT_DISCONNECT</code> |
     *            <code>THIRD_PARTY_DISCONNECT</code> |
     *            <code>TELECOM_PROBLEM</code> | <code>BARGED</code> |
     *            <code>CONTACT_FLOW_DISCONNECT</code> | <code>OTHER</code> |
     *            <code>EXPIRED</code> | <code>API</code>
     *            </p>
     */
    public void setMetricFilterValues(java.util.Collection<String> metricFilterValues) {
        if (metricFilterValues == null) {
            this.metricFilterValues = null;
            return;
        }

        this.metricFilterValues = new java.util.ArrayList<String>(metricFilterValues);
    }

    /**
     * <p>
     * The values to use for filtering data.
     * </p>
     * <p>
     * Valid metric filter values for <code>INITIATION_METHOD</code>:
     * <code>INBOUND</code> | <code>OUTBOUND</code> | <code>TRANSFER</code> |
     * <code>QUEUE_TRANSFER</code> | <code>CALLBACK</code> | <code>API</code>
     * </p>
     * <p>
     * Valid metric filter values for <code>DISCONNECT_REASON</code>:
     * <code>CUSTOMER_DISCONNECT</code> | <code>AGENT_DISCONNECT</code> |
     * <code>THIRD_PARTY_DISCONNECT</code> | <code>TELECOM_PROBLEM</code> |
     * <code>BARGED</code> | <code>CONTACT_FLOW_DISCONNECT</code> |
     * <code>OTHER</code> | <code>EXPIRED</code> | <code>API</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricFilterValues <p>
     *            The values to use for filtering data.
     *            </p>
     *            <p>
     *            Valid metric filter values for <code>INITIATION_METHOD</code>:
     *            <code>INBOUND</code> | <code>OUTBOUND</code> |
     *            <code>TRANSFER</code> | <code>QUEUE_TRANSFER</code> |
     *            <code>CALLBACK</code> | <code>API</code>
     *            </p>
     *            <p>
     *            Valid metric filter values for <code>DISCONNECT_REASON</code>:
     *            <code>CUSTOMER_DISCONNECT</code> |
     *            <code>AGENT_DISCONNECT</code> |
     *            <code>THIRD_PARTY_DISCONNECT</code> |
     *            <code>TELECOM_PROBLEM</code> | <code>BARGED</code> |
     *            <code>CONTACT_FLOW_DISCONNECT</code> | <code>OTHER</code> |
     *            <code>EXPIRED</code> | <code>API</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricFilterV2 withMetricFilterValues(String... metricFilterValues) {
        if (getMetricFilterValues() == null) {
            this.metricFilterValues = new java.util.ArrayList<String>(metricFilterValues.length);
        }
        for (String value : metricFilterValues) {
            this.metricFilterValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The values to use for filtering data.
     * </p>
     * <p>
     * Valid metric filter values for <code>INITIATION_METHOD</code>:
     * <code>INBOUND</code> | <code>OUTBOUND</code> | <code>TRANSFER</code> |
     * <code>QUEUE_TRANSFER</code> | <code>CALLBACK</code> | <code>API</code>
     * </p>
     * <p>
     * Valid metric filter values for <code>DISCONNECT_REASON</code>:
     * <code>CUSTOMER_DISCONNECT</code> | <code>AGENT_DISCONNECT</code> |
     * <code>THIRD_PARTY_DISCONNECT</code> | <code>TELECOM_PROBLEM</code> |
     * <code>BARGED</code> | <code>CONTACT_FLOW_DISCONNECT</code> |
     * <code>OTHER</code> | <code>EXPIRED</code> | <code>API</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricFilterValues <p>
     *            The values to use for filtering data.
     *            </p>
     *            <p>
     *            Valid metric filter values for <code>INITIATION_METHOD</code>:
     *            <code>INBOUND</code> | <code>OUTBOUND</code> |
     *            <code>TRANSFER</code> | <code>QUEUE_TRANSFER</code> |
     *            <code>CALLBACK</code> | <code>API</code>
     *            </p>
     *            <p>
     *            Valid metric filter values for <code>DISCONNECT_REASON</code>:
     *            <code>CUSTOMER_DISCONNECT</code> |
     *            <code>AGENT_DISCONNECT</code> |
     *            <code>THIRD_PARTY_DISCONNECT</code> |
     *            <code>TELECOM_PROBLEM</code> | <code>BARGED</code> |
     *            <code>CONTACT_FLOW_DISCONNECT</code> | <code>OTHER</code> |
     *            <code>EXPIRED</code> | <code>API</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricFilterV2 withMetricFilterValues(java.util.Collection<String> metricFilterValues) {
        setMetricFilterValues(metricFilterValues);
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
        if (getMetricFilterKey() != null)
            sb.append("MetricFilterKey: " + getMetricFilterKey() + ",");
        if (getMetricFilterValues() != null)
            sb.append("MetricFilterValues: " + getMetricFilterValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMetricFilterKey() == null) ? 0 : getMetricFilterKey().hashCode());
        hashCode = prime * hashCode
                + ((getMetricFilterValues() == null) ? 0 : getMetricFilterValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricFilterV2 == false)
            return false;
        MetricFilterV2 other = (MetricFilterV2) obj;

        if (other.getMetricFilterKey() == null ^ this.getMetricFilterKey() == null)
            return false;
        if (other.getMetricFilterKey() != null
                && other.getMetricFilterKey().equals(this.getMetricFilterKey()) == false)
            return false;
        if (other.getMetricFilterValues() == null ^ this.getMetricFilterValues() == null)
            return false;
        if (other.getMetricFilterValues() != null
                && other.getMetricFilterValues().equals(this.getMetricFilterValues()) == false)
            return false;
        return true;
    }
}
