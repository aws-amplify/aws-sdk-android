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

import java.math.BigDecimal;

public class DataInlineReference {
    private BigDecimal re = null;
    private BigDecimal im = null;

    /**
     * Gets re
     *
     * @return re
     **/
    public BigDecimal getRe() {
        return re;
    }

    /**
     * Sets the value of re.
     *
     * @param re the new value
     */
    public void setRe(BigDecimal re) {
        this.re = re;
    }

    /**
     * Gets im
     *
     * @return im
     **/
    public BigDecimal getIm() {
        return im;
    }

    /**
     * Sets the value of im.
     *
     * @param im the new value
     */
    public void setIm(BigDecimal im) {
        this.im = im;
    }

}
