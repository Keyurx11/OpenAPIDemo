# DegreetypePropertyReferenceControllerApi

All URIs are relative to *http://localhost:8085*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPropertyReferenceDegreetypePatch**](DegreetypePropertyReferenceControllerApi.md#createPropertyReferenceDegreetypePatch) | **PATCH** /degreetype/{id}/degreetype |  |
| [**createPropertyReferenceDegreetypePut**](DegreetypePropertyReferenceControllerApi.md#createPropertyReferenceDegreetypePut) | **PUT** /degreetype/{id}/degreetype |  |
| [**deletePropertyReferenceDegreetypeDelete**](DegreetypePropertyReferenceControllerApi.md#deletePropertyReferenceDegreetypeDelete) | **DELETE** /degreetype/{id}/degreetype |  |
| [**deletePropertyReferenceIdDegreetypeDelete**](DegreetypePropertyReferenceControllerApi.md#deletePropertyReferenceIdDegreetypeDelete) | **DELETE** /degreetype/{id}/degreetype/{propertyId} |  |
| [**followPropertyReferenceDegreetypeGet**](DegreetypePropertyReferenceControllerApi.md#followPropertyReferenceDegreetypeGet) | **GET** /degreetype/{id}/degreetype/{propertyId} |  |
| [**followPropertyReferenceDegreetypeGet1**](DegreetypePropertyReferenceControllerApi.md#followPropertyReferenceDegreetypeGet1) | **GET** /degreetype/{id}/degreetype |  |


<a name="createPropertyReferenceDegreetypePatch"></a>
# **createPropertyReferenceDegreetypePatch**
> CollectionModelCourse createPropertyReferenceDegreetypePatch(id, collectionModelObject)



patch-course-by-degreetype-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DegreetypePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    DegreetypePropertyReferenceControllerApi apiInstance = new DegreetypePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    CollectionModelObject collectionModelObject = new CollectionModelObject(); // CollectionModelObject | 
    try {
      CollectionModelCourse result = apiInstance.createPropertyReferenceDegreetypePatch(id, collectionModelObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DegreetypePropertyReferenceControllerApi#createPropertyReferenceDegreetypePatch");
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
| **collectionModelObject** | [**CollectionModelObject**](CollectionModelObject.md)|  | |

### Return type

[**CollectionModelCourse**](CollectionModelCourse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-spring-data-compact+json, text/uri-list
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |

<a name="createPropertyReferenceDegreetypePut"></a>
# **createPropertyReferenceDegreetypePut**
> CollectionModelCourse createPropertyReferenceDegreetypePut(id, collectionModelObject)



update-course-by-degreetype-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DegreetypePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    DegreetypePropertyReferenceControllerApi apiInstance = new DegreetypePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    CollectionModelObject collectionModelObject = new CollectionModelObject(); // CollectionModelObject | 
    try {
      CollectionModelCourse result = apiInstance.createPropertyReferenceDegreetypePut(id, collectionModelObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DegreetypePropertyReferenceControllerApi#createPropertyReferenceDegreetypePut");
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
| **collectionModelObject** | [**CollectionModelObject**](CollectionModelObject.md)|  | |

### Return type

[**CollectionModelCourse**](CollectionModelCourse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-spring-data-compact+json, text/uri-list
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **204** | No Content |  -  |

<a name="deletePropertyReferenceDegreetypeDelete"></a>
# **deletePropertyReferenceDegreetypeDelete**
> deletePropertyReferenceDegreetypeDelete(id)



delete-course-by-degreetype-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DegreetypePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    DegreetypePropertyReferenceControllerApi apiInstance = new DegreetypePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deletePropertyReferenceDegreetypeDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DegreetypePropertyReferenceControllerApi#deletePropertyReferenceDegreetypeDelete");
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

<a name="deletePropertyReferenceIdDegreetypeDelete"></a>
# **deletePropertyReferenceIdDegreetypeDelete**
> deletePropertyReferenceIdDegreetypeDelete(id, propertyId)



delete-course-by-degreetype-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DegreetypePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    DegreetypePropertyReferenceControllerApi apiInstance = new DegreetypePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    String propertyId = "propertyId_example"; // String | 
    try {
      apiInstance.deletePropertyReferenceIdDegreetypeDelete(id, propertyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DegreetypePropertyReferenceControllerApi#deletePropertyReferenceIdDegreetypeDelete");
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
| **propertyId** | **String**|  | |

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

<a name="followPropertyReferenceDegreetypeGet"></a>
# **followPropertyReferenceDegreetypeGet**
> CollectionModelCourse followPropertyReferenceDegreetypeGet(id, propertyId)



get-course-by-degreetype-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DegreetypePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    DegreetypePropertyReferenceControllerApi apiInstance = new DegreetypePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    String propertyId = "propertyId_example"; // String | 
    try {
      CollectionModelCourse result = apiInstance.followPropertyReferenceDegreetypeGet(id, propertyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DegreetypePropertyReferenceControllerApi#followPropertyReferenceDegreetypeGet");
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
| **propertyId** | **String**|  | |

### Return type

[**CollectionModelCourse**](CollectionModelCourse.md)

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

<a name="followPropertyReferenceDegreetypeGet1"></a>
# **followPropertyReferenceDegreetypeGet1**
> CollectionModelCourse followPropertyReferenceDegreetypeGet1(id)



get-course-by-degreetype-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DegreetypePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    DegreetypePropertyReferenceControllerApi apiInstance = new DegreetypePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CollectionModelCourse result = apiInstance.followPropertyReferenceDegreetypeGet1(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DegreetypePropertyReferenceControllerApi#followPropertyReferenceDegreetypeGet1");
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

[**CollectionModelCourse**](CollectionModelCourse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, text/uri-list

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

