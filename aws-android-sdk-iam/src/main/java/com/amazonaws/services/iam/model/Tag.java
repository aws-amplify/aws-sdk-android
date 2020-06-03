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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * A structure that represents user-provided metadata that can be associated
 * with a resource such as an IAM user or role. For more information about
 * tagging, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging
 * IAM Identities</a> in the <i>IAM User Guide</i>.
 * </p>
 */
public class Tag implements Serializable {
    /**
     * <p>
     * The key name that can be used to look up or retrieve the associated
     * value. For example, <code>Department</code> or <code>Cost Center</code>
     * are common choices.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{Z}\p{N}_.:/=+\-@]+<br/>
     */
    private String key;

    /**
     * <p>
     * The value associated with this tag. For example, tags with a key name of
     * <code>Department</code> could have values such as
     * <code>Human Resources</code>, <code>Accounting</code>, and
     * <code>Support</code>. Tags with a key name of <code>Cost Center</code>
     * might have values that consist of the number associated with the
     * different cost centers in your company. Typically, many resources have
     * tags with the same key name but with different values.
     * </p>
     * <note>
     * <p>
     * AWS always interprets the tag <code>Value</code> as a single string. If
     * you need to store an array, you can store comma-separated values in the
     * string. However, you must interpret the value in your code.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\p{L}\p{Z}\p{N}_.:/=+\-@]*<br/>
     */
    private String value;

    /**
     * <p>
     * The key name that can be used to look up or retrieve the associated
     * value. For example, <code>Department</code> or <code>Cost Center</code>
     * are common choices.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{Z}\p{N}_.:/=+\-@]+<br/>
     *
     * @return <p>
     *         The key name that can be used to look up or retrieve the
     *         associated value. For example, <code>Department</code> or
     *         <code>Cost Center</code> are common choices.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The key name that can be used to look up or retrieve the associated
     * value. For example, <code>Department</code> or <code>Cost Center</code>
     * are common choices.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{Z}\p{N}_.:/=+\-@]+<br/>
     *
     * @param key <p>
     *            The key name that can be used to look up or retrieve the
     *            associated value. For example, <code>Department</code> or
     *            <code>Cost Center</code> are common choices.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key name that can be used to look up or retrieve the associated
     * value. For example, <code>Department</code> or <code>Cost Center</code>
     * are common choices.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{Z}\p{N}_.:/=+\-@]+<br/>
     *
     * @param key <p>
     *            The key name that can be used to look up or retrieve the
     *            associated value. For example, <code>Department</code> or
     *            <code>Cost Center</code> are common choices.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tag withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The value associated with this tag. For example, tags with a key name of
     * <code>Department</code> could have values such as
     * <code>Human Resources</code>, <code>Accounting</code>, and
     * <code>Support</code>. Tags with a key name of <code>Cost Center</code>
     * might have values that consist of the number associated with the
     * different cost centers in your company. Typically, many resources have
     * tags with the same key name but with different values.
     * </p>
     * <note>
     * <p>
     * AWS always interprets the tag <code>Value</code> as a single string. If
     * you need to store an array, you can store comma-separated values in the
     * string. However, you must interpret the value in your code.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\p{L}\p{Z}\p{N}_.:/=+\-@]*<br/>
     *
     * @return <p>
     *         The value associated with this tag. For example, tags with a key
     *         name of <code>Department</code> could have values such as
     *         <code>Human Resources</code>, <code>Accounting</code>, and
     *         <code>Support</code>. Tags with a key name of
     *         <code>Cost Center</code> might have values that consist of the
     *         number associated with the different cost centers in your
     *         company. Typically, many resources have tags with the same key
     *         name but with different values.
     *         </p>
     *         <note>
     *         <p>
     *         AWS always interprets the tag <code>Value</code> as a single
     *         string. If you need to store an array, you can store
     *         comma-separated values in the string. However, you must interpret
     *         the value in your code.
     *         </p>
     *         </note>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value associated with this tag. For example, tags with a key name of
     * <code>Department</code> could have values such as
     * <code>Human Resources</code>, <code>Accounting</code>, and
     * <code>Support</code>. Tags with a key name of <code>Cost Center</code>
     * might have values that consist of the number associated with the
     * different cost centers in your company. Typically, many resources have
     * tags with the same key name but with different values.
     * </p>
     * <note>
     * <p>
     * AWS always interprets the tag <code>Value</code> as a single string. If
     * you need to store an array, you can store comma-separated values in the
     * string. However, you must interpret the value in your code.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\p{L}\p{Z}\p{N}_.:/=+\-@]*<br/>
     *
     * @param value <p>
     *            The value associated with this tag. For example, tags with a
     *            key name of <code>Department</code> could have values such as
     *            <code>Human Resources</code>, <code>Accounting</code>, and
     *            <code>Support</code>. Tags with a key name of
     *            <code>Cost Center</code> might have values that consist of the
     *            number associated with the different cost centers in your
     *            company. Typically, many resources have tags with the same key
     *            name but with different values.
     *            </p>
     *            <note>
     *            <p>
     *            AWS always interprets the tag <code>Value</code> as a single
     *            string. If you need to store an array, you can store
     *            comma-separated values in the string. However, you must
     *            interpret the value in your code.
     *            </p>
     *            </note>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value associated with this tag. For example, tags with a key name of
     * <code>Department</code> could have values such as
     * <code>Human Resources</code>, <code>Accounting</code>, and
     * <code>Support</code>. Tags with a key name of <code>Cost Center</code>
     * might have values that consist of the number associated with the
     * different cost centers in your company. Typically, many resources have
     * tags with the same key name but with different values.
     * </p>
     * <note>
     * <p>
     * AWS always interprets the tag <code>Value</code> as a single string. If
     * you need to store an array, you can store comma-separated values in the
     * string. However, you must interpret the value in your code.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\p{L}\p{Z}\p{N}_.:/=+\-@]*<br/>
     *
     * @param value <p>
     *            The value associated with this tag. For example, tags with a
     *            key name of <code>Department</code> could have values such as
     *            <code>Human Resources</code>, <code>Accounting</code>, and
     *            <code>Support</code>. Tags with a key name of
     *            <code>Cost Center</code> might have values that consist of the
     *            number associated with the different cost centers in your
     *            company. Typically, many resources have tags with the same key
     *            name but with different values.
     *            </p>
     *            <note>
     *            <p>
     *            AWS always interprets the tag <code>Value</code> as a single
     *            string. If you need to store an array, you can store
     *            comma-separated values in the string. However, you must
     *            interpret the value in your code.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tag withValue(String value) {
        this.value = value;
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
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tag == false)
            return false;
        Tag other = (Tag) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
