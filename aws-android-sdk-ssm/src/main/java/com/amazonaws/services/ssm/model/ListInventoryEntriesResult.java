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

public class ListInventoryEntriesResult implements Serializable {
    /**
     * <p>
     * The type of inventory item returned by the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     */
    private String typeName;

    /**
     * <p>
     * The instance ID targeted by the request to query inventory information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The inventory schema version used by the instance(s).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{1,6})(\.[0-9]{1,6})$<br/>
     */
    private String schemaVersion;

    /**
     * <p>
     * The time that inventory information was collected for the instance(s).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(20)[0-9][0-9]-(0[1-9]|1[012])-([12][0-9]|3[01]|0[1-9])(T
     * )(2[0-3]|[0-1][0-9])(:[0-5][0-9])(:[0-5][0-9])(Z)$<br/>
     */
    private String captureTime;

    /**
     * <p>
     * A list of inventory items on the instance(s).
     * </p>
     */
    private java.util.List<java.util.Map<String, String>> entries;

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The type of inventory item returned by the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @return <p>
     *         The type of inventory item returned by the request.
     *         </p>
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * <p>
     * The type of inventory item returned by the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @param typeName <p>
     *            The type of inventory item returned by the request.
     *            </p>
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The type of inventory item returned by the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @param typeName <p>
     *            The type of inventory item returned by the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInventoryEntriesResult withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * <p>
     * The instance ID targeted by the request to query inventory information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @return <p>
     *         The instance ID targeted by the request to query inventory
     *         information.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The instance ID targeted by the request to query inventory information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>
     *            The instance ID targeted by the request to query inventory
     *            information.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID targeted by the request to query inventory information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>
     *            The instance ID targeted by the request to query inventory
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInventoryEntriesResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The inventory schema version used by the instance(s).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{1,6})(\.[0-9]{1,6})$<br/>
     *
     * @return <p>
     *         The inventory schema version used by the instance(s).
     *         </p>
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * <p>
     * The inventory schema version used by the instance(s).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{1,6})(\.[0-9]{1,6})$<br/>
     *
     * @param schemaVersion <p>
     *            The inventory schema version used by the instance(s).
     *            </p>
     */
    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The inventory schema version used by the instance(s).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{1,6})(\.[0-9]{1,6})$<br/>
     *
     * @param schemaVersion <p>
     *            The inventory schema version used by the instance(s).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInventoryEntriesResult withSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }

    /**
     * <p>
     * The time that inventory information was collected for the instance(s).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(20)[0-9][0-9]-(0[1-9]|1[012])-([12][0-9]|3[01]|0[1-9])(T
     * )(2[0-3]|[0-1][0-9])(:[0-5][0-9])(:[0-5][0-9])(Z)$<br/>
     *
     * @return <p>
     *         The time that inventory information was collected for the
     *         instance(s).
     *         </p>
     */
    public String getCaptureTime() {
        return captureTime;
    }

    /**
     * <p>
     * The time that inventory information was collected for the instance(s).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(20)[0-9][0-9]-(0[1-9]|1[012])-([12][0-9]|3[01]|0[1-9])(T
     * )(2[0-3]|[0-1][0-9])(:[0-5][0-9])(:[0-5][0-9])(Z)$<br/>
     *
     * @param captureTime <p>
     *            The time that inventory information was collected for the
     *            instance(s).
     *            </p>
     */
    public void setCaptureTime(String captureTime) {
        this.captureTime = captureTime;
    }

    /**
     * <p>
     * The time that inventory information was collected for the instance(s).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(20)[0-9][0-9]-(0[1-9]|1[012])-([12][0-9]|3[01]|0[1-9])(T
     * )(2[0-3]|[0-1][0-9])(:[0-5][0-9])(:[0-5][0-9])(Z)$<br/>
     *
     * @param captureTime <p>
     *            The time that inventory information was collected for the
     *            instance(s).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInventoryEntriesResult withCaptureTime(String captureTime) {
        this.captureTime = captureTime;
        return this;
    }

    /**
     * <p>
     * A list of inventory items on the instance(s).
     * </p>
     *
     * @return <p>
     *         A list of inventory items on the instance(s).
     *         </p>
     */
    public java.util.List<java.util.Map<String, String>> getEntries() {
        return entries;
    }

    /**
     * <p>
     * A list of inventory items on the instance(s).
     * </p>
     *
     * @param entries <p>
     *            A list of inventory items on the instance(s).
     *            </p>
     */
    public void setEntries(java.util.Collection<java.util.Map<String, String>> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<java.util.Map<String, String>>(entries);
    }

    /**
     * <p>
     * A list of inventory items on the instance(s).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entries <p>
     *            A list of inventory items on the instance(s).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInventoryEntriesResult withEntries(java.util.Map<String, String>... entries) {
        if (getEntries() == null) {
            this.entries = new java.util.ArrayList<java.util.Map<String, String>>(entries.length);
        }
        for (java.util.Map<String, String> value : entries) {
            this.entries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of inventory items on the instance(s).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entries <p>
     *            A list of inventory items on the instance(s).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInventoryEntriesResult withEntries(
            java.util.Collection<java.util.Map<String, String>> entries) {
        setEntries(entries);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     *
     * @return <p>
     *         The token to use when requesting the next set of items. If there
     *         are no additional items to return, the string is empty.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items. If
     *            there are no additional items to return, the string is empty.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items. If
     *            there are no additional items to return, the string is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInventoryEntriesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getTypeName() != null)
            sb.append("TypeName: " + getTypeName() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: " + getSchemaVersion() + ",");
        if (getCaptureTime() != null)
            sb.append("CaptureTime: " + getCaptureTime() + ",");
        if (getEntries() != null)
            sb.append("Entries: " + getEntries() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode
                + ((getCaptureTime() == null) ? 0 : getCaptureTime().hashCode());
        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInventoryEntriesResult == false)
            return false;
        ListInventoryEntriesResult other = (ListInventoryEntriesResult) obj;

        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null
                && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        if (other.getCaptureTime() == null ^ this.getCaptureTime() == null)
            return false;
        if (other.getCaptureTime() != null
                && other.getCaptureTime().equals(this.getCaptureTime()) == false)
            return false;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
