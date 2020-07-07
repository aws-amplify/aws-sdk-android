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

package com.amazonaws.transform;

import static org.junit.Assert.assertNull;

import com.amazonaws.AmazonClientException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.StringReader;

@RunWith(RobolectricTestRunner.class)
public class VoidStaxUnmarshallerTest {

    /** Shared factory for creating XML event readers */
    private static final XmlPullParserFactory xmlPullParserFactory;
    static {
        try {
            xmlPullParserFactory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException xppe) {
            throw new AmazonClientException("Couldn't initialize XmlPullParserFactory", xppe);
        }
    }

    @Test
    public void testUnmarshall() throws XmlPullParserException, IOException, Exception {
        VoidStaxUnmarshaller<String> vsu = new VoidStaxUnmarshaller<String>();
        assertNull(vsu.unmarshall(getContext("Junk")));
        assertNull(vsu.unmarshall(getContext("")));
    }

    private StaxUnmarshallerContext getContext(String elementData) throws XmlPullParserException,
            IOException {
        XmlPullParser xpp = xmlPullParserFactory.newPullParser();
        String xml = "<tag>" + elementData + "</tag>";
        StringReader sr = new StringReader(xml);
        xpp.setInput(sr);

        StaxUnmarshallerContext suc = new StaxUnmarshallerContext(xpp);
        suc.nextEvent();
        return suc;
    }
}
