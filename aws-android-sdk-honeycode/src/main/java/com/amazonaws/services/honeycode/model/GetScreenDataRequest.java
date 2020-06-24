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
 * The GetScreenData API allows retrieval of data from a screen in a Honeycode
 * app. The API allows setting local variables in the screen to filter, sort or
 * otherwise affect what will be displayed on the screen.
 * </p>
 */
public class GetScreenDataRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the workbook that contains the screen.
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
     * The ID of the app that contains the screem.
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
     * The ID of the screen.
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
     * The number of results to be returned on a single page. Specify a number
     * between 1 and 100. The maximum value is 100.
     * </p>
     * <p>
     * This parameter is optional. If you don't specify this parameter, the
     * default page size is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * This parameter is optional. If a nextToken is not specified, the API
     * returns the first page of data.
     * </p>
     * <p>
     * Pagination tokens expire after 1 hour. If you use a token that was
     * returned more than an hour back, the API will throw ValidationException.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the workbook that contains the screen.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>
     *         The ID of the workbook that contains the screen.
     *         </p>
     */
    public String getWorkbookId() {
        return workbookId;
    }

    /**
     * <p>
     * The ID of the workbook that contains the screen.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param workbookId <p>
     *            The ID of the workbook that contains the screen.
     *            </p>
     */
    public void setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
    }

    /**
     * <p>
     * The ID of the workbook that contains the screen.
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
     *            The ID of the workbook that contains the screen.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetScreenDataRequest withWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }

    /**
     * <p>
     * The ID of the app that contains the screem.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>
     *         The ID of the app that contains the screem.
     *         </p>
     */
    public String getAppId() {
        return appId;
    }

    /**
     * <p>
     * The ID of the app that contains the screem.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param appId <p>
     *            The ID of the app that contains the screem.
     *            </p>
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The ID of the app that contains the screem.
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
     *            The ID of the app that contains the screem.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetScreenDataRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * <p>
     * The ID of the screen.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>
     *         The ID of the screen.
     *         </p>
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * <p>
     * The ID of the screen.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param screenId <p>
     *            The ID of the screen.
     *            </p>
     */
    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    /**
     * <p>
     * The ID of the screen.
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
     *            The ID of the screen.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetScreenDataRequest withScreenId(String screenId) {
        this.screenId = screenId;
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
    public GetScreenDataRequest withVariables(java.util.Map<String, VariableValue> variables) {
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
    public GetScreenDataRequest addvariablesEntry(String key, VariableValue value) {
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
    public GetScreenDataRequest clearvariablesEntries() {
        this.variables = null;
        return this;
    }

    /**
     * <p>
     * The number of results to be returned on a single page. Specify a number
     * between 1 and 100. The maximum value is 100.
     * </p>
     * <p>
     * This parameter is optional. If you don't specify this parameter, the
     * default page size is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The number of results to be returned on a single page. Specify a
     *         number between 1 and 100. The maximum value is 100.
     *         </p>
     *         <p>
     *         This parameter is optional. If you don't specify this parameter,
     *         the default page size is 100.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The number of results to be returned on a single page. Specify a number
     * between 1 and 100. The maximum value is 100.
     * </p>
     * <p>
     * This parameter is optional. If you don't specify this parameter, the
     * default page size is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The number of results to be returned on a single page. Specify
     *            a number between 1 and 100. The maximum value is 100.
     *            </p>
     *            <p>
     *            This parameter is optional. If you don't specify this
     *            parameter, the default page size is 100.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of results to be returned on a single page. Specify a number
     * between 1 and 100. The maximum value is 100.
     * </p>
     * <p>
     * This parameter is optional. If you don't specify this parameter, the
     * default page size is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The number of results to be returned on a single page. Specify
     *            a number between 1 and 100. The maximum value is 100.
     *            </p>
     *            <p>
     *            This parameter is optional. If you don't specify this
     *            parameter, the default page size is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetScreenDataRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * This parameter is optional. If a nextToken is not specified, the API
     * returns the first page of data.
     * </p>
     * <p>
     * Pagination tokens expire after 1 hour. If you use a token that was
     * returned more than an hour back, the API will throw ValidationException.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         This parameter is optional. If a nextToken is not specified, the
     *         API returns the first page of data.
     *         </p>
     *         <p>
     *         Pagination tokens expire after 1 hour. If you use a token that
     *         was returned more than an hour back, the API will throw
     *         ValidationException.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * This parameter is optional. If a nextToken is not specified, the API
     * returns the first page of data.
     * </p>
     * <p>
     * Pagination tokens expire after 1 hour. If you use a token that was
     * returned more than an hour back, the API will throw ValidationException.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            This parameter is optional. If a nextToken is not specified,
     *            the API returns the first page of data.
     *            </p>
     *            <p>
     *            Pagination tokens expire after 1 hour. If you use a token that
     *            was returned more than an hour back, the API will throw
     *            ValidationException.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * This parameter is optional. If a nextToken is not specified, the API
     * returns the first page of data.
     * </p>
     * <p>
     * Pagination tokens expire after 1 hour. If you use a token that was
     * returned more than an hour back, the API will throw ValidationException.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            This parameter is optional. If a nextToken is not specified,
     *            the API returns the first page of data.
     *            </p>
     *            <p>
     *            Pagination tokens expire after 1 hour. If you use a token that
     *            was returned more than an hour back, the API will throw
     *            ValidationException.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetScreenDataRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getVariables() != null)
            sb.append("variables: " + getVariables() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
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
        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetScreenDataRequest == false)
            return false;
        GetScreenDataRequest other = (GetScreenDataRequest) obj;

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
        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null
                && other.getVariables().equals(this.getVariables()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
