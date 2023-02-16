/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.CollectionModelEntityModelDegreetypeEmbedded;
import org.openapitools.client.model.Link;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * CollectionModelEntityModelDegreetype
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-15T13:09:53.193681Z[Europe/London]")
public class CollectionModelEntityModelDegreetype {
  public static final String SERIALIZED_NAME_EMBEDDED = "_embedded";
  @SerializedName(SERIALIZED_NAME_EMBEDDED)
  private CollectionModelEntityModelDegreetypeEmbedded embedded;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, Link> links = null;

  public CollectionModelEntityModelDegreetype() {
  }

  public CollectionModelEntityModelDegreetype embedded(CollectionModelEntityModelDegreetypeEmbedded embedded) {
    
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @javax.annotation.Nullable

  public CollectionModelEntityModelDegreetypeEmbedded getEmbedded() {
    return embedded;
  }


  public void setEmbedded(CollectionModelEntityModelDegreetypeEmbedded embedded) {
    this.embedded = embedded;
  }


  public CollectionModelEntityModelDegreetype links(Map<String, Link> links) {
    
    this.links = links;
    return this;
  }

  public CollectionModelEntityModelDegreetype putLinksItem(String key, Link linksItem) {
    if (this.links == null) {
      this.links = new HashMap<>();
    }
    this.links.put(key, linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable

  public Map<String, Link> getLinks() {
    return links;
  }


  public void setLinks(Map<String, Link> links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionModelEntityModelDegreetype collectionModelEntityModelDegreetype = (CollectionModelEntityModelDegreetype) o;
    return Objects.equals(this.embedded, collectionModelEntityModelDegreetype.embedded) &&
        Objects.equals(this.links, collectionModelEntityModelDegreetype.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedded, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionModelEntityModelDegreetype {\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("_embedded");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CollectionModelEntityModelDegreetype
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CollectionModelEntityModelDegreetype.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CollectionModelEntityModelDegreetype is not found in the empty JSON string", CollectionModelEntityModelDegreetype.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CollectionModelEntityModelDegreetype.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CollectionModelEntityModelDegreetype` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `_embedded`
      if (jsonObj.get("_embedded") != null && !jsonObj.get("_embedded").isJsonNull()) {
        CollectionModelEntityModelDegreetypeEmbedded.validateJsonObject(jsonObj.getAsJsonObject("_embedded"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CollectionModelEntityModelDegreetype.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CollectionModelEntityModelDegreetype' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CollectionModelEntityModelDegreetype> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CollectionModelEntityModelDegreetype.class));

       return (TypeAdapter<T>) new TypeAdapter<CollectionModelEntityModelDegreetype>() {
           @Override
           public void write(JsonWriter out, CollectionModelEntityModelDegreetype value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CollectionModelEntityModelDegreetype read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CollectionModelEntityModelDegreetype given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CollectionModelEntityModelDegreetype
  * @throws IOException if the JSON string is invalid with respect to CollectionModelEntityModelDegreetype
  */
  public static CollectionModelEntityModelDegreetype fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CollectionModelEntityModelDegreetype.class);
  }

 /**
  * Convert an instance of CollectionModelEntityModelDegreetype to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

