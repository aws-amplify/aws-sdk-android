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
import com.amazonaws.echo.model.DataInlineReference;
import java.util.Map;
import java.math.BigDecimal;
import java.util.Date;

public class Data {
    private String string = null;
    private Integer integer = null;
    private BigDecimal number = null;
    private Boolean _boolean = null;
    private Date date = null;
    private Map<String, String> map = new HashMap<String, String>() ;
    private List<String> array = new ArrayList<String>() ;
    private DataInlineReference inlineReference = null;

    /**
     * Gets string
     *
     * @return string
     **/
    public String getString() {
        return string;
    }

    /**
     * Sets the value of string.
     *
     * @param string the new value
     */
    public void setString(String string) {
        this.string = string;
    }

    /**
     * Gets integer
     *
     * @return integer
     **/
    public Integer getInteger() {
        return integer;
    }

    /**
     * Sets the value of integer.
     *
     * @param integer the new value
     */
    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    /**
     * Gets number
     *
     * @return number
     **/
    public BigDecimal getNumber() {
        return number;
    }

    /**
     * Sets the value of number.
     *
     * @param number the new value
     */
    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    /**
     * Gets _boolean
     *
     * @return _boolean
     **/
    public Boolean getBoolean() {
        return _boolean;
    }

    /**
     * Sets the value of _boolean.
     *
     * @param _boolean the new value
     */
    public void setBoolean(Boolean _boolean) {
        this._boolean = _boolean;
    }

    /**
     * Gets date
     *
     * @return date
     **/
    public Date getDate() {
        return date;
    }

    /**
     * Sets the value of date.
     *
     * @param date the new value
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets map
     *
     * @return map
     **/
    public Map<String, String> getMap() {
        return map;
    }

    /**
     * Sets the value of map.
     *
     * @param map the new value
     */
    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    /**
     * Gets array
     *
     * @return array
     **/
    public List<String> getArray() {
        return array;
    }

    /**
     * Sets the value of array.
     *
     * @param array the new value
     */
    public void setArray(List<String> array) {
        this.array = array;
    }

    /**
     * Gets inlineReference
     *
     * @return inlineReference
     **/
    public DataInlineReference getInlineReference() {
        return inlineReference;
    }

    /**
     * Sets the value of inlineReference.
     *
     * @param inlineReference the new value
     */
    public void setInlineReference(DataInlineReference inlineReference) {
        this.inlineReference = inlineReference;
    }

}
