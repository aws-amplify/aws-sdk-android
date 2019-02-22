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

package com.amazonaws.testutils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public enum TestUtils {
    ;
    public static String yyMMdd_hhmmss() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd-hhmmss", Locale.US);
        return sdf.format(new Date());
    }
}
