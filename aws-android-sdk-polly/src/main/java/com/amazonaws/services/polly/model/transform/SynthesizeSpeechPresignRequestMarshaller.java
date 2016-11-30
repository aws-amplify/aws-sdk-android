/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.polly.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.polly.internal.PresigningRequest;
import com.amazonaws.services.polly.model.SynthesizeSpeechPresignRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

import java.util.List;

/**
 * GET request marshaller for SynthesizeSpeechRequest
 */
public class SynthesizeSpeechPresignRequestMarshaller implements
        Marshaller<Request<PresigningRequest>, SynthesizeSpeechPresignRequest> {

    private static final String URI_RESOURCE_PATH = "/v1/speech";

    public Request<PresigningRequest> marshall(SynthesizeSpeechPresignRequest synthesizeSpeechPresignRequest) {
        if (synthesizeSpeechPresignRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SynthesizeSpeechRequest)");
        }

        Request<PresigningRequest> request =
                new DefaultRequest<PresigningRequest>(
                        new PresigningRequest()
                                .withRequestCredentials(synthesizeSpeechPresignRequest.getRequestCredentials()),
                        "AmazonPolly");

        request.setHttpMethod(HttpMethodName.GET);

        request.setResourcePath(URI_RESOURCE_PATH);

        if (synthesizeSpeechPresignRequest.getText() != null) {
            request.addParameter("Text", synthesizeSpeechPresignRequest.getText());
        }

        if (synthesizeSpeechPresignRequest.getTextType() != null) {
            request.addParameter("TextType", StringUtils
                    .fromString(synthesizeSpeechPresignRequest.getTextType()));
        }

        if (synthesizeSpeechPresignRequest.getVoiceId() != null) {
            request.addParameter("VoiceId", StringUtils
                    .fromString(synthesizeSpeechPresignRequest.getVoiceId()));
        }

        if (synthesizeSpeechPresignRequest.getSampleRate() != null) {
            request.addParameter("SampleRate", synthesizeSpeechPresignRequest.getSampleRate());
        }

        if (synthesizeSpeechPresignRequest.getOutputFormat() != null) {
            request.addParameter("OutputFormat", synthesizeSpeechPresignRequest.getOutputFormat());
        }

        List<String> lexiconNames = synthesizeSpeechPresignRequest.getLexiconNames();
        if (lexiconNames != null && lexiconNames.size() > 0) {
            // Multiple parameters of the same name are currently not supported by the core runtime.
            // Use only the first lexicon provided in the synthesizeSpeechPresignRequest.
            // Please note that any lexicons should *NOT* be silently dropped here as SynthesizeSpeechPresignRequest
            // will throw an Exception in case the client tries to use list of more than one lexicon.
            request.addParameter("LexiconName", lexiconNames.get(0));
        }

        return request;
    }
}
