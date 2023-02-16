# CoursenamePropertyReferenceControllerApi

All URIs are relative to *http://localhost:8085*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPropertyReferenceCoursenamePatch**](CoursenamePropertyReferenceControllerApi.md#createPropertyReferenceCoursenamePatch) | **PATCH** /coursename/{id}/coursenames |  |
| [**createPropertyReferenceCoursenamePut**](CoursenamePropertyReferenceControllerApi.md#createPropertyReferenceCoursenamePut) | **PUT** /coursename/{id}/coursenames |  |
| [**deletePropertyReferenceCoursenameDelete**](CoursenamePropertyReferenceControllerApi.md#deletePropertyReferenceCoursenameDelete) | **DELETE** /coursename/{id}/coursenames |  |
| [**deletePropertyReferenceIdCoursenameDelete**](CoursenamePropertyReferenceControllerApi.md#deletePropertyReferenceIdCoursenameDelete) | **DELETE** /coursename/{id}/coursenames/{propertyId} |  |
| [**followPropertyReferenceCoursenameGet**](CoursenamePropertyReferenceControllerApi.md#followPropertyReferenceCoursenameGet) | **GET** /coursename/{id}/coursenames/{propertyId} |  |
| [**followPropertyReferenceCoursenameGet1**](CoursenamePropertyReferenceControllerApi.md#followPropertyReferenceCoursenameGet1) | **GET** /coursename/{id}/coursenames |  |


<a name="createPropertyReferenceCoursenamePatch"></a>
# **createPropertyReferenceCoursenamePatch**
> CollectionModelCourse createPropertyReferenceCoursenamePatch(id, collectionModelObject)



patch-course-by-coursename-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursenamePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    CoursenamePropertyReferenceControllerApi apiInstance = new CoursenamePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    CollectionModelObject collectionModelObject = new CollectionModelObject(); // CollectionModelObject | 
    try {
      CollectionModelCourse result = apiInstance.createPropertyReferenceCoursenamePatch(id, collectionModelObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursenamePropertyReferenceControllerApi#createPropertyReferenceCoursenamePatch");
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

<a name="createPropertyReferenceCoursenamePut"></a>
# **createPropertyReferenceCoursenamePut**
> CollectionModelCourse createPropertyReferenceCoursenamePut(id, collectionModelObject)



update-course-by-coursename-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursenamePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    CoursenamePropertyReferenceControllerApi apiInstance = new CoursenamePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    CollectionModelObject collectionModelObject = new CollectionModelObject(); // CollectionModelObject | 
    try {
      CollectionModelCourse result = apiInstance.createPropertyReferenceCoursenamePut(id, collectionModelObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursenamePropertyReferenceControllerApi#createPropertyReferenceCoursenamePut");
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

<a name="deletePropertyReferenceCoursenameDelete"></a>
# **deletePropertyReferenceCoursenameDelete**
> deletePropertyReferenceCoursenameDelete(id)



delete-course-by-coursename-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursenamePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    CoursenamePropertyReferenceControllerApi apiInstance = new CoursenamePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deletePropertyReferenceCoursenameDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursenamePropertyReferenceControllerApi#deletePropertyReferenceCoursenameDelete");
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

<a name="deletePropertyReferenceIdCoursenameDelete"></a>
# **deletePropertyReferenceIdCoursenameDelete**
> deletePropertyReferenceIdCoursenameDelete(id, propertyId)



delete-course-by-coursename-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursenamePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    CoursenamePropertyReferenceControllerApi apiInstance = new CoursenamePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    String propertyId = "propertyId_example"; // String | 
    try {
      apiInstance.deletePropertyReferenceIdCoursenameDelete(id, propertyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursenamePropertyReferenceControllerApi#deletePropertyReferenceIdCoursenameDelete");
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

<a name="followPropertyReferenceCoursenameGet"></a>
# **followPropertyReferenceCoursenameGet**
> CollectionModelCourse followPropertyReferenceCoursenameGet(id, propertyId)



get-course-by-coursename-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursenamePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    CoursenamePropertyReferenceControllerApi apiInstance = new CoursenamePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    String propertyId = "propertyId_example"; // String | 
    try {
      CollectionModelCourse result = apiInstance.followPropertyReferenceCoursenameGet(id, propertyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursenamePropertyReferenceControllerApi#followPropertyReferenceCoursenameGet");
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

<a name="followPropertyReferenceCoursenameGet1"></a>
# **followPropertyReferenceCoursenameGet1**
> CollectionModelCourse followPropertyReferenceCoursenameGet1(id)



get-course-by-coursename-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursenamePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    CoursenamePropertyReferenceControllerApi apiInstance = new CoursenamePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CollectionModelCourse result = apiInstance.followPropertyReferenceCoursenameGet1(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursenamePropertyReferenceControllerApi#followPropertyReferenceCoursenameGet1");
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

