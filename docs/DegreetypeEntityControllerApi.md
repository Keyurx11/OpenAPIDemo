# DegreetypeEntityControllerApi

All URIs are relative to *http://localhost:8085*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteItemResourceDegreetypeDelete**](DegreetypeEntityControllerApi.md#deleteItemResourceDegreetypeDelete) | **DELETE** /degreetype/{id} |  |
| [**getCollectionResourceDegreetypeGet1**](DegreetypeEntityControllerApi.md#getCollectionResourceDegreetypeGet1) | **GET** /degreetype |  |
| [**getItemResourceDegreetypeGet**](DegreetypeEntityControllerApi.md#getItemResourceDegreetypeGet) | **GET** /degreetype/{id} |  |
| [**patchItemResourceDegreetypePatch**](DegreetypeEntityControllerApi.md#patchItemResourceDegreetypePatch) | **PATCH** /degreetype/{id} |  |
| [**postCollectionResourceDegreetypePost**](DegreetypeEntityControllerApi.md#postCollectionResourceDegreetypePost) | **POST** /degreetype |  |
| [**putItemResourceDegreetypePut**](DegreetypeEntityControllerApi.md#putItemResourceDegreetypePut) | **PUT** /degreetype/{id} |  |


<a name="deleteItemResourceDegreetypeDelete"></a>
# **deleteItemResourceDegreetypeDelete**
> deleteItemResourceDegreetypeDelete(id)



delete-degreetype

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DegreetypeEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    DegreetypeEntityControllerApi apiInstance = new DegreetypeEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteItemResourceDegreetypeDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DegreetypeEntityControllerApi#deleteItemResourceDegreetypeDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **404** | Not Found |  -  |

<a name="getCollectionResourceDegreetypeGet1"></a>
# **getCollectionResourceDegreetypeGet1**
> CollectionModelEntityModelDegreetype getCollectionResourceDegreetypeGet1()



get-degreetype

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DegreetypeEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    DegreetypeEntityControllerApi apiInstance = new DegreetypeEntityControllerApi(defaultClient);
    try {
      CollectionModelEntityModelDegreetype result = apiInstance.getCollectionResourceDegreetypeGet1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DegreetypeEntityControllerApi#getCollectionResourceDegreetypeGet1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CollectionModelEntityModelDegreetype**](CollectionModelEntityModelDegreetype.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/x-spring-data-compact+json, text/uri-list

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getItemResourceDegreetypeGet"></a>
# **getItemResourceDegreetypeGet**
> EntityModelDegreetype getItemResourceDegreetypeGet(id)



get-degreetype

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DegreetypeEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    DegreetypeEntityControllerApi apiInstance = new DegreetypeEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      EntityModelDegreetype result = apiInstance.getItemResourceDegreetypeGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DegreetypeEntityControllerApi#getItemResourceDegreetypeGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**EntityModelDegreetype**](EntityModelDegreetype.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

<a name="patchItemResourceDegreetypePatch"></a>
# **patchItemResourceDegreetypePatch**
> EntityModelDegreetype patchItemResourceDegreetypePatch(id, degreetypeRequestBody)



patch-degreetype

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DegreetypeEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    DegreetypeEntityControllerApi apiInstance = new DegreetypeEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    DegreetypeRequestBody degreetypeRequestBody = new DegreetypeRequestBody(); // DegreetypeRequestBody | 
    try {
      EntityModelDegreetype result = apiInstance.patchItemResourceDegreetypePatch(id, degreetypeRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DegreetypeEntityControllerApi#patchItemResourceDegreetypePatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **degreetypeRequestBody** | [**DegreetypeRequestBody**](DegreetypeRequestBody.md)|  | |

### Return type

[**EntityModelDegreetype**](EntityModelDegreetype.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |

<a name="postCollectionResourceDegreetypePost"></a>
# **postCollectionResourceDegreetypePost**
> EntityModelDegreetype postCollectionResourceDegreetypePost(degreetypeRequestBody)



create-degreetype

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DegreetypeEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    DegreetypeEntityControllerApi apiInstance = new DegreetypeEntityControllerApi(defaultClient);
    DegreetypeRequestBody degreetypeRequestBody = new DegreetypeRequestBody(); // DegreetypeRequestBody | 
    try {
      EntityModelDegreetype result = apiInstance.postCollectionResourceDegreetypePost(degreetypeRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DegreetypeEntityControllerApi#postCollectionResourceDegreetypePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **degreetypeRequestBody** | [**DegreetypeRequestBody**](DegreetypeRequestBody.md)|  | |

### Return type

[**EntityModelDegreetype**](EntityModelDegreetype.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="putItemResourceDegreetypePut"></a>
# **putItemResourceDegreetypePut**
> EntityModelDegreetype putItemResourceDegreetypePut(id, degreetypeRequestBody)



update-degreetype

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DegreetypeEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    DegreetypeEntityControllerApi apiInstance = new DegreetypeEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    DegreetypeRequestBody degreetypeRequestBody = new DegreetypeRequestBody(); // DegreetypeRequestBody | 
    try {
      EntityModelDegreetype result = apiInstance.putItemResourceDegreetypePut(id, degreetypeRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DegreetypeEntityControllerApi#putItemResourceDegreetypePut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **degreetypeRequestBody** | [**DegreetypeRequestBody**](DegreetypeRequestBody.md)|  | |

### Return type

[**EntityModelDegreetype**](EntityModelDegreetype.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **204** | No Content |  -  |

