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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

/**
 * <p>
 * A label that you assign to a resource. In Athena, a resource can be a
 * workgroup or data catalog. Each tag consists of a key and an optional value,
 * both of which you define. For example, you can use tags to categorize Athena
 * workgroups or data catalogs by purpose, owner, or environment. Use a
 * consistent set of tag keys to make it easier to search and filter workgroups
 * or data catalogs in your account. For best practices, see <a href=
 * "https://aws.amazon.com/answers/account-management/aws-tagging-strategies/"
 * >Tagging Best Practices</a>. Tag keys can be from 1 to 128 UTF-8 Unicode
 * characters, and tag values can be from 0 to 256 UTF-8 Unicode characters.
 * Tags can use letters and numbers representable in UTF-8, and the following
 * characters: + - = . _ : / @. Tag keys and values are case-sensitive. Tag keys
 * must be unique per resource. If you specify more than one tag, separate them
 * by commas.
 * </p>
 */
public class Tag implements Serializable {
    /**
     * <p>
     * A tag key. The tag key length is from 1 to 128 Unicode characters in
     * UTF-8. You can use letters and numbers representable in UTF-8, and the
     * following characters: + - = . _ : / @. Tag keys are case-sensitive and
     * must be unique per resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String key;

    /**
     * <p>
     * A tag value. The tag value length is from 0 to 256 Unicode characters in
     * UTF-8. You can use letters and numbers representable in UTF-8, and the
     * following characters: + - = . _ : / @. Tag values are case-sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String value;

    /**
     * <p>
     * A tag key. The tag key length is from 1 to 128 Unicode characters in
     * UTF-8. You can use letters and numbers representable in UTF-8, and the
     * following characters: + - = . _ : / @. Tag keys are case-sensitive and
     * must be unique per resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         A tag key. The tag key length is from 1 to 128 Unicode characters
     *         in UTF-8. You can use letters and numbers representable in UTF-8,
     *         and the following characters: + - = . _ : / @. Tag keys are
     *         case-sensitive and must be unique per resource.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * A tag key. The tag key length is from 1 to 128 Unicode characters in
     * UTF-8. You can use letters and numbers representable in UTF-8, and the
     * following characters: + - = . _ : / @. Tag keys are case-sensitive and
     * must be unique per resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param key <p>
     *            A tag key. The tag key length is from 1 to 128 Unicode
     *            characters in UTF-8. You can use letters and numbers
     *            representable in UTF-8, and the following characters: + - = .
     *            _ : / @. Tag keys are case-sensitive and must be unique per
     *            resource.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * A tag key. The tag key length is from 1 to 128 Unicode characters in
     * UTF-8. You can use letters and numbers representable in UTF-8, and the
     * following characters: + - = . _ : / @. Tag keys are case-sensitive and
     * must be unique per resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param key <p>
     *            A tag key. The tag key length is from 1 to 128 Unicode
     *            characters in UTF-8. You can use letters and numbers
     *            representable in UTF-8, and the following characters: + - = .
     *            _ : / @. Tag keys are case-sensitive and must be unique per
     *            resource.
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
     * A tag value. The tag value length is from 0 to 256 Unicode characters in
     * UTF-8. You can use letters and numbers representable in UTF-8, and the
     * following characters: + - = . _ : / @. Tag values are case-sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return <p>
     *         A tag value. The tag value length is from 0 to 256 Unicode
     *         characters in UTF-8. You can use letters and numbers
     *         representable in UTF-8, and the following characters: + - = . _ :
     *         / @. Tag values are case-sensitive.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * A tag value. The tag value length is from 0 to 256 Unicode characters in
     * UTF-8. You can use letters and numbers representable in UTF-8, and the
     * following characters: + - = . _ : / @. Tag values are case-sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param value <p>
     *            A tag value. The tag value length is from 0 to 256 Unicode
     *            characters in UTF-8. You can use letters and numbers
     *            representable in UTF-8, and the following characters: + - = .
     *            _ : / @. Tag values are case-sensitive.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A tag value. The tag value length is from 0 to 256 Unicode characters in
     * UTF-8. You can use letters and numbers representable in UTF-8, and the
     * following characters: + - = . _ : / @. Tag values are case-sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param value <p>
     *            A tag value. The tag value length is from 0 to 256 Unicode
     *            characters in UTF-8. You can use letters and numbers
     *            representable in UTF-8, and the following characters: + - = .
     *            _ : / @. Tag values are case-sensitive.
     *            </p>
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
