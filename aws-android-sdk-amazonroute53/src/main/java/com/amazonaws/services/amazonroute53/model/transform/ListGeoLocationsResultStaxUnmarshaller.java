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

package com.amazonaws.services.amazonroute53.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.amazonroute53.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for response ListGeoLocationsResult
 */
public class ListGeoLocationsResultStaxUnmarshaller implements
        Unmarshaller<ListGeoLocationsResult, StaxUnmarshallerContext> {

    public ListGeoLocationsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListGeoLocationsResult listGeoLocationsResult = new ListGeoLocationsResult();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("GeoLocationDetailsList", targetDepth)) {
                    listGeoLocationsResult
                            .withGeoLocationDetailsList(GeoLocationDetailsStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IsTruncated", targetDepth)) {
                    listGeoLocationsResult.setIsTruncated(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("NextContinentCode", targetDepth)) {
                    listGeoLocationsResult.setNextContinentCode(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NextCountryCode", targetDepth)) {
                    listGeoLocationsResult.setNextCountryCode(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("NextSubdivisionCode", targetDepth)) {
                    listGeoLocationsResult.setNextSubdivisionCode(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MaxItems", targetDepth)) {
                    listGeoLocationsResult.setMaxItems(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return listGeoLocationsResult;
    }

    private static ListGeoLocationsResultStaxUnmarshaller instance;

    public static ListGeoLocationsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListGeoLocationsResultStaxUnmarshaller();
        return instance;
    }
}
