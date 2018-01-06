
package com.amazonaws.mobileconnectors.dynamodbv2.document.internal;

import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.Document;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.DynamoDBBool;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.DynamoDBEntry;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.DynamoDBList;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.DynamoDBNull;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.Primitive;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.Primitive.DynamoDBPrimitiveType;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.PrimitiveList;
import com.amazonaws.util.Base64;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map.Entry;

public final class JsonUtils {

    public static Document fromJson(String jsonText) {
        final JsonParser parser = new JsonParser();
        final JsonObject json = parser.parse(jsonText).getAsJsonObject();

        if (!json.isJsonObject()) {
            throw new IllegalArgumentException("expected object as JSON root");
        }

        final Document doc = (Document) JsonUtils.toEntry(json);
        if (doc == null) {
            throw new IllegalStateException();
        }
        return doc;
    }

    public static String toJson(DynamoDBEntry entry) throws IOException {
        return toJson(entry, false);
    }

    public static String toJson(DynamoDBEntry entry, boolean prettyPrint) throws IOException {
        final StringWriter jsonString = new StringWriter();
        final JsonWriter writer = new JsonWriter(jsonString);
        if (prettyPrint) {
            writer.setIndent("  ");
        }
        writeJson(entry, writer);
        writer.close();
        return jsonString.toString();
    }

    private static void writeJson(DynamoDBEntry entry, JsonWriter writer) throws IOException {
        if (entry instanceof Document) {
            writer.beginObject();
            final Document doc = (Document) entry;
            for (final Entry<String, DynamoDBEntry> docEntry : doc.entrySet()) {
                final String key = docEntry.getKey();
                final DynamoDBEntry value = docEntry.getValue();
                writer.name(key);
                writeJson(value, writer);
            }
            writer.endObject();
            return;
        }

        if (entry instanceof Primitive) {
            final Primitive p = (Primitive) entry;
            writePrimitive(p.getType(), writer, p);
            return;
        }

        if (entry instanceof PrimitiveList) {
            final PrimitiveList pl = (PrimitiveList) entry;
            writer.beginArray();
            for (final DynamoDBEntry e : pl.getEntries()) {
                writePrimitive(pl.getType(), writer, e);
            }
            writer.endArray();
            return;
        }

        if (entry instanceof DynamoDBList) {
            final DynamoDBList pl = (DynamoDBList) entry;
            writer.beginArray();
            for (final DynamoDBEntry e : pl.getEntries()) {
                writeJson(e, writer);
            }
            writer.endArray();
            return;
        }

        if (entry instanceof DynamoDBBool) {
            writer.value(((DynamoDBBool) entry).asBoolean());
            return;
        }

        if (entry instanceof DynamoDBNull) {
            writer.nullValue();
            return;
        }

        throw new JsonParseException("unable to convert to json " + entry);

    }

    private static void writePrimitive(DynamoDBPrimitiveType type, JsonWriter writer,
            Object value) throws IOException {
        final DynamoDBEntry entry = (DynamoDBEntry) value;
        switch (type) {
            case String: {
                writer.value(entry.asString());
                break;
            }
            case Number: {
                writer.value(entry.asNumber());
                break;
            }
            case Binary: {
                final ByteBuffer bb = entry.asByteBuffer();
                final String base64 = Base64.encodeAsString(bb.array());
                writer.value(base64);
                break;
            }
        }
    }

    private static DynamoDBEntry toEntry(JsonElement data) {
        if (data == null || data.isJsonNull()) {
            return DynamoDBNull.NULL;
        }

        if (data.isJsonObject()) {
            final Document doc = new Document();
            for (final Entry<String, JsonElement> entry : data.getAsJsonObject().entrySet()) {
                final String key = entry.getKey();
                final JsonElement element = entry.getValue();
                doc.put(key, toEntry(element));
            }

            return doc;
        }

        if (data.isJsonArray()) {
            final DynamoDBList list = new DynamoDBList();
            final JsonArray array = data.getAsJsonArray();
            for (final Iterator<JsonElement> iterator = array.iterator(); iterator.hasNext();) {
                final JsonElement type = iterator.next();
                list.add(toEntry(type));
            }

            return list;
        }

        final JsonPrimitive primitive = data.getAsJsonPrimitive();
        if (primitive.isBoolean()) {
            return new DynamoDBBool(primitive.getAsBoolean());
        }

        if (primitive.isString()) {
            return new Primitive(primitive.getAsString());
        }

        if (primitive.isNumber()) {
            return new Primitive(primitive.getAsNumber());
        }


        throw new JsonParseException("unable to parse json for key " + data.toString());
    }
}
