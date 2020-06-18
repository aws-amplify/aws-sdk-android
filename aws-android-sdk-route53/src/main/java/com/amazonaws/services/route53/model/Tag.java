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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains information about a tag that you want to add or
 * edit for the specified health check or hosted zone.
 * </p>
 */
public class Tag implements Serializable {
    /**
     * <p>
     * The value of <code>Key</code> depends on the operation that you want to
     * perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Add a tag to a health check or hosted zone</b>: <code>Key</code> is
     * the name that you want to give the new tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Edit a tag</b>: <code>Key</code> is the name of the tag that you want
     * to change the <code>Value</code> for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> Delete a key</b>: <code>Key</code> is the name of the tag you want to
     * remove.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Give a name to a health check</b>: Edit the default <code>Name</code>
     * tag. In the Amazon Route 53 console, the list of your health checks
     * includes a <b>Name</b> column that lets you see the name that you've
     * given to each health check.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     */
    private String key;

    /**
     * <p>
     * The value of <code>Value</code> depends on the operation that you want to
     * perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Add a tag to a health check or hosted zone</b>: <code>Value</code> is
     * the value that you want to give the new tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Edit a tag</b>: <code>Value</code> is the new value that you want to
     * assign the tag.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String value;

    /**
     * <p>
     * The value of <code>Key</code> depends on the operation that you want to
     * perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Add a tag to a health check or hosted zone</b>: <code>Key</code> is
     * the name that you want to give the new tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Edit a tag</b>: <code>Key</code> is the name of the tag that you want
     * to change the <code>Value</code> for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> Delete a key</b>: <code>Key</code> is the name of the tag you want to
     * remove.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Give a name to a health check</b>: Edit the default <code>Name</code>
     * tag. In the Amazon Route 53 console, the list of your health checks
     * includes a <b>Name</b> column that lets you see the name that you've
     * given to each health check.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @return <p>
     *         The value of <code>Key</code> depends on the operation that you
     *         want to perform:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Add a tag to a health check or hosted zone</b>:
     *         <code>Key</code> is the name that you want to give the new tag.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Edit a tag</b>: <code>Key</code> is the name of the tag that
     *         you want to change the <code>Value</code> for.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> Delete a key</b>: <code>Key</code> is the name of the tag you
     *         want to remove.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Give a name to a health check</b>: Edit the default
     *         <code>Name</code> tag. In the Amazon Route 53 console, the list
     *         of your health checks includes a <b>Name</b> column that lets you
     *         see the name that you've given to each health check.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The value of <code>Key</code> depends on the operation that you want to
     * perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Add a tag to a health check or hosted zone</b>: <code>Key</code> is
     * the name that you want to give the new tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Edit a tag</b>: <code>Key</code> is the name of the tag that you want
     * to change the <code>Value</code> for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> Delete a key</b>: <code>Key</code> is the name of the tag you want to
     * remove.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Give a name to a health check</b>: Edit the default <code>Name</code>
     * tag. In the Amazon Route 53 console, the list of your health checks
     * includes a <b>Name</b> column that lets you see the name that you've
     * given to each health check.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param key <p>
     *            The value of <code>Key</code> depends on the operation that
     *            you want to perform:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Add a tag to a health check or hosted zone</b>:
     *            <code>Key</code> is the name that you want to give the new
     *            tag.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Edit a tag</b>: <code>Key</code> is the name of the tag
     *            that you want to change the <code>Value</code> for.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> Delete a key</b>: <code>Key</code> is the name of the tag
     *            you want to remove.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Give a name to a health check</b>: Edit the default
     *            <code>Name</code> tag. In the Amazon Route 53 console, the
     *            list of your health checks includes a <b>Name</b> column that
     *            lets you see the name that you've given to each health check.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The value of <code>Key</code> depends on the operation that you want to
     * perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Add a tag to a health check or hosted zone</b>: <code>Key</code> is
     * the name that you want to give the new tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Edit a tag</b>: <code>Key</code> is the name of the tag that you want
     * to change the <code>Value</code> for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> Delete a key</b>: <code>Key</code> is the name of the tag you want to
     * remove.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Give a name to a health check</b>: Edit the default <code>Name</code>
     * tag. In the Amazon Route 53 console, the list of your health checks
     * includes a <b>Name</b> column that lets you see the name that you've
     * given to each health check.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param key <p>
     *            The value of <code>Key</code> depends on the operation that
     *            you want to perform:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Add a tag to a health check or hosted zone</b>:
     *            <code>Key</code> is the name that you want to give the new
     *            tag.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Edit a tag</b>: <code>Key</code> is the name of the tag
     *            that you want to change the <code>Value</code> for.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> Delete a key</b>: <code>Key</code> is the name of the tag
     *            you want to remove.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Give a name to a health check</b>: Edit the default
     *            <code>Name</code> tag. In the Amazon Route 53 console, the
     *            list of your health checks includes a <b>Name</b> column that
     *            lets you see the name that you've given to each health check.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tag withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The value of <code>Value</code> depends on the operation that you want to
     * perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Add a tag to a health check or hosted zone</b>: <code>Value</code> is
     * the value that you want to give the new tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Edit a tag</b>: <code>Value</code> is the new value that you want to
     * assign the tag.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The value of <code>Value</code> depends on the operation that you
     *         want to perform:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Add a tag to a health check or hosted zone</b>:
     *         <code>Value</code> is the value that you want to give the new
     *         tag.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Edit a tag</b>: <code>Value</code> is the new value that you
     *         want to assign the tag.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of <code>Value</code> depends on the operation that you want to
     * perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Add a tag to a health check or hosted zone</b>: <code>Value</code> is
     * the value that you want to give the new tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Edit a tag</b>: <code>Value</code> is the new value that you want to
     * assign the tag.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param value <p>
     *            The value of <code>Value</code> depends on the operation that
     *            you want to perform:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Add a tag to a health check or hosted zone</b>:
     *            <code>Value</code> is the value that you want to give the new
     *            tag.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Edit a tag</b>: <code>Value</code> is the new value that
     *            you want to assign the tag.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of <code>Value</code> depends on the operation that you want to
     * perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Add a tag to a health check or hosted zone</b>: <code>Value</code> is
     * the value that you want to give the new tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Edit a tag</b>: <code>Value</code> is the new value that you want to
     * assign the tag.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param value <p>
     *            The value of <code>Value</code> depends on the operation that
     *            you want to perform:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Add a tag to a health check or hosted zone</b>:
     *            <code>Value</code> is the value that you want to give the new
     *            tag.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Edit a tag</b>: <code>Value</code> is the new value that
     *            you want to assign the tag.
     *            </p>
     *            </li>
     *            </ul>
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
