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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new version of the bot based on the <code>$LATEST</code> version.
 * If the <code>$LATEST</code> version of this resource hasn't changed since you
 * created the last version, Amazon Lex doesn't create a new version. It returns
 * the last created version.
 * </p>
 * <note>
 * <p>
 * You can update only the <code>$LATEST</code> version of the bot. You can't
 * update the numbered versions that you create with the
 * <code>CreateBotVersion</code> operation.
 * </p>
 * </note>
 * <p>
 * When you create the first version of a bot, Amazon Lex sets the version to 1.
 * Subsequent versions increment by 1. For more information, see
 * <a>versioning-intro</a>.
 * </p>
 * <p>
 * This operation requires permission for the <code>lex:CreateBotVersion</code>
 * action.
 * </p>
 */
public class CreateBotVersionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the bot that you want to create a new version of. The name is
     * case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version of the
     * bot. If you specify a checksum and the <code>$LATEST</code> version of
     * the bot has a different checksum, a
     * <code>PreconditionFailedException</code> exception is returned and Amazon
     * Lex doesn't publish a new version. If you don't specify a checksum,
     * Amazon Lex publishes the <code>$LATEST</code> version.
     * </p>
     */
    private String checksum;

    /**
     * <p>
     * The name of the bot that you want to create a new version of. The name is
     * case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the bot that you want to create a new version of. The
     *         name is case sensitive.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the bot that you want to create a new version of. The name is
     * case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the bot that you want to create a new version of.
     *            The name is case sensitive.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the bot that you want to create a new version of. The name is
     * case sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the bot that you want to create a new version of.
     *            The name is case sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBotVersionRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version of the
     * bot. If you specify a checksum and the <code>$LATEST</code> version of
     * the bot has a different checksum, a
     * <code>PreconditionFailedException</code> exception is returned and Amazon
     * Lex doesn't publish a new version. If you don't specify a checksum,
     * Amazon Lex publishes the <code>$LATEST</code> version.
     * </p>
     *
     * @return <p>
     *         Identifies a specific revision of the <code>$LATEST</code>
     *         version of the bot. If you specify a checksum and the
     *         <code>$LATEST</code> version of the bot has a different checksum,
     *         a <code>PreconditionFailedException</code> exception is returned
     *         and Amazon Lex doesn't publish a new version. If you don't
     *         specify a checksum, Amazon Lex publishes the <code>$LATEST</code>
     *         version.
     *         </p>
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version of the
     * bot. If you specify a checksum and the <code>$LATEST</code> version of
     * the bot has a different checksum, a
     * <code>PreconditionFailedException</code> exception is returned and Amazon
     * Lex doesn't publish a new version. If you don't specify a checksum,
     * Amazon Lex publishes the <code>$LATEST</code> version.
     * </p>
     *
     * @param checksum <p>
     *            Identifies a specific revision of the <code>$LATEST</code>
     *            version of the bot. If you specify a checksum and the
     *            <code>$LATEST</code> version of the bot has a different
     *            checksum, a <code>PreconditionFailedException</code> exception
     *            is returned and Amazon Lex doesn't publish a new version. If
     *            you don't specify a checksum, Amazon Lex publishes the
     *            <code>$LATEST</code> version.
     *            </p>
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version of the
     * bot. If you specify a checksum and the <code>$LATEST</code> version of
     * the bot has a different checksum, a
     * <code>PreconditionFailedException</code> exception is returned and Amazon
     * Lex doesn't publish a new version. If you don't specify a checksum,
     * Amazon Lex publishes the <code>$LATEST</code> version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checksum <p>
     *            Identifies a specific revision of the <code>$LATEST</code>
     *            version of the bot. If you specify a checksum and the
     *            <code>$LATEST</code> version of the bot has a different
     *            checksum, a <code>PreconditionFailedException</code> exception
     *            is returned and Amazon Lex doesn't publish a new version. If
     *            you don't specify a checksum, Amazon Lex publishes the
     *            <code>$LATEST</code> version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBotVersionRequest withChecksum(String checksum) {
        this.checksum = checksum;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getChecksum() != null)
            sb.append("checksum: " + getChecksum());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBotVersionRequest == false)
            return false;
        CreateBotVersionRequest other = (CreateBotVersionRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        return true;
    }
}
