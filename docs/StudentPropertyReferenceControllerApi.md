# StudentPropertyReferenceControllerApi

All URIs are relative to *http://localhost:8085*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPropertyReferenceStudentPatch**](StudentPropertyReferenceControllerApi.md#createPropertyReferenceStudentPatch) | **PATCH** /student/{id}/course |  |
| [**createPropertyReferenceStudentPut**](StudentPropertyReferenceControllerApi.md#createPropertyReferenceStudentPut) | **PUT** /student/{id}/course |  |
| [**deletePropertyReferenceIdStudentDelete**](StudentPropertyReferenceControllerApi.md#deletePropertyReferenceIdStudentDelete) | **DELETE** /student/{id}/course/{propertyId} |  |
| [**deletePropertyReferenceStudentDelete**](StudentPropertyReferenceControllerApi.md#deletePropertyReferenceStudentDelete) | **DELETE** /student/{id}/course |  |
| [**followPropertyReferenceStudentGet**](StudentPropertyReferenceControllerApi.md#followPropertyReferenceStudentGet) | **GET** /student/{id}/course/{propertyId} |  |
| [**followPropertyReferenceStudentGet1**](StudentPropertyReferenceControllerApi.md#followPropertyReferenceStudentGet1) | **GET** /student/{id}/course |  |


<a name="createPropertyReferenceStudentPatch"></a>
# **createPropertyReferenceStudentPatch**
> EntityModelCourse createPropertyReferenceStudentPatch(id, collectionModelObject)



patch-course-by-student-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentPropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    StudentPropertyReferenceControllerApi apiInstance = new StudentPropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    CollectionModelObject collectionModelObject = new CollectionModelObject(); // CollectionModelObject | 
    try {
      EntityModelCourse result = apiInstance.createPropertyReferenceStudentPatch(id, collectionModelObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentPropertyReferenceControllerApi#createPropertyReferenceStudentPatch");
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

[**EntityModelCourse**](EntityModelCourse.md)

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

<a name="createPropertyReferenceStudentPut"></a>
# **createPropertyReferenceStudentPut**
> EntityModelCourse createPropertyReferenceStudentPut(id, collectionModelObject)



update-course-by-student-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentPropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    StudentPropertyReferenceControllerApi apiInstance = new StudentPropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    CollectionModelObject collectionModelObject = new CollectionModelObject(); // CollectionModelObject | 
    try {
      EntityModelCourse result = apiInstance.createPropertyReferenceStudentPut(id, collectionModelObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentPropertyReferenceControllerApi#createPropertyReferenceStudentPut");
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

[**EntityModelCourse**](EntityModelCourse.md)

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

<a name="deletePropertyReferenceIdStudentDelete"></a>
# **deletePropertyReferenceIdStudentDelete**
> deletePropertyReferenceIdStudentDelete(id, propertyId)



delete-course-by-student-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentPropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    StudentPropertyReferenceControllerApi apiInstance = new StudentPropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    String propertyId = "propertyId_example"; // String | 
    try {
      apiInstance.deletePropertyReferenceIdStudentDelete(id, propertyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentPropertyReferenceControllerApi#deletePropertyReferenceIdStudentDelete");
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

<a name="deletePropertyReferenceStudentDelete"></a>
# **deletePropertyReferenceStudentDelete**
> deletePropertyReferenceStudentDelete(id)



delete-course-by-student-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentPropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    StudentPropertyReferenceControllerApi apiInstance = new StudentPropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deletePropertyReferenceStudentDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentPropertyReferenceControllerApi#deletePropertyReferenceStudentDelete");
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

<a name="followPropertyReferenceStudentGet"></a>
# **followPropertyReferenceStudentGet**
> EntityModelCourse followPropertyReferenceStudentGet(id, propertyId)



get-course-by-student-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentPropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    StudentPropertyReferenceControllerApi apiInstance = new StudentPropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    String propertyId = "propertyId_example"; // String | 
    try {
      EntityModelCourse result = apiInstance.followPropertyReferenceStudentGet(id, propertyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentPropertyReferenceControllerApi#followPropertyReferenceStudentGet");
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

[**EntityModelCourse**](EntityModelCourse.md)

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

<a name="followPropertyReferenceStudentGet1"></a>
# **followPropertyReferenceStudentGet1**
> EntityModelCourse followPropertyReferenceStudentGet1(id)



get-course-by-student-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentPropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    StudentPropertyReferenceControllerApi apiInstance = new StudentPropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      EntityModelCourse result = apiInstance.followPropertyReferenceStudentGet1(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentPropertyReferenceControllerApi#followPropertyReferenceStudentGet1");
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

[**EntityModelCourse**](EntityModelCourse.md)

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

