/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitosync.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * Set Identity Pool Configuration Request Marshaller
 */
public class SetIdentityPoolConfigurationRequestMarshaller implements Marshaller<Request<SetIdentityPoolConfigurationRequest>, SetIdentityPoolConfigurationRequest> {

    public Request<SetIdentityPoolConfigurationRequest> marshall(SetIdentityPoolConfigurationRequest setIdentityPoolConfigurationRequest) {
    if (setIdentityPoolConfigurationRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<SetIdentityPoolConfigurationRequest> request = new DefaultRequest<SetIdentityPoolConfigurationRequest>(setIdentityPoolConfigurationRequest, "AmazonCognitoSync");
        String target = "AWSCognitoSyncService.SetIdentityPoolConfiguration";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        String uriResourcePath = "/identitypools/{IdentityPoolId}/configuration"; 
        uriResourcePath = uriResourcePath.replace("{IdentityPoolId}", (setIdentityPoolConfigurationRequest.getIdentityPoolId() == null) ? "" : StringUtils.fromString(setIdentityPoolConfigurationRequest.getIdentityPoolId())); 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    if(!(nameValuePair[1].isEmpty()))
                        request.addParameter(nameValuePair[0], nameValuePair[1]);
                }
            }
        }
        request.setResourcePath(uriResourcePath);
        
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);

            jsonWriter.beginObject();
            
            PushSync pushSync = setIdentityPoolConfigurationRequest.getPushSync();
            if (pushSync != null) {

                jsonWriter.name("PushSync");
                jsonWriter.beginObject();

                com.amazonaws.internal.ListWithAutoConstructFlag<String> applicationArnsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(pushSync.getApplicationArns());
                if (applicationArnsList != null && !(applicationArnsList.isAutoConstruct() && applicationArnsList.isEmpty())) {

                    jsonWriter.name("ApplicationArns");
                    jsonWriter.beginArray();

                    for (String applicationArnsListValue : applicationArnsList) {
                        if (applicationArnsListValue != null) {
                            jsonWriter.value(applicationArnsListValue);
                        }
                    }
                    jsonWriter.endArray();
                }
                if (pushSync.getRoleArn() != null) {
                    jsonWriter.name("RoleArn").value(pushSync.getRoleArn());
                }
                jsonWriter.endObject();
            }

            jsonWriter.endObject();

            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        } catch(Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
