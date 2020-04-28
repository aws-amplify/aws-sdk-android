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
 * One or more filters. Use a filter to return a more specific list of
 * documents.
 * </p>
 * <p>
 * For keys, you can specify one or more tags that have been applied to a
 * document.
 * </p>
 * <p>
 * Other valid values include Owner, Name, PlatformTypes, and DocumentType.
 * </p>
 * <p>
 * Note that only one Owner can be specified in a request. For example:
 * <code>Key=Owner,Values=Self</code>.
 * </p>
 * <p>
 * If you use Name as a key, you can use a name prefix to return a list of
 * documents. For example, in the AWS CLI, to return a list of all documents
 * that begin with <code>Te</code>, run the following command:
 * </p>
 * <p>
 * <code>aws ssm list-documents --filters Key=Name,Values=Te</code>
 * </p>
 * <p>
 * If you specify more than two keys, only documents that are identified by all
 * the tags are returned in the results. If you specify more than two values for
 * a key, documents that are identified by any of the values are returned in the
 * results.
 * </p>
 * <p>
 * To specify a custom key and value pair, use the format
 * <code>Key=tag:tagName,Values=valueName</code>.
 * </p>
 * <p>
 * For example, if you created a Key called region and are using the AWS CLI to
 * call the <code>list-documents</code> command:
 * </p>
 * <p>
 * <code>aws ssm list-documents --filters Key=tag:region,Values=east,west Key=Owner,Values=Self</code>
 * </p>
 */
public class DocumentKeyValuesFilter implements Serializable {
    /**
     * <p>
     * The name of the filter key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String key;

    /**
     * <p>
     * The value for the filter key.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The name of the filter key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
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
     * <b>Length: </b>1 - 128<br/>
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
     * <b>Length: </b>1 - 128<br/>
     *
     * @param key <p>
     *            The name of the filter key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentKeyValuesFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     *
     * @return <p>
     *         The value for the filter key.
     *         </p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     *
     * @param values <p>
     *            The value for the filter key.
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
     * The value for the filter key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The value for the filter key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentKeyValuesFilter withValues(String... values) {
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
     * The value for the filter key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The value for the filter key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentKeyValuesFilter withValues(java.util.Collection<String> values) {
        setValues(values);
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
            sb.append("Values: " + getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentKeyValuesFilter == false)
            return false;
        DocumentKeyValuesFilter other = (DocumentKeyValuesFilter) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }
}
