/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.services.s3.internal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class XmlWriterTest {

    @Test
    public void testEscapedCharacters() {

        XmlWriter w = new XmlWriter();

        String[] attrs = {
                "tab", "newLine", "return", "ampersand", "quote", "lessthan", "greaterthan"
        };
        String[] values = {
                "\t", "\n", "\r", "&", "\"", "<", ">"
        };
        w.start("test", attrs, values);
        w.end();
        String expected = "<test tab=\"&#9;\" newLine=\"&#10;\" return=\"&#13;\" ampersand=\"&amp;\" quote=\"&quot;\" lessthan=\"&lt;\" greaterthan=\"&gt;\"></test>";
        assertEquals(expected, w.toString());
    }

}
