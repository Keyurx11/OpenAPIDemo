# CourseEntityControllerApi

All URIs are relative to *http://localhost:8085*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteItemResourceCourseDelete**](CourseEntityControllerApi.md#deleteItemResourceCourseDelete) | **DELETE** /course/{id} |  |
| [**getCollectionResourceCourseGet1**](CourseEntityControllerApi.md#getCollectionResourceCourseGet1) | **GET** /course |  |
| [**getItemResourceCourseGet**](CourseEntityControllerApi.md#getItemResourceCourseGet) | **GET** /course/{id} |  |
| [**patchItemResourceCoursePatch**](CourseEntityControllerApi.md#patchItemResourceCoursePatch) | **PATCH** /course/{id} |  |
| [**postCollectionResourceCoursePost**](CourseEntityControllerApi.md#postCollectionResourceCoursePost) | **POST** /course |  |
| [**putItemResourceCoursePut**](CourseEntityControllerApi.md#putItemResourceCoursePut) | **PUT** /course/{id} |  |


<a name="deleteItemResourceCourseDelete"></a>
# **deleteItemResourceCourseDelete**
> deleteItemResourceCourseDelete(id)



delete-course

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    CourseEntityControllerApi apiInstance = new CourseEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteItemResourceCourseDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseEntityControllerApi#deleteItemResourceCourseDelete");
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

<a name="getCollectionResourceCourseGet1"></a>
# **getCollectionResourceCourseGet1**
> CollectionModelEntityModelCourse getCollectionResourceCourseGet1()



get-course

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    CourseEntityControllerApi apiInstance = new CourseEntityControllerApi(defaultClient);
    try {
      CollectionModelEntityModelCourse result = apiInstance.getCollectionResourceCourseGet1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseEntityControllerApi#getCollectionResourceCourseGet1");
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

[**CollectionModelEntityModelCourse**](CollectionModelEntityModelCourse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/x-spring-data-compact+json, text/uri-list

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getItemResourceCourseGet"></a>
# **getItemResourceCourseGet**
> EntityModelCourse getItemResourceCourseGet(id)



get-course

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    CourseEntityControllerApi apiInstance = new CourseEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      EntityModelCourse result = apiInstance.getItemResourceCourseGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseEntityControllerApi#getItemResourceCourseGet");
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
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

<a name="patchItemResourceCoursePatch"></a>
# **patchItemResourceCoursePatch**
> EntityModelCourse patchItemResourceCoursePatch(id, courseRequestBody)



patch-course

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    CourseEntityControllerApi apiInstance = new CourseEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    CourseRequestBody courseRequestBody = new CourseRequestBody(); // CourseRequestBody | 
    try {
      EntityModelCourse result = apiInstance.patchItemResourceCoursePatch(id, courseRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseEntityControllerApi#patchItemResourceCoursePatch");
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
| **courseRequestBody** | [**CourseRequestBody**](CourseRequestBody.md)|  | |

### Return type

[**EntityModelCourse**](EntityModelCourse.md)

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

<a name="postCollectionResourceCoursePost"></a>
# **postCollectionResourceCoursePost**
> EntityModelCourse postCollectionResourceCoursePost(courseRequestBody)



create-course

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    CourseEntityControllerApi apiInstance = new CourseEntityControllerApi(defaultClient);
    CourseRequestBody courseRequestBody = new CourseRequestBody(); // CourseRequestBody | 
    try {
      EntityModelCourse result = apiInstance.postCollectionResourceCoursePost(courseRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseEntityControllerApi#postCollectionResourceCoursePost");
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
| **courseRequestBody** | [**CourseRequestBody**](CourseRequestBody.md)|  | |

### Return type

[**EntityModelCourse**](EntityModelCourse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="putItemResourceCoursePut"></a>
# **putItemResourceCoursePut**
> EntityModelCourse putItemResourceCoursePut(id, courseRequestBody)



update-course

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    CourseEntityControllerApi apiInstance = new CourseEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    CourseRequestBody courseRequestBody = new CourseRequestBody(); // CourseRequestBody | 
    try {
      EntityModelCourse result = apiInstance.putItemResourceCoursePut(id, courseRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseEntityControllerApi#putItemResourceCoursePut");
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
| **courseRequestBody** | [**CourseRequestBody**](CourseRequestBody.md)|  | |

### Return type

[**EntityModelCourse**](EntityModelCourse.md)

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

