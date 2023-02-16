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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.AbstractJsonSchemaPropertyObject;

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
 * Item
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-15T13:09:53.193681Z[Europe/London]")
public class Item {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, AbstractJsonSchemaPropertyObject> properties = null;

  public static final String SERIALIZED_NAME_REQUIRED_PROPERTIES = "requiredProperties";
  @SerializedName(SERIALIZED_NAME_REQUIRED_PROPERTIES)
  private List<String> requiredProperties = null;

  public Item() {
  }

  public Item type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Item properties(Map<String, AbstractJsonSchemaPropertyObject> properties) {
    
    this.properties = properties;
    return this;
  }

  public Item putPropertiesItem(String key, AbstractJsonSchemaPropertyObject propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable

  public Map<String, AbstractJsonSchemaPropertyObject> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, AbstractJsonSchemaPropertyObject> properties) {
    this.properties = properties;
  }


  public Item requiredProperties(List<String> requiredProperties) {
    
    this.requiredProperties = requiredProperties;
    return this;
  }

  public Item addRequiredPropertiesItem(String requiredPropertiesItem) {
    if (this.requiredProperties == null) {
      this.requiredProperties = new ArrayList<>();
    }
    this.requiredProperties.add(requiredPropertiesItem);
    return this;
  }

   /**
   * Get requiredProperties
   * @return requiredProperties
  **/
  @javax.annotation.Nullable

  public List<String> getRequiredProperties() {
    return requiredProperties;
  }


  public void setRequiredProperties(List<String> requiredProperties) {
    this.requiredProperties = requiredProperties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.type, item.type) &&
        Objects.equals(this.properties, item.properties) &&
        Objects.equals(this.requiredProperties, item.requiredProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, properties, requiredProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    requiredProperties: ").append(toIndentedString(requiredProperties)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("properties");
    openapiFields.add("requiredProperties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Item
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Item.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Item is not found in the empty JSON string", Item.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Item.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Item` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("requiredProperties") != null && !jsonObj.get("requiredProperties").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requiredProperties` to be an array in the JSON string but got `%s`", jsonObj.get("requiredProperties").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Item.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Item' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Item> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Item.class));

       return (TypeAdapter<T>) new TypeAdapter<Item>() {
           @Override
           public void write(JsonWriter out, Item value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Item read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Item given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Item
  * @throws IOException if the JSON string is invalid with respect to Item
  */
  public static Item fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Item.class);
  }

 /**
  * Convert an instance of Item to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

