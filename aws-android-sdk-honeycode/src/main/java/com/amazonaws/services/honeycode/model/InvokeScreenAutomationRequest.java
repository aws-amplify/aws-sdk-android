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

package com.amazonaws.services.honeycode.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The InvokeScreenAutomation API allows invoking an action defined in a screen
 * in a Honeycode app. The API allows setting local variables, which can then be
 * used in the automation being invoked. This allows automating the Honeycode
 * app interactions to write, update or delete data in the workbook.
 * </p>
 */
public class InvokeScreenAutomationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the workbook that contains the screen automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     */
    private String workbookId;

    /**
     * <p>
     * The ID of the app that contains the screen automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     */
    private String appId;

    /**
     * <p>
     * The ID of the screen that contains the screen automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     */
    private String screenId;

    /**
     * <p>
     * The ID of the automation action to be performed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     */
    private String screenAutomationId;

    /**
     * <p>
     * Variables are optional and are needed only if the screen requires them to
     * render correctly. Variables are specified as a map where the key is the
     * name of the variable as defined on the screen. The value is an object
     * which currently has only one property, rawValue, which holds the value of
     * the variable to be passed to the screen.
     * </p>
     */
    private java.util.Map<String, VariableValue> variables;

    /**
     * <p>
     * The row ID for the automation if the automation is defined inside a block
     * with source or list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>row:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-
     * F]{4}-[0-9a-
     * fA-F]{12}\/[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-
     * fA-F]{4}-[0-9a-fA-F]{12}<br/>
     */
    private String rowId;

    /**
     * <p>
     * The request token for performing the automation action. Request tokens
     * help to identify duplicate requests. If a call times out or fails due to
     * a transient error like a failed network connection, you can retry the
     * call with the same request token. The service ensures that if the first
     * call using that request token is successfully performed, the second call
     * will return the response of the previous call rather than performing the
     * action again.
     * </p>
     * <p>
     * Note that request tokens are valid only for a few minutes. You cannot use
     * request tokens to dedupe requests spanning hours or days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The ID of the workbook that contains the screen automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>
     *         The ID of the workbook that contains the screen automation.
     *         </p>
     */
    public String getWorkbookId() {
        return workbookId;
    }

    /**
     * <p>
     * The ID of the workbook that contains the screen automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param workbookId <p>
     *            The ID of the workbook that contains the screen automation.
     *            </p>
     */
    public void setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
    }

    /**
     * <p>
     * The ID of the workbook that contains the screen automation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param workbookId <p>
     *            The ID of the workbook that contains the screen automation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeScreenAutomationRequest withWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }

    /**
     * <p>
     * The ID of the app that contains the screen automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>
     *         The ID of the app that contains the screen automation.
     *         </p>
     */
    public String getAppId() {
        return appId;
    }

    /**
     * <p>
     * The ID of the app that contains the screen automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param appId <p>
     *            The ID of the app that contains the screen automation.
     *            </p>
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The ID of the app that contains the screen automation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param appId <p>
     *            The ID of the app that contains the screen automation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeScreenAutomationRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * <p>
     * The ID of the screen that contains the screen automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>
     *         The ID of the screen that contains the screen automation.
     *         </p>
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * <p>
     * The ID of the screen that contains the screen automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param screenId <p>
     *            The ID of the screen that contains the screen automation.
     *            </p>
     */
    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    /**
     * <p>
     * The ID of the screen that contains the screen automation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param screenId <p>
     *            The ID of the screen that contains the screen automation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeScreenAutomationRequest withScreenId(String screenId) {
        this.screenId = screenId;
        return this;
    }

    /**
     * <p>
     * The ID of the automation action to be performed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>
     *         The ID of the automation action to be performed.
     *         </p>
     */
    public String getScreenAutomationId() {
        return screenAutomationId;
    }

    /**
     * <p>
     * The ID of the automation action to be performed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param screenAutomationId <p>
     *            The ID of the automation action to be performed.
     *            </p>
     */
    public void setScreenAutomationId(String screenAutomationId) {
        this.screenAutomationId = screenAutomationId;
    }

    /**
     * <p>
     * The ID of the automation action to be performed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param screenAutomationId <p>
     *            The ID of the automation action to be performed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeScreenAutomationRequest withScreenAutomationId(String screenAutomationId) {
        this.screenAutomationId = screenAutomationId;
        return this;
    }

    /**
     * <p>
     * Variables are optional and are needed only if the screen requires them to
     * render correctly. Variables are specified as a map where the key is the
     * name of the variable as defined on the screen. The value is an object
     * which currently has only one property, rawValue, which holds the value of
     * the variable to be passed to the screen.
     * </p>
     *
     * @return <p>
     *         Variables are optional and are needed only if the screen requires
     *         them to render correctly. Variables are specified as a map where
     *         the key is the name of the variable as defined on the screen. The
     *         value is an object which currently has only one property,
     *         rawValue, which holds the value of the variable to be passed to
     *         the screen.
     *         </p>
     */
    public java.util.Map<String, VariableValue> getVariables() {
        return variables;
    }

    /**
     * <p>
     * Variables are optional and are needed only if the screen requires them to
     * render correctly. Variables are specified as a map where the key is the
     * name of the variable as defined on the screen. The value is an object
     * which currently has only one property, rawValue, which holds the value of
     * the variable to be passed to the screen.
     * </p>
     *
     * @param variables <p>
     *            Variables are optional and are needed only if the screen
     *            requires them to render correctly. Variables are specified as
     *            a map where the key is the name of the variable as defined on
     *            the screen. The value is an object which currently has only
     *            one property, rawValue, which holds the value of the variable
     *            to be passed to the screen.
     *            </p>
     */
    public void setVariables(java.util.Map<String, VariableValue> variables) {
        this.variables = variables;
    }

    /**
     * <p>
     * Variables are optional and are needed only if the screen requires them to
     * render correctly. Variables are specified as a map where the key is the
     * name of the variable as defined on the screen. The value is an object
     * which currently has only one property, rawValue, which holds the value of
     * the variable to be passed to the screen.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param variables <p>
     *            Variables are optional and are needed only if the screen
     *            requires them to render correctly. Variables are specified as
     *            a map where the key is the name of the variable as defined on
     *            the screen. The value is an object which currently has only
     *            one property, rawValue, which holds the value of the variable
     *            to be passed to the screen.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeScreenAutomationRequest withVariables(
            java.util.Map<String, VariableValue> variables) {
        this.variables = variables;
        return this;
    }

    /**
     * <p>
     * Variables are optional and are needed only if the screen requires them to
     * render correctly. Variables are specified as a map where the key is the
     * name of the variable as defined on the screen. The value is an object
     * which currently has only one property, rawValue, which holds the value of
     * the variable to be passed to the screen.
     * </p>
     * <p>
     * The method adds a new key-value pair into variables parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into variables.
     * @param value The corresponding value of the entry to be added into
     *            variables.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeScreenAutomationRequest addvariablesEntry(String key, VariableValue value) {
        if (null == this.variables) {
            this.variables = new java.util.HashMap<String, VariableValue>();
        }
        if (this.variables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.variables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into variables.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public InvokeScreenAutomationRequest clearvariablesEntries() {
        this.variables = null;
        return this;
    }

    /**
     * <p>
     * The row ID for the automation if the automation is defined inside a block
     * with source or list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>row:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-
     * F]{4}-[0-9a-
     * fA-F]{12}\/[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-
     * fA-F]{4}-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>
     *         The row ID for the automation if the automation is defined inside
     *         a block with source or list.
     *         </p>
     */
    public String getRowId() {
        return rowId;
    }

    /**
     * <p>
     * The row ID for the automation if the automation is defined inside a block
     * with source or list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>row:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-
     * F]{4}-[0-9a-
     * fA-F]{12}\/[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-
     * fA-F]{4}-[0-9a-fA-F]{12}<br/>
     *
     * @param rowId <p>
     *            The row ID for the automation if the automation is defined
     *            inside a block with source or list.
     *            </p>
     */
    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    /**
     * <p>
     * The row ID for the automation if the automation is defined inside a block
     * with source or list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>row:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-
     * F]{4}-[0-9a-
     * fA-F]{12}\/[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-
     * fA-F]{4}-[0-9a-fA-F]{12}<br/>
     *
     * @param rowId <p>
     *            The row ID for the automation if the automation is defined
     *            inside a block with source or list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeScreenAutomationRequest withRowId(String rowId) {
        this.rowId = rowId;
        return this;
    }

    /**
     * <p>
     * The request token for performing the automation action. Request tokens
     * help to identify duplicate requests. If a call times out or fails due to
     * a transient error like a failed network connection, you can retry the
     * call with the same request token. The service ensures that if the first
     * call using that request token is successfully performed, the second call
     * will return the response of the previous call rather than performing the
     * action again.
     * </p>
     * <p>
     * Note that request tokens are valid only for a few minutes. You cannot use
     * request tokens to dedupe requests spanning hours or days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @return <p>
     *         The request token for performing the automation action. Request
     *         tokens help to identify duplicate requests. If a call times out
     *         or fails due to a transient error like a failed network
     *         connection, you can retry the call with the same request token.
     *         The service ensures that if the first call using that request
     *         token is successfully performed, the second call will return the
     *         response of the previous call rather than performing the action
     *         again.
     *         </p>
     *         <p>
     *         Note that request tokens are valid only for a few minutes. You
     *         cannot use request tokens to dedupe requests spanning hours or
     *         days.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * The request token for performing the automation action. Request tokens
     * help to identify duplicate requests. If a call times out or fails due to
     * a transient error like a failed network connection, you can retry the
     * call with the same request token. The service ensures that if the first
     * call using that request token is successfully performed, the second call
     * will return the response of the previous call rather than performing the
     * action again.
     * </p>
     * <p>
     * Note that request tokens are valid only for a few minutes. You cannot use
     * request tokens to dedupe requests spanning hours or days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param clientRequestToken <p>
     *            The request token for performing the automation action.
     *            Request tokens help to identify duplicate requests. If a call
     *            times out or fails due to a transient error like a failed
     *            network connection, you can retry the call with the same
     *            request token. The service ensures that if the first call
     *            using that request token is successfully performed, the second
     *            call will return the response of the previous call rather than
     *            performing the action again.
     *            </p>
     *            <p>
     *            Note that request tokens are valid only for a few minutes. You
     *            cannot use request tokens to dedupe requests spanning hours or
     *            days.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The request token for performing the automation action. Request tokens
     * help to identify duplicate requests. If a call times out or fails due to
     * a transient error like a failed network connection, you can retry the
     * call with the same request token. The service ensures that if the first
     * call using that request token is successfully performed, the second call
     * will return the response of the previous call rather than performing the
     * action again.
     * </p>
     * <p>
     * Note that request tokens are valid only for a few minutes. You cannot use
     * request tokens to dedupe requests spanning hours or days.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param clientRequestToken <p>
     *            The request token for performing the automation action.
     *            Request tokens help to identify duplicate requests. If a call
     *            times out or fails due to a transient error like a failed
     *            network connection, you can retry the call with the same
     *            request token. The service ensures that if the first call
     *            using that request token is successfully performed, the second
     *            call will return the response of the previous call rather than
     *            performing the action again.
     *            </p>
     *            <p>
     *            Note that request tokens are valid only for a few minutes. You
     *            cannot use request tokens to dedupe requests spanning hours or
     *            days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeScreenAutomationRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
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
        if (getWorkbookId() != null)
            sb.append("workbookId: " + getWorkbookId() + ",");
        if (getAppId() != null)
            sb.append("appId: " + getAppId() + ",");
        if (getScreenId() != null)
            sb.append("screenId: " + getScreenId() + ",");
        if (getScreenAutomationId() != null)
            sb.append("screenAutomationId: " + getScreenAutomationId() + ",");
        if (getVariables() != null)
            sb.append("variables: " + getVariables() + ",");
        if (getRowId() != null)
            sb.append("rowId: " + getRowId() + ",");
        if (getClientRequestToken() != null)
            sb.append("clientRequestToken: " + getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkbookId() == null) ? 0 : getWorkbookId().hashCode());
        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getScreenId() == null) ? 0 : getScreenId().hashCode());
        hashCode = prime * hashCode
                + ((getScreenAutomationId() == null) ? 0 : getScreenAutomationId().hashCode());
        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        hashCode = prime * hashCode + ((getRowId() == null) ? 0 : getRowId().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvokeScreenAutomationRequest == false)
            return false;
        InvokeScreenAutomationRequest other = (InvokeScreenAutomationRequest) obj;

        if (other.getWorkbookId() == null ^ this.getWorkbookId() == null)
            return false;
        if (other.getWorkbookId() != null
                && other.getWorkbookId().equals(this.getWorkbookId()) == false)
            return false;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getScreenId() == null ^ this.getScreenId() == null)
            return false;
        if (other.getScreenId() != null && other.getScreenId().equals(this.getScreenId()) == false)
            return false;
        if (other.getScreenAutomationId() == null ^ this.getScreenAutomationId() == null)
            return false;
        if (other.getScreenAutomationId() != null
                && other.getScreenAutomationId().equals(this.getScreenAutomationId()) == false)
            return false;
        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null
                && other.getVariables().equals(this.getVariables()) == false)
            return false;
        if (other.getRowId() == null ^ this.getRowId() == null)
            return false;
        if (other.getRowId() != null && other.getRowId().equals(this.getRowId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
