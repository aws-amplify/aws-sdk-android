/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class UpdateKeyResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the API key resource. Used when you
     * need to specify a resource across all Amazon Web Services.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-9
     * ]+)*)?){2}:([^/].*)?<br/>
     */
    private String keyArn;

    /**
     * <p>
     * The name of the API key resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     */
    private String keyName;

    /**
     * <p>
     * The timestamp for when the API key resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the API key resource. Used when you
     * need to specify a resource across all Amazon Web Services.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-9
     * ]+)*)?){2}:([^/].*)?<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the API key resource. Used
     *         when you need to specify a resource across all Amazon Web
     *         Services.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Format example:
     *         <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getKeyArn() {
        return keyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the API key resource. Used when you
     * need to specify a resource across all Amazon Web Services.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-9
     * ]+)*)?){2}:([^/].*)?<br/>
     *
     * @param keyArn <p>
     *            The Amazon Resource Name (ARN) for the API key resource. Used
     *            when you need to specify a resource across all Amazon Web
     *            Services.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Format example:
     *            <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setKeyArn(String keyArn) {
        this.keyArn = keyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the API key resource. Used when you
     * need to specify a resource across all Amazon Web Services.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-9
     * ]+)*)?){2}:([^/].*)?<br/>
     *
     * @param keyArn <p>
     *            The Amazon Resource Name (ARN) for the API key resource. Used
     *            when you need to specify a resource across all Amazon Web
     *            Services.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Format example:
     *            <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateKeyResult withKeyArn(String keyArn) {
        this.keyArn = keyArn;
        return this;
    }

    /**
     * <p>
     * The name of the API key resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @return <p>
     *         The name of the API key resource.
     *         </p>
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * <p>
     * The name of the API key resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param keyName <p>
     *            The name of the API key resource.
     *            </p>
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the API key resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param keyName <p>
     *            The name of the API key resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateKeyResult withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the API key resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @return <p>
     *         The timestamp for when the API key resource was last updated in
     *         <a href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *         ISO 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *         </p>
     */
    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    /**
     * <p>
     * The timestamp for when the API key resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @param updateTime <p>
     *            The timestamp for when the API key resource was last updated
     *            in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     */
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The timestamp for when the API key resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateTime <p>
     *            The timestamp for when the API key resource was last updated
     *            in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateKeyResult withUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
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
        if (getKeyArn() != null)
            sb.append("KeyArn: " + getKeyArn() + ",");
        if (getKeyName() != null)
            sb.append("KeyName: " + getKeyName() + ",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: " + getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyArn() == null) ? 0 : getKeyArn().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateKeyResult == false)
            return false;
        UpdateKeyResult other = (UpdateKeyResult) obj;

        if (other.getKeyArn() == null ^ this.getKeyArn() == null)
            return false;
        if (other.getKeyArn() != null && other.getKeyArn().equals(this.getKeyArn()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null
                && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }
}
