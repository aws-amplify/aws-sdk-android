/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.echo.model;

import java.util.*;
import com.amazonaws.echo.model.Data;
import java.util.Map;

public class EchoResponse {
    private Map<String, String> headers = new HashMap<String, String>() ;
    private Map<String, String> args = new HashMap<String, String>() ;
    private String origin = null;
    private String url = null;
    private Data json = null;

    /**
     * Gets headers
     *
     * @return headers
     **/
    public Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * Sets the value of headers.
     *
     * @param headers the new value
     */
    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * Gets args
     *
     * @return args
     **/
    public Map<String, String> getArgs() {
        return args;
    }

    /**
     * Sets the value of args.
     *
     * @param args the new value
     */
    public void setArgs(Map<String, String> args) {
        this.args = args;
    }

    /**
     * Gets origin
     *
     * @return origin
     **/
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of origin.
     *
     * @param origin the new value
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * Gets url
     *
     * @return url
     **/
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of url.
     *
     * @param url the new value
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Gets json
     *
     * @return json
     **/
    public Data getJson() {
        return json;
    }

    /**
     * Sets the value of json.
     *
     * @param json the new value
     */
    public void setJson(Data json) {
        this.json = json;
    }

}
