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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes the specified tags from the user. For more information about tagging,
 * see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">
 * Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
 * </p>
 */
public class UntagUserRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the IAM user from which you want to remove tags.
     * </p>
     * <p>
     * This parameter accepts (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consist of upper and lowercase alphanumeric characters
     * with no spaces. You can also include any of the following characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * <p>
     * A list of key names as a simple array of strings. The tags with matching
     * keys are removed from the specified user.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * The name of the IAM user from which you want to remove tags.
     * </p>
     * <p>
     * This parameter accepts (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consist of upper and lowercase alphanumeric characters
     * with no spaces. You can also include any of the following characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the IAM user from which you want to remove tags.
     *         </p>
     *         <p>
     *         This parameter accepts (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters that consist of upper and lowercase
     *         alphanumeric characters with no spaces. You can also include any
     *         of the following characters: =,.@-
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The name of the IAM user from which you want to remove tags.
     * </p>
     * <p>
     * This parameter accepts (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consist of upper and lowercase alphanumeric characters
     * with no spaces. You can also include any of the following characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the IAM user from which you want to remove tags.
     *            </p>
     *            <p>
     *            This parameter accepts (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters that consist of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: =,.@-
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the IAM user from which you want to remove tags.
     * </p>
     * <p>
     * This parameter accepts (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consist of upper and lowercase alphanumeric characters
     * with no spaces. You can also include any of the following characters: =,.@-
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the IAM user from which you want to remove tags.
     *            </p>
     *            <p>
     *            This parameter accepts (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters that consist of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: =,.@-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagUserRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * A list of key names as a simple array of strings. The tags with matching
     * keys are removed from the specified user.
     * </p>
     *
     * @return <p>
     *         A list of key names as a simple array of strings. The tags with
     *         matching keys are removed from the specified user.
     *         </p>
     */
    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * A list of key names as a simple array of strings. The tags with matching
     * keys are removed from the specified user.
     * </p>
     *
     * @param tagKeys <p>
     *            A list of key names as a simple array of strings. The tags
     *            with matching keys are removed from the specified user.
     *            </p>
     */
    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * <p>
     * A list of key names as a simple array of strings. The tags with matching
     * keys are removed from the specified user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            A list of key names as a simple array of strings. The tags
     *            with matching keys are removed from the specified user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagUserRequest withTagKeys(String... tagKeys) {
        if (getTagKeys() == null) {
            this.tagKeys = new java.util.ArrayList<String>(tagKeys.length);
        }
        for (String value : tagKeys) {
            this.tagKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of key names as a simple array of strings. The tags with matching
     * keys are removed from the specified user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            A list of key names as a simple array of strings. The tags
     *            with matching keys are removed from the specified user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagUserRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getTagKeys() != null)
            sb.append("TagKeys: " + getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagUserRequest == false)
            return false;
        UntagUserRequest other = (UntagUserRequest) obj;

        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }
}
