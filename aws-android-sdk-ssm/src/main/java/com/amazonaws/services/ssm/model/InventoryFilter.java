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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * One or more filters. Use a filter to return a more specific list of results.
 * </p>
 */
public class InventoryFilter implements Serializable {
    /**
     * <p>
     * The name of the filter key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     */
    private String key;

    /**
     * <p>
     * Inventory filter values. Example: inventory filter where instance IDs are
     * specified as values Key=AWS:InstanceInformation.InstanceId,Values=
     * i-a12b3c4d5e6g, i-1a2b3c4d5e6,Type=Equal
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The type of filter.
     * </p>
     * <note>
     * <p>
     * The <code>Exists</code> filter must be used with aggregators. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-aggregate.html"
     * >Aggregating inventory data</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, NotEqual, BeginWith, LessThan, GreaterThan,
     * Exists
     */
    private String type;

    /**
     * <p>
     * The name of the filter key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @return <p>
     *         The name of the filter key.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The name of the filter key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param key <p>
     *            The name of the filter key.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the filter key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param key <p>
     *            The name of the filter key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * Inventory filter values. Example: inventory filter where instance IDs are
     * specified as values Key=AWS:InstanceInformation.InstanceId,Values=
     * i-a12b3c4d5e6g, i-1a2b3c4d5e6,Type=Equal
     * </p>
     *
     * @return <p>
     *         Inventory filter values. Example: inventory filter where instance
     *         IDs are specified as values
     *         Key=AWS:InstanceInformation.InstanceId,Values= i-a12b3c4d5e6g,
     *         i-1a2b3c4d5e6,Type=Equal
     *         </p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * Inventory filter values. Example: inventory filter where instance IDs are
     * specified as values Key=AWS:InstanceInformation.InstanceId,Values=
     * i-a12b3c4d5e6g, i-1a2b3c4d5e6,Type=Equal
     * </p>
     *
     * @param values <p>
     *            Inventory filter values. Example: inventory filter where
     *            instance IDs are specified as values
     *            Key=AWS:InstanceInformation.InstanceId,Values= i-a12b3c4d5e6g,
     *            i-1a2b3c4d5e6,Type=Equal
     *            </p>
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * Inventory filter values. Example: inventory filter where instance IDs are
     * specified as values Key=AWS:InstanceInformation.InstanceId,Values=
     * i-a12b3c4d5e6g, i-1a2b3c4d5e6,Type=Equal
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            Inventory filter values. Example: inventory filter where
     *            instance IDs are specified as values
     *            Key=AWS:InstanceInformation.InstanceId,Values= i-a12b3c4d5e6g,
     *            i-1a2b3c4d5e6,Type=Equal
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryFilter withValues(String... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<String>(values.length);
        }
        for (String value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Inventory filter values. Example: inventory filter where instance IDs are
     * specified as values Key=AWS:InstanceInformation.InstanceId,Values=
     * i-a12b3c4d5e6g, i-1a2b3c4d5e6,Type=Equal
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            Inventory filter values. Example: inventory filter where
     *            instance IDs are specified as values
     *            Key=AWS:InstanceInformation.InstanceId,Values= i-a12b3c4d5e6g,
     *            i-1a2b3c4d5e6,Type=Equal
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryFilter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The type of filter.
     * </p>
     * <note>
     * <p>
     * The <code>Exists</code> filter must be used with aggregators. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-aggregate.html"
     * >Aggregating inventory data</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, NotEqual, BeginWith, LessThan, GreaterThan,
     * Exists
     *
     * @return <p>
     *         The type of filter.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>Exists</code> filter must be used with aggregators. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-aggregate.html"
     *         >Aggregating inventory data</a> in the <i>AWS Systems Manager
     *         User Guide</i>.
     *         </p>
     *         </note>
     * @see InventoryQueryOperatorType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of filter.
     * </p>
     * <note>
     * <p>
     * The <code>Exists</code> filter must be used with aggregators. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-aggregate.html"
     * >Aggregating inventory data</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, NotEqual, BeginWith, LessThan, GreaterThan,
     * Exists
     *
     * @param type <p>
     *            The type of filter.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>Exists</code> filter must be used with aggregators.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-aggregate.html"
     *            >Aggregating inventory data</a> in the <i>AWS Systems Manager
     *            User Guide</i>.
     *            </p>
     *            </note>
     * @see InventoryQueryOperatorType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of filter.
     * </p>
     * <note>
     * <p>
     * The <code>Exists</code> filter must be used with aggregators. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-aggregate.html"
     * >Aggregating inventory data</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, NotEqual, BeginWith, LessThan, GreaterThan,
     * Exists
     *
     * @param type <p>
     *            The type of filter.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>Exists</code> filter must be used with aggregators.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-aggregate.html"
     *            >Aggregating inventory data</a> in the <i>AWS Systems Manager
     *            User Guide</i>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InventoryQueryOperatorType
     */
    public InventoryFilter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of filter.
     * </p>
     * <note>
     * <p>
     * The <code>Exists</code> filter must be used with aggregators. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-aggregate.html"
     * >Aggregating inventory data</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, NotEqual, BeginWith, LessThan, GreaterThan,
     * Exists
     *
     * @param type <p>
     *            The type of filter.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>Exists</code> filter must be used with aggregators.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-aggregate.html"
     *            >Aggregating inventory data</a> in the <i>AWS Systems Manager
     *            User Guide</i>.
     *            </p>
     *            </note>
     * @see InventoryQueryOperatorType
     */
    public void setType(InventoryQueryOperatorType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of filter.
     * </p>
     * <note>
     * <p>
     * The <code>Exists</code> filter must be used with aggregators. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-aggregate.html"
     * >Aggregating inventory data</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, NotEqual, BeginWith, LessThan, GreaterThan,
     * Exists
     *
     * @param type <p>
     *            The type of filter.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>Exists</code> filter must be used with aggregators.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-aggregate.html"
     *            >Aggregating inventory data</a> in the <i>AWS Systems Manager
     *            User Guide</i>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InventoryQueryOperatorType
     */
    public InventoryFilter withType(InventoryQueryOperatorType type) {
        this.type = type.toString();
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getValues() != null)
            sb.append("Values: " + getValues() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryFilter == false)
            return false;
        InventoryFilter other = (InventoryFilter) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
