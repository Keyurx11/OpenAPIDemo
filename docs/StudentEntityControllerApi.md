# StudentEntityControllerApi

All URIs are relative to *http://localhost:8085*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteItemResourceStudentDelete**](StudentEntityControllerApi.md#deleteItemResourceStudentDelete) | **DELETE** /student/{id} |  |
| [**getCollectionResourceStudentGet1**](StudentEntityControllerApi.md#getCollectionResourceStudentGet1) | **GET** /student |  |
| [**getItemResourceStudentGet**](StudentEntityControllerApi.md#getItemResourceStudentGet) | **GET** /student/{id} |  |
| [**patchItemResourceStudentPatch**](StudentEntityControllerApi.md#patchItemResourceStudentPatch) | **PATCH** /student/{id} |  |
| [**postCollectionResourceStudentPost**](StudentEntityControllerApi.md#postCollectionResourceStudentPost) | **POST** /student |  |
| [**putItemResourceStudentPut**](StudentEntityControllerApi.md#putItemResourceStudentPut) | **PUT** /student/{id} |  |


<a name="deleteItemResourceStudentDelete"></a>
# **deleteItemResourceStudentDelete**
> deleteItemResourceStudentDelete(id)



delete-student

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    StudentEntityControllerApi apiInstance = new StudentEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteItemResourceStudentDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentEntityControllerApi#deleteItemResourceStudentDelete");
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

<a name="getCollectionResourceStudentGet1"></a>
# **getCollectionResourceStudentGet1**
> PagedModelEntityModelStudent getCollectionResourceStudentGet1(page, size, sort)



get-student

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    StudentEntityControllerApi apiInstance = new StudentEntityControllerApi(defaultClient);
    Integer page = 0; // Integer | Zero-based page index (0..N)
    Integer size = 20; // Integer | The size of the page to be returned
    List<String> sort = Arrays.asList(); // List<String> | Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
    try {
      PagedModelEntityModelStudent result = apiInstance.getCollectionResourceStudentGet1(page, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentEntityControllerApi#getCollectionResourceStudentGet1");
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
| **page** | **Integer**| Zero-based page index (0..N) | [optional] [default to 0] |
| **size** | **Integer**| The size of the page to be returned | [optional] [default to 20] |
| **sort** | [**List&lt;String&gt;**](String.md)| Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional] |

### Return type

[**PagedModelEntityModelStudent**](PagedModelEntityModelStudent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/x-spring-data-compact+json, text/uri-list

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getItemResourceStudentGet"></a>
# **getItemResourceStudentGet**
> EntityModelStudent getItemResourceStudentGet(id)



get-student

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    StudentEntityControllerApi apiInstance = new StudentEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      EntityModelStudent result = apiInstance.getItemResourceStudentGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentEntityControllerApi#getItemResourceStudentGet");
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

[**EntityModelStudent**](EntityModelStudent.md)

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

<a name="patchItemResourceStudentPatch"></a>
# **patchItemResourceStudentPatch**
> EntityModelStudent patchItemResourceStudentPatch(id, studentRequestBody)



patch-student

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    StudentEntityControllerApi apiInstance = new StudentEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    StudentRequestBody studentRequestBody = new StudentRequestBody(); // StudentRequestBody | 
    try {
      EntityModelStudent result = apiInstance.patchItemResourceStudentPatch(id, studentRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentEntityControllerApi#patchItemResourceStudentPatch");
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
| **studentRequestBody** | [**StudentRequestBody**](StudentRequestBody.md)|  | |

### Return type

[**EntityModelStudent**](EntityModelStudent.md)

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

<a name="postCollectionResourceStudentPost"></a>
# **postCollectionResourceStudentPost**
> EntityModelStudent postCollectionResourceStudentPost(studentRequestBody)



create-student

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    StudentEntityControllerApi apiInstance = new StudentEntityControllerApi(defaultClient);
    StudentRequestBody studentRequestBody = new StudentRequestBody(); // StudentRequestBody | 
    try {
      EntityModelStudent result = apiInstance.postCollectionResourceStudentPost(studentRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentEntityControllerApi#postCollectionResourceStudentPost");
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
| **studentRequestBody** | [**StudentRequestBody**](StudentRequestBody.md)|  | |

### Return type

[**EntityModelStudent**](EntityModelStudent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="putItemResourceStudentPut"></a>
# **putItemResourceStudentPut**
> EntityModelStudent putItemResourceStudentPut(id, studentRequestBody)



update-student

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    StudentEntityControllerApi apiInstance = new StudentEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    StudentRequestBody studentRequestBody = new StudentRequestBody(); // StudentRequestBody | 
    try {
      EntityModelStudent result = apiInstance.putItemResourceStudentPut(id, studentRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentEntityControllerApi#putItemResourceStudentPut");
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
| **studentRequestBody** | [**StudentRequestBody**](StudentRequestBody.md)|  | |

### Return type

[**EntityModelStudent**](EntityModelStudent.md)

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

