/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration information of an Amazon Lex V2 bot.
 * </p>
 */
public class LexV2Bot implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Lex V2 bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String aliasArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Lex V2 bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon Lex V2 bot.
     *         </p>
     */
    public String getAliasArn() {
        return aliasArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Lex V2 bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param aliasArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon Lex V2 bot.
     *            </p>
     */
    public void setAliasArn(String aliasArn) {
        this.aliasArn = aliasArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Lex V2 bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param aliasArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon Lex V2 bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LexV2Bot withAliasArn(String aliasArn) {
        this.aliasArn = aliasArn;
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
        if (getAliasArn() != null)
            sb.append("AliasArn: " + getAliasArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliasArn() == null) ? 0 : getAliasArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LexV2Bot == false)
            return false;
        LexV2Bot other = (LexV2Bot) obj;

        if (other.getAliasArn() == null ^ this.getAliasArn() == null)
            return false;
        if (other.getAliasArn() != null && other.getAliasArn().equals(this.getAliasArn()) == false)
            return false;
        return true;
    }
}
