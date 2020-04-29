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

package com.amazonaws.services.awswaf.model;

import java.io.Serializable;

public class GetRateBasedRuleManagedKeysResult implements Serializable {
    /**
     * <p>
     * An array of IP addresses that currently are blocked by the specified
     * <a>RateBasedRule</a>.
     * </p>
     */
    private java.util.List<String> managedKeys;

    /**
     * <p>
     * A null value and not currently used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String nextMarker;

    /**
     * <p>
     * An array of IP addresses that currently are blocked by the specified
     * <a>RateBasedRule</a>.
     * </p>
     *
     * @return <p>
     *         An array of IP addresses that currently are blocked by the
     *         specified <a>RateBasedRule</a>.
     *         </p>
     */
    public java.util.List<String> getManagedKeys() {
        return managedKeys;
    }

    /**
     * <p>
     * An array of IP addresses that currently are blocked by the specified
     * <a>RateBasedRule</a>.
     * </p>
     *
     * @param managedKeys <p>
     *            An array of IP addresses that currently are blocked by the
     *            specified <a>RateBasedRule</a>.
     *            </p>
     */
    public void setManagedKeys(java.util.Collection<String> managedKeys) {
        if (managedKeys == null) {
            this.managedKeys = null;
            return;
        }

        this.managedKeys = new java.util.ArrayList<String>(managedKeys);
    }

    /**
     * <p>
     * An array of IP addresses that currently are blocked by the specified
     * <a>RateBasedRule</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param managedKeys <p>
     *            An array of IP addresses that currently are blocked by the
     *            specified <a>RateBasedRule</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRateBasedRuleManagedKeysResult withManagedKeys(String... managedKeys) {
        if (getManagedKeys() == null) {
            this.managedKeys = new java.util.ArrayList<String>(managedKeys.length);
        }
        for (String value : managedKeys) {
            this.managedKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of IP addresses that currently are blocked by the specified
     * <a>RateBasedRule</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param managedKeys <p>
     *            An array of IP addresses that currently are blocked by the
     *            specified <a>RateBasedRule</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRateBasedRuleManagedKeysResult withManagedKeys(
            java.util.Collection<String> managedKeys) {
        setManagedKeys(managedKeys);
        return this;
    }

    /**
     * <p>
     * A null value and not currently used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A null value and not currently used.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * A null value and not currently used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextMarker <p>
     *            A null value and not currently used.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * A null value and not currently used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextMarker <p>
     *            A null value and not currently used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRateBasedRuleManagedKeysResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
        if (getManagedKeys() != null)
            sb.append("ManagedKeys: " + getManagedKeys() + ",");
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getManagedKeys() == null) ? 0 : getManagedKeys().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRateBasedRuleManagedKeysResult == false)
            return false;
        GetRateBasedRuleManagedKeysResult other = (GetRateBasedRuleManagedKeysResult) obj;

        if (other.getManagedKeys() == null ^ this.getManagedKeys() == null)
            return false;
        if (other.getManagedKeys() != null
                && other.getManagedKeys().equals(this.getManagedKeys()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }
}
