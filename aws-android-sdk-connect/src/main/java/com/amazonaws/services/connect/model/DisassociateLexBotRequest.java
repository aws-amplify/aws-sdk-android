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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This API is in preview release for Amazon Connect and is subject to change.
 * </p>
 * <p>
 * Revokes authorization from the specified instance to access the specified
 * Amazon Lex bot.
 * </p>
 */
public class DisassociateLexBotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The name of the Amazon Lex bot. Maximum character limit of 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 50<br/>
     */
    private String botName;

    /**
     * <p>
     * The Region in which the Amazon Lex bot has been created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 60<br/>
     */
    private String lexRegion;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateLexBotRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot. Maximum character limit of 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 50<br/>
     *
     * @return <p>
     *         The name of the Amazon Lex bot. Maximum character limit of 50.
     *         </p>
     */
    public String getBotName() {
        return botName;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot. Maximum character limit of 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 50<br/>
     *
     * @param botName <p>
     *            The name of the Amazon Lex bot. Maximum character limit of 50.
     *            </p>
     */
    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot. Maximum character limit of 50.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 50<br/>
     *
     * @param botName <p>
     *            The name of the Amazon Lex bot. Maximum character limit of 50.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateLexBotRequest withBotName(String botName) {
        this.botName = botName;
        return this;
    }

    /**
     * <p>
     * The Region in which the Amazon Lex bot has been created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 60<br/>
     *
     * @return <p>
     *         The Region in which the Amazon Lex bot has been created.
     *         </p>
     */
    public String getLexRegion() {
        return lexRegion;
    }

    /**
     * <p>
     * The Region in which the Amazon Lex bot has been created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 60<br/>
     *
     * @param lexRegion <p>
     *            The Region in which the Amazon Lex bot has been created.
     *            </p>
     */
    public void setLexRegion(String lexRegion) {
        this.lexRegion = lexRegion;
    }

    /**
     * <p>
     * The Region in which the Amazon Lex bot has been created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 60<br/>
     *
     * @param lexRegion <p>
     *            The Region in which the Amazon Lex bot has been created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateLexBotRequest withLexRegion(String lexRegion) {
        this.lexRegion = lexRegion;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getBotName() != null)
            sb.append("BotName: " + getBotName() + ",");
        if (getLexRegion() != null)
            sb.append("LexRegion: " + getLexRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getLexRegion() == null) ? 0 : getLexRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateLexBotRequest == false)
            return false;
        DisassociateLexBotRequest other = (DisassociateLexBotRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getLexRegion() == null ^ this.getLexRegion() == null)
            return false;
        if (other.getLexRegion() != null
                && other.getLexRegion().equals(this.getLexRegion()) == false)
            return false;
        return true;
    }
}
