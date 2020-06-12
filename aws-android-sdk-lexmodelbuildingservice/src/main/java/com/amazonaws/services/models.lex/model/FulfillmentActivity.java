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

/**
 * <p>
 * Describes how the intent is fulfilled after the user provides all of the
 * information required for the intent. You can provide a Lambda function to
 * process the intent, or you can return the intent information to the client
 * application. We recommend that you use a Lambda function so that the relevant
 * logic lives in the Cloud and limit the client-side code primarily to
 * presentation. If you need to update the logic, you only update the Lambda
 * function; you don't need to upgrade your client application.
 * </p>
 * <p>
 * Consider the following examples:
 * </p>
 * <ul>
 * <li>
 * <p>
 * In a pizza ordering application, after the user provides all of the
 * information for placing an order, you use a Lambda function to place an order
 * with a pizzeria.
 * </p>
 * </li>
 * <li>
 * <p>
 * In a gaming application, when a user says "pick up a rock," this information
 * must go back to the client application so that it can perform the operation
 * and update the graphics. In this case, you want Amazon Lex to return the
 * intent data to the client.
 * </p>
 * </li>
 * </ul>
 */
public class FulfillmentActivity implements Serializable {
    /**
     * <p>
     * How the intent should be fulfilled, either by running a Lambda function
     * or by returning the slot data to the client application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ReturnIntent, CodeHook
     */
    private String type;

    /**
     * <p>
     * A description of the Lambda function that is run to fulfill the intent.
     * </p>
     */
    private CodeHook codeHook;

    /**
     * <p>
     * How the intent should be fulfilled, either by running a Lambda function
     * or by returning the slot data to the client application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ReturnIntent, CodeHook
     *
     * @return <p>
     *         How the intent should be fulfilled, either by running a Lambda
     *         function or by returning the slot data to the client application.
     *         </p>
     * @see FulfillmentActivityType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * How the intent should be fulfilled, either by running a Lambda function
     * or by returning the slot data to the client application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ReturnIntent, CodeHook
     *
     * @param type <p>
     *            How the intent should be fulfilled, either by running a Lambda
     *            function or by returning the slot data to the client
     *            application.
     *            </p>
     * @see FulfillmentActivityType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * How the intent should be fulfilled, either by running a Lambda function
     * or by returning the slot data to the client application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ReturnIntent, CodeHook
     *
     * @param type <p>
     *            How the intent should be fulfilled, either by running a Lambda
     *            function or by returning the slot data to the client
     *            application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FulfillmentActivityType
     */
    public FulfillmentActivity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * How the intent should be fulfilled, either by running a Lambda function
     * or by returning the slot data to the client application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ReturnIntent, CodeHook
     *
     * @param type <p>
     *            How the intent should be fulfilled, either by running a Lambda
     *            function or by returning the slot data to the client
     *            application.
     *            </p>
     * @see FulfillmentActivityType
     */
    public void setType(FulfillmentActivityType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * How the intent should be fulfilled, either by running a Lambda function
     * or by returning the slot data to the client application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ReturnIntent, CodeHook
     *
     * @param type <p>
     *            How the intent should be fulfilled, either by running a Lambda
     *            function or by returning the slot data to the client
     *            application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FulfillmentActivityType
     */
    public FulfillmentActivity withType(FulfillmentActivityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A description of the Lambda function that is run to fulfill the intent.
     * </p>
     *
     * @return <p>
     *         A description of the Lambda function that is run to fulfill the
     *         intent.
     *         </p>
     */
    public CodeHook getCodeHook() {
        return codeHook;
    }

    /**
     * <p>
     * A description of the Lambda function that is run to fulfill the intent.
     * </p>
     *
     * @param codeHook <p>
     *            A description of the Lambda function that is run to fulfill
     *            the intent.
     *            </p>
     */
    public void setCodeHook(CodeHook codeHook) {
        this.codeHook = codeHook;
    }

    /**
     * <p>
     * A description of the Lambda function that is run to fulfill the intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param codeHook <p>
     *            A description of the Lambda function that is run to fulfill
     *            the intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FulfillmentActivity withCodeHook(CodeHook codeHook) {
        this.codeHook = codeHook;
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
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getCodeHook() != null)
            sb.append("codeHook: " + getCodeHook());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCodeHook() == null) ? 0 : getCodeHook().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FulfillmentActivity == false)
            return false;
        FulfillmentActivity other = (FulfillmentActivity) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCodeHook() == null ^ this.getCodeHook() == null)
            return false;
        if (other.getCodeHook() != null && other.getCodeHook().equals(this.getCodeHook()) == false)
            return false;
        return true;
    }
}
